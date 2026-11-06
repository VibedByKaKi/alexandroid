package com.amazon.alexa.presence.bleconn.identity.encryption;

import com.amazon.alexa.presence.bleconn.helpers.ByteHelper;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.nio.ByteBuffer;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
class RelationshipTokenCryptographyModule implements EncryptionModule, DecryptionModule {
    private static final String TRANSFORMATION_NO_PADDING = "AES/CBC/NoPadding";
    private static final String TRANSFORMATION_PADDING = "AES/CBC/PKCS5Padding";
    private final Cipher decryptionCipher;
    private final Cipher encryptionCipher;
    private final boolean padding;

    public RelationshipTokenCryptographyModule(byte[] bArr, boolean z) {
        this.padding = z;
        Objects.requireNonNull(bArr, "aes128key");
        this.encryptionCipher = aes128Cipher(bArr, 1);
        this.decryptionCipher = aes128Cipher(bArr, 2);
    }

    private Cipher aes128Cipher(byte[] bArr, int i) {
        try {
            Cipher cipher = this.padding ? Cipher.getInstance("AES/CBC/PKCS5Padding") : Cipher.getInstance(TRANSFORMATION_NO_PADDING);
            cipher.init(i, new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM), new IvParameterSpec(new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));
            return cipher;
        } catch (Throwable th) {
            Buffer$$ExternalSyntheticBUOutline0.m(th);
            return null;
        }
    }

    private static byte[] process(Cipher cipher, byte[] bArr) {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(cipher.getOutputSize(bArr.length));
            int i = 0;
            while (wrap.remaining() > 0) {
                i += cipher.update(wrap, allocate);
            }
            return ByteHelper.slice(allocate.array(), 0, i + cipher.doFinal(wrap, allocate));
        } catch (Throwable th) {
            Buffer$$ExternalSyntheticBUOutline0.m(th);
            return null;
        }
    }

    @Override // com.amazon.alexa.presence.bleconn.identity.encryption.DecryptionModule
    public byte[] decrypt(byte[] bArr) {
        return process(this.decryptionCipher, bArr);
    }

    @Override // com.amazon.alexa.presence.bleconn.identity.encryption.EncryptionModule
    public byte[] encrypt(byte[] bArr) {
        return process(this.encryptionCipher, bArr);
    }
}
