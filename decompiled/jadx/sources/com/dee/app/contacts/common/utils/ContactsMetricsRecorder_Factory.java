package com.dee.app.contacts.common.utils;

import com.amazon.commscore.api.metrics.AlexaCommsCoreMetricsService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class ContactsMetricsRecorder_Factory implements Factory<ContactsMetricsRecorder> {
    private final Provider<AlexaCommsCoreMetricsService> metricsServiceProvider;

    public ContactsMetricsRecorder_Factory(Provider<AlexaCommsCoreMetricsService> provider) {
        this.metricsServiceProvider = provider;
    }

    public static ContactsMetricsRecorder_Factory create(Provider<AlexaCommsCoreMetricsService> provider) {
        return new ContactsMetricsRecorder_Factory(provider);
    }

    public static ContactsMetricsRecorder newInstance(AlexaCommsCoreMetricsService alexaCommsCoreMetricsService) {
        return new ContactsMetricsRecorder(alexaCommsCoreMetricsService);
    }

    @Override // javax.inject.Provider
    public ContactsMetricsRecorder get() {
        return newInstance(this.metricsServiceProvider.get());
    }
}
