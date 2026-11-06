package com.amazon.alexa.presence.bleconn.data;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes18.dex */
public final class DeveloperSettings_Factory implements Factory<DeveloperSettings> {
    private final Provider<Context> contextProvider;

    public DeveloperSettings_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static DeveloperSettings_Factory create(Provider<Context> provider) {
        return new DeveloperSettings_Factory(provider);
    }

    public static DeveloperSettings newInstance(Context context) {
        return new DeveloperSettings(context);
    }

    @Override // javax.inject.Provider
    public DeveloperSettings get() {
        return newInstance(this.contextProvider.get());
    }
}
