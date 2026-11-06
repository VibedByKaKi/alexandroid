package com.amazon.alexa.accessory.crypto.cipher;

import com.amazon.alexa.accessory.internal.util.Preconditions;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'SYMMETRIC_WITH_AES_256_GCM_SHA256' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class SupportedCipherSuite {
    private static final /* synthetic */ SupportedCipherSuite[] $VALUES;
    public static final SupportedCipherSuite SYMMETRIC_WITH_AES_128_CBC_PKCS7PADDING_SHA256;
    public static final SupportedCipherSuite SYMMETRIC_WITH_AES_128_GCM_SHA256;
    public static final SupportedCipherSuite SYMMETRIC_WITH_AES_256_CBC_PKCS7PADDING_SHA256;
    public static final SupportedCipherSuite SYMMETRIC_WITH_AES_256_GCM_SHA256;
    public final AlgorithmParameterSpecBuilder algorithmParameterSpecBuilder;
    public final String descriptor;
    public final String encryptionAlgorithm;
    public final int encryptionKeyStrengthInBytes;
    public final String keyExchangeAlgorithm;
    public final String keyExchangeSignatureAlgorithm;
    public final String macAlgorithm;
    public final int macKeyStrengthInBytes;

    private static /* synthetic */ SupportedCipherSuite[] $values() {
        return new SupportedCipherSuite[]{SYMMETRIC_WITH_AES_256_GCM_SHA256, SYMMETRIC_WITH_AES_256_CBC_PKCS7PADDING_SHA256, SYMMETRIC_WITH_AES_128_GCM_SHA256, SYMMETRIC_WITH_AES_128_CBC_PKCS7PADDING_SHA256};
    }

    static {
        AlgorithmParameterSpecBuilder algorithmParameterSpecBuilder = AlgorithmParameterSpecBuilder.GCM_PARAMETER_BUILDER;
        SYMMETRIC_WITH_AES_256_GCM_SHA256 = new SupportedCipherSuite("SYMMETRIC_WITH_AES_256_GCM_SHA256", 0, "SYMMETRIC_WITH_AES_256_GCM_SHA256", "Symmetric", "HmacSHA256", JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM, 32, algorithmParameterSpecBuilder, "HmacSHA256", 32);
        AlgorithmParameterSpecBuilder algorithmParameterSpecBuilder2 = AlgorithmParameterSpecBuilder.IV_PARAMETER_BUILDER;
        SYMMETRIC_WITH_AES_256_CBC_PKCS7PADDING_SHA256 = new SupportedCipherSuite("SYMMETRIC_WITH_AES_256_CBC_PKCS7PADDING_SHA256", 1, "SYMMETRIC_WITH_AES_256_CBC_PKCS7PADDING_SHA256", "Symmetric", "HmacSHA256", JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM, 32, algorithmParameterSpecBuilder2, "HmacSHA256", 32);
        SYMMETRIC_WITH_AES_128_GCM_SHA256 = new SupportedCipherSuite("SYMMETRIC_WITH_AES_128_GCM_SHA256", 2, "SYMMETRIC_WITH_AES_128_GCM_SHA256", "Symmetric", "HmacSHA256", JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM, 16, algorithmParameterSpecBuilder, "HmacSHA256", 32);
        SYMMETRIC_WITH_AES_128_CBC_PKCS7PADDING_SHA256 = new SupportedCipherSuite("SYMMETRIC_WITH_AES_128_CBC_PKCS7PADDING_SHA256", 3, "SYMMETRIC_WITH_AES_128_CBC_PKCS7PADDING_SHA256", "Symmetric", "HmacSHA256", JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM, 16, algorithmParameterSpecBuilder2, "HmacSHA256", 32);
        $VALUES = $values();
    }

    private SupportedCipherSuite(String str, int i, String str2, String str3, String str4, String str5, int i2, AlgorithmParameterSpecBuilder algorithmParameterSpecBuilder, String str6, int i3) {
        Preconditions.notNull(str2, "descriptor");
        Preconditions.notNull(str3, "keyExchangeAlgorithm");
        Preconditions.notNull(str4, "keyExchangeSignatureAlgorithm");
        Preconditions.notNull(str5, "encryptionAlgorithm");
        Preconditions.notNegative(i2, "encryptionKeyStrengthInBytes");
        Preconditions.notNull(algorithmParameterSpecBuilder, "algorithmParameterSpecBuilder");
        Preconditions.notNull(str6, "macAlgorithm");
        Preconditions.notNegative(i3, "macKeyStrengthInBytes");
        this.descriptor = str2;
        this.keyExchangeAlgorithm = str3;
        this.keyExchangeSignatureAlgorithm = str4;
        this.encryptionAlgorithm = str5;
        this.encryptionKeyStrengthInBytes = i2;
        this.algorithmParameterSpecBuilder = algorithmParameterSpecBuilder;
        this.macAlgorithm = str6;
        this.macKeyStrengthInBytes = i3;
    }

    public static SupportedCipherSuite valueOf(String str) {
        return (SupportedCipherSuite) Enum.valueOf(SupportedCipherSuite.class, str);
    }

    public static SupportedCipherSuite[] values() {
        return (SupportedCipherSuite[]) $VALUES.clone();
    }
}
