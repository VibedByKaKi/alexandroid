package com.amazon.alexa.accessory.frames.http;

import com.amazon.alexa.accessorykit.diagnostics.DiagnosticsDownloader;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class HttpClient$$ExternalSyntheticLambda2 implements HostnameVerifier {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ HttpClient$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        boolean lambda$executeHttpDownload$0;
        switch (this.$r8$classId) {
            case 0:
                return HttpClient.lambda$buildSimpleOkHttpClient$2(str, sSLSession);
            default:
                lambda$executeHttpDownload$0 = DiagnosticsDownloader.lambda$executeHttpDownload$0(str, sSLSession);
                return lambda$executeHttpDownload$0;
        }
    }
}
