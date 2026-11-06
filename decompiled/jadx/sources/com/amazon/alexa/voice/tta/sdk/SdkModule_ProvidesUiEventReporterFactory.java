package com.amazon.alexa.voice.tta.sdk;

import android.content.Context;
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
/* loaded from: classes19.dex */
public final class SdkModule_ProvidesUiEventReporterFactory implements Factory<UiEventReporter> {
    private final Provider<Context> contextProvider;
    private final SdkModule module;

    public SdkModule_ProvidesUiEventReporterFactory(SdkModule sdkModule, Provider<Context> provider) {
        this.module = sdkModule;
        this.contextProvider = provider;
    }

    public static SdkModule_ProvidesUiEventReporterFactory create(SdkModule sdkModule, Provider<Context> provider) {
        return new SdkModule_ProvidesUiEventReporterFactory(sdkModule, provider);
    }

    public static UiEventReporter providesUiEventReporter(SdkModule sdkModule, Context context) {
        return (UiEventReporter) Preconditions.checkNotNullFromProvides(sdkModule.providesUiEventReporter(context));
    }

    @Override // javax.inject.Provider
    public UiEventReporter get() {
        return providesUiEventReporter(this.module, this.contextProvider.get());
    }
}
