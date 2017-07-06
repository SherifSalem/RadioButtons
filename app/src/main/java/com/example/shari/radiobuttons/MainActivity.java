package com.example.shari.radiobuttons;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.clearCheck();
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId){
            RadioButton rb = (RadioButton) findViewById(checkedId);
            if (null!=rb && checkedId > -1){
                Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_LONG);
            }
        }
    });
    }
    public void onClear (View v){
        radioGroup.clearCheck();

    }
    public void onSubmit(View v){
        RadioButton rb = (RadioButton) radioGroup.findViewById(radioGroup.getCheckedRadioButtonId());
        Toast.makeText(MainActivity.this, rb.getText(), Toast.LENGTH_LONG).show();
    }
}
