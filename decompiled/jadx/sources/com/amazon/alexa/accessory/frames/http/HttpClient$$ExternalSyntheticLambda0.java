package com.amazon.alexa.accessory.frames.http;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class HttpClient$$ExternalSyntheticLambda0 implements HostnameVerifier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;

    public /* synthetic */ HttpClient$$ExternalSyntheticLambda0(String str, int i) {
        this.$r8$classId = i;
        this.f$0 = str;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        boolean lambda$buildPinnedOkHttpClient$1;
        boolean lambda$buildOkHttpClient$0;
        int i = this.$r8$classId;
        String str2 = this.f$0;
        switch (i) {
            case 0:
                lambda$buildPinnedOkHttpClient$1 = HttpClient.lambda$buildPinnedOkHttpClient$1(str2, str, sSLSession);
                return lambda$buildPinnedOkHttpClient$1;
            default:
                lambda$buildOkHttpClient$0 = HttpClient.lambda$buildOkHttpClient$0(str2, str, sSLSession);
                return lambda$buildOkHttpClient$0;
        }
    }
}
