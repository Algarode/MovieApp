package com.android.edwin.moviebase.adapters;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.android.edwin.moviebase.domain.Movie;

/**
 * Created by Edwin on 30-3-2016.
 */
public class ListAdapter extends ArrayAdapter<Movie> {

    public ListAdapter(Context context, int resource) {
        super(context, resource);
    }

}
