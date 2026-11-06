package org.bouncycastle.asn1;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.Arrays;
import rx.Single$$ExternalSyntheticBUOutline0;

/* loaded from: classes11.dex */
public abstract class ASN1BitString extends ASN1Primitive implements ASN1String, ASN1BitStringParser {
    static final ASN1UniversalType TYPE = new ASN1UniversalType(ASN1BitString.class, 3) { // from class: org.bouncycastle.asn1.ASN1BitString.1
        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitConstructed(ASN1Sequence aSN1Sequence) {
            return aSN1Sequence.toASN1BitString();
        }

        @Override // org.bouncycastle.asn1.ASN1UniversalType
        public ASN1Primitive fromImplicitPrimitive(DEROctetString dEROctetString) {
            return ASN1BitString.createPrimitive(dEROctetString.getOctets());
        }
    };
    private static final char[] table = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final byte[] contents;

    public ASN1BitString(byte[] bArr, boolean z) {
        if (z) {
            if (bArr == null) {
                Single$$ExternalSyntheticBUOutline0.m$1("'contents' cannot be null");
                throw null;
            }
            if (bArr.length < 1) {
                Single$$ExternalSyntheticBUOutline0.m$3("'contents' cannot be empty");
                throw null;
            }
            int i = bArr[0] & 255;
            if (i > 0) {
                if (bArr.length < 2) {
                    Single$$ExternalSyntheticBUOutline0.m$3("zero length data with non-zero pad bits");
                    throw null;
                }
                if (i > 7) {
                    Single$$ExternalSyntheticBUOutline0.m$3("pad bits cannot be greater than 7 or less than 0");
                    throw null;
                }
            }
        }
        this.contents = bArr;
    }

    public static ASN1BitString createPrimitive(byte[] bArr) {
        String str;
        int length = bArr.length;
        if (length >= 1) {
            int i = bArr[0] & 255;
            if (i > 0) {
                if (i > 7 || length < 2) {
                    str = "invalid pad bits detected";
                } else {
                    byte b = bArr[length - 1];
                    if (b != ((byte) ((255 << i) & b))) {
                        return new DLBitString(bArr, false);
                    }
                }
            }
            return new DERBitString(bArr, false);
        }
        str = "truncated BIT STRING detected";
        Single$$ExternalSyntheticBUOutline0.m$3(str);
        return null;
    }

    public static byte[] getBytes(int i) {
        if (i == 0) {
            return new byte[0];
        }
        int i2 = 4;
        for (int i3 = 3; i3 >= 1 && ((255 << (i3 * 8)) & i) == 0; i3--) {
            i2--;
        }
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) ((i >> (i4 * 8)) & 255);
        }
        return bArr;
    }

    public static ASN1BitString getInstance(Object obj) {
        String m;
        if (obj == null || (obj instanceof ASN1BitString)) {
            return (ASN1BitString) obj;
        }
        if (obj instanceof ASN1Encodable) {
            ASN1Primitive aSN1Primitive = ((ASN1Encodable) obj).toASN1Primitive();
            if (aSN1Primitive instanceof ASN1BitString) {
                return (ASN1BitString) aSN1Primitive;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (ASN1BitString) TYPE.fromByteArray((byte[]) obj);
            } catch (IOException e) {
                m = Automotive$$ExternalSyntheticOutline0.m(e, new StringBuilder("failed to construct BIT STRING from byte[]: "));
            }
        }
        m = ParcelCompat$$ExternalSyntheticOutline0.m(obj, "illegal object in getInstance: ");
        Single$$ExternalSyntheticBUOutline0.m$3(m);
        return null;
    }

    public static int getPadBits(int i) {
        int i2;
        int i3 = 3;
        while (true) {
            if (i3 < 0) {
                i2 = 0;
                break;
            }
            if (i3 != 0) {
                int i4 = i >> (i3 * 8);
                if (i4 != 0) {
                    i2 = i4 & 255;
                    break;
                }
                i3--;
            } else {
                if (i != 0) {
                    i2 = i & 255;
                    break;
                }
                i3--;
            }
        }
        if (i2 == 0) {
            return 0;
        }
        int i5 = 1;
        while (true) {
            i2 <<= 1;
            if ((i2 & 255) == 0) {
                return 8 - i5;
            }
            i5++;
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof ASN1BitString)) {
            return false;
        }
        byte[] bArr = this.contents;
        byte[] bArr2 = ((ASN1BitString) aSN1Primitive).contents;
        int length = bArr.length;
        if (bArr2.length != length) {
            return false;
        }
        if (length == 1) {
            return true;
        }
        int i = length - 1;
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        int i3 = 255 << (bArr[0] & 255);
        return ((byte) (bArr[i] & i3)) == ((byte) (bArr2[i] & i3));
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public InputStream getBitStream() throws IOException {
        byte[] bArr = this.contents;
        return new ByteArrayInputStream(bArr, 1, bArr.length - 1);
    }

    @Override // org.bouncycastle.asn1.InMemoryRepresentable
    public ASN1Primitive getLoadedObject() {
        return toASN1Primitive();
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public InputStream getOctetStream() throws IOException {
        int i = this.contents[0] & 255;
        if (i == 0) {
            return getBitStream();
        }
        Buffer$$ExternalSyntheticBUOutline0.m$2(a$$ExternalSyntheticOutline0.m(i, "expected octet-aligned bitstring, but found padBits: "));
        return null;
    }

    public byte[] getOctets() {
        byte[] bArr = this.contents;
        if (bArr[0] == 0) {
            return Arrays.copyOfRange(bArr, 1, bArr.length);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("attempt to get non-octet aligned data from BIT STRING");
        return null;
    }

    @Override // org.bouncycastle.asn1.ASN1String
    public String getString() {
        try {
            byte[] encoded = getEncoded();
            StringBuffer stringBuffer = new StringBuffer((encoded.length * 2) + 1);
            stringBuffer.append('#');
            for (int i = 0; i != encoded.length; i++) {
                byte b = encoded[i];
                char[] cArr = table;
                stringBuffer.append(cArr[(b >>> 4) & 15]);
                stringBuffer.append(cArr[b & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException e) {
            throw new ASN1ParsingException(Automotive$$ExternalSyntheticOutline0.m(e, new StringBuilder("Internal error encoding BitString: ")), e);
        }
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive, org.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        byte[] bArr = this.contents;
        if (bArr.length < 2) {
            return 1;
        }
        int i = bArr[0] & 255;
        int length = bArr.length - 1;
        return (Arrays.hashCode(bArr, 0, length) * 257) ^ ((byte) ((255 << i) & bArr[length]));
    }

    public int intValue() {
        int min = Math.min(5, this.contents.length - 1);
        int i = 0;
        for (int i2 = 1; i2 < min; i2++) {
            i |= (255 & this.contents[i2]) << ((i2 - 1) * 8);
        }
        if (1 > min || min >= 5) {
            return i;
        }
        byte[] bArr = this.contents;
        return ((((byte) (bArr[min] & (255 << (bArr[0] & 255)))) & 255) << ((min - 1) * 8)) | i;
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDERObject() {
        return new DERBitString(this.contents, false);
    }

    @Override // org.bouncycastle.asn1.ASN1Primitive
    public ASN1Primitive toDLObject() {
        return new DLBitString(this.contents, false);
    }

    public String toString() {
        return getString();
    }

    public ASN1BitStringParser parser() {
        return this;
    }

    @Override // org.bouncycastle.asn1.ASN1BitStringParser
    public int getPadBits() {
        return this.contents[0] & 255;
    }

    public byte[] getBytes() {
        byte[] bArr = this.contents;
        if (bArr.length == 1) {
            return ASN1OctetString.EMPTY_OCTETS;
        }
        int i = bArr[0] & 255;
        byte[] copyOfRange = Arrays.copyOfRange(bArr, 1, bArr.length);
        int length = copyOfRange.length - 1;
        copyOfRange[length] = (byte) (((byte) (255 << i)) & copyOfRange[length]);
        return copyOfRange;
    }

    public ASN1BitString(byte[] bArr, int i) {
        if (bArr == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("'data' cannot be null");
            throw null;
        }
        if (bArr.length == 0 && i != 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("zero length data with non-zero pad bits");
            throw null;
        }
        if (i > 7 || i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("pad bits cannot be greater than 7 or less than 0");
            throw null;
        }
        this.contents = Arrays.prepend(bArr, (byte) i);
    }

    public ASN1BitString(byte b, int i) {
        if (i > 7 || i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("pad bits cannot be greater than 7 or less than 0");
            throw null;
        }
        this.contents = new byte[]{(byte) i, b};
    }

    public static ASN1BitString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        return (ASN1BitString) TYPE.getContextInstance(aSN1TaggedObject, z);
    }
}
