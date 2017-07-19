package ngocamha.com.animation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnAlpha;
    Button btnScale;
    Button btnTranslate;
    Button btnRotate;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAlpha = (Button) findViewById(R.id.btn_alpha);
        btnAlpha.setOnClickListener(this);
        btnScale = (Button) findViewById(R.id.btn_scale);
        btnScale.setOnClickListener(this);
        btnTranslate = (Button) findViewById(R.id.btn_translate);
        btnTranslate.setOnClickListener(this);
        btnRotate  = (Button) findViewById(R.id.btn_rotate);
        btnRotate.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_alpha:
                Animation animation = AnimationUtils.loadAnimation(MainActivity.this, R.anim.alpha_animation);
                btnAlpha.startAnimation(animation);
                break;

            case R.id.btn_scale:
                Animation animation1  = AnimationUtils.loadAnimation(MainActivity.this, R.anim.scale_animation);
                btnScale.startAnimation(animation1);
                break;
            case R.id.btn_translate:
                Animation animation2  = AnimationUtils.loadAnimation(MainActivity.this, R.anim.translate_aminmation);
                btnTranslate.startAnimation(animation2);
                break;
            case R.id.btn_rotate:
                Animation animation3 = AnimationUtils.loadAnimation(MainActivity.this, R.anim.rotare_animation);
                btnRotate.startAnimation(animation3);
                break;
        }
    }
}
