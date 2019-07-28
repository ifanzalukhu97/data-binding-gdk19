package com.ifanjszalukhu.databindinggdk19;

import android.content.Context;
import android.widget.Toast;

public class ClickListeners {
    private Context context;

    ClickListeners(Context context) {
        this.context = context;
    }

    // that accept movieTitle string arguments
    public void showMovie(String movieTitle) {
        Toast.makeText(context, movieTitle, Toast.LENGTH_LONG).show();
    }
}
