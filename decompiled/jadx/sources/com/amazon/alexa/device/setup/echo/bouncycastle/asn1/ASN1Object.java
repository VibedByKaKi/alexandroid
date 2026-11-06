package com.amazon.alexa.device.setup.echo.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class ASN1Object implements ASN1Encodable {
    public static boolean hasEncodedTagValue(Object obj, int i) {
        return (obj instanceof byte[]) && ((byte[]) obj)[0] == i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ASN1Encodable) {
            return toASN1Primitive().equals(((ASN1Encodable) obj).toASN1Primitive());
        }
        return false;
    }

    public byte[] getEncoded(String str) throws IOException {
        if (str.equals("DER")) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new DEROutputStream(byteArrayOutputStream).writeObject(this);
            return byteArrayOutputStream.toByteArray();
        }
        if (!str.equals("DL")) {
            return getEncoded();
        }
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        new DLOutputStream(byteArrayOutputStream2).writeObject(this);
        return byteArrayOutputStream2.toByteArray();
    }

    public int hashCode() {
        return toASN1Primitive().hashCode();
    }

    public ASN1Primitive toASN1Object() {
        return toASN1Primitive();
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Encodable
    public abstract ASN1Primitive toASN1Primitive();

    public byte[] getEncoded() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        new ASN1OutputStream(byteArrayOutputStream).writeObject(this);
        return byteArrayOutputStream.toByteArray();
    }
}
