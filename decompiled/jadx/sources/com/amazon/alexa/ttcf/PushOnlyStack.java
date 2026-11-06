package com.amazon.alexa.ttcf;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
class PushOnlyStack<Element> implements Iterable<Element> {
    private int capacity;
    private final Element[] items;
    private int lastStoredIndex = -1;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class StackIterator implements Iterator {
        private final int start;
        private int times = 0;

        public StackIterator() {
            this.start = PushOnlyStack.this.lastStoredIndex;
        }

        private int getEffectiveIndex() {
            int length = PushOnlyStack.this.items.length;
            return ((this.start - this.times) + length) % length;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.times < PushOnlyStack.this.items.length && PushOnlyStack.this.items[getEffectiveIndex()] != null;
        }

        @Override // java.util.Iterator
        @NonNull
        public Element next() {
            int effectiveIndex = getEffectiveIndex();
            this.times++;
            return (Element) PushOnlyStack.this.items[effectiveIndex];
        }
    }

    public PushOnlyStack(int i) {
        this.capacity = i;
        this.items = (Element[]) new Object[i];
    }

    @Override // java.lang.Iterable
    public Iterator<Element> iterator() {
        return new StackIterator();
    }

    @Nullable
    public Element peek() {
        int i = this.lastStoredIndex;
        if (i >= 0) {
            return this.items[i];
        }
        return null;
    }

    public void push(@NonNull Element element) {
        int i = (this.lastStoredIndex + 1) % this.capacity;
        this.lastStoredIndex = i;
        this.items[i] = element;
    }
}
