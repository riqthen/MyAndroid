package com.riqthen.myandroid.retrofit;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.riqthen.myandroid.R;
import com.riqthen.myandroid.address.AddressEntity;
import com.riqthen.myandroid.utils.Lcat;

import org.json.JSONException;
import org.json.JSONObject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/*
 * 主要有一下几种请求方法
 * @GET         表示这是一个GET请求
 * @POST        表示这个一个POST请求
 * @PUT         表示这是一个PUT请求
 * @DELETE      表示这是一个DELETE请求
 * @HEAD        表示这是一个HEAD请求
 * @OPTIONS     表示这是一个OPTION请求
 * @PATCH       表示这是一个PAT请求
 *
 * 各种请求注解的意思
 * @Headers     添加请求头
 * @Path        替换路径
 * @Query       替代参数值，通常是结合get请求的
 * @FormUrlEncoded  用表单数据提交
 * @Field       替换参数值，是结合post请求的
 */
public class RetrofitActivity extends AppCompatActivity {

    @BindView(R.id.tv_retrofit)
    TextView tvRetrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_retrofit_net)
    public void onViewClicked() {
        JSONObject jsonObject = new JSONObject();
        try {
            jsonObject.put("userId", "15555555555");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        AddressEntity address = RetrofitModel.getAddress(jsonObject.toString());
        Lcat.print("a", address);
//        tvRetrofit.setText(addressEntity.getAddressData().getAddresses().get(0).getAddressDetail());
    }


}
