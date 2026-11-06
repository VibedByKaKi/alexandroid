package com.amazon.alexa.device.setup.echo.bouncycastle.asn1;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.device.setup.echo.bouncycastle.util.Arrays;
import com.amazon.alexa.device.setup.echo.bouncycastle.util.io.Streams;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.json.XML$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DERBitString extends ASN1Primitive implements ASN1String {
    private static final char[] table = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    protected byte[] data;
    protected int padBits;

    public DERBitString(ASN1Encodable aSN1Encodable) {
        try {
            this.data = aSN1Encodable.toASN1Primitive().getEncoded("DER");
            this.padBits = 0;
        } catch (IOException e) {
            XML$$ExternalSyntheticBUOutline0.m((Object) e, "Error processing object : ");
            throw null;
        }
    }

    public static DERBitString fromInputStream(int i, InputStream inputStream) throws IOException {
        if (i < 1) {
            Single$$ExternalSyntheticBUOutline0.m$3("truncated BIT STRING detected");
            return null;
        }
        int read = inputStream.read();
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        if (i2 == 0 || Streams.readFully(inputStream, bArr) == i2) {
            return new DERBitString(bArr, read);
        }
        Buffer$$ExternalSyntheticBUOutline0.m$3("EOF encountered in middle of BIT STRING");
        return null;
    }

    public static DERBitString fromOctetString(byte[] bArr) {
        if (bArr.length < 1) {
            Single$$ExternalSyntheticBUOutline0.m$3("truncated BIT STRING detected");
            return null;
        }
        byte b = bArr[0];
        int length = bArr.length - 1;
        byte[] bArr2 = new byte[length];
        if (length != 0) {
            System.arraycopy(bArr, 1, bArr2, 0, bArr.length - 1);
        }
        return new DERBitString(bArr2, b);
    }

    public static byte[] getBytes(int i) {
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

    public static DERBitString getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        return (z || (object instanceof DERBitString)) ? getInstance(object) : fromOctetString(((ASN1OctetString) object).getOctets());
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
            return 7;
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

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (!(aSN1Primitive instanceof DERBitString)) {
            return false;
        }
        DERBitString dERBitString = (DERBitString) aSN1Primitive;
        return this.padBits == dERBitString.padBits && Arrays.areEqual(this.data, dERBitString.data);
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        int length = getBytes().length;
        byte[] bArr = new byte[length + 1];
        bArr[0] = (byte) getPadBits();
        System.arraycopy(getBytes(), 0, bArr, 1, length);
        aSN1OutputStream.writeEncoded(3, bArr);
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public int encodedLength() {
        return StreamUtil.calculateBodyLength(this.data.length + 1) + 1 + this.data.length + 1;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1String
    public String getString() {
        StringBuffer stringBuffer = new StringBuffer("#");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            new ASN1OutputStream(byteArrayOutputStream).writeObject(this);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            for (int i = 0; i != byteArray.length; i++) {
                char[] cArr = table;
                stringBuffer.append(cArr[(byteArray[i] >>> 4) & 15]);
                stringBuffer.append(cArr[byteArray[i] & 15]);
            }
            return stringBuffer.toString();
        } catch (IOException unused) {
            Single$$ExternalSyntheticBUOutline0.m("internal error encoding BitString");
            return null;
        }
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive, com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return Arrays.hashCode(this.data) ^ this.padBits;
    }

    public int intValue() {
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.data;
            if (i == bArr.length || i == 4) {
                break;
            }
            i2 |= (bArr[i] & 255) << (i * 8);
            i++;
        }
        return i2;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return false;
    }

    public String toString() {
        return getString();
    }

    public DERBitString(byte[] bArr, int i) {
        this.data = bArr;
        this.padBits = i;
    }

    public static DERBitString getInstance(Object obj) {
        if (obj != null && !(obj instanceof DERBitString)) {
            Single$$ExternalSyntheticBUOutline0.m$3(ParcelCompat$$ExternalSyntheticOutline0.m(obj, "illegal object in getInstance: "));
            return null;
        }
        return (DERBitString) obj;
    }

    public DERBitString(byte[] bArr) {
        this(bArr, 0);
    }

    public DERBitString(byte b, int i) {
        this.data = new byte[]{b};
        this.padBits = i;
    }

    public byte[] getBytes() {
        return this.data;
    }

    public int getPadBits() {
        return this.padBits;
    }
}
