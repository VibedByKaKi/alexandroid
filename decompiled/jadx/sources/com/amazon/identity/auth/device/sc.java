package com.amazon.identity.auth.device;

import java.net.HttpURLConnection;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class sc extends rc {
    public final HttpsURLConnection f;

    public sc(URL url) {
        super(url);
        HttpURLConnection httpURLConnection = this.f916a;
        if (httpURLConnection instanceof HttpsURLConnection) {
            this.f = (HttpsURLConnection) httpURLConnection;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("url must be https");
            throw null;
        }
    }

    @Override // com.amazon.identity.auth.device.rc
    public final void a(HttpURLConnection httpURLConnection) {
        super.a(httpURLConnection);
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            httpsURLConnection.setSSLSocketFactory(this.f.getSSLSocketFactory());
            httpsURLConnection.setHostnameVerifier(this.f.getHostnameVerifier());
        }
    }
}
