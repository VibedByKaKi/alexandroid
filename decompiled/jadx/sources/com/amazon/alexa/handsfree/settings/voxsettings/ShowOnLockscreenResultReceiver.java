package com.amazon.alexa.handsfree.settings.voxsettings;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.settings.contract.handsfreesettings.PreferenceCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ShowOnLockscreenResultReceiver extends ResultReceiver {
    private static final String TAG = "ShowOnLSResultRcvr";
    private final PreferenceCallback mPreferenceCallback;

    public ShowOnLockscreenResultReceiver(@NonNull PreferenceCallback preferenceCallback) {
        super(new Handler(Looper.getMainLooper()));
        this.mPreferenceCallback = preferenceCallback;
    }

    public PreferenceCallback getPreferenceCallback() {
        return this.mPreferenceCallback;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        boolean z = bundle.getBoolean(VoxSettingsRequestHandler.SHOW_ON_LOCKSCREEN_PREF_KEY);
        if (i == 200) {
            Log.i(TAG, "Show on lockscreen preference retrieved correctly. Value: " + z);
            this.mPreferenceCallback.onPreferenceChanged(z);
            return;
        }
        if (i != 500) {
            Log.w(TAG, "Unknown result code in result receiver: " + i);
        } else {
            Log.w(TAG, "Failed to retrieve Show on lockscreen preference, using last stored local value: " + z);
            this.mPreferenceCallback.onPreferenceChanged(z);
        }
    }
}
