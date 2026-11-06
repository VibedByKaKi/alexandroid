package com.amazon.alexa.device.setup.echo.bouncycastle.asn1;

import java.io.IOException;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class ASN1Primitive extends ASN1Object {
    public static ASN1Primitive fromByteArray(byte[] bArr) throws IOException {
        try {
            return new ASN1InputStream(bArr).readObject();
        } catch (ClassCastException unused) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("cannot recognise object in stream");
            return null;
        }
    }

    public abstract boolean asn1Equals(ASN1Primitive aSN1Primitive);

    public abstract void encode(ASN1OutputStream aSN1OutputStream) throws IOException;

    public abstract int encodedLength() throws IOException;

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ASN1Encodable) && asn1Equals(((ASN1Encodable) obj).toASN1Primitive());
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Object
    public abstract int hashCode();

    public abstract boolean isConstructed();

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Object, com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return this;
    }

    public ASN1Primitive toDERObject() {
        return this;
    }

    public ASN1Primitive toDLObject() {
        return this;
    }
}
