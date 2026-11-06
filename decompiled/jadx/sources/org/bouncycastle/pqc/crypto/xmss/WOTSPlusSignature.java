package org.bouncycastle.pqc.crypto.xmss;

import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
final class WOTSPlusSignature {
    private byte[][] signature;

    public WOTSPlusSignature(WOTSPlusParameters wOTSPlusParameters, byte[][] bArr) {
        if (wOTSPlusParameters == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("params == null");
            throw null;
        }
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("signature == null");
            throw null;
        }
        if (XMSSUtil.hasNullPointer(bArr)) {
            Single$$ExternalSyntheticBUOutline0.m$1("signature byte array == null");
            throw null;
        }
        if (bArr.length != wOTSPlusParameters.getLen()) {
            Single$$ExternalSyntheticBUOutline0.m$3("wrong signature size");
            throw null;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != wOTSPlusParameters.getTreeDigestSize()) {
                Single$$ExternalSyntheticBUOutline0.m$3("wrong signature format");
                throw null;
            }
        }
        this.signature = XMSSUtil.cloneArray(bArr);
    }

    public byte[][] toByteArray() {
        return XMSSUtil.cloneArray(this.signature);
    }
}
