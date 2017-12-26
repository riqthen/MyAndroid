package com.riqthen.myandroid.okhttplogginginterceptor;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.alibaba.fastjson.JSON;
import com.riqthen.myandroid.Config;
import com.riqthen.myandroid.R;
import com.riqthen.myandroid.address.AddressEntity;
import com.riqthen.myandroid.utils.Lcat;

import java.io.IOException;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.FormBody;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class LoggingInterceptorActivity extends AppCompatActivity {

    @BindView(R.id.tv)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logging_interceptor);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_logging_interceptor)
    public void onViewClicked() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addNetworkInterceptor(new LoggingInterceptor())
                .build();
        RequestBody requestBody = new FormBody.Builder()
                .add("userId", "15555555555")
                .build();
        Request request = new Request.Builder()
                .url(Config.URL)
                .put(requestBody)
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String s = response.body().string();
                Lcat.e("", s);
                System.out.println(s);
                AddressEntity addressEntity = JSON.parseObject(s, AddressEntity.class);
                tv.setText(addressEntity.getAddressData().getMessage());
            }
        });
    }

    class LoggingInterceptor implements Interceptor {
        @Override
        public Response intercept(@NonNull Chain chain) throws IOException {
            Request request = chain.request();
            long time = System.nanoTime();  //请求发起的时间
            Response response = chain.proceed(request);
            long time2 = System.nanoTime();  //收到响应的时间
            ResponseBody responseBody = response.peekBody(1024 * 1024);
            return response;
        }
    }
}
