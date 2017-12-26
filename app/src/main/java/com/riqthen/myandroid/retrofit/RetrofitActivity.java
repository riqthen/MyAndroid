package com.riqthen.myandroid.retrofit;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.riqthen.myandroid.R;
import com.riqthen.myandroid.address.AddressEntity;
import com.riqthen.myandroid.utils.TUtil;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import retrofit2.Call;
import retrofit2.Response;

/**
 * http://www.jianshu.com/p/308f3c54abdd
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
        RetrofitModel.getAddress(new RetrofitCallback<AddressEntity>() {
            @Override
            public void onResponse(@NonNull Call<AddressEntity> call, @NonNull Response<AddressEntity> response) {
                AddressEntity addressEntity = response.body();
                if (addressEntity != null) {
                    tvRetrofit.setText(addressEntity.getAddressData().getAddresses().get(0).getAddressDetail());
                }
            }

            @Override
            public void onFailure(@NonNull Call<AddressEntity> call, @NonNull Throwable t) {
                TUtil.show(t.getMessage());
            }
        });
    }


}
