package com.tusharpatil.listviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListView list_view;
    private CustomListAdapter customListAdapter;
    private ArrayList<DemoModel> demoModels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        list_view = findViewById(R.id.list_view);

        customListAdapter = new CustomListAdapter(this, demoModels);
        list_view.setAdapter(customListAdapter);
    }

    private void init() {
        demoModels = new ArrayList<>();
        demoModels.add(new DemoModel(1, "India", R.mipmap.ic_launcher));
        demoModels.add(new DemoModel(2, "Australia", R.mipmap.ic_launcher));
        demoModels.add(new DemoModel(3, "Russia", R.mipmap.ic_launcher));
        demoModels.add(new DemoModel(4, "Japan", R.mipmap.ic_launcher));
        demoModels.add(new DemoModel(5, "Germany", R.mipmap.ic_launcher));
        demoModels.add(new DemoModel(6, "France", R.mipmap.ic_launcher));
        demoModels.add(new DemoModel(7, "Brazil", R.mipmap.ic_launcher));
        demoModels.add(new DemoModel(8, "Argentina", R.mipmap.ic_launcher));
        demoModels.add(new DemoModel(9, "China", R.mipmap.ic_launcher));
        demoModels.add(new DemoModel(10, "Canada", R.mipmap.ic_launcher));
    }
}
