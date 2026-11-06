package com.amazon.alexa.apl.metrics;

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
/* loaded from: classes16.dex */
public final class APLEventReporter_Factory implements Factory<APLEventReporter> {
    private final Provider<Context> mContextProvider;

    public APLEventReporter_Factory(Provider<Context> provider) {
        this.mContextProvider = provider;
    }

    public static APLEventReporter_Factory create(Provider<Context> provider) {
        return new APLEventReporter_Factory(provider);
    }

    public static APLEventReporter newInstance(Context context) {
        return new APLEventReporter(context);
    }

    @Override // javax.inject.Provider
    public APLEventReporter get() {
        return newInstance(this.mContextProvider.get());
    }
}
