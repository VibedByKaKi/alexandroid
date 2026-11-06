package org.apache.commons.collections4.list;

import java.util.List;
import java.util.Objects;
import org.apache.commons.collections4.Factory;
import org.apache.commons.collections4.Transformer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class LazyList<E> extends AbstractSerializableListDecorator<E> {
    private static final long serialVersionUID = -3677737457567429713L;
    private final Factory<? extends E> factory;
    private final Transformer<Integer, ? extends E> transformer;

    public LazyList(List<E> list, Factory<? extends E> factory) {
        super(list);
        Objects.requireNonNull(factory);
        this.factory = factory;
        this.transformer = null;
    }

    private E element(int i) {
        Factory<? extends E> factory = this.factory;
        if (factory != null) {
            return factory.create();
        }
        Transformer<Integer, ? extends E> transformer = this.transformer;
        if (transformer != null) {
            return transformer.transform(Integer.valueOf(i));
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Factory and Transformer are both null!");
        return null;
    }

    public static <E> LazyList<E> lazyList(List<E> list, Factory<? extends E> factory) {
        return new LazyList<>(list, factory);
    }

    @Override // org.apache.commons.collections4.list.AbstractListDecorator, java.util.List
    public E get(int i) {
        int size = decorated().size();
        if (i < size) {
            E e = decorated().get(i);
            if (e != null) {
                return e;
            }
            E element = element(i);
            decorated().set(i, element);
            return element;
        }
        while (size < i) {
            decorated().add(null);
            size++;
        }
        E element2 = element(i);
        decorated().add(element2);
        return element2;
    }

    @Override // org.apache.commons.collections4.list.AbstractListDecorator, java.util.List
    public List<E> subList(int i, int i2) {
        List<E> subList = decorated().subList(i, i2);
        Factory<? extends E> factory = this.factory;
        if (factory != null) {
            return new LazyList(subList, factory);
        }
        Transformer<Integer, ? extends E> transformer = this.transformer;
        if (transformer != null) {
            return new LazyList(subList, transformer);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Factory and Transformer are both null!");
        return null;
    }

    public static <E> LazyList<E> lazyList(List<E> list, Transformer<Integer, ? extends E> transformer) {
        return new LazyList<>(list, transformer);
    }

    public LazyList(List<E> list, Transformer<Integer, ? extends E> transformer) {
        super(list);
        this.factory = null;
        Objects.requireNonNull(transformer);
        this.transformer = transformer;
    }
}
