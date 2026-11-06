package com.amazon.alexa.aamb.transport;

import android.bluetooth.BluetoothSocket;
import com.amazon.alexa.aamb.transport.Transport;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class BluetoothSocketConnection extends Transport.Connection {
    private final BluetoothSocket socket;

    public BluetoothSocketConnection(BluetoothSocket bluetoothSocket) throws IOException {
        this.socket = bluetoothSocket;
        this.inputStream = bluetoothSocket.getInputStream();
        this.outputStream = bluetoothSocket.getOutputStream();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.inputStream.close();
        this.outputStream.close();
        this.socket.close();
    }
}
