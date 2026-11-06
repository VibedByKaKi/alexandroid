package com.amazon.alexa.accessory.repositories.device.v2;

import com.amazon.alexa.accessory.protocol.Common;
import com.amazon.alexa.accessory.protocol.Device;
import com.amazon.alexa.accessory.repositories.device.DeviceFeatures;
import com.amazon.alexa.accessory.repositories.device.DeviceRepository;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface DeviceRepositoryV2 extends DeviceRepository {
    Single<DeviceFeatures> queryDeviceFeatures();

    Observable<Set<Device.DeviceInformation>> queryDeviceInformationSet();

    Single<Common.ErrorCode> requestUpdateDeviceInformation(String str, int i);
}
