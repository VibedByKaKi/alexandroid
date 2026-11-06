package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import com.amazon.whisperjoin.deviceprovisioningservice.workflow.zerotouch.ZeroTouchWorkflowFactory;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class ZeroTouchProvisioningModule_ProvidesZeroTouchWorkflowFactoryFactory implements Factory<ZeroTouchWorkflowFactory> {
    private final ZeroTouchProvisioningModule module;

    public ZeroTouchProvisioningModule_ProvidesZeroTouchWorkflowFactoryFactory(ZeroTouchProvisioningModule zeroTouchProvisioningModule) {
        this.module = zeroTouchProvisioningModule;
    }

    public static ZeroTouchProvisioningModule_ProvidesZeroTouchWorkflowFactoryFactory create(ZeroTouchProvisioningModule zeroTouchProvisioningModule) {
        return new ZeroTouchProvisioningModule_ProvidesZeroTouchWorkflowFactoryFactory(zeroTouchProvisioningModule);
    }

    public static ZeroTouchWorkflowFactory providesZeroTouchWorkflowFactory(ZeroTouchProvisioningModule zeroTouchProvisioningModule) {
        return (ZeroTouchWorkflowFactory) Preconditions.checkNotNull(zeroTouchProvisioningModule.providesZeroTouchWorkflowFactory(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public ZeroTouchWorkflowFactory get() {
        return providesZeroTouchWorkflowFactory(this.module);
    }
}
