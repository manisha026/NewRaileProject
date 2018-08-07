package com.example.thaku.newraileproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;

import java.util.ArrayList;

public class Electrician extends AppCompatActivity {
    RecyclerView recyclerView;
    //    Fragment fragment_recycler;
    ArrayList<ModelClass> data=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_electrician);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        recyclerView=findViewById(R.id.recyclerView);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        ModelClass modelClass=new ModelClass();
        ModelClass modelClass1=new ModelClass();
        ModelClass modelClass2=new ModelClass();
        ModelClass modelClass3=new ModelClass();
        ModelClass modelClass4=new ModelClass();
        ModelClass modelClass5=new ModelClass();
        ModelClass modelClass6=new ModelClass();
        ModelClass modelClass7=new ModelClass();
        ModelClass modelClass8=new ModelClass();
        ModelClass modelClass9=new ModelClass();
        ModelClass modelClass10=new ModelClass();
        ModelClass modelClass11=new ModelClass();

        modelClass.setname("Kumar Electrician");
        modelClass.setSingle_phone("Phone Number:- +91- 9999988888");
        modelClass.setSingle_location("Location:- Sector 55Near Ab Colony Chandigarh(4Kms)");
        modelClass.setSingle_requirement("Requirement of 2 electricians");
        modelClass.setSingle_share("share");
        modelClass.setSingle_profile(R.drawable.ic_user);
        modelClass.setSingle_electrical(R.drawable.electrical);





        data.add(modelClass);
        data.add(modelClass1);
        data.add(modelClass2);
        data.add(modelClass3);
        data.add(modelClass4);
        data.add(modelClass5);
        data.add(modelClass6);
        data.add(modelClass7);
        data.add(modelClass8);
        data.add(modelClass9);
        data.add(modelClass10);
        data.add(modelClass11);


        DemoAdapter demoAdapter=new DemoAdapter(Electrician.this,data);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        recyclerView.setAdapter(demoAdapter);


        recyclerView.setNestedScrollingEnabled(false);

    }
}
