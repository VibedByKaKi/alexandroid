package com.amazonaws.services.s3.model;

import com.amazonaws.util.Base64;
import javax.crypto.SecretKey;
import okio.Path$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class SSECustomerKey {
    private String algorithm;
    private final String base64EncodedKey;
    private String base64EncodedMd5;

    public SSECustomerKey(SecretKey secretKey) {
        if (secretKey == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Encryption key must be specified");
            throw null;
        }
        this.algorithm = SSEAlgorithm.AES256.getAlgorithm();
        this.base64EncodedKey = Base64.encodeAsString(secretKey.getEncoded());
    }

    public static SSECustomerKey generateSSECustomerKeyForPresignUrl(String str) {
        if (str != null) {
            return new SSECustomerKey().withAlgorithm(str);
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public String getKey() {
        return this.base64EncodedKey;
    }

    public String getMd5() {
        return this.base64EncodedMd5;
    }

    public void setAlgorithm(String str) {
        this.algorithm = str;
    }

    public void setMd5(String str) {
        this.base64EncodedMd5 = str;
    }

    public SSECustomerKey withAlgorithm(String str) {
        setAlgorithm(str);
        return this;
    }

    public SSECustomerKey withMd5(String str) {
        setMd5(str);
        return this;
    }

    public SSECustomerKey(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            this.algorithm = SSEAlgorithm.AES256.getAlgorithm();
            this.base64EncodedKey = Base64.encodeAsString(bArr);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Encryption key must be specified");
            throw null;
        }
    }

    public SSECustomerKey(String str) {
        if (str != null && str.length() != 0) {
            this.algorithm = SSEAlgorithm.AES256.getAlgorithm();
            this.base64EncodedKey = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("Encryption key must be specified");
            throw null;
        }
    }

    private SSECustomerKey() {
        this.base64EncodedKey = null;
    }
}
