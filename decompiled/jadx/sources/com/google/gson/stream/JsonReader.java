package com.google.gson.stream;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.gson.Strictness;
import com.google.gson.internal.JsonReaderInternalAccess;
import com.google.gson.internal.TroubleshootingGuide;
import com.google.gson.internal.bind.JsonTreeReader;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class JsonReader implements Closeable {
    static final int BUFFER_SIZE = 1024;
    static final int DEFAULT_NESTING_LIMIT = 255;
    private static final long MIN_INCOMPLETE_INTEGER = -922337203685477580L;
    private static final int NUMBER_CHAR_DECIMAL = 3;
    private static final int NUMBER_CHAR_DIGIT = 2;
    private static final int NUMBER_CHAR_EXP_DIGIT = 7;
    private static final int NUMBER_CHAR_EXP_E = 5;
    private static final int NUMBER_CHAR_EXP_SIGN = 6;
    private static final int NUMBER_CHAR_FRACTION_DIGIT = 4;
    private static final int NUMBER_CHAR_NONE = 0;
    private static final int NUMBER_CHAR_SIGN = 1;
    private static final int PEEKED_BEGIN_ARRAY = 3;
    private static final int PEEKED_BEGIN_OBJECT = 1;
    private static final int PEEKED_BUFFERED = 11;
    private static final int PEEKED_DOUBLE_QUOTED = 9;
    private static final int PEEKED_DOUBLE_QUOTED_NAME = 13;
    private static final int PEEKED_END_ARRAY = 4;
    private static final int PEEKED_END_OBJECT = 2;
    private static final int PEEKED_EOF = 17;
    private static final int PEEKED_FALSE = 6;
    private static final int PEEKED_LONG = 15;
    private static final int PEEKED_NONE = 0;
    private static final int PEEKED_NULL = 7;
    private static final int PEEKED_NUMBER = 16;
    private static final int PEEKED_SINGLE_QUOTED = 8;
    private static final int PEEKED_SINGLE_QUOTED_NAME = 12;
    private static final int PEEKED_TRUE = 5;
    private static final int PEEKED_UNQUOTED = 10;
    private static final int PEEKED_UNQUOTED_NAME = 14;
    private final Reader in;
    private int[] pathIndices;
    private String[] pathNames;
    private long peekedLong;
    private int peekedNumberLength;
    private String peekedString;
    private boolean promotedName;
    private int[] stack;
    private Strictness strictness = Strictness.LEGACY_STRICT;
    private int nestingLimit = 255;
    private final char[] buffer = new char[1024];
    private int pos = 0;
    private int limit = 0;
    private long bufferStart = 0;
    private int lineNumber = 0;
    private int lineStart = 0;
    int peeked = 0;
    private int stackSize = 1;

    static {
        JsonReaderInternalAccess.INSTANCE = new JsonReaderInternalAccess() { // from class: com.google.gson.stream.JsonReader.1
            @Override // com.google.gson.internal.JsonReaderInternalAccess
            public void promoteNameToValue(JsonReader jsonReader) throws IOException {
                if (jsonReader instanceof JsonTreeReader) {
                    ((JsonTreeReader) jsonReader).promoteNameToValue();
                    return;
                }
                int i = jsonReader.peeked;
                if (i == 0) {
                    i = jsonReader.doPeek();
                }
                switch (i) {
                    case 12:
                        jsonReader.peeked = 8;
                        break;
                    case 13:
                        jsonReader.peeked = 9;
                        break;
                    case 14:
                        jsonReader.peeked = 10;
                        break;
                    default:
                        throw jsonReader.unexpectedTokenError("a name");
                }
                jsonReader.promotedName = true;
            }
        };
    }

    public JsonReader(Reader reader) {
        int[] iArr = new int[32];
        this.stack = iArr;
        iArr[0] = 6;
        this.pathNames = new String[32];
        this.pathIndices = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.in = reader;
    }

    private void checkLenient() throws MalformedJsonException {
        if (this.strictness != Strictness.LENIENT) {
            throw syntaxError("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        }
    }

    private void consumeNonExecutePrefix() throws IOException {
        nextNonWhitespace(true);
        int i = this.pos;
        this.pos = i - 1;
        if (i + 4 <= this.limit || fillBuffer(5)) {
            int i2 = this.pos;
            char[] cArr = this.buffer;
            if (cArr[i2] == ')' && cArr[i2 + 1] == ']' && cArr[i2 + 2] == '}' && cArr[i2 + 3] == '\'' && cArr[i2 + 4] == '\n') {
                this.pos = i2 + 5;
            }
        }
    }

    private boolean fillBuffer(int i) throws IOException {
        int i2;
        int i3;
        char[] cArr = this.buffer;
        int i4 = this.lineStart;
        int i5 = this.pos;
        this.lineStart = i4 - i5;
        this.bufferStart += i5;
        int i6 = this.limit;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.limit = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.limit = 0;
        }
        this.pos = 0;
        do {
            Reader reader = this.in;
            int i8 = this.limit;
            int read = reader.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.limit + read;
            this.limit = i2;
            if (this.bufferStart == 0 && (i3 = this.pos) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.pos = i3 + 1;
                this.lineStart++;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private String getPath(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.stackSize;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.stack[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.pathIndices[i];
                    if (z && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb.append(i4);
                    sb.append(AbstractJsonLexerKt.END_LIST);
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.pathNames[i];
                    if (str == null) {
                        break;
                    } else {
                        sb.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    Buffer$$ExternalSyntheticBUOutline0.m((Object) a$$ExternalSyntheticOutline0.m(i3, "Unknown scope value: "));
                    return null;
            }
            i++;
        }
    }

    private boolean isLiteral(char c) throws IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        checkLenient();
        return false;
    }

    private int nextNonWhitespace(boolean z) throws IOException {
        char c;
        char[] cArr = this.buffer;
        int i = this.pos;
        int i2 = this.limit;
        while (true) {
            if (i == i2) {
                this.pos = i;
                if (!fillBuffer(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + locationString());
                }
                i = this.pos;
                i2 = this.limit;
            }
            int i3 = i + 1;
            c = cArr[i];
            if (c == '\n') {
                this.lineNumber++;
                this.lineStart = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.pos = i3;
                    if (i3 == i2) {
                        this.pos = i;
                        boolean fillBuffer = fillBuffer(2);
                        this.pos++;
                        if (!fillBuffer) {
                            break;
                        }
                    }
                    checkLenient();
                    int i4 = this.pos;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.pos = i4 + 1;
                        if (!skipTo("*/")) {
                            throw syntaxError("Unterminated comment");
                        }
                        i = this.pos + 2;
                        i2 = this.limit;
                    } else {
                        if (c2 != '/') {
                            break;
                        }
                        this.pos = i4 + 1;
                        skipToEndOfLine();
                        i = this.pos;
                        i2 = this.limit;
                    }
                } else {
                    if (c != '#') {
                        this.pos = i3;
                        return c;
                    }
                    this.pos = i3;
                    checkLenient();
                    skipToEndOfLine();
                    i = this.pos;
                    i2 = this.limit;
                }
            }
            i = i3;
        }
        return c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0074, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0076, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0084, code lost:
    
        r1.append(r0, r3, r2 - r3);
        r10.pos = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String nextQuotedValue(char r11) throws java.io.IOException {
        /*
            r10 = this;
            char[] r0 = r10.buffer
            r1 = 0
        L3:
            int r2 = r10.pos
            int r3 = r10.limit
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L74
            int r7 = r2 + 1
            char r2 = r0[r2]
            com.google.gson.Strictness r8 = r10.strictness
            com.google.gson.Strictness r9 = com.google.gson.Strictness.STRICT
            if (r8 != r9) goto L24
            r8 = 32
            if (r2 < r8) goto L1d
            goto L24
        L1d:
            java.lang.String r11 = "Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode"
            com.google.gson.stream.MalformedJsonException r10 = r10.syntaxError(r11)
            throw r10
        L24:
            if (r2 != r11) goto L42
            r10.pos = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L36
            java.lang.String r11 = new java.lang.String
            r11.<init>(r0, r3, r7)
            java.lang.String r10 = r10.validateString(r11)
            return r10
        L36:
            r1.append(r0, r3, r7)
            java.lang.String r11 = r1.toString()
            java.lang.String r10 = r10.validateString(r11)
            return r10
        L42:
            r8 = 92
            if (r2 != r8) goto L67
            r10.pos = r7
            int r7 = r7 - r3
            int r2 = r7 + (-1)
            if (r1 != 0) goto L58
            int r7 = r7 * 2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r4 = java.lang.Math.max(r7, r5)
            r1.<init>(r4)
        L58:
            r1.append(r0, r3, r2)
            char r2 = r10.readEscapeCharacter()
            r1.append(r2)
            int r2 = r10.pos
            int r3 = r10.limit
            goto L7
        L67:
            r5 = 10
            if (r2 != r5) goto L72
            int r2 = r10.lineNumber
            int r2 = r2 + r6
            r10.lineNumber = r2
            r10.lineStart = r7
        L72:
            r2 = r7
            goto L9
        L74:
            if (r1 != 0) goto L84
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L84:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r10.pos = r2
            boolean r2 = r10.fillBuffer(r6)
            if (r2 == 0) goto L93
            goto L3
        L93:
            java.lang.String r11 = "Unterminated string"
            com.google.gson.stream.MalformedJsonException r10 = r10.syntaxError(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.nextQuotedValue(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x004a, code lost:
    
        checkLenient();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:55:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String nextUnquotedValue() throws java.io.IOException {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r1
        L3:
            int r3 = r7.pos
            int r4 = r3 + r2
            int r5 = r7.limit
            char[] r6 = r7.buffer
            if (r4 >= r5) goto L4e
            int r3 = r3 + r2
            char r3 = r6[r3]
            r4 = 9
            if (r3 == r4) goto L5a
            r4 = 10
            if (r3 == r4) goto L5a
            r4 = 12
            if (r3 == r4) goto L5a
            r4 = 13
            if (r3 == r4) goto L5a
            r4 = 32
            if (r3 == r4) goto L5a
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5a
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5a
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5a
            r4 = 58
            if (r3 == r4) goto L5a
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5a;
                case 92: goto L4a;
                case 93: goto L5a;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r7.checkLenient()
            goto L5a
        L4e:
            int r3 = r6.length
            if (r2 >= r3) goto L5c
            int r3 = r2 + 1
            boolean r3 = r7.fillBuffer(r3)
            if (r3 == 0) goto L5a
            goto L3
        L5a:
            r1 = r2
            goto L7c
        L5c:
            if (r0 != 0) goto L69
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r0.<init>(r3)
        L69:
            char[] r3 = r7.buffer
            int r4 = r7.pos
            r0.append(r3, r4, r2)
            int r3 = r7.pos
            int r3 = r3 + r2
            r7.pos = r3
            r2 = 1
            boolean r2 = r7.fillBuffer(r2)
            if (r2 != 0) goto L2
        L7c:
            char[] r2 = r7.buffer
            if (r0 != 0) goto L88
            java.lang.String r0 = new java.lang.String
            int r3 = r7.pos
            r0.<init>(r2, r3, r1)
            goto L91
        L88:
            int r3 = r7.pos
            r0.append(r2, r3, r1)
            java.lang.String r0 = r0.toString()
        L91:
            int r2 = r7.pos
            int r2 = r2 + r1
            r7.pos = r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.nextUnquotedValue():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int peekKeyword() throws java.io.IOException {
        /*
            r9 = this;
            char[] r0 = r9.buffer
            int r1 = r9.pos
            char r0 = r0[r1]
            r1 = 70
            r2 = 0
            if (r0 == r1) goto L2c
            r1 = 78
            if (r0 == r1) goto L26
            r1 = 84
            if (r0 == r1) goto L20
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L2c
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L26
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto L20
            return r2
        L20:
            java.lang.String r0 = "true"
            java.lang.String r1 = "TRUE"
            r3 = 5
            goto L31
        L26:
            java.lang.String r0 = "null"
            java.lang.String r1 = "NULL"
            r3 = 7
            goto L31
        L2c:
            java.lang.String r0 = "false"
            java.lang.String r1 = "FALSE"
            r3 = 6
        L31:
            com.google.gson.Strictness r4 = r9.strictness
            com.google.gson.Strictness r5 = com.google.gson.Strictness.STRICT
            if (r4 == r5) goto L39
            r4 = 1
            goto L3a
        L39:
            r4 = r2
        L3a:
            int r5 = r0.length()
            r6 = r2
        L3f:
            int r7 = r9.pos
            if (r6 >= r5) goto L6b
            int r7 = r7 + r6
            int r8 = r9.limit
            if (r7 < r8) goto L51
            int r7 = r6 + 1
            boolean r7 = r9.fillBuffer(r7)
            if (r7 != 0) goto L51
            return r2
        L51:
            char[] r7 = r9.buffer
            int r8 = r9.pos
            int r8 = r8 + r6
            char r7 = r7[r8]
            char r8 = r0.charAt(r6)
            if (r7 == r8) goto L68
            if (r4 == 0) goto L67
            char r8 = r1.charAt(r6)
            if (r7 != r8) goto L67
            goto L68
        L67:
            return r2
        L68:
            int r6 = r6 + 1
            goto L3f
        L6b:
            int r7 = r7 + r5
            int r0 = r9.limit
            if (r7 < r0) goto L78
            int r0 = r5 + 1
            boolean r0 = r9.fillBuffer(r0)
            if (r0 == 0) goto L86
        L78:
            char[] r0 = r9.buffer
            int r1 = r9.pos
            int r1 = r1 + r5
            char r0 = r0[r1]
            boolean r0 = r9.isLiteral(r0)
            if (r0 == 0) goto L86
            return r2
        L86:
            int r0 = r9.pos
            int r0 = r0 + r5
            r9.pos = r0
            r9.peeked = r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.peekKeyword():int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0097, code lost:
    
        if (r9 != 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0099, code lost:
    
        if (r10 == 0) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x009f, code lost:
    
        if (r11 != Long.MIN_VALUE) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00a1, code lost:
    
        if (r13 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a5, code lost:
    
        if (r11 != 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a7, code lost:
    
        if (r13 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:
    
        if (r13 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ac, code lost:
    
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ad, code lost:
    
        r19.peekedLong = r11;
        r19.pos += r8;
        r19.peeked = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b8, code lost:
    
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b9, code lost:
    
        if (r9 == 2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        if (r9 == 4) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bf, code lost:
    
        if (r9 != 7) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c2, code lost:
    
        return r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
    
        r19.peekedNumberLength = r8;
        r19.peeked = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c9, code lost:
    
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0095, code lost:
    
        if (isLiteral(r14) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00ca, code lost:
    
        return r18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int peekNumber() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.peekNumber():int");
    }

    private void push(int i) throws MalformedJsonException {
        int i2 = this.stackSize;
        if (i2 - 1 >= this.nestingLimit) {
            throw new MalformedJsonException("Nesting limit " + this.nestingLimit + " reached" + locationString());
        }
        int[] iArr = this.stack;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.stack = Arrays.copyOf(iArr, i3);
            this.pathIndices = Arrays.copyOf(this.pathIndices, i3);
            this.pathNames = (String[]) Arrays.copyOf(this.pathNames, i3);
        }
        int[] iArr2 = this.stack;
        int i4 = this.stackSize;
        this.stackSize = i4 + 1;
        iArr2[i4] = i;
    }

    private char readEscapeCharacter() throws IOException {
        int i;
        if (this.pos == this.limit && !fillBuffer(1)) {
            throw syntaxError("Unterminated escape sequence");
        }
        char[] cArr = this.buffer;
        int i2 = this.pos;
        int i3 = i2 + 1;
        this.pos = i3;
        char c = cArr[i2];
        if (c != '\n') {
            if (c != '\"') {
                if (c != '\'') {
                    if (c != '/' && c != '\\') {
                        if (c == 'b') {
                            return '\b';
                        }
                        if (c == 'f') {
                            return '\f';
                        }
                        if (c == 'n') {
                            return '\n';
                        }
                        if (c == 'r') {
                            return '\r';
                        }
                        if (c == 't') {
                            return '\t';
                        }
                        if (c != 'u') {
                            throw syntaxError("Invalid escape sequence");
                        }
                        if (i2 + 5 > this.limit && !fillBuffer(4)) {
                            throw syntaxError("Unterminated escape sequence");
                        }
                        int i4 = this.pos;
                        int i5 = i4 + 4;
                        int i6 = 0;
                        while (i4 < i5) {
                            char[] cArr2 = this.buffer;
                            char c2 = cArr2[i4];
                            int i7 = i6 << 4;
                            if (c2 >= '0' && c2 <= '9') {
                                i = c2 - '0';
                            } else if (c2 >= 'a' && c2 <= 'f') {
                                i = c2 - 'W';
                            } else {
                                if (c2 < 'A' || c2 > 'F') {
                                    throw syntaxError("Malformed Unicode escape \\u".concat(new String(cArr2, this.pos, 4)));
                                }
                                i = c2 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.pos += 4;
                        return (char) i6;
                    }
                }
            }
            return c;
        }
        if (this.strictness == Strictness.STRICT) {
            throw syntaxError("Cannot escape a newline character in strict mode");
        }
        this.lineNumber++;
        this.lineStart = i3;
        if (this.strictness == Strictness.STRICT) {
            throw syntaxError("Invalid escaped character \"'\" in strict mode");
        }
        return c;
    }

    private void recordPromotedName(String str) {
        if (this.promotedName) {
            this.pathNames[this.stackSize - 1] = str;
            this.promotedName = false;
        }
    }

    private void skipQuotedValue(char c) throws IOException {
        char[] cArr = this.buffer;
        do {
            int i = this.pos;
            int i2 = this.limit;
            while (i < i2) {
                int i3 = i + 1;
                char c2 = cArr[i];
                if (c2 == c) {
                    this.pos = i3;
                    return;
                }
                if (c2 == '\\') {
                    this.pos = i3;
                    readEscapeCharacter();
                    i = this.pos;
                    i2 = this.limit;
                } else {
                    if (c2 == '\n') {
                        this.lineNumber++;
                        this.lineStart = i3;
                    }
                    i = i3;
                }
            }
            this.pos = i;
        } while (fillBuffer(1));
        throw syntaxError("Unterminated string");
    }

    private boolean skipTo(String str) throws IOException {
        int length = str.length();
        while (true) {
            if (this.pos + length > this.limit && !fillBuffer(length)) {
                return false;
            }
            char[] cArr = this.buffer;
            int i = this.pos;
            if (cArr[i] != '\n') {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.buffer[this.pos + i2] != str.charAt(i2)) {
                        break;
                    }
                }
                return true;
            }
            this.lineNumber++;
            this.lineStart = i + 1;
            this.pos++;
        }
    }

    private void skipToEndOfLine() throws IOException {
        char c;
        do {
            if (this.pos >= this.limit && !fillBuffer(1)) {
                return;
            }
            char[] cArr = this.buffer;
            int i = this.pos;
            int i2 = i + 1;
            this.pos = i2;
            c = cArr[i];
            if (c == '\n') {
                this.lineNumber++;
                this.lineStart = i2;
                return;
            }
        } while (c != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        checkLenient();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void skipUnquotedValue() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.pos
            int r2 = r1 + r0
            int r3 = r4.limit
            if (r2 >= r3) goto L51
            char[] r2 = r4.buffer
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.checkLenient()
        L4b:
            int r1 = r4.pos
            int r1 = r1 + r0
            r4.pos = r1
            return
        L51:
            int r1 = r1 + r0
            r4.pos = r1
            r0 = 1
            boolean r0 = r4.fillBuffer(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.JsonReader.skipUnquotedValue():void");
    }

    private MalformedJsonException syntaxError(String str) throws MalformedJsonException {
        StringBuilder m = BitVector$$ExternalSyntheticOutline0.m(str);
        m.append(locationString());
        m.append("\nSee ");
        m.append(TroubleshootingGuide.createUrl("malformed-json"));
        throw new MalformedJsonException(m.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IllegalStateException unexpectedTokenError(String str) throws IOException {
        String str2 = peek() == JsonToken.NULL ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder m2m = a$$ExternalSyntheticOutline0.m2m("Expected ", str, " but was ");
        m2m.append(peek());
        m2m.append(locationString());
        m2m.append("\nSee ");
        m2m.append(TroubleshootingGuide.createUrl(str2));
        return new IllegalStateException(m2m.toString());
    }

    private void validateAscii(String str) throws MalformedJsonException {
        if (!JsonTreeReader.isAllAscii(str)) {
            throw syntaxError(a$$ExternalSyntheticOutline0.m("String contains non-ASCII characters: ", str));
        }
    }

    @CanIgnoreReturnValue
    private String validateString(String str) throws IOException {
        if (this.strictness != Strictness.STRICT) {
            return str;
        }
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (Character.isSurrogate(charAt) && (!Character.isHighSurrogate(charAt) || (i = i + 1) >= str.length() || !Character.isLowSurrogate(str.charAt(i)))) {
                throw syntaxError("Unpaired surrogate characters are not allowed in strict mode");
            }
            i++;
        }
        return str;
    }

    public void beginArray() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i != 3) {
            throw unexpectedTokenError("BEGIN_ARRAY");
        }
        push(1);
        this.pathIndices[this.stackSize - 1] = 0;
        this.peeked = 0;
    }

    public void beginObject() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i != 1) {
            throw unexpectedTokenError("BEGIN_OBJECT");
        }
        push(3);
        this.peeked = 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.peeked = 0;
        this.stack[0] = 8;
        this.stackSize = 1;
        this.in.close();
    }

    public int doPeek() throws IOException {
        int nextNonWhitespace;
        int[] iArr = this.stack;
        int i = this.stackSize;
        int i2 = iArr[i - 1];
        switch (i2) {
            case 1:
                iArr[i - 1] = 2;
                break;
            case 2:
                int nextNonWhitespace2 = nextNonWhitespace(true);
                if (nextNonWhitespace2 != 44) {
                    if (nextNonWhitespace2 == 59) {
                        checkLenient();
                        break;
                    } else {
                        if (nextNonWhitespace2 != 93) {
                            throw syntaxError("Unterminated array");
                        }
                        this.peeked = 4;
                        return 4;
                    }
                }
                break;
            case 3:
            case 5:
                iArr[i - 1] = 4;
                if (i2 == 5 && (nextNonWhitespace = nextNonWhitespace(true)) != 44) {
                    if (nextNonWhitespace != 59) {
                        if (nextNonWhitespace != 125) {
                            throw syntaxError("Unterminated object");
                        }
                        this.peeked = 2;
                        return 2;
                    }
                    checkLenient();
                }
                int nextNonWhitespace3 = nextNonWhitespace(true);
                if (nextNonWhitespace3 == 34) {
                    this.peeked = 13;
                    return 13;
                }
                if (nextNonWhitespace3 == 39) {
                    checkLenient();
                    this.peeked = 12;
                    return 12;
                }
                if (nextNonWhitespace3 == 125) {
                    if (i2 == 5) {
                        throw syntaxError("Expected name");
                    }
                    this.peeked = 2;
                    return 2;
                }
                checkLenient();
                this.pos--;
                if (!isLiteral((char) nextNonWhitespace3)) {
                    throw syntaxError("Expected name");
                }
                this.peeked = 14;
                return 14;
            case 4:
                iArr[i - 1] = 5;
                int nextNonWhitespace4 = nextNonWhitespace(true);
                if (nextNonWhitespace4 != 58) {
                    if (nextNonWhitespace4 != 61) {
                        throw syntaxError("Expected ':'");
                    }
                    checkLenient();
                    if (this.pos < this.limit || fillBuffer(1)) {
                        char[] cArr = this.buffer;
                        int i3 = this.pos;
                        if (cArr[i3] == '>') {
                            this.pos = i3 + 1;
                            break;
                        }
                    }
                }
                break;
            case 6:
                if (this.strictness == Strictness.LENIENT) {
                    consumeNonExecutePrefix();
                }
                this.stack[this.stackSize - 1] = 7;
                break;
            case 7:
                if (nextNonWhitespace(false) != -1) {
                    checkLenient();
                    this.pos--;
                    break;
                } else {
                    this.peeked = 17;
                    return 17;
                }
            case 8:
                Single$$ExternalSyntheticBUOutline0.m$2("JsonReader is closed");
                return 0;
            default:
                throw new AssertionError(i2);
        }
        int nextNonWhitespace5 = nextNonWhitespace(true);
        if (nextNonWhitespace5 == 34) {
            this.peeked = 9;
            return 9;
        }
        if (nextNonWhitespace5 == 39) {
            checkLenient();
            this.peeked = 8;
            return 8;
        }
        if (nextNonWhitespace5 != 44 && nextNonWhitespace5 != 59) {
            if (nextNonWhitespace5 == 91) {
                this.peeked = 3;
                return 3;
            }
            if (nextNonWhitespace5 != 93) {
                if (nextNonWhitespace5 == 123) {
                    this.peeked = 1;
                    return 1;
                }
                this.pos--;
                int peekKeyword = peekKeyword();
                if (peekKeyword != 0) {
                    return peekKeyword;
                }
                int peekNumber = peekNumber();
                if (peekNumber != 0) {
                    return peekNumber;
                }
                if (!isLiteral(this.buffer[this.pos])) {
                    throw syntaxError("Expected value");
                }
                checkLenient();
                this.peeked = 10;
                return 10;
            }
            if (i2 == 1) {
                this.peeked = 4;
                return 4;
            }
        }
        if (i2 != 1 && i2 != 2) {
            throw syntaxError("Unexpected value");
        }
        checkLenient();
        this.pos--;
        this.peeked = 7;
        return 7;
    }

    public void endArray() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i != 4) {
            throw unexpectedTokenError("END_ARRAY");
        }
        int i2 = this.stackSize;
        this.stackSize = i2 - 1;
        int[] iArr = this.pathIndices;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.peeked = 0;
    }

    public void endObject() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i != 2) {
            throw unexpectedTokenError("END_OBJECT");
        }
        int i2 = this.stackSize;
        int i3 = i2 - 1;
        this.stackSize = i3;
        this.pathNames[i3] = null;
        int[] iArr = this.pathIndices;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.peeked = 0;
    }

    public long getCharacterOffset() {
        return this.bufferStart + this.pos;
    }

    public final int getNestingLimit() {
        return this.nestingLimit;
    }

    public String getPreviousPath() {
        return getPath(true);
    }

    public final Strictness getStrictness() {
        return this.strictness;
    }

    public boolean hasNext() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    public final boolean isLenient() {
        return this.strictness == Strictness.LENIENT;
    }

    public String locationString() {
        StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(this.lineNumber + 1, (this.pos - this.lineStart) + 1, " at line ", " column ", " path ");
        m29m.append(getPath());
        return m29m.toString();
    }

    public boolean nextBoolean() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 5) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            throw unexpectedTokenError("a boolean");
        }
        this.peeked = 0;
        int[] iArr2 = this.pathIndices;
        int i3 = this.stackSize - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    public double nextDouble() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.peekedLong;
        }
        if (i != 16) {
            switch (i) {
                case 8:
                case 9:
                    this.peekedString = nextQuotedValue(i == 8 ? '\'' : '\"');
                    break;
                case 10:
                    this.peekedString = nextUnquotedValue();
                    break;
                case 11:
                    break;
                default:
                    throw unexpectedTokenError("a double");
            }
        } else {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        }
        this.peeked = 11;
        try {
            double parseDouble = Double.parseDouble(this.peekedString);
            if (this.strictness != Strictness.LENIENT && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
                throw syntaxError("JSON forbids NaN and infinities: " + parseDouble);
            }
            String str = this.peekedString;
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr2 = this.pathIndices;
            int i3 = this.stackSize - 1;
            iArr2[i3] = iArr2[i3] + 1;
            recordPromotedName(str);
            return parseDouble;
        } catch (NumberFormatException e) {
            NumberFormatException numberFormatException = new NumberFormatException("Expected a double but was " + this.peekedString + locationString());
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    public int nextInt() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 15) {
            long j = this.peekedLong;
            int i2 = (int) j;
            if (j == i2) {
                this.peeked = 0;
                int[] iArr = this.pathIndices;
                int i3 = this.stackSize - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.peekedLong + locationString());
        }
        if (i == 16) {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw unexpectedTokenError("an int");
            }
            if (i == 10) {
                this.peekedString = nextUnquotedValue();
            } else {
                this.peekedString = nextQuotedValue(i == 8 ? '\'' : '\"');
            }
            validateAscii(this.peekedString);
            try {
                int parseInt = Integer.parseInt(this.peekedString);
                this.peeked = 0;
                int[] iArr2 = this.pathIndices;
                int i4 = this.stackSize - 1;
                iArr2[i4] = iArr2[i4] + 1;
                recordPromotedName(this.peekedString);
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.peeked = 11;
        try {
            double parseDouble = Double.parseDouble(this.peekedString);
            int i5 = (int) parseDouble;
            double d = i5;
            String str = this.peekedString;
            if (d != parseDouble) {
                StringBuilder m3869m = BitVector$$ExternalSyntheticOutline0.m3869m("Expected an int but was ", str);
                m3869m.append(locationString());
                throw new NumberFormatException(m3869m.toString());
            }
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr3 = this.pathIndices;
            int i6 = this.stackSize - 1;
            iArr3[i6] = iArr3[i6] + 1;
            recordPromotedName(str);
            return i5;
        } catch (NumberFormatException e) {
            NumberFormatException numberFormatException = new NumberFormatException("Expected an int but was " + this.peekedString + locationString());
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    public long nextLong() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 15) {
            this.peeked = 0;
            int[] iArr = this.pathIndices;
            int i2 = this.stackSize - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.peekedLong;
        }
        if (i != 16) {
            switch (i) {
                case 8:
                case 9:
                case 10:
                    if (i == 10) {
                        this.peekedString = nextUnquotedValue();
                    } else {
                        this.peekedString = nextQuotedValue(i == 8 ? '\'' : '\"');
                    }
                    validateAscii(this.peekedString);
                    try {
                        long parseLong = Long.parseLong(this.peekedString);
                        this.peeked = 0;
                        int[] iArr2 = this.pathIndices;
                        int i3 = this.stackSize - 1;
                        iArr2[i3] = iArr2[i3] + 1;
                        recordPromotedName(this.peekedString);
                        return parseLong;
                    } catch (NumberFormatException unused) {
                        break;
                    }
                default:
                    throw unexpectedTokenError("a long");
            }
        } else {
            this.peekedString = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        }
        this.peeked = 11;
        try {
            double parseDouble = Double.parseDouble(this.peekedString);
            long j = (long) parseDouble;
            double d = j;
            String str = this.peekedString;
            if (d != parseDouble) {
                StringBuilder m3869m = BitVector$$ExternalSyntheticOutline0.m3869m("Expected a long but was ", str);
                m3869m.append(locationString());
                throw new NumberFormatException(m3869m.toString());
            }
            this.peekedString = null;
            this.peeked = 0;
            int[] iArr3 = this.pathIndices;
            int i4 = this.stackSize - 1;
            iArr3[i4] = iArr3[i4] + 1;
            recordPromotedName(str);
            return j;
        } catch (NumberFormatException e) {
            NumberFormatException numberFormatException = new NumberFormatException("Expected a long but was " + this.peekedString + locationString());
            numberFormatException.initCause(e);
            throw numberFormatException;
        }
    }

    public String nextName() throws IOException {
        String nextQuotedValue;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        switch (i) {
            case 12:
                nextQuotedValue = nextQuotedValue('\'');
                break;
            case 13:
                nextQuotedValue = nextQuotedValue('\"');
                break;
            case 14:
                nextQuotedValue = nextUnquotedValue();
                break;
            default:
                throw unexpectedTokenError("a name");
        }
        this.peeked = 0;
        this.pathNames[this.stackSize - 1] = nextQuotedValue;
        return nextQuotedValue;
    }

    public void nextNull() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i != 7) {
            throw unexpectedTokenError("null");
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    public String nextString() throws IOException {
        String l;
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        if (i == 15) {
            l = Long.toString(this.peekedLong);
        } else if (i != 16) {
            switch (i) {
                case 8:
                    l = nextQuotedValue('\'');
                    break;
                case 9:
                    l = nextQuotedValue('\"');
                    break;
                case 10:
                    l = nextUnquotedValue();
                    break;
                case 11:
                    l = this.peekedString;
                    this.peekedString = null;
                    break;
                default:
                    throw unexpectedTokenError("a string");
            }
        } else {
            l = new String(this.buffer, this.pos, this.peekedNumberLength);
            this.pos += this.peekedNumberLength;
        }
        this.peeked = 0;
        int[] iArr = this.pathIndices;
        int i2 = this.stackSize - 1;
        iArr[i2] = iArr[i2] + 1;
        recordPromotedName(l);
        return l;
    }

    public JsonToken peek() throws IOException {
        int i = this.peeked;
        if (i == 0) {
            i = doPeek();
        }
        switch (i) {
            case 1:
                return JsonToken.BEGIN_OBJECT;
            case 2:
                return JsonToken.END_OBJECT;
            case 3:
                return JsonToken.BEGIN_ARRAY;
            case 4:
                return JsonToken.END_ARRAY;
            case 5:
            case 6:
                return JsonToken.BOOLEAN;
            case 7:
                return JsonToken.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return JsonToken.STRING;
            case 12:
            case 13:
            case 14:
                return JsonToken.NAME;
            case 15:
            case 16:
                return JsonToken.NUMBER;
            case 17:
                return JsonToken.END_DOCUMENT;
            default:
                Buffer$$ExternalSyntheticBUOutline0.m$2();
                return null;
        }
    }

    @Deprecated
    public final void setLenient(boolean z) {
        setStrictness(z ? Strictness.LENIENT : Strictness.LEGACY_STRICT);
    }

    public final void setNestingLimit(int i) {
        if (i >= 0) {
            this.nestingLimit = i;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$3(a$$ExternalSyntheticOutline0.m(i, "Invalid nesting limit: "));
        }
    }

    public final void setStrictness(Strictness strictness) {
        Objects.requireNonNull(strictness);
        this.strictness = strictness;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public void skipValue() throws IOException {
        int i = 0;
        do {
            int i2 = this.peeked;
            if (i2 == 0) {
                i2 = doPeek();
            }
            switch (i2) {
                case 1:
                    push(3);
                    i++;
                    this.peeked = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.pathNames[this.stackSize - 1] = null;
                    }
                    this.stackSize--;
                    i--;
                    this.peeked = 0;
                    break;
                case 3:
                    push(1);
                    i++;
                    this.peeked = 0;
                    break;
                case 4:
                    this.stackSize--;
                    i--;
                    this.peeked = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case 11:
                case 15:
                default:
                    this.peeked = 0;
                    break;
                case 8:
                    skipQuotedValue('\'');
                    this.peeked = 0;
                    break;
                case 9:
                    skipQuotedValue('\"');
                    this.peeked = 0;
                    break;
                case 10:
                    skipUnquotedValue();
                    this.peeked = 0;
                    break;
                case 12:
                    skipQuotedValue('\'');
                    if (i == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 13:
                    skipQuotedValue('\"');
                    if (i == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 14:
                    skipUnquotedValue();
                    if (i == 0) {
                        this.pathNames[this.stackSize - 1] = "<skipped>";
                    }
                    this.peeked = 0;
                    break;
                case 16:
                    this.pos += this.peekedNumberLength;
                    this.peeked = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.pathIndices;
        int i3 = this.stackSize - 1;
        iArr[i3] = iArr[i3] + 1;
        recordPromotedName("<skipped>");
    }

    public String toString() {
        return getClass().getSimpleName() + locationString();
    }

    public String getPath() {
        return getPath(false);
    }
}
