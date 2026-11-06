package com.fasterxml.jackson.core.util;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.fasterxml.jackson.core.io.NumberInput;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.XML$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public class TextBuffer {
    static final int MAX_SEGMENT_LEN = 65536;
    static final int MIN_SEGMENT_LEN = 500;
    static final char[] NO_CHARS = new char[0];
    private final BufferRecycler _allocator;
    private char[] _currentSegment;
    private int _currentSize;
    private boolean _hasSegments;
    private char[] _inputBuffer;
    private int _inputLen;
    private int _inputStart;
    private char[] _resultArray;
    private String _resultString;
    private int _segmentSize;
    private ArrayList<char[]> _segments;

    public TextBuffer(BufferRecycler bufferRecycler, char[] cArr) {
        this(bufferRecycler);
        this._currentSegment = cArr;
        this._currentSize = cArr.length;
        this._inputStart = -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0015, code lost:
    
        r5 = r4._segments;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0017, code lost:
    
        if (r5 == null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x001d, code lost:
    
        if (r5.isEmpty() == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String _doTrim(int r5) throws java.io.IOException {
        /*
            r4 = this;
        L0:
            char[] r0 = r4._currentSegment
        L2:
            int r1 = r5 + (-1)
            if (r1 < 0) goto L15
            char r2 = r0[r1]
            r3 = 32
            if (r2 <= r3) goto L13
            r4._currentSize = r5
            java.lang.String r4 = r4.contentsAsString()
            return r4
        L13:
            r5 = r1
            goto L2
        L15:
            java.util.ArrayList<char[]> r5 = r4._segments
            if (r5 == 0) goto L32
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L20
            goto L32
        L20:
            java.util.ArrayList<char[]> r5 = r4._segments
            int r0 = r5.size()
            int r0 = r0 + (-1)
            java.lang.Object r5 = r5.remove(r0)
            char[] r5 = (char[]) r5
            r4._currentSegment = r5
            int r5 = r5.length
            goto L0
        L32:
            r5 = 0
            r4._currentSize = r5
            r4._hasSegments = r5
            java.lang.String r4 = r4.contentsAsString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.TextBuffer._doTrim(int):java.lang.String");
    }

    private char[] buf(int i) {
        BufferRecycler bufferRecycler = this._allocator;
        return bufferRecycler != null ? bufferRecycler.allocCharBuffer(2, i) : new char[Math.max(i, 500)];
    }

    private char[] carr(int i) {
        return new char[i];
    }

    private void clearSegments() {
        this._hasSegments = false;
        this._segments.clear();
        this._segmentSize = 0;
        this._currentSize = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r0 > 65536) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void expand() {
        /*
            r3 = this;
            java.util.ArrayList<char[]> r0 = r3._segments
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3._segments = r0
        Lb:
            char[] r0 = r3._currentSegment
            r1 = 1
            r3._hasSegments = r1
            java.util.ArrayList<char[]> r1 = r3._segments
            r1.add(r0)
            int r1 = r3._segmentSize
            int r2 = r0.length
            int r1 = r1 + r2
            r3._segmentSize = r1
            if (r1 >= 0) goto L23
            int r2 = r0.length
            int r1 = r1 - r2
            int r2 = r0.length
            r3._reportBufferOverflow(r1, r2)
        L23:
            r1 = 0
            r3._currentSize = r1
            int r0 = r0.length
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L30
        L2e:
            r0 = r1
            goto L35
        L30:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 <= r1) goto L35
            goto L2e
        L35:
            char[] r0 = r3.carr(r0)
            r3._currentSegment = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.TextBuffer.expand():void");
    }

    public static TextBuffer fromInitial(char[] cArr) {
        return new TextBuffer(null, cArr);
    }

    private char[] resultArray() throws IOException {
        int i;
        String str = this._resultString;
        if (str != null) {
            return str.toCharArray();
        }
        if (this._inputStart >= 0) {
            int i2 = this._inputLen;
            if (i2 < 1) {
                return NO_CHARS;
            }
            validateStringLength(i2);
            int i3 = this._inputStart;
            char[] cArr = this._inputBuffer;
            return i3 == 0 ? Arrays.copyOf(cArr, i2) : Arrays.copyOfRange(cArr, i3, i2 + i3);
        }
        int size = size();
        if (size < 1) {
            if (size < 0) {
                _reportBufferOverflow(this._segmentSize, this._currentSize);
            }
            return NO_CHARS;
        }
        validateStringLength(size);
        char[] carr = carr(size);
        ArrayList<char[]> arrayList = this._segments;
        if (arrayList != null) {
            int size2 = arrayList.size();
            i = 0;
            for (int i4 = 0; i4 < size2; i4++) {
                char[] cArr2 = this._segments.get(i4);
                int length = cArr2.length;
                System.arraycopy(cArr2, 0, carr, i, length);
                i += length;
            }
        } else {
            i = 0;
        }
        System.arraycopy(this._currentSegment, 0, carr, i, this._currentSize);
        return carr;
    }

    private void unshare(int i) {
        int i2 = this._inputLen;
        this._inputLen = 0;
        char[] cArr = this._inputBuffer;
        this._inputBuffer = null;
        int i3 = this._inputStart;
        this._inputStart = -1;
        int i4 = i + i2;
        char[] cArr2 = this._currentSegment;
        if (cArr2 == null || i4 > cArr2.length) {
            this._currentSegment = buf(i4);
        }
        if (i2 > 0) {
            System.arraycopy(cArr, i3, this._currentSegment, 0, i2);
        }
        this._segmentSize = 0;
        this._currentSize = i2;
    }

    private void validateAppend(int i) throws IOException {
        int i2 = this._segmentSize + this._currentSize + i;
        if (i2 < 0) {
            i2 = Integer.MAX_VALUE;
        }
        validateStringLength(i2);
    }

    public void _reportBufferOverflow(int i, int i2) {
        throw new IllegalStateException(AppLaunchChecker$$ExternalSyntheticOutline0.m("TextBuffer overrun: size reached (", i + i2, ") exceeds maximum of 2147483647"));
    }

    public void append(String str, int i, int i2) throws IOException {
        if (this._inputStart >= 0) {
            unshare(i2);
        }
        this._resultString = null;
        this._resultArray = null;
        char[] cArr = this._currentSegment;
        int length = cArr.length;
        int i3 = this._currentSize;
        int i4 = length - i3;
        if (i4 >= i2) {
            str.getChars(i, i + i2, cArr, i3);
            this._currentSize += i2;
            return;
        }
        validateAppend(i2);
        if (i4 > 0) {
            int i5 = i + i4;
            str.getChars(i, i5, cArr, this._currentSize);
            i2 -= i4;
            i = i5;
        }
        while (true) {
            expand();
            int min = Math.min(this._currentSegment.length, i2);
            int i6 = i + min;
            str.getChars(i, i6, this._currentSegment, 0);
            this._currentSize += min;
            i2 -= min;
            if (i2 <= 0) {
                return;
            } else {
                i = i6;
            }
        }
    }

    public BufferRecycler bufferRecycler() {
        return this._allocator;
    }

    public char[] contentsAsArray() throws IOException {
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return cArr;
        }
        char[] resultArray = resultArray();
        this._resultArray = resultArray;
        return resultArray;
    }

    public BigDecimal contentsAsDecimal(boolean z) throws NumberFormatException {
        String str = this._resultString;
        if (str != null) {
            return NumberInput.parseBigDecimal(str, z);
        }
        int i = this._inputStart;
        if (i >= 0) {
            return NumberInput.parseBigDecimal(this._inputBuffer, i, this._inputLen, z);
        }
        if (!this._hasSegments) {
            return NumberInput.parseBigDecimal(this._currentSegment, 0, this._currentSize, z);
        }
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return NumberInput.parseBigDecimal(cArr, z);
        }
        try {
            return NumberInput.parseBigDecimal(contentsAsArray(), z);
        } catch (IOException e) {
            XML$$ExternalSyntheticBUOutline0.m$2(e.getMessage());
            return null;
        }
    }

    public double contentsAsDouble(boolean z) throws NumberFormatException {
        String str = this._resultString;
        if (str != null) {
            return NumberInput.parseDouble(str, z);
        }
        int i = this._inputStart;
        if (i >= 0) {
            return NumberInput.parseDouble(this._inputBuffer, i, this._inputLen, z);
        }
        if (!this._hasSegments) {
            return NumberInput.parseDouble(this._currentSegment, 0, this._currentSize, z);
        }
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return NumberInput.parseDouble(cArr, z);
        }
        try {
            return NumberInput.parseDouble(contentsAsString(), z);
        } catch (IOException e) {
            XML$$ExternalSyntheticBUOutline0.m$2(e.getMessage());
            return 0.0d;
        }
    }

    public float contentsAsFloat(boolean z) throws NumberFormatException {
        String str = this._resultString;
        if (str != null) {
            return NumberInput.parseFloat(str, z);
        }
        int i = this._inputStart;
        if (i >= 0) {
            return NumberInput.parseFloat(this._inputBuffer, i, this._inputLen, z);
        }
        if (!this._hasSegments) {
            return NumberInput.parseFloat(this._currentSegment, 0, this._currentSize, z);
        }
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return NumberInput.parseFloat(cArr, z);
        }
        try {
            return NumberInput.parseFloat(contentsAsString(), z);
        } catch (IOException e) {
            XML$$ExternalSyntheticBUOutline0.m$2(e.getMessage());
            return 0.0f;
        }
    }

    public int contentsAsInt(boolean z) {
        char[] cArr;
        int i = this._inputStart;
        if (i < 0 || (cArr = this._inputBuffer) == null) {
            char[] cArr2 = this._currentSegment;
            return z ? -NumberInput.parseInt(cArr2, 1, this._currentSize - 1) : NumberInput.parseInt(cArr2, 0, this._currentSize);
        }
        int i2 = this._inputLen;
        return z ? -NumberInput.parseInt(cArr, i + 1, i2 - 1) : NumberInput.parseInt(cArr, i, i2);
    }

    public long contentsAsLong(boolean z) {
        char[] cArr;
        int i = this._inputStart;
        if (i < 0 || (cArr = this._inputBuffer) == null) {
            char[] cArr2 = this._currentSegment;
            return z ? -NumberInput.parseLong(cArr2, 1, this._currentSize - 1) : NumberInput.parseLong(cArr2, 0, this._currentSize);
        }
        int i2 = this._inputLen;
        return z ? -NumberInput.parseLong(cArr, i + 1, i2 - 1) : NumberInput.parseLong(cArr, i, i2);
    }

    public String contentsAsString() throws IOException {
        if (this._resultString == null) {
            char[] cArr = this._resultArray;
            if (cArr != null) {
                this._resultString = new String(cArr);
            } else if (this._inputStart >= 0) {
                int i = this._inputLen;
                if (i < 1) {
                    this._resultString = "";
                    return "";
                }
                validateStringLength(i);
                this._resultString = new String(this._inputBuffer, this._inputStart, this._inputLen);
            } else {
                int i2 = this._segmentSize;
                int i3 = this._currentSize;
                if (i2 != 0) {
                    int i4 = i2 + i3;
                    if (i4 < 0) {
                        _reportBufferOverflow(i2, i3);
                    }
                    validateStringLength(i4);
                    StringBuilder sb = new StringBuilder(i4);
                    ArrayList<char[]> arrayList = this._segments;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        for (int i5 = 0; i5 < size; i5++) {
                            char[] cArr2 = this._segments.get(i5);
                            sb.append(cArr2, 0, cArr2.length);
                        }
                    }
                    sb.append(this._currentSegment, 0, this._currentSize);
                    this._resultString = sb.toString();
                } else if (i3 == 0) {
                    this._resultString = "";
                } else {
                    validateStringLength(i3);
                    this._resultString = new String(this._currentSegment, 0, i3);
                }
            }
        }
        return this._resultString;
    }

    public int contentsToWriter(Writer writer) throws IOException {
        int i;
        char[] cArr = this._resultArray;
        if (cArr != null) {
            writer.write(cArr);
            return this._resultArray.length;
        }
        String str = this._resultString;
        if (str != null) {
            writer.write(str);
            return this._resultString.length();
        }
        int i2 = this._inputStart;
        if (i2 >= 0) {
            int i3 = this._inputLen;
            if (i3 > 0) {
                writer.write(this._inputBuffer, i2, i3);
            }
            return i3;
        }
        ArrayList<char[]> arrayList = this._segments;
        if (arrayList != null) {
            int size = arrayList.size();
            i = 0;
            for (int i4 = 0; i4 < size; i4++) {
                char[] cArr2 = this._segments.get(i4);
                int length = cArr2.length;
                i += length;
                writer.write(cArr2, 0, length);
            }
        } else {
            i = 0;
        }
        int i5 = this._currentSize;
        if (i5 <= 0) {
            return i;
        }
        int i6 = i + i5;
        writer.write(this._currentSegment, 0, i5);
        return i6;
    }

    public char[] emptyAndGetCurrentSegment() {
        this._inputStart = -1;
        this._currentSize = 0;
        this._inputLen = 0;
        this._inputBuffer = null;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
        char[] cArr = this._currentSegment;
        if (cArr != null) {
            return cArr;
        }
        char[] buf = buf(0);
        this._currentSegment = buf;
        return buf;
    }

    public void ensureNotShared() {
        if (this._inputStart >= 0) {
            unshare(16);
        }
    }

    public char[] expandCurrentSegment() {
        char[] cArr = this._currentSegment;
        int length = cArr.length;
        int i = (length >> 1) + length;
        if (i > 65536) {
            i = (length >> 2) + length;
        }
        char[] copyOf = Arrays.copyOf(cArr, i);
        this._currentSegment = copyOf;
        return copyOf;
    }

    public String finishAndReturn(int i, boolean z) throws IOException {
        int i2;
        if (z && (i - 1 < 0 || this._currentSegment[i2] <= ' ')) {
            return _doTrim(i2);
        }
        this._currentSize = i;
        return contentsAsString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r0 > 65536) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public char[] finishCurrentSegment() throws java.io.IOException {
        /*
            r2 = this;
            java.util.ArrayList<char[]> r0 = r2._segments
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2._segments = r0
        Lb:
            r0 = 1
            r2._hasSegments = r0
            java.util.ArrayList<char[]> r0 = r2._segments
            char[] r1 = r2._currentSegment
            r0.add(r1)
            char[] r0 = r2._currentSegment
            int r0 = r0.length
            int r1 = r2._segmentSize
            int r1 = r1 + r0
            r2._segmentSize = r1
            if (r1 >= 0) goto L23
            int r1 = r1 - r0
            r2._reportBufferOverflow(r1, r0)
        L23:
            r1 = 0
            r2._currentSize = r1
            int r1 = r2._segmentSize
            r2.validateStringLength(r1)
            int r1 = r0 >> 1
            int r0 = r0 + r1
            r1 = 500(0x1f4, float:7.0E-43)
            if (r0 >= r1) goto L34
        L32:
            r0 = r1
            goto L39
        L34:
            r1 = 65536(0x10000, float:9.1835E-41)
            if (r0 <= r1) goto L39
            goto L32
        L39:
            char[] r0 = r2.carr(r0)
            r2._currentSegment = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.core.util.TextBuffer.finishCurrentSegment():char[]");
    }

    public char[] getBufferWithoutReset() {
        return this._currentSegment;
    }

    public char[] getCurrentSegment() {
        if (this._inputStart >= 0) {
            unshare(1);
        } else {
            char[] cArr = this._currentSegment;
            if (cArr == null) {
                this._currentSegment = buf(0);
            } else if (this._currentSize >= cArr.length) {
                expand();
            }
        }
        return this._currentSegment;
    }

    public int getCurrentSegmentSize() {
        return this._currentSize;
    }

    public char[] getTextBuffer() throws IOException {
        if (this._inputStart >= 0) {
            return this._inputBuffer;
        }
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return cArr;
        }
        String str = this._resultString;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this._resultArray = charArray;
            return charArray;
        }
        if (this._hasSegments) {
            return contentsAsArray();
        }
        char[] cArr2 = this._currentSegment;
        return cArr2 == null ? NO_CHARS : cArr2;
    }

    public int getTextOffset() {
        int i = this._inputStart;
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    public boolean hasTextAsCharacters() {
        return this._inputStart >= 0 || this._resultArray != null || this._resultString == null;
    }

    public void releaseBuffers() {
        char[] cArr;
        this._inputStart = -1;
        this._currentSize = 0;
        this._inputLen = 0;
        this._inputBuffer = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
        BufferRecycler bufferRecycler = this._allocator;
        if (bufferRecycler == null || (cArr = this._currentSegment) == null) {
            return;
        }
        this._currentSegment = null;
        bufferRecycler.releaseCharBuffer(2, cArr);
    }

    public void resetWith(char c) {
        this._inputStart = -1;
        this._inputLen = 0;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        } else if (this._currentSegment == null) {
            this._currentSegment = buf(1);
        }
        this._currentSegment[0] = c;
        this._segmentSize = 1;
        this._currentSize = 1;
    }

    public void resetWithCopy(char[] cArr, int i, int i2) throws IOException {
        this._inputBuffer = null;
        this._inputStart = -1;
        this._inputLen = 0;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        } else if (this._currentSegment == null) {
            this._currentSegment = buf(i2);
        }
        this._segmentSize = 0;
        this._currentSize = 0;
        append(cArr, i, i2);
    }

    public void resetWithEmpty() {
        this._inputStart = -1;
        this._currentSize = 0;
        this._inputLen = 0;
        this._inputBuffer = null;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
    }

    public void resetWithShared(char[] cArr, int i, int i2) {
        this._resultString = null;
        this._resultArray = null;
        this._inputBuffer = cArr;
        this._inputStart = i;
        this._inputLen = i2;
        if (this._hasSegments) {
            clearSegments();
        }
    }

    public void resetWithString(String str) throws IOException {
        this._inputBuffer = null;
        this._inputStart = -1;
        this._inputLen = 0;
        validateStringLength(str.length());
        this._resultString = str;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        }
        this._currentSize = 0;
    }

    public String setCurrentAndReturn(int i) throws IOException {
        this._currentSize = i;
        if (this._segmentSize > 0) {
            return contentsAsString();
        }
        validateStringLength(i);
        String str = i == 0 ? "" : new String(this._currentSegment, 0, i);
        this._resultString = str;
        return str;
    }

    public void setCurrentLength(int i) {
        this._currentSize = i;
    }

    public int size() {
        if (this._inputStart >= 0) {
            return this._inputLen;
        }
        char[] cArr = this._resultArray;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this._resultString;
        return str != null ? str.length() : this._segmentSize + this._currentSize;
    }

    public String toString() {
        try {
            return contentsAsString();
        } catch (IOException unused) {
            return "TextBuffer: Exception when reading contents";
        }
    }

    public TextBuffer(BufferRecycler bufferRecycler) {
        this._allocator = bufferRecycler;
    }

    public char[] expandCurrentSegment(int i) {
        char[] cArr = this._currentSegment;
        if (cArr.length >= i) {
            return cArr;
        }
        char[] copyOf = Arrays.copyOf(cArr, i);
        this._currentSegment = copyOf;
        return copyOf;
    }

    public void validateStringLength(int i) throws IOException {
    }

    public void resetWithCopy(String str, int i, int i2) throws IOException {
        this._inputBuffer = null;
        this._inputStart = -1;
        this._inputLen = 0;
        this._resultString = null;
        this._resultArray = null;
        if (this._hasSegments) {
            clearSegments();
        } else if (this._currentSegment == null) {
            this._currentSegment = buf(i2);
        }
        this._segmentSize = 0;
        this._currentSize = 0;
        append(str, i, i2);
    }

    @Deprecated
    public BigDecimal contentsAsDecimal() throws NumberFormatException {
        return contentsAsDecimal(false);
    }

    @Deprecated
    public float contentsAsFloat() throws NumberFormatException {
        return contentsAsFloat(false);
    }

    @Deprecated
    public double contentsAsDouble() throws NumberFormatException {
        return contentsAsDouble(false);
    }

    public void append(char[] cArr, int i, int i2) throws IOException {
        if (this._inputStart >= 0) {
            unshare(i2);
        }
        this._resultString = null;
        this._resultArray = null;
        char[] cArr2 = this._currentSegment;
        int length = cArr2.length;
        int i3 = this._currentSize;
        int i4 = length - i3;
        if (i4 >= i2) {
            System.arraycopy(cArr, i, cArr2, i3, i2);
            this._currentSize += i2;
            return;
        }
        validateAppend(i2);
        if (i4 > 0) {
            System.arraycopy(cArr, i, cArr2, this._currentSize, i4);
            i += i4;
            i2 -= i4;
        }
        do {
            expand();
            int min = Math.min(this._currentSegment.length, i2);
            System.arraycopy(cArr, i, this._currentSegment, 0, min);
            this._currentSize += min;
            i += min;
            i2 -= min;
        } while (i2 > 0);
    }

    public void append(char c) throws IOException {
        if (this._inputStart >= 0) {
            unshare(16);
        }
        this._resultString = null;
        this._resultArray = null;
        char[] cArr = this._currentSegment;
        if (this._currentSize >= cArr.length) {
            validateAppend(1);
            expand();
            cArr = this._currentSegment;
        }
        int i = this._currentSize;
        this._currentSize = i + 1;
        cArr[i] = c;
    }
}
