package com.amazon.whisperjoin.deviceprovisioningservice.di.components;

import com.amazon.whisperjoin.deviceprovisioningservice.di.scopes.BaseScope;
import com.amazon.whisperjoin.deviceprovisioningservice.service.FFSBackgroundProvisioningServiceBinder;
import dagger.Component;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Component(dependencies = {BaseComponent.class})
@BaseScope
/* loaded from: classes20.dex */
public interface BaseDependencyInjector {
    void inject(FFSBackgroundProvisioningServiceBinder fFSBackgroundProvisioningServiceBinder);
}
