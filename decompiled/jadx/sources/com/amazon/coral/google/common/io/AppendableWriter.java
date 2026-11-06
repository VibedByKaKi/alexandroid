package com.amazon.coral.google.common.io;

import com.amazon.coral.google.common.annotations.GwtIncompatible;
import com.amazon.coral.google.common.base.Preconditions;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import javax.annotation.CheckForNull;
import okio.Buffer$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
class AppendableWriter extends Writer {
    private boolean closed;
    private final Appendable target;

    public AppendableWriter(Appendable appendable) {
        this.target = (Appendable) Preconditions.checkNotNull(appendable);
    }

    private void checkNotClosed() throws IOException {
        if (this.closed) {
            Buffer$$ExternalSyntheticBUOutline0.m$2("Cannot write to a closed writer.");
        }
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c) throws IOException {
        checkNotClosed();
        this.target.append(c);
        return this;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.closed = true;
        Appendable appendable = this.target;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        checkNotClosed();
        Appendable appendable = this.target;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) throws IOException {
        checkNotClosed();
        this.target.append(new String(cArr, i, i2));
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@CheckForNull CharSequence charSequence) throws IOException {
        checkNotClosed();
        this.target.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@CheckForNull CharSequence charSequence, int i, int i2) throws IOException {
        checkNotClosed();
        this.target.append(charSequence, i, i2);
        return this;
    }

    @Override // java.io.Writer
    public void write(int i) throws IOException {
        checkNotClosed();
        this.target.append((char) i);
    }

    @Override // java.io.Writer
    public void write(String str) throws IOException {
        Preconditions.checkNotNull(str);
        checkNotClosed();
        this.target.append(str);
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) throws IOException {
        Preconditions.checkNotNull(str);
        checkNotClosed();
        this.target.append(str, i, i2 + i);
    }
}
