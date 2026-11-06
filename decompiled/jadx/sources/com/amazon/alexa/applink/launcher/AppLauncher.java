package com.amazon.alexa.applink.launcher;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class AppLauncher {
    private static final String TAG = "AppLauncher";
    private final Context context;

    public AppLauncher(@NonNull Context context) {
        this.context = context;
    }

    public boolean launchExternalApp(@NonNull Intent intent) {
        try {
            this.context.startActivity(intent);
            return true;
        } catch (ActivityNotFoundException e) {
            Log.w(TAG, "Activity not found");
            e.getMessage();
            return false;
        }
    }
}
