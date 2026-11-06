package com.amazon.alexa.cam.utils;

import com.amazon.alexa.identity.api.IdentityService;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/cam/utils/IdentityServiceProvider;", "", "identityService", "Lcom/amazon/alexa/identity/api/IdentityService;", "(Lcom/amazon/alexa/identity/api/IdentityService;)V", "getAuthorizationToken", "", "attachBearerPrefix", "", "Companion", "AlexaMobileAndroidSimbaClient_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class IdentityServiceProvider {

    @NotNull
    public static final String AUTHORIZATION_PREFIX = "Bearer ";

    @NotNull
    public static final String TAG = "IdentityServiceProvider";

    @NotNull
    private final IdentityService identityService;

    public IdentityServiceProvider(@NotNull IdentityService identityService) {
        identityService.getClass();
        this.identityService = identityService;
    }

    public static /* synthetic */ String getAuthorizationToken$default(IdentityServiceProvider identityServiceProvider, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return identityServiceProvider.getAuthorizationToken(z);
    }

    @NotNull
    public final String getAuthorizationToken(boolean attachBearerPrefix) {
        String accessTokenForPerson = this.identityService.getAccessTokenForPerson(TAG);
        if (accessTokenForPerson != null) {
            accessTokenForPerson.length();
        }
        if (attachBearerPrefix) {
            return a$$ExternalSyntheticOutline0.m("Bearer ", accessTokenForPerson);
        }
        accessTokenForPerson.getClass();
        return accessTokenForPerson;
    }
}
