package com.amazon.alexa.client.metrics.minerva;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.alexa.auth.AccessToken;
import com.amazon.alexa.auth.AuthorizationException;
import com.amazon.alexa.auth.TokenProvider;
import com.amazon.minerva.client.thirdparty.transport.OAuthProvider;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class MinervaOAuthProvider implements OAuthProvider {
    private static final String TAG = "MinervaOAuthProvider";
    private Context context;
    private TokenProvider tokenProvider;

    @Inject
    public MinervaOAuthProvider(Context context, TokenProvider tokenProvider) {
        this.context = context;
        this.tokenProvider = tokenProvider;
    }

    @Override // com.amazon.minerva.client.thirdparty.transport.OAuthProvider
    public String getAccessToken() throws Exception {
        try {
            AccessToken token = this.tokenProvider.getToken();
            if (token != null && !TextUtils.isEmpty(token.getValue())) {
                return token.getValue();
            }
            Log.i(TAG, "Access token is null, will use unauthenticated endpoint");
            throw new Exception("Access token is null");
        } catch (AuthorizationException unused) {
            Log.i(TAG, "Failed authorization when retrieving access token. Using unauthenticated endpoint.");
            throw new Exception("Failed authorization when retrieving access token.");
        }
    }
}
