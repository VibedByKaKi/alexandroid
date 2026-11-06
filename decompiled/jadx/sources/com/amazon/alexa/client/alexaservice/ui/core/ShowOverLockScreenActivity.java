package com.amazon.alexa.client.alexaservice.ui.core;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ShowOverLockScreenActivity extends Activity {
    private static final String TAG = "ShowOverLockScreenActivity";
    private static final int WINDOW_FLAGS = 6816768;
    private KeyguardManager keyguardManager;

    private void attemptUnlock() {
        if (this.keyguardManager.isKeyguardLocked()) {
            setShowWhenLocked(true);
            setTurnScreenOn(true);
            this.keyguardManager.requestDismissKeyguard(this, null);
        }
    }

    private Intent getPendingIntent() {
        Intent intent = getIntent();
        if (intent == null) {
            return null;
        }
        return (Intent) intent.getParcelableExtra("intent");
    }

    private void launchIntent() {
        Intent pendingIntent = getPendingIntent();
        if (pendingIntent != null) {
            try {
                startActivity(pendingIntent);
            } catch (ActivityNotFoundException e) {
                Log.w(TAG, "Activity not found: " + e.getMessage());
            }
        }
        finish();
    }

    private void preventActivityAnimation() {
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        preventActivityAnimation();
        this.keyguardManager = (KeyguardManager) getSystemService("keyguard");
        attemptUnlock();
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        launchIntent();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        preventActivityAnimation();
    }
}
