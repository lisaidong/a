package com.example.anh02.doan1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FoodAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<FoodList> foodList;

    public FoodAdapter(Context context, int layout, List<FoodList> foodList) {
        this.context = context;
        this.layout = layout;
        this.foodList = foodList;
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(layout, null);
        TextView txtTen = (TextView) view.findViewById(R.id.textTen);
        ImageView imgHinh = (ImageView) view.findViewById(R.id.imageViewHinh);
        FoodList foodL = foodList.get(i);
        txtTen.setText(foodL.getTen());
        imgHinh.setImageResource(foodL.getHinh());
        return view;
    }
}
