package com.amazon.comms.calling.sdk;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class NewCallingAPIProviderImpl_Factory implements Factory<NewCallingAPIProviderImpl> {
    private final Provider<Context> contextProvider;

    public NewCallingAPIProviderImpl_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static NewCallingAPIProviderImpl_Factory create(Provider<Context> provider) {
        return new NewCallingAPIProviderImpl_Factory(provider);
    }

    public static NewCallingAPIProviderImpl newInstance(Context context) {
        return new NewCallingAPIProviderImpl(context);
    }

    @Override // javax.inject.Provider
    public NewCallingAPIProviderImpl get() {
        return newInstance(this.contextProvider.get());
    }
}
