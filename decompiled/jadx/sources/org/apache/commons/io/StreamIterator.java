package org.apache.commons.io;

import java.io.Closeable;
import java.util.Iterator;
import java.util.Objects;
import java.util.stream.Stream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes10.dex */
class StreamIterator<E> implements Iterator<E>, Closeable {
    private final Iterator<E> iterator;
    private final Stream<E> stream;

    private StreamIterator(Stream<E> stream) {
        Objects.requireNonNull(stream, "stream");
        this.stream = stream;
        this.iterator = stream.iterator();
    }

    public static <T> Iterator<T> iterator(Stream<T> stream) {
        return new StreamIterator(stream).iterator;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.stream.close();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        boolean hasNext = this.iterator.hasNext();
        if (!hasNext) {
            close();
        }
        return hasNext;
    }

    @Override // java.util.Iterator
    public E next() {
        E next = this.iterator.next();
        if (next == null) {
            close();
        }
        return next;
    }
}
