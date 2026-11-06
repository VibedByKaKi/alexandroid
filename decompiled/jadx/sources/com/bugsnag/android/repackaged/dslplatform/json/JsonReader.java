package com.bugsnag.android.repackaged.dslplatform.json;

import androidx.annotation.Nullable;
import androidx.compose.runtime.ComposerKt;
import defpackage.a$$ExternalSyntheticOutline0;
import io.branch.referral.BranchError;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Formatter;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import okio.Utf8;
import org.apache.commons.net.telnet.TelnetCommand;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class JsonReader<TContext> {
    private static final boolean[] WHITESPACE;
    private static final EOFException eof;
    private static final Charset utf8 = Charset.forName("UTF-8");
    protected byte[] buffer;
    private int bufferLenWithExtraSpace;
    protected char[] chars;
    public final TContext context;
    private int currentIndex;
    private long currentPosition;
    protected final int doubleLengthLimit;
    protected final DoublePrecision doublePrecision;
    private final StringBuilder error;
    private final Formatter errorFormatter;
    protected final ErrorInfo errorInfo;
    private final StringCache keyCache;
    private byte last;
    private int lastNameLen;
    private int length;
    protected final int maxNumberDigits;
    private final int maxStringBuffer;
    private int nameEnd;
    private final byte[] originalBuffer;
    private final int originalBufferLenWithExtraSpace;
    private int readLimit;
    private InputStream stream;
    private final char[] tmp;
    private int tokenStart;
    private final TypeLookup typeLookup;
    protected final UnknownNumberParsing unknownNumbers;
    private final StringCache valuesCache;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface BindObject<T> {
        T bind(JsonReader jsonReader, T t) throws IOException;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum DoublePrecision {
        EXACT(0),
        HIGH(1),
        DEFAULT(3),
        LOW(4);

        final int level;

        DoublePrecision(int i) {
            this.level = i;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class EmptyEOFException extends EOFException {
        private EmptyEOFException() {
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum ErrorInfo {
        WITH_STACK_TRACE,
        DESCRIPTION_AND_POSITION,
        DESCRIPTION_ONLY,
        MINIMAL
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ReadJsonObject<T extends JsonObject> {
        @Nullable
        T deserialize(JsonReader jsonReader) throws IOException;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ReadObject<T> {
        @Nullable
        T read(JsonReader jsonReader) throws IOException;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum UnknownNumberParsing {
        LONG_AND_BIGDECIMAL,
        LONG_AND_DOUBLE,
        BIGDECIMAL,
        DOUBLE
    }

    static {
        boolean[] zArr = new boolean[256];
        WHITESPACE = zArr;
        zArr[137] = true;
        zArr[138] = true;
        zArr[139] = true;
        zArr[140] = true;
        zArr[141] = true;
        zArr[160] = true;
        zArr[32] = true;
        zArr[97] = true;
        zArr[98] = true;
        zArr[99] = true;
        eof = new EmptyEOFException();
    }

    private JsonReader(char[] cArr, byte[] bArr, int i, @Nullable TContext tcontext, @Nullable StringCache stringCache, @Nullable StringCache stringCache2, @Nullable TypeLookup typeLookup, ErrorInfo errorInfo, DoublePrecision doublePrecision, UnknownNumberParsing unknownNumberParsing, int i2, int i3) {
        this.currentIndex = 0;
        this.currentPosition = 0L;
        this.last = (byte) 32;
        StringBuilder sb = new StringBuilder(0);
        this.error = sb;
        this.errorFormatter = new Formatter(sb);
        this.tmp = cArr;
        this.buffer = bArr;
        this.length = i;
        int length = bArr.length - 38;
        this.bufferLenWithExtraSpace = length;
        this.context = tcontext;
        this.chars = cArr;
        this.keyCache = stringCache;
        this.valuesCache = stringCache2;
        this.typeLookup = typeLookup;
        this.errorInfo = errorInfo;
        this.doublePrecision = doublePrecision;
        this.unknownNumbers = unknownNumberParsing;
        this.maxNumberDigits = i2;
        this.maxStringBuffer = i3;
        this.doubleLengthLimit = doublePrecision.level + 15;
        this.originalBuffer = bArr;
        this.originalBufferLenWithExtraSpace = length;
    }

    private int calcHashAndCopyName(long j, int i) throws IOException {
        int i2 = i - this.tokenStart;
        long j2 = this.currentPosition - i2;
        while (true) {
            char[] cArr = this.chars;
            if (cArr.length >= i2) {
                break;
            }
            this.chars = Arrays.copyOf(cArr, cArr.length * 2);
        }
        int i3 = 0;
        while (i3 < i2) {
            this.chars[i3] = (char) this.buffer[this.tokenStart + i3];
            i3++;
        }
        this.currentIndex = i;
        while (true) {
            byte read = read();
            if (read == 92) {
                read = read();
            } else if (read == 34) {
                this.nameEnd = -1;
                this.lastNameLen = i3;
                return (int) j;
            }
            char[] cArr2 = this.chars;
            if (i3 == cArr2.length) {
                this.chars = Arrays.copyOf(cArr2, cArr2.length * 2);
            }
            int i4 = i3 + 1;
            this.chars[i3] = (char) read;
            j = (j ^ read) * 16777619;
            if (isEndOfStream()) {
                throw newParseErrorAt("JSON string was not closed with a double quote", (int) j2);
            }
            i3 = i4;
        }
    }

    private int calcWeakHashAndCopyName(int i, int i2) throws IOException {
        int i3 = i2 - this.tokenStart;
        long j = this.currentPosition - i3;
        while (true) {
            char[] cArr = this.chars;
            if (cArr.length >= i3) {
                break;
            }
            this.chars = Arrays.copyOf(cArr, cArr.length * 2);
        }
        int i4 = 0;
        while (i4 < i3) {
            this.chars[i4] = (char) this.buffer[this.tokenStart + i4];
            i4++;
        }
        this.currentIndex = i2;
        while (true) {
            byte read = read();
            if (read == 92) {
                read = read();
            } else if (read == 34) {
                this.nameEnd = -1;
                this.lastNameLen = i4;
                return i;
            }
            char[] cArr2 = this.chars;
            if (i4 == cArr2.length) {
                this.chars = Arrays.copyOf(cArr2, cArr2.length * 2);
            }
            int i5 = i4 + 1;
            this.chars[i4] = (char) read;
            i += read;
            if (isEndOfStream()) {
                throw newParseErrorAt("JSON string was not closed with a double quote", (int) j);
            }
            i4 = i5;
        }
    }

    private int hexToInt(byte b) throws ParsingException {
        if (b >= 48 && b <= 57) {
            return b - 48;
        }
        if (b >= 65 && b <= 70) {
            return b - 55;
        }
        if (b < 97 || b > 102) {
            throw newParseErrorWith("Could not parse unicode escape, expected a hexadecimal digit", Byte.valueOf(b));
        }
        return b - 87;
    }

    private void positionDescription(int i, StringBuilder sb) {
        sb.append("at position: ");
        sb.append(positionInStream(i));
        int i2 = this.currentIndex;
        if (i2 > i) {
            try {
                int min = Math.min(i2 - i, 20);
                String str = new String(this.buffer, (this.currentIndex - i) - min, min, utf8);
                sb.append(", following: `");
                sb.append(str);
                sb.append('`');
            } catch (Exception unused) {
            }
        }
        int i3 = this.currentIndex;
        int i4 = i3 - i;
        int i5 = this.readLimit;
        if (i4 < i5) {
            try {
                String str2 = new String(this.buffer, this.currentIndex - i, Math.min((i5 - i3) + i, 20), utf8);
                sb.append(", before: `");
                sb.append(str2);
                sb.append('`');
            } catch (Exception unused2) {
            }
        }
    }

    private int prepareNextBlock() throws IOException {
        int i = this.length;
        int i2 = this.currentIndex;
        int i3 = i - i2;
        byte[] bArr = this.buffer;
        System.arraycopy(bArr, i2, bArr, 0, i3);
        int readFully = readFully(this.buffer, this.stream, i3);
        long j = this.currentPosition;
        int i4 = this.currentIndex;
        this.currentPosition = j + i4;
        if (readFully == i3) {
            int i5 = this.length - i4;
            this.readLimit = i5;
            this.length = i5;
            this.currentIndex = 0;
            return readFully;
        }
        int i6 = this.bufferLenWithExtraSpace;
        if (readFully < i6) {
            i6 = readFully;
        }
        this.readLimit = i6;
        this.length = readFully;
        this.currentIndex = 0;
        return readFully;
    }

    private static int readFully(byte[] bArr, InputStream inputStream, int i) throws IOException {
        int read;
        while (i < bArr.length && (read = inputStream.read(bArr, i, bArr.length - i)) != -1) {
            i += read;
        }
        return i;
    }

    @Nullable
    private Object readNull(Class<?> cls) throws IOException {
        if (!wasNull()) {
            throw newParseErrorAt("Expecting 'null' as null constant", 0);
        }
        if (!cls.isPrimitive()) {
            return null;
        }
        if (cls == Integer.TYPE) {
            return 0;
        }
        if (cls == Long.TYPE) {
            return 0L;
        }
        if (cls == Short.TYPE) {
            return (short) 0;
        }
        if (cls == Byte.TYPE) {
            return (byte) 0;
        }
        return cls == Float.TYPE ? Float.valueOf(0.0f) : cls == Double.TYPE ? Double.valueOf(0.0d) : cls == Boolean.TYPE ? Boolean.FALSE : cls == Character.TYPE ? (char) 0 : null;
    }

    private byte skipString() throws IOException {
        byte read = read();
        boolean z = false;
        while (true) {
            if (read == 34 && !z) {
                return getNextToken();
            }
            z = !z && read == 92;
            read = read();
        }
    }

    private boolean wasWhiteSpace() {
        byte b = this.last;
        if (b != -96 && b != 32) {
            switch (b) {
                case -31:
                    int i = this.currentIndex;
                    if (i + 1 < this.length) {
                        byte[] bArr = this.buffer;
                        if (bArr[i] == -102 && bArr[i + 1] == Byte.MIN_VALUE) {
                            this.currentIndex = i + 2;
                            this.last = (byte) 32;
                            return true;
                        }
                    }
                    return false;
                case -30:
                    int i2 = this.currentIndex;
                    if (i2 + 1 >= this.length) {
                        return false;
                    }
                    byte[] bArr2 = this.buffer;
                    byte b2 = bArr2[i2];
                    byte b3 = bArr2[i2 + 1];
                    if (b2 == -127 && b3 == -97) {
                        this.currentIndex = i2 + 2;
                        this.last = (byte) 32;
                        return true;
                    }
                    if (b2 != Byte.MIN_VALUE) {
                        return false;
                    }
                    if (b3 != -88 && b3 != -87 && b3 != -81) {
                        switch (b3) {
                            case Byte.MIN_VALUE:
                            case ComposerKt.defaultsKey /* -127 */:
                            case -126:
                            case -125:
                            case -124:
                            case -123:
                            case BranchError.ERR_OTHER /* -122 */:
                            case BranchError.ERR_NETWORK_ON_MAIN /* -121 */:
                            case BranchError.ERR_BRANCH_TASK_TIMEOUT /* -120 */:
                            case BranchError.ERR_IMPROPER_REINITIALIZATION /* -119 */:
                            case BranchError.ERR_BRANCH_ALREADY_INITIALIZED /* -118 */:
                                break;
                            default:
                                return false;
                        }
                    }
                    this.currentIndex = i2 + 2;
                    this.last = (byte) 32;
                    return true;
                case -29:
                    int i3 = this.currentIndex;
                    if (i3 + 1 < this.length) {
                        byte[] bArr3 = this.buffer;
                        if (bArr3[i3] == Byte.MIN_VALUE && bArr3[i3 + 1] == Byte.MIN_VALUE) {
                            this.currentIndex = i3 + 2;
                            this.last = (byte) 32;
                            return true;
                        }
                    }
                    return false;
                default:
                    switch (b) {
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                            break;
                        default:
                            return false;
                    }
            }
        }
        return true;
    }

    public final boolean allWhitespace(int i, int i2) {
        byte[] bArr = this.buffer;
        while (i < i2) {
            if (!WHITESPACE[bArr[i] + 128]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public final StringBuilder appendString(StringBuilder sb) throws IOException {
        sb.append(this.chars, 0, parseString());
        return sb;
    }

    public final int calcHash() throws IOException {
        int i;
        if (this.last != 34) {
            throw newParseError("Expecting '\"' for attribute name start");
        }
        int i2 = this.currentIndex;
        this.tokenStart = i2;
        long j = -2128831035;
        if (this.stream != null) {
            while (true) {
                i = this.readLimit;
                if (i2 >= i) {
                    break;
                }
                byte[] bArr = this.buffer;
                byte b = bArr[i2];
                if (b == 92) {
                    if (i2 == i - 1) {
                        return calcHashAndCopyName(j, i2);
                    }
                    i2++;
                    b = bArr[i2];
                } else if (b == 34) {
                    break;
                }
                i2++;
                j = (j ^ b) * 16777619;
            }
            if (i2 >= i) {
                return calcHashAndCopyName(j, i2);
            }
            int i3 = i2 + 1;
            this.currentIndex = i3;
            this.nameEnd = i3;
        } else {
            while (true) {
                byte[] bArr2 = this.buffer;
                if (i2 >= bArr2.length) {
                    break;
                }
                int i4 = i2 + 1;
                byte b2 = bArr2[i2];
                if (b2 != 92) {
                    i2 = i4;
                    if (b2 == 34) {
                        break;
                    }
                } else {
                    if (i4 == bArr2.length) {
                        throw newParseError("Expecting '\"' for attribute name end");
                    }
                    i2 += 2;
                    b2 = bArr2[i4];
                }
                j = (j ^ b2) * 16777619;
            }
            this.currentIndex = i2;
            this.nameEnd = i2;
        }
        return (int) j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0030, code lost:
    
        if (r0 < r2) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0036, code lost:
    
        return calcWeakHashAndCopyName(r4, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0037, code lost:
    
        r0 = r0 + 1;
        r7.currentIndex = r0;
        r7.nameEnd = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x005e, code lost:
    
        r7.currentIndex = r0;
        r7.nameEnd = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0062, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int calcWeakHash() throws java.io.IOException {
        /*
            r7 = this;
            byte r0 = r7.last
            r1 = 34
            if (r0 != r1) goto L63
            int r0 = r7.currentIndex
            r7.tokenStart = r0
            java.io.InputStream r2 = r7.stream
            r3 = 92
            r4 = 0
            if (r2 == 0) goto L3e
        L11:
            int r2 = r7.readLimit
            if (r0 >= r2) goto L30
            byte[] r5 = r7.buffer
            r6 = r5[r0]
            if (r6 != r3) goto L29
            int r2 = r2 + (-1)
            if (r0 != r2) goto L24
            int r7 = r7.calcWeakHashAndCopyName(r4, r0)
            return r7
        L24:
            int r0 = r0 + 1
            r6 = r5[r0]
            goto L2c
        L29:
            if (r6 != r1) goto L2c
            goto L30
        L2c:
            int r0 = r0 + 1
            int r4 = r4 + r6
            goto L11
        L30:
            if (r0 < r2) goto L37
            int r7 = r7.calcWeakHashAndCopyName(r4, r0)
            return r7
        L37:
            int r0 = r0 + 1
            r7.currentIndex = r0
            r7.nameEnd = r0
            return r4
        L3e:
            byte[] r2 = r7.buffer
            int r5 = r2.length
            if (r0 >= r5) goto L5e
            int r5 = r0 + 1
            r6 = r2[r0]
            if (r6 != r3) goto L58
            int r6 = r2.length
            if (r5 == r6) goto L51
            int r0 = r0 + 2
            r6 = r2[r5]
            goto L5c
        L51:
            java.lang.String r0 = "Expecting '\"' for attribute name end"
            com.bugsnag.android.repackaged.dslplatform.json.ParsingException r7 = r7.newParseError(r0)
            throw r7
        L58:
            r0 = r5
            if (r6 != r1) goto L5c
            goto L5e
        L5c:
            int r4 = r4 + r6
            goto L3e
        L5e:
            r7.currentIndex = r0
            r7.nameEnd = r0
            return r4
        L63:
            java.lang.String r0 = "Expecting '\"' for attribute name start"
            com.bugsnag.android.repackaged.dslplatform.json.ParsingException r7 = r7.newParseError(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bugsnag.android.repackaged.dslplatform.json.JsonReader.calcWeakHash():int");
    }

    public final void checkArrayEnd() throws IOException {
        if (this.last != 93) {
            if (this.currentIndex < this.length) {
                throw newParseError("Expecting ']' as array end");
            }
            throw newParseErrorAt("Unexpected end of JSON in collection", 0, eof);
        }
    }

    public final void checkObjectEnd() throws IOException {
        if (this.last != 125) {
            if (this.currentIndex < this.length) {
                throw newParseError("Expecting '}' as object end");
            }
            throw newParseErrorAt("Unexpected end of JSON in object", 0, eof);
        }
    }

    public final void comma() throws IOException {
        if (getNextToken() != 44) {
            if (this.currentIndex < this.length) {
                throw newParseError("Expecting ','");
            }
            throw newParseErrorAt("Unexpected end in JSON", 0, eof);
        }
    }

    public final <T extends JsonObject> void deserializeCollection(ReadJsonObject<T> readJsonObject, Collection<T> collection) throws IOException {
        if (this.last != 123) {
            throw newParseError("Expecting '{' as collection start");
        }
        getNextToken();
        collection.add(readJsonObject.deserialize(this));
        while (getNextToken() == 44) {
            if (getNextToken() != 123) {
                throw newParseError("Expecting '{' as object start within a collection");
            }
            getNextToken();
            collection.add(readJsonObject.deserialize(this));
        }
        checkArrayEnd();
    }

    public final <T, S extends T> ArrayList<T> deserializeCollectionCustom(ReadObject<S> readObject) throws IOException {
        ArrayList<T> arrayList = new ArrayList<>(4);
        deserializeCollection(readObject, arrayList);
        return arrayList;
    }

    public final <T extends JsonObject> void deserializeNullableCollection(ReadJsonObject<T> readJsonObject, Collection<T> collection) throws IOException {
        if (this.last == 123) {
            getNextToken();
            collection.add(readJsonObject.deserialize(this));
        } else {
            if (!wasNull()) {
                throw newParseError("Expecting '{' as collection start");
            }
            collection.add(null);
        }
        while (getNextToken() == 44) {
            if (getNextToken() == 123) {
                getNextToken();
                collection.add(readJsonObject.deserialize(this));
            } else {
                if (!wasNull()) {
                    throw newParseError("Expecting '{' as object start within a collection");
                }
                collection.add(null);
            }
        }
        checkArrayEnd();
    }

    public final <T, S extends T> ArrayList<T> deserializeNullableCollectionCustom(ReadObject<S> readObject) throws IOException {
        ArrayList<T> arrayList = new ArrayList<>(4);
        deserializeNullableCollection(readObject, arrayList);
        return arrayList;
    }

    public final void endArray() throws IOException {
        if (getNextToken() != 93) {
            if (this.currentIndex < this.length) {
                throw newParseError("Expecting ']' as array end");
            }
            throw newParseErrorAt("Unexpected end in JSON", 0, eof);
        }
    }

    public final void endObject() throws IOException {
        if (getNextToken() != 125) {
            if (this.currentIndex < this.length) {
                throw newParseError("Expecting '}' as object end");
            }
            throw newParseErrorAt("Unexpected end in JSON", 0, eof);
        }
    }

    public final int fillName() throws IOException {
        int calcHash = calcHash();
        if (read() == 58 || (wasWhiteSpace() && getNextToken() == 58)) {
            return calcHash;
        }
        throw newParseError("Expecting ':' after attribute name");
    }

    public final int fillNameWeakHash() throws IOException {
        int calcWeakHash = calcWeakHash();
        if (read() == 58 || (wasWhiteSpace() && getNextToken() == 58)) {
            return calcWeakHash;
        }
        throw newParseError("Expecting ':' after attribute name");
    }

    public final int findNonWhitespace(int i) {
        byte[] bArr = this.buffer;
        for (int i2 = i - 1; i2 > 0; i2--) {
            if (!WHITESPACE[bArr[i2] + 128]) {
                return i2 + 1;
            }
        }
        return 0;
    }

    public final int getCurrentIndex() {
        return this.currentIndex;
    }

    public final int getLastHash() {
        long j = -2128831035;
        if (this.stream == null || this.nameEnd != -1) {
            for (int i = this.tokenStart; i < this.nameEnd - 1; i++) {
                j = (j ^ this.buffer[i]) * 16777619;
            }
        } else {
            for (int i2 = 0; i2 < this.lastNameLen; i2++) {
                j = (j ^ ((byte) this.chars[i2])) * 16777619;
            }
        }
        return (int) j;
    }

    public final String getLastName() throws IOException {
        if (this.stream != null && this.nameEnd == -1) {
            return new String(this.chars, 0, this.lastNameLen);
        }
        return new String(this.buffer, this.tokenStart, (this.nameEnd - r2) - 1, "UTF-8");
    }

    public final byte getNextToken() throws IOException {
        read();
        if (WHITESPACE[this.last + 128]) {
            while (wasWhiteSpace()) {
                read();
            }
        }
        return this.last;
    }

    public final int getTokenStart() {
        return this.tokenStart;
    }

    public final boolean isEndOfStream() throws IOException {
        InputStream inputStream = this.stream;
        int i = this.length;
        return inputStream == null ? i == this.currentIndex : i == this.currentIndex && prepareNextBlock() == 0;
    }

    public final <T extends JsonObject> Iterator<T> iterateOver(ReadJsonObject<T> readJsonObject) {
        return new WithObjectReader(readJsonObject, this);
    }

    public final <T> Iterator<T> iterateOverCustom(ReadObject<T> readObject) {
        return new WithReader(readObject, this);
    }

    public final byte last() {
        return this.last;
    }

    public final int length() {
        return this.length;
    }

    public final ParsingException newParseError(String str, int i) {
        if (this.errorInfo == ErrorInfo.MINIMAL) {
            return ParsingException.create(str, false);
        }
        this.error.setLength(0);
        this.error.append(str);
        this.error.append(". Found ");
        this.error.append((char) this.last);
        ErrorInfo errorInfo = this.errorInfo;
        ErrorInfo errorInfo2 = ErrorInfo.DESCRIPTION_ONLY;
        StringBuilder sb = this.error;
        if (errorInfo == errorInfo2) {
            return ParsingException.create(sb.toString(), false);
        }
        sb.append(" ");
        positionDescription(i, this.error);
        return ParsingException.create(this.error.toString(), withStackTrace());
    }

    public final ParsingException newParseErrorAt(String str, int i, Exception exc) {
        if (exc == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("cause can't be null");
            return null;
        }
        if (this.errorInfo == ErrorInfo.MINIMAL) {
            return ParsingException.create(str, exc, false);
        }
        this.error.setLength(0);
        String message = exc.getMessage();
        if (message != null && message.length() > 0) {
            this.error.append(message);
            if (!message.endsWith(".")) {
                this.error.append(".");
            }
            this.error.append(" ");
        }
        this.error.append(str);
        ErrorInfo errorInfo = this.errorInfo;
        ErrorInfo errorInfo2 = ErrorInfo.DESCRIPTION_ONLY;
        StringBuilder sb = this.error;
        if (errorInfo == errorInfo2) {
            return ParsingException.create(sb.toString(), exc, false);
        }
        sb.append(" ");
        positionDescription(i, this.error);
        return ParsingException.create(this.error.toString(), withStackTrace());
    }

    public final ParsingException newParseErrorFormat(String str, int i, String str2, Object... objArr) {
        if (this.errorInfo == ErrorInfo.MINIMAL) {
            return ParsingException.create(str, false);
        }
        this.error.setLength(0);
        this.errorFormatter.format(str2, objArr);
        ErrorInfo errorInfo = this.errorInfo;
        ErrorInfo errorInfo2 = ErrorInfo.DESCRIPTION_ONLY;
        StringBuilder sb = this.error;
        if (errorInfo == errorInfo2) {
            return ParsingException.create(sb.toString(), false);
        }
        sb.append(" ");
        positionDescription(i, this.error);
        return ParsingException.create(this.error.toString(), withStackTrace());
    }

    public final ParsingException newParseErrorWith(String str, int i, String str2, String str3, @Nullable Object obj, String str4) {
        if (this.errorInfo == ErrorInfo.MINIMAL) {
            return ParsingException.create(str, false);
        }
        this.error.setLength(0);
        this.error.append(str2);
        this.error.append(str3);
        if (obj != null) {
            this.error.append(": '");
            this.error.append(obj.toString());
            this.error.append("'");
        }
        this.error.append(str4);
        ErrorInfo errorInfo = this.errorInfo;
        ErrorInfo errorInfo2 = ErrorInfo.DESCRIPTION_ONLY;
        StringBuilder sb = this.error;
        if (errorInfo == errorInfo2) {
            return ParsingException.create(sb.toString(), false);
        }
        sb.append(" ");
        positionDescription(i, this.error);
        return ParsingException.create(this.error.toString(), withStackTrace());
    }

    @Nullable
    public final <T> T next(Class<T> cls, T t) throws IOException {
        if (cls == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("manifest can't be null");
            return null;
        }
        if (t == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("instance can't be null");
            return null;
        }
        if (this.typeLookup == null) {
            throw new ConfigurationException(a$$ExternalSyntheticOutline0.m("typeLookup is not defined for this JsonReader. Unable to lookup specified type ", cls));
        }
        if (getNextToken() == 110) {
            return (T) readNull(cls);
        }
        BindObject<T> tryFindBinder = this.typeLookup.tryFindBinder(cls);
        if (tryFindBinder != null) {
            return tryFindBinder.bind(this, t);
        }
        throw new ConfigurationException(a$$ExternalSyntheticOutline0.m("Binder not found for ", cls, ". Check if binder was registered"));
    }

    public final int parseString() throws IOException {
        int hexToInt;
        int hexToInt2;
        int i = this.currentIndex;
        if (this.last != 34) {
            throw newParseError("Expecting '\"' for string start");
        }
        int i2 = this.length;
        if (i == i2) {
            throw newParseErrorAt("Premature end of JSON string", 0);
        }
        char[] cArr = this.chars;
        int i3 = i2 - i;
        if (cArr.length < i3) {
            i3 = cArr.length;
        }
        int i4 = i;
        int i5 = 0;
        while (true) {
            if (i5 >= i3) {
                break;
            }
            int i6 = i4 + 1;
            byte b = this.buffer[i4];
            if (b == 34) {
                this.currentIndex = i6;
                return i5;
            }
            if ((b ^ JsonWriter.ESCAPE) < 1) {
                i4 = i6;
                break;
            }
            cArr[i5] = (char) b;
            i5++;
            i4 = i6;
        }
        if (i5 == cArr.length) {
            char[] cArr2 = this.chars;
            int length = cArr2.length * 2;
            int i7 = this.maxStringBuffer;
            if (length > i7) {
                throw newParseErrorWith("Maximum string buffer limit exceeded", Integer.valueOf(i7));
            }
            cArr = Arrays.copyOf(cArr2, length);
            this.chars = cArr;
        }
        int length2 = cArr.length;
        int i8 = i4 - 1;
        this.currentIndex = i8;
        int i9 = i8 - i;
        while (!isEndOfStream()) {
            int read = read();
            if (read == 34) {
                return i9;
            }
            if (read == 92) {
                if (i9 >= length2 - 6) {
                    char[] cArr3 = this.chars;
                    int length3 = cArr3.length * 2;
                    int i10 = this.maxStringBuffer;
                    if (length3 > i10) {
                        throw newParseErrorWith("Maximum string buffer limit exceeded", Integer.valueOf(i10));
                    }
                    cArr = Arrays.copyOf(cArr3, length3);
                    this.chars = cArr;
                    length2 = cArr.length;
                }
                byte[] bArr = this.buffer;
                int i11 = this.currentIndex;
                int i12 = i11 + 1;
                this.currentIndex = i12;
                byte b2 = bArr[i11];
                if (b2 == 34 || b2 == 47 || b2 == 92) {
                    read = b2;
                } else if (b2 == 98) {
                    read = 8;
                } else if (b2 == 102) {
                    read = 12;
                } else if (b2 == 110) {
                    read = 10;
                } else if (b2 == 114) {
                    read = 13;
                } else if (b2 == 116) {
                    read = 9;
                } else {
                    if (b2 != 117) {
                        throw newParseErrorWith("Invalid escape combination detected", Integer.valueOf(b2));
                    }
                    this.currentIndex = i11 + 2;
                    int hexToInt3 = hexToInt(bArr[i12]) << 12;
                    byte[] bArr2 = this.buffer;
                    int i13 = this.currentIndex;
                    this.currentIndex = i13 + 1;
                    int hexToInt4 = hexToInt3 + (hexToInt(bArr2[i13]) << 8);
                    byte[] bArr3 = this.buffer;
                    int i14 = this.currentIndex;
                    this.currentIndex = i14 + 1;
                    hexToInt = hexToInt4 + (hexToInt(bArr3[i14]) << 4);
                    byte[] bArr4 = this.buffer;
                    int i15 = this.currentIndex;
                    this.currentIndex = i15 + 1;
                    hexToInt2 = hexToInt(bArr4[i15]);
                    read = hexToInt + hexToInt2;
                }
                cArr[i9] = (char) read;
                i9++;
            } else {
                if ((read & 128) != 0) {
                    if (i9 >= length2 - 4) {
                        char[] cArr4 = this.chars;
                        int length4 = cArr4.length * 2;
                        int i16 = this.maxStringBuffer;
                        if (length4 > i16) {
                            throw newParseErrorWith("Maximum string buffer limit exceeded", Integer.valueOf(i16));
                        }
                        char[] copyOf = Arrays.copyOf(cArr4, length4);
                        this.chars = copyOf;
                        cArr = copyOf;
                        length2 = copyOf.length;
                    }
                    byte[] bArr5 = this.buffer;
                    int i17 = this.currentIndex;
                    int i18 = i17 + 1;
                    this.currentIndex = i18;
                    byte b3 = bArr5[i17];
                    if ((read & 224) == 192) {
                        hexToInt = (read & 31) << 6;
                        hexToInt2 = b3 & Utf8.REPLACEMENT_BYTE;
                    } else {
                        int i19 = i17 + 2;
                        this.currentIndex = i19;
                        byte b4 = bArr5[i18];
                        if ((read & 240) == 224) {
                            hexToInt = ((read & 15) << 12) + ((b3 & Utf8.REPLACEMENT_BYTE) << 6);
                            hexToInt2 = b4 & Utf8.REPLACEMENT_BYTE;
                        } else {
                            this.currentIndex = i17 + 3;
                            byte b5 = bArr5[i19];
                            if ((read & TelnetCommand.EL) != 240) {
                                throw newParseErrorAt("Invalid unicode character detected", 0);
                            }
                            read = ((read & 7) << 18) + ((b3 & Utf8.REPLACEMENT_BYTE) << 12) + ((b4 & Utf8.REPLACEMENT_BYTE) << 6) + (b5 & Utf8.REPLACEMENT_BYTE);
                            if (read >= 65536) {
                                if (read >= 1114112) {
                                    throw newParseErrorAt("Invalid unicode character detected", 0);
                                }
                                int i20 = read - 65536;
                                int i21 = i9 + 1;
                                cArr[i9] = (char) ((i20 >>> 10) + 55296);
                                i9 += 2;
                                cArr[i21] = (char) ((i20 & 1023) + 56320);
                            }
                        }
                    }
                    read = hexToInt + hexToInt2;
                } else if (i9 >= length2) {
                    char[] cArr5 = this.chars;
                    int length5 = cArr5.length * 2;
                    int i22 = this.maxStringBuffer;
                    if (length5 > i22) {
                        throw newParseErrorWith("Maximum string buffer limit exceeded", Integer.valueOf(i22));
                    }
                    char[] copyOf2 = Arrays.copyOf(cArr5, length5);
                    this.chars = copyOf2;
                    cArr = copyOf2;
                    length2 = copyOf2.length;
                }
                cArr[i9] = (char) read;
                i9++;
            }
        }
        throw newParseErrorAt("JSON string was not closed with a double quote", 0);
    }

    public final long positionInStream(int i) {
        return (this.currentPosition + this.currentIndex) - i;
    }

    public final char[] prepareBuffer(int i, int i2) throws ParsingException {
        char[] cArr;
        if (i2 > this.maxNumberDigits) {
            throw newParseErrorWith("Too many digits detected in number", i2, "", "Too many digits detected in number", Integer.valueOf(i2), "");
        }
        while (true) {
            cArr = this.chars;
            if (cArr.length >= i2) {
                break;
            }
            this.chars = Arrays.copyOf(cArr, cArr.length * 2);
        }
        byte[] bArr = this.buffer;
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = (char) bArr[i + i3];
        }
        return cArr;
    }

    public final JsonReader<TContext> process(@Nullable InputStream inputStream) throws IOException {
        this.currentPosition = 0L;
        this.currentIndex = 0;
        this.stream = inputStream;
        if (inputStream != null) {
            int i = this.length;
            int i2 = this.bufferLenWithExtraSpace;
            if (i >= i2) {
                i = i2;
            }
            this.readLimit = i;
            int readFully = readFully(this.buffer, inputStream, 0);
            int i3 = this.bufferLenWithExtraSpace;
            if (readFully < i3) {
                i3 = readFully;
            }
            this.readLimit = i3;
            this.length = readFully;
        }
        return this;
    }

    public final byte read() throws IOException {
        if (this.stream != null && this.currentIndex > this.readLimit) {
            prepareNextBlock();
        }
        int i = this.currentIndex;
        if (i >= this.length) {
            throw ParsingException.create("Unexpected end of JSON input", eof, withStackTrace());
        }
        byte[] bArr = this.buffer;
        this.currentIndex = i + 1;
        byte b = bArr[i];
        this.last = b;
        return b;
    }

    @Nullable
    public final <T> T[] readArray(ReadObject<T> readObject, T[] tArr) throws IOException {
        if (wasNull()) {
            return null;
        }
        if (this.last != 91) {
            throw newParseError("Expecting '[' as array start");
        }
        if (getNextToken() == 93) {
            return tArr;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(readObject.read(this));
        while (getNextToken() == 44) {
            getNextToken();
            arrayList.add(readObject.read(this));
        }
        checkArrayEnd();
        return (T[]) arrayList.toArray(tArr);
    }

    public final byte[] readBase64() throws IOException {
        if (this.stream != null && Base64.findEnd(this.buffer, this.currentIndex) == this.buffer.length) {
            int parseString = parseString();
            byte[] bArr = new byte[parseString];
            for (int i = 0; i < parseString; i++) {
                bArr[i] = (byte) this.chars[i];
            }
            return Base64.decodeFast(bArr, 0, parseString);
        }
        if (this.last != 34) {
            throw newParseError("Expecting '\"' for base64 start");
        }
        int i2 = this.currentIndex;
        int findEnd = Base64.findEnd(this.buffer, i2);
        byte[] bArr2 = this.buffer;
        this.currentIndex = findEnd + 1;
        byte b = bArr2[findEnd];
        this.last = b;
        if (b == 34) {
            return Base64.decodeFast(bArr2, i2, findEnd);
        }
        throw newParseError("Expecting '\"' for base64 end");
    }

    @Nullable
    public final <T> ArrayList<T> readCollection(ReadObject<T> readObject) throws IOException {
        if (wasNull()) {
            return null;
        }
        if (this.last != 91) {
            throw newParseError("Expecting '[' as collection start");
        }
        if (getNextToken() == 93) {
            return new ArrayList<>(0);
        }
        ArrayList<T> arrayList = new ArrayList<>(4);
        arrayList.add(readObject.read(this));
        while (getNextToken() == 44) {
            getNextToken();
            arrayList.add(readObject.read(this));
        }
        checkArrayEnd();
        return arrayList;
    }

    public final String readKey() throws IOException {
        int parseString = parseString();
        StringCache stringCache = this.keyCache;
        char[] cArr = this.chars;
        String str = stringCache != null ? stringCache.get(cArr, parseString) : new String(cArr, 0, parseString);
        if (getNextToken() != 58) {
            throw newParseError("Expecting ':' after attribute name");
        }
        getNextToken();
        return str;
    }

    @Nullable
    public final <K, V> LinkedHashMap<K, V> readMap(ReadObject<K> readObject, ReadObject<V> readObject2) throws IOException {
        if (wasNull()) {
            return null;
        }
        if (this.last != 123) {
            throw newParseError("Expecting '{' as map start");
        }
        if (getNextToken() == 125) {
            return new LinkedHashMap<>(0);
        }
        LinkedHashMap<K, V> linkedHashMap = new LinkedHashMap<>(4);
        K read = readObject.read(this);
        if (read == null) {
            throw newParseErrorAt("Null detected as key", 0);
        }
        if (getNextToken() != 58) {
            throw newParseError("Expecting ':' after key attribute");
        }
        getNextToken();
        linkedHashMap.put(read, readObject2.read(this));
        while (getNextToken() == 44) {
            getNextToken();
            K read2 = readObject.read(this);
            if (read2 == null) {
                throw newParseErrorAt("Null detected as key", 0);
            }
            if (getNextToken() != 58) {
                throw newParseError("Expecting ':' after key attribute");
            }
            getNextToken();
            linkedHashMap.put(read2, readObject2.read(this));
        }
        checkObjectEnd();
        return linkedHashMap;
    }

    @Deprecated
    public String readNext() throws IOException {
        int i = this.currentIndex - 1;
        skip();
        return new String(this.buffer, i, (this.currentIndex - i) - 1, "UTF-8");
    }

    @Deprecated
    public final char[] readNumber() {
        char[] cArr;
        int i = this.currentIndex;
        this.tokenStart = i - 1;
        char[] cArr2 = this.tmp;
        byte b = this.last;
        cArr2[0] = (char) b;
        int i2 = 1;
        while (true) {
            cArr = this.tmp;
            if (i2 >= cArr.length || i >= this.length) {
                break;
            }
            int i3 = i + 1;
            b = this.buffer[i];
            if (b == 44 || b == 125 || b == 93) {
                break;
            }
            cArr[i2] = (char) b;
            i2++;
            i = i3;
        }
        this.currentIndex = (i2 - 1) + this.currentIndex;
        this.last = b;
        return cArr;
    }

    @Nullable
    public final <T> LinkedHashSet<T> readSet(ReadObject<T> readObject) throws IOException {
        if (wasNull()) {
            return null;
        }
        if (this.last != 91) {
            throw newParseError("Expecting '[' as set start");
        }
        if (getNextToken() == 93) {
            return new LinkedHashSet<>(0);
        }
        LinkedHashSet<T> linkedHashSet = new LinkedHashSet<>(4);
        linkedHashSet.add(readObject.read(this));
        while (getNextToken() == 44) {
            getNextToken();
            linkedHashSet.add(readObject.read(this));
        }
        checkArrayEnd();
        return linkedHashSet;
    }

    public final char[] readSimpleQuote() throws ParsingException {
        char[] cArr;
        if (this.last != 34) {
            throw newParseError("Expecting '\"' for string start");
        }
        int i = this.currentIndex;
        this.tokenStart = i;
        int i2 = 0;
        while (true) {
            try {
                cArr = this.tmp;
                if (i2 >= cArr.length) {
                    break;
                }
                int i3 = i + 1;
                byte b = this.buffer[i];
                if (b == 34) {
                    i = i3;
                    break;
                }
                cArr[i2] = (char) b;
                i2++;
                i = i3;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw newParseErrorAt("JSON string was not closed with a double quote", 0);
            }
        }
        if (i > this.length) {
            throw newParseErrorAt("JSON string was not closed with a double quote", 0);
        }
        this.currentIndex = i;
        return cArr;
    }

    public final String readSimpleString() throws ParsingException {
        char[] cArr;
        if (this.last != 34) {
            throw newParseError("Expecting '\"' for string start");
        }
        int i = this.currentIndex;
        int i2 = 0;
        while (true) {
            try {
                cArr = this.tmp;
                if (i2 >= cArr.length) {
                    break;
                }
                int i3 = i + 1;
                byte b = this.buffer[i];
                if (b == 34) {
                    i = i3;
                    break;
                }
                int i4 = i2 + 1;
                cArr[i2] = (char) b;
                i2 = i4;
                i = i3;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw newParseErrorAt("JSON string was not closed with a double quote", 0);
            }
        }
        if (i > this.length) {
            throw newParseErrorAt("JSON string was not closed with a double quote", 0);
        }
        this.currentIndex = i;
        return new String(cArr, 0, i2);
    }

    public final String readString() throws IOException {
        int parseString = parseString();
        StringCache stringCache = this.valuesCache;
        char[] cArr = this.chars;
        return stringCache == null ? new String(cArr, 0, parseString) : stringCache.get(cArr, parseString);
    }

    public final void reset() {
        this.buffer = this.originalBuffer;
        this.bufferLenWithExtraSpace = this.originalBufferLenWithExtraSpace;
        this.currentIndex = 0;
        this.length = 0;
        this.readLimit = 0;
        this.stream = null;
    }

    public final int scanNumber() {
        int i = this.currentIndex;
        this.tokenStart = i - 1;
        byte b = this.last;
        int i2 = 1;
        while (i < this.length) {
            int i3 = i + 1;
            b = this.buffer[i];
            if (b == 44 || b == 125 || b == 93) {
                break;
            }
            i2++;
            i = i3;
        }
        this.currentIndex = (i2 - 1) + this.currentIndex;
        this.last = b;
        return this.tokenStart;
    }

    public final void semicolon() throws IOException {
        if (getNextToken() != 58) {
            if (this.currentIndex < this.length) {
                throw newParseError("Expecting ':'");
            }
            throw newParseErrorAt("Unexpected end in JSON", 0, eof);
        }
    }

    public final byte skip() throws IOException {
        byte b;
        byte b2 = this.last;
        if (b2 == 34) {
            return skipString();
        }
        if (b2 == 123) {
            byte nextToken = getNextToken();
            if (nextToken == 125) {
                return getNextToken();
            }
            if (nextToken != 34) {
                throw newParseError("Expecting '\"' for attribute name");
            }
            if (skipString() != 58) {
                throw newParseError("Expecting ':' after attribute name");
            }
            getNextToken();
            byte skip = skip();
            while (skip == 44) {
                if (getNextToken() != 34) {
                    throw newParseError("Expecting '\"' for attribute name");
                }
                if (skipString() != 58) {
                    throw newParseError("Expecting ':' after attribute name");
                }
                getNextToken();
                skip = skip();
            }
            if (skip == 125) {
                return getNextToken();
            }
            throw newParseError("Expecting '}' for object end");
        }
        if (b2 == 91) {
            getNextToken();
            byte skip2 = skip();
            while (skip2 == 44) {
                getNextToken();
                skip2 = skip();
            }
            if (skip2 == 93) {
                return getNextToken();
            }
            throw newParseError("Expecting ']' for array end");
        }
        if (b2 == 110) {
            if (wasNull()) {
                return getNextToken();
            }
            throw newParseErrorAt("Expecting 'null' for null constant", 0);
        }
        if (b2 == 116) {
            if (wasTrue()) {
                return getNextToken();
            }
            throw newParseErrorAt("Expecting 'true' for true constant", 0);
        }
        if (b2 == 102) {
            if (wasFalse()) {
                return getNextToken();
            }
            throw newParseErrorAt("Expecting 'false' for false constant", 0);
        }
        while (true) {
            b = this.last;
            if (b == 44 || b == 125 || b == 93) {
                break;
            }
            read();
        }
        return b;
    }

    public final void startArray() throws IOException {
        if (getNextToken() != 91) {
            if (this.currentIndex < this.length) {
                throw newParseError("Expecting '[' as array start");
            }
            throw newParseErrorAt("Unexpected end in JSON", 0, eof);
        }
    }

    public final void startAttribute(String str) throws IOException {
        while (getNextToken() == 34) {
            fillNameWeakHash();
            if (wasLastName(str)) {
                return;
            }
            getNextToken();
            if (skip() != 44) {
                throw newParseErrorWith("Unable to find attribute", str);
            }
        }
        throw newParseError("Expecting '\"' as attribute start");
    }

    public final void startObject() throws IOException {
        if (getNextToken() != 123) {
            if (this.currentIndex < this.length) {
                throw newParseError("Expecting '{' as object start");
            }
            throw newParseErrorAt("Unexpected end in JSON", 0, eof);
        }
    }

    public String toString() {
        return new String(this.buffer, 0, this.length, utf8);
    }

    public final boolean wasFalse() throws ParsingException {
        if (this.last != 102) {
            return false;
        }
        int i = this.currentIndex;
        if (i + 3 < this.length) {
            byte[] bArr = this.buffer;
            if (bArr[i] == 97 && bArr[i + 1] == 108 && bArr[i + 2] == 115 && bArr[i + 3] == 101) {
                this.currentIndex = i + 4;
                this.last = (byte) 101;
                return true;
            }
        }
        throw newParseErrorAt("Invalid false constant found", 0);
    }

    public final boolean wasLastName(String str) {
        if (this.stream == null || this.nameEnd != -1) {
            if (str.length() != (this.nameEnd - this.tokenStart) - 1) {
                return false;
            }
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) != this.buffer[this.tokenStart + i]) {
                    return false;
                }
            }
            return true;
        }
        if (str.length() != this.lastNameLen) {
            return false;
        }
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) != this.chars[i2]) {
                return false;
            }
        }
        return true;
    }

    public final boolean wasNull() throws ParsingException {
        if (this.last != 110) {
            return false;
        }
        int i = this.currentIndex;
        if (i + 2 < this.length) {
            byte[] bArr = this.buffer;
            if (bArr[i] == 117 && bArr[i + 1] == 108 && bArr[i + 2] == 108) {
                this.currentIndex = i + 3;
                this.last = (byte) 108;
                return true;
            }
        }
        throw newParseErrorAt("Invalid null constant found", 0);
    }

    public final boolean wasTrue() throws ParsingException {
        if (this.last != 116) {
            return false;
        }
        int i = this.currentIndex;
        if (i + 2 < this.length) {
            byte[] bArr = this.buffer;
            if (bArr[i] == 114 && bArr[i + 1] == 117 && bArr[i + 2] == 101) {
                this.currentIndex = i + 3;
                this.last = (byte) 101;
                return true;
            }
        }
        throw newParseErrorAt("Invalid true constant found", 0);
    }

    public boolean withStackTrace() {
        return this.errorInfo == ErrorInfo.WITH_STACK_TRACE;
    }

    public final long positionInStream() {
        return this.currentPosition + this.currentIndex;
    }

    public final StringBuffer appendString(StringBuffer stringBuffer) throws IOException {
        stringBuffer.append(this.chars, 0, parseString());
        return stringBuffer;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class WithObjectReader<T extends JsonObject> implements Iterator<T> {
        private boolean hasNext = true;
        private final JsonReader json;
        private final ReadJsonObject<T> reader;

        public WithObjectReader(ReadJsonObject<T> readJsonObject, JsonReader jsonReader) {
            this.reader = readJsonObject;
            this.json = jsonReader;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // java.util.Iterator
        @Nullable
        public T next() {
            T deserialize;
            try {
                byte last = this.json.last();
                if (last != 110) {
                    JsonReader jsonReader = this.json;
                    if (last != 123) {
                        throw jsonReader.newParseError("Expecting '{' for object start in iteration");
                    }
                    jsonReader.getNextToken();
                    deserialize = this.reader.deserialize(this.json);
                } else {
                    if (!this.json.wasNull()) {
                        throw this.json.newParseErrorAt("Expecting 'null' as null constant", 0);
                    }
                    deserialize = null;
                }
                boolean z = this.json.getNextToken() == 44;
                this.hasNext = z;
                JsonReader jsonReader2 = this.json;
                if (z) {
                    jsonReader2.getNextToken();
                    return deserialize;
                }
                if (jsonReader2.last() == 93) {
                    return deserialize;
                }
                throw this.json.newParseError("Expecting ']' for iteration end");
            } catch (IOException e) {
                throw new SerializationException(e);
            }
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class WithReader<T> implements Iterator<T> {
        private boolean hasNext = true;
        private final JsonReader json;
        private final ReadObject<T> reader;

        public WithReader(ReadObject<T> readObject, JsonReader jsonReader) {
            this.reader = readObject;
            this.json = jsonReader;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.hasNext;
        }

        @Override // java.util.Iterator
        @Nullable
        public T next() {
            T read;
            try {
                if (this.json.last() != 110) {
                    read = this.reader.read(this.json);
                } else {
                    if (!this.json.wasNull()) {
                        throw this.json.newParseErrorAt("Expecting 'null' as null constant", 0);
                    }
                    read = null;
                }
                boolean z = this.json.getNextToken() == 44;
                this.hasNext = z;
                JsonReader jsonReader = this.json;
                if (z) {
                    jsonReader.getNextToken();
                    return read;
                }
                if (jsonReader.last() == 93) {
                    return read;
                }
                throw this.json.newParseError("Expecting ']' for iteration end");
            } catch (IOException e) {
                throw new SerializationException(e);
            }
        }

        @Override // java.util.Iterator
        public void remove() {
        }
    }

    @Deprecated
    public final void reset(int i) {
        process(null, i);
    }

    @Deprecated
    public final void reset(InputStream inputStream) throws IOException {
        process(inputStream);
    }

    public final JsonReader<TContext> process(@Nullable byte[] bArr, int i) {
        if (bArr != null) {
            this.buffer = bArr;
            this.bufferLenWithExtraSpace = bArr.length - 38;
        }
        if (i <= this.buffer.length) {
            this.currentIndex = 0;
            this.length = i;
            this.stream = null;
            this.readLimit = i;
            return this;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("length can't be longer than buffer.length");
        return null;
    }

    public final <T extends JsonObject> ArrayList<T> deserializeCollection(ReadJsonObject<T> readJsonObject) throws IOException {
        ArrayList<T> arrayList = new ArrayList<>(4);
        deserializeCollection(readJsonObject, arrayList);
        return arrayList;
    }

    public final <T, S extends T> void deserializeCollection(ReadObject<S> readObject, Collection<T> collection) throws IOException {
        collection.add(readObject.read(this));
        while (getNextToken() == 44) {
            getNextToken();
            collection.add(readObject.read(this));
        }
        checkArrayEnd();
    }

    @Deprecated
    public JsonReader(byte[] bArr, @Nullable TContext tcontext) {
        this(bArr, tcontext, (StringCache) null, (StringCache) null);
    }

    @Deprecated
    public JsonReader(byte[] bArr, @Nullable TContext tcontext, @Nullable StringCache stringCache, @Nullable StringCache stringCache2) {
        this(bArr, bArr.length, tcontext, new char[64], stringCache, stringCache2);
    }

    @Deprecated
    public JsonReader(byte[] bArr, TContext tcontext, char[] cArr) {
        this(bArr, bArr.length, tcontext, cArr);
        if (cArr != null) {
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("tmp buffer provided as null.");
        throw null;
    }

    @Nullable
    public final <T> T next(ReadObject<T> readObject) throws IOException {
        if (readObject != null) {
            if (getNextToken() == 110) {
                if (wasNull()) {
                    return null;
                }
                throw newParseErrorAt("Expecting 'null' as null constant", 0);
            }
            return readObject.read(this);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("reader can't be null");
        return null;
    }

    @Deprecated
    public JsonReader(byte[] bArr, int i, TContext tcontext) {
        this(bArr, i, tcontext, new char[64]);
    }

    @Deprecated
    public JsonReader(byte[] bArr, int i, TContext tcontext, char[] cArr) {
        this(bArr, i, tcontext, cArr, null, null);
    }

    @Deprecated
    public JsonReader(byte[] bArr, int i, @Nullable TContext tcontext, char[] cArr, @Nullable StringCache stringCache, @Nullable StringCache stringCache2) {
        this(cArr, bArr, i, tcontext, stringCache, stringCache2, (TypeLookup) null, ErrorInfo.WITH_STACK_TRACE, DoublePrecision.DEFAULT, UnknownNumberParsing.LONG_AND_BIGDECIMAL, 512, 268435456);
        if (cArr != null) {
            if (i <= bArr.length) {
                if (i < bArr.length) {
                    bArr[i] = 0;
                    return;
                }
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("length can't be longer than buffer.length");
            throw null;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("tmp buffer provided as null.");
        throw null;
    }

    @Nullable
    public final <T> T next(Class<T> cls) throws IOException {
        if (cls != null) {
            if (this.typeLookup != null) {
                if (getNextToken() == 110) {
                    return (T) readNull(cls);
                }
                ReadObject<T> tryFindReader = this.typeLookup.tryFindReader(cls);
                if (tryFindReader != null) {
                    return tryFindReader.read(this);
                }
                throw new ConfigurationException(a$$ExternalSyntheticOutline0.m("Reader not found for ", cls, ". Check if reader was registered"));
            }
            throw new ConfigurationException(a$$ExternalSyntheticOutline0.m("typeLookup is not defined for this JsonReader. Unable to lookup specified type ", cls));
        }
        Single$$ExternalSyntheticBUOutline0.m$3("manifest can't be null");
        return null;
    }

    public final ParsingException newParseError(String str) {
        return newParseError(str, 0);
    }

    public final <T extends JsonObject> ArrayList<T> deserializeNullableCollection(ReadJsonObject<T> readJsonObject) throws IOException {
        ArrayList<T> arrayList = new ArrayList<>(4);
        deserializeNullableCollection(readJsonObject, arrayList);
        return arrayList;
    }

    public final boolean wasLastName(byte[] bArr) {
        if (this.stream != null && this.nameEnd == -1) {
            if (bArr.length != this.lastNameLen) {
                return false;
            }
            for (int i = 0; i < bArr.length; i++) {
                if (bArr[i] != this.chars[i]) {
                    return false;
                }
            }
            return true;
        }
        if (bArr.length != (this.nameEnd - this.tokenStart) - 1) {
            return false;
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            if (bArr[i2] != this.buffer[this.tokenStart + i2]) {
                return false;
            }
        }
        return true;
    }

    public JsonReader(byte[] bArr, int i, @Nullable TContext tcontext, char[] cArr, @Nullable StringCache stringCache, @Nullable StringCache stringCache2, @Nullable TypeLookup typeLookup, ErrorInfo errorInfo, DoublePrecision doublePrecision, UnknownNumberParsing unknownNumberParsing, int i2, int i3) {
        this(cArr, bArr, i, tcontext, stringCache, stringCache2, typeLookup, errorInfo, doublePrecision, unknownNumberParsing, i2, i3);
        if (cArr != null) {
            if (i <= bArr.length) {
                if (i < bArr.length) {
                    bArr[i] = 0;
                    return;
                }
                return;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("length can't be longer than buffer.length");
            throw null;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("tmp buffer provided as null.");
        throw null;
    }

    public final <T, S extends T> void deserializeNullableCollection(ReadObject<S> readObject, Collection<T> collection) throws IOException {
        if (wasNull()) {
            collection.add(null);
        } else {
            collection.add(readObject.read(this));
        }
        while (getNextToken() == 44) {
            getNextToken();
            if (wasNull()) {
                collection.add(null);
            } else {
                collection.add(readObject.read(this));
            }
        }
        checkArrayEnd();
    }

    public String positionDescription(int i) {
        StringBuilder sb = new StringBuilder(60);
        positionDescription(i, sb);
        return sb.toString();
    }

    @Nullable
    public final <T> T next(BindObject<T> bindObject, T t) throws IOException {
        if (bindObject == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("binder can't be null");
            return null;
        }
        if (t != null) {
            if (getNextToken() == 110) {
                if (wasNull()) {
                    return null;
                }
                throw newParseErrorAt("Expecting 'null' as null constant", 0);
            }
            return bindObject.bind(this, t);
        }
        Single$$ExternalSyntheticBUOutline0.m$3("instance can't be null");
        return null;
    }

    public String positionDescription() {
        return positionDescription(0);
    }

    public final ParsingException newParseErrorWith(String str, @Nullable Object obj) {
        return newParseErrorWith(str, 0, "", str, obj, "");
    }

    public final ParsingException newParseErrorAt(String str, int i) {
        ErrorInfo errorInfo = this.errorInfo;
        if (errorInfo != ErrorInfo.MINIMAL && errorInfo != ErrorInfo.DESCRIPTION_ONLY) {
            this.error.setLength(0);
            this.error.append(str);
            this.error.append(" ");
            positionDescription(i, this.error);
            return ParsingException.create(this.error.toString(), withStackTrace());
        }
        return ParsingException.create(str, false);
    }
}
