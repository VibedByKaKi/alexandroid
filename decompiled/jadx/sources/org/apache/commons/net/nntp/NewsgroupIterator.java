package org.apache.commons.net.nntp;

import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes11.dex */
class NewsgroupIterator implements Iterator<NewsgroupInfo>, Iterable<NewsgroupInfo> {
    private final Iterator<String> stringIterator;

    public NewsgroupIterator(Iterable<String> iterable) {
        this.stringIterator = iterable.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.stringIterator.hasNext();
    }

    @Override // java.util.Iterator
    public NewsgroupInfo next() {
        return NNTPClient.parseNewsgroupListEntry(this.stringIterator.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        this.stringIterator.remove();
    }

    @Override // java.lang.Iterable
    public Iterator<NewsgroupInfo> iterator() {
        return this;
    }
}
