package com.example.actividad4_listview;

import java.util.ArrayList;

public class ListaDataHelper {
    public static ArrayList<ListViewItem> provideItems(){
        ArrayList<ListViewItem> list = new ArrayList<>();

        list.add(new ListViewItem(R.drawable.android,"android", android.R.color.holo_green_dark));
        list.add(new ListViewItem(R.drawable.child_care,"child care", android.R.color.holo_blue_dark));
        list.add(new ListViewItem(R.drawable.direction_bike_,"directions bike", android.R.color.holo_blue_light));
        list.add(new ListViewItem(R.drawable.directions_subway,"direction subway", android.R.color.holo_green_light));
        list.add(new ListViewItem(R.drawable.airport,"local airport", android.R.color.holo_orange_dark));
        list.add(new ListViewItem(R.drawable.notifications_active,"notifications active", android.R.color.holo_orange_light));
        list.add(new ListViewItem(R.drawable.pan_tool,"pan tol", android.R.color.holo_red_dark));
        list.add(new ListViewItem(R.drawable.record_voice_over,"record voice over", android.R.color.holo_red_light));
        list.add(new ListViewItem(R.drawable.wb_sunny,"wb sunny", android.R.color.holo_purple));



        return list;
    }
}

