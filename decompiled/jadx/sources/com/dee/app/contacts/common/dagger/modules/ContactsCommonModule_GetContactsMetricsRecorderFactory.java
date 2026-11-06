package com.dee.app.contacts.common.dagger.modules;

import com.amazon.commscore.api.metrics.AlexaCommsCoreMetricsService;
import com.dee.app.contacts.common.utils.ContactsMetricsRecorder;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes6.dex */
public final class ContactsCommonModule_GetContactsMetricsRecorderFactory implements Factory<ContactsMetricsRecorder> {
    private final Provider<AlexaCommsCoreMetricsService> metricsServiceProvider;
    private final ContactsCommonModule module;

    public ContactsCommonModule_GetContactsMetricsRecorderFactory(ContactsCommonModule contactsCommonModule, Provider<AlexaCommsCoreMetricsService> provider) {
        this.module = contactsCommonModule;
        this.metricsServiceProvider = provider;
    }

    public static ContactsCommonModule_GetContactsMetricsRecorderFactory create(ContactsCommonModule contactsCommonModule, Provider<AlexaCommsCoreMetricsService> provider) {
        return new ContactsCommonModule_GetContactsMetricsRecorderFactory(contactsCommonModule, provider);
    }

    public static ContactsMetricsRecorder getContactsMetricsRecorder(ContactsCommonModule contactsCommonModule, AlexaCommsCoreMetricsService alexaCommsCoreMetricsService) {
        return (ContactsMetricsRecorder) Preconditions.checkNotNullFromProvides(contactsCommonModule.getContactsMetricsRecorder(alexaCommsCoreMetricsService));
    }

    @Override // javax.inject.Provider
    public ContactsMetricsRecorder get() {
        return getContactsMetricsRecorder(this.module, this.metricsServiceProvider.get());
    }
}
