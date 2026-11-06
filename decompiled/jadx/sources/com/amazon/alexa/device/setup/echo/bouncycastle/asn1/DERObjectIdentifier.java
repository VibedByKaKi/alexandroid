package com.amazon.alexa.device.setup.echo.bouncycastle.asn1;

import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.device.setup.echo.bouncycastle.util.Arrays;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import org.openjdk.tools.javac.code.Flags;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class DERObjectIdentifier extends ASN1Primitive {
    private static final ASN1ObjectIdentifier[][] cache = new ASN1ObjectIdentifier[255][];
    private byte[] body;
    String identifier;

    public DERObjectIdentifier(byte[] bArr) {
        BigInteger or;
        long j;
        StringBuffer stringBuffer = new StringBuffer();
        int i = 1;
        boolean z = true;
        int i2 = 0;
        long j2 = 0;
        BigInteger bigInteger = null;
        while (i2 != bArr.length) {
            byte b = bArr[i2];
            if (j2 < Flags.DEPRECATED_REMOVAL) {
                j2 = (j2 * 128) + (b & Byte.MAX_VALUE);
                if ((b & 128) == 0) {
                    if (z) {
                        int i3 = ((int) j2) / 40;
                        if (i3 != 0) {
                            if (i3 != i) {
                                stringBuffer.append('2');
                                j = 80;
                            } else {
                                stringBuffer.append('1');
                                j = 40;
                            }
                            j2 -= j;
                        } else {
                            stringBuffer.append('0');
                        }
                        z = false;
                    }
                    stringBuffer.append('.');
                    stringBuffer.append(j2);
                    or = bigInteger;
                    j2 = 0;
                    i2++;
                    bigInteger = or;
                    i = 1;
                } else {
                    or = bigInteger;
                    i2++;
                    bigInteger = or;
                    i = 1;
                }
            } else {
                or = (bigInteger == null ? BigInteger.valueOf(j2) : bigInteger).shiftLeft(7).or(BigInteger.valueOf(b & Byte.MAX_VALUE));
                if ((b & 128) == 0) {
                    stringBuffer.append('.');
                    stringBuffer.append(or);
                    or = null;
                    j2 = 0;
                    i2++;
                    bigInteger = or;
                    i = 1;
                } else {
                    i2++;
                    bigInteger = or;
                    i = 1;
                }
            }
        }
        this.identifier = stringBuffer.toString();
    }

    private void doOutput(ByteArrayOutputStream byteArrayOutputStream) {
        OIDTokenizer oIDTokenizer = new OIDTokenizer(this.identifier);
        writeField(byteArrayOutputStream, Integer.parseInt(oIDTokenizer.nextToken()) + (Integer.parseInt(oIDTokenizer.nextToken()) * 40));
        while (oIDTokenizer.hasMoreTokens()) {
            String nextToken = oIDTokenizer.nextToken();
            if (nextToken.length() < 18) {
                writeField(byteArrayOutputStream, Long.parseLong(nextToken));
            } else {
                writeField(byteArrayOutputStream, new BigInteger(nextToken));
            }
        }
    }

    public static ASN1ObjectIdentifier fromOctetString(byte[] bArr) {
        if (bArr.length < 3) {
            return new ASN1ObjectIdentifier(bArr);
        }
        int i = bArr[bArr.length - 2] & 255;
        ASN1ObjectIdentifier[][] aSN1ObjectIdentifierArr = cache;
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr2 = aSN1ObjectIdentifierArr[i];
        if (aSN1ObjectIdentifierArr2 == null) {
            aSN1ObjectIdentifierArr2 = new ASN1ObjectIdentifier[255];
            aSN1ObjectIdentifierArr[i] = aSN1ObjectIdentifierArr2;
        }
        int i2 = bArr[bArr.length - 1] & 255;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = aSN1ObjectIdentifierArr2[i2];
        if (aSN1ObjectIdentifier == null) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = new ASN1ObjectIdentifier(bArr);
            aSN1ObjectIdentifierArr2[i2] = aSN1ObjectIdentifier2;
            return aSN1ObjectIdentifier2;
        }
        if (Arrays.areEqual(bArr, aSN1ObjectIdentifier.getBody())) {
            return aSN1ObjectIdentifier;
        }
        int i3 = (i + 1) % 256;
        ASN1ObjectIdentifier[] aSN1ObjectIdentifierArr3 = aSN1ObjectIdentifierArr[i3];
        if (aSN1ObjectIdentifierArr3 == null) {
            aSN1ObjectIdentifierArr3 = new ASN1ObjectIdentifier[255];
            aSN1ObjectIdentifierArr[i3] = aSN1ObjectIdentifierArr3;
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = aSN1ObjectIdentifierArr3[i2];
        if (aSN1ObjectIdentifier3 == null) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier4 = new ASN1ObjectIdentifier(bArr);
            aSN1ObjectIdentifierArr3[i2] = aSN1ObjectIdentifier4;
            return aSN1ObjectIdentifier4;
        }
        if (Arrays.areEqual(bArr, aSN1ObjectIdentifier3.getBody())) {
            return aSN1ObjectIdentifier3;
        }
        int i4 = (i2 + 1) % 256;
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = aSN1ObjectIdentifierArr3[i4];
        if (aSN1ObjectIdentifier5 != null) {
            return Arrays.areEqual(bArr, aSN1ObjectIdentifier5.getBody()) ? aSN1ObjectIdentifier5 : new ASN1ObjectIdentifier(bArr);
        }
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = new ASN1ObjectIdentifier(bArr);
        aSN1ObjectIdentifierArr3[i4] = aSN1ObjectIdentifier6;
        return aSN1ObjectIdentifier6;
    }

    public static ASN1ObjectIdentifier getInstance(Object obj) {
        if (obj == null || (obj instanceof ASN1ObjectIdentifier)) {
            return (ASN1ObjectIdentifier) obj;
        }
        if (obj instanceof DERObjectIdentifier) {
            return new ASN1ObjectIdentifier(((DERObjectIdentifier) obj).getId());
        }
        Single$$ExternalSyntheticBUOutline0.m$3(ParcelCompat$$ExternalSyntheticOutline0.m(obj, "illegal object in getInstance: "));
        return null;
    }

    private static boolean isValidIdentifier(String str) {
        char charAt;
        if (str.length() < 3 || str.charAt(1) != '.' || (charAt = str.charAt(0)) < '0' || charAt > '2') {
            return false;
        }
        boolean z = false;
        for (int length = str.length() - 1; length >= 2; length--) {
            char charAt2 = str.charAt(length);
            if ('0' <= charAt2 && charAt2 <= '9') {
                z = true;
            } else {
                if (charAt2 != '.' || !z) {
                    return false;
                }
                z = false;
            }
        }
        return z;
    }

    private void writeField(ByteArrayOutputStream byteArrayOutputStream, BigInteger bigInteger) {
        int bitLength = (bigInteger.bitLength() + 6) / 7;
        if (bitLength == 0) {
            byteArrayOutputStream.write(0);
            return;
        }
        byte[] bArr = new byte[bitLength];
        int i = bitLength - 1;
        for (int i2 = i; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((bigInteger.intValue() & 127) | 128);
            bigInteger = bigInteger.shiftRight(7);
        }
        bArr[i] = (byte) (bArr[i] & Byte.MAX_VALUE);
        byteArrayOutputStream.write(bArr, 0, bitLength);
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public boolean asn1Equals(ASN1Primitive aSN1Primitive) {
        if (aSN1Primitive instanceof DERObjectIdentifier) {
            return this.identifier.equals(((DERObjectIdentifier) aSN1Primitive).identifier);
        }
        return false;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public void encode(ASN1OutputStream aSN1OutputStream) throws IOException {
        byte[] body = getBody();
        aSN1OutputStream.write(6);
        aSN1OutputStream.writeLength(body.length);
        aSN1OutputStream.write(body);
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public int encodedLength() throws IOException {
        int length = getBody().length;
        return StreamUtil.calculateBodyLength(length) + 1 + length;
    }

    public byte[] getBody() {
        if (this.body == null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            doOutput(byteArrayOutputStream);
            this.body = byteArrayOutputStream.toByteArray();
        }
        return this.body;
    }

    public String getId() {
        return this.identifier;
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive, com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Object
    public int hashCode() {
        return this.identifier.hashCode();
    }

    @Override // com.amazon.alexa.device.setup.echo.bouncycastle.asn1.ASN1Primitive
    public boolean isConstructed() {
        return false;
    }

    public String toString() {
        return getId();
    }

    public static ASN1ObjectIdentifier getInstance(ASN1TaggedObject aSN1TaggedObject, boolean z) {
        ASN1Primitive object = aSN1TaggedObject.getObject();
        if (!z && !(object instanceof DERObjectIdentifier)) {
            return fromOctetString(ASN1OctetString.getInstance(aSN1TaggedObject.getObject()).getOctets());
        }
        return getInstance(object);
    }

    private void writeField(ByteArrayOutputStream byteArrayOutputStream, long j) {
        byte[] bArr = new byte[9];
        int i = 8;
        bArr[8] = (byte) (((int) j) & 127);
        while (j >= 128) {
            j >>= 7;
            i--;
            bArr[i] = (byte) ((((int) j) & 127) | 128);
        }
        byteArrayOutputStream.write(bArr, i, 9 - i);
    }

    public DERObjectIdentifier(String str) {
        if (isValidIdentifier(str)) {
            this.identifier = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m("string ", str, " not an OID"));
            throw null;
        }
    }
}
