package com.amazon.alexa.app.notification.actions;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.NotificationManagerCompat;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class NotificationDeeplinkTrampolineActivity extends Activity {
    private static final String TAG = "NotificationDeeplinkTrampolineActivity";

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            try {
                String stringExtra = getIntent().getStringExtra(NotificationActionConstants.NOTIFICATION_REQUEST_ID_KEY);
                if (stringExtra != null) {
                    NotificationManagerCompat.from(this).cancel(stringExtra, 0);
                }
                Intent intent = (Intent) getIntent().getParcelableExtra(NotificationActionConstants.DEEPLINK_INTENT_KEY);
                if (intent != null) {
                    intent.setFlags(335544320);
                    startActivity(intent);
                } else {
                    Log.e(TAG, "No deeplink intent provided");
                }
                finish();
            } catch (Exception e) {
                Log.e(TAG, "Error in trampoline activity", e);
                finish();
            }
        } catch (Throwable th) {
            finish();
            throw th;
        }
    }
}
