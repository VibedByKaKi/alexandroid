package com.amazon.deecomms.calling.impl;

import com.amazon.deecomms.calling.model.CallContext;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes5.dex */
public final class CallingAPIPopulator_Factory implements Factory<CallingAPIPopulator> {
    private final Provider<CallContext> callContextProvider;

    public CallingAPIPopulator_Factory(Provider<CallContext> provider) {
        this.callContextProvider = provider;
    }

    public static CallingAPIPopulator_Factory create(Provider<CallContext> provider) {
        return new CallingAPIPopulator_Factory(provider);
    }

    public static CallingAPIPopulator newInstance(CallContext callContext) {
        return new CallingAPIPopulator(callContext);
    }

    @Override // javax.inject.Provider
    public CallingAPIPopulator get() {
        return newInstance(this.callContextProvider.get());
    }
}
