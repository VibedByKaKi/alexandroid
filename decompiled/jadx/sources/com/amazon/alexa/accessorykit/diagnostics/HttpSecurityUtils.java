package com.amazon.alexa.accessorykit.diagnostics;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.accessory.internal.util.Logger;
import com.amazon.alexa.accessory.internal.util.Preconditions;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Base64;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final class HttpSecurityUtils {
    private static final String TAG = "HttpSecurityUtils";

    private HttpSecurityUtils() {
    }

    public static SSLContext createPinnedSSLContext(@NonNull byte[] bArr) {
        Preconditions.notNull(bArr, "expectedFingerprint");
        try {
            X509TrustManager createPinnedTrustManager = createPinnedTrustManager(Base64.getEncoder().encodeToString(bArr));
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new TrustManager[]{createPinnedTrustManager}, new SecureRandom());
            return sSLContext;
        } catch (Exception e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Failed to create pinned SSL context", e);
            return null;
        }
    }

    public static X509TrustManager createPinnedTrustManager(@NonNull final String str) {
        Preconditions.notNull(str, "expectedFingerprintBase64");
        final X509TrustManager systemTrustManager = getSystemTrustManager();
        return new X509TrustManager() { // from class: com.amazon.alexa.accessorykit.diagnostics.HttpSecurityUtils.1
            @Override // javax.net.ssl.X509TrustManager
            public void checkServerTrusted(X509Certificate[] x509CertificateArr, String str2) throws CertificateException {
                if (x509CertificateArr == null || x509CertificateArr.length == 0) {
                    throw new CertificateException("Empty certificate chain");
                }
                try {
                    if (Base64.getEncoder().encodeToString(MessageDigest.getInstance("SHA-256").digest(x509CertificateArr[0].getEncoded())).equals(str)) {
                    } else {
                        throw new CertificateException("TLS fingerprint mismatch");
                    }
                } catch (NoSuchAlgorithmException e) {
                    throw new CertificateException("SHA-256 unavailable", e);
                }
            }

            @Override // javax.net.ssl.X509TrustManager
            public X509Certificate[] getAcceptedIssuers() {
                X509TrustManager x509TrustManager = systemTrustManager;
                return x509TrustManager != null ? x509TrustManager.getAcceptedIssuers() : new X509Certificate[0];
            }

            @Override // javax.net.ssl.X509TrustManager
            public void checkClientTrusted(X509Certificate[] x509CertificateArr, String str2) {
            }
        };
    }

    @Nullable
    public static X509TrustManager getSystemTrustManager() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init((KeyStore) null);
            for (TrustManager trustManager : trustManagerFactory.getTrustManagers()) {
                if (trustManager instanceof X509TrustManager) {
                    return (X509TrustManager) trustManager;
                }
            }
        } catch (Exception e) {
            Logger.w("HttpSecurityUtils: Failed to get system trust manager: " + e.getMessage());
        }
        return null;
    }
}
