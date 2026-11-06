package com.amazon.alexa.voice.ra;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class RaDeepLinkBroadcastReceiver extends BroadcastReceiver {
    public static final String ACTION_DEEPLINK_PROXY = "action.alexa_app_deeplink_proxy";
    private static final int RECEIVER_NOT_EXPORTED = 4;
    private static final String TAG = "RaDeepLinkBroadcastReceiver";
    private boolean isRegistered = false;
    private final RaFeatureEnabler raFeatureEnabler;

    public RaDeepLinkBroadcastReceiver(RaFeatureEnabler raFeatureEnabler) {
        this.raFeatureEnabler = raFeatureEnabler;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"action.alexa_app_deeplink_proxy".equals(intent.getAction())) {
            Log.w(TAG, "Unsupported intent action");
            return;
        }
        if (!this.raFeatureEnabler.isEnabled()) {
            Log.w(TAG, "SkippingDeeplink request as the feature is not enabled");
            return;
        }
        intent.setAction("android.intent.action.VIEW");
        intent.setData((Uri) intent.getParcelableExtra("data"));
        intent.setPackage(context.getPackageName());
        context.startActivity(intent);
    }

    public void register(Context context) {
        if (this.isRegistered) {
            return;
        }
        Log.w(TAG, "Registering for broadcast");
        LocalBroadcastManager.getInstance(context).registerReceiver(this, new IntentFilter("action.alexa_app_deeplink_proxy"));
        this.isRegistered = true;
    }

    public void unregister(Context context) {
        if (this.isRegistered) {
            Log.w(TAG, "deRegistering for broadcast");
            LocalBroadcastManager.getInstance(context).unregisterReceiver(this);
            this.isRegistered = false;
        }
    }
}
