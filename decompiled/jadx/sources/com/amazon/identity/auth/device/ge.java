package com.amazon.identity.auth.device;

import android.util.Log;
import com.amazonaws.services.s3.internal.crypto.S3KeyWrapScheme;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ge extends tb {
    public static ge b;

    /* renamed from: a, reason: collision with root package name */
    public final ie f679a;

    public ge() {
        ie ieVar;
        try {
            synchronized (ie.class) {
                try {
                    if (ie.b == null) {
                        Log.i(yf.a("LocalDataStorageV2RSAKeyPairManager"), "Generating LocalDataStorageV2RSAKeyPairManager instance");
                        ie.b = new ie();
                    }
                    ieVar = ie.b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f679a = ieVar;
        } catch (Exception e) {
            yf.a("LocalDataStorageV2EncryptionKeyCryptoManager", "Encountered error creating LocalDataStorageV2EncryptionKeyCryptoManager", e, "LocalDataStorageV2EncryptionKeyCryptoManager:InitializationFailed:".concat(e.getClass().getSimpleName()));
            throw e;
        }
    }

    @Override // com.amazon.identity.auth.device.tb
    public final String a(byte[] bArr) {
        try {
            Log.i(yf.a("LocalDataStorageV2EncryptionKeyCryptoManager"), "Encrypting AES encryption key");
            this.f679a.a();
            PublicKey publicKey = this.f679a.f724a.getCertificate("IDENTITY_V2_STORAGE_KEYSTORE_ALIAS").getPublicKey();
            OAEPParameterSpec oAEPParameterSpec = new OAEPParameterSpec("SHA-256", "MGF1", new MGF1ParameterSpec("SHA-1"), PSource.PSpecified.DEFAULT);
            try {
                Cipher cipher = Cipher.getInstance(S3KeyWrapScheme.RSA_ECB_OAEP_WITH_SHA256_AND_MGF1_PADDING);
                cipher.init(1, publicKey, oAEPParameterSpec);
                return "AES-ECB+" + oo.a(cipher.doFinal(bArr));
            } catch (Exception e) {
                yf.a("RSACipherHelper", "Unable to create RSA cipher, this seems to be a system bug.", e, "RSACipherWithAlgParamSpecCreationFailure");
                throw new IllegalStateException("Unable to create RSA cipher.");
            }
        } catch (Exception e2) {
            Log.e(yf.a("LocalDataStorageV2EncryptionKeyCryptoManager"), "Encountered exception while encrypting encryption key", e2);
            throw e2;
        }
    }

    public static synchronized ge a() {
        ge geVar;
        synchronized (ge.class) {
            try {
                if (b == null) {
                    Log.i(yf.a("LocalDataStorageV2EncryptionKeyCryptoManager"), "Generating LocalDataStorageV2EncryptionKeyCryptoManager instance");
                    b = new ge();
                }
                geVar = b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return geVar;
    }

    @Override // com.amazon.identity.auth.device.tb
    public final byte[] a(String str) {
        if (str.startsWith("AES-ECB+")) {
            try {
                Log.i(yf.a("LocalDataStorageV2EncryptionKeyCryptoManager"), "Decrypting AES encryption key");
                return yl.a(2, S3KeyWrapScheme.RSA_ECB_OAEP_WITH_SHA256_AND_MGF1_PADDING, (PrivateKey) this.f679a.f724a.getKey("IDENTITY_V2_STORAGE_KEYSTORE_ALIAS", null)).doFinal(oo.a(str.substring(8)));
            } catch (Exception e) {
                Log.e(yf.a("LocalDataStorageV2EncryptionKeyCryptoManager"), "Encountered exception while decrypting encryption key", e);
                throw e;
            }
        }
        return oo.a(str);
    }
}
