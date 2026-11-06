package org.bouncycastle.asn1;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import java.io.IOException;
import okio.JvmSystemFileSystem$$ExternalSyntheticOutline2;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Strings;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public abstract class ASN1IA5String extends ASN1Primitive implements ASN1String {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1IA5String.class, 22) { // from class: org.bouncycastle.asn1.ASN1IA5String.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1IA5String.createPrimitive(dEROctetString.getOctets());
        }
    };
    final byte[] contents;

    public ASN1IA5String(String str, boolean z) {
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("'string' cannot be null");
            throw null;
        }
        if (!z || isIA5String(str)) {
            this.contents = Strings.toByteArray(str);
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3("'string' contains illegal characters");
            throw null;
        }
    }

    public static ASN1IA5String createPrimitive(byte[] bArr) {
        return new DERIA5String(bArr, false);
    }

    public static ASN1IA5String getInstance(Object obj) {
        String m;
        if (obj == null || (obj instanceof ASN1IA5String)) {
            return (ASN1IA5String) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1IA5String) {
                return (ASN1IA5String) aSN1Primitive;
            }
        }
        if (obj instanceof byte[]) {
            try {
                return (ASN1IA5String) TYPE.fromByteArray((byte[]) obj);
            } catch (Exception e) {
                m = JvmSystemFileSystem$$ExternalSyntheticOutline2.m(e, new StringBuilder("encoding error in getInstance: "));
            }
        } else {
            m = ParcelCompat$$ExternalSyntheticOutline0.m(obj, "illegal object in getInstance: ");
        }
        Single$$ExternalSyntheticBUOutline0.m$3(m);
        return null;
    }

    public static boolean isIA5String(String str) {
        for (int length = str.length() - 1; length >= 0; length--) {
            if (str.charAt(length) > 127) {
                return false;
            }
        }
        return true;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof ASN1IA5String) {
            return Arrays.areEqual(this.contents, ((ASN1IA5String) aSN1Primitive).contents);
        }
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final void encode(ASN1OutputStream aSN1OutputStream, boolean z) throws IOException {
        aSN1OutputStream.writeEncodingDL(z, 22, this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final boolean encodeConstructed() {
        return false;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public final int encodedLength(boolean z) {
        return ASN1OutputStream.getLengthOfEncodingDL(z, this.contents.length);
    }

    public final byte[] getOctets() {
        return Arrays.clone(this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public final String getString() {
        return Strings.fromByteArray(this.contents);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public final int hashCode() {
        return Arrays.hashCode(this.contents);
    }

    public String toString() {
        return getString();
    }

    public ASN1IA5String(byte[] bArr, boolean z) {
        this.contents = z ? Arrays.clone(bArr) : bArr;
    }

    public static ASN1IA5String getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1IA5String) TYPE.getContextInstance(aSN1TaggedObject, z);
    }
}
