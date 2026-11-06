package com.amazon.ds2.oobe.metrics.minerva.common;

import com.amazon.minerva.client.common.transport.OAuthProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class NoopOAuthProvider implements OAuthProvider {
    @Override // com.amazon.minerva.client.common.transport.OAuthProvider
    public String getAccessToken() throws Exception {
        throw new Exception("Unexpected invocation");
    }
}
