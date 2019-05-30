package com.example.george.retrofitaddrxjavaframe.network.exception;

import android.net.ParseException;
import com.google.gson.JsonParseException;
import org.json.JSONException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

public class CustomException {


    /**
     * 未知错误
     */
    public static final int UNKNOWN = 1000;

    /**
     * 解析错误
     */
    public static final int PARSE_ERROR = 1001;

    /**
     * 网络错误
     */
    public static final int NETWORK_ERROR = 1002;

    /**
     * 协议错误
     */
    public static final int HTTP_ERROR = 1003;


    /**
     * // 本地异常处理
     * @param e
     * @return
     */
    public static ExceptionApi handleException(Throwable e){
        ExceptionApi ex;
        if (e instanceof JsonParseException
                || e instanceof JSONException
                || e instanceof ParseException){
            //解析错误
            ex = new ExceptionApi(PARSE_ERROR,e.getMessage());
            return ex;
        }else if (e instanceof ConnectException) {
            //网络错误
            ex = new ExceptionApi(NETWORK_ERROR, e.getMessage());
            return ex;
        } else if (e instanceof UnknownHostException || e instanceof SocketTimeoutException) {
            //连接错误
            ex = new ExceptionApi(NETWORK_ERROR, e.getMessage());
            return ex;
        } else {
            //未知错误
            ex = new ExceptionApi(UNKNOWN, e.getMessage());
            return ex;
        }

    }
}
