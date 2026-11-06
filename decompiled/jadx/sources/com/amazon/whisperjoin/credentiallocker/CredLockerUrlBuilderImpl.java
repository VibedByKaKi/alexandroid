package com.amazon.whisperjoin.credentiallocker;

import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.net.URL;
import java.util.Locale;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
class CredLockerUrlBuilderImpl implements CredLockerUrlBuilder {
    private static final String V1_CRED_LOCKER_PATH = "/credentiallocker/v1";
    private final CredLockerEndpointResolver endpointResolver;

    public CredLockerUrlBuilderImpl(CredLockerEndpointResolver credLockerEndpointResolver) {
        this.endpointResolver = credLockerEndpointResolver;
    }

    @Override // com.amazon.whisperjoin.credentiallocker.CredLockerUrlBuilder
    public URL getWifiConfigurationsUrl(String str, String str2) throws IOException {
        URL endpoint = this.endpointResolver.getEndpoint();
        Locale locale = Locale.ENGLISH;
        return new URL(endpoint, a$$ExternalSyntheticOutline0.m("/credentiallocker/v1/wifiConfigurations?deviceId=", str, ";deviceType=", str2, ";utf8Supported=true"));
    }

    @Override // com.amazon.whisperjoin.credentiallocker.CredLockerUrlBuilder
    public URL getWifiConfigurationsUrl() throws IOException {
        URL endpoint = this.endpointResolver.getEndpoint();
        Locale locale = Locale.ENGLISH;
        return new URL(endpoint, "/credentiallocker/v1/wifiConfigurations?utf8Supported=true");
    }
}
