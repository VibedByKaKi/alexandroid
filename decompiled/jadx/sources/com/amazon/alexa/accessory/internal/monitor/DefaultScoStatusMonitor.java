package com.amazon.alexa.accessory.internal.monitor;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import androidx.core.content.ContextCompat;
import com.amazon.alexa.accessory.internal.monitor.ScoStatusMonitor;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class DefaultScoStatusMonitor implements ScoStatusMonitor {
    private static final IntentFilter INTENT_FILTER = new IntentFilter("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
    private final BluetoothScoReceiver bluetoothScoReceiver;
    private final Context context;
    private final Set<ScoStatusMonitor.Observer> observers;
    private boolean isScoConnected = false;
    private boolean isCacheCurrent = false;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class BluetoothScoReceiver extends BroadcastReceiver {
        public BluetoothScoReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
                DefaultScoStatusMonitor.this.isScoConnected = intExtra == 1;
                Iterator it2 = new HashSet(DefaultScoStatusMonitor.this.observers).iterator();
                while (it2.hasNext()) {
                    ((ScoStatusMonitor.Observer) it2.next()).onScoConnectionState(DefaultScoStatusMonitor.this.isScoConnected);
                }
                DefaultScoStatusMonitor.this.isCacheCurrent = true;
            }
        }
    }

    public DefaultScoStatusMonitor(Context context) {
        Preconditions.notNull(context, "context");
        this.context = context;
        this.observers = new HashSet();
        this.bluetoothScoReceiver = new BluetoothScoReceiver();
    }

    private void startObservingSco() {
        int i = Build.VERSION.SDK_INT;
        Context context = this.context;
        if (i >= 33) {
            ContextCompat.registerReceiver(context, this.bluetoothScoReceiver, INTENT_FILTER, 2);
        } else {
            context.registerReceiver(this.bluetoothScoReceiver, INTENT_FILTER);
        }
    }

    private void stopObservingSco() {
        this.context.unregisterReceiver(this.bluetoothScoReceiver);
        this.isCacheCurrent = false;
    }

    @Override // com.amazon.alexa.accessory.internal.monitor.ScoStatusMonitor
    public void addObserver(ScoStatusMonitor.Observer observer) {
        Preconditions.mainThread();
        Preconditions.notNull(observer, "observer");
        if (this.observers.isEmpty()) {
            startObservingSco();
        } else if (this.isCacheCurrent) {
            observer.onScoConnectionState(this.isScoConnected);
        }
        this.observers.add(observer);
    }

    @Override // com.amazon.alexa.accessory.internal.monitor.ScoStatusMonitor
    public void removeObserver(ScoStatusMonitor.Observer observer) {
        Preconditions.mainThread();
        Preconditions.notNull(observer, "observer");
        if (this.observers.remove(observer) && this.observers.isEmpty()) {
            stopObservingSco();
        }
    }
}
