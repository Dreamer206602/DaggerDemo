package com.booboomx.daggerdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.booboomx.daggerdemo.app.BaseApplication;
import com.booboomx.daggerdemo.bean.Cloth;
import com.booboomx.daggerdemo.component.DaggerSecondComponent;
import com.booboomx.daggerdemo.component.SecondComponent;
import com.booboomx.daggerdemo.utils.ClothHandler;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {

    private TextView tv;
    @Inject
    Cloth blueCloth;
    @Inject
    ClothHandler clothHandler;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scond);

        tv= (TextView) findViewById(R.id.tv);


//     SecondComponent component= DaggerSecondComponent.builder().secondModule(new SecondModule()).build();
//        component.inject(this);

        SecondComponent builder= DaggerSecondComponent
                .builder()
                .baseComponent(BaseApplication.getInstance().getBaseComponent())
                .build();
        builder.inject(this);
        tv.setText("蓝布料加工后变成了"+clothHandler.handle(blueCloth)+"\nclothHandler"+clothHandler);

    }
}
