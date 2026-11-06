package com.amazon.alexa.voiceui.cards;

import com.amazon.alexa.voiceui.events.UiEventReporter;
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
public final class StandardCardMetricsInteractor_Factory implements Factory<StandardCardMetricsInteractor> {
    private final Provider<UiEventReporter> uiEventReporterProvider;

    public StandardCardMetricsInteractor_Factory(Provider<UiEventReporter> provider) {
        this.uiEventReporterProvider = provider;
    }

    public static StandardCardMetricsInteractor_Factory create(Provider<UiEventReporter> provider) {
        return new StandardCardMetricsInteractor_Factory(provider);
    }

    public static StandardCardMetricsInteractor newInstance(UiEventReporter uiEventReporter) {
        return new StandardCardMetricsInteractor(uiEventReporter);
    }

    @Override // javax.inject.Provider
    public StandardCardMetricsInteractor get() {
        return newInstance(this.uiEventReporterProvider.get());
    }
}
