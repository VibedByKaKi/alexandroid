package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.StandardSystemProperty;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.stream.Stream;
import org.apache.commons.lang3.SystemProperties;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@J2ktIncompatible
@GwtIncompatible
/* loaded from: classes8.dex */
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
        Writer openStream = openStream();
        try {
            openStream.append(charSequence);
            openStream.close();
        } catch (Throwable th) {
            if (openStream != null) {
                try {
                    openStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @CanIgnoreReturnValue
    public long writeFrom(Readable readable) throws IOException {
        Preconditions.checkNotNull(readable);
        Writer openStream = openStream();
        try {
            long copy = CharStreams.copy(readable, openStream);
            if (openStream != null) {
                openStream.close();
            }
            return copy;
        } catch (Throwable th) {
            if (openStream != null) {
                try {
                    openStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public void writeLines(Iterable<? extends CharSequence> iterable, String str) throws IOException {
        writeLines(iterable.iterator(), str);
    }

    @IgnoreJRERequirement
    public void writeLines(Stream<? extends CharSequence> stream) throws IOException {
        writeLines(stream, StandardSystemProperty.LINE_SEPARATOR.value());
    }

    @IgnoreJRERequirement
    public void writeLines(Stream<? extends CharSequence> stream, String str) throws IOException {
        writeLines(stream.iterator(), str);
    }

    public void writeLines(Iterable<? extends CharSequence> iterable) throws IOException {
        writeLines(iterable, System.getProperty(SystemProperties.LINE_SEPARATOR));
    }
}
