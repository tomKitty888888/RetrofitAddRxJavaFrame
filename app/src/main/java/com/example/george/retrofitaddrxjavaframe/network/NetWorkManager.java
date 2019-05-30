package com.example.george.retrofitaddrxjavaframe.network;

import com.example.george.retrofitaddrxjavaframe.network.request.RequestApi;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class NetWorkManager {

    private static NetWorkManager netWorkManager;
    private static Retrofit retrofit;
    private static volatile RequestApi requestApi = null;

    public static NetWorkManager getInstance(){
        if (netWorkManager == null){
            synchronized (NetWorkManager.class){
                if (netWorkManager == null){
                    netWorkManager = new NetWorkManager();
                }
            }
        }
        return  netWorkManager;
    }

    /**
     * //初始化Retrofit OkHttp
     */
    public void init(){
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BASIC);
        OkHttpClient client = new OkHttpClient.Builder()
                .addInterceptor(logging)    //打印log 还可以添加其他的拦截器
                .retryOnConnectionFailure(false)  //取消okHttp在网络差的情况下自动重复请求
                .connectTimeout(300, TimeUnit.SECONDS)
                .readTimeout(300, TimeUnit.SECONDS)
                .writeTimeout(300, TimeUnit.SECONDS)
                .addInterceptor(logging)
                .build();

        retrofit = new Retrofit.Builder()
                .client(client)
                .baseUrl(RequestApi.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    HttpLoggingInterceptor logging = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {

        @Override
        public void log(String message) {
            //测试环境下才打印
            //LogUtil.d("net:"+message);
        }
    });

    public static RequestApi getRequestApi(){
        if (requestApi == null){
            synchronized (RequestApi.class){
                requestApi = retrofit.create(RequestApi.class);
            }
        }
        return  requestApi;
    }

}
