package com.amazon.alexa.accessory.registration;

import com.amazon.alexa.accessory.AccessorySession;
import com.amazon.alexa.accessory.repositories.device.v2.DeviceGroup;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public interface RegistrationSupplier {
    Completable deregister(String str);

    Single<DeviceRegistration> getDeviceRegistration(String str);

    Single<DeviceRegistration> getOrCreateDeviceRegistration(AccessorySession accessorySession);

    Observable<Set<DeviceRegistration>> queryRegistrations();

    Completable retainRegistrations(List<DeviceGroup> list);
}
