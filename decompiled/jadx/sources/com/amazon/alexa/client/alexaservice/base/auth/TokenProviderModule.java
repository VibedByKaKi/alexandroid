package com.amazon.alexa.client.alexaservice.base.auth;

import com.amazon.alexa.auth.DeviceSerialNumberProvider;
import com.amazon.alexa.auth.TokenProvider;
import dagger.Binds;
import dagger.Module;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public interface TokenProviderModule {
    @Singleton
    @Binds
    DeviceSerialNumberProvider providesDeviceSerialNumberProvider(AuthorizationAuthority authorizationAuthority);

    @Singleton
    @Binds
    TokenProvider providesTokenProvider(AuthorizationAuthority authorizationAuthority);
}
