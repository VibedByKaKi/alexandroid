package com.amazon.alexa.aamb.client;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothServerSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import androidx.core.content.ContextCompat;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.io.IOException;
import java.util.UUID;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class ClientAcceptThread extends Thread {
    private static final UUID MOBILE_BRIDGE_SERVER = UUID.fromString("83471CAC-8169-4959-A9A1-0FB68A3B2AB9");
    private static final String SERVICE_NAME = "Mobile_Bridge";
    private static final String TAG = "ClientAcceptThread";
    private boolean bluetoothOff;
    private final BehaviorSubject<Boolean> connectionSubject;
    private final Context context;
    private BluetoothServerSocket mmServerSocket;
    BroadcastReceiver receiver = new BroadcastReceiver() { // from class: com.amazon.alexa.aamb.client.ClientAcceptThread.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(intent.getAction())) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                ClientAcceptThread.this.bluetoothOff = intExtra != 12;
                if (!ClientAcceptThread.this.bluetoothOff || ClientAcceptThread.this.mmServerSocket == null) {
                    return;
                }
                try {
                    ClientAcceptThread.this.mmServerSocket.close();
                    ClientAcceptThread.this.mmServerSocket = null;
                } catch (IOException e) {
                    Buffer$$ExternalSyntheticBUOutline0.m((Throwable) e);
                }
            }
        }
    };

    public ClientAcceptThread(Context context) {
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
        int i = context.getApplicationInfo().targetSdkVersion;
        BroadcastReceiver broadcastReceiver = this.receiver;
        if (i >= 33) {
            ContextCompat.registerReceiver(context, broadcastReceiver, intentFilter, 4);
        } else {
            context.registerReceiver(broadcastReceiver, intentFilter);
        }
        this.context = context;
        this.connectionSubject = BehaviorSubject.create();
    }

    private void createSocket() {
        BluetoothServerSocket bluetoothServerSocket;
        BluetoothAdapter adapter;
        try {
            adapter = ((BluetoothManager) this.context.getSystemService("bluetooth")).getAdapter();
        } catch (IOException e) {
            Log.e(TAG, "Socket's listen() method failed", e);
            bluetoothServerSocket = null;
        }
        if (adapter == null) {
            try {
                Thread.sleep(10000L);
            } catch (InterruptedException unused) {
            }
        } else {
            bluetoothServerSocket = adapter.listenUsingRfcommWithServiceRecord(SERVICE_NAME, MOBILE_BRIDGE_SERVER);
            this.mmServerSocket = bluetoothServerSocket;
        }
    }

    public void cancel() {
        try {
            BluetoothServerSocket bluetoothServerSocket = this.mmServerSocket;
            if (bluetoothServerSocket != null) {
                bluetoothServerSocket.close();
                this.mmServerSocket = null;
            }
        } catch (IOException e) {
            Log.e(TAG, "Could not close the connect socket", e);
        }
    }

    public BehaviorSubject<Boolean> getConnectionSubject() {
        return this.connectionSubject;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            if (this.bluetoothOff) {
                try {
                    Thread.sleep(10000L);
                } catch (InterruptedException unused) {
                }
            } else {
                if (this.mmServerSocket == null) {
                    createSocket();
                }
                try {
                    if (this.mmServerSocket.accept() != null) {
                        Log.i(TAG, "found new device and trigger connectionSubject");
                        this.connectionSubject.onNext(Boolean.TRUE);
                    }
                } catch (Exception e) {
                    Log.e(TAG, "Socket's accept() method failed", e);
                    cancel();
                    return;
                }
            }
        }
    }
}
