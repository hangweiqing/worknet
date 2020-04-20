package com.weiqing.takeout.interfaces;

import com.weiqing.takeout.bean.ResponseInfo;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;


public interface ResponseInfoAPI {
    @POST("queryOrderDetail.action")
    Call<ResponseInfo> getData(@Body RequestBody params);
}
