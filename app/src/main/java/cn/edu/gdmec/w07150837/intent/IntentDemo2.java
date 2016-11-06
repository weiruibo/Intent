package cn.edu.gdmec.w07150837.intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by weiruibo on 10/30/16.
 */
public class IntentDemo2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_demo2);
    }

    public void upper(View v) {
        Intent intent = getIntent();

        Bundle bundle = intent.getExtras();
        final String value = bundle.getString("value").toUpperCase();
        Intent intentresult = new Intent();
        intentresult.putExtra("result", value);
        setResult(11, intentresult);
        finish();

    }
}
