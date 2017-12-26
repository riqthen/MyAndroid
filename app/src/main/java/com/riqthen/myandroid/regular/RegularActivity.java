package com.riqthen.myandroid.regular;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.TextView;

import com.riqthen.myandroid.R;
import com.riqthen.myandroid.utils.Lcat;
import com.riqthen.myandroid.utils.MyUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegularActivity extends AppCompatActivity {

    @BindView(R.id.et_input)
    EditText mEtInput;
    @BindView(R.id.tv)
    TextView mTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular);
        ButterKnife.bind(this);
    }

    private void setText(String tag, boolean result) {
        mTv.setText(tag + "：" + (result ? "是" : "否"));
    }


    @OnClick(R.id.btn)
    public void onViewClicked() {
        String text = mEtInput.getText().toString();
        Lcat.e("", MyUtils.RegularUtils.isLetter(text));
        Lcat.e("", MyUtils.RegularUtils.isUpperLetter(text));
        Lcat.e("3", MyUtils.RegularUtils.isLowerLetter(text));
        Lcat.e("4", MyUtils.RegularUtils.isPhoneNumber(text));
        Lcat.e("", "MyUtils.RegularUtils.isPhoneNumber(text)");

//        setText("汉字", isLetter(text));
    }

    public boolean isHanzi(String text) {
        Pattern p = Pattern.compile("^[\u4e00-\u9fa5]{0,}$");
        Matcher m = p.matcher(text);
        return m.matches();
    }

    public boolean isLetterOrNumber(String text) {
        return Pattern.compile("^[A-Za-z0-9]+$").matcher(text).matches();
    }

    public boolean isSymbol(String text) {
        return Pattern.compile("[" + "%&',;=?$_+()!@#^*{}:\"<>/`~|." + "x22]+").matcher(text).matches(); // %&',;=?$_+()!@#^*{}:"<>/`~
    }

    public boolean isLetter(String text) {
        return Pattern.compile("[a-zA-Z]").matcher(text).matches();
    }


}
