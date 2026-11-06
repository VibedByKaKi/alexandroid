package com.amazon.alexa.voice.hva;

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
/* loaded from: classes19.dex */
public final class HighValueActionEventPublisher_Factory implements Factory<HighValueActionEventPublisher> {
    private final Provider<Context> contextProvider;

    public HighValueActionEventPublisher_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static HighValueActionEventPublisher_Factory create(Provider<Context> provider) {
        return new HighValueActionEventPublisher_Factory(provider);
    }

    public static HighValueActionEventPublisher newInstance(Context context) {
        return new HighValueActionEventPublisher(context);
    }

    @Override // javax.inject.Provider
    public HighValueActionEventPublisher get() {
        return newInstance(this.contextProvider.get());
    }
}
