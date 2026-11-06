package com.amazon.alexa.presence.identity;

import com.amazon.alexa.presence.Presence;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class PresenceAccessTokenProvider implements AccessTokenProvider {
    private static final String TAG = Presence.tag();

    @Override // com.amazon.alexa.presence.identity.AccessTokenProvider
    public String getAccessToken() {
        return getAuthTokenFromMap();
    }

    public String getAuthTokenFromMap() {
        return IdentityHelper.getAuthTokenDirectlyFromMap();
    }
}
