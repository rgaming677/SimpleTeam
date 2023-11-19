package com.example.simple;

import java.io.Serializable;

public class JudulModel implements Serializable {
    public String judul;

    public JudulModel(String judul) {
        this.judul = judul;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
}

