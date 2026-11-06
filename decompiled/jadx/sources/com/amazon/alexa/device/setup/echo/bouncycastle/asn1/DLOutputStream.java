package com.amazon.alexa.device.setup.echo.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DLOutputStream extends ASN1OutputStream {
    public DLOutputStream(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1OutputStream
    public void writeObject(ASN1Encodable aSN1Encodable) throws IOException {
        if (aSN1Encodable != null) {
            aSN1Encodable.toASN1Primitive().toDLObject().encode(this);
        } else {
            Buffer$$ExternalSyntheticBUOutline0.m$2("null object detected");
        }
    }
}
