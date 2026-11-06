package com.amazon.alexa.accessory.frames.media;

import com.amazon.alexa.accessory.frames.http.HttpClient;
import java.security.SecureRandom;
import java.util.Base64;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0002¨\u0006\u0004"}, d2 = {"buildPinnedSslFactory", "Ljavax/net/ssl/SSLSocketFactory;", "tlsFingerprintSha256", "", "AlexaAccessoryEchoFramesAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NanMediaDownloaderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final SSLSocketFactory buildPinnedSslFactory(byte[] bArr) throws IllegalStateException {
        if (bArr == null || bArr.length == 0) {
            Single$$ExternalSyntheticBUOutline0.m$2("TLS fingerprint required for NAN media download — firmware did not provide tlsCertInfo.fingerprintSha256");
            return null;
        }
        String encodeToString = Base64.getEncoder().encodeToString(bArr);
        SSLContext sSLContext = SSLContext.getInstance("TLSv1.2");
        sSLContext.init(null, new X509TrustManager[]{HttpClient.buildPinnedTrustManager(encodeToString)}, new SecureRandom());
        SSLSocketFactory socketFactory = sSLContext.getSocketFactory();
        socketFactory.getClass();
        return socketFactory;
    }
}
