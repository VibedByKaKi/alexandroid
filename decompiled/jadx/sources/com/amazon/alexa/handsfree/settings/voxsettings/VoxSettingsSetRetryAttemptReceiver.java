package com.amazon.alexa.handsfree.settings.voxsettings;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentsProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.settings.dependencies.FalcoAlexaAppSettingsMediatorComponent;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VoxSettingsSetRetryAttemptReceiver extends BroadcastReceiver {
    private static final String TAG = "VoxSettingsRetryRcvr";

    @Inject
    VoxSettingsEnqueuer mEnqueuer;

    @Inject
    Initializer mInitializer;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ((FalcoAlexaAppSettingsMediatorComponent) AhfComponentsProvider.getComponent(context, FalcoAlexaAppSettingsMediatorComponent.class)).inject(this);
        if (intent.getExtras() != null && intent.hasExtra("retryAttempt")) {
            this.mInitializer.initialize(context);
            this.mEnqueuer.syncShowOnLockscreenPrefWithBundle(context, intent.getExtras());
        } else {
            Log.w(TAG, "Intent with no retry information, ignoring: " + intent);
        }
    }
}
