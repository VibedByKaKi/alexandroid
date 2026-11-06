package com.amazon.alexa.device.setup.echo.bouncycastle.asn1;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.device.setup.echo.bouncycastle.util.Arrays;
import java.io.IOException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DERBoolean extends ASN1Primitive {
    private final byte[] value;
    public static final ASN1Boolean FALSE = new ASN1Boolean(false);
    public static final ASN1Boolean TRUE = new ASN1Boolean(true);
    private static final byte[] TRUE_VALUE = {-1};
    private static final byte[] FALSE_VALUE = {0};

    public DERBoolean(byte[] bArr) {
        if (bArr.length != 1) {
            Single$$ExternalSyntheticBUOutline0.m$3("byte value should have 1 byte in it");
            throw null;
        }
        byte b = bArr[0];
        if (b == 0) {
            this.value = FALSE_VALUE;
        } else if (b == 255) {
            this.value = TRUE_VALUE;
        } else {
            this.value = Arrays.clone(bArr);
        }
    }

    public static ASN1Boolean fromOctetString(byte[] bArr) {
        if (bArr.length == 1) {
            byte b = bArr[0];
            return b == 0 ? FALSE : b == 255 ? TRUE : new ASN1Boolean(bArr);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("byte value should have 1 byte in it");
        return null;
    }

    public static ASN1Boolean getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1Boolean)) {
            return (ASN1Boolean) obj;
        }
        if (obj instanceof DERBoolean) {
            return ((DERBoolean) obj).isTrue() ? TRUE : FALSE;
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ParcelCompat$$ExternalSyntheticOutline0.m(obj, "illegal object in getInstance: "));
        return null;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        return aSN1Primitive != null && (aSN1Primitive instanceof DERBoolean) && this.value[0] == ((DERBoolean) aSN1Primitive).value[0];
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeEncoded(1, this.value);
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public int encodedLength() {
        return 3;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive, com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return this.value[0];
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return false;
    }

    public boolean isTrue() {
        return this.value[0] != 0;
    }

    public String toString() {
        return this.value[0] != 0 ? "TRUE" : "FALSE";
    }

    public static ASN1Boolean getInstance(boolean z) {
        return z ? TRUE : FALSE;
    }

    public DERBoolean(boolean z) {
        this.value = z ? TRUE_VALUE : FALSE_VALUE;
    }

    public static DERBoolean getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z && !(object instanceof DERBoolean)) {
            return fromOctetString(((ASN1OctetString) object).getOctets());
        }
        return getInstance(object);
    }
}
