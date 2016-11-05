package id.sch.smktelkom_mlg.learn.recyclerview3.model;

import java.io.Serializable;

/**
 * Created by WINDOWS 8.1 on 4/11/2016.
 */

public class hotel implements Serializable {
    public String judul;
    public String deskripsi;
    public String detail;
    public String lokasi;
    public String foto;

    public hotel(String judul,
                 String deskripsi,
                 String detail,
                 String lokasi,
                 String foto) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.detail = detail;
        this.lokasi = lokasi;
        this.foto = foto;
    }
}

