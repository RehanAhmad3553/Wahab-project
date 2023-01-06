package com.example.framwork_tasks.FragmentModel;

public class FragmentModel {

    private String Itemname;
    private String date;
    private int image;

    public FragmentModel(String itemname, String date, int image) {
        Itemname = itemname;
        this.date = date;
        this.image = image;
    }

    public String getItemname() {
        return Itemname;
    }

    public String getDate() {
        return date;
    }

    public int getImage() {
        return image;
    }
}
