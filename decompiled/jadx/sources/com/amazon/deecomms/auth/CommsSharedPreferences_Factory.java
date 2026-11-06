package com.amazon.deecomms.auth;

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
/* loaded from: classes5.dex */
public final class CommsSharedPreferences_Factory implements Factory<CommsSharedPreferences> {
    private final Provider<Context> contextProvider;

    public CommsSharedPreferences_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static CommsSharedPreferences_Factory create(Provider<Context> provider) {
        return new CommsSharedPreferences_Factory(provider);
    }

    public static CommsSharedPreferences newInstance(Context context) {
        return new CommsSharedPreferences(context);
    }

    @Override // javax.inject.Provider
    public CommsSharedPreferences get() {
        return newInstance(this.contextProvider.get());
    }
}
