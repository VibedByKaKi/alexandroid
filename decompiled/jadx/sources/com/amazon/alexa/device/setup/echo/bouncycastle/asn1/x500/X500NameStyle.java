package com.amazon.alexa.device.setup.echo.bouncycastle.asn1.x500;

import com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Encodable;
import com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1ObjectIdentifier;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface X500NameStyle {
    boolean areEqual(X500Name x500Name, X500Name x500Name2);

    ASN1ObjectIdentifier attrNameToOID(String str);

    int calculateHashCode(X500Name x500Name);

    RDN[] fromString(String str);

    ASN1Encodable stringToValue(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str);

    String toString(X500Name x500Name);
}
