package com.amazon.deecomms.core;

import android.telecom.PhoneAccount;
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
public final class TelecomModule_ProvidesPhoneAccountFactory implements Factory<PhoneAccount> {
    private final TelecomModule module;
    private final Provider<PhoneAccountHandle> phoneAccountHandleProvider;

    public TelecomModule_ProvidesPhoneAccountFactory(TelecomModule telecomModule, Provider<PhoneAccountHandle> provider) {
        this.module = telecomModule;
        this.phoneAccountHandleProvider = provider;
    }

    public static TelecomModule_ProvidesPhoneAccountFactory create(TelecomModule telecomModule, Provider<PhoneAccountHandle> provider) {
        return new TelecomModule_ProvidesPhoneAccountFactory(telecomModule, provider);
    }

    public static PhoneAccount providesPhoneAccount(TelecomModule telecomModule, PhoneAccountHandle phoneAccountHandle) {
        return (PhoneAccount) Preconditions.checkNotNullFromProvides(telecomModule.providesPhoneAccount(phoneAccountHandle));
    }

    @Override // javax.inject.Provider
    public PhoneAccount get() {
        return providesPhoneAccount(this.module, this.phoneAccountHandleProvider.get());
    }
}
