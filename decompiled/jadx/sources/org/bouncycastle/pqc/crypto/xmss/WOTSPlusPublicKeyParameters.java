package org.bouncycastle.pqc.crypto.xmss;

import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
final class WOTSPlusPublicKeyParameters {
    private final byte[][] publicKey;

    public WOTSPlusPublicKeyParameters(WOTSPlusParameters wOTSPlusParameters, byte[][] bArr) {
        if (wOTSPlusParameters == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("params == null");
            throw null;
        }
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("publicKey == null");
            throw null;
        }
        if (XMSSUtil.hasNullPointer(bArr)) {
            Single$$ExternalSyntheticBUOutline0.m$1("publicKey byte array == null");
            throw null;
        }
        if (bArr.length != wOTSPlusParameters.getLen()) {
            Single$$ExternalSyntheticBUOutline0.m$3("wrong publicKey size");
            throw null;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != wOTSPlusParameters.getTreeDigestSize()) {
                Single$$ExternalSyntheticBUOutline0.m$3("wrong publicKey format");
                throw null;
            }
        }
        this.publicKey = XMSSUtil.cloneArray(bArr);
    }

    public byte[][] toByteArray() {
        return XMSSUtil.cloneArray(this.publicKey);
    }
}
