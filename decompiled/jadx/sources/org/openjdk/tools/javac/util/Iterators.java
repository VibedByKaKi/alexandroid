package org.openjdk.tools.javac.util;

import java.util.Iterator;
import java.util.function.Function;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes12.dex */
public class Iterators {
    private static final Iterator EMPTY = new Iterator() { // from class: org.openjdk.tools.javac.util.Iterators.1
        @Override // java.util.Iterator
        public boolean hasNext() {
            return false;
        }

        @Override // java.util.Iterator
        public Object next() {
            return null;
        }
    };

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class CompoundIterator<I, O> implements Iterator<O> {
        private final Function<I, Iterator<O>> convertor;
        private Iterator<O> currentIterator = Iterators.EMPTY;
        private final Iterator<I> inputs;

        public CompoundIterator(Iterable<I> iterable, Function<I, Iterator<O>> function) {
            this.inputs = iterable.iterator();
            this.convertor = function;
        }

        private void update() {
            while (this.inputs.hasNext()) {
                Iterator<O> it2 = (Iterator) this.convertor.apply(this.inputs.next());
                this.currentIterator = it2;
                if (it2.hasNext()) {
                    return;
                }
            }
            this.currentIterator = null;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            Iterator<O> it2 = this.currentIterator;
            if (it2 != null && !it2.hasNext()) {
                update();
            }
            return this.currentIterator != null;
        }

        @Override // java.util.Iterator
        public O next() {
            if (this.currentIterator != Iterators.EMPTY || hasNext()) {
                return this.currentIterator.next();
            }
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public static <I, O> Iterator<O> createCompoundIterator(Iterable<I> iterable, Function<I, Iterator<O>> function) {
        return new CompoundIterator(iterable, function);
    }
}
