package com.android.edwin.moviebase.activities;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.edwin.moviebase.R;
import com.android.edwin.moviebase.domain.Movie;
import com.android.edwin.moviebase.util.Constants;
import com.squareup.picasso.Picasso;

public class DetailActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Toolbar toolbar = (Toolbar) findViewById(R.id.MyToolbar);
        setSupportActionBar(toolbar);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        Movie movie = (Movie) getIntent().getSerializableExtra("movieObject");

        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapse_toolbar);
        collapsingToolbarLayout.setTitle(movie.getTitle());
        collapsingToolbarLayout.setCollapsedTitleTextColor(getResources().getColor(R.color.white));
        collapsingToolbarLayout.setExpandedTitleColor(getResources().getColor(R.color.white));

        ImageView imageView = (ImageView) findViewById(R.id.ctb_iv);
        Picasso.with(this).load(Constants.IMAGE_PATH + movie.getBackdropPath()).into(imageView);

        TextView tvReleaseDate = (TextView) findViewById(R.id.tvReleaseDate);
        tvReleaseDate.setText("Release date: " + movie.getRelease_date());
        TextView tvDescription = (TextView) findViewById(R.id.tvDescription);
        tvDescription.setText(movie.getOverview());
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
