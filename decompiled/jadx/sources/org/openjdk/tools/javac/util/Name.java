package org.openjdk.tools.javac.util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public abstract class Name implements org.openjdk.javax.lang.model.element.Name {
    public final Table table;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static abstract class Table {
        public final Names names;

        public Table(Names names) {
            this.names = names;
        }

        public static boolean equals(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
            int i4 = 0;
            while (i4 < i3 && bArr[i + i4] == bArr2[i2 + i4]) {
                i4++;
            }
            return i4 == i3;
        }

        public static int hashValue(byte[] bArr, int i, int i2) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                i3++;
                i4 = bArr[i] + ((i4 << 5) - i4);
                i++;
            }
            return i4;
        }

        public abstract void dispose();

        public abstract Name fromChars(char[] cArr, int i, int i2);

        public Name fromString(String str) {
            char[] charArray = str.toCharArray();
            return fromChars(charArray, 0, charArray.length);
        }

        public Name fromUtf(byte[] bArr) {
            return fromUtf(bArr, 0, bArr.length);
        }

        public abstract Name fromUtf(byte[] bArr, int i, int i2);
    }

    public Name(Table table) {
        this.table = table;
    }

    public Name append(char c, Name name) {
        int byteLength = getByteLength();
        int i = byteLength + 1;
        int byteLength2 = name.getByteLength() + i;
        byte[] bArr = new byte[byteLength2];
        getBytes(bArr, 0);
        bArr[byteLength] = (byte) c;
        name.getBytes(bArr, i);
        return this.table.fromUtf(bArr, 0, byteLength2);
    }

    @Override // java.lang.CharSequence
    public char charAt(int i) {
        return toString().charAt(i);
    }

    public int compareTo(Name name) {
        return name.getIndex() - getIndex();
    }

    @Override // org.openjdk.javax.lang.model.element.Name
    public boolean contentEquals(CharSequence charSequence) {
        return toString().equals(charSequence.toString());
    }

    public abstract byte[] getByteArray();

    public abstract byte getByteAt(int i);

    public abstract int getByteLength();

    public abstract int getByteOffset();

    public void getBytes(byte[] bArr, int i) {
        System.arraycopy(getByteArray(), getByteOffset(), bArr, i, getByteLength());
    }

    public abstract int getIndex();

    public boolean isEmpty() {
        return getByteLength() == 0;
    }

    public int lastIndexOf(byte b) {
        byte[] byteArray = getByteArray();
        int byteOffset = getByteOffset();
        int byteLength = getByteLength() - 1;
        while (byteLength >= 0 && byteArray[byteOffset + byteLength] != b) {
            byteLength--;
        }
        return byteLength;
    }

    @Override // java.lang.CharSequence
    public int length() {
        return toString().length();
    }

    public boolean startsWith(Name name) {
        byte[] byteArray = getByteArray();
        int byteOffset = getByteOffset();
        int byteLength = getByteLength();
        byte[] byteArray2 = name.getByteArray();
        int byteOffset2 = name.getByteOffset();
        int byteLength2 = name.getByteLength();
        if (byteLength < byteLength2) {
            return false;
        }
        int i = 0;
        while (i < byteLength2 && byteArray[byteOffset + i] == byteArray2[byteOffset2 + i]) {
            i++;
        }
        return i == byteLength2;
    }

    public Name subName(int i, int i2) {
        if (i2 < i) {
            i2 = i;
        }
        return this.table.fromUtf(getByteArray(), getByteOffset() + i, i2 - i);
    }

    @Override // java.lang.CharSequence
    public CharSequence subSequence(int i, int i2) {
        return toString().subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public String toString() {
        return Convert.utf2string(getByteArray(), getByteOffset(), getByteLength());
    }

    public byte[] toUtf() {
        byte[] bArr = new byte[getByteLength()];
        getBytes(bArr, 0);
        return bArr;
    }

    public Name append(Name name) {
        int byteLength = getByteLength();
        int byteLength2 = name.getByteLength() + byteLength;
        byte[] bArr = new byte[byteLength2];
        getBytes(bArr, 0);
        name.getBytes(bArr, byteLength);
        return this.table.fromUtf(bArr, 0, byteLength2);
    }
}
