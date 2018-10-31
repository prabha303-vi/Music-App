package com.prabha.player.BroadcastReceivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.prabha.player.Common;

/**
*Broadcast receiver to handle the plug in and plug out of the headphone.
*/

public class HeadsetPlugBroadcastReceiver extends BroadcastReceiver {
    private Common mApp;
    @Override
    public void onReceive(Context context, Intent intent) {
        mApp = (Common) context.getApplicationContext();
        if (intent.getAction().equals(Intent.ACTION_HEADSET_PLUG)) {
            int state = intent.getIntExtra("state", -1);
            Log.d("state",""+state);
            switch (state) {
                case 0:
                    mApp.getService().headsetDisconnected();
                    break;
                case 1:
                    mApp.getService().headsetIsConnected();
                    break;
                default:
                    break;
            }

        }

    }
}