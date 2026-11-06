package com.amazon.whisperjoin.common.sharedtypes.utility;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.apache.commons.lang.ArrayUtils;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AuthMaterialIndexGenerator {
    private static final String TAG = "AuthMaterialIndexGenerator";

    private AuthMaterialIndexGenerator() {
    }

    public static byte[] generate(byte[] bArr) {
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("derPubKeyByteArray can not be null");
            return null;
        }
        try {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(bArr);
            return ArrayUtils.subarray(digest, digest.length - 9, digest.length);
        } catch (NoSuchAlgorithmException e) {
            WJLog.e(TAG, "SHA256 algo not found", e);
            OnnxMap$$ExternalSyntheticBUOutline0.m("SHA256 algo not found", e);
            return null;
        }
    }
}
