package com.fissionstudios.InstaSave.Model;

import android.net.Uri;


public class Files {

    private Uri uri;
    private String name;
    private String filename;

    public Files(Uri uri, String name, String filename) {
        this.uri = uri;
        this.name = name;
        this.filename = filename;
    }

    public Files() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Uri getUri() {
        return uri;
    }
    public void setUri(Uri uri) {
        this.uri = uri;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }
}
