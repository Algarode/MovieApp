package com.android.edwin.moviebase.activities;

import android.support.v7.app.AppCompatActivity;
import com.android.edwin.moviebase.interfaces.IRetrofit;
import com.android.edwin.moviebase.util.Constants;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Edwin on 2-4-2016.
 */
public class BaseActivity extends AppCompatActivity {

    public IRetrofit getRetrofit() {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(Constants.BASE_URL)
                .build();
        return retrofit.create(IRetrofit.class);
    }

}
