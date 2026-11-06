package com.amazon.whisperjoin.deviceprovisioningservice.di.modules;

import android.content.Context;
import com.amazon.whisperjoin.deviceprovisioningservice.identity.MapAuthenticationProvider;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes20.dex */
public class MapAuthModule {
    @Provides
    public MapAuthenticationProvider providesMapProvider(Context context) {
        return new MapAuthenticationProvider.DefaultMapAuthAccountProvider(context);
    }
}
