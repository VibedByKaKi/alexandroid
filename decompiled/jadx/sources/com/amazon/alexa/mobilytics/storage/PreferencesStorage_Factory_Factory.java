package com.amazon.alexa.mobilytics.storage;

import android.content.Context;
import com.amazon.alexa.mobilytics.internal.JsonConverter;
import com.amazon.alexa.mobilytics.storage.PreferencesStorage;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class PreferencesStorage_Factory_Factory implements Factory<PreferencesStorage.Factory> {
    private final Provider<Context> contextProvider;
    private final Provider<JsonConverter> serializerProvider;

    public PreferencesStorage_Factory_Factory(Provider<Context> provider, Provider<JsonConverter> provider2) {
        this.contextProvider = provider;
        this.serializerProvider = provider2;
    }

    public static PreferencesStorage_Factory_Factory create(Provider<Context> provider, Provider<JsonConverter> provider2) {
        return new PreferencesStorage_Factory_Factory(provider, provider2);
    }

    public static PreferencesStorage.Factory newInstance(Context context, JsonConverter jsonConverter) {
        return new PreferencesStorage.Factory(context, jsonConverter);
    }

    @Override // javax.inject.Provider
    public PreferencesStorage.Factory get() {
        return newInstance(this.contextProvider.get(), this.serializerProvider.get());
    }
}
