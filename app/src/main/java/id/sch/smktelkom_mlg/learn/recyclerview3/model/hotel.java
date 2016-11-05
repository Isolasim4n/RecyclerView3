package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import android.graphics.drawable.Drawable;

/**
 * Created by WINDOWS 8.1 on 4/11/2016.
 */

public class hotel {
    public String judul;
    public String deskripsi;
    public Drawable foto;

    public hotel(String judul, String deskripsi, Drawable foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }
}

