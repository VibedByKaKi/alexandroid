package com.amazon.alexa.mobilytics.event.serializer.protobufhandlers;

import com.amazon.alexa.mobilytics.identity.MobilyticsUserProvider;
import dagger.internal.Factory;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class UserProtobufHandler_Factory implements Factory<UserProtobufHandler> {
    private final Provider<MobilyticsUserProvider> userProvider;

    public UserProtobufHandler_Factory(Provider<MobilyticsUserProvider> provider) {
        this.userProvider = provider;
    }

    public static UserProtobufHandler_Factory create(Provider<MobilyticsUserProvider> provider) {
        return new UserProtobufHandler_Factory(provider);
    }

    public static UserProtobufHandler newInstance(MobilyticsUserProvider mobilyticsUserProvider) {
        return new UserProtobufHandler(mobilyticsUserProvider);
    }

    @Override // javax.inject.Provider
    public UserProtobufHandler get() {
        return newInstance(this.userProvider.get());
    }
}
