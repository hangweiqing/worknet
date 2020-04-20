package com.weiqing.takeout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.weiqing.takeout.bean.ResponseInfo;
import com.weiqing.takeout.interfaces.ResponseInfoAPI;
import com.weiqing.takeout.utils.GsonUtil;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import okhttp3.internal.platform.Platform;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                init();
            }
        });




    }

    private void init() {
        //打印日志
        HttpLoggingInterceptor loggingInterceptor = new HttpLoggingInterceptor(new HttpLoggingInterceptor.Logger() {
            @Override
            public void log(String message) {
                //打印retrofit日志
                //Log.e("RetrofitLog","retrofitBack = "+message);
            }
        });
        loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient httpClient = new OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build();


        Retrofit retrofit = new Retrofit.Builder()
                .client(httpClient)
                .baseUrl("http://test-ctspeed.changtu.com/ctspeedservice/")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
        ResponseInfoAPI api = retrofit.create(ResponseInfoAPI.class);


        //请求参数
        Map<String,String> maps = new HashMap<>();
        maps.put("orderId","115");
        maps.put("orderSourceId","4033");
        maps.put("channelId","7");
        String paramsStr = GsonUtil.fromObjectToJsonString(maps);


        RequestBody body = FormBody.create(MediaType.parse("application/json; charset=utf-8"),paramsStr);
        //RequestBody requestBody = RequestBody.create(MediaType.parse("Content-Type, application/json"), new JSONObject(maps).toString());
        Call<ResponseInfo> call = api.getData(body);
        //异步enqueue/同步execute
        call.enqueue(new Callback<ResponseInfo>() {
            @Override
            public void onResponse(@NonNull Call<ResponseInfo> call, @NonNull Response<ResponseInfo> response) {
                System.out.println("连接成功："+response.body().toString());
            }

            @Override
            public void onFailure(@NonNull Call<ResponseInfo> call, @NonNull Throwable t) {
                System.out.println("连接失败");
            }
        });
    }
}
