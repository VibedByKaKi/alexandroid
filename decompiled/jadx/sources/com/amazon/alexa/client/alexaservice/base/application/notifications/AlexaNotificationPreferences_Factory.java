package com.amazon.alexa.client.alexaservice.base.application.notifications;

import com.amazon.alexa.client.core.device.PersistentStorage;
import dagger.Lazy;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata("javax.inject.Singleton")
@DaggerGenerated
@QualifierMetadata({"javax.inject.Named"})
/* loaded from: classes17.dex */
public final class AlexaNotificationPreferences_Factory implements Factory<AlexaNotificationPreferences> {
    private final Provider<PersistentStorage> storageProvider;

    public AlexaNotificationPreferences_Factory(Provider<PersistentStorage> provider) {
        this.storageProvider = provider;
    }

    public static AlexaNotificationPreferences_Factory create(Provider<PersistentStorage> provider) {
        return new AlexaNotificationPreferences_Factory(provider);
    }

    public static AlexaNotificationPreferences newInstance(Lazy<PersistentStorage> lazy) {
        return new AlexaNotificationPreferences(lazy);
    }

    @Override // javax.inject.Provider
    public AlexaNotificationPreferences get() {
        return newInstance(DoubleCheck.lazy(this.storageProvider));
    }
}
