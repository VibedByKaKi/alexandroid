package com.amazon.matter.net;

import android.content.Context;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.identity.auth.device.api.AuthenticatedURLConnection;
import com.amazon.identity.auth.device.api.AuthenticationMethodFactory;
import com.amazon.identity.auth.device.api.AuthenticationType;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AuthenticatedURLConnectionFactory {
    private static final String IDENTITY_SERVICE_CLIENT_NAME = "AlexaMobileAndroidMatter";
    private final Context context;
    private final IdentityService identityService;

    @Inject
    public AuthenticatedURLConnectionFactory(Context context, IdentityService identityService) {
        this.context = context;
        this.identityService = identityService;
    }

    public HttpURLConnection getAuthenticatedURLConnection(URL url, AuthenticationType authenticationType) throws IOException {
        return AuthenticatedURLConnection.openConnection(url, new AuthenticationMethodFactory(this.context, this.identityService.getDirectedAccountId(IDENTITY_SERVICE_CLIENT_NAME)).newAuthenticationMethod(authenticationType));
    }
}
