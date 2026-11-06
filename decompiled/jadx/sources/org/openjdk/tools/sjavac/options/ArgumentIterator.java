package org.openjdk.tools.sjavac.options;

import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class ArgumentIterator implements Iterator<String> {
    private String buffered;
    private String current;
    private Iterator<String> iter;

    public ArgumentIterator(Iterable<String> iterable) {
        this.iter = iterable.iterator();
    }

    private void fillBuffer() {
        if (this.buffered == null && this.iter.hasNext()) {
            this.buffered = this.iter.next();
        }
    }

    public String current() {
        return this.current;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.buffered != null || this.iter.hasNext();
    }

    @Override // java.util.Iterator
    public String next() {
        fillBuffer();
        String str = this.buffered;
        this.current = str;
        this.buffered = null;
        return str;
    }

    public String peek() {
        fillBuffer();
        return this.buffered;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
