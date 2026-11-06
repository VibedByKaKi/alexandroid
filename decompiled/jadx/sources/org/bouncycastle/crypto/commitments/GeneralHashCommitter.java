package org.bouncycastle.crypto.commitments;

import java.security.SecureRandom;
import org.bouncycastle.asn1.ocsp.CrlID$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.Commitment;
import org.bouncycastle.crypto.Committer;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;

/* loaded from: classes11.dex */
public class GeneralHashCommitter implements Committer {
    private final int byteLength;
    private final Digest digest;
    private final SecureRandom random;

    public GeneralHashCommitter(ExtendedDigest extendedDigest, SecureRandom secureRandom) {
        this.digest = extendedDigest;
        this.byteLength = extendedDigest.getByteLength();
        this.random = secureRandom;
    }

    private byte[] calculateCommitment(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[this.digest.getDigestSize()];
        this.digest.update(bArr, 0, bArr.length);
        this.digest.update(bArr2, 0, bArr2.length);
        this.digest.update((byte) (bArr2.length >>> 8));
        this.digest.update((byte) bArr2.length);
        this.digest.doFinal(bArr3, 0);
        return bArr3;
    }

    @Override // org.bouncycastle.crypto.Committer
    public Commitment commit(byte[] bArr) {
        int length = bArr.length;
        int i = this.byteLength;
        if (length > i / 2) {
            CrlID$$ExternalSyntheticBUOutline0.m$3("Message to be committed to too large for digest.");
            return null;
        }
        byte[] bArr2 = new byte[i - bArr.length];
        this.random.nextBytes(bArr2);
        return new Commitment(bArr2, calculateCommitment(bArr2, bArr));
    }

    @Override // org.bouncycastle.crypto.Committer
    public boolean isRevealed(Commitment commitment, byte[] bArr) {
        if (bArr.length + commitment.getSecret().length == this.byteLength) {
            return Arrays.constantTimeAreEqual(commitment.getCommitment(), calculateCommitment(commitment.getSecret(), bArr));
        }
        CrlID$$ExternalSyntheticBUOutline0.m$3("Message and witness secret lengths do not match.");
        return false;
    }
}
