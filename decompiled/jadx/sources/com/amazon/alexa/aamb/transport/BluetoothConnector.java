package com.amazon.alexa.aamb.transport;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothSocket;
import android.content.Context;
import android.util.Log;
import com.amazon.alexa.aamb.Constants;
import com.amazon.alexa.aamb.transport.Transport;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class BluetoothConnector extends TransportBase {
    private static final String TAG = "BluetoothConnector";

    public BluetoothConnector(String str) {
        setTransportType(0);
        setAddress(str);
    }

    @Override // com.amazon.alexa.aamb.transport.Transport
    @SuppressLint({"MissingPermission"})
    public Transport.Connection connect(Context context) throws IOException {
        BluetoothManager bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth");
        Log.i(TAG, "to connect device address = " + this.address);
        BluetoothSocket createRfcommSocketToServiceRecord = bluetoothManager.getAdapter().getRemoteDevice(this.address).createRfcommSocketToServiceRecord(Constants.BT_AAMB_SERVICE_UUID);
        bluetoothManager.getAdapter().cancelDiscovery();
        try {
            createRfcommSocketToServiceRecord.connect();
            return new BluetoothSocketConnection(createRfcommSocketToServiceRecord);
        } catch (IOException e) {
            Log.e(TAG, "IOException: " + e.getMessage());
            try {
                createRfcommSocketToServiceRecord.close();
                return null;
            } catch (IOException unused) {
                return null;
            }
        }
    }

    @Override // com.amazon.alexa.aamb.transport.Transport
    public String getName() {
        return "bt-connector";
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
