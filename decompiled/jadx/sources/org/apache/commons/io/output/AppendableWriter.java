package org.apache.commons.io.output;

import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.io.Writer;
import java.lang.Appendable;
import java.util.Objects;
import kotlin.text.Regex$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
public class AppendableWriter<T extends Appendable> extends Writer {
    private final T appendable;

    public AppendableWriter(T t) {
        this.appendable = t;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        this.appendable.append(c);
        return this;
    }

    public T getAppendable() {
        return this.appendable;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        Objects.requireNonNull(cArr, "Character array is missing");
        if (i2 < 0 || i + i2 > cArr.length) {
            StringBuilder sb = new StringBuilder("Array Size=");
            TableInfo$$ExternalSyntheticOutline0.m(sb, cArr.length, ", offset=", i, ", length=");
            Regex$$ExternalSyntheticBUOutline0.m(i2, sb);
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                this.appendable.append(cArr[i + i3]);
            }
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) throws IOException {
        this.appendable.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i, int i2) throws IOException {
        this.appendable.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        this.appendable.append((char) i);
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        Objects.requireNonNull(str, "String is missing");
        this.appendable.append(str, i, i2 + i);
    }
}
