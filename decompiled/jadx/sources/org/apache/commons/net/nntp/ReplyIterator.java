package org.apache.commons.net.nntp;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.apache.commons.net.io.DotTerminatedMessageReader;
import org.apache.commons.net.io.Util;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class ReplyIterator implements Iterator<String>, Iterable<String> {
    private String line;
    private final BufferedReader reader;
    private Exception savedException;

    public ReplyIterator(BufferedReader bufferedReader, boolean z) throws IOException {
        bufferedReader = z ? new DotTerminatedMessageReader(bufferedReader) : bufferedReader;
        this.reader = bufferedReader;
        String readLine = bufferedReader.readLine();
        this.line = readLine;
        if (readLine == null) {
            Util.closeQuietly(bufferedReader);
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        Exception exc = this.savedException;
        if (exc == null) {
            return this.line != null;
        }
        throw new NoSuchElementException(exc.toString());
    }

    @Override // java.util.Iterator
    public String next() throws NoSuchElementException {
        Exception exc = this.savedException;
        if (exc != null) {
            throw new NoSuchElementException(exc.toString());
        }
        String str = this.line;
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
        try {
            String readLine = this.reader.readLine();
            this.line = readLine;
            if (readLine != null) {
                return str;
            }
            Util.closeQuietly(this.reader);
            return str;
        } catch (IOException e) {
            this.savedException = e;
            Util.closeQuietly(this.reader);
            return str;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return this;
    }

    public ReplyIterator(BufferedReader bufferedReader) throws IOException {
        this(bufferedReader, true);
    }
}
