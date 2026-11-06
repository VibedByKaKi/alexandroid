package com.amazon.ion.impl;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class _Private_RecyclingStack<T> {
    private final ElementFactory<T> elementFactory;
    private final List<T> elements;
    private int currentIndex = -1;
    private T top = null;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ElementFactory<T> {
        T newElement();
    }

    public _Private_RecyclingStack(int i, ElementFactory<T> elementFactory) {
        this.elements = new ArrayList(i);
        this.elementFactory = elementFactory;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public T peek() {
        return this.top;
    }

    public T pop() {
        T t = this.top;
        int i = this.currentIndex - 1;
        this.currentIndex = i;
        if (i >= 0) {
            this.top = this.elements.get(i);
            return t;
        }
        this.top = null;
        this.currentIndex = -1;
        return t;
    }

    public T push() {
        int i = this.currentIndex + 1;
        this.currentIndex = i;
        if (i >= this.elements.size()) {
            T newElement = this.elementFactory.newElement();
            this.top = newElement;
            this.elements.add(newElement);
        } else {
            this.top = this.elements.get(this.currentIndex);
        }
        return this.top;
    }

    public int size() {
        return this.currentIndex + 1;
    }
}
