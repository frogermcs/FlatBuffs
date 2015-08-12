package frogermcs.io.flatbuffs.utils;

import rx.Observer;

/**
 * Created by Miroslaw Stanek on 08.08.15.
 */
public class SimpleObserver<T> implements Observer<T> {
    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
    }

    @Override
    public void onNext(T o) {

    }
}
