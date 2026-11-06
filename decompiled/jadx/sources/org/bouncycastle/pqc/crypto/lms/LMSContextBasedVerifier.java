package org.bouncycastle.pqc.crypto.lms;

/* loaded from: classes11.dex */
public interface LMSContextBasedVerifier {
    LMSContext generateLMSContext(byte[] bArr);

    boolean verify(LMSContext lMSContext);
}
