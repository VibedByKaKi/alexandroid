package com.amazon.alexa.client.alexaservice.vad.intent;

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
/* loaded from: classes17.dex */
public final class LiveModeCommandCatalog_Factory implements Factory<LiveModeCommandCatalog> {
    private final Provider<Context> contextProvider;

    public LiveModeCommandCatalog_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static LiveModeCommandCatalog_Factory create(Provider<Context> provider) {
        return new LiveModeCommandCatalog_Factory(provider);
    }

    public static LiveModeCommandCatalog newInstance(Context context) {
        return new LiveModeCommandCatalog(context);
    }

    @Override // javax.inject.Provider
    public LiveModeCommandCatalog get() {
        return newInstance(this.contextProvider.get());
    }
}
