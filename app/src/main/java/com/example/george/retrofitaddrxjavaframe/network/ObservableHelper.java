package com.example.george.retrofitaddrxjavaframe.network;

import com.example.george.retrofitaddrxjavaframe.network.exception.ResponseTransformer;
import com.example.george.retrofitaddrxjavaframe.network.schedulers.SchedulerProvider;

import io.reactivex.Observable;

public class ObservableHelper {

    public static Observable compose(Observable observable){

        return observable.compose(SchedulerProvider.transformer())
                .compose(ResponseTransformer.handleResult());

    }
}
