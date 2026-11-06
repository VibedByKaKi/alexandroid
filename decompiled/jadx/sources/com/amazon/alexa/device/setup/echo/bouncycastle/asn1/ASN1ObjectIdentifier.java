package com.amazon.alexa.device.setup.echo.bouncycastle.asn1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ASN1ObjectIdentifier extends DERObjectIdentifier {
    public ASN1ObjectIdentifier(String str) {
        super(str);
    }

    public ASN1ObjectIdentifier branch(String str) {
        return new ASN1ObjectIdentifier(getId() + "." + str);
    }

    public boolean on(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        String id = getId();
        String id2 = aSN1ObjectIdentifier.getId();
        return id.length() > id2.length() && id.charAt(id2.length()) == '.' && id.startsWith(id2);
    }

    public ASN1ObjectIdentifier(byte[] bArr) {
        super(bArr);
    }
}
