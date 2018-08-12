package com.tusharpatil.listviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<DemoModel> items;

    public CustomListAdapter(Context context, ArrayList<DemoModel> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.list_view_row_layout, parent, false);
        }

        DemoModel currentItem = (DemoModel) getItem(position);

        TextView txt_name = convertView.findViewById(R.id.txt_name);
        ImageView img_item = convertView.findViewById(R.id.img_item);

        txt_name.setText(currentItem.getName());
        img_item.setImageResource(currentItem.getImage());
        return convertView;
    }
}
