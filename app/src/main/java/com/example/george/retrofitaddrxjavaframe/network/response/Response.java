package com.example.george.retrofitaddrxjavaframe.network.response;

public class Response<T> {
    //{ret:0,data:"",msg:""} 返回数据格式

    //这里使用天气查询的数据格式
    //{"reason": "查询成功","result": {},"error_code": 0}

    private String reason;
    private T result;
    private int error_code;



    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }


    /**
     * 根据 code 码判断业务状态
     * code == 2xx，表示业务成功。其他表示业务失败，codeMsg 进一步描述业务状态。
     */
    public boolean isSuccess() {
        return error_code / 100 == 2;
    }

}
