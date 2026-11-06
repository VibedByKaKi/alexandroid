package com.amazon.ion.impl;

import com.amazon.ion.util._Private_FastAppendable;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
final class AppendableFastAppendable implements _Private_FastAppendable, Closeable, Flushable {
    private final Appendable _out;

    public AppendableFastAppendable(Appendable appendable) {
        appendable.getClass();
        this._out = appendable;
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence) throws IOException {
        this._out.append(charSequence);
        return this;
    }

    @Override // com.amazon.ion.util._Private_FastAppendable
    public final void appendAscii(char c) throws IOException {
        this._out.append(c);
    }

    @Override // com.amazon.ion.util._Private_FastAppendable
    public final void appendUtf16(char c) throws IOException {
        this._out.append(c);
    }

    @Override // com.amazon.ion.util._Private_FastAppendable
    public final void appendUtf16Surrogate(char c, char c2) throws IOException {
        this._out.append(c);
        this._out.append(c2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Appendable appendable = this._out;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        Appendable appendable = this._out;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    @Override // java.lang.Appendable
    public Appendable append(char c) throws IOException {
        this._out.append(c);
        return this;
    }

    @Override // com.amazon.ion.util._Private_FastAppendable
    public final void appendAscii(CharSequence charSequence) throws IOException {
        this._out.append(charSequence);
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        this._out.append(charSequence, i, i2);
        return this;
    }

    @Override // com.amazon.ion.util._Private_FastAppendable
    public final void appendAscii(CharSequence charSequence, int i, int i2) throws IOException {
        this._out.append(charSequence, i, i2);
    }
}
