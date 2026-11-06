package org.objectweb.asm;

/* loaded from: classes11.dex */
final class Frame {

    /* renamed from: a, reason: collision with root package name */
    static final int[] f1180a;
    Label b;
    int[] c;
    int[] d;
    private int[] e;
    private int[] f;
    private int g;
    private int h;
    private int[] i;

    static {
        _clinit_();
        int[] iArr = new int[202];
        for (int i = 0; i < 202; i++) {
            iArr[i] = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE".charAt(i) - 'E';
        }
        f1180a = iArr;
    }

    private static int b(ClassWriter classWriter, String str) {
        int indexOf = str.charAt(0) == '(' ? str.indexOf(41) + 1 : 0;
        char charAt = str.charAt(indexOf);
        int i = 16777218;
        if (charAt == 'F') {
            return 16777218;
        }
        if (charAt == 'L') {
            return classWriter.c(str.substring(indexOf + 1, str.length() - 1)) | 24117248;
        }
        if (charAt != 'S') {
            if (charAt == 'V') {
                return 0;
            }
            if (charAt != 'Z' && charAt != 'I') {
                if (charAt == 'J') {
                    return 16777220;
                }
                switch (charAt) {
                    case 'B':
                    case 'C':
                        break;
                    case 'D':
                        return 16777219;
                    default:
                        int i2 = indexOf + 1;
                        while (str.charAt(i2) == '[') {
                            i2++;
                        }
                        char charAt2 = str.charAt(i2);
                        if (charAt2 != 'F') {
                            if (charAt2 == 'S') {
                                i = 16777228;
                            } else if (charAt2 == 'Z') {
                                i = 16777225;
                            } else if (charAt2 == 'I') {
                                i = 16777217;
                            } else if (charAt2 != 'J') {
                                switch (charAt2) {
                                    case 'B':
                                        i = 16777226;
                                        break;
                                    case 'C':
                                        i = 16777227;
                                        break;
                                    case 'D':
                                        i = 16777219;
                                        break;
                                    default:
                                        i = classWriter.c(str.substring(i2 + 1, str.length() - 1)) | 24117248;
                                        break;
                                }
                            } else {
                                i = 16777220;
                            }
                        }
                        return ((i2 - indexOf) << 28) | i;
                }
            }
        }
        return 16777217;
    }

    private void c(int i) {
        int i2 = this.g;
        if (i2 >= i) {
            this.g = i2 - i;
            return;
        }
        this.b.f -= i - i2;
        this.g = 0;
    }

    private void d(int i) {
        if (this.i == null) {
            this.i = new int[2];
        }
        int length = this.i.length;
        int i2 = this.h;
        if (i2 >= length) {
            int[] iArr = new int[Math.max(i2 + 1, length * 2)];
            System.arraycopy(this.i, 0, iArr, 0, length);
            this.i = iArr;
        }
        int[] iArr2 = this.i;
        int i3 = this.h;
        this.h = i3 + 1;
        iArr2[i3] = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r18, int r19, org.objectweb.asm.ClassWriter r20, org.objectweb.asm.Item r21) {
        /*
            Method dump skipped, instructions count: 1138
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.Frame.a(int, int, org.objectweb.asm.ClassWriter, org.objectweb.asm.Item):void");
    }

    public static /* synthetic */ void _clinit_() {
    }

    private void b(int i) {
        if (this.f == null) {
            this.f = new int[10];
        }
        int length = this.f.length;
        int i2 = this.g;
        if (i2 >= length) {
            int[] iArr = new int[Math.max(i2 + 1, length * 2)];
            System.arraycopy(this.f, 0, iArr, 0, length);
            this.f = iArr;
        }
        int[] iArr2 = this.f;
        int i3 = this.g;
        int i4 = i3 + 1;
        this.g = i4;
        iArr2[i3] = i;
        Label label = this.b;
        int i5 = label.f + i4;
        if (i5 > label.g) {
            label.g = i5;
        }
    }

    private int a(int i) {
        int[] iArr = this.e;
        if (iArr == null || i >= iArr.length) {
            return i | 33554432;
        }
        int i2 = iArr[i];
        if (i2 != 0) {
            return i2;
        }
        int i3 = 33554432 | i;
        iArr[i] = i3;
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[LOOP:0: B:6:0x0022->B:13:0x004d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int a(org.objectweb.asm.ClassWriter r7, int r8) {
        /*
            r6 = this;
            r0 = 16777222(0x1000006, float:2.3509904E-38)
            r1 = 24117248(0x1700000, float:4.4081038E-38)
            if (r8 != r0) goto Lf
            java.lang.String r0 = r7.I
        L9:
            int r7 = r7.c(r0)
            r7 = r7 | r1
            goto L21
        Lf:
            r0 = -1048576(0xfffffffffff00000, float:NaN)
            r0 = r0 & r8
            r2 = 25165824(0x1800000, float:4.7019774E-38)
            if (r0 != r2) goto L50
            org.objectweb.asm.Item[] r0 = r7.H
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r8
            r0 = r0[r2]
            java.lang.String r0 = r0.g
            goto L9
        L21:
            r0 = 0
        L22:
            int r1 = r6.h
            if (r0 >= r1) goto L50
            int[] r1 = r6.i
            r1 = r1[r0]
            r2 = -268435456(0xfffffffff0000000, float:-1.5845633E29)
            r2 = r2 & r1
            r3 = 251658240(0xf000000, float:6.3108872E-30)
            r3 = r3 & r1
            r4 = 33554432(0x2000000, float:9.403955E-38)
            r5 = 8388607(0x7fffff, float:1.1754942E-38)
            if (r3 != r4) goto L3e
            int[] r3 = r6.c
            r1 = r1 & r5
            r1 = r3[r1]
        L3c:
            int r1 = r1 + r2
            goto L4a
        L3e:
            r4 = 50331648(0x3000000, float:3.761582E-37)
            if (r3 != r4) goto L4a
            int[] r3 = r6.d
            int r4 = r3.length
            r1 = r1 & r5
            int r4 = r4 - r1
            r1 = r3[r4]
            goto L3c
        L4a:
            if (r8 != r1) goto L4d
            return r7
        L4d:
            int r0 = r0 + 1
            goto L22
        L50:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: org.objectweb.asm.Frame.a(org.objectweb.asm.ClassWriter, int):int");
    }

    private void a(int i, int i2) {
        if (this.e == null) {
            this.e = new int[10];
        }
        int length = this.e.length;
        if (i >= length) {
            int[] iArr = new int[Math.max(i + 1, length * 2)];
            System.arraycopy(this.e, 0, iArr, 0, length);
            this.e = iArr;
        }
        this.e[i] = i2;
    }

    private int a() {
        int i = this.g;
        if (i > 0) {
            int[] iArr = this.f;
            int i2 = i - 1;
            this.g = i2;
            return iArr[i2];
        }
        Label label = this.b;
        int i3 = label.f - 1;
        label.f = i3;
        return (-i3) | 50331648;
    }

    private void a(String str) {
        char charAt = str.charAt(0);
        if (charAt == '(') {
            c((Type.getArgumentsAndReturnSizes(str) >> 2) - 1);
        } else if (charAt == 'J' || charAt == 'D') {
            c(2);
        } else {
            c(1);
        }
    }

    public void a(ClassWriter classWriter, int i, Type[] typeArr, int i2) {
        int i3;
        int[] iArr = new int[i2];
        this.c = iArr;
        this.d = new int[0];
        if ((i & 8) == 0) {
            i3 = 1;
            if ((i & 524288) == 0) {
                iArr[0] = classWriter.c(classWriter.I) | 24117248;
            } else {
                iArr[0] = 16777222;
            }
        } else {
            i3 = 0;
        }
        for (Type type : typeArr) {
            int b = b(classWriter, type.getDescriptor());
            int[] iArr2 = this.c;
            int i4 = i3 + 1;
            iArr2[i3] = b;
            if (b == 16777220 || b == 16777219) {
                i3 += 2;
                iArr2[i4] = 16777216;
            } else {
                i3 = i4;
            }
        }
        while (i3 < i2) {
            this.c[i3] = 16777216;
            i3++;
        }
    }

    private void a(ClassWriter classWriter, String str) {
        int b = b(classWriter, str);
        if (b != 0) {
            b(b);
            if (b == 16777220 || b == 16777219) {
                b(16777216);
            }
        }
    }

    private static boolean a(ClassWriter classWriter, int i, int[] iArr, int i2) {
        int min;
        int i3 = iArr[i2];
        if (i3 == i) {
            return false;
        }
        if ((268435455 & i) == 16777221) {
            if (i3 == 16777221) {
                return false;
            }
            i = 16777221;
        }
        if (i3 == 0) {
            iArr[i2] = i;
            return true;
        }
        int i4 = i3 & 267386880;
        int i5 = 16777216;
        if (i4 == 24117248 || (i3 & (-268435456)) != 0) {
            if (i == 16777221) {
                return false;
            }
            if ((i & (-1048576)) != ((-1048576) & i3)) {
                int i6 = i & 267386880;
                if (i6 == 24117248 || (i & (-268435456)) != 0) {
                    int i7 = i & (-268435456);
                    int i8 = ((i7 == 0 || i6 == 24117248) ? 0 : -268435456) + i7;
                    int i9 = i3 & (-268435456);
                    min = Math.min(i8, ((i9 == 0 || i4 == 24117248) ? 0 : -268435456) + i9);
                    i5 = min | 24117248 | classWriter.c("java/lang/Object");
                }
            } else if (i4 == 24117248) {
                i5 = (i & (-268435456)) | 24117248 | classWriter.a(i & 1048575, 1048575 & i3);
            } else {
                min = (i3 & (-268435456)) - 268435456;
                i5 = min | 24117248 | classWriter.c("java/lang/Object");
            }
        } else if (i3 == 16777221) {
            if ((i & 267386880) != 24117248 && (i & (-268435456)) == 0) {
                i = 16777216;
            }
            i5 = i;
        }
        if (i3 == i5) {
            return false;
        }
        iArr[i2] = i5;
        return true;
    }

    public boolean a(ClassWriter classWriter, Frame frame, int i) {
        boolean z;
        int length = this.c.length;
        int length2 = this.d.length;
        boolean z2 = true;
        if (frame.c == null) {
            frame.c = new int[length];
            z = true;
        } else {
            z = false;
        }
        int i2 = 0;
        while (true) {
            int i3 = 16777216;
            if (i2 >= length) {
                break;
            }
            int[] iArr = this.e;
            if (iArr == null || i2 >= iArr.length) {
                i3 = this.c[i2];
            } else {
                int i4 = iArr[i2];
                if (i4 == 0) {
                    i3 = this.c[i2];
                } else {
                    int i5 = i4 & (-268435456);
                    int i6 = i4 & 251658240;
                    if (i6 == 16777216) {
                        i3 = i4;
                    } else {
                        int i7 = i5 + (i6 == 33554432 ? this.c[i4 & 8388607] : this.d[length2 - (i4 & 8388607)]);
                        if ((i4 & 8388608) == 0 || (i7 != 16777220 && i7 != 16777219)) {
                            i3 = i7;
                        }
                    }
                }
            }
            if (this.i != null) {
                i3 = a(classWriter, i3);
            }
            z |= a(classWriter, i3, frame.c, i2);
            i2++;
        }
        if (i > 0) {
            for (int i8 = 0; i8 < length; i8++) {
                z |= a(classWriter, this.c[i8], frame.c, i8);
            }
            if (frame.d == null) {
                frame.d = new int[1];
            } else {
                z2 = z;
            }
            return a(classWriter, i, frame.d, 0) | z2;
        }
        int length3 = this.d.length + this.b.f;
        if (frame.d == null) {
            frame.d = new int[this.g + length3];
        } else {
            z2 = z;
        }
        for (int i9 = 0; i9 < length3; i9++) {
            int i10 = this.d[i9];
            if (this.i != null) {
                i10 = a(classWriter, i10);
            }
            z2 |= a(classWriter, i10, frame.d, i9);
        }
        for (int i11 = 0; i11 < this.g; i11++) {
            int i12 = this.f[i11];
            int i13 = i12 & (-268435456);
            int i14 = i12 & 251658240;
            if (i14 != 16777216) {
                int i15 = i13 + (i14 == 33554432 ? this.c[i12 & 8388607] : this.d[length2 - (i12 & 8388607)]);
                i12 = ((i12 & 8388608) == 0 || !(i15 == 16777220 || i15 == 16777219)) ? i15 : 16777216;
            }
            if (this.i != null) {
                i12 = a(classWriter, i12);
            }
            z2 |= a(classWriter, i12, frame.d, length3 + i11);
        }
        return z2;
    }
}
