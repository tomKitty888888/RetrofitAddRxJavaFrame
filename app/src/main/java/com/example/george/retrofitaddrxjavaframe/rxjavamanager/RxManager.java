package com.example.george.retrofitaddrxjavaframe.rxjavamanager;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class RxManager {
    private static CompositeDisposable compositeDisposable = new CompositeDisposable();

    //批量添加
    public static void add(Disposable disposable){
        compositeDisposable.add(disposable);
    }
    //最后一次性全部取消订阅
    public static void clera(){
        compositeDisposable.dispose();
    }
}
