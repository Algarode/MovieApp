package com.android.edwin.moviebase.interfaces;

import com.android.edwin.moviebase.domain.Movies;
import com.android.edwin.moviebase.util.Constants;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Edwin on 2-4-2016.
 */
public interface IRetrofit {

    @GET("discover/movie?primary_release_date.gte=2016"+ Constants.API_PARAM_AND)
    Call<Movies> getMovies();

}
