package com.amazon.alexa.matter.commissioner;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import androidx.annotation.AnyThread;
import androidx.annotation.CheckResult;
import androidx.annotation.NonNull;
import com.amazon.alexa.matter.eventbus.schema.SetupPayload;
import io.reactivex.rxjava3.core.Single;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes14.dex */
public interface BluetoothManager {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BluetoothConnection implements Closeable {

        @NonNull
        private final BluetoothGatt mBluetoothGatt;
        private final long mID;

        public BluetoothConnection(long j, @NonNull BluetoothGatt bluetoothGatt) {
            this.mID = j;
            this.mBluetoothGatt = bluetoothGatt;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        @SuppressLint({"MissingPermission"})
        public void close() throws IOException {
            this.mBluetoothGatt.disconnect();
        }

        @NonNull
        public BluetoothGatt getBluetoothGatt() {
            return this.mBluetoothGatt;
        }

        public long getID() {
            return this.mID;
        }
    }

    @NonNull
    @AnyThread
    @CheckResult
    Single<BluetoothConnection> connect(@NonNull BluetoothDevice bluetoothDevice);

    @NonNull
    @AnyThread
    @CheckResult
    Single<BluetoothConnection> connect(@NonNull BluetoothDevice bluetoothDevice, long j, @NonNull TimeUnit timeUnit);

    @NonNull
    @AnyThread
    @CheckResult
    Single<BluetoothDevice> discover(@NonNull SetupPayload setupPayload);

    @NonNull
    @AnyThread
    @CheckResult
    Single<BluetoothDevice> discover(@NonNull SetupPayload setupPayload, long j, @NonNull TimeUnit timeUnit);
}
