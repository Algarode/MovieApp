package com.android.edwin.moviebase.interfaces;

import com.android.edwin.moviebase.domain.Movie;
import com.android.edwin.moviebase.domain.Movies;
import com.android.edwin.moviebase.util.Constants;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Edwin on 2-4-2016.
 */
public interface IRetrofit {

    @GET("movie/{id}" + Constants.API_PARAM)
    Call<Movie> getMovie();

    @GET("discover/movie?sort_by=popularity.desc" + Constants.API_PARAM_AND)
    Call<Movies> getMovies();

}
