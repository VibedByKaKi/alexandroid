package com.amazon.imageutilities;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class BoyerMooreHorspool {
    private int index(byte b) {
        return b & 255;
    }

    public Object processBytes(byte[] bArr) {
        if (bArr.length <= 2) {
            return null;
        }
        int[] iArr = new int[256];
        for (int i = 0; i < 256; i++) {
            iArr[i] = bArr.length;
        }
        for (int i2 = 0; i2 < bArr.length - 1; i2++) {
            iArr[index(bArr[i2])] = (bArr.length - i2) - 1;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0056, code lost:
    
        return r4 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int searchBytes(com.amazon.imageutilities.ByteProvider r8, int r9, int r10, int r11, byte[] r12, java.lang.Object r13) {
        /*
            r7 = this;
            int r0 = r12.length
            r1 = 0
            r2 = -1
            r3 = 1
            if (r0 != r3) goto L18
            int r7 = java.lang.Math.min(r9, r11)
        La:
            if (r10 >= r7) goto L63
            byte r9 = r8.get(r10)
            r11 = r12[r1]
            if (r9 != r11) goto L15
            return r10
        L15:
            int r10 = r10 + 1
            goto La
        L18:
            int r0 = r12.length
            r4 = 2
            if (r0 != r4) goto L39
            int r7 = java.lang.Math.min(r9, r11)
            int r7 = r7 - r3
        L21:
            if (r10 >= r7) goto L63
            byte r9 = r8.get(r10)
            r11 = r12[r1]
            if (r9 != r11) goto L36
            int r9 = r10 + 1
            byte r9 = r8.get(r9)
            r11 = r12[r3]
            if (r9 != r11) goto L36
            return r10
        L36:
            int r10 = r10 + 1
            goto L21
        L39:
            int[] r13 = (int[]) r13
            int r9 = r12.length
            int r9 = r9 - r3
            r0 = r9
        L3e:
            if (r0 >= r11) goto L63
            r1 = r9
            r4 = r0
        L42:
            if (r1 < 0) goto L53
            byte r5 = r8.get(r4)
            r6 = r12[r1]
            if (r5 != r6) goto L53
            if (r4 < r10) goto L53
            int r4 = r4 + (-1)
            int r1 = r1 + (-1)
            goto L42
        L53:
            if (r1 != r2) goto L57
            int r4 = r4 + r3
            return r4
        L57:
            byte r1 = r8.get(r0)
            int r1 = r7.index(r1)
            r1 = r13[r1]
            int r0 = r0 + r1
            goto L3e
        L63:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.imageutilities.BoyerMooreHorspool.searchBytes(com.amazon.imageutilities.ByteProvider, int, int, int, byte[], java.lang.Object):int");
    }
}
