package com.amazon.minerva.client.common.internal.transport;

import com.amazon.minerva.client.thirdparty.transport.OAuthProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class OAuthProviderAdapter implements OAuthProvider {
    private com.amazon.minerva.client.common.transport.OAuthProvider mOAuthProvider;

    public OAuthProviderAdapter(com.amazon.minerva.client.common.transport.OAuthProvider oAuthProvider) {
        this.mOAuthProvider = oAuthProvider;
    }

    @Override // com.amazon.minerva.client.thirdparty.transport.OAuthProvider
    public String getAccessToken() throws Exception {
        return this.mOAuthProvider.getAccessToken();
    }
}
