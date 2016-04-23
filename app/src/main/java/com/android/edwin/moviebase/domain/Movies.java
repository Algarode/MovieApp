package com.android.edwin.moviebase.domain;

import java.util.List;

/**
 * Created by lol_e on 16-4-2016.
 */
public class Movies {

    List<Movie> results;

    public Movies(List<Movie> movies) {
        this.results = movies;
    }

    public List<Movie> getMovies() {
        return results;
    }

    public void setMovies(List<Movie> movies) {
        this.results = movies;
    }

}
