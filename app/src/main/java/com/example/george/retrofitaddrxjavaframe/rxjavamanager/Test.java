package com.example.george.retrofitaddrxjavaframe.rxjavamanager;

public class Test {

//    public Observer<GoodsBean> getObserver(){
//        return new Observer<GoodsBean>() {
//
//            @Override
//            public void onComplete() {
//            }
//            @Override
//            public void onError(Throwable e) {
//                if (e instanceof ExceptionApi) {
//                    ExceptionApi exapi = (ExceptionApi) e;
//                    LogUtil.e(exapi.getDisplayMessage());
//                    showErrorDialog(exapi.getCode()+"-"+exapi.getDisplayMessage());
//                }else {
//                    LogUtil.e(e.getMessage());
//                    showErrorDialog(e.getMessage());
//                }
//                //重置扫描框内容
//                addEditText.setText(null);
//                addEditText.requestFocus();
//            }
//
//            @Override
//            public void onNext(GoodsBean goodsBean) {
//                if (goodsBean.getRows() != null) {
//                    list = goodsBean.getRows();
//                    shoppingCartAdapter.setData(list);
//                    upView(list);
//                }
//                //重置扫描框内容
//                addEditText.setText(null);
//                addEditText.requestFocus();
//            }
//            @Override
//            public void onSubscribe(Disposable disposable) {
//                rxManager.add(disposable);
//            }
//        };
//    }
//
//    @SuppressWarnings({ "unchecked", "static-access" })
//    public void add(String goodsBarcode){
//        if(goodsBarcode.isEmpty())return;
//        mLoading.setVisibility(View.VISIBLE);
//        mLoading.showLoading();
//
//        NetWorkManager.getInstance().getRequestApi()
//                .add(Parameter.add(goodsBarcode))
//                .compose(SchedulerProvider.transformer())
//                .compose(ResponseTransformer.handleResult())
//                .doFinally(new Action() {
//                    @Override
//                    public void run() throws Exception {
//                        mLoading.setVisibility(View.GONE);
//                    }
//                })
//                .subscribe(getObserver());
//    }




//    @SuppressWarnings("unchecked")
//    public void initDev(){
//        final PosInitInfo pos = new PosInitInfo();
//        pos.setId(1);
//        pos.setDevices(String.valueOf(mDevices.getSelectedItem()));
//        pos.setOrg(mOrg.getText().toString());
//        pos.setWhs(mWhs.getText().toString());
//        pos.setPos(mPos.getText().toString());
//        pos.setNet(mOperNet.getText().toString());
//        pos.setPort(mPort.getText().toString());
//        pos.setServername(mOperServername.getText().toString());
//        pos.setEnterpriseCode(mOperEnterpriseCode.getText().toString());
//        pos.setProtocol(String.valueOf(mHttpProtocol.getSelectedItem()));
//
//        HashMap<String, String> map = new HashMap<String, String>();
//        map.put("orgNo", pos.getOrg());
//        map.put("whsNo", pos.getWhs());
//        map.put("posNo", pos.getPos());
//        map.put("sign", Utils.getUniqueId());
//        if (!pos.getEnterpriseCode().isEmpty()) {
//            map.put("entNo", pos.getEnterpriseCode());
//        }
//        NetWorkManager.URL = pos.getProtocol()+"://"+pos.getNet()+":"+pos.getPort()+"/"+pos.getServername()+"/";
//        LogUtil.i("URL="+NetWorkManager.URL);
//        NetWorkManager.getInstance().init();
//        showLoadingDialog();
//        ObservableHelper.compose(NetWorkManager.getRequestApi().verify(map))
//                .flatMap(new Function<String, Observable<Response<String>>>() {
//
//                    @Override
//                    public Observable<Response<String>> apply(String t)
//                            throws Exception {
//                        LogUtil.i(t);
//                        pos.setToken(t);
//                        HashMap<String, String> conMap = new HashMap<String, String>();
//                        conMap.put("token", t);
//                        conMap.put("total", "6");//分区总容量
//                        conMap.put("free", "6"); //分区剩余空间
//                        conMap.put("memory", "6");//内存容量
//                        conMap.put("attach", ""); //附加数据（用JSON字符串格式表示）
//                        return ObservableHelper.compose(NetWorkManager.getRequestApi().confirm(conMap));
//                    }
//                })
//                .doFinally(new Action() {
//                    @Override
//                    public void run() throws Exception {
//                        dialogDismiss();
//                    }
//                })
//                .subscribe(new Observer<String>() {
//
//                    @Override
//                    public void onSubscribe(Disposable d) {
//                        rxManager.add(d);
//                    }
//
//                    @Override
//                    public void onNext(String value) {
//
//                        LogUtil.i(value);
//                        pos.setUpDate(value);
//                        long comunt = GreenDaoManager.getInstance().getSession().getPosInitInfoDao().insertOrReplace(pos);
//                        LogUtil.i("comunt:"+comunt);
//                        if (comunt == 1) {
//                            setDialogButtonListener(new OnSweetClickListener() {
//                                @Override
//                                public void onClick(SweetAlertDialog sweetAlertDialog) {
//                                    sweetAlertDialog.dismiss();
//                                    Intent intent = new Intent(MainActivity.this,StartDealActivity.class);
//                                    MainActivity.this.startActivity(intent);
//                                    MainActivity.this.finish();
//                                }
//                            });
//                            showSuccessDialog("初始完成");
//                        }
//                    }
//
//                    @Override
//                    public void onError(Throwable e) {
//                        if (e instanceof ExceptionApi) {
//                            ExceptionApi exapi = (ExceptionApi) e;
//                            LogUtil.e(exapi.getDisplayMessage());
//                            showErrorDialog(exapi.getCode()+"-"+exapi.getDisplayMessage());
//                        }else {
//                            LogUtil.e(e.getMessage());
//                            showErrorDialog(e.getMessage());
//                        }
//                    }
//
//                    @Override
//                    public void onComplete() {
//                    }
//                });
//    }
}
