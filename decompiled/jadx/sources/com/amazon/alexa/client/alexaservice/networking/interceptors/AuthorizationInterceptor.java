package com.amazon.alexa.client.alexaservice.networking.interceptors;

import com.amazon.alexa.auth.AccessToken;
import com.amazon.alexa.auth.AuthorizationException;
import com.amazon.alexa.auth.TokenProvider;
import java.io.IOException;
import javax.inject.Inject;
import javax.inject.Singleton;
import okhttp3.Interceptor;
import okhttp3.Response;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AuthorizationInterceptor implements Interceptor {
    private static final String AUTHORIZATION_HEADER_KEY = "authorization";
    private static final String AUTHORIZATION_HEADER_VALUE_PREFIX = "Bearer ";
    private final TokenProvider tokenProvider;

    @Inject
    public AuthorizationInterceptor(TokenProvider tokenProvider) {
        this.tokenProvider = tokenProvider;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        try {
            AccessToken token = this.tokenProvider.getToken();
            if (token == null || token.getValue() == null) {
                throw new IOException("Received token was null");
            }
            return chain.proceed(chain.request().newBuilder().addHeader("authorization", "Bearer " + token.getValue()).build());
        } catch (AuthorizationException e) {
            Buffer$$ExternalSyntheticBUOutline0.m("Exception while retrieving token", e);
            return null;
        }
    }
}
