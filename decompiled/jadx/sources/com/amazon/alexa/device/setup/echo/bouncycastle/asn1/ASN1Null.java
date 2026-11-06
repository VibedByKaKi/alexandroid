package com.amazon.alexa.device.setup.echo.bouncycastle.asn1;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import java.io.IOException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class ASN1Null extends ASN1Primitive {
    public static ASN1Null getInstance(Object obj) {
        if (obj instanceof ASN1Null) {
            return (ASN1Null) obj;
        }
        if (obj == null) {
            return null;
        }
        try {
            return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
        } catch (IOException e) {
            Single$$ExternalSyntheticBUOutline0.m$3(Automotive$$ExternalSyntheticOutline0.m(e, new StringBuilder("failed to construct NULL from byte[]: ")));
            return null;
        } catch (ClassCastException unused) {
            Single$$ExternalSyntheticBUOutline0.m$3(ParcelCompat$$ExternalSyntheticOutline0.m(obj, "unknown object in getInstance(): "));
            return null;
        }
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        return aSN1Primitive instanceof ASN1Null;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public abstract void encode(ASN1OutputStream aSN1OutputStream) throws IOException;

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive, com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return -1;
    }

    public String toString() {
        return "NULL";
    }
}
