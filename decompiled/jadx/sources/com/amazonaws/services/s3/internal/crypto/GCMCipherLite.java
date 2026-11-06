package com.amazonaws.services.s3.internal.crypto;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import okio.Path$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes6.dex */
final class GCMCipherLite extends CipherLite {
    private static final int BITS = 8;
    private static final int TAG_LENGTH = ContentCryptoScheme.AES_GCM.getTagLengthInBits() / 8;
    private CipherLite aux;
    private long currentCount;
    private boolean doneFinal;
    private byte[] finalBytes;
    private boolean invisiblyProcessed;
    private long markedCount;
    private long outputByteCount;
    private boolean securityViolated;
    private final int tagLen;

    public GCMCipherLite(Cipher cipher, SecretKey secretKey, int i) {
        super(cipher, ContentCryptoScheme.AES_GCM, secretKey, i);
        this.tagLen = i == 1 ? TAG_LENGTH : 0;
        if (i == 1 || i == 2) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m();
        throw null;
    }

    private int checkMax(int i) {
        if (this.outputByteCount + i <= 68719476704L) {
            return i;
        }
        this.securityViolated = true;
        throw new SecurityException("Number of bytes processed has exceeded the maximum allowed by AES/GCM; [outputByteCount=" + this.outputByteCount + ", delta=" + i + MarkdownConstants.RIGHT_BRACKET);
    }

    private final byte[] doFinal0(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        if (!this.doneFinal) {
            this.doneFinal = true;
            byte[] doFinal = super.doFinal(bArr, i, i2);
            this.finalBytes = doFinal;
            if (doFinal == null) {
                return null;
            }
            this.outputByteCount += checkMax(doFinal.length - this.tagLen);
            return (byte[]) this.finalBytes.clone();
        }
        if (this.securityViolated) {
            throw new SecurityException();
        }
        int cipherMode = getCipherMode();
        byte[] bArr2 = this.finalBytes;
        if (2 == cipherMode) {
            if (bArr2 == null) {
                return null;
            }
            return (byte[]) bArr2.clone();
        }
        int length = bArr2.length;
        int i3 = this.tagLen;
        int i4 = length - i3;
        if (i2 == i4) {
            return (byte[]) bArr2.clone();
        }
        if (i2 < i4 && i2 + this.currentCount == this.outputByteCount) {
            return Arrays.copyOfRange(bArr2, (bArr2.length - i3) - i2, bArr2.length);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Inconsistent re-rencryption");
        return null;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public byte[] doFinal() throws IllegalBlockSizeException, BadPaddingException {
        if (this.doneFinal) {
            if (this.securityViolated) {
                throw new SecurityException();
            }
            byte[] bArr = this.finalBytes;
            if (bArr == null) {
                return null;
            }
            return (byte[]) bArr.clone();
        }
        this.doneFinal = true;
        byte[] doFinal = super.doFinal();
        this.finalBytes = doFinal;
        if (doFinal == null) {
            return null;
        }
        this.outputByteCount += checkMax(doFinal.length - this.tagLen);
        return (byte[]) this.finalBytes.clone();
    }

    public long getCurrentCount() {
        return this.currentCount;
    }

    public byte[] getFinalBytes() {
        byte[] bArr = this.finalBytes;
        if (bArr == null) {
            return null;
        }
        return (byte[]) bArr.clone();
    }

    public long getMarkedCount() {
        return this.markedCount;
    }

    public long getOutputByteCount() {
        return this.outputByteCount;
    }

    public byte[] getTag() {
        byte[] bArr;
        if (getCipherMode() != 1 || (bArr = this.finalBytes) == null) {
            return null;
        }
        return Arrays.copyOfRange(bArr, bArr.length - this.tagLen, bArr.length);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public long mark() {
        long j = this.aux == null ? this.outputByteCount : this.currentCount;
        this.markedCount = j;
        return j;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public boolean markSupported() {
        return true;
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public void reset() {
        long j = this.markedCount;
        if (j < this.outputByteCount || this.invisiblyProcessed) {
            try {
                this.aux = createAuxiliary(j);
                this.currentCount = this.markedCount;
            } catch (Exception e) {
                if (!(e instanceof RuntimeException)) {
                    throw new IllegalStateException(e);
                }
            }
        }
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public byte[] update(byte[] bArr, int i, int i2) {
        CipherLite cipherLite = this.aux;
        r1 = false;
        boolean z = false;
        if (cipherLite == null) {
            byte[] update = super.update(bArr, i, i2);
            if (update == null) {
                this.invisiblyProcessed = bArr.length > 0;
                return null;
            }
            this.outputByteCount += checkMax(update.length);
            if (update.length == 0 && i2 > 0) {
                z = true;
            }
            this.invisiblyProcessed = z;
            return update;
        }
        byte[] update2 = cipherLite.update(bArr, i, i2);
        if (update2 == null) {
            return null;
        }
        long length = this.currentCount + update2.length;
        this.currentCount = length;
        long j = this.outputByteCount;
        if (length == j) {
            this.aux = null;
            return update2;
        }
        if (length <= j) {
            return update2;
        }
        if (1 == getCipherMode()) {
            throw new IllegalStateException("currentCount=" + this.currentCount + " > outputByteCount=" + this.outputByteCount);
        }
        byte[] bArr2 = this.finalBytes;
        int length2 = bArr2 != null ? bArr2.length : 0;
        long j2 = this.outputByteCount;
        long length3 = j2 - (this.currentCount - update2.length);
        long j3 = length2;
        this.currentCount = j2 - j3;
        this.aux = null;
        return Arrays.copyOf(update2, (int) (length3 - j3));
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public final byte[] doFinal(byte[] bArr) throws IllegalBlockSizeException, BadPaddingException {
        return doFinal0(bArr, 0, bArr.length);
    }

    @Override // com.amazonaws.services.s3.internal.crypto.CipherLite
    public final byte[] doFinal(byte[] bArr, int i, int i2) throws IllegalBlockSizeException, BadPaddingException {
        return doFinal0(bArr, i, i2);
    }
}
