package com.amazon.alexa.handsfree.settings.voxsettings;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import com.amazon.alexa.handsfree.settings.contract.handsfreesettings.PreferenceCallback;
import com.amazon.alexa.handsfree.settings.contract.handsfreesettings.ResponsePreferenceCallback;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class SetLockScreenValueResultReceiver extends ResultReceiver {
    private static final String TAG = "SetLockScreenValueResultReceiver";
    private final boolean mBlockSensitiveRequest;
    private final PreferenceCallback mPreferenceCallback;
    private final ResponsePreferenceCallback mResponsePreferenceCallback;

    public SetLockScreenValueResultReceiver(@NonNull ResponsePreferenceCallback responsePreferenceCallback) {
        super(new Handler(Looper.getMainLooper()));
        this.mResponsePreferenceCallback = responsePreferenceCallback;
        this.mPreferenceCallback = null;
        this.mBlockSensitiveRequest = true;
    }

    public PreferenceCallback getPreferenceCallback() {
        return this.mPreferenceCallback;
    }

    public ResponsePreferenceCallback getResponsePreferenceCallback() {
        return this.mResponsePreferenceCallback;
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i, Bundle bundle) {
        if (this.mBlockSensitiveRequest) {
            String string = bundle.getString(VoxSettingsRequestHandler.SHOW_ON_LOCKSCREEN_PREF_VALUE_KEY);
            if (i == 200) {
                Log.i(TAG, "Show on lockscreen preference value set correctly. Value: " + string);
                this.mResponsePreferenceCallback.onPreferenceChanged(string);
                return;
            }
            if (i != 500) {
                Log.w(TAG, "Unknown result code in result receiver: " + i);
                return;
            }
            Log.w(TAG, "Failed to set Show on lockscreen preference value, using last stored local value: " + string);
            this.mResponsePreferenceCallback.onPreferenceChanged(string);
            return;
        }
        boolean z = bundle.getBoolean(VoxSettingsRequestHandler.SHOW_ON_LOCKSCREEN_PREF_KEY);
        if (i == 200) {
            Log.i(TAG, "Show on lockscreen preference set correctly. Value: " + z);
            this.mPreferenceCallback.onPreferenceChanged(z);
            return;
        }
        if (i != 500) {
            Log.w(TAG, "Unknown result code in result receiver: " + i);
            return;
        }
        Log.w(TAG, "Failed to set Show on lockscreen preference, using last stored local value: " + z);
        this.mPreferenceCallback.onPreferenceChanged(z);
    }

    public SetLockScreenValueResultReceiver(@NonNull PreferenceCallback preferenceCallback) {
        super(new Handler(Looper.getMainLooper()));
        this.mPreferenceCallback = preferenceCallback;
        this.mResponsePreferenceCallback = null;
        this.mBlockSensitiveRequest = false;
    }
}
