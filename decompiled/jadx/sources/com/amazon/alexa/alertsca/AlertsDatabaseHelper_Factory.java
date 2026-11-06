package com.amazon.alexa.alertsca;

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
public final class AlertsDatabaseHelper_Factory implements Factory<AlertsDatabaseHelper> {
    private final Provider<Context> contextProvider;

    public AlertsDatabaseHelper_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static AlertsDatabaseHelper_Factory create(Provider<Context> provider) {
        return new AlertsDatabaseHelper_Factory(provider);
    }

    public static AlertsDatabaseHelper newInstance(Context context) {
        return new AlertsDatabaseHelper(context);
    }

    @Override // javax.inject.Provider
    public AlertsDatabaseHelper get() {
        return newInstance(this.contextProvider.get());
    }
}
