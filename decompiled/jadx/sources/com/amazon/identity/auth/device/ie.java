package com.amazon.identity.auth.device;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import com.amazon.whispercloak.KeyUtils;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import javax.security.auth.x500.X500Principal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ie {
    public static ie b;

    /* renamed from: a, reason: collision with root package name */
    public final KeyStore f724a;

    public ie() {
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.f724a = keyStore;
            keyStore.load(null);
        } catch (Exception e) {
            yf.a("LocalDataStorageV2RSAKeyPairManager", "Encountered error creating LocalDataStorageV2EncryptionKeyCryptoManager", e, "LocalDataStorageV2RSAKeyPairManager:InitializationFailed:".concat(e.getClass().getSimpleName()));
            throw e;
        }
    }

    public final void a() {
        yf.b("LocalDataStorageV2RSAKeyPairManager", "Generating RSA key pair", "LocalDataStorageV2RSAKeyPairManager:GenerateRSAKeyPairIfAbsentInvoked");
        KeyStore keyStore = this.f724a;
        if (keyStore == null) {
            yf.a("LocalDataStorageV2RSAKeyPairManager", "Keystore is null! This should not happen!", "LocalDataStorageV2RSAKeyPairManager:NullKeyStore");
            return;
        }
        if (keyStore.containsAlias("IDENTITY_V2_STORAGE_KEYSTORE_ALIAS")) {
            yf.b("LocalDataStorageV2RSAKeyPairManager", "RSA key pair already exists, fast returning", "LocalDataStorageV2RSAKeyPairManager:RSAKeyPairAlreadyExists");
            return;
        }
        KeyGenParameterSpec build = new KeyGenParameterSpec.Builder("IDENTITY_V2_STORAGE_KEYSTORE_ALIAS", 3).setCertificateSubject(new X500Principal("CN=IDENTITY_V2_STORAGE_KEYSTORE_ALIAS")).setCertificateSerialNumber(BigInteger.TEN).setKeySize(2048).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("OAEPPadding").build();
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(KeyUtils.ALGORITHM_RSA, "AndroidKeyStore");
            keyPairGenerator.initialize(build);
            keyPairGenerator.generateKeyPair();
            yf.b("LocalDataStorageV2RSAKeyPairManager", "Successfully generated RSA Key pair", "LocalDataStorageV2RSAKeyPairManager:SuccessfulRSAKeyPairGeneration");
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException | NoSuchProviderException e) {
            Log.w(yf.a("LocalDataStorageV2RSAKeyPairManager"), a0.a("Generating RSA key pair failed with ", e.getClass().getSimpleName(), ", retrying once"), e);
            jg.a("LocalDataStorageV2RSAKeyPairManager:RSAKeyPairGenerationRetryAttempt");
            KeyPairGenerator keyPairGenerator2 = KeyPairGenerator.getInstance(KeyUtils.ALGORITHM_RSA, "AndroidKeyStore");
            keyPairGenerator2.initialize(build);
            keyPairGenerator2.generateKeyPair();
            yf.b("LocalDataStorageV2RSAKeyPairManager", "Successfully retried key pair generation", "LocalDataStorageV2RSAKeyPairManager:SuccessfulRSAKeyPairGenerationRetry");
        }
        yf.b("LocalDataStorageV2RSAKeyPairManager", "Completed RSA Key pair generation successfully", "LocalDataStorageV2RSAKeyPairManager:OverallSuccessfulRSAKeyPairGeneration");
    }
}
