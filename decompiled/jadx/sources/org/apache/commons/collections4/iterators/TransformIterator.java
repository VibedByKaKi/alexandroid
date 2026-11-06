package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import org.apache.commons.collections4.Transformer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class TransformIterator<I, O> implements Iterator<O> {
    private Iterator<? extends I> iterator;
    private Transformer<? super I, ? extends O> transformer;

    public TransformIterator(Iterator<? extends I> it2, Transformer<? super I, ? extends O> transformer) {
        this.iterator = it2;
        this.transformer = transformer;
    }

    public Iterator<? extends I> getIterator() {
        return this.iterator;
    }

    public Transformer<? super I, ? extends O> getTransformer() {
        return this.transformer;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    @Override // java.util.Iterator
    public O next() {
        return transform(this.iterator.next());
    }

    @Override // java.util.Iterator
    public void remove() {
        this.iterator.remove();
    }

    public void setIterator(Iterator<? extends I> it2) {
        this.iterator = it2;
    }

    public void setTransformer(Transformer<? super I, ? extends O> transformer) {
        this.transformer = transformer;
    }

    public O transform(I i) {
        return this.transformer.transform(i);
    }

    public TransformIterator(Iterator<? extends I> it2) {
        this.iterator = it2;
    }

    public TransformIterator() {
    }
}
