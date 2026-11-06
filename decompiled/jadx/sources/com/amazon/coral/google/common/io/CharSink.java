package com.amazon.coral.google.common.io;

import com.amazon.coral.google.common.annotations.Beta;
import com.amazon.coral.google.common.annotations.GwtIncompatible;
import com.amazon.coral.google.common.base.Preconditions;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.stream.Stream;
import org.apache.commons.lang3.SystemProperties;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public abstract class CharSink {
    private void writeLines(Iterator<? extends CharSequence> it2, String str) throws IOException {
        Preconditions.checkNotNull(str);
        Writer openBufferedStream = openBufferedStream();
        while (it2.hasNext()) {
            try {
                openBufferedStream.append(it2.next()).append((CharSequence) str);
            } catch (Throwable th) {
                if (openBufferedStream != null) {
                    try {
                        openBufferedStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (openBufferedStream != null) {
            openBufferedStream.close();
        }
    }

    public Writer openBufferedStream() throws IOException {
        Writer openStream = openStream();
        return openStream instanceof BufferedWriter ? (BufferedWriter) openStream : new BufferedWriter(openStream);
    }

    public abstract Writer openStream() throws IOException;

    public void write(CharSequence charSequence) throws IOException {
        Preconditions.checkNotNull(charSequence);
        try {
            Writer writer = (Writer) Closer.create().register(openStream());
            writer.append(charSequence);
            writer.flush();
        } finally {
        }
    }

    @CanIgnoreReturnValue
    public long writeFrom(Readable readable) throws IOException {
        Preconditions.checkNotNull(readable);
        try {
            Writer writer = (Writer) Closer.create().register(openStream());
            long copy = CharStreams.copy(readable, writer);
            writer.flush();
            return copy;
        } finally {
        }
    }

    public void writeLines(Iterable<? extends CharSequence> iterable, String str) throws IOException {
        writeLines(iterable.iterator(), str);
    }

    @Beta
    public void writeLines(Stream<? extends CharSequence> stream) throws IOException {
        writeLines(stream, System.getProperty(SystemProperties.LINE_SEPARATOR));
    }

    @Beta
    public void writeLines(Stream<? extends CharSequence> stream, String str) throws IOException {
        writeLines(stream.iterator(), str);
    }

    public void writeLines(Iterable<? extends CharSequence> iterable) throws IOException {
        writeLines(iterable, System.getProperty(SystemProperties.LINE_SEPARATOR));
    }
}
