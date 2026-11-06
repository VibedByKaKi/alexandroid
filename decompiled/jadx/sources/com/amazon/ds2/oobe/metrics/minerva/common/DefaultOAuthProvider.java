package com.amazon.ds2.oobe.metrics.minerva.common;

import android.content.Context;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.minerva.client.common.transport.OAuthProvider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class DefaultOAuthProvider implements OAuthProvider {
    private IdentityService identityService;

    public DefaultOAuthProvider(Context context) {
        this.identityService = null;
        ComponentRegistry componentRegistry = ComponentRegistry.getInstance();
        if (componentRegistry == null || !componentRegistry.get(IdentityService.class).isPresent()) {
            return;
        }
        this.identityService = (IdentityService) componentRegistry.get(IdentityService.class).get();
    }

    @Override // com.amazon.minerva.client.common.transport.OAuthProvider
    public String getAccessToken() throws Exception {
        if (this.identityService == null) {
            ComponentRegistry componentRegistry = ComponentRegistry.getInstance();
            if (componentRegistry == null || !componentRegistry.get(IdentityService.class).isPresent()) {
                return null;
            }
            this.identityService = (IdentityService) componentRegistry.get(IdentityService.class).get();
        }
        return this.identityService.getAccessToken(DefaultOAuthProvider.class.getName());
    }
}
