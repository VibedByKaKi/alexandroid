package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class RainbowParameterSpec implements AlgorithmParameterSpec {
    private static final int[] DEFAULT_VI = {6, 12, 17, 22, 33};
    private int[] vi;

    public RainbowParameterSpec(int[] iArr) {
        this.vi = iArr;
        checkParams();
    }

    private void checkParams() {
        String str;
        int[] iArr;
        int i;
        int[] iArr2 = this.vi;
        if (iArr2 == null) {
            str = "no layers defined.";
        } else if (iArr2.length > 1) {
            int i2 = 0;
            do {
                iArr = this.vi;
                if (i2 >= iArr.length - 1) {
                    return;
                }
                i = iArr[i2];
                i2++;
            } while (i < iArr[i2]);
            str = "v[i] has to be smaller than v[i+1]";
        } else {
            str = "Rainbow needs at least 1 layer, such that v1 < v2.";
        }
        Single$$ExternalSyntheticBUOutline0.m$3(str);
    }

    public int getDocumentLength() {
        int[] iArr = this.vi;
        return iArr[iArr.length - 1] - iArr[0];
    }

    public int getNumOfLayers() {
        return this.vi.length - 1;
    }

    public int[] getVi() {
        return Arrays.clone(this.vi);
    }

    public RainbowParameterSpec() {
        this.vi = DEFAULT_VI;
    }
}
