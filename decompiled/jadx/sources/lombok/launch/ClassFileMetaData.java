package lombok.launch;

import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import okio.Utf8;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
class ClassFileMetaData {
    private static final byte CLASS = 7;
    private static final byte DOUBLE = 6;
    private static final byte DYNAMIC = 17;
    private static final byte FIELD = 9;
    private static final byte FLOAT = 4;
    private static final byte INTEGER = 3;
    private static final byte INTERFACE_METHOD = 11;
    private static final byte INVOKE_DYNAMIC = 18;
    private static final byte LONG = 5;
    private static final byte METHOD = 10;
    private static final byte METHOD_HANDLE = 15;
    private static final byte METHOD_TYPE = 16;
    private static final byte MODULE = 19;
    private static final byte NAME_TYPE = 12;
    private static final int NOT_FOUND = -1;
    private static final byte PACKAGE = 20;
    private static final int START_OF_CONSTANT_POOL = 8;
    private static final byte STRING = 8;
    private static final byte UTF8 = 1;
    private final byte[] byteCode;
    private final int endOfPool;
    private final int maxPoolSize;
    private final int[] offsets;
    private final byte[] types;
    private final String[] utf8s;

    public ClassFileMetaData(byte[] bArr) {
        this.byteCode = bArr;
        int readValue = readValue(8);
        this.maxPoolSize = readValue;
        this.offsets = new int[readValue];
        this.types = new byte[readValue];
        this.utf8s = new String[readValue];
        int i = 10;
        int i2 = 1;
        while (i2 < this.maxPoolSize) {
            byte b = bArr[i];
            this.types[i2] = b;
            int i3 = i + 1;
            this.offsets[i2] = i3;
            switch (b) {
                case 0:
                    i = i3;
                    break;
                case 1:
                    int readValue2 = readValue(i3);
                    int i4 = i + 3;
                    this.utf8s[i2] = decodeString(i4, readValue2);
                    i = i4 + readValue2;
                    break;
                case 2:
                case 13:
                case 14:
                default:
                    Buffer$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(b, "Unknown constant pool type "));
                    throw null;
                case 3:
                case 4:
                case 9:
                case 10:
                case 11:
                case 12:
                case 17:
                case 18:
                    i += 5;
                    break;
                case 5:
                case 6:
                    i += 9;
                    i2++;
                    break;
                case 7:
                case 8:
                case 16:
                case 19:
                case 20:
                    i += 3;
                    break;
                case 15:
                    i += 4;
                    break;
            }
            i2++;
        }
        this.endOfPool = i;
    }

    private void appendAccess(StringBuilder sb, int i) {
        int i2 = this.offsets[i];
        sb.append(getClassName(readValue(i2)));
        sb.append(".");
        appendNameAndType(sb, readValue(i2 + 2));
    }

    private void appendNameAndType(StringBuilder sb, int i) {
        int i2 = this.offsets[i];
        sb.append(this.utf8s[readValue(i2)]);
        sb.append(":");
        sb.append(this.utf8s[readValue(i2 + 2)]);
    }

    private String decodeString(int i, int i2) {
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte[] bArr = this.byteCode;
            int i5 = i + 1;
            byte b = bArr[i];
            int i6 = b & 255;
            if (i6 < 128) {
                cArr[i4] = (char) i6;
                i4++;
                i = i5;
            } else if ((b & 224) == 192) {
                i += 2;
                cArr[i4] = (char) ((bArr[i5] & Utf8.REPLACEMENT_BYTE) | ((b & 31) << 6));
                i4++;
            } else {
                i += 3;
                cArr[i4] = (char) ((bArr[i + 2] & Utf8.REPLACEMENT_BYTE) | ((bArr[i5] & Utf8.REPLACEMENT_BYTE) << 6) | ((b & 15) << 12));
                i4++;
            }
        }
        return new String(cArr, 0, i4);
    }

    private int findClass(String str) {
        int findUtf8 = findUtf8(str);
        if (findUtf8 == -1) {
            return -1;
        }
        for (int i = 1; i < this.maxPoolSize; i++) {
            if (this.types[i] == 7 && readValue(this.offsets[i]) == findUtf8) {
                return i;
            }
        }
        return -1;
    }

    private int findNameAndType(String str, String str2) {
        int findUtf8;
        int findUtf82 = findUtf8(str);
        if (findUtf82 == -1 || (findUtf8 = findUtf8(str2)) == -1) {
            return -1;
        }
        for (int i = 1; i < this.maxPoolSize; i++) {
            if (this.types[i] == 12 && readValue(this.offsets[i]) == findUtf82 && readValue(this.offsets[i] + 2) == findUtf8) {
                return i;
            }
        }
        return -1;
    }

    private int findUtf8(String str) {
        for (int i = 1; i < this.maxPoolSize; i++) {
            if (str.equals(this.utf8s[i])) {
                return i;
            }
        }
        return -1;
    }

    private String getClassName(int i) {
        if (i < 1) {
            return null;
        }
        return this.utf8s[readValue(this.offsets[i])];
    }

    private boolean isMethod(int i) {
        byte b = this.types[i];
        return b == 10 || b == 11;
    }

    private int read32(int i) {
        byte[] bArr = this.byteCode;
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    private double readDouble(int i) {
        return Double.longBitsToDouble(readLong(i));
    }

    private float readFloat(int i) {
        return Float.intBitsToFloat(readInteger(i));
    }

    private int readInteger(int i) {
        return read32(this.offsets[i]);
    }

    private long readLong(int i) {
        int i2 = this.offsets[i];
        return (read32(i2 + 4) & 4294967295L) | (read32(i2) << 32);
    }

    private int readValue(int i) {
        byte[] bArr = this.byteCode;
        return (bArr[i + 1] & 255) | ((bArr[i] & 255) << 8);
    }

    public boolean containsDouble(double d) {
        boolean isNaN = Double.isNaN(d);
        for (int i = 1; i < this.maxPoolSize; i++) {
            if (this.types[i] == 6) {
                double readDouble = readDouble(i);
                if (readDouble == d || (isNaN && Double.isNaN(readDouble))) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsFloat(float f) {
        boolean isNaN = Float.isNaN(f);
        for (int i = 1; i < this.maxPoolSize; i++) {
            if (this.types[i] == 4) {
                float readFloat = readFloat(i);
                if (readFloat == f || (isNaN && Float.isNaN(readFloat))) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean containsInteger(int i) {
        for (int i2 = 1; i2 < this.maxPoolSize; i2++) {
            if (this.types[i2] == 3 && readInteger(i2) == i) {
                return true;
            }
        }
        return false;
    }

    public boolean containsLong(long j) {
        for (int i = 1; i < this.maxPoolSize; i++) {
            if (this.types[i] == 5 && readLong(i) == j) {
                return true;
            }
        }
        return false;
    }

    public boolean containsStringConstant(String str) {
        int findUtf8 = findUtf8(str);
        if (findUtf8 == -1) {
            return false;
        }
        for (int i = 1; i < this.maxPoolSize; i++) {
            if (this.types[i] == 8 && readValue(this.offsets[i]) == findUtf8) {
                return true;
            }
        }
        return false;
    }

    public boolean containsUtf8(String str) {
        return findUtf8(str) != -1;
    }

    public List<String> getInterfaces() {
        int readValue = readValue(this.endOfPool + 6);
        if (readValue == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < readValue; i++) {
            arrayList.add(getClassName(readValue((i * 2) + this.endOfPool + 8)));
        }
        return arrayList;
    }

    public int[] getOffsets(byte b) {
        int[] iArr = new int[this.types.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = this.types;
            if (i >= bArr.length) {
                return Arrays.copyOf(iArr, i2);
            }
            if (bArr[i] == b) {
                iArr[i2] = this.offsets[i];
                i2++;
            }
            i++;
        }
    }

    public String getSuperClassName() {
        return getClassName(readValue(this.endOfPool + 4));
    }

    public String poolContent() {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < this.maxPoolSize; i++) {
            sb.append(String.format("#%02x: ", Integer.valueOf(i)));
            int i2 = this.offsets[i];
            switch (this.types[i]) {
                case 0:
                    sb.append("(cont.)");
                    break;
                case 1:
                    sb.append("Utf8 ");
                    sb.append(this.utf8s[i]);
                    break;
                case 3:
                    sb.append("int ");
                    sb.append(readInteger(i));
                    break;
                case 4:
                    sb.append("float ");
                    sb.append(readFloat(i));
                    break;
                case 5:
                    sb.append("long ");
                    sb.append(readLong(i));
                    break;
                case 6:
                    sb.append("double ");
                    sb.append(readDouble(i));
                    break;
                case 7:
                    sb.append("Class ");
                    sb.append(getClassName(i));
                    break;
                case 8:
                    sb.append("String \"");
                    sb.append(this.utf8s[readValue(i2)]);
                    sb.append(DeviceConfigConstants.DOUBLE_QUOTE);
                    break;
                case 9:
                    sb.append("Field ");
                    appendAccess(sb, i);
                    break;
                case 10:
                case 11:
                    sb.append("Method ");
                    appendAccess(sb, i);
                    break;
                case 12:
                    sb.append("Name&Type ");
                    appendNameAndType(sb, i);
                    break;
                case 15:
                    sb.append("MethodHandle...");
                    break;
                case 16:
                    sb.append("MethodType...");
                    break;
                case 17:
                    sb.append("Dynamic...");
                    break;
                case 18:
                    sb.append("InvokeDynamic...");
                    break;
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public boolean usesClass(String str) {
        return findClass(str) != -1;
    }

    public boolean usesField(String str, String str2) {
        int findUtf8;
        int findClass = findClass(str);
        if (findClass == -1 || (findUtf8 = findUtf8(str2)) == -1) {
            return false;
        }
        for (int i = 1; i < this.maxPoolSize; i++) {
            if (this.types[i] == 9 && readValue(this.offsets[i]) == findClass) {
                if (readValue(this.offsets[readValue(this.offsets[i] + 2)]) == findUtf8) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean usesMethod(String str, String str2) {
        int findUtf8;
        int findClass = findClass(str);
        if (findClass == -1 || (findUtf8 = findUtf8(str2)) == -1) {
            return false;
        }
        for (int i = 1; i < this.maxPoolSize; i++) {
            if (isMethod(i) && readValue(this.offsets[i]) == findClass) {
                if (readValue(this.offsets[readValue(this.offsets[i] + 2)]) == findUtf8) {
                    return true;
                }
            }
        }
        return false;
    }

    public String getClassName() {
        return getClassName(readValue(this.endOfPool + 2));
    }

    public boolean usesMethod(String str, String str2, String str3) {
        int findNameAndType;
        int findClass = findClass(str);
        if (findClass == -1 || (findNameAndType = findNameAndType(str2, str3)) == -1) {
            return false;
        }
        for (int i = 1; i < this.maxPoolSize; i++) {
            if (isMethod(i) && readValue(this.offsets[i]) == findClass && readValue(this.offsets[i] + 2) == findNameAndType) {
                return true;
            }
        }
        return false;
    }
}
