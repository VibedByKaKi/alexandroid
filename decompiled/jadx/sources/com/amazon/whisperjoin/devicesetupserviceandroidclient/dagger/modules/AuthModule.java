package com.amazon.whisperjoin.devicesetupserviceandroidclient.dagger.modules;

import android.content.Context;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import com.amazon.identity.auth.device.api.TokenKeys;
import com.amazon.identity.auth.device.api.TokenManagement;
import com.amazon.whisperjoin.devicesetupserviceandroidclient.identity.MapAccessTokenProvider;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes20.dex */
public class AuthModule {
    @Provides
    public MapAccessTokenProvider providesAccessTokenProvider(MAPAccountManager mAPAccountManager, TokenManagement tokenManagement, String str) {
        return new MapAccessTokenProvider(mAPAccountManager, tokenManagement, str);
    }

    @Provides
    public MAPAccountManager providesMapAccountManager(Context context) {
        return new MAPAccountManager(context);
    }

    @Provides
    public String providesTokenKeys(Context context) {
        return TokenKeys.getAccessTokenKeyForPackage(context.getPackageName());
    }

    @Provides
    public TokenManagement providesTokenManagement(Context context) {
        return new TokenManagement(context);
    }
}
