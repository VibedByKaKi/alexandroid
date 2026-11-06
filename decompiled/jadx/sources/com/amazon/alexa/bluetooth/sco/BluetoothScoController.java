package com.amazon.alexa.bluetooth.sco;

import android.content.Context;
import android.media.AudioManager;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class BluetoothScoController {

    @VisibleForTesting
    static final long REQUEST_TIMEOUT_MILLISECONDS = 20000;

    @VisibleForTesting
    static final long SAMSUNG_REQUEST_TIMEOUT_MILLISECONDS = 5000;
    private static final String TAG = "BluetoothScoController";

    @VisibleForTesting
    static final String TIME_TO_ENTER_SCO = "TIME_TO_ENTER_SCO";

    @VisibleForTesting
    static final String TIME_TO_EXIT_SCO = "TIME_TO_EXIT_SCO";
    private final AudioManager audioManager;
    private final Context context;
    private final DeviceInformation deviceInformation;
    private boolean hasRequestedSco;
    private final ScoMetrics scoMetrics;
    private final BluetoothScoRequestBroadcastReceiver scoRequestBroadcastReceiver;
    private final ConditionVariable scoRequestConditionVariable;
    private final TelephonyManager telephonyManager;
    private final long timeoutValue;

    @VisibleForTesting
    public BluetoothScoController(AudioManager audioManager, Context context, ConditionVariable conditionVariable, TelephonyManager telephonyManager, DeviceInformation deviceInformation, ScoMetrics scoMetrics) {
        this.audioManager = audioManager;
        this.scoRequestConditionVariable = conditionVariable;
        this.telephonyManager = telephonyManager;
        this.deviceInformation = deviceInformation;
        this.scoRequestBroadcastReceiver = new BluetoothScoRequestBroadcastReceiver(context, conditionVariable, deviceInformation, scoMetrics);
        this.timeoutValue = deviceInformation.isSamsungAndAndroidQ() ? SAMSUNG_REQUEST_TIMEOUT_MILLISECONDS : REQUEST_TIMEOUT_MILLISECONDS;
        this.scoMetrics = scoMetrics;
        this.context = context;
    }

    private void cleanUpState() {
        setHasRequestedSco(false);
        this.audioManager.stopBluetoothSco();
    }

    @VisibleForTesting
    public boolean hasDisconnected() {
        return this.scoRequestBroadcastReceiver.isHasDisconnected();
    }

    @VisibleForTesting
    public boolean hasRequestedSco() {
        return this.hasRequestedSco;
    }

    @VisibleForTesting
    public boolean isInCall() {
        return (this.deviceInformation.getVersionSdkInt() < 31 || this.context.checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) && this.telephonyManager.getCallState() != 0;
    }

    @VisibleForTesting
    public boolean isInSco() {
        return this.scoRequestBroadcastReceiver.isInSco();
    }

    public void register() {
        this.scoRequestBroadcastReceiver.register();
    }

    public void setHasRequestedSco(boolean z) {
        this.hasRequestedSco = z;
    }

    public synchronized void startSco() {
        this.scoRequestConditionVariable.close();
        if (isInCall()) {
            Log.w(TAG, "Attempted to start SCO while in call");
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!hasRequestedSco()) {
            setHasRequestedSco(true);
            this.audioManager.startBluetoothSco();
        }
        if (!isInSco()) {
            if (!this.scoRequestConditionVariable.block(this.timeoutValue)) {
                cleanUpState();
            } else if (isInSco()) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                ScoMetrics scoMetrics = this.scoMetrics;
                if (scoMetrics != null) {
                    scoMetrics.recordTime(TIME_TO_ENTER_SCO, elapsedRealtime2);
                }
            } else if (hasDisconnected()) {
                setHasRequestedSco(false);
            } else {
                cleanUpState();
            }
        }
    }

    public synchronized void stopSco() {
        if (isInCall()) {
            Log.w(TAG, "Attempted to stop SCO while in call");
            return;
        }
        if (isInSco() && hasRequestedSco()) {
            this.scoRequestConditionVariable.close();
            setHasRequestedSco(false);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.audioManager.stopBluetoothSco();
            if (this.scoRequestConditionVariable.block(this.timeoutValue)) {
                long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
                ScoMetrics scoMetrics = this.scoMetrics;
                if (scoMetrics != null) {
                    scoMetrics.recordTime(TIME_TO_EXIT_SCO, elapsedRealtime2);
                }
            } else {
                Log.w(TAG, "Stopping SCO did not complete within the expected timeframe.");
            }
        }
    }

    public void tearDown() {
        this.scoRequestBroadcastReceiver.unregister();
    }

    public BluetoothScoController(AudioManager audioManager, TelephonyManager telephonyManager, Context context, @Nullable ScoMetrics scoMetrics) {
        this(audioManager, context, new ConditionVariable(false), telephonyManager, new DeviceInformation(), scoMetrics);
    }

    public BluetoothScoController(AudioManager audioManager, TelephonyManager telephonyManager, Context context) {
        this(audioManager, telephonyManager, context, null);
    }
}
