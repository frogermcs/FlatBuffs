package frogermcs.io.flatbuffs;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;

import java.nio.ByteBuffer;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;
import frogermcs.io.flatbuffersparser.FlatBuffersParser;
import frogermcs.io.flatbuffs.model.flat.Repo;
import frogermcs.io.flatbuffs.model.flat.ReposList;
import frogermcs.io.flatbuffs.model.json.RepoJson;
import frogermcs.io.flatbuffs.model.json.ReposListJson;
import frogermcs.io.flatbuffs.utils.RawDataReader;
import frogermcs.io.flatbuffs.utils.SimpleObserver;
import rx.Observable;
import rx.functions.Func2;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.tvFlat)
    TextView tvFlat;
    @Bind(R.id.tvJson)
    TextView tvJson;
    @Bind(R.id.tvJsonNative)
    TextView tvJsonNative;

    private RawDataReader rawDataReader;
    private FlatBuffersParser flatBuffersParser;

    private ReposListJson reposListJson;
    private ReposList reposListFlat;
    private ReposList reposListFlatParsed;

    //USED for allocation tracking
//    private String reposStr;
//    private byte[] bytes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        rawDataReader = new RawDataReader(this);
        flatBuffersParser = new FlatBuffersParser();

        //USED for allocation tracking
//        rawDataReader.loadString(R.raw.repos_json).subscribe(new SimpleObserver<String>() {
//            @Override
//            public void onNext(String reposStr) {
//                MainActivity.this.reposStr = reposStr;
//            }
//        });
//
//        rawDataReader.loadBytes(R.raw.repos_flat).subscribe(new SimpleObserver<byte[]>() {
//            @Override
//            public void onNext(byte[] bytes) {
//                MainActivity.this.bytes = bytes;
//            }
//        });
    }

    @OnClick(R.id.btnJson)
    public void onJsonClick() {
        rawDataReader.loadString(R.raw.repos_json).subscribe(new SimpleObserver<String>() {
            @Override
            public void onNext(String reposStr) {
                parseReposListJson(reposStr);
            }
        });

        //USED for allocation tracking
//        ReposListJson reposListJson = new Gson().fromJson(reposStr, ReposListJson.class);
    }

    private void parseReposListJson(String reposStr) {
        long startTime = System.currentTimeMillis();
        reposListJson = new Gson().fromJson(reposStr, ReposListJson.class);
        for (int i = 0; i < reposListJson.repos.size(); i++) {
            RepoJson repo = reposListJson.repos.get(i);
            Log.d("FlatBuffers", "Repo #" + i + ", id: " + repo.id);
        }
        long endTime = System.currentTimeMillis() - startTime;
        tvJson.setText("Elements: " + reposListJson.repos.size() + ": load time: " + endTime + "ms");
    }

    @OnClick(R.id.btnFlatBuffers)
    public void onFlatBuffersClick() {
        rawDataReader.loadBytes(R.raw.repos_flat).subscribe(new SimpleObserver<byte[]>() {
            @Override
            public void onNext(byte[] bytes) {
                loadFlatBuffer(bytes);
            }
        });

        //USED for allocation tracking
//        ByteBuffer bb = ByteBuffer.wrap(bytes);
//        ReposList reposListFlat = frogermcs.io.flatbuffs.model.flat.ReposList.getRootAsReposList(bb);
    }

    private void loadFlatBuffer(byte[] bytes) {
        long startTime = System.currentTimeMillis();
        ByteBuffer bb = ByteBuffer.wrap(bytes);
        reposListFlat = frogermcs.io.flatbuffs.model.flat.ReposList.getRootAsReposList(bb);
        for (int i = 0; i < reposListFlat.reposLength(); i++) {
            Repo repos = reposListFlat.repos(i);
            Log.d("FlatBuffers", "Repo #" + i + ", id: " + repos.id());
        }
        long endTime = System.currentTimeMillis() - startTime;
        tvFlat.setText("Elements: " + reposListFlat.reposLength() + ": load time: " + endTime + "ms");

    }

    @OnClick(R.id.btnJsonNative)
    public void onJsonNativeClick() {
        Observable.combineLatest(
                rawDataReader.loadString(R.raw.repos_json),
                rawDataReader.loadString(R.raw.repos_schema),
                new Func2<String, String, Object>() {
                    @Override
                    public Object call(String json, String schema) {
                        parseWithFlatBuffers(json, schema);
                        return reposListFlatParsed;
                    }
                }
        ).subscribe();
    }

    private void parseWithFlatBuffers(String json, String schema) {
        long startTime = System.currentTimeMillis();

        ByteBuffer byteBuffer = flatBuffersParser.parseJson(json, schema);
        reposListFlatParsed = ReposList.getRootAsReposList(byteBuffer);
        for (int i = 0; i < reposListFlatParsed.reposLength(); i++) {
            Repo repos = reposListFlatParsed.repos(i);
            Log.d("FlatBuffers", "Repo #" + i + ", id: " + repos.id());
        }

        long endTime = System.currentTimeMillis() - startTime;
        tvJsonNative.setText("Elements: " + reposListFlatParsed.reposLength() + ": load time: " + endTime + "ms");
    }

    @OnClick(R.id.btnOpenFlatReposListNormal)
    public void openFlatReposListNormal() {
        if (reposListFlat != null) {
            ReposListActivity.openWithRepos(MainActivity.this, reposListFlat);
        }
    }

    @OnClick(R.id.btnOpenFlatReposListOptimized)
    public void openFlatReposListOptimized() {
        if (reposListFlat != null) {
            ReposListActivity.openWithReposOptimized(MainActivity.this, reposListFlat);
        }
    }

    @OnClick(R.id.btnOpenJsonReposList)
    public void openJsonReposList() {
        if (reposListJson != null) {
            ReposListActivity.openWithReposJson(MainActivity.this, reposListJson);
        }
    }

}