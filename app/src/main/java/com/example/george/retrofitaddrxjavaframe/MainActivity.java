package com.example.george.retrofitaddrxjavaframe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.george.retrofitaddrxjavaframe.bean.CatysBean;
import com.example.george.retrofitaddrxjavaframe.bean.CatysBeanTow;
import com.example.george.retrofitaddrxjavaframe.network.NetWorkManager;
import com.example.george.retrofitaddrxjavaframe.network.exception.CustomException;
import com.example.george.retrofitaddrxjavaframe.network.exception.ExceptionApi;
import com.example.george.retrofitaddrxjavaframe.network.exception.ResponseTransformer;
import com.example.george.retrofitaddrxjavaframe.network.response.Response;
import com.example.george.retrofitaddrxjavaframe.rxjavamanager.RxManager;

import java.util.List;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * Hello World!
     */
    private TextView mText;
    /**
     * Button
     */
    private Button mButton;
    private String key = "92ae7ab4eafb8c125bc9909601199684";
    private String tag = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView() {
        mText = (TextView) findViewById(R.id.text);
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.button:
                testRetrofitOrRxjava();

                break;
        }
    }

    public void testRetrofitOrRxjava(){
        NetWorkManager.getRequestApi().getCatysTwo(key,"13")
                .compose(transformer())
                .compose(ResponseTransformer.handleResult())
                .subscribe(new Observer<List<CatysBeanTow>>() {
                    @Override
                    public void onSubscribe(Disposable d) {
                        RxManager.add(d);
                    }

                    @Override
                    public void onNext(List<CatysBeanTow> catysBean) {
                        //if (catysBean.getError_code() == 0){
//                            List<CatysBean.ResultBean> list = catysBean.getResult();
                            String temp = "";
                            for (int i = 0; i < catysBean.size(); i++) {
                                temp += catysBean.get(i).getId()+"---"+catysBean.get(i).getCity_name()+"\n";
                            }
                            mText.setText(temp);
                       //}else{
                            //处理异常

                        //}
                    }

                    @Override
                    public void onError(Throwable e) {
                        ExceptionApi api = (ExceptionApi)e;
                        Log.e(tag,"异常类型："+api.getCode()+"\n"+"详情："+api.getDisplayMessage());
                        Toast.makeText(MainActivity.this,"异常类型："+api.getCode()+"\n"+"详情："+api.getDisplayMessage(),Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onComplete() {

                    }
                });


                        /*
                .subscribe(new Consumer<CatysBean>() {
                    @Override
                    public void accept(CatysBean o) throws Exception {
                        if (o.getError_code() == 0){
                            List<CatysBean.ResultBean> list = o.getResult();
                            String temp = "";
                            for (int i = 0; i < list.size(); i++) {
                                temp += list.get(i).getId()+"---"+list.get(i).getCity_name()+"\n";
                            }
                            mText.setText(temp);
                        }else {
                            //异常处理
                            Toast.makeText(MainActivity.this,""+o.getReason(),Toast.LENGTH_SHORT).show();
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        //异常处理
                        Log.e(tag,throwable.getMessage());
                        Toast.makeText(MainActivity.this,""+throwable.getMessage(),Toast.LENGTH_SHORT).show();
                    }
                });
                 RxManager.add(disposable);*/

    }

    public ObservableTransformer transformer(){

        return new ObservableTransformer() {
            @Override
            public ObservableSource apply(Observable upstream) {
                return upstream.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        RxManager.clera();
    }



}
