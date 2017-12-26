package com.riqthen.myandroid.texttobitmap;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.widget.EditText;
import android.widget.ImageView;

import com.riqthen.myandroid.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TextToBitmapActivity extends AppCompatActivity {

    @BindView(R.id.et_ttb)
    EditText mEtTtb;
    @BindView(R.id.iv_ttb)
    ImageView mIvTtb;

    private String mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_to_bitmap);
        ButterKnife.bind(this);
        init();
    }

    private void init() {
        mText = mEtTtb.getText().toString().trim();
    }

    @OnClick(R.id.btn_ttb)
    public void onViewClicked() {
        mIvTtb.setImageBitmap(textAsBitmap(mText, 14f));
    }

    public Bitmap textAsBitmap(String text, float textSize) {
        TextPaint textPaint = new TextPaint();
        // textPaint.setARGB(0x31, 0x31, 0x31, 0);
        textPaint.setColor(Color.BLACK);
        textPaint.setTextSize(textSize);
        StaticLayout layout = new StaticLayout(text, textPaint, 450,
                Layout.Alignment.ALIGN_NORMAL, 1.3f, 0.0f, true);
        Bitmap bitmap = Bitmap.createBitmap(layout.getWidth() + 20,
                layout.getHeight() + 20, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        canvas.translate(10, 10);
        canvas.drawColor(Color.RED);

        layout.draw(canvas);
        return bitmap;
    }

}
