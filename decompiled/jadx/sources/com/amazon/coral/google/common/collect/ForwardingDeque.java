package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.annotations.GwtIncompatible;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Deque;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public abstract class ForwardingDeque<E> extends ForwardingQueue<E> implements Deque<E> {
    @Override // java.util.Deque
    public void addFirst(@ParametricNullness E e) {
        delegate().addFirst(e);
    }

    @Override // java.util.Deque
    public void addLast(@ParametricNullness E e) {
        delegate().addLast(e);
    }

    @Override // com.amazon.coral.google.common.collect.ForwardingQueue, com.amazon.coral.google.common.collect.ForwardingCollection, com.amazon.coral.google.common.collect.ForwardingObject
    public abstract Deque<E> delegate();

    @Override // java.util.Deque
    public Iterator<E> descendingIterator() {
        return delegate().descendingIterator();
    }

    @Override // java.util.Deque
    @ParametricNullness
    public E getFirst() {
        return delegate().getFirst();
    }

    @Override // java.util.Deque
    @ParametricNullness
    public E getLast() {
        return delegate().getLast();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean offerFirst(@ParametricNullness E e) {
        return delegate().offerFirst(e);
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean offerLast(@ParametricNullness E e) {
        return delegate().offerLast(e);
    }

    @Override // java.util.Deque
    @CheckForNull
    public E peekFirst() {
        return delegate().peekFirst();
    }

    @Override // java.util.Deque
    @CheckForNull
    public E peekLast() {
        return delegate().peekLast();
    }

    @Override // java.util.Deque
    @CheckForNull
    @CanIgnoreReturnValue
    public E pollFirst() {
        return delegate().pollFirst();
    }

    @Override // java.util.Deque
    @CheckForNull
    @CanIgnoreReturnValue
    public E pollLast() {
        return delegate().pollLast();
    }

    @Override // java.util.Deque
    @ParametricNullness
    @CanIgnoreReturnValue
    public E pop() {
        return delegate().pop();
    }

    @Override // java.util.Deque
    public void push(@ParametricNullness E e) {
        delegate().push(e);
    }

    @Override // java.util.Deque
    @ParametricNullness
    @CanIgnoreReturnValue
    public E removeFirst() {
        return delegate().removeFirst();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean removeFirstOccurrence(@CheckForNull Object obj) {
        return delegate().removeFirstOccurrence(obj);
    }

    @Override // java.util.Deque
    @ParametricNullness
    @CanIgnoreReturnValue
    public E removeLast() {
        return delegate().removeLast();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean removeLastOccurrence(@CheckForNull Object obj) {
        return delegate().removeLastOccurrence(obj);
    }
}
