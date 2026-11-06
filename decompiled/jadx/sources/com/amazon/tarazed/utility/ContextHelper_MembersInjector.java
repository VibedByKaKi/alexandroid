package com.amazon.tarazed.utility;

import dagger.MembersInjector;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final class ContextHelper_MembersInjector implements MembersInjector<ContextHelper> {
    private final Provider<DeviceInfoUtility> p0Provider;

    public ContextHelper_MembersInjector(Provider<DeviceInfoUtility> provider) {
        this.p0Provider = provider;
    }

    public static MembersInjector<ContextHelper> create(Provider<DeviceInfoUtility> provider) {
        return new ContextHelper_MembersInjector(provider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(ContextHelper contextHelper) {
        contextHelper.setDeviceInfoUtility$TarazedAndroidLibrary_release(this.p0Provider.get());
    }
}
