package org.objectweb.asm;

/* loaded from: classes11.dex */
public class Attribute {

    /* renamed from: a, reason: collision with root package name */
    Attribute f1174a;
    byte[] b;
    public final String type;

    public Attribute(String str) {
        this.type = str;
    }

    public final void a(ClassWriter classWriter, byte[] bArr, int i, int i2, int i3, ByteVector byteVector) {
        while (this != null) {
            ByteVector write = this.write(classWriter, bArr, i, i2, i3);
            byteVector.putShort(classWriter.newUTF8(this.type)).putInt(write.b);
            byteVector.putByteArray(write.f1175a, 0, write.b);
            this = this.f1174a;
        }
    }

    public Label[] getLabels() {
        return null;
    }

    public boolean isCodeAttribute() {
        return false;
    }

    public boolean isUnknown() {
        return true;
    }

    public Attribute read(ClassReader classReader, int i, int i2, char[] cArr, int i3, Label[] labelArr) {
        Attribute attribute = new Attribute(this.type);
        byte[] bArr = new byte[i2];
        attribute.b = bArr;
        System.arraycopy(classReader.b, i, bArr, 0, i2);
        return attribute;
    }

    public ByteVector write(ClassWriter classWriter, byte[] bArr, int i, int i2, int i3) {
        ByteVector byteVector = new ByteVector();
        byte[] bArr2 = this.b;
        byteVector.f1175a = bArr2;
        byteVector.b = bArr2.length;
        return byteVector;
    }

    public final int a(ClassWriter classWriter, byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        while (this != null) {
            classWriter.newUTF8(this.type);
            i4 += this.write(classWriter, bArr, i, i2, i3).b + 6;
            this = this.f1174a;
        }
        return i4;
    }

    public final int a() {
        int i = 0;
        while (this != null) {
            i++;
            this = this.f1174a;
        }
        return i;
    }
}
