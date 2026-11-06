package com.amazon.crypto.asymmetric;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.AtomicFile$$ExternalSyntheticBUOutline0;
import com.amazon.crypto.KeyManager;
import com.amazon.crypto.utils.Preconditions;
import com.amazon.whispercloak.KeyUtils;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.PrivateKey;
import java.security.spec.AlgorithmParameterSpec;
import javax.security.auth.x500.X500Principal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(api = 22)
/* loaded from: classes19.dex */
public final class AsymmetricKeysManager implements KeyManager<AsymmetricKeys> {
    private static final String ANDROID_KEY_STORE = "AndroidKeyStore";
    private final Context context;
    private final KeyStore keyStore;

    @VisibleForTesting
    public AsymmetricKeysManager(Context context, KeyStore keyStore) {
        this.context = context;
        this.keyStore = keyStore;
    }

    private static KeyStore androidKeyStore() {
        try {
            KeyStore keyStore = KeyStore.getInstance(ANDROID_KEY_STORE);
            keyStore.load(null);
            return keyStore;
        } catch (IOException e) {
            throw new SecurityException(e);
        } catch (GeneralSecurityException e2) {
            throw new SecurityException(e2);
        }
    }

    @RequiresApi(23)
    private AlgorithmParameterSpec createSpec(String str) {
        return new KeyGenParameterSpec.Builder(str, 3).setKeySize(2048).setCertificateSubject(new X500Principal(a$$ExternalSyntheticOutline0.m("CN=", str))).setCertificateSerialNumber(BigInteger.ONE).setDigests("SHA-1").setEncryptionPaddings("OAEPPadding").setRandomizedEncryptionRequired(false).build();
    }

    @NonNull
    public static AsymmetricKeysManager with(@NonNull Context context) {
        Preconditions.notNull(context);
        return new AsymmetricKeysManager(context, androidKeyStore());
    }

    @Override // com.amazon.crypto.KeyManager
    public boolean contains(@Nullable String str) throws SecurityException {
        try {
            Preconditions.notBlank(str);
            try {
                return this.keyStore.containsAlias(str);
            } catch (KeyStoreException e) {
                throw new SecurityException(e);
            }
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.crypto.KeyManager
    @NonNull
    @RequiresApi(23)
    public AsymmetricKeys generate(@NonNull String str) throws IllegalArgumentException, SecurityException {
        Preconditions.notBlank(str);
        Preconditions.isTrue(!contains(str));
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(KeyUtils.ALGORITHM_RSA, ANDROID_KEY_STORE);
            keyPairGenerator.initialize(createSpec(str));
            keyPairGenerator.generateKeyPair();
            return retrieve(str);
        } catch (GeneralSecurityException e) {
            throw new SecurityException(e);
        }
    }

    @Override // com.amazon.crypto.KeyManager
    public void remove(@NonNull String str) throws IllegalArgumentException, SecurityException {
        Preconditions.notBlank(str);
        Preconditions.isTrue(contains(str));
        try {
            this.keyStore.deleteEntry(str);
        } catch (KeyStoreException e) {
            throw new SecurityException(e);
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amazon.crypto.KeyManager
    @NonNull
    public AsymmetricKeys retrieve(@Nullable String str) throws IllegalArgumentException, SecurityException {
        Preconditions.notBlank(str);
        Preconditions.isTrue(contains(str));
        try {
            if (this.keyStore.entryInstanceOf(str, KeyStore.PrivateKeyEntry.class)) {
                try {
                    try {
                        return AsymmetricKeys.from(PublishedKey.from(this.keyStore.getCertificate(str).getPublicKey().getEncoded()), WithheldKey.from((PrivateKey) this.keyStore.getKey(str, null)));
                    } catch (GeneralSecurityException e) {
                        throw new SecurityException(e);
                    }
                } catch (GeneralSecurityException e2) {
                    throw new SecurityException(e2);
                }
            }
        } catch (Throwable unused) {
        }
        AtomicFile$$ExternalSyntheticBUOutline0.m(a$$ExternalSyntheticOutline0.m("Bad key found for alias ", str));
        return null;
    }
}
