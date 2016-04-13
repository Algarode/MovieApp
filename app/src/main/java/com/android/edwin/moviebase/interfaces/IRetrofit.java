package com.android.edwin.moviebase.interfaces;

import com.android.edwin.moviebase.domain.Movie;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Edwin on 2-4-2016.
 */
public interface IRetrofit {

    @GET("/movie/550")
    Call<Movie> getMovie(String name);

    @GET("/discover/movie?sort_by=popularity.desc")
    Call<List<Movie>> getMovies();

}
