package com.bugsnag.android.repackaged.dslplatform.json;

import androidx.annotation.Nullable;
import androidx.camera.core.processing.util.GLUtils;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.bugsnag.android.repackaged.dslplatform.json.Grisu3;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class JsonWriter {
    public static final byte ARRAY_END = 93;
    public static final byte ARRAY_START = 91;
    public static final byte COMMA = 44;
    public static final byte ESCAPE = 92;
    public static final byte OBJECT_END = 125;
    public static final byte OBJECT_START = 123;
    public static final byte QUOTE = 34;
    public static final byte SEMI = 58;
    private static final Charset UTF_8 = Charset.forName("UTF-8");
    private byte[] buffer;
    private final Grisu3.FastDtoaBuilder doubleBuilder;
    private long flushed;
    private int position;
    private OutputStream target;
    private final UnknownSerializer unknownSerializer;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface WriteObject<T> {
        void write(JsonWriter jsonWriter, @Nullable T t);
    }

    public JsonWriter(byte[] bArr, @Nullable UnknownSerializer unknownSerializer) {
        this.doubleBuilder = new Grisu3.FastDtoaBuilder();
        this.buffer = bArr;
        this.unknownSerializer = unknownSerializer;
    }

    private void enlargeOrFlush(int i, int i2) {
        OutputStream outputStream = this.target;
        if (outputStream == null) {
            byte[] bArr = this.buffer;
            this.buffer = Arrays.copyOf(bArr, (bArr.length / 2) + bArr.length + i2);
            return;
        }
        try {
            outputStream.write(this.buffer, 0, i);
            this.position = 0;
            this.flushed += i;
            byte[] bArr2 = this.buffer;
            if (i2 > bArr2.length) {
                this.buffer = Arrays.copyOf(bArr2, (bArr2.length / 2) + bArr2.length + i2);
            }
        } catch (IOException e) {
            throw new SerializationException("Unable to write to target stream.", e);
        }
    }

    private void writeQuotedString(CharSequence charSequence, int i, int i2, int i3) {
        byte[] bArr = this.buffer;
        int i4 = i;
        int i5 = i2;
        while (i4 < i3) {
            char charAt = charSequence.charAt(i4);
            if (charAt == '\"') {
                int i6 = i5 + 1;
                bArr[i5] = ESCAPE;
                i5 += 2;
                bArr[i6] = 34;
            } else if (charAt == '\\') {
                int i7 = i5 + 1;
                bArr[i5] = ESCAPE;
                i5 += 2;
                bArr[i7] = ESCAPE;
            } else if (charAt < ' ') {
                if (charAt == '\b') {
                    int i8 = i5 + 1;
                    bArr[i5] = ESCAPE;
                    i5 += 2;
                    bArr[i8] = 98;
                } else if (charAt == '\t') {
                    int i9 = i5 + 1;
                    bArr[i5] = ESCAPE;
                    i5 += 2;
                    bArr[i9] = 116;
                } else if (charAt == '\n') {
                    int i10 = i5 + 1;
                    bArr[i5] = ESCAPE;
                    i5 += 2;
                    bArr[i10] = 110;
                } else if (charAt == '\f') {
                    int i11 = i5 + 1;
                    bArr[i5] = ESCAPE;
                    i5 += 2;
                    bArr[i11] = 102;
                } else if (charAt == '\r') {
                    int i12 = i5 + 1;
                    bArr[i5] = ESCAPE;
                    i5 += 2;
                    bArr[i12] = 114;
                } else {
                    bArr[i5] = ESCAPE;
                    bArr[i5 + 1] = 117;
                    bArr[i5 + 2] = 48;
                    bArr[i5 + 3] = 48;
                    switch (charAt) {
                        case 0:
                            bArr[i5 + 4] = 48;
                            bArr[i5 + 5] = 48;
                            break;
                        case 1:
                            bArr[i5 + 4] = 48;
                            bArr[i5 + 5] = 49;
                            break;
                        case 2:
                            bArr[i5 + 4] = 48;
                            bArr[i5 + 5] = 50;
                            break;
                        case 3:
                            bArr[i5 + 4] = 48;
                            bArr[i5 + 5] = 51;
                            break;
                        case 4:
                            bArr[i5 + 4] = 48;
                            bArr[i5 + 5] = 52;
                            break;
                        case 5:
                            bArr[i5 + 4] = 48;
                            bArr[i5 + 5] = 53;
                            break;
                        case 6:
                            bArr[i5 + 4] = 48;
                            bArr[i5 + 5] = 54;
                            break;
                        case 7:
                            bArr[i5 + 4] = 48;
                            bArr[i5 + 5] = 55;
                            break;
                        case '\b':
                        case '\t':
                        case '\n':
                        case '\f':
                        case '\r':
                        default:
                            bArr[i5 + 4] = 49;
                            bArr[i5 + 5] = 70;
                            break;
                        case 11:
                            bArr[i5 + 4] = 48;
                            bArr[i5 + 5] = 66;
                            break;
                        case 14:
                            bArr[i5 + 4] = 48;
                            bArr[i5 + 5] = 69;
                            break;
                        case 15:
                            bArr[i5 + 4] = 48;
                            bArr[i5 + 5] = 70;
                            break;
                        case 16:
                            bArr[i5 + 4] = 49;
                            bArr[i5 + 5] = 48;
                            break;
                        case 17:
                            bArr[i5 + 4] = 49;
                            bArr[i5 + 5] = 49;
                            break;
                        case 18:
                            bArr[i5 + 4] = 49;
                            bArr[i5 + 5] = 50;
                            break;
                        case 19:
                            bArr[i5 + 4] = 49;
                            bArr[i5 + 5] = 51;
                            break;
                        case 20:
                            bArr[i5 + 4] = 49;
                            bArr[i5 + 5] = 52;
                            break;
                        case 21:
                            bArr[i5 + 4] = 49;
                            bArr[i5 + 5] = 53;
                            break;
                        case 22:
                            bArr[i5 + 4] = 49;
                            bArr[i5 + 5] = 54;
                            break;
                        case 23:
                            bArr[i5 + 4] = 49;
                            bArr[i5 + 5] = 55;
                            break;
                        case 24:
                            bArr[i5 + 4] = 49;
                            bArr[i5 + 5] = 56;
                            break;
                        case 25:
                            bArr[i5 + 4] = 49;
                            bArr[i5 + 5] = 57;
                            break;
                        case 26:
                            bArr[i5 + 4] = 49;
                            bArr[i5 + 5] = 65;
                            break;
                        case 27:
                            bArr[i5 + 4] = 49;
                            bArr[i5 + 5] = 66;
                            break;
                        case 28:
                            bArr[i5 + 4] = 49;
                            bArr[i5 + 5] = 67;
                            break;
                        case 29:
                            bArr[i5 + 4] = 49;
                            bArr[i5 + 5] = 68;
                            break;
                        case 30:
                            bArr[i5 + 4] = 49;
                            bArr[i5 + 5] = 69;
                            break;
                    }
                    i5 += 6;
                }
            } else if (charAt < 127) {
                bArr[i5] = (byte) charAt;
                i5++;
            } else {
                int codePointAt = Character.codePointAt(charSequence, i4);
                if (Character.isSupplementaryCodePoint(codePointAt)) {
                    i4++;
                }
                if (codePointAt == 127) {
                    bArr[i5] = (byte) codePointAt;
                    i5++;
                } else if (codePointAt <= 2047) {
                    int i13 = i5 + 1;
                    bArr[i5] = (byte) (((codePointAt >> 6) & 31) | 192);
                    i5 += 2;
                    bArr[i13] = (byte) ((codePointAt & 63) | 128);
                } else if (codePointAt < 55296 || (codePointAt > 57343 && codePointAt <= 65535)) {
                    bArr[i5] = (byte) (((codePointAt >> 12) & 15) | 224);
                    int i14 = i5 + 2;
                    bArr[i5 + 1] = (byte) (((codePointAt >> 6) & 63) | 128);
                    i5 += 3;
                    bArr[i14] = (byte) ((codePointAt & 63) | 128);
                } else {
                    if (codePointAt < 65536 || codePointAt > 1114111) {
                        throw new SerializationException(DoubleList$$ExternalSyntheticOutline0.m(codePointAt, new StringBuilder("Unknown unicode codepoint in string! ")));
                    }
                    bArr[i5] = (byte) (((codePointAt >> 18) & 7) | 240);
                    bArr[i5 + 1] = (byte) (((codePointAt >> 12) & 63) | 128);
                    int i15 = i5 + 3;
                    bArr[i5 + 2] = (byte) (((codePointAt >> 6) & 63) | 128);
                    i5 += 4;
                    bArr[i15] = (byte) ((codePointAt & 63) | 128);
                }
            }
            i4++;
        }
        bArr[i5] = 34;
        this.position = i5 + 1;
    }

    public void advance(int i) {
        this.position += i;
    }

    @Deprecated
    public void close() throws IOException {
        int i;
        OutputStream outputStream = this.target;
        if (outputStream == null || (i = this.position) == 0) {
            return;
        }
        outputStream.write(this.buffer, 0, i);
        this.position = 0;
        this.flushed = 0L;
    }

    public final byte[] ensureCapacity(int i) {
        int i2 = this.position;
        if (i2 + i >= this.buffer.length) {
            enlargeOrFlush(i2, i);
        }
        return this.buffer;
    }

    public final void flush() {
        int i;
        OutputStream outputStream = this.target;
        if (outputStream == null || (i = this.position) == 0) {
            return;
        }
        try {
            outputStream.write(this.buffer, 0, i);
            this.flushed += this.position;
            this.position = 0;
        } catch (IOException e) {
            throw new SerializationException("Unable to write to target stream.", e);
        }
    }

    public final long flushed() {
        return this.flushed;
    }

    public final byte[] getByteBuffer() {
        return this.buffer;
    }

    public final void reset(@Nullable OutputStream outputStream) {
        this.position = 0;
        this.target = outputStream;
        this.flushed = 0L;
    }

    public <T> void serialize(@Nullable List<T> list, WriteObject<T> writeObject) {
        if (list == null) {
            writeNull();
            return;
        }
        writeByte(ARRAY_START);
        if (!list.isEmpty()) {
            if (list instanceof RandomAccess) {
                T t = list.get(0);
                if (t != null) {
                    writeObject.write(this, t);
                } else {
                    writeNull();
                }
                for (int i = 1; i < list.size(); i++) {
                    writeByte(COMMA);
                    T t2 = list.get(i);
                    if (t2 != null) {
                        writeObject.write(this, t2);
                    } else {
                        writeNull();
                    }
                }
            } else {
                Iterator<T> it2 = list.iterator();
                T next = it2.next();
                if (next != null) {
                    writeObject.write(this, next);
                } else {
                    writeNull();
                }
                while (it2.hasNext()) {
                    writeByte(COMMA);
                    T next2 = it2.next();
                    if (next2 != null) {
                        writeObject.write(this, next2);
                    } else {
                        writeNull();
                    }
                }
            }
        }
        writeByte(ARRAY_END);
    }

    public void serializeObject(@Nullable Object obj) {
        if (obj == null) {
            writeNull();
            return;
        }
        UnknownSerializer unknownSerializer = this.unknownSerializer;
        if (unknownSerializer != null) {
            try {
                unknownSerializer.serialize(this, obj);
            } catch (IOException e) {
                throw new SerializationException(e);
            }
        } else {
            throw new ConfigurationException("Unable to serialize: " + obj.getClass() + ".\nCheck that JsonWriter was created through DslJson#newWriter.");
        }
    }

    public void serializeRaw(@Nullable List list, WriteObject writeObject) {
        serialize(list, writeObject);
    }

    public final int size() {
        return this.position;
    }

    public final byte[] toByteArray() {
        if (this.target == null) {
            return Arrays.copyOf(this.buffer, this.position);
        }
        throw new ConfigurationException("Method is not available when targeting stream");
    }

    public final void toStream(OutputStream outputStream) throws IOException {
        if (this.target != null) {
            throw new ConfigurationException("Method should not be used when targeting streams. Instead use flush() to copy what's remaining in the buffer");
        }
        outputStream.write(this.buffer, 0, this.position);
        this.flushed += this.position;
        this.position = 0;
    }

    public String toString() {
        return new String(this.buffer, 0, this.position, UTF_8);
    }

    public final void writeAscii(byte[] bArr) {
        int length = bArr.length;
        int i = this.position;
        if (i + length >= this.buffer.length) {
            enlargeOrFlush(i, length);
        }
        int i2 = this.position;
        byte[] bArr2 = this.buffer;
        for (int i3 = 0; i3 < bArr.length; i3++) {
            bArr2[i2 + i3] = bArr[i3];
        }
        this.position += length;
    }

    public final void writeBinary(byte[] bArr) {
        int i = this.position;
        if ((bArr.length << 1) + i + 2 >= this.buffer.length) {
            enlargeOrFlush(i, (bArr.length << 1) + 2);
        }
        byte[] bArr2 = this.buffer;
        int i2 = this.position;
        int i3 = i2 + 1;
        this.position = i3;
        bArr2[i2] = 34;
        int encodeToBytes = i3 + Base64.encodeToBytes(bArr, bArr2, i3);
        byte[] bArr3 = this.buffer;
        this.position = encodeToBytes + 1;
        bArr3[encodeToBytes] = 34;
    }

    public final void writeByte(byte b) {
        int i = this.position;
        if (i == this.buffer.length) {
            enlargeOrFlush(i, 0);
        }
        byte[] bArr = this.buffer;
        int i2 = this.position;
        this.position = i2 + 1;
        bArr[i2] = b;
    }

    public final void writeDouble(double d) {
        if (d == Double.POSITIVE_INFINITY) {
            writeAscii("\"Infinity\"");
            return;
        }
        if (d == Double.NEGATIVE_INFINITY) {
            writeAscii("\"-Infinity\"");
            return;
        }
        if (d != d) {
            writeAscii("\"NaN\"");
            return;
        }
        if (d == 0.0d) {
            writeAscii(GLUtils.VERSION_UNKNOWN);
            return;
        }
        if (!Grisu3.tryConvert(d, this.doubleBuilder)) {
            writeAscii(Double.toString(d));
            return;
        }
        int i = this.position;
        if (i + 24 >= this.buffer.length) {
            enlargeOrFlush(i, 24);
        }
        this.position += this.doubleBuilder.copyTo(this.buffer, this.position);
    }

    public final void writeNull() {
        int i = this.position;
        if (i + 4 >= this.buffer.length) {
            enlargeOrFlush(i, 0);
        }
        int i2 = this.position;
        byte[] bArr = this.buffer;
        bArr[i2] = 110;
        bArr[i2 + 1] = 117;
        bArr[i2 + 2] = 108;
        bArr[i2 + 3] = 108;
        this.position = i2 + 4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> void writeQuoted(WriteObject<T> writeObject, T t) {
        if (t instanceof Double) {
            double doubleValue = ((Double) t).doubleValue();
            if (Double.isNaN(doubleValue)) {
                writeAscii("\"NaN\"");
                return;
            }
            if (doubleValue == Double.POSITIVE_INFINITY) {
                writeAscii("\"Infinity\"");
                return;
            } else {
                if (doubleValue == Double.NEGATIVE_INFINITY) {
                    writeAscii("\"-Infinity\"");
                    return;
                }
                writeByte((byte) 34);
                NumberConverter.serialize(doubleValue, this);
                writeByte((byte) 34);
                return;
            }
        }
        if (!(t instanceof Float)) {
            if (!(t instanceof Number)) {
                writeObject.write(this, t);
                return;
            }
            writeByte((byte) 34);
            writeObject.write(this, t);
            writeByte((byte) 34);
            return;
        }
        float floatValue = ((Float) t).floatValue();
        if (Float.isNaN(floatValue)) {
            writeAscii("\"NaN\"");
            return;
        }
        if (floatValue == Float.POSITIVE_INFINITY) {
            writeAscii("\"Infinity\"");
        } else {
            if (floatValue == Float.NEGATIVE_INFINITY) {
                writeAscii("\"-Infinity\"");
                return;
            }
            writeByte((byte) 34);
            NumberConverter.serialize(floatValue, this);
            writeByte((byte) 34);
        }
    }

    public final void writeRaw(byte[] bArr, int i, int i2) {
        int i3 = this.position;
        if (i3 + i2 >= this.buffer.length) {
            enlargeOrFlush(i3, i2);
        }
        System.arraycopy(bArr, i, this.buffer, this.position, i2);
        this.position += i2;
    }

    public final void writeString(String str) {
        int length = str.length();
        int i = this.position;
        int i2 = length << 2;
        int i3 = length << 1;
        if (i + i2 + i3 + 2 >= this.buffer.length) {
            enlargeOrFlush(i, i2 + i3 + 2);
        }
        byte[] bArr = this.buffer;
        int i4 = this.position;
        bArr[i4] = 34;
        int i5 = i4 + 1;
        int i6 = 0;
        while (i6 < length) {
            char charAt = str.charAt(i6);
            if (charAt <= 31 || charAt == '\"' || charAt == '\\' || charAt >= '~') {
                writeQuotedString(str, i6, i5, length);
                return;
            } else {
                bArr[i5] = (byte) charAt;
                i6++;
                i5++;
            }
        }
        bArr[i5] = 34;
        this.position = i5 + 1;
    }

    public void serializeRaw(@Nullable Collection collection, WriteObject writeObject) {
        serialize(collection, writeObject);
    }

    public void serializeRaw(@Nullable Map map, WriteObject writeObject, WriteObject writeObject2) {
        serialize(map, writeObject, writeObject2);
    }

    public final void reset() {
        reset(null);
    }

    public JsonWriter(@Nullable UnknownSerializer unknownSerializer) {
        this(512, unknownSerializer);
    }

    public JsonWriter(int i, @Nullable UnknownSerializer unknownSerializer) {
        this(new byte[i], unknownSerializer);
    }

    @Deprecated
    public JsonWriter() {
        this(512, (UnknownSerializer) null);
    }

    public final void writeAscii(String str, int i) {
        int i2 = this.position;
        if (i2 + i >= this.buffer.length) {
            enlargeOrFlush(i2, i);
        }
        str.getBytes(0, i, this.buffer, this.position);
        this.position += i;
    }

    public final void writeAscii(String str) {
        int length = str.length();
        int i = this.position;
        if (i + length >= this.buffer.length) {
            enlargeOrFlush(i, length);
        }
        str.getBytes(0, length, this.buffer, this.position);
        this.position += length;
    }

    public final void writeAscii(byte[] bArr, int i) {
        int i2 = this.position;
        if (i2 + i >= this.buffer.length) {
            enlargeOrFlush(i2, i);
        }
        int i3 = this.position;
        byte[] bArr2 = this.buffer;
        for (int i4 = 0; i4 < i; i4++) {
            bArr2[i3 + i4] = bArr[i4];
        }
        this.position += i;
    }

    public final void writeString(CharSequence charSequence) {
        int length = charSequence.length();
        int i = this.position;
        int i2 = length << 2;
        int i3 = length << 1;
        if (i + i2 + i3 + 2 >= this.buffer.length) {
            enlargeOrFlush(i, i2 + i3 + 2);
        }
        byte[] bArr = this.buffer;
        int i4 = this.position;
        bArr[i4] = 34;
        int i5 = i4 + 1;
        int i6 = 0;
        while (i6 < length) {
            char charAt = charSequence.charAt(i6);
            if (charAt > 31 && charAt != '\"' && charAt != '\\' && charAt < '~') {
                bArr[i5] = (byte) charAt;
                i6++;
                i5++;
            } else {
                writeQuotedString(charSequence, i6, i5, length);
                return;
            }
        }
        bArr[i5] = 34;
        this.position = i5 + 1;
    }

    public <T extends JsonObject> void serialize(T[] tArr, int i) {
        writeByte(ARRAY_START);
        if (tArr.length != 0 && i != 0) {
            tArr[0].serialize(this, false);
            for (int i2 = 1; i2 < i; i2++) {
                writeByte(COMMA);
                tArr[i2].serialize(this, false);
            }
        }
        writeByte(ARRAY_END);
    }

    public <T extends JsonObject> void serialize(List<T> list) {
        writeByte(ARRAY_START);
        if (list.size() != 0) {
            list.get(0).serialize(this, false);
            for (int i = 1; i < list.size(); i++) {
                writeByte(COMMA);
                list.get(i).serialize(this, false);
            }
        }
        writeByte(ARRAY_END);
    }

    public <T> void serialize(@Nullable T[] tArr, WriteObject<T> writeObject) {
        if (tArr == null) {
            writeNull();
            return;
        }
        writeByte(ARRAY_START);
        if (tArr.length != 0) {
            T t = tArr[0];
            if (t != null) {
                writeObject.write(this, t);
            } else {
                writeNull();
            }
            for (int i = 1; i < tArr.length; i++) {
                writeByte(COMMA);
                T t2 = tArr[i];
                if (t2 != null) {
                    writeObject.write(this, t2);
                } else {
                    writeNull();
                }
            }
        }
        writeByte(ARRAY_END);
    }

    public <T extends JsonObject> void serialize(T[] tArr) {
        writeByte(ARRAY_START);
        if (tArr.length != 0) {
            tArr[0].serialize(this, false);
            for (int i = 1; i < tArr.length; i++) {
                writeByte(COMMA);
                tArr[i].serialize(this, false);
            }
        }
        writeByte(ARRAY_END);
    }

    public <T> void serialize(@Nullable Collection<T> collection, WriteObject<T> writeObject) {
        if (collection == null) {
            writeNull();
            return;
        }
        writeByte(ARRAY_START);
        if (!collection.isEmpty()) {
            Iterator<T> it2 = collection.iterator();
            T next = it2.next();
            if (next != null) {
                writeObject.write(this, next);
            } else {
                writeNull();
            }
            while (it2.hasNext()) {
                writeByte(COMMA);
                T next2 = it2.next();
                if (next2 != null) {
                    writeObject.write(this, next2);
                } else {
                    writeNull();
                }
            }
        }
        writeByte(ARRAY_END);
    }

    public <K, V> void serialize(@Nullable Map<K, V> map, WriteObject<K> writeObject, WriteObject<V> writeObject2) {
        if (map == null) {
            writeNull();
            return;
        }
        writeByte(OBJECT_START);
        int size = map.size();
        if (size > 0) {
            Iterator<Map.Entry<K, V>> it2 = map.entrySet().iterator();
            Map.Entry<K, V> next = it2.next();
            writeQuoted(writeObject, next.getKey());
            writeByte(SEMI);
            writeObject2.write(this, next.getValue());
            for (int i = 1; i < size; i++) {
                writeByte(COMMA);
                Map.Entry<K, V> next2 = it2.next();
                writeQuoted(writeObject, next2.getKey());
                writeByte(SEMI);
                writeObject2.write(this, next2.getValue());
            }
        }
        writeByte(OBJECT_END);
    }
}
