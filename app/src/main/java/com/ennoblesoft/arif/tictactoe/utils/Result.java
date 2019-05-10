package com.ennoblesoft.arif.tictactoe.utils;

import android.app.Activity;
import android.widget.Toast;

/**
 * Created by Arif on 3/26/2018.
 */

public class Result {
    private Activity activity;

    public Result(Activity activity) {
        this.activity = activity;
    }

    public void Result(String result) {
        Toast.makeText(activity, result, Toast.LENGTH_SHORT).show();
    }
}
