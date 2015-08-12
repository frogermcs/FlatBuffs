package frogermcs.io.flatbuffs.utils;

import android.content.Context;
import android.support.annotation.RawRes;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func0;
import rx.schedulers.Schedulers;

/**
 * Created by Miroslaw Stanek on 08.08.15.
 */
public class RawDataReader {

    private Context context;

    public RawDataReader(Context context) {
        this.context = context;
    }

    public Observable<String> loadJsonString(@RawRes final int rawId) {
        return Observable.defer(new Func0<Observable<String>>() {
            @Override
            public Observable<String> call() {
                try {
                    return Observable.just(loadJsonStringBlocking(rawId));
                } catch (IOException e) {
                    return Observable.error(e);
                }
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    public String loadJsonStringBlocking(@RawRes int rawId) throws IOException {
        InputStream is = context.getResources().openRawResource(rawId);
        Writer writer = new StringWriter();
        char[] buffer = new char[1024];
        Reader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
        int n;
        while ((n = reader.read(buffer)) != -1) {
            writer.write(buffer, 0, n);
        }
        is.close();

        return writer.toString();
    }

    public Observable<byte[]> loadBytes(@RawRes final int rawId) {
        return Observable.defer(new Func0<Observable<byte[]>>() {
            @Override
            public Observable<byte[]> call() {
                try {
                    return Observable.just(loadBytesBlocking(rawId));
                } catch (IOException e) {
                    return Observable.error(e);
                }
            }
        }).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
    }

    public byte[] loadBytesBlocking(@RawRes int rawId) throws IOException {
        final InputStream inputStream = context.getResources().openRawResource(rawId);
        final byte[] bytes = convertStreamToByteArray(inputStream);
        inputStream.close();
        return bytes;
    }

    private byte[] convertStreamToByteArray(InputStream is) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buff = new byte[10240];
        int i = Integer.MAX_VALUE;
        while ((i = is.read(buff, 0, buff.length)) > 0) {
            baos.write(buff, 0, i);
        }

        return baos.toByteArray();
    }
}
