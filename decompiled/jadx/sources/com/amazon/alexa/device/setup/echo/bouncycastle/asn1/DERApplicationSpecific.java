package com.amazon.alexa.device.setup.echo.bouncycastle.asn1;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.device.setup.echo.bouncycastle.util.Arrays;
import com.amazon.alexa.metis.api.ChatData$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DERApplicationSpecific extends ASN1Primitive {
    private final boolean isConstructed;
    private final byte[] octets;
    private final int tag;

    public DERApplicationSpecific(int i, ASN1EncodableVector aSN1EncodableVector) {
        this.tag = i;
        this.isConstructed = true;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i2 = 0; i2 != aSN1EncodableVector.size(); i2++) {
            try {
                byteArrayOutputStream.write(((ASN1Object) aSN1EncodableVector.get(i2)).getEncoded("DER"));
            } catch (IOException e) {
                throw new ASN1ParsingException(ChatData$$ExternalSyntheticOutline0.m("malformed object: ", e), e);
            }
        }
        this.octets = byteArrayOutputStream.toByteArray();
    }

    public static DERApplicationSpecific getInstance(Object obj) {
        if (obj == null || (obj instanceof DERApplicationSpecific)) {
            return (DERApplicationSpecific) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return getInstance(ASN1Primitive.fromByteArray((byte[]) obj));
            } catch (IOException e) {
                Single$$ExternalSyntheticBUOutline0.m$3(Automotive$$ExternalSyntheticOutline0.m(e, new StringBuilder("failed to construct object from byte[]: ")));
                return null;
            }
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1Sequence) {
                return (DERApplicationSpecific) aSN1Primitive;
            }
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ParcelCompat$$ExternalSyntheticOutline0.m(obj, "unknown object in getInstance: "));
        return null;
    }

    private int getLengthOfHeader(byte[] bArr) {
        byte b = bArr[1];
        int i = b & 255;
        if (i == 128 || i <= 127) {
            return 2;
        }
        int i2 = b & Byte.MAX_VALUE;
        if (i2 <= 4) {
            return i2 + 2;
        }
        Single$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m(i2, "DER length more than 4 bytes: "));
        return 0;
    }

    private byte[] replaceTagNumber(int i, byte[] bArr) throws IOException {
        int i2;
        if ((bArr[0] & 31) == 31) {
            byte b = bArr[1];
            int i3 = b & 255;
            if ((b & Byte.MAX_VALUE) == 0) {
                throw new ASN1ParsingException("corrupted stream - invalid high tag number found");
            }
            i2 = 2;
            while (i3 >= 0 && (i3 & 128) != 0) {
                i3 = bArr[i2] & 255;
                i2++;
            }
        } else {
            i2 = 1;
        }
        int length = bArr.length - i2;
        byte[] bArr2 = new byte[length + 1];
        System.arraycopy(bArr, i2, bArr2, 1, length);
        bArr2[0] = (byte) i;
        return bArr2;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof DERApplicationSpecific)) {
            return false;
        }
        DERApplicationSpecific dERApplicationSpecific = (DERApplicationSpecific) aSN1Primitive;
        return this.isConstructed == dERApplicationSpecific.isConstructed && this.tag == dERApplicationSpecific.tag && Arrays.areEqual(this.octets, dERApplicationSpecific.octets);
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        aSN1OutputStream.writeEncoded(this.isConstructed ? 96 : 64, this.tag, this.octets);
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public int encodedLength() throws IOException {
        return StreamUtil.calculateTagLength(this.tag) + StreamUtil.calculateBodyLength(this.octets.length) + this.octets.length;
    }

    public int getApplicationTag() {
        return this.tag;
    }

    public byte[] getContents() {
        return this.octets;
    }

    public ASN1Primitive getObject(int i) throws IOException {
        if (i >= 31) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("unsupported tag number");
            return null;
        }
        byte[] encoded = getEncoded();
        byte[] replaceTagNumber = replaceTagNumber(i, encoded);
        if ((encoded[0] & 32) != 0) {
            replaceTagNumber[0] = (byte) (replaceTagNumber[0] | 32);
        }
        return new ASN1InputStream(replaceTagNumber).readObject();
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive, com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        boolean z = this.isConstructed;
        return Arrays.hashCode(this.octets) ^ ((z ? 1 : 0) ^ this.tag);
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return this.isConstructed;
    }

    public ASN1Primitive getObject() throws IOException {
        return new ASN1InputStream(getContents()).readObject();
    }

    public DERApplicationSpecific(int i, byte[] bArr) {
        this(false, i, bArr);
    }

    public DERApplicationSpecific(int i, ASN1Encodable aSN1Encodable) throws IOException {
        this(true, i, aSN1Encodable);
    }

    public DERApplicationSpecific(boolean z, int i, ASN1Encodable aSN1Encodable) throws IOException {
        ASN1Primitive aSN1Primitive = aSN1Encodable.toASN1Primitive();
        byte[] encoded = aSN1Primitive.getEncoded("DER");
        this.isConstructed = z || (aSN1Primitive instanceof ASN1Set) || (aSN1Primitive instanceof ASN1Sequence);
        this.tag = i;
        if (z) {
            this.octets = encoded;
            return;
        }
        int lengthOfHeader = getLengthOfHeader(encoded);
        int length = encoded.length - lengthOfHeader;
        byte[] bArr = new byte[length];
        System.arraycopy(encoded, lengthOfHeader, bArr, 0, length);
        this.octets = bArr;
    }

    public DERApplicationSpecific(boolean z, int i, byte[] bArr) {
        this.isConstructed = z;
        this.tag = i;
        this.octets = bArr;
    }
}
