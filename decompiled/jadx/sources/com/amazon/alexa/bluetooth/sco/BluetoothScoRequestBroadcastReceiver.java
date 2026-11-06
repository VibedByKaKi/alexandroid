package com.amazon.alexa.bluetooth.sco;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.ConditionVariable;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class BluetoothScoRequestBroadcastReceiver extends BroadcastReceiver {

    @VisibleForTesting
    static final String SAMSUNG_SCO_ERROR_STATE = "SAMSUNG_SCO_ERROR_STATE";

    @VisibleForTesting
    static final String SCO_ERROR_STATE = "SCO_ERROR_STATE";
    private static final String TAG = "BluetoothScoRequestBroadcastReceiver";
    private final Context context;
    private final DeviceInformation deviceInformation;
    private boolean hasDisconnected;
    private boolean hasHandledSamsungBug;
    private boolean isInSco;
    private volatile boolean isRegistered;
    private final ScoMetrics scoMetrics;
    private final ConditionVariable scoRequestConditionVariable;

    public BluetoothScoRequestBroadcastReceiver(Context context, ConditionVariable conditionVariable, DeviceInformation deviceInformation, ScoMetrics scoMetrics) {
        this.context = context;
        this.scoRequestConditionVariable = conditionVariable;
        this.deviceInformation = deviceInformation;
        this.scoMetrics = scoMetrics;
    }

    private void setBluetoothSco(Intent intent) {
        this.isInSco = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1) == 1;
    }

    public boolean isHasDisconnected() {
        return this.hasDisconnected;
    }

    public boolean isInSco() {
        return this.isInSco;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
            int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
            if (intExtra == 0) {
                this.isInSco = false;
                this.hasHandledSamsungBug = false;
                this.hasDisconnected = true;
                this.scoRequestConditionVariable.open();
                return;
            }
            if (intExtra == 1) {
                this.isInSco = true;
                this.hasHandledSamsungBug = false;
                this.hasDisconnected = false;
                this.scoRequestConditionVariable.open();
                return;
            }
            if (intExtra != 2) {
                if (this.hasHandledSamsungBug || !this.deviceInformation.isSamsungAndAndroidQ()) {
                    Log.e(TAG, "Error SCO State");
                    ScoMetrics scoMetrics = this.scoMetrics;
                    if (scoMetrics != null) {
                        scoMetrics.recordCount(SCO_ERROR_STATE, 1);
                    }
                    this.scoRequestConditionVariable.open();
                    return;
                }
                Log.i(TAG, "Entered error state on Samsung phone running Android 10, treating as connecting...");
                this.hasHandledSamsungBug = true;
                ScoMetrics scoMetrics2 = this.scoMetrics;
                if (scoMetrics2 != null) {
                    scoMetrics2.recordCount(SAMSUNG_SCO_ERROR_STATE, 1);
                }
            }
        }
    }

    public void register() {
        IntentFilter m = ErrorUtils$$ExternalSyntheticOutline0.m("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
        int i = Build.VERSION.SDK_INT;
        Context context = this.context;
        Intent registerReceiver = i >= 34 ? context.registerReceiver(this, m, 4) : context.registerReceiver(this, m);
        this.isRegistered = true;
        if (registerReceiver != null) {
            setBluetoothSco(registerReceiver);
        }
    }

    @VisibleForTesting
    public void setIsInSco(boolean z) {
        this.isInSco = z;
    }

    public void unregister() {
        if (this.isRegistered) {
            this.isRegistered = false;
            this.context.unregisterReceiver(this);
        }
    }
}
