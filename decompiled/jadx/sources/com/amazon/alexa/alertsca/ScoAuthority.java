package com.amazon.alexa.alertsca;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.accessory.sco.ScoPrioritizer;
import com.amazon.alexa.bluetooth.sco.BluetoothScoController;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes16.dex */
public class ScoAuthority {
    private static final int SCO_PRIORITIZER_TIMEOUT_MS = 1000;
    private static final String TAG = "ScoAuthority";
    private final BluetoothScoController bluetoothScoController;
    private final ConditionVariable conditionVariable;
    private final Object lock;
    private final Handler mainThreadHandler;
    private final ScoPrioritizer scoPrioritizer;
    private volatile boolean shouldUseSco;

    @VisibleForTesting
    public ScoAuthority(Handler handler, BluetoothScoController bluetoothScoController, ScoPrioritizer scoPrioritizer, ConditionVariable conditionVariable) {
        this.lock = new Object();
        this.bluetoothScoController = bluetoothScoController;
        this.scoPrioritizer = scoPrioritizer;
        this.conditionVariable = conditionVariable;
        this.mainThreadHandler = handler;
        bluetoothScoController.register();
    }

    public boolean shouldUseSco() {
        boolean z;
        synchronized (this.lock) {
            this.shouldUseSco = false;
            this.conditionVariable.close();
            this.mainThreadHandler.post(new Runnable() { // from class: com.amazon.alexa.alertsca.ScoAuthority.1
                @Override // java.lang.Runnable
                public void run() {
                    ScoAuthority scoAuthority = ScoAuthority.this;
                    scoAuthority.shouldUseSco = scoAuthority.scoPrioritizer.shouldUseSco();
                    ScoAuthority.this.conditionVariable.open();
                }
            });
            this.conditionVariable.block(1000L);
            z = this.shouldUseSco;
        }
        return z;
    }

    public void startScoIfNeeded() {
        if (shouldUseSco()) {
            Log.i(TAG, "Requesting SCO");
            this.bluetoothScoController.startSco();
        }
    }

    public void stopScoIfNeeded() {
        Log.i(TAG, "Stopping SCO");
        this.bluetoothScoController.stopSco();
    }

    public void teardown() {
        this.bluetoothScoController.tearDown();
    }

    @Inject
    public ScoAuthority(Context context, BluetoothScoController bluetoothScoController, ScoPrioritizer scoPrioritizer) {
        this(new Handler(context.getMainLooper()), bluetoothScoController, scoPrioritizer, new ConditionVariable());
    }
}
