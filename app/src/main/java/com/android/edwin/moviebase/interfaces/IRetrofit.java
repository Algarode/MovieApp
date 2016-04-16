package com.android.edwin.moviebase.interfaces;

import com.android.edwin.moviebase.domain.Movie;
import com.android.edwin.moviebase.util.Constants;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Edwin on 2-4-2016.
 */
public interface IRetrofit {

    @GET("/discover/movie?sort_by=popularity.desc" + Constants.API_PARAM)
    Call<List<Movie>> getMovies();

}
