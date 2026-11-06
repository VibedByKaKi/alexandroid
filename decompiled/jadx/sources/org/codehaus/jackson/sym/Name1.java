package org.codehaus.jackson.sym;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class Name1 extends Name {
    static final Name1 sEmptyName = new Name1("", 0, 0);
    final int mQuad;

    public Name1(String str, int i, int i2) {
        super(str, i);
        this.mQuad = i2;
    }

    public static final Name1 getEmptyName() {
        return sEmptyName;
    }

    @Override // org.codehaus.jackson.sym.Name
    public boolean equals(int[] iArr, int i) {
        return i == 1 && iArr[0] == this.mQuad;
    }

    @Override // org.codehaus.jackson.sym.Name
    public boolean equals(int i, int i2) {
        return i == this.mQuad && i2 == 0;
    }

    @Override // org.codehaus.jackson.sym.Name
    public boolean equals(int i) {
        return i == this.mQuad;
    }
}
