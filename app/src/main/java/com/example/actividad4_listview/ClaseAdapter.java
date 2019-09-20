package com.example.actividad4_listview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class ClaseAdapter extends BaseAdapter {

    private ArrayList<ListViewItem> items;

    public ClaseAdapter(ArrayList<ListViewItem> items) {
        this.items = items;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public ListViewItem getItem(int i) {
        return items.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view==null){
            view = LayoutInflater.from(viewGroup.getContext())
                    .inflate(R.layout.listview_item,viewGroup,false);
        }
        decorateWith(view,items.get(i));
        return view;

    }

    private void decorateWith(View view, ListViewItem listViewItem) {
        ImageView imagen = view.findViewById(R.id.imageView2);
        TextView texto = view.findViewById(R.id.textView2);
        imagen.setImageResource(listViewItem.getImageResource());
        texto.setText(listViewItem.getTitle());
        imagen.setColorFilter(ContextCompat.getColor(view.getContext(),listViewItem.getColor()));
    }
}
