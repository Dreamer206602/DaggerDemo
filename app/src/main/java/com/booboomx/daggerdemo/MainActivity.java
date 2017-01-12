package com.booboomx.daggerdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.booboomx.daggerdemo.bean.Food;
import com.booboomx.daggerdemo.bean.Money;
import com.booboomx.daggerdemo.component.DaggerPackComponent;
import com.booboomx.daggerdemo.module.UserModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    public static final String TAG="MainActivity";
    private TextView tv;
//    @Inject
//    Cloth cloth;

//    @Inject
//    Shoe shoe;

//    @Inject
//    Clothes clothes;

//    @Inject
//    Lazy<Cloth>redCloth;

//    @Inject
//    Provider<Shoe>shoe;


//    @Inject
//    @Named("red")
//    Cloth redCloth;
//
//    @Inject
//    @Named("blue")
//    Cloth blueCloth;

//    @Inject
//    Cloth redCloth;

//    @Inject
//    ClothHandler clothHandler;

//    @Inject
//    User mUser1;

//    @Inject
//    User mUser2;

    @Inject
    Money mMoney;

    @Inject
    Food mFood;



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


//        MainComponent build= DaggerMainComponent
//                .builder()
//                .baseComponent(BaseApplication.getInstance().getBaseComponent())
//                .mainModule(new MainModule())
//                .build();
//
//        build.inject(this);

//        BaseApplication.getInstance().getBaseComponent().getSubMainComponent(new MainModule()).inject(this);

//        MainComponent component= DaggerMainComponent.builder().baseComponent(BaseApplication.getInstance().getBaseComponent()).mainModule(new MainModule()).build();
//        component.inject(this);

//        Log.d(TAG, "inject done... ");
//        Log.d(TAG, "1 use redCloth instance ..");
//        Log.d(TAG, "redCloth:" + redCloth.get());
//        Log.d(TAG, "2 use redCloth instance ..");
//        Log.d(TAG, "redCloth:" + redCloth.get());
//        Log.d(TAG, "1 use shoe instance ..");
//        Log.d(TAG, "shoe:" + shoe.get());
//        Log.d(TAG, "2 use shoe instance ..");
//        Log.d(TAG, "shoe:" + shoe.get());



//        tv.setText("红布料加工变成了"+clothHandler.handle(redCloth)+"\nclothHandler地址"+clothHandler);


//        UserComponent component=

//       UserComponent component= DaggerUserComponent.builder().userModule(new UserModule()).build();
//        UserComponent component= BaseApplication.getInstance().getUserComponent();
//        component.inject(this);

//        UserComponent component=UserComponent.getInstance();
//        component.inject(this);

        DaggerPackComponent.create().userComponent(new UserModule()).inject(this);
//        DaggerUserComponent.builder().packComponent(component).build().inject(this);


        tv.setText(mMoney.toString()+"\n"+mFood.toString());



//        tv.setText(mUser1.toString()+"\n"+mUser2.toString()+"\n"+component.toString());



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
