package com.amazon.alexa.utils.security;

import android.content.pm.ApplicationInfo;
import android.content.pm.Signature;
import com.amazon.alexa.ra.core.data.model.Constants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class PackageSignatureUtil {
    private static final String CERTIFICATE_TYPE = "X.509";
    private static final String HASH_ALGORITHM = "SHA-256";
    private static final String TAG = "PackageSignatureUtil";

    private Certificate getCertificateFromByteArray(byte[] bArr) throws CertificateException, IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        Certificate generateCertificate = CertificateFactory.getInstance("X.509").generateCertificate(byteArrayInputStream);
        byteArrayInputStream.close();
        return generateCertificate;
    }

    private byte[] getFingerprint(byte[] bArr) throws NoSuchAlgorithmException {
        if (bArr != null) {
            return MessageDigest.getInstance("SHA-256").digest(bArr);
        }
        return null;
    }

    private String toHexString(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                stringBuffer.append(Constants.FEEDBACK_TYPE_DISLIKE);
            }
            stringBuffer.append(hexString);
        }
        return stringBuffer.toString();
    }

    public String getSignatureFingerprint(Signature signature) throws IOException, CertificateException, NoSuchAlgorithmException {
        return toHexString(getFingerprint(getCertificateFromByteArray(signature.toByteArray()).getEncoded()));
    }

    public boolean isDebug(ApplicationInfo applicationInfo) {
        return (applicationInfo.flags & 2) != 0;
    }
}
