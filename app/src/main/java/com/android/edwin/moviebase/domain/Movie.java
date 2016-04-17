package com.android.edwin.moviebase.domain;

/**
 * Created by Edwin on 30-3-2016.
 */
public class Movie {

    private String title;
    private String overview;
    private String release_date;
    private int runtime;

    public Movie(String title, String overview) {
        this.title = title;
        this.overview = overview;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getTitle() {
        return title;
    }

    public void setSitle(String title) {
        this.title = title;
    }

}
