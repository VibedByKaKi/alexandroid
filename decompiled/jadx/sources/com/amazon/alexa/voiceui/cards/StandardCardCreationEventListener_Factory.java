package com.amazon.alexa.voiceui.cards;

import com.amazon.alexa.voiceui.events.UiEventReporter;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes20.dex */
public final class StandardCardCreationEventListener_Factory implements Factory<StandardCardCreationEventListener> {
    private final Provider<UiEventReporter> uiEventReporterProvider;

    public StandardCardCreationEventListener_Factory(Provider<UiEventReporter> provider) {
        this.uiEventReporterProvider = provider;
    }

    public static StandardCardCreationEventListener_Factory create(Provider<UiEventReporter> provider) {
        return new StandardCardCreationEventListener_Factory(provider);
    }

    public static StandardCardCreationEventListener newInstance(UiEventReporter uiEventReporter) {
        return new StandardCardCreationEventListener(uiEventReporter);
    }

    @Override // javax.inject.Provider
    public StandardCardCreationEventListener get() {
        return newInstance(this.uiEventReporterProvider.get());
    }
}
