package com.amazon.alexa.voiceui.events;

import android.content.Context;
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
public final class UiEventReporter_Factory implements Factory<UiEventReporter> {
    private final Provider<Context> contextProvider;

    public UiEventReporter_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static UiEventReporter_Factory create(Provider<Context> provider) {
        return new UiEventReporter_Factory(provider);
    }

    public static UiEventReporter newInstance(Context context) {
        return new UiEventReporter(context);
    }

    @Override // javax.inject.Provider
    public UiEventReporter get() {
        return newInstance(this.contextProvider.get());
    }
}
