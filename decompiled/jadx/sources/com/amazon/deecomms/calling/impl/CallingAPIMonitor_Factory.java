package com.amazon.deecomms.calling.impl;

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
public final class CallingAPIMonitor_Factory implements Factory<CallingAPIMonitor> {
    private final Provider<CallingAPIPopulator> populatorProvider;

    public CallingAPIMonitor_Factory(Provider<CallingAPIPopulator> provider) {
        this.populatorProvider = provider;
    }

    public static CallingAPIMonitor_Factory create(Provider<CallingAPIPopulator> provider) {
        return new CallingAPIMonitor_Factory(provider);
    }

    public static CallingAPIMonitor newInstance(CallingAPIPopulator callingAPIPopulator) {
        return new CallingAPIMonitor(callingAPIPopulator);
    }

    @Override // javax.inject.Provider
    public CallingAPIMonitor get() {
        return newInstance(this.populatorProvider.get());
    }
}
