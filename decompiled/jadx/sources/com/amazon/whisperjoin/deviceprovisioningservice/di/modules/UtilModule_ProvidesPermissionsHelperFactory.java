package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import android.content.Context;
import com.amazon.whisperjoin.deviceprovisioningservice.util.PermissionsHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final class UtilModule_ProvidesPermissionsHelperFactory implements Factory<PermissionsHelper> {
    private final Provider<Context> contextProvider;
    private final UtilModule module;

    public UtilModule_ProvidesPermissionsHelperFactory(UtilModule utilModule, Provider<Context> provider) {
        this.module = utilModule;
        this.contextProvider = provider;
    }

    public static UtilModule_ProvidesPermissionsHelperFactory create(UtilModule utilModule, Provider<Context> provider) {
        return new UtilModule_ProvidesPermissionsHelperFactory(utilModule, provider);
    }

    public static PermissionsHelper providesPermissionsHelper(UtilModule utilModule, Context context) {
        return (PermissionsHelper) Preconditions.checkNotNull(utilModule.providesPermissionsHelper(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // javax.inject.Provider
    public PermissionsHelper get() {
        return providesPermissionsHelper(this.module, this.contextProvider.get());
    }
}
