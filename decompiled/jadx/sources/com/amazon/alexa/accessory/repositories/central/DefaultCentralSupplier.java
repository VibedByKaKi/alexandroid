package com.amazon.alexa.accessory.repositories.central;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class DefaultCentralSupplier implements CentralSupplier {
    @Override // com.amazon.alexa.accessory.repositories.central.CentralSupplier
    @SuppressLint({"MissingPermission"})
    public String getName() {
        return BluetoothAdapter.getDefaultAdapter().getName();
    }
}
