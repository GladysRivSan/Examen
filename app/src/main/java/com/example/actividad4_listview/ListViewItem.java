package com.example.actividad4_listview;

public class ListViewItem {

    private int imageResource;
    private String title;
    private int color;

    public ListViewItem(int imageResource, String title, int color) {
        this.imageResource = imageResource;
        this.title = title;
        this.color = color;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public int getColor() {
        return color;
    }
}
