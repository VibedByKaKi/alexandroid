package com.amazon.deecomms.core;

import android.content.Context;
import android.telecom.PhoneAccountHandle;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class TelecomModule_ProvidesPhoneAccountHandleFactory implements Factory<PhoneAccountHandle> {
    private final Provider<Context> contextProvider;
    private final TelecomModule module;

    public TelecomModule_ProvidesPhoneAccountHandleFactory(TelecomModule telecomModule, Provider<Context> provider) {
        this.module = telecomModule;
        this.contextProvider = provider;
    }

    public static TelecomModule_ProvidesPhoneAccountHandleFactory create(TelecomModule telecomModule, Provider<Context> provider) {
        return new TelecomModule_ProvidesPhoneAccountHandleFactory(telecomModule, provider);
    }

    public static PhoneAccountHandle providesPhoneAccountHandle(TelecomModule telecomModule, Context context) {
        return (PhoneAccountHandle) Preconditions.checkNotNullFromProvides(telecomModule.providesPhoneAccountHandle(context));
    }

    @Override // javax.inject.Provider
    public PhoneAccountHandle get() {
        return providesPhoneAccountHandle(this.module, this.contextProvider.get());
    }
}
