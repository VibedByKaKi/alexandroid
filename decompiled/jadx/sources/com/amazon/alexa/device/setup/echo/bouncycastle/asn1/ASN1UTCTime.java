package com.amazon.alexa.device.setup.echo.bouncycastle.asn1;

import java.util.Date;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ASN1UTCTime extends DERUTCTime {
    public ASN1UTCTime(byte[] bArr) {
        super(bArr);
    }

    public ASN1UTCTime(Date date) {
        super(date);
    }

    public ASN1UTCTime(String str) {
        super(str);
    }
}
