package com.amazon.alexa.voice.handsfree.initialization.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.devices.DeviceInformation;
import com.amazon.alexa.handsfree.devices.DeviceTypeInformationProvider;
import com.amazon.alexa.handsfree.protocols.Initializer;
import com.amazon.alexa.handsfree.protocols.InitializerProvider;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class InitializationBootCompleteReceiver extends BroadcastReceiver {
    private static final int API_36 = 36;
    private static final String TAG = "InitializationBootCompleteReceiver";
    private final Initializer mInitializer;

    public InitializationBootCompleteReceiver() {
        this(InitializerProvider.getInitializer());
    }

    @VisibleForTesting
    public DeviceInformation getDeviceInformation(@NonNull Context context) {
        return DeviceTypeInformationProvider.getInstance(context).getSupportedDeviceInformation(context);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(@NonNull Context context, @NonNull Intent intent) {
        if (!"android.intent.action.BOOT_COMPLETED".equals(intent.getAction()) || getDeviceInformation(context) == null || Build.VERSION.SDK_INT >= 36) {
            return;
        }
        Log.i(TAG, "calling initialize() on boot complete");
        this.mInitializer.initialize(context);
    }

    @VisibleForTesting
    public InitializationBootCompleteReceiver(@NonNull Initializer initializer) {
        this.mInitializer = initializer;
    }
}
