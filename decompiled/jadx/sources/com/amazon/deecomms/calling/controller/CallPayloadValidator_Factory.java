package com.amazon.deecomms.calling.controller;

import com.amazon.alexa.mobilytics.Mobilytics;
import com.amazon.alexa.protocols.service.api.LazyComponent;
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
public final class CallPayloadValidator_Factory implements Factory<CallPayloadValidator> {
    private final Provider<Integer> maxRetryCountProvider;
    private final Provider<LazyComponent<Mobilytics>> mobilyticsProvider;

    public CallPayloadValidator_Factory(Provider<LazyComponent<Mobilytics>> provider, Provider<Integer> provider2) {
        this.mobilyticsProvider = provider;
        this.maxRetryCountProvider = provider2;
    }

    public static CallPayloadValidator_Factory create(Provider<LazyComponent<Mobilytics>> provider, Provider<Integer> provider2) {
        return new CallPayloadValidator_Factory(provider, provider2);
    }

    public static CallPayloadValidator newInstance(LazyComponent<Mobilytics> lazyComponent, int i) {
        return new CallPayloadValidator(lazyComponent, i);
    }

    @Override // javax.inject.Provider
    public CallPayloadValidator get() {
        return newInstance(this.mobilyticsProvider.get(), this.maxRetryCountProvider.get().intValue());
    }
}
