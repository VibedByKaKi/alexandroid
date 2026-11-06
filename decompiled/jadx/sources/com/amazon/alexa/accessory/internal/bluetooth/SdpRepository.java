package com.amazon.alexa.accessory.internal.bluetooth;

import android.os.ParcelUuid;
import com.amazon.alexa.accessory.internal.PeripheralDevice;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface SdpRepository {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface FetchListener {
        void onError(PeripheralDevice peripheralDevice, Throwable th);

        void onSuccess(PeripheralDevice peripheralDevice, SdpRecords sdpRecords);
    }

    void cancelFetch(FetchListener fetchListener);

    void fetch(PeripheralDevice peripheralDevice, FetchListener fetchListener);

    SdpRecords getLocal(PeripheralDevice peripheralDevice);

    void getOrFetch(PeripheralDevice peripheralDevice, FetchListener fetchListener, ParcelUuid parcelUuid);
}
