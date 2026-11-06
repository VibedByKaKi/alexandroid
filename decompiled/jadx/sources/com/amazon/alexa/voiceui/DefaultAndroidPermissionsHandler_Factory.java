package com.amazon.alexa.voiceui;

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
public final class DefaultAndroidPermissionsHandler_Factory implements Factory<DefaultAndroidPermissionsHandler> {
    private final Provider<Context> contextProvider;

    public DefaultAndroidPermissionsHandler_Factory(Provider<Context> provider) {
        this.contextProvider = provider;
    }

    public static DefaultAndroidPermissionsHandler_Factory create(Provider<Context> provider) {
        return new DefaultAndroidPermissionsHandler_Factory(provider);
    }

    public static DefaultAndroidPermissionsHandler newInstance(Context context) {
        return new DefaultAndroidPermissionsHandler(context);
    }

    @Override // javax.inject.Provider
    public DefaultAndroidPermissionsHandler get() {
        return newInstance(this.contextProvider.get());
    }
}
