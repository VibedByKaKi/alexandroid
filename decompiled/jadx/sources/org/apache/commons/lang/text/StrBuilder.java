package org.apache.commons.lang.text;

import java.io.Reader;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.SystemUtils;
import org.bouncycastle.asn1.ocsp.CrlID$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
public class StrBuilder implements Cloneable {
    static final int CAPACITY = 32;
    private static final long serialVersionUID = 7628716375283629643L;
    protected char[] buffer;
    private String newLine;
    private String nullText;
    protected int size;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class StrBuilderTokenizer extends StrTokenizer {
        public StrBuilderTokenizer() {
        }

        @Override // org.apache.commons.lang.text.StrTokenizer
        public String getContent() {
            String content = super.getContent();
            return content == null ? StrBuilder.this.toString() : content;
        }

        @Override // org.apache.commons.lang.text.StrTokenizer
        public List tokenize(char[] cArr, int i, int i2) {
            if (cArr != null) {
                return super.tokenize(cArr, i, i2);
            }
            StrBuilder strBuilder = StrBuilder.this;
            return super.tokenize(strBuilder.buffer, 0, strBuilder.size());
        }
    }

    public StrBuilder(String str) {
        if (str == null) {
            this.buffer = new char[32];
        } else {
            this.buffer = new char[str.length() + 32];
            append(str);
        }
    }

    private void deleteImpl(int i, int i2, int i3) {
        char[] cArr = this.buffer;
        System.arraycopy(cArr, i2, cArr, i, this.size - i2);
        this.size -= i3;
    }

    private StrBuilder replaceImpl(StrMatcher strMatcher, String str, int i, int i2, int i3) {
        StrBuilder strBuilder;
        String str2;
        if (strMatcher != null && this.size != 0) {
            int length = str == null ? 0 : str.length();
            char[] cArr = this.buffer;
            int i4 = i;
            while (i4 < i2 && i3 != 0) {
                int isMatch = strMatcher.isMatch(cArr, i4, i, i2);
                if (isMatch > 0) {
                    strBuilder = this;
                    str2 = str;
                    strBuilder.replaceImpl(i4, i4 + isMatch, isMatch, str2, length);
                    i2 = (i2 - isMatch) + length;
                    i4 = (i4 + length) - 1;
                    if (i3 > 0) {
                        i3--;
                    }
                } else {
                    strBuilder = this;
                    str2 = str;
                }
                i4++;
                this = strBuilder;
                str = str2;
            }
        }
        return this;
    }

    public StrBuilder append(boolean z) {
        int i = this.size;
        if (z) {
            ensureCapacity(i + 4);
            char[] cArr = this.buffer;
            int i2 = this.size;
            int i3 = i2 + 1;
            this.size = i3;
            cArr[i2] = 't';
            int i4 = i2 + 2;
            this.size = i4;
            cArr[i3] = 'r';
            int i5 = i2 + 3;
            this.size = i5;
            cArr[i4] = AbstractJsonLexerKt.UNICODE_ESC;
            this.size = i2 + 4;
            cArr[i5] = 'e';
            return this;
        }
        ensureCapacity(i + 5);
        char[] cArr2 = this.buffer;
        int i6 = this.size;
        int i7 = i6 + 1;
        this.size = i7;
        cArr2[i6] = 'f';
        int i8 = i6 + 2;
        this.size = i8;
        cArr2[i7] = 'a';
        int i9 = i6 + 3;
        this.size = i9;
        cArr2[i8] = 'l';
        int i10 = i6 + 4;
        this.size = i10;
        cArr2[i9] = 's';
        this.size = i6 + 5;
        cArr2[i10] = 'e';
        return this;
    }

    public StrBuilder appendAll(Collection collection) {
        if (collection != null && collection.size() > 0) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                append(it2.next());
            }
        }
        return this;
    }

    public StrBuilder appendFixedWidthPadLeft(Object obj, int i, char c) {
        char[] cArr;
        if (i > 0) {
            ensureCapacity(this.size + i);
            String nullText = obj == null ? getNullText() : obj.toString();
            if (nullText == null) {
                nullText = "";
            }
            int length = nullText.length();
            if (length >= i) {
                nullText.getChars(length - i, length, this.buffer, this.size);
            } else {
                int i2 = i - length;
                int i3 = 0;
                while (true) {
                    cArr = this.buffer;
                    if (i3 >= i2) {
                        break;
                    }
                    cArr[this.size + i3] = c;
                    i3++;
                }
                nullText.getChars(0, length, cArr, this.size + i2);
            }
            this.size += i;
        }
        return this;
    }

    public StrBuilder appendFixedWidthPadRight(Object obj, int i, char c) {
        if (i > 0) {
            ensureCapacity(this.size + i);
            String nullText = obj == null ? getNullText() : obj.toString();
            if (nullText == null) {
                nullText = "";
            }
            int length = nullText.length();
            char[] cArr = this.buffer;
            if (length >= i) {
                nullText.getChars(0, i, cArr, this.size);
            } else {
                int i2 = i - length;
                nullText.getChars(0, length, cArr, this.size);
                for (int i3 = 0; i3 < i2; i3++) {
                    this.buffer[this.size + length + i3] = c;
                }
            }
            this.size += i;
        }
        return this;
    }

    public StrBuilder appendNewLine() {
        String str = this.newLine;
        if (str != null) {
            return append(str);
        }
        append(SystemUtils.LINE_SEPARATOR);
        return this;
    }

    public StrBuilder appendNull() {
        String str = this.nullText;
        return str == null ? this : append(str);
    }

    public StrBuilder appendPadding(int i, char c) {
        if (i >= 0) {
            ensureCapacity(this.size + i);
            for (int i2 = 0; i2 < i; i2++) {
                char[] cArr = this.buffer;
                int i3 = this.size;
                this.size = i3 + 1;
                cArr[i3] = c;
            }
        }
        return this;
    }

    public StrBuilder appendSeparator(char c, char c2) {
        if (size() > 0) {
            append(c);
            return this;
        }
        append(c2);
        return this;
    }

    public StrBuilder appendWithSeparators(Collection collection, String str) {
        if (collection != null && collection.size() > 0) {
            if (str == null) {
                str = "";
            }
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                append(it2.next());
                if (it2.hasNext()) {
                    append(str);
                }
            }
        }
        return this;
    }

    public StrBuilder appendln(Object obj) {
        return append(obj).appendNewLine();
    }

    public Reader asReader() {
        return new StrBuilderReader();
    }

    public StrTokenizer asTokenizer() {
        return new StrBuilderTokenizer();
    }

    public Writer asWriter() {
        return new StrBuilderWriter();
    }

    public int capacity() {
        return this.buffer.length;
    }

    public char charAt(int i) {
        if (i >= 0 && i < length()) {
            return this.buffer[i];
        }
        CrlID$$ExternalSyntheticBUOutline0.m(i);
        return (char) 0;
    }

    public StrBuilder clear() {
        this.size = 0;
        return this;
    }

    public Object clone() throws CloneNotSupportedException {
        StrBuilder strBuilder = (StrBuilder) super.clone();
        char[] cArr = new char[this.buffer.length];
        strBuilder.buffer = cArr;
        char[] cArr2 = this.buffer;
        System.arraycopy(cArr2, 0, cArr, 0, cArr2.length);
        return strBuilder;
    }

    public boolean contains(char c) {
        char[] cArr = this.buffer;
        for (int i = 0; i < this.size; i++) {
            if (cArr[i] == c) {
                return true;
            }
        }
        return false;
    }

    public StrBuilder delete(int i, int i2) {
        int validateRange = validateRange(i, i2);
        int i3 = validateRange - i;
        if (i3 > 0) {
            deleteImpl(i, validateRange, i3);
        }
        return this;
    }

    public StrBuilder deleteAll(char c) {
        int i = 0;
        while (i < this.size) {
            if (this.buffer[i] == c) {
                int i2 = i;
                do {
                    i2++;
                    if (i2 >= this.size) {
                        break;
                    }
                } while (this.buffer[i2] == c);
                int i3 = i2 - i;
                deleteImpl(i, i2, i3);
                i = i2 - i3;
            }
            i++;
        }
        return this;
    }

    public StrBuilder deleteCharAt(int i) {
        if (i < 0 || i >= this.size) {
            CrlID$$ExternalSyntheticBUOutline0.m(i);
            return null;
        }
        deleteImpl(i, i + 1, 1);
        return this;
    }

    public StrBuilder deleteFirst(String str) {
        int indexOf;
        int length = str == null ? 0 : str.length();
        if (length > 0 && (indexOf = indexOf(str, 0)) >= 0) {
            deleteImpl(indexOf, indexOf + length, length);
        }
        return this;
    }

    public boolean endsWith(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return true;
        }
        int i = this.size;
        if (length > i) {
            return false;
        }
        int i2 = i - length;
        int i3 = 0;
        while (i3 < length) {
            if (this.buffer[i2] != str.charAt(i3)) {
                return false;
            }
            i3++;
            i2++;
        }
        return true;
    }

    public StrBuilder ensureCapacity(int i) {
        char[] cArr = this.buffer;
        if (i > cArr.length) {
            char[] cArr2 = new char[i * 2];
            this.buffer = cArr2;
            System.arraycopy(cArr, 0, cArr2, 0, this.size);
        }
        return this;
    }

    public boolean equals(StrBuilder strBuilder) {
        if (this == strBuilder) {
            return true;
        }
        int i = this.size;
        if (i != strBuilder.size) {
            return false;
        }
        char[] cArr = this.buffer;
        char[] cArr2 = strBuilder.buffer;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            if (cArr[i2] != cArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public boolean equalsIgnoreCase(StrBuilder strBuilder) {
        if (this == strBuilder) {
            return true;
        }
        int i = this.size;
        if (i != strBuilder.size) {
            return false;
        }
        char[] cArr = this.buffer;
        char[] cArr2 = strBuilder.buffer;
        for (int i2 = i - 1; i2 >= 0; i2--) {
            char c = cArr[i2];
            char c2 = cArr2[i2];
            if (c != c2 && Character.toUpperCase(c) != Character.toUpperCase(c2)) {
                return false;
            }
        }
        return true;
    }

    public void getChars(int i, int i2, char[] cArr, int i3) {
        if (i < 0) {
            CrlID$$ExternalSyntheticBUOutline0.m(i);
            return;
        }
        if (i2 < 0 || i2 > length()) {
            CrlID$$ExternalSyntheticBUOutline0.m(i2);
        } else if (i <= i2) {
            System.arraycopy(this.buffer, i, cArr, i3, i2 - i);
        } else {
            CrlID$$ExternalSyntheticBUOutline0.m("end < start");
        }
    }

    public String getNewLineText() {
        return this.newLine;
    }

    public String getNullText() {
        return this.nullText;
    }

    public int hashCode() {
        char[] cArr = this.buffer;
        int i = 0;
        for (int i2 = this.size - 1; i2 >= 0; i2--) {
            i = (i * 31) + cArr[i2];
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0037, code lost:
    
        r9 = r9 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int indexOf(java.lang.String r8, int r9) {
        /*
            r7 = this;
            r0 = 0
            if (r9 >= 0) goto L4
            r9 = r0
        L4:
            r1 = -1
            if (r8 == 0) goto L3e
            int r2 = r7.size
            if (r9 < r2) goto Lc
            goto L3e
        Lc:
            int r2 = r8.length()
            r3 = 1
            if (r2 != r3) goto L1c
            char r8 = r8.charAt(r0)
            int r7 = r7.indexOf(r8, r9)
            return r7
        L1c:
            if (r2 != 0) goto L1f
            return r9
        L1f:
            int r4 = r7.size
            if (r2 <= r4) goto L24
            return r1
        L24:
            char[] r7 = r7.buffer
            int r4 = r4 - r2
            int r4 = r4 + r3
        L28:
            if (r9 >= r4) goto L3e
            r3 = r0
        L2b:
            if (r3 >= r2) goto L3d
            char r5 = r8.charAt(r3)
            int r6 = r9 + r3
            char r6 = r7[r6]
            if (r5 == r6) goto L3a
            int r9 = r9 + 1
            goto L28
        L3a:
            int r3 = r3 + 1
            goto L2b
        L3d:
            return r9
        L3e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang.text.StrBuilder.indexOf(java.lang.String, int):int");
    }

    public StrBuilder insert(int i, boolean z) {
        validateIndex(i);
        int i2 = this.size;
        if (z) {
            ensureCapacity(i2 + 4);
            char[] cArr = this.buffer;
            System.arraycopy(cArr, i, cArr, i + 4, this.size - i);
            char[] cArr2 = this.buffer;
            cArr2[i] = 't';
            cArr2[i + 1] = 'r';
            cArr2[i + 2] = AbstractJsonLexerKt.UNICODE_ESC;
            cArr2[i + 3] = 'e';
            this.size += 4;
            return this;
        }
        ensureCapacity(i2 + 5);
        char[] cArr3 = this.buffer;
        System.arraycopy(cArr3, i, cArr3, i + 5, this.size - i);
        char[] cArr4 = this.buffer;
        cArr4[i] = 'f';
        cArr4[i + 1] = 'a';
        cArr4[i + 2] = 'l';
        cArr4[i + 3] = 's';
        cArr4[i + 4] = 'e';
        this.size += 5;
        return this;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0036, code lost:
    
        r9 = r9 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int lastIndexOf(java.lang.String r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.size
            r1 = 1
            if (r9 < r0) goto L7
            int r9 = r0 + (-1)
        L7:
            r0 = -1
            if (r8 == 0) goto L40
            if (r9 >= 0) goto Ld
            goto L40
        Ld:
            int r2 = r8.length()
            if (r2 <= 0) goto L3d
            int r3 = r7.size
            if (r2 > r3) goto L3d
            r3 = 0
            if (r2 != r1) goto L23
            char r8 = r8.charAt(r3)
            int r7 = r7.lastIndexOf(r8, r9)
            return r7
        L23:
            int r9 = r9 - r2
            int r9 = r9 + r1
        L25:
            if (r9 < 0) goto L40
            r1 = r3
        L28:
            if (r1 >= r2) goto L3c
            char r4 = r8.charAt(r1)
            char[] r5 = r7.buffer
            int r6 = r9 + r1
            char r5 = r5[r6]
            if (r4 == r5) goto L39
            int r9 = r9 + (-1)
            goto L25
        L39:
            int r1 = r1 + 1
            goto L28
        L3c:
            return r9
        L3d:
            if (r2 != 0) goto L40
            return r9
        L40:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang.text.StrBuilder.lastIndexOf(java.lang.String, int):int");
    }

    public String leftString(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = this.size;
        char[] cArr = this.buffer;
        return i >= i2 ? new String(cArr, 0, i2) : new String(cArr, 0, i);
    }

    public int length() {
        return this.size;
    }

    public String midString(int i, int i2) {
        int i3;
        if (i < 0) {
            i = 0;
        }
        if (i2 <= 0 || i >= (i3 = this.size)) {
            return "";
        }
        int i4 = i + i2;
        char[] cArr = this.buffer;
        return i3 <= i4 ? new String(cArr, i, i3 - i) : new String(cArr, i, i2);
    }

    public StrBuilder minimizeCapacity() {
        if (this.buffer.length > length()) {
            char[] cArr = this.buffer;
            char[] cArr2 = new char[length()];
            this.buffer = cArr2;
            System.arraycopy(cArr, 0, cArr2, 0, this.size);
        }
        return this;
    }

    public StrBuilder replace(int i, int i2, String str) {
        int validateRange = validateRange(i, i2);
        replaceImpl(i, validateRange, validateRange - i, str, str == null ? 0 : str.length());
        return this;
    }

    public StrBuilder replaceAll(String str, String str2) {
        int length = str == null ? 0 : str.length();
        if (length > 0) {
            int length2 = str2 == null ? 0 : str2.length();
            int indexOf = indexOf(str, 0);
            while (indexOf >= 0) {
                replaceImpl(indexOf, indexOf + length, length, str2, length2);
                indexOf = indexOf(str, indexOf + length2);
            }
        }
        return this;
    }

    public StrBuilder replaceFirst(String str, String str2) {
        int indexOf;
        int length = str == null ? 0 : str.length();
        if (length <= 0 || (indexOf = indexOf(str, 0)) < 0) {
            return this;
        }
        replaceImpl(indexOf, indexOf + length, length, str2, str2 != null ? str2.length() : 0);
        return this;
    }

    public StrBuilder reverse() {
        int i = this.size;
        if (i != 0) {
            int i2 = i / 2;
            char[] cArr = this.buffer;
            int i3 = i - 1;
            int i4 = 0;
            while (i4 < i2) {
                char c = cArr[i4];
                cArr[i4] = cArr[i3];
                cArr[i3] = c;
                i4++;
                i3--;
            }
        }
        return this;
    }

    public String rightString(int i) {
        if (i <= 0) {
            return "";
        }
        int i2 = this.size;
        char[] cArr = this.buffer;
        return i >= i2 ? new String(cArr, 0, i2) : new String(cArr, i2 - i, i);
    }

    public StrBuilder setCharAt(int i, char c) {
        if (i < 0 || i >= length()) {
            CrlID$$ExternalSyntheticBUOutline0.m(i);
            return null;
        }
        this.buffer[i] = c;
        return this;
    }

    public StrBuilder setLength(int i) {
        if (i < 0) {
            CrlID$$ExternalSyntheticBUOutline0.m(i);
            return null;
        }
        int i2 = this.size;
        if (i < i2) {
            this.size = i;
            return this;
        }
        if (i > i2) {
            ensureCapacity(i);
            this.size = i;
            for (int i3 = this.size; i3 < i; i3++) {
                this.buffer[i3] = 0;
            }
        }
        return this;
    }

    public StrBuilder setNewLineText(String str) {
        this.newLine = str;
        return this;
    }

    public StrBuilder setNullText(String str) {
        if (str != null && str.length() == 0) {
            str = null;
        }
        this.nullText = str;
        return this;
    }

    public int size() {
        return this.size;
    }

    public boolean startsWith(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        if (length == 0) {
            return true;
        }
        if (length > this.size) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (this.buffer[i] != str.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public String substring(int i, int i2) {
        return new String(this.buffer, i, validateRange(i, i2) - i);
    }

    public char[] toCharArray(int i, int i2) {
        int validateRange = validateRange(i, i2) - i;
        if (validateRange == 0) {
            return ArrayUtils.EMPTY_CHAR_ARRAY;
        }
        char[] cArr = new char[validateRange];
        System.arraycopy(this.buffer, i, cArr, 0, validateRange);
        return cArr;
    }

    public String toString() {
        return new String(this.buffer, 0, this.size);
    }

    public StringBuffer toStringBuffer() {
        StringBuffer stringBuffer = new StringBuffer(this.size);
        stringBuffer.append(this.buffer, 0, this.size);
        return stringBuffer;
    }

    public StrBuilder trim() {
        int i = this.size;
        if (i != 0) {
            char[] cArr = this.buffer;
            int i2 = 0;
            while (i2 < i && cArr[i2] <= ' ') {
                i2++;
            }
            while (i2 < i && cArr[i - 1] <= ' ') {
                i--;
            }
            int i3 = this.size;
            if (i < i3) {
                delete(i, i3);
            }
            if (i2 > 0) {
                delete(0, i2);
            }
        }
        return this;
    }

    public void validateIndex(int i) {
        if (i < 0 || i > this.size) {
            CrlID$$ExternalSyntheticBUOutline0.m(i);
        }
    }

    public int validateRange(int i, int i2) {
        if (i < 0) {
            CrlID$$ExternalSyntheticBUOutline0.m(i);
            return 0;
        }
        int i3 = this.size;
        if (i2 > i3) {
            i2 = i3;
        }
        if (i <= i2) {
            return i2;
        }
        CrlID$$ExternalSyntheticBUOutline0.m("end < start");
        return 0;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class StrBuilderWriter extends Writer {
        public StrBuilderWriter() {
        }

        @Override // java.io.Writer
        public void write(int i) {
            StrBuilder.this.append((char) i);
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
            StrBuilder.this.append(cArr);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i, int i2) {
            StrBuilder.this.append(cArr, i, i2);
        }

        @Override // java.io.Writer
        public void write(String str) {
            StrBuilder.this.append(str);
        }

        @Override // java.io.Writer
        public void write(String str, int i, int i2) {
            StrBuilder.this.append(str, i, i2);
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }
    }

    public StrBuilder appendln(String str) {
        return append(str).appendNewLine();
    }

    public StrBuilder appendln(String str, int i, int i2) {
        return append(str, i, i2).appendNewLine();
    }

    public StrBuilder appendln(StringBuffer stringBuffer) {
        return append(stringBuffer).appendNewLine();
    }

    public StrBuilder appendln(StringBuffer stringBuffer, int i, int i2) {
        return append(stringBuffer, i, i2).appendNewLine();
    }

    public StrBuilder appendln(StrBuilder strBuilder) {
        return append(strBuilder).appendNewLine();
    }

    public String substring(int i) {
        return substring(i, this.size);
    }

    public StrBuilder appendSeparator(String str, String str2) {
        if (isEmpty()) {
            str = str2;
        }
        if (str != null) {
            append(str);
        }
        return this;
    }

    public StrBuilder appendln(StrBuilder strBuilder, int i, int i2) {
        return append(strBuilder, i, i2).appendNewLine();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class StrBuilderReader extends Reader {
        private int mark;
        private int pos;

        public StrBuilderReader() {
        }

        @Override // java.io.Reader
        public void mark(int i) {
            this.mark = this.pos;
        }

        @Override // java.io.Reader
        public boolean markSupported() {
            return true;
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i, int i2) {
            int i3;
            if (i < 0 || i2 < 0 || i > cArr.length || (i3 = i + i2) > cArr.length || i3 < 0) {
                Buffer$$ExternalSyntheticBUOutline0.m();
                return 0;
            }
            if (i2 == 0) {
                return 0;
            }
            if (this.pos >= StrBuilder.this.size()) {
                return -1;
            }
            if (this.pos + i2 > StrBuilder.this.size()) {
                i2 = StrBuilder.this.size() - this.pos;
            }
            StrBuilder strBuilder = StrBuilder.this;
            int i4 = this.pos;
            strBuilder.getChars(i4, i4 + i2, cArr, i);
            this.pos += i2;
            return i2;
        }

        @Override // java.io.Reader
        public boolean ready() {
            return this.pos < StrBuilder.this.size();
        }

        @Override // java.io.Reader
        public void reset() {
            this.pos = this.mark;
        }

        @Override // java.io.Reader
        public long skip(long j) {
            if (this.pos + j > StrBuilder.this.size()) {
                j = StrBuilder.this.size() - this.pos;
            }
            if (j < 0) {
                return 0L;
            }
            this.pos = (int) (this.pos + j);
            return j;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Reader
        public int read() {
            if (!ready()) {
                return -1;
            }
            StrBuilder strBuilder = StrBuilder.this;
            int i = this.pos;
            this.pos = i + 1;
            return strBuilder.charAt(i);
        }
    }

    public StrBuilder appendln(char[] cArr) {
        return append(cArr).appendNewLine();
    }

    public StrBuilder appendSeparator(char c) {
        if (size() > 0) {
            append(c);
        }
        return this;
    }

    public StrBuilder appendln(char[] cArr, int i, int i2) {
        return append(cArr, i, i2).appendNewLine();
    }

    public StrBuilder appendln(boolean z) {
        return append(z).appendNewLine();
    }

    public StrBuilder appendSeparator(String str) {
        return appendSeparator(str, (String) null);
    }

    public StrBuilder appendln(char c) {
        return append(c).appendNewLine();
    }

    public boolean contains(String str) {
        return indexOf(str, 0) >= 0;
    }

    public StrBuilder appendSeparator(String str, int i) {
        if (str != null && i > 0) {
            append(str);
        }
        return this;
    }

    public StrBuilder appendln(int i) {
        return append(i).appendNewLine();
    }

    public boolean contains(StrMatcher strMatcher) {
        return indexOf(strMatcher, 0) >= 0;
    }

    public char[] toCharArray() {
        int i = this.size;
        if (i == 0) {
            return ArrayUtils.EMPTY_CHAR_ARRAY;
        }
        char[] cArr = new char[i];
        System.arraycopy(this.buffer, 0, cArr, 0, i);
        return cArr;
    }

    public StrBuilder appendSeparator(char c, int i) {
        if (i > 0) {
            append(c);
        }
        return this;
    }

    public StrBuilder appendln(long j) {
        return append(j).appendNewLine();
    }

    public StrBuilder appendln(float f) {
        return append(f).appendNewLine();
    }

    public StrBuilder appendln(double d) {
        return append(d).appendNewLine();
    }

    public StrBuilder deleteFirst(char c) {
        for (int i = 0; i < this.size; i++) {
            if (this.buffer[i] == c) {
                deleteImpl(i, i + 1, 1);
                return this;
            }
        }
        return this;
    }

    public StrBuilder replace(StrMatcher strMatcher, String str, int i, int i2, int i3) {
        return replaceImpl(strMatcher, str, i, validateRange(i, i2), i3);
    }

    public StrBuilder(int i) {
        this.buffer = new char[i <= 0 ? 32 : i];
    }

    public StrBuilder deleteFirst(StrMatcher strMatcher) {
        return replace(strMatcher, null, 0, this.size, 1);
    }

    public StrBuilder() {
        this(32);
    }

    public StrBuilder appendAll(Object[] objArr) {
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                append(obj);
            }
        }
        return this;
    }

    public StrBuilder appendAll(Iterator it2) {
        if (it2 != null) {
            while (it2.hasNext()) {
                append(it2.next());
            }
        }
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof StrBuilder) {
            return equals((StrBuilder) obj);
        }
        return false;
    }

    public char[] getChars(char[] cArr) {
        int length = length();
        if (cArr == null || cArr.length < length) {
            cArr = new char[length];
        }
        System.arraycopy(this.buffer, 0, cArr, 0, length);
        return cArr;
    }

    public StrBuilder deleteAll(String str) {
        int length = str == null ? 0 : str.length();
        if (length > 0) {
            int indexOf = indexOf(str, 0);
            while (indexOf >= 0) {
                deleteImpl(indexOf, indexOf + length, length);
                indexOf = indexOf(str, indexOf);
            }
        }
        return this;
    }

    public StrBuilder replaceFirst(char c, char c2) {
        if (c != c2) {
            for (int i = 0; i < this.size; i++) {
                char[] cArr = this.buffer;
                if (cArr[i] == c) {
                    cArr[i] = c2;
                    return this;
                }
            }
        }
        return this;
    }

    public StrBuilder deleteAll(StrMatcher strMatcher) {
        return replace(strMatcher, null, 0, this.size, -1);
    }

    public StrBuilder appendWithSeparators(Object[] objArr, String str) {
        if (objArr != null && objArr.length > 0) {
            if (str == null) {
                str = "";
            }
            append(objArr[0]);
            for (int i = 1; i < objArr.length; i++) {
                append(str);
                append(objArr[i]);
            }
        }
        return this;
    }

    public StrBuilder replaceFirst(StrMatcher strMatcher, String str) {
        return replace(strMatcher, str, 0, this.size, 1);
    }

    public StrBuilder replaceAll(char c, char c2) {
        if (c != c2) {
            for (int i = 0; i < this.size; i++) {
                char[] cArr = this.buffer;
                if (cArr[i] == c) {
                    cArr[i] = c2;
                }
            }
        }
        return this;
    }

    public StrBuilder appendWithSeparators(Iterator it2, String str) {
        if (it2 != null) {
            if (str == null) {
                str = "";
            }
            while (it2.hasNext()) {
                append(it2.next());
                if (it2.hasNext()) {
                    append(str);
                }
            }
        }
        return this;
    }

    public StrBuilder replaceAll(StrMatcher strMatcher, String str) {
        return replace(strMatcher, str, 0, this.size, -1);
    }

    private void replaceImpl(int i, int i2, int i3, String str, int i4) {
        int i5 = (this.size - i3) + i4;
        if (i4 != i3) {
            ensureCapacity(i5);
            char[] cArr = this.buffer;
            System.arraycopy(cArr, i2, cArr, i + i4, this.size - i2);
            this.size = i5;
        }
        if (i4 > 0) {
            str.getChars(0, i4, this.buffer, i);
        }
    }

    public int indexOf(char c, int i) {
        if (i < 0) {
            i = 0;
        }
        if (i >= this.size) {
            return -1;
        }
        char[] cArr = this.buffer;
        while (i < this.size) {
            if (cArr[i] == c) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public StrBuilder appendFixedWidthPadRight(int i, int i2, char c) {
        return appendFixedWidthPadRight(String.valueOf(i), i2, c);
    }

    public int lastIndexOf(char c, int i) {
        int i2 = this.size;
        if (i >= i2) {
            i = i2 - 1;
        }
        if (i < 0) {
            return -1;
        }
        while (i >= 0) {
            if (this.buffer[i] == c) {
                return i;
            }
            i--;
        }
        return -1;
    }

    public StrBuilder appendFixedWidthPadLeft(int i, int i2, char c) {
        return appendFixedWidthPadLeft(String.valueOf(i), i2, c);
    }

    public int indexOf(String str) {
        return indexOf(str, 0);
    }

    public int lastIndexOf(String str) {
        return lastIndexOf(str, this.size - 1);
    }

    public int indexOf(char c) {
        return indexOf(c, 0);
    }

    public int lastIndexOf(char c) {
        return lastIndexOf(c, this.size - 1);
    }

    public int indexOf(StrMatcher strMatcher) {
        return indexOf(strMatcher, 0);
    }

    public int lastIndexOf(StrMatcher strMatcher) {
        return lastIndexOf(strMatcher, this.size);
    }

    public int indexOf(StrMatcher strMatcher, int i) {
        int i2;
        if (i < 0) {
            i = 0;
        }
        if (strMatcher != null && i < (i2 = this.size)) {
            char[] cArr = this.buffer;
            for (int i3 = i; i3 < i2; i3++) {
                if (strMatcher.isMatch(cArr, i3, i, i2) > 0) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public int lastIndexOf(StrMatcher strMatcher, int i) {
        int i2 = this.size;
        if (i >= i2) {
            i = i2 - 1;
        }
        if (strMatcher != null && i >= 0) {
            char[] cArr = this.buffer;
            int i3 = i + 1;
            while (i >= 0) {
                if (strMatcher.isMatch(cArr, i, 0, i3) > 0) {
                    return i;
                }
                i--;
            }
        }
        return -1;
    }

    public StrBuilder append(String str) {
        if (str == null) {
            return appendNull();
        }
        int length = str.length();
        if (length > 0) {
            int length2 = length();
            ensureCapacity(length2 + length);
            str.getChars(0, length, this.buffer, length2);
            this.size += length;
        }
        return this;
    }

    public StrBuilder append(String str, int i, int i2) {
        int i3;
        if (str == null) {
            return appendNull();
        }
        if (i >= 0 && i <= str.length()) {
            if (i2 < 0 || (i3 = i + i2) > str.length()) {
                CrlID$$ExternalSyntheticBUOutline0.m("length must be valid");
                return null;
            }
            if (i2 > 0) {
                int length = length();
                ensureCapacity(length + i2);
                str.getChars(i, i3, this.buffer, length);
                this.size += i2;
            }
            return this;
        }
        CrlID$$ExternalSyntheticBUOutline0.m("startIndex must be valid");
        return null;
    }

    public StrBuilder insert(int i, String str) {
        validateIndex(i);
        if (str == null) {
            str = this.nullText;
        }
        int length = str == null ? 0 : str.length();
        if (length > 0) {
            int i2 = this.size + length;
            ensureCapacity(i2);
            char[] cArr = this.buffer;
            System.arraycopy(cArr, i, cArr, i + length, this.size - i);
            this.size = i2;
            str.getChars(0, length, this.buffer, i);
        }
        return this;
    }

    public StrBuilder append(StringBuffer stringBuffer) {
        if (stringBuffer == null) {
            return appendNull();
        }
        int length = stringBuffer.length();
        if (length > 0) {
            int length2 = length();
            ensureCapacity(length2 + length);
            stringBuffer.getChars(0, length, this.buffer, length2);
            this.size += length;
        }
        return this;
    }

    public StrBuilder insert(int i, char[] cArr) {
        validateIndex(i);
        if (cArr == null) {
            return insert(i, this.nullText);
        }
        int length = cArr.length;
        if (length > 0) {
            ensureCapacity(this.size + length);
            char[] cArr2 = this.buffer;
            System.arraycopy(cArr2, i, cArr2, i + length, this.size - i);
            System.arraycopy(cArr, 0, this.buffer, i, length);
            this.size += length;
        }
        return this;
    }

    public StrBuilder append(StringBuffer stringBuffer, int i, int i2) {
        int i3;
        if (stringBuffer == null) {
            return appendNull();
        }
        if (i >= 0 && i <= stringBuffer.length()) {
            if (i2 < 0 || (i3 = i + i2) > stringBuffer.length()) {
                CrlID$$ExternalSyntheticBUOutline0.m("length must be valid");
                return null;
            }
            if (i2 > 0) {
                int length = length();
                ensureCapacity(length + i2);
                stringBuffer.getChars(i, i3, this.buffer, length);
                this.size += i2;
            }
            return this;
        }
        CrlID$$ExternalSyntheticBUOutline0.m("startIndex must be valid");
        return null;
    }

    public StrBuilder insert(int i, char[] cArr, int i2, int i3) {
        validateIndex(i);
        if (cArr == null) {
            return insert(i, this.nullText);
        }
        if (i2 >= 0 && i2 <= cArr.length) {
            if (i3 < 0 || i2 + i3 > cArr.length) {
                StringBuffer stringBuffer = new StringBuffer("Invalid length: ");
                stringBuffer.append(i3);
                throw new StringIndexOutOfBoundsException(stringBuffer.toString());
            }
            if (i3 > 0) {
                ensureCapacity(this.size + i3);
                char[] cArr2 = this.buffer;
                System.arraycopy(cArr2, i, cArr2, i + i3, this.size - i);
                System.arraycopy(cArr, i2, this.buffer, i, i3);
                this.size += i3;
            }
            return this;
        }
        StringBuffer stringBuffer2 = new StringBuffer("Invalid offset: ");
        stringBuffer2.append(i2);
        throw new StringIndexOutOfBoundsException(stringBuffer2.toString());
    }

    public StrBuilder append(StrBuilder strBuilder) {
        if (strBuilder == null) {
            return appendNull();
        }
        int length = strBuilder.length();
        if (length > 0) {
            int length2 = length();
            ensureCapacity(length2 + length);
            System.arraycopy(strBuilder.buffer, 0, this.buffer, length2, length);
            this.size += length;
        }
        return this;
    }

    public StrBuilder insert(int i, Object obj) {
        if (obj == null) {
            return insert(i, this.nullText);
        }
        return insert(i, obj.toString());
    }

    public StrBuilder append(StrBuilder strBuilder, int i, int i2) {
        int i3;
        if (strBuilder == null) {
            return appendNull();
        }
        if (i >= 0 && i <= strBuilder.length()) {
            if (i2 < 0 || (i3 = i + i2) > strBuilder.length()) {
                CrlID$$ExternalSyntheticBUOutline0.m("length must be valid");
                return null;
            }
            if (i2 > 0) {
                int length = length();
                ensureCapacity(length + i2);
                strBuilder.getChars(i, i3, this.buffer, length);
                this.size += i2;
            }
            return this;
        }
        CrlID$$ExternalSyntheticBUOutline0.m("startIndex must be valid");
        return null;
    }

    public StrBuilder insert(int i, char c) {
        validateIndex(i);
        ensureCapacity(this.size + 1);
        char[] cArr = this.buffer;
        System.arraycopy(cArr, i, cArr, i + 1, this.size - i);
        this.buffer[i] = c;
        this.size++;
        return this;
    }

    public StrBuilder insert(int i, int i2) {
        return insert(i, String.valueOf(i2));
    }

    public StrBuilder insert(int i, long j) {
        return insert(i, String.valueOf(j));
    }

    public StrBuilder insert(int i, float f) {
        return insert(i, String.valueOf(f));
    }

    public StrBuilder insert(int i, double d) {
        return insert(i, String.valueOf(d));
    }

    public StrBuilder append(char[] cArr) {
        if (cArr == null) {
            return appendNull();
        }
        int length = cArr.length;
        if (length > 0) {
            int length2 = length();
            ensureCapacity(length2 + length);
            System.arraycopy(cArr, 0, this.buffer, length2, length);
            this.size += length;
        }
        return this;
    }

    public StrBuilder append(char[] cArr, int i, int i2) {
        if (cArr == null) {
            return appendNull();
        }
        if (i >= 0 && i <= cArr.length) {
            if (i2 < 0 || i + i2 > cArr.length) {
                StringBuffer stringBuffer = new StringBuffer("Invalid length: ");
                stringBuffer.append(i2);
                throw new StringIndexOutOfBoundsException(stringBuffer.toString());
            }
            if (i2 > 0) {
                int length = length();
                ensureCapacity(length + i2);
                System.arraycopy(cArr, i, this.buffer, length, i2);
                this.size += i2;
            }
            return this;
        }
        StringBuffer stringBuffer2 = new StringBuffer("Invalid startIndex: ");
        stringBuffer2.append(i2);
        throw new StringIndexOutOfBoundsException(stringBuffer2.toString());
    }

    public StrBuilder append(Object obj) {
        if (obj == null) {
            return appendNull();
        }
        return append(obj.toString());
    }

    public StrBuilder append(char c) {
        ensureCapacity(length() + 1);
        char[] cArr = this.buffer;
        int i = this.size;
        this.size = i + 1;
        cArr[i] = c;
        return this;
    }

    public StrBuilder append(int i) {
        return append(String.valueOf(i));
    }

    public StrBuilder append(long j) {
        return append(String.valueOf(j));
    }

    public StrBuilder append(float f) {
        return append(String.valueOf(f));
    }

    public StrBuilder append(double d) {
        return append(String.valueOf(d));
    }
}
