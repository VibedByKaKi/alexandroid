package com.amazon.alexa.accessory.crypto.persistence;

import android.security.keystore.KeyProtection;
import com.amazon.alexa.accessory.crypto.cipher.SupportedCipherSuite;
import com.google.android.gms.stats.CodePackage;
import com.google.common.base.Supplier;
import java.security.KeyStore;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
class KeyStoreProtectionParamsBuilder {
    private static final Supplier<KeyStore.ProtectionParameter> AES_CBC_PKCS_7_PADDING_PROTECTION_PARAMS = new KeyWrapper$$ExternalSyntheticLambda0(1);
    private static final Supplier<KeyStore.ProtectionParameter> AES_GCM_NOPADDING_PROTECTION_PARAMS = new KeyWrapper$$ExternalSyntheticLambda0(2);
    private static final Map<SupportedCipherSuite, Supplier<KeyStore.ProtectionParameter>> DECRYPTION_PROTECTION_PARAMS = Collections.unmodifiableMap(new EnumMap<SupportedCipherSuite, Supplier<KeyStore.ProtectionParameter>>(SupportedCipherSuite.class) { // from class: com.amazon.alexa.accessory.crypto.persistence.KeyStoreProtectionParamsBuilder.1
        {
            put((AnonymousClass1) SupportedCipherSuite.SYMMETRIC_WITH_AES_128_CBC_PKCS7PADDING_SHA256, (SupportedCipherSuite) KeyStoreProtectionParamsBuilder.AES_CBC_PKCS_7_PADDING_PROTECTION_PARAMS);
            put((AnonymousClass1) SupportedCipherSuite.SYMMETRIC_WITH_AES_256_CBC_PKCS7PADDING_SHA256, (SupportedCipherSuite) KeyStoreProtectionParamsBuilder.AES_CBC_PKCS_7_PADDING_PROTECTION_PARAMS);
            put((AnonymousClass1) SupportedCipherSuite.SYMMETRIC_WITH_AES_128_GCM_SHA256, (SupportedCipherSuite) KeyStoreProtectionParamsBuilder.AES_GCM_NOPADDING_PROTECTION_PARAMS);
            put((AnonymousClass1) SupportedCipherSuite.SYMMETRIC_WITH_AES_256_GCM_SHA256, (SupportedCipherSuite) KeyStoreProtectionParamsBuilder.AES_GCM_NOPADDING_PROTECTION_PARAMS);
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ KeyStore.ProtectionParameter lambda$static$0() {
        return new KeyProtection.Builder(3).setBlockModes("CBC").setEncryptionPaddings("PKCS7Padding").build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ KeyStore.ProtectionParameter lambda$static$1() {
        return new KeyProtection.Builder(3).setBlockModes(CodePackage.GCM).setEncryptionPaddings("NoPadding").build();
    }

    public KeyStore.ProtectionParameter forAuthenticationKey(SupportedCipherSuite supportedCipherSuite) {
        return new KeyProtection.Builder(12).setDigests("SHA-256").build();
    }

    public KeyStore.ProtectionParameter forDecryptionKey(SupportedCipherSuite supportedCipherSuite) {
        return DECRYPTION_PROTECTION_PARAMS.get(supportedCipherSuite).get();
    }
}
