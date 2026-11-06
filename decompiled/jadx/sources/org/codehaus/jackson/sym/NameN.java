package org.codehaus.jackson.sym;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class NameN extends Name {
    final int mQuadLen;
    final int[] mQuads;

    public NameN(String str, int i, int[] iArr, int i2) {
        super(str, i);
        if (i2 < 3) {
            Single$$ExternalSyntheticBUOutline0.m$3("Qlen must >= 3");
            throw null;
        }
        this.mQuads = iArr;
        this.mQuadLen = i2;
    }

    @Override // org.codehaus.jackson.sym.Name
    public boolean equals(int[] iArr, int i) {
        if (i != this.mQuadLen) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (iArr[i2] != this.mQuads[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // org.codehaus.jackson.sym.Name
    public boolean equals(int i, int i2) {
        return false;
    }

    @Override // org.codehaus.jackson.sym.Name
    public boolean equals(int i) {
        return false;
    }
}
