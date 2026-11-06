package com.amazon.ion.impl;

import com.amazon.ion.util._Private_FastAppendable;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class _Private_FastAppendableDecorator implements _Private_FastAppendable, Closeable, Flushable {
    private final _Private_FastAppendable myOutput;

    public _Private_FastAppendableDecorator(_Private_FastAppendable _private_fastappendable) {
        this.myOutput = _private_fastappendable;
    }

    @Override // java.lang.Appendable
    public Appendable append(char c) throws IOException {
        this.myOutput.append(c);
        return this;
    }

    @Override // com.amazon.ion.util._Private_FastAppendable
    public void appendAscii(char c) throws IOException {
        this.myOutput.appendAscii(c);
    }

    @Override // com.amazon.ion.util._Private_FastAppendable
    public void appendUtf16(char c) throws IOException {
        this.myOutput.appendUtf16(c);
    }

    @Override // com.amazon.ion.util._Private_FastAppendable
    public void appendUtf16Surrogate(char c, char c2) throws IOException {
        this.myOutput.appendUtf16Surrogate(c, c2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        _Private_FastAppendable _private_fastappendable = this.myOutput;
        if (_private_fastappendable instanceof Closeable) {
            ((Closeable) _private_fastappendable).close();
        }
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        _Private_FastAppendable _private_fastappendable = this.myOutput;
        if (_private_fastappendable instanceof Flushable) {
            ((Flushable) _private_fastappendable).flush();
        }
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence) throws IOException {
        this.myOutput.append(charSequence);
        return this;
    }

    @Override // com.amazon.ion.util._Private_FastAppendable
    public void appendAscii(CharSequence charSequence) throws IOException {
        this.myOutput.appendAscii(charSequence);
    }

    @Override // java.lang.Appendable
    public Appendable append(CharSequence charSequence, int i, int i2) throws IOException {
        this.myOutput.append(charSequence, i, i2);
        return this;
    }

    @Override // com.amazon.ion.util._Private_FastAppendable
    public void appendAscii(CharSequence charSequence, int i, int i2) throws IOException {
        this.myOutput.appendAscii(charSequence, i, i2);
    }
}
