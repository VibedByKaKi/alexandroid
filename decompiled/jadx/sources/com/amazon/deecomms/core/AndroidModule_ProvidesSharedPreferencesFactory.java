package com.amazon.deecomms.core;

import android.content.Context;
import android.content.SharedPreferences;
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
/* loaded from: classes5.dex */
public final class AndroidModule_ProvidesSharedPreferencesFactory implements Factory<SharedPreferences> {
    private final Provider<Context> contextProvider;
    private final AndroidModule module;

    public AndroidModule_ProvidesSharedPreferencesFactory(AndroidModule androidModule, Provider<Context> provider) {
        this.module = androidModule;
        this.contextProvider = provider;
    }

    public static AndroidModule_ProvidesSharedPreferencesFactory create(AndroidModule androidModule, Provider<Context> provider) {
        return new AndroidModule_ProvidesSharedPreferencesFactory(androidModule, provider);
    }

    public static SharedPreferences providesSharedPreferences(AndroidModule androidModule, Context context) {
        return (SharedPreferences) Preconditions.checkNotNullFromProvides(androidModule.providesSharedPreferences(context));
    }

    @Override // javax.inject.Provider
    public SharedPreferences get() {
        return providesSharedPreferences(this.module, this.contextProvider.get());
    }
}
