package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import com.amazon.whisperjoin.util.FireOSUtil;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ZeroTouchProvisioningModule_ProvidesFireOSUtilFactory implements Factory<FireOSUtil> {
    private final ZeroTouchProvisioningModule module;

    public ZeroTouchProvisioningModule_ProvidesFireOSUtilFactory(ZeroTouchProvisioningModule zeroTouchProvisioningModule) {
        this.module = zeroTouchProvisioningModule;
    }

    public static ZeroTouchProvisioningModule_ProvidesFireOSUtilFactory create(ZeroTouchProvisioningModule zeroTouchProvisioningModule) {
        return new ZeroTouchProvisioningModule_ProvidesFireOSUtilFactory(zeroTouchProvisioningModule);
    }

    public static FireOSUtil providesFireOSUtil(ZeroTouchProvisioningModule zeroTouchProvisioningModule) {
        return (FireOSUtil) Preconditions.checkNotNull(zeroTouchProvisioningModule.providesFireOSUtil(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public FireOSUtil get() {
        return providesFireOSUtil(this.module);
    }
}
