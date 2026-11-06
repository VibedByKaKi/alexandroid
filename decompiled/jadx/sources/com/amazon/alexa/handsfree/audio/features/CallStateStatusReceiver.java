package com.amazon.alexa.handsfree.audio.features;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.VisibleForTesting;
import androidx.autofill.HintConstants;
import androidx.core.content.ContextCompat;
import com.amazon.alexa.handsfree.protocols.utils.Log;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class CallStateStatusReceiver {
    private static final int API_31 = 31;
    private static final String TAG = "CallStateStatusReceiver";
    private static CallStateStatusReceiver instance;
    private final Callback callback;
    private final Context context;
    private boolean registered;
    private final TelephonyManager telephonyManager;
    private final CallStateBroadcastReceiver callStateBroadcastReceiver = new CallStateBroadcastReceiver();
    private final IntentFilter intentFilter = new IntentFilter("android.intent.action.PHONE_STATE");
    private final Object lock = new Object();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class CallStateBroadcastReceiver extends BroadcastReceiver {
        public CallStateBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            synchronized (CallStateStatusReceiver.this.lock) {
                try {
                    boolean equals = intent.getAction().equals("android.intent.action.NEW_OUTGOING_CALL");
                    CallStateStatusReceiver callStateStatusReceiver = CallStateStatusReceiver.this;
                    if (equals) {
                        callStateStatusReceiver.callback.onCallStateReceived(Boolean.TRUE);
                    } else {
                        callStateStatusReceiver.callback.onCallStateReceived(CallStateStatusReceiver.this.getCurrentCallStatus());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Callback {
        void onCallStateReceived(Boolean bool);
    }

    public CallStateStatusReceiver(Context context, Callback callback) {
        this.context = context;
        this.telephonyManager = (TelephonyManager) context.getSystemService(HintConstants.AUTOFILL_HINT_PHONE);
        this.callback = callback;
    }

    public static CallStateStatusReceiver getInstance(Context context, Callback callback) {
        if (instance == null) {
            instance = new CallStateStatusReceiver(context, callback);
        }
        return instance;
    }

    public Boolean activate() {
        Boolean currentCallStatus;
        synchronized (this.lock) {
            try {
                if (this.registered) {
                    throw new RuntimeException("Can't activate before deactivating if active");
                }
                this.registered = true;
                currentCallStatus = getCurrentCallStatus();
                this.context.registerReceiver(this.callStateBroadcastReceiver, this.intentFilter);
            } catch (Throwable th) {
                throw th;
            }
        }
        return currentCallStatus;
    }

    public void deactivate() {
        synchronized (this.lock) {
            try {
                if (this.registered) {
                    this.registered = false;
                    this.context.unregisterReceiver(this.callStateBroadcastReceiver);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    public Boolean getCurrentCallStatus() {
        if (Build.VERSION.SDK_INT < 31 || ContextCompat.checkSelfPermission(this.context, "android.permission.READ_PHONE_STATE") == 0) {
            int callState = this.telephonyManager.getCallState();
            return callState != 1 ? callState != 2 ? Boolean.FALSE : Boolean.TRUE : Boolean.TRUE;
        }
        Log.d(TAG, "READ_PHONE_STATE is not grated");
        return Boolean.FALSE;
    }
}
