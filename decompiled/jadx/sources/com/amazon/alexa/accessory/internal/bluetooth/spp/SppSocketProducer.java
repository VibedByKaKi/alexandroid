package com.amazon.alexa.accessory.internal.bluetooth.spp;

import android.bluetooth.BluetoothSocket;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface SppSocketProducer {
    BluetoothSocket createAndConnectSocket(String str, UUID uuid) throws IOException;

    @Nullable
    BluetoothSocket getAndRemoveCachedConnectedSocket(String str);
}
