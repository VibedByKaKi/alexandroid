package org.bouncycastle.asn1;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import okio.JvmSystemFileSystem$$ExternalSyntheticOutline2;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public class DERIA5String extends ASN1IA5String {
    public DERIA5String(String str) {
        this(str, false);
    }

    public static DERIA5String getInstance(Object obj) {
        String m;
        if (obj == null || (obj instanceof DERIA5String)) {
            return (DERIA5String) obj;
        }
        if (obj instanceof ASN1IA5String) {
            return new DERIA5String(((ASN1IA5String) obj).contents, false);
        }
        if (obj instanceof byte[]) {
            try {
                return (DERIA5String) ASN1Primitive.fromByteArray((byte[]) obj);
            } catch (Exception e) {
                m = JvmSystemFileSystem$$ExternalSyntheticOutline2.m(e, new StringBuilder("encoding error in getInstance: "));
            }
        } else {
            m = ParcelCompat$$ExternalSyntheticOutline0.m(obj, "illegal object in getInstance: ");
        }
        Single$$ExternalSyntheticBUOutline0.m$3(m);
        return null;
    }

    public DERIA5String(String str, boolean z) {
        super(str, z);
    }

    public DERIA5String(byte[] bArr, boolean z) {
        super(bArr, z);
    }

    public static DERIA5String getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z || (object instanceof DERIA5String)) ? getInstance((Object) object) : new DERIA5String(ASN1OctetString.getInstance(object).getOctets(), true);
    }
}
