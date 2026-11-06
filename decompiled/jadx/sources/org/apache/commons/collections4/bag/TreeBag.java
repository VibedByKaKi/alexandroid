package org.apache.commons.collections4.bag;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;
import org.apache.commons.collections4.SortedBag;
import org.apache.commons.collections4.bag.AbstractMapBag;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class TreeBag<E> extends AbstractMapBag<E> implements SortedBag<E>, Serializable {
    private static final long serialVersionUID = -7740146511091606676L;

    public TreeBag() {
        super(new TreeMap());
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        super.doReadObject(new TreeMap((Comparator) objectInputStream.readObject()), objectInputStream);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(comparator());
        super.doWriteObject(objectOutputStream);
    }

    @Override // org.apache.commons.collections4.bag.AbstractMapBag, org.apache.commons.collections4.Bag, java.util.Collection
    public boolean add(E e) {
        if (comparator() != null || (e instanceof Comparable)) {
            return super.add(e);
        }
        e.getClass();
        OnnxMap$$ExternalSyntheticBUOutline0.m$1("Objects of type ", e.getClass(), " cannot be added to a naturally ordered TreeBag as it does not implement Comparable");
        return false;
    }

    @Override // org.apache.commons.collections4.SortedBag
    public Comparator<? super E> comparator() {
        return getMap().comparator();
    }

    @Override // org.apache.commons.collections4.SortedBag
    public E first() {
        return getMap().firstKey();
    }

    @Override // org.apache.commons.collections4.bag.AbstractMapBag
    public SortedMap<E, AbstractMapBag.MutableInteger> getMap() {
        return (SortedMap) super.getMap();
    }

    @Override // org.apache.commons.collections4.SortedBag
    public E last() {
        return getMap().lastKey();
    }

    public TreeBag(Comparator<? super E> comparator) {
        super(new TreeMap(comparator));
    }

    public TreeBag(Collection<? extends E> collection) {
        this();
        addAll(collection);
    }
}
