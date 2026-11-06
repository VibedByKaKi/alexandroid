package com.amazon.alexa.client.alexaservice.base.device.data;

import android.content.Context;
import android.util.Log;
import com.amazon.alexa.client.crashreporting.CrashReporter;
import com.amazon.crypto.Crypto;
import com.amazon.crypto.symmetric.SymmetricKey;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableEntryException;
import java.security.cert.CertificateException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EncryptionAuthority {
    private static final String TAG = "EncryptionAuthority";
    private static final String aliasSecret = "secret_key";
    private static AESCipherStrategy cipherStrategy = null;
    private static KeyStore keyStore = null;
    private static final String keyStoreFileName = "A4ASDKKeyStore";
    private static final String password = "A4ASDK";
    private final Context context;
    private final CrashReporter crashReporter;
    private final KeyStore.ProtectionParameter protectionParameter = new KeyStore.PasswordProtection(password.toCharArray());
    private SymmetricKey symmetricKey;

    public EncryptionAuthority(@NotNull Context context, CrashReporter crashReporter) {
        this.context = context;
        this.crashReporter = crashReporter;
        cipherStrategy = new AESCipherStrategy(0);
        try {
            keyStore = KeyStore.getInstance(KeyStore.getDefaultType());
            initializeKey();
        } catch (IllegalArgumentException | SecurityException | KeyStoreException e) {
            Log.e(TAG, "Error initializing key", e);
            crashReporter.notifyHandledException(e);
        }
    }

    private void createKeyStoreFile(@NotNull SecretKey secretKey) {
        KeyStore.SecretKeyEntry secretKeyEntry = new KeyStore.SecretKeyEntry(secretKey);
        File file = new File(this.context.getFilesDir(), keyStoreFileName);
        try {
            keyStore.load(null, password.toCharArray());
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                keyStore.setEntry(aliasSecret, secretKeyEntry, this.protectionParameter);
                keyStore.store(fileOutputStream, password.toCharArray());
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            Log.e(TAG, "Error storing key into keystore", e);
            this.crashReporter.notifyHandledException(e);
        }
    }

    private void initializeKey() {
        SecretKey retrieveKeyFromKeyStore = retrieveKeyFromKeyStore();
        if (retrieveKeyFromKeyStore != null) {
            this.symmetricKey = SymmetricKey.from(Crypto.decode(retrieveKeyFromKeyStore.getEncoded()));
            return;
        }
        SymmetricKey generateSymmetricKey = Crypto.generateSymmetricKey();
        this.symmetricKey = generateSymmetricKey;
        byte[] encode = Crypto.encode(generateSymmetricKey.toBytes());
        if (encode != null) {
            createKeyStoreFile(new SecretKeySpec(encode, 0, encode.length, cipherStrategy.getAlgorithm()));
        } else {
            Log.e(TAG, "Error occurred while generating new Key");
            this.crashReporter.notifyHandledException(new Exception("Error occurred while generating new Key"));
        }
    }

    private SecretKey retrieveKeyFromKeyStore() {
        File file = new File(this.context.getFilesDir(), keyStoreFileName);
        if (!file.exists()) {
            Log.i(TAG, "Cannot retrieve key from keystore as File does not exists!");
            return null;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                keyStore.load(fileInputStream, password.toCharArray());
                keyStore.containsAlias(aliasSecret);
                SecretKey secretKey = ((KeyStore.SecretKeyEntry) keyStore.getEntry(aliasSecret, this.protectionParameter)).getSecretKey();
                fileInputStream.close();
                return secretKey;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | UnrecoverableEntryException | CertificateException e) {
            Log.e(TAG, "Error retrieving key from keystore", e);
            this.crashReporter.notifyHandledException(e);
            return null;
        }
    }

    public String decrypt(@NotNull String str) {
        if (StringUtils.isBlank(str)) {
            Log.e(TAG, "Decryption requires non null and non empty string");
            this.crashReporter.notifyHandledException(new IllegalArgumentException("Decryption requires non null and non empty string"));
            return null;
        }
        byte[] decode = Crypto.decode(str.getBytes(StandardCharsets.UTF_8));
        if (decode.length <= 0) {
            Log.e(TAG, "Error occurred while decrypting!");
            this.crashReporter.notifyHandledException(new Exception("Error occurred while decrypting!"));
            return "";
        }
        try {
            return cipherStrategy.toUTF8String(Crypto.decrypt(decode, this.symmetricKey));
        } catch (IllegalArgumentException | SecurityException e) {
            Log.e(TAG, "Error occurred while decrypting", e);
            this.crashReporter.notifyHandledException(e);
            return "";
        }
    }

    public String encrypt(@NotNull String str) {
        if (StringUtils.isBlank(str)) {
            Log.e(TAG, "Encryption requires non null and non empty string");
            this.crashReporter.notifyHandledException(new IllegalArgumentException("Encryption requires non null and non empty string"));
            return null;
        }
        byte[] encrypt = Crypto.encrypt(str.getBytes(StandardCharsets.UTF_8), this.symmetricKey);
        if (encrypt != null && encrypt.length > 0) {
            return cipherStrategy.toBase64EncodedUTF8String(encrypt);
        }
        Log.e(TAG, "Error occurred while encrypting!");
        this.crashReporter.notifyHandledException(new Exception("Error occurred while encrypting!"));
        return "";
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class AESCipherStrategy {
        private final String algorithm;

        private AESCipherStrategy() {
            this.algorithm = JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @NotNull
        public String getAlgorithm() {
            return JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @NotNull
        public String toBase64EncodedUTF8String(@NotNull byte[] bArr) {
            return new String(Crypto.encode(bArr), StandardCharsets.UTF_8);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @NotNull
        public String toUTF8String(@NotNull byte[] bArr) {
            return new String(bArr, StandardCharsets.UTF_8);
        }

        public /* synthetic */ AESCipherStrategy(int i) {
            this();
        }
    }
}
