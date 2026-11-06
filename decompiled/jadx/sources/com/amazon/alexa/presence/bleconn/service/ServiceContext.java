package com.amazon.alexa.presence.bleconn.service;

import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothGattService;
import com.amazon.alexa.presence.library.interfaces.Supplier;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class ServiceContext {
    private final Supplier<BluetoothGattServer> server;
    private final Supplier<BluetoothGattService> serviceSupplier;

    public ServiceContext(Supplier<BluetoothGattServer> supplier, Supplier<BluetoothGattService> supplier2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(supplier2);
        this.server = supplier;
        this.serviceSupplier = supplier2;
    }

    public Supplier<BluetoothGattServer> server() {
        return this.server;
    }

    public Supplier<BluetoothGattService> service() {
        return this.serviceSupplier;
    }
}
