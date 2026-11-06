package org.objectweb.asm;

import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class Label {

    /* renamed from: a, reason: collision with root package name */
    int f1184a;
    int b;
    int c;
    private int d;
    private int[] e;
    int f;
    int g;
    Frame h;
    Label i;
    public Object info;
    Edge j;
    Label k;

    public boolean a(MethodWriter methodWriter, int i, byte[] bArr) {
        this.f1184a |= 2;
        this.c = i;
        int i2 = 0;
        boolean z = false;
        while (i2 < this.d) {
            int[] iArr = this.e;
            int i3 = i2 + 1;
            int i4 = iArr[i2];
            i2 += 2;
            int i5 = iArr[i3];
            if (i4 >= 0) {
                int i6 = i - i4;
                if (i6 < -32768 || i6 > 32767) {
                    int i7 = i5 - 1;
                    int i8 = bArr[i7] & 255;
                    if (i8 <= 168) {
                        bArr[i7] = (byte) (i8 + 49);
                    } else {
                        bArr[i7] = (byte) (i8 + 20);
                    }
                    z = true;
                }
                bArr[i5] = (byte) (i6 >>> 8);
                bArr[i5 + 1] = (byte) i6;
            } else {
                int i9 = i4 + i + 1;
                bArr[i5] = (byte) (i9 >>> 24);
                bArr[i5 + 1] = (byte) (i9 >>> 16);
                bArr[i5 + 2] = (byte) (i9 >>> 8);
                bArr[i5 + 3] = (byte) i9;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(org.objectweb.asm.Label r5, long r6, int r8) {
        /*
            r4 = this;
        L0:
            if (r4 == 0) goto L5b
            org.objectweb.asm.Label r0 = r4.k
            r1 = 0
            r4.k = r1
            if (r5 == 0) goto L34
            int r1 = r4.f1184a
            r2 = r1 & 2048(0x800, float:2.87E-42)
            if (r2 == 0) goto L10
            goto L3a
        L10:
            r1 = r1 | 2048(0x800, float:2.87E-42)
            r4.f1184a = r1
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L3f
            boolean r1 = r4.a(r5)
            if (r1 != 0) goto L3f
            org.objectweb.asm.Edge r1 = new org.objectweb.asm.Edge
            r1.<init>()
            int r2 = r4.f
            r1.f1179a = r2
            org.objectweb.asm.Edge r2 = r5.j
            org.objectweb.asm.Label r2 = r2.b
            r1.b = r2
            org.objectweb.asm.Edge r2 = r4.j
            r1.c = r2
            r4.j = r1
            goto L3f
        L34:
            boolean r1 = r4.a(r6)
            if (r1 == 0) goto L3c
        L3a:
            r4 = r0
            goto L0
        L3c:
            r4.a(r6, r8)
        L3f:
            org.objectweb.asm.Edge r1 = r4.j
        L41:
            if (r1 == 0) goto L3a
            int r2 = r4.f1184a
            r2 = r2 & 128(0x80, float:1.8E-43)
            if (r2 == 0) goto L4f
            org.objectweb.asm.Edge r2 = r4.j
            org.objectweb.asm.Edge r2 = r2.c
            if (r1 == r2) goto L58
        L4f:
            org.objectweb.asm.Label r2 = r1.b
            org.objectweb.asm.Label r3 = r2.k
            if (r3 != 0) goto L58
            r2.k = r0
            r0 = r2
        L58:
            org.objectweb.asm.Edge r1 = r1.c
            goto L41
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.Label.b(org.objectweb.asm.Label, long, int):void");
    }

    public int getOffset() {
        if ((this.f1184a & 2) != 0) {
            return this.c;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Label offset position has not been resolved yet");
        return 0;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("L");
        stringBuffer.append(System.identityHashCode(this));
        return stringBuffer.toString();
    }

    private void a(int i, int i2) {
        if (this.e == null) {
            this.e = new int[6];
        }
        int i3 = this.d;
        int[] iArr = this.e;
        if (i3 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.e = iArr2;
        }
        int[] iArr3 = this.e;
        int i4 = this.d;
        int i5 = i4 + 1;
        this.d = i5;
        iArr3[i4] = i;
        this.d = i4 + 2;
        iArr3[i5] = i2;
    }

    public void a(long j, int i) {
        int i2 = this.f1184a;
        if ((i2 & 1024) == 0) {
            this.f1184a = i2 | 1024;
            this.e = new int[(i / 32) + 1];
        }
        int[] iArr = this.e;
        int i3 = (int) (j >>> 32);
        iArr[i3] = ((int) j) | iArr[i3];
    }

    public void a(MethodWriter methodWriter, ByteVector byteVector, int i, boolean z) {
        if ((this.f1184a & 2) != 0) {
            int i2 = this.c - i;
            if (z) {
                byteVector.putInt(i2);
                return;
            } else {
                byteVector.putShort(i2);
                return;
            }
        }
        if (z) {
            a((-1) - i, byteVector.b);
            byteVector.putInt(-1);
        } else {
            a(i, byteVector.b);
            byteVector.putShort(-1);
        }
    }

    public boolean a(long j) {
        return ((this.f1184a & 1024) == 0 || (this.e[(int) (j >>> 32)] & ((int) j)) == 0) ? false : true;
    }

    public boolean a(Label label) {
        if ((this.f1184a & 1024) != 0 && (label.f1184a & 1024) != 0) {
            int i = 0;
            while (true) {
                int[] iArr = this.e;
                if (i >= iArr.length) {
                    break;
                }
                if ((iArr[i] & label.e[i]) != 0) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public Label a() {
        Frame frame = this.h;
        return frame == null ? this : frame.b;
    }
}
