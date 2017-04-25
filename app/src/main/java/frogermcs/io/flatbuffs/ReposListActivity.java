package frogermcs.io.flatbuffs;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.nio.ByteBuffer;

import butterknife.Bind;
import butterknife.ButterKnife;
import frogermcs.io.flatbuffs.model.flat.ReposList;
import frogermcs.io.flatbuffs.model.json.ReposListJson;
import frogermcs.io.flatbuffs.view.adapter.FlatRepositoriesListAdapter;
import frogermcs.io.flatbuffs.view.adapter.JsonRepositoriesListAdapter;
import frogermcs.io.flatbuffs.view.adapter.OptimizedFlatRepositoriesListAdapter;

/**
 * Created by Miroslaw Stanek on 12.11.2015.
 */
public class ReposListActivity extends AppCompatActivity {
    private static final int MODE_JSON = 0;
    private static final int MODE_FLAT_AS_IS = 1;
    private static final int MODE_FLAT_OPTIMIZED = 2;

    private static final String KEY_REPOS = "key_repos";
    private static final String KEY_MODE = "key_mode";

    public static void openWithRepos(Activity openingActivity, ReposList reposList) {
        Intent intent = new Intent(openingActivity, ReposListActivity.class);
        intent.putExtra(KEY_REPOS, reposList.getByteBuffer().array());
        intent.putExtra(KEY_MODE, MODE_FLAT_AS_IS);
        openingActivity.startActivity(intent);
    }

    public static void openWithReposOptimized(Activity openingActivity, ReposList reposList) {
        Intent intent = new Intent(openingActivity, ReposListActivity.class);
        intent.putExtra(KEY_REPOS, reposList.getByteBuffer().array());
        intent.putExtra(KEY_MODE, MODE_FLAT_OPTIMIZED);
        openingActivity.startActivity(intent);
    }

public static void openWithReposJson(Activity openingActivity, ReposListJson reposListJson) {
    Intent intent = new Intent(openingActivity, ReposListActivity.class);
    intent.putExtra(KEY_REPOS, reposListJson);
    intent.putExtra(KEY_MODE, MODE_JSON);
    openingActivity.startActivity(intent);
}

    @Bind(R.id.lvRepositories)
    ListView lvRepositories;

    private ReposList reposList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flat_repos_list);
        ButterKnife.bind(this);

        int mode = getIntent().getIntExtra(KEY_MODE, MODE_JSON);

        switch (mode) {
            case MODE_JSON:
                setupJsonAdapter();
                break;

            case MODE_FLAT_AS_IS:
                setupEasyFlatAdapter();
                break;

            case MODE_FLAT_OPTIMIZED:
                setupOptimizedFlatAdapter();
                break;

            default:
                break;
        }
    }

    private void setupJsonAdapter() {
        ReposListJson reposListJson = getIntent().getParcelableExtra(KEY_REPOS);

        JsonRepositoriesListAdapter repositoriesListAdapter = new JsonRepositoriesListAdapter(this);
        lvRepositories.setAdapter(repositoriesListAdapter);
        repositoriesListAdapter.setReposList(reposListJson);
    }

    private void setupEasyFlatAdapter() {
        byte[] reposByteArray = getIntent().getByteArrayExtra(KEY_REPOS);
        reposList = ReposList.getRootAsReposList(ByteBuffer.wrap(reposByteArray));

        FlatRepositoriesListAdapter repositoriesListAdapter = new FlatRepositoriesListAdapter(this);
        lvRepositories.setAdapter(repositoriesListAdapter);
        repositoriesListAdapter.setReposList(reposList);
    }

    private void setupOptimizedFlatAdapter() {
        byte[] reposByteArray = getIntent().getByteArrayExtra(KEY_REPOS);
        reposList = ReposList.getRootAsReposList(ByteBuffer.wrap(reposByteArray));

        OptimizedFlatRepositoriesListAdapter optimizedRepositoriesListAdapter = new OptimizedFlatRepositoriesListAdapter(this);
        lvRepositories.setAdapter(optimizedRepositoriesListAdapter);
        optimizedRepositoriesListAdapter.setReposList(reposList);
    }
}
