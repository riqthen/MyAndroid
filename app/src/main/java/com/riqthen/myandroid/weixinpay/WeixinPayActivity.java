package com.riqthen.myandroid.weixinpay;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import com.riqthen.myandroid.R;
import com.riqthen.myandroid.utils.Lcat;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.modelpay.PayReq;
import com.tencent.mm.opensdk.openapi.IWXAPI;
import com.tencent.mm.opensdk.openapi.WXAPIFactory;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WeixinPayActivity extends AppCompatActivity {

    @BindView(R.id.et_weixin_pay)
    EditText mEtWeixinPay;
    @BindView(R.id.tv_weixin_pay)
    TextView mTvWeixinPay;
    private IWXAPI mMsgApi;
    private PayReq mReq;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weixin_pay);
        ButterKnife.bind(this);
        mMsgApi = WXAPIFactory.createWXAPI(this, null);
        mMsgApi.registerApp("wxa13ed58ffe1a4d1b");
        mReq = new PayReq();
        mReq.appId = "wxa13ed58ffe1a4d1b";
        mReq.sign = "6B6A8C55C4C07511F52E79CFAC9909EA";
        mReq.timeStamp = String.valueOf(System.currentTimeMillis());
        mReq.packageValue = "Sign=WXPay";
        mReq.partnerId = "1275181101";
        mReq.nonceStr = "347pqadpfjx5qvc08oadc8jp7um4xicq";
        mReq.prepayId = "wx20171122141614cbf8560cfb0517335071";
    }

    @OnClick(R.id.btn_weixin_pay)
    public void onViewClicked() {
       mMsgApi.sendReq(mReq);
    }

    private void pay(BaseResp resp) {
        if (mReq.getType() == ConstantsAPI.COMMAND_PAY_BY_WX) {
            Lcat.e("error", resp.errCode);
        }

    }
}
