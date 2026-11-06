package com.amazon.alexa.device.setup.echo.bouncycastle.util;

import com.amazon.alexa.presence.bleconn.service.protocols.relationships.RequesterRelationshipsPacketV1;
import com.amazon.deecomms.common.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Vector;
import okio.Utf8;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class Strings {
    public static char[] asCharArray(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }

    public static String fromByteArray(byte[] bArr) {
        return new String(asCharArray(bArr));
    }

    public static String fromUTF8ByteArray(byte[] bArr) {
        char c;
        int i;
        byte b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            int i5 = i4 + 1;
            byte b2 = bArr[i3];
            if ((b2 & RequesterRelationshipsPacketV1.HEADER_MASK_VERSION) == 240) {
                i4 += 2;
                i3 += 4;
            } else {
                i3 = (b2 & 224) == 224 ? i3 + 3 : (b2 & 192) == 192 ? i3 + 2 : i3 + 1;
                i4 = i5;
            }
        }
        char[] cArr = new char[i4];
        int i6 = 0;
        while (i2 < bArr.length) {
            byte b3 = bArr[i2];
            if ((b3 & RequesterRelationshipsPacketV1.HEADER_MASK_VERSION) == 240) {
                int i7 = (((((b3 & 3) << 18) | ((bArr[i2 + 1] & Utf8.REPLACEMENT_BYTE) << 12)) | ((bArr[i2 + 2] & Utf8.REPLACEMENT_BYTE) << 6)) | (bArr[i2 + 3] & Utf8.REPLACEMENT_BYTE)) - 65536;
                char c2 = (char) ((i7 >> 10) | 55296);
                c = (char) ((i7 & 1023) | 56320);
                cArr[i6] = c2;
                i2 += 4;
                i6++;
            } else if ((b3 & 224) == 224) {
                c = (char) (((b3 & 15) << 12) | ((bArr[i2 + 1] & Utf8.REPLACEMENT_BYTE) << 6) | (bArr[i2 + 2] & Utf8.REPLACEMENT_BYTE));
                i2 += 3;
            } else {
                if ((b3 & 208) == 208) {
                    i = (b3 & 31) << 6;
                    b = bArr[i2 + 1];
                } else if ((b3 & 192) == 192) {
                    i = (b3 & 31) << 6;
                    b = bArr[i2 + 1];
                } else {
                    c = (char) (b3 & 255);
                    i2++;
                }
                c = (char) (i | (b & Utf8.REPLACEMENT_BYTE));
                i2 += 2;
            }
            cArr[i6] = c;
            i6++;
        }
        return new String(cArr);
    }

    public static String[] split(String str, char c) {
        int i;
        Vector vector = new Vector();
        boolean z = true;
        while (true) {
            if (!z) {
                break;
            }
            int indexOf = str.indexOf(c);
            if (indexOf > 0) {
                vector.addElement(str.substring(0, indexOf));
                str = str.substring(indexOf + 1);
            } else {
                vector.addElement(str);
                z = false;
            }
        }
        int size = vector.size();
        String[] strArr = new String[size];
        for (i = 0; i != size; i++) {
            strArr[i] = (String) vector.elementAt(i);
        }
        return strArr;
    }

    public static byte[] toByteArray(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static String toLowerCase(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) (c + ' ');
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static void toUTF8ByteArray(char[] cArr, OutputStream outputStream) throws IOException {
        int i = 0;
        while (i < cArr.length) {
            char c = cArr[i];
            if (c < 128) {
                outputStream.write(c);
            } else if (c < 2048) {
                outputStream.write((c >> 6) | 192);
                outputStream.write((c & Constants.DEFAULT_IMAGE_CHAR) | 128);
            } else if (c < 55296 || c > 57343) {
                outputStream.write((c >> '\f') | 224);
                outputStream.write(((c >> 6) & 63) | 128);
                outputStream.write((c & Constants.DEFAULT_IMAGE_CHAR) | 128);
            } else {
                i++;
                if (i >= cArr.length) {
                    Single$$ExternalSyntheticBUOutline0.m$2("invalid UTF-16 codepoint");
                    return;
                }
                char c2 = cArr[i];
                if (c > 56319) {
                    Single$$ExternalSyntheticBUOutline0.m$2("invalid UTF-16 codepoint");
                    return;
                }
                int i2 = (((c & 1023) << 10) | (c2 & 1023)) + 65536;
                outputStream.write((i2 >> 18) | 240);
                outputStream.write(((i2 >> 12) & 63) | 128);
                outputStream.write(((i2 >> 6) & 63) | 128);
                outputStream.write((i2 & 63) | 128);
            }
            i++;
        }
    }

    public static String toUpperCase(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) (c - ' ');
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static byte[] toByteArray(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    public static byte[] toUTF8ByteArray(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            toUTF8ByteArray(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            Single$$ExternalSyntheticBUOutline0.m$2("cannot encode string to byte array!");
            return null;
        }
    }

    public static byte[] toUTF8ByteArray(String str) {
        return toUTF8ByteArray(str.toCharArray());
    }
}
