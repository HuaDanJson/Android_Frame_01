package com.android.frame.http;

import com.android.frame.ui.other.login.LoginBean;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import rx.Observable;

//接口
public interface IApi {

    @FormUrlEncoded
    @POST("login")
    Call<LoginBean> login(@Field("user") String user,
                          @Field("pasd") String pasd);
    @GET("list")
    Call<String> list(@Query("start") int start,
              @Query("count") int count);

    @FormUrlEncoded
    @POST("login")
    Observable<LoginBean> login1(@Field("user") String user,
                          @Field("pasd") String pasd);
}
