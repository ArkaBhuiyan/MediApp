package com.example.maruf.e_pharma.PhysicalTracker.StepCount.StepCount.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.example.shuvo.medicare.PhysicalTracker.StepCount.StepCount.utils.StepDetectionServiceHelper;

/**
 * Receives the on shutdown broadcast and saves the counted steps.
 */
public class OnShutdownBroadcastReceiver extends BroadcastReceiver {
    private static final String LOG_CLASS = OnShutdownBroadcastReceiver.class.getName();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i(LOG_CLASS, "onReceive");
        StepDetectionServiceHelper.startPersistenceService(context);
    }
}
