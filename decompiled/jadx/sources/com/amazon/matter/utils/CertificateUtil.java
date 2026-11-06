package com.amazon.matter.utils;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import com.amazon.matter.data.attestation.CertificateChain;
import com.amazon.matter.data.attestation.CertificateName;
import com.amazon.matter.data.attestation.SetPeripheralCertificateResponse;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@SuppressLint({"NewApi"})
/* loaded from: classes5.dex */
public final class CertificateUtil {
    public static final String BEGIN_CERTIFICATE = "-----BEGIN CERTIFICATE-----\n";
    public static final String BEGIN_CERTIFICATE_REQUEST = "-----BEGIN CERTIFICATE REQUEST-----\n";
    public static final String END_CERTIFICATE = "\n-----END CERTIFICATE-----";
    public static final String END_CERTIFICATE_REQUEST = "\n-----END CERTIFICATE REQUEST-----\n";
    private static final String TAG = "com.amazon.matter.utils.CertificateUtil";

    private CertificateUtil() {
    }

    public static String convertToBase64EncodedHexData(byte[] bArr) {
        String encodeToString = Base64.getEncoder().encodeToString(bArr);
        StringBuilder sb = new StringBuilder();
        for (char c : encodeToString.toCharArray()) {
            sb.append(Integer.toHexString(c));
        }
        return sb.toString();
    }

    public static String createCertificateFromByteValue(byte[] bArr) {
        return a$$ExternalSyntheticOutline0.m(BEGIN_CERTIFICATE, Base64.getEncoder().encodeToString(bArr), END_CERTIFICATE);
    }

    public static String createCertificateRequestFromByteValue(byte[] bArr) {
        return a$$ExternalSyntheticOutline0.m(BEGIN_CERTIFICATE_REQUEST, Base64.getEncoder().encodeToString(bArr).replaceAll("(.{64})", "$1\n"), END_CERTIFICATE_REQUEST);
    }

    @NonNull
    public static byte[] extractCertificateData(@NonNull String str) {
        return Base64.getDecoder().decode(str.replace(BEGIN_CERTIFICATE, "").replace(END_CERTIFICATE, "").replaceAll("\n", ""));
    }

    public static Map<CertificateName, byte[]> extractRootCertificatesFromResponse(SetPeripheralCertificateResponse setPeripheralCertificateResponse) {
        HashMap hashMap = new HashMap();
        for (CertificateChain certificateChain : setPeripheralCertificateResponse.getSignedOperationalCertificateChain()) {
            Objects.toString(certificateChain.getName());
            hashMap.put(certificateChain.getName(), extractCertificateData(certificateChain.getValue()));
        }
        hashMap.size();
        return hashMap;
    }
}
