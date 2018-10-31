package com.prabha.player.Utils;

import android.util.Log;

/**
 * Created by Prabha Raj on 8/5/2018.
 */

public class Logger {
    private static String TAG = "BOOOOOOOOOM:-";

    public static void log(String log) {
        Log.d(TAG, log);
    }

    public static void exp(String log) {
        Log.e(TAG, log);
    }
}
