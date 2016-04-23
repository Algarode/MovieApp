package com.android.edwin.moviebase.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.edwin.moviebase.R;
import com.android.edwin.moviebase.domain.Movie;
import com.android.edwin.moviebase.util.Constants;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Edwin on 30-3-2016.
 */
public class ListAdapter extends ArrayAdapter<Movie> {

    private List<Movie> movies;
    private Context context;

    public ListAdapter(Context context, int resource, List<Movie> movieList) {
        super(context, resource);
        this.context = context;
        this.movies = movieList;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Movie getItem(int position) {
        return movies.get(position);
    }

    @Override
    public long getItemId(int position) {
        return movies.get(position).getId();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View row = null;

        if (convertView != null) {
            row = convertView;
        } else {
            row = inflater.inflate(R.layout.list_layout, parent, false);
        }

        ImageView imageView = (ImageView) row.findViewById(R.id.ivMovieImage);
        TextView textView = (TextView) row.findViewById(R.id.tvMovieName);
        TextView textView2 = (TextView) row.findViewById(R.id.tvRating);

        Picasso.with(context).load(Constants.IMAGE_PATH + getItem(position).getPosterPath()).placeholder(R.mipmap.ic_launcher).into(imageView);
        textView.setText(getItem(position).getTitle());
        textView2.setText("Vote avg: " + getItem(position).getVoteAverage().toString());

        return row;
    }
}
