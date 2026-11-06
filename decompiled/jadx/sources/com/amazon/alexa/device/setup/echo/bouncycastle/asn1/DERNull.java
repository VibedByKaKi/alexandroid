package com.amazon.alexa.device.setup.echo.bouncycastle.asn1;

import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DERNull extends ASN1Null {
    public static final DERNull INSTANCE = new DERNull();
    private static final byte[] zeroBytes = new byte[0];

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Null, com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeEncoded(5, zeroBytes);
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public int encodedLength() {
        return 2;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return false;
    }
}
