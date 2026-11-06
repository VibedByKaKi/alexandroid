package com.amazon.alexa.handsfree.notification;

import com.amazon.alexa.handsfree.protocols.Initializer;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class NotificationDismissReceiver_Factory implements Factory<NotificationDismissReceiver> {
    private final Provider<Initializer> initializerProvider;

    public NotificationDismissReceiver_Factory(Provider<Initializer> provider) {
        this.initializerProvider = provider;
    }

    public static NotificationDismissReceiver_Factory create(Provider<Initializer> provider) {
        return new NotificationDismissReceiver_Factory(provider);
    }

    public static NotificationDismissReceiver newInstance(Initializer initializer) {
        return new NotificationDismissReceiver(initializer);
    }

    @Override // javax.inject.Provider
    public NotificationDismissReceiver get() {
        return newInstance(this.initializerProvider.get());
    }
}
