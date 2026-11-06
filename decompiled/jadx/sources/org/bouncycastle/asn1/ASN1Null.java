package org.bouncycastle.asn1;

import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import java.io.IOException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public abstract class ASN1Null extends ASN1Primitive {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1Null.class, 5) { // from class: org.bouncycastle.asn1.ASN1Null.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1Null.createPrimitive(dEROctetString.getOctets());
        }
    };

    public static ASN1Null createPrimitive(byte[] bArr) {
        if (bArr.length == 0) {
            return DERNull.INSTANCE;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("malformed NULL encoding encountered");
        return null;
    }

    public static ASN1Null getInstance(Object obj) {
        if (obj instanceof ASN1Null) {
            return (ASN1Null) obj;
        }
        if (obj == null) {
            return null;
        }
        try {
            return (ASN1Null) TYPE.fromByteArray((byte[]) obj);
        } catch (IOException e) {
            Single$$ExternalSyntheticBUOutline0.m$3(Automotive$$ExternalSyntheticOutline0.m(e, new StringBuilder("failed to construct NULL from byte[]: ")));
            return null;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        return aSN1Primitive instanceof ASN1Null;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return -1;
    }

    public String toString() {
        return "NULL";
    }

    public static ASN1Null getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1Null) TYPE.getContextInstance(aSN1TaggedObject, z);
    }
}
