package com.amazon.alexa.accessory.transport.gatt;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import com.amazon.alexa.accessory.internal.util.IOUtils;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.io.Buffer;
import com.amazon.alexa.accessory.io.Sink;
import java.io.IOException;
import java.util.Arrays;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
final class GattSink implements Sink {
    private final BluetoothGatt bluetoothGatt;
    private final Buffer buffer;
    private Throwable cause;
    private final BluetoothGattCharacteristic characteristic;
    private volatile boolean closed;
    private final Object monitor = new Object();
    private final long timeoutMillis;

    public GattSink(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, long j) {
        this.bluetoothGatt = bluetoothGatt;
        this.characteristic = bluetoothGattCharacteristic;
        this.timeoutMillis = j;
        this.buffer = new Buffer(i);
    }

    @SuppressLint({"MissingPermission"})
    private void writeCharacteristic() throws IOException {
        if (this.buffer.size() == 0) {
            return;
        }
        Logger.d("Writing characteristic", this.buffer.data(), 0, this.buffer.size());
        this.characteristic.setValue(Arrays.copyOf(this.buffer.data(), this.buffer.size()));
        if (!this.bluetoothGatt.writeCharacteristic(this.characteristic)) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Failed to write Alexa accessory characteristic");
            return;
        }
        synchronized (this.monitor) {
            IOUtils.waitUntilNotified(this.monitor, this.timeoutMillis);
            Throwable th = this.cause;
            if (th != null) {
                throw new IOException(th);
            }
        }
        this.buffer.close();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        synchronized (this.monitor) {
            this.monitor.notifyAll();
        }
    }

    @Override // com.amazon.alexa.accessory.io.Sink
    public void flush() throws IOException {
        if (this.closed) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Gatt sink is closed");
        } else {
            writeCharacteristic();
        }
    }

    public void notifyCharacteristicWriteCompleted() {
        synchronized (this.monitor) {
            this.monitor.notifyAll();
        }
    }

    public void notifyCharacteristicWriteFailed(Throwable th) {
        synchronized (this.monitor) {
            this.cause = th;
            this.monitor.notifyAll();
        }
    }

    @Override // com.amazon.alexa.accessory.io.Sink
    public void write(byte[] bArr, int i, int i2) throws IOException {
        if (this.closed) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Gatt sink is closed");
            return;
        }
        int i3 = i2;
        while (i3 > 0 && !this.closed) {
            if (this.buffer.capacity() == this.buffer.size()) {
                writeCharacteristic();
            }
            int min = Math.min(this.buffer.capacity() - this.buffer.size(), i3);
            this.buffer.write(bArr, (i + i2) - i3, min);
            i3 -= min;
        }
    }
}
