package com.amazon.alexa.device.setup.echo.bouncycastle.cms;

import com.amazon.alexa.device.setup.echo.bouncycastle.asn1.x500.X500Name;
import com.amazon.alexa.device.setup.echo.bouncycastle.util.Arrays;
import com.amazon.alexa.device.setup.echo.bouncycastle.util.Selector;
import java.math.BigInteger;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class OriginatorId implements Selector {
    private X500Name issuer;
    private BigInteger serialNumber;
    private byte[] subjectKeyId;

    public OriginatorId(X500Name x500Name, BigInteger bigInteger, byte[] bArr) {
        setIssuerAndSerial(x500Name, bigInteger);
        setSubjectKeyID(bArr);
    }

    private boolean equalsObj(Object obj, Object obj2) {
        return obj != null ? obj.equals(obj2) : obj2 == null;
    }

    private void setIssuerAndSerial(X500Name x500Name, BigInteger bigInteger) {
        this.issuer = x500Name;
        this.serialNumber = bigInteger;
    }

    private void setSubjectKeyID(byte[] bArr) {
        this.subjectKeyId = bArr;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.util.Selector
    public Object clone() {
        return new OriginatorId(this.issuer, this.serialNumber, this.subjectKeyId);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof OriginatorId)) {
            return false;
        }
        OriginatorId originatorId = (OriginatorId) obj;
        return Arrays.areEqual(this.subjectKeyId, originatorId.subjectKeyId) && equalsObj(this.serialNumber, originatorId.serialNumber) && equalsObj(this.issuer, originatorId.issuer);
    }

    public X500Name getIssuer() {
        return this.issuer;
    }

    public int hashCode() {
        int hashCode = Arrays.hashCode(this.subjectKeyId);
        BigInteger bigInteger = this.serialNumber;
        if (bigInteger != null) {
            hashCode ^= bigInteger.hashCode();
        }
        X500Name x500Name = this.issuer;
        return x500Name != null ? x500Name.hashCode() ^ hashCode : hashCode;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.util.Selector
    public boolean match(Object obj) {
        return false;
    }

    public OriginatorId(X500Name x500Name, BigInteger bigInteger) {
        setIssuerAndSerial(x500Name, bigInteger);
    }

    public OriginatorId(byte[] bArr) {
        setSubjectKeyID(bArr);
    }
}
