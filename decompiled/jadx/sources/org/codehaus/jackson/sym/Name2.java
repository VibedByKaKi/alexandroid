package org.codehaus.jackson.sym;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public final class Name2 extends Name {
    final int mQuad1;
    final int mQuad2;

    public Name2(String str, int i, int i2, int i3) {
        super(str, i);
        this.mQuad1 = i2;
        this.mQuad2 = i3;
    }

    @Override // org.codehaus.jackson.sym.Name
    public boolean equals(int[] iArr, int i) {
        return i == 2 && iArr[0] == this.mQuad1 && iArr[1] == this.mQuad2;
    }

    @Override // org.codehaus.jackson.sym.Name
    public boolean equals(int i, int i2) {
        return i == this.mQuad1 && i2 == this.mQuad2;
    }

    @Override // org.codehaus.jackson.sym.Name
    public boolean equals(int i) {
        return false;
    }
}
