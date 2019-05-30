package com.example.george.retrofitaddrxjavaframe.network.request;

import com.example.george.retrofitaddrxjavaframe.bean.CatysBean;
import com.example.george.retrofitaddrxjavaframe.bean.CatysBeanTow;
import com.example.george.retrofitaddrxjavaframe.network.response.Response;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RequestApi {
    public static String URL = "http://v.juhe.cn/";

    @GET("historyWeather/citys")
    Observable<CatysBean> getCatys(@Query("key")String key, @Query("province_id")String province_id);

    @GET("historyWeather/citys")
    Observable<Response<List<CatysBeanTow>>> getCatysTwo(@Query("key")String key, @Query("province_id")String province_id);
}
