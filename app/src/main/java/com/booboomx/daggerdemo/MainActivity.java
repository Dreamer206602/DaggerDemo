package com.booboomx.daggerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.booboomx.daggerdemo.app.BaseApplication;
import com.booboomx.daggerdemo.bean.Cloth;
import com.booboomx.daggerdemo.bean.Clothes;
import com.booboomx.daggerdemo.bean.Shoe;
import com.booboomx.daggerdemo.component.DaggerMainComponent;
import com.booboomx.daggerdemo.component.MainComponent;
import com.booboomx.daggerdemo.module.MainModule;
import com.booboomx.daggerdemo.utils.ClothHandler;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private TextView tv;
//    @Inject
//    Cloth cloth;

    @Inject
    Shoe shoe;

    @Inject
    Clothes clothes;


//    @Inject
//    @Named("red")
//    Cloth redCloth;
//
//    @Inject
//    @Named("blue")
//    Cloth blueCloth;

    @Inject
    Cloth redCloth;

    @Inject
    ClothHandler clothHandler;


    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv= (TextView) findViewById(R.id.tv);
        btn= (Button) findViewById(R.id.btn);




//        MainComponent build= DaggerMainComponent.builder().mainModule(new MainModule()).build();
//        build.inject(this);
//        tv.setText("我现在有－－"+cloth+"and"+shoe);

//        tv.setText("我现在有"+cloth+"和"+shoe+"和"+clothes);

//        tv.setText("我现在有"+redCloth+"和"+blueCloth);

//        tv.setText("redCloth=clothes中的cloth吗？:"+(redCloth==clothes.getCloth()));


        MainComponent build= DaggerMainComponent
                .builder()
                .baseComponent(BaseApplication.getInstance().getBaseComponent())
                .mainModule(new MainModule())
                .build();

        build.inject(this);

        tv.setText("红布料加工变成了"+clothHandler.handle(redCloth)+"\nclothHandler地址"+clothHandler);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setClass(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }
        });

    }


}
