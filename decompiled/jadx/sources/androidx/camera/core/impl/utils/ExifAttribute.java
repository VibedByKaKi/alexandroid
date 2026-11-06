package androidx.camera.core.impl.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class ExifAttribute {
    public static final long BYTES_OFFSET_UNKNOWN = -1;
    static final int IFD_FORMAT_BYTE = 1;
    static final int IFD_FORMAT_DOUBLE = 12;
    static final int IFD_FORMAT_SBYTE = 6;
    static final int IFD_FORMAT_SINGLE = 11;
    static final int IFD_FORMAT_SLONG = 9;
    static final int IFD_FORMAT_SRATIONAL = 10;
    static final int IFD_FORMAT_SSHORT = 8;
    static final int IFD_FORMAT_STRING = 2;
    static final int IFD_FORMAT_ULONG = 4;
    static final int IFD_FORMAT_UNDEFINED = 7;
    static final int IFD_FORMAT_URATIONAL = 5;
    static final int IFD_FORMAT_USHORT = 3;
    private static final String TAG = "ExifAttribute";
    public final byte[] bytes;
    public final long bytesOffset;
    public final int format;
    public final int numberOfComponents;
    static final Charset ASCII = StandardCharsets.US_ASCII;
    static final String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] IFD_FORMAT_BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] EXIF_ASCII_PREFIX = {65, 83, 67, 73, 73, 0, 0, 0};

    public ExifAttribute(int i, int i2, long j, byte[] bArr) {
        this.format = i;
        this.numberOfComponents = i2;
        this.bytesOffset = j;
        this.bytes = bArr;
    }

    @NonNull
    public static ExifAttribute createByte(@NonNull String str) {
        if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
            return new ExifAttribute(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
        }
        byte[] bytes = str.getBytes(ASCII);
        return new ExifAttribute(1, bytes.length, bytes);
    }

    @NonNull
    public static ExifAttribute createDouble(@NonNull double[] dArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[12] * dArr.length]);
        wrap.order(byteOrder);
        for (double d : dArr) {
            wrap.putDouble(d);
        }
        return new ExifAttribute(12, dArr.length, wrap.array());
    }

    @NonNull
    public static ExifAttribute createSLong(@NonNull int[] iArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[9] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putInt(i);
        }
        return new ExifAttribute(9, iArr.length, wrap.array());
    }

    @NonNull
    public static ExifAttribute createSRational(@NonNull LongRational[] longRationalArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[10] * longRationalArr.length]);
        wrap.order(byteOrder);
        for (LongRational longRational : longRationalArr) {
            wrap.putInt((int) longRational.getNumerator());
            wrap.putInt((int) longRational.getDenominator());
        }
        return new ExifAttribute(10, longRationalArr.length, wrap.array());
    }

    @NonNull
    public static ExifAttribute createString(@NonNull String str) {
        byte[] bytes = (str + (char) 0).getBytes(ASCII);
        return new ExifAttribute(2, bytes.length, bytes);
    }

    @NonNull
    public static ExifAttribute createULong(@NonNull long[] jArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[4] * jArr.length]);
        wrap.order(byteOrder);
        for (long j : jArr) {
            wrap.putInt((int) j);
        }
        return new ExifAttribute(4, jArr.length, wrap.array());
    }

    @NonNull
    public static ExifAttribute createURational(@NonNull LongRational[] longRationalArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[5] * longRationalArr.length]);
        wrap.order(byteOrder);
        for (LongRational longRational : longRationalArr) {
            wrap.putInt((int) longRational.getNumerator());
            wrap.putInt((int) longRational.getDenominator());
        }
        return new ExifAttribute(5, longRationalArr.length, wrap.array());
    }

    @NonNull
    public static ExifAttribute createUShort(@NonNull int[] iArr, @NonNull ByteOrder byteOrder) {
        ByteBuffer wrap = ByteBuffer.wrap(new byte[IFD_FORMAT_BYTES_PER_FORMAT[3] * iArr.length]);
        wrap.order(byteOrder);
        for (int i : iArr) {
            wrap.putShort((short) i);
        }
        return new ExifAttribute(3, iArr.length, wrap.array());
    }

    public double getDoubleValue(@NonNull ByteOrder byteOrder) {
        Object value = getValue(byteOrder);
        if (value == null) {
            XML$$ExternalSyntheticBUOutline0.m$2("NULL can't be converted to a double value");
            return 0.0d;
        }
        if (value instanceof String) {
            return Double.parseDouble((String) value);
        }
        if (value instanceof long[]) {
            if (((long[]) value).length == 1) {
                return r3[0];
            }
            XML$$ExternalSyntheticBUOutline0.m$2("There are more than one component");
            return 0.0d;
        }
        if (value instanceof int[]) {
            if (((int[]) value).length == 1) {
                return r3[0];
            }
            XML$$ExternalSyntheticBUOutline0.m$2("There are more than one component");
            return 0.0d;
        }
        if (value instanceof double[]) {
            double[] dArr = (double[]) value;
            if (dArr.length == 1) {
                return dArr[0];
            }
            XML$$ExternalSyntheticBUOutline0.m$2("There are more than one component");
            return 0.0d;
        }
        if (!(value instanceof LongRational[])) {
            XML$$ExternalSyntheticBUOutline0.m$2("Couldn't find a double value");
            return 0.0d;
        }
        LongRational[] longRationalArr = (LongRational[]) value;
        if (longRationalArr.length == 1) {
            return longRationalArr[0].toDouble();
        }
        XML$$ExternalSyntheticBUOutline0.m$2("There are more than one component");
        return 0.0d;
    }

    public int getIntValue(@NonNull ByteOrder byteOrder) {
        Object value = getValue(byteOrder);
        if (value == null) {
            XML$$ExternalSyntheticBUOutline0.m$2("NULL can't be converted to a integer value");
            return 0;
        }
        if (value instanceof String) {
            return Integer.parseInt((String) value);
        }
        if (value instanceof long[]) {
            long[] jArr = (long[]) value;
            if (jArr.length == 1) {
                return (int) jArr[0];
            }
            XML$$ExternalSyntheticBUOutline0.m$2("There are more than one component");
            return 0;
        }
        if (!(value instanceof int[])) {
            XML$$ExternalSyntheticBUOutline0.m$2("Couldn't find a integer value");
            return 0;
        }
        int[] iArr = (int[]) value;
        if (iArr.length == 1) {
            return iArr[0];
        }
        XML$$ExternalSyntheticBUOutline0.m$2("There are more than one component");
        return 0;
    }

    @Nullable
    public String getStringValue(@NonNull ByteOrder byteOrder) {
        Object value = getValue(byteOrder);
        if (value == null) {
            return null;
        }
        if (value instanceof String) {
            return (String) value;
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        if (value instanceof long[]) {
            long[] jArr = (long[]) value;
            while (i < jArr.length) {
                sb.append(jArr[i]);
                i++;
                if (i != jArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (value instanceof int[]) {
            int[] iArr = (int[]) value;
            while (i < iArr.length) {
                sb.append(iArr[i]);
                i++;
                if (i != iArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (value instanceof double[]) {
            double[] dArr = (double[]) value;
            while (i < dArr.length) {
                sb.append(dArr[i]);
                i++;
                if (i != dArr.length) {
                    sb.append(",");
                }
            }
            return sb.toString();
        }
        if (!(value instanceof LongRational[])) {
            return null;
        }
        LongRational[] longRationalArr = (LongRational[]) value;
        while (i < longRationalArr.length) {
            sb.append(longRationalArr[i].getNumerator());
            sb.append('/');
            sb.append(longRationalArr[i].getDenominator());
            i++;
            if (i != longRationalArr.length) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0030: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:49), block:B:109:0x0030 */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v16, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v18, types: [long[]] */
    /* JADX WARN: Type inference failed for: r11v20, types: [androidx.camera.core.impl.utils.LongRational[]] */
    /* JADX WARN: Type inference failed for: r11v22, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v24, types: [int[]] */
    /* JADX WARN: Type inference failed for: r11v26, types: [androidx.camera.core.impl.utils.LongRational[]] */
    /* JADX WARN: Type inference failed for: r11v28, types: [double[]] */
    /* JADX WARN: Type inference failed for: r11v31, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object getValue(java.nio.ByteOrder r11) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.impl.utils.ExifAttribute.getValue(java.nio.ByteOrder):java.lang.Object");
    }

    public int size() {
        return IFD_FORMAT_BYTES_PER_FORMAT[this.format] * this.numberOfComponents;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(MarkdownConstants.LEFT_PARENTHESIS);
        sb.append(IFD_FORMAT_NAMES[this.format]);
        sb.append(", data length:");
        return a$$ExternalSyntheticOutline0.m(sb, this.bytes.length, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public ExifAttribute(int i, int i2, byte[] bArr) {
        this(i, i2, -1L, bArr);
    }

    @NonNull
    public static ExifAttribute createDouble(double d, @NonNull ByteOrder byteOrder) {
        return createDouble(new double[]{d}, byteOrder);
    }

    @NonNull
    public static ExifAttribute createSLong(int i, @NonNull ByteOrder byteOrder) {
        return createSLong(new int[]{i}, byteOrder);
    }

    @NonNull
    public static ExifAttribute createULong(long j, @NonNull ByteOrder byteOrder) {
        return createULong(new long[]{j}, byteOrder);
    }

    @NonNull
    public static ExifAttribute createUShort(int i, @NonNull ByteOrder byteOrder) {
        return createUShort(new int[]{i}, byteOrder);
    }

    @NonNull
    public static ExifAttribute createURational(@NonNull LongRational longRational, @NonNull ByteOrder byteOrder) {
        return createURational(new LongRational[]{longRational}, byteOrder);
    }

    @NonNull
    public static ExifAttribute createSRational(@NonNull LongRational longRational, @NonNull ByteOrder byteOrder) {
        return createSRational(new LongRational[]{longRational}, byteOrder);
    }
}
