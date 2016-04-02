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

    @GET("movie/{name}")
    Call<Movie> getMovie(@Path("name") String name);

    @GET("movies")
    Call<List<Movie>> getMovies();

}
