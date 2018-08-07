package com.example.thaku.newraileproject;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.WindowManager;

import java.util.ArrayList;

public class Home extends AppCompatActivity {

    RecyclerView recyclerView;
//    Fragment fragment_recycler;
    ArrayList<ModelClass> data=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
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


        modelClass.setSingle_kumar("Kumar Electrician");
        modelClass.setSingle_phone("Phone Number:- +91- 9999988888");
        modelClass.setSingle_location("Location:- Sector 55Near Ab Colony Chandigarh(4Kms)");
        modelClass.setSingle_requirement("Requirement of 2 electricians");
        modelClass.setSingle_share("share");
        modelClass.setSingle_profile(R.drawable.ic_user);
        modelClass.setSingle_electrical(R.drawable.electrical);


        modelClass1.setSingle_kumar("Kumar Electrician");
        modelClass1.setSingle_phone("Phone Number:- +91- 9999988888");
        modelClass1.setSingle_location("Location:- Sector 55Near Ab Colony Chandigarh(4Kms)");
        modelClass1.setSingle_requirement("Requirement of 2 electricians");
        modelClass1.setSingle_share("share");
        modelClass1.setSingle_profile(R.drawable.ic_user);
        modelClass1.setSingle_electrical(R.drawable.electrical);

        modelClass2.setSingle_kumar("Kumar Electrician");
        modelClass2.setSingle_phone("Phone Number:- +91- 9999988888");
        modelClass2.setSingle_location("Location:- Sector 55Near Ab Colony Chandigarh(4Kms)");
        modelClass2.setSingle_requirement("Requirement of 2 electricians");
        modelClass2.setSingle_share("share");
        modelClass2.setSingle_profile(R.drawable.ic_user);
        modelClass2.setSingle_electrical(R.drawable.electrical);

        modelClass3.setSingle_kumar("Kumar Electrician");
        modelClass3.setSingle_phone("Phone Number:- +91- 9999988888");
        modelClass3.setSingle_location("Location:- Sector 55Near Ab Colony Chandigarh(4Kms)");
        modelClass3.setSingle_requirement("Requirement of 2 electricians");
        modelClass3.setSingle_share("share");
        modelClass3.setSingle_profile(R.drawable.ic_user);
        modelClass3.setSingle_electrical(R.drawable.electrical);

        modelClass4.setSingle_kumar("Kumar Electrician");
        modelClass4.setSingle_phone("Phone Number:- +91- 9999988888");
        modelClass4.setSingle_location("Location:- Sector 55Near Ab Colony Chandigarh(4Kms)");
        modelClass4.setSingle_requirement("Requirement of 2 electricians");
        modelClass4.setSingle_share("share");
        modelClass4.setSingle_profile(R.drawable.ic_user);
        modelClass4.setSingle_electrical(R.drawable.electrical);

        modelClass5.setSingle_kumar("Kumar Electrician");
        modelClass5.setSingle_phone("Phone Number:- +91- 9999988888");
        modelClass5.setSingle_location("Location:- Sector 55Near Ab Colony Chandigarh(4Kms)");
        modelClass5.setSingle_requirement("Requirement of 2 electricians");
        modelClass5.setSingle_share("share");
        modelClass5.setSingle_profile(R.drawable.ic_user);
        modelClass5.setSingle_electrical(R.drawable.electrical);

        modelClass6.setSingle_kumar("Kumar Electrician");
        modelClass6.setSingle_phone("Phone Number:- +91- 9999988888");
        modelClass6.setSingle_location("Location:- Sector 55Near Ab Colony Chandigarh(4Kms)");
        modelClass6.setSingle_requirement("Requirement of 2 electricians");
        modelClass6.setSingle_share("share");
        modelClass6.setSingle_profile(R.drawable.ic_user);
        modelClass6.setSingle_electrical(R.drawable.electrical);

        modelClass7.setSingle_kumar("Kumar Electrician");
        modelClass7.setSingle_phone("Phone Number:- +91- 9999988888");
        modelClass7.setSingle_location("Location:- Sector 55Near Ab Colony Chandigarh(4Kms)");
        modelClass7.setSingle_requirement("Requirement of 2 electricians");
        modelClass7.setSingle_share("share");
        modelClass7.setSingle_profile(R.drawable.ic_user);
        modelClass7.setSingle_electrical(R.drawable.electrical);

        modelClass8.setSingle_kumar("Kumar Electrician");
        modelClass8.setSingle_phone("Phone Number:- +91- 9999988888");
        modelClass8.setSingle_location("Location:- Sector 55Near Ab Colony Chandigarh(4Kms)");
        modelClass8.setSingle_requirement("Requirement of 2 electricians");
        modelClass8.setSingle_share("share");
        modelClass8.setSingle_profile(R.drawable.ic_user);
        modelClass8.setSingle_electrical(R.drawable.electrical);

        modelClass9.setSingle_kumar("Kumar Electrician");
        modelClass9.setSingle_phone("Phone Number:- +91- 9999988888");
        modelClass9.setSingle_location("Location:- Sector 55Near Ab Colony Chandigarh(4Kms)");
        modelClass9.setSingle_requirement("Requirement of 2 electricians");
        modelClass9.setSingle_share("share");
        modelClass9.setSingle_profile(R.drawable.ic_user);
        modelClass9.setSingle_electrical(R.drawable.electrical);

        modelClass10.setSingle_kumar("Kumar Electrician");
        modelClass10.setSingle_phone("Phone Number:- +91- 9999988888");
        modelClass10.setSingle_location("Location:- Sector 55Near Ab Colony Chandigarh(4Kms)");
        modelClass10.setSingle_requirement("Requirement of 2 electricians");
        modelClass10.setSingle_share("share");
        modelClass10.setSingle_profile(R.drawable.ic_user);
        modelClass10.setSingle_electrical(R.drawable.electrical);

        modelClass11.setSingle_kumar("Kumar Electrician");
        modelClass11.setSingle_phone("Phone Number:- +91- 9999988888");
        modelClass11.setSingle_location("Location:- Sector 55Near Ab Colony Chandigarh(4Kms)");
        modelClass11.setSingle_requirement("Requirement of 2 electricians");
        modelClass11.setSingle_share("share");
        modelClass11.setSingle_profile(R.drawable.ic_user);
        modelClass11.setSingle_electrical(R.drawable.electrical);



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


        DemoAdapter demoAdapter=new DemoAdapter(Home.this,data);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        recyclerView.setAdapter(demoAdapter);


        recyclerView.setNestedScrollingEnabled(false);
//        WaysRVAdapter waysRVAdapter = new WaysRVAdapter(MainActivity.this, waysList);
//        recycler_view_ways.setAdapter(waysRVAdapter);


    }
}
