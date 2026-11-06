package com.amazon.identity.auth.device;

import com.amazon.identity.auth.device.env.EnvironmentUtils;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class vb {
    public static URLConnection a(URL url) {
        if (url == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Null url is not allowed");
            return null;
        }
        URLConnection openConnection = url.openConnection();
        if (EnvironmentUtils.isCurrentEnvironmentProd() && (openConnection instanceof HttpsURLConnection)) {
            ((HttpsURLConnection) openConnection).setSSLSocketFactory(ub.f1004a);
        }
        return openConnection;
    }
}
