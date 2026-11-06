package org.apache.commons.collections4.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.apache.commons.collections4.Transformer;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public class TransformedCollection<E> extends AbstractCollectionDecorator<E> {
    private static final long serialVersionUID = 8692300188161871514L;
    protected final Transformer<? super E, ? extends E> transformer;

    public TransformedCollection(Collection<E> collection, Transformer<? super E, ? extends E> transformer) {
        super(collection);
        if (transformer != null) {
            this.transformer = transformer;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Transformer must not be null");
            throw null;
        }
    }

    public static <E> TransformedCollection<E> transformedCollection(Collection<E> collection, Transformer<? super E, ? extends E> transformer) {
        TransformedCollection<E> transformedCollection = new TransformedCollection<>(collection, transformer);
        if (collection.size() > 0) {
            Object[] array = collection.toArray();
            collection.clear();
            for (Object obj : array) {
                transformedCollection.decorated().add(transformer.transform(obj));
            }
        }
        return transformedCollection;
    }

    public static <E> TransformedCollection<E> transformingCollection(Collection<E> collection, Transformer<? super E, ? extends E> transformer) {
        return new TransformedCollection<>(collection, transformer);
    }

    @Override // org.apache.commons.collections4.collection.AbstractCollectionDecorator, java.util.Collection, org.apache.commons.collections4.Bag
    public boolean add(E e) {
        return decorated().add(transform((TransformedCollection<E>) e));
    }

    @Override // org.apache.commons.collections4.collection.AbstractCollectionDecorator, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        return decorated().addAll(transform((Collection) collection));
    }

    public Collection<E> transform(Collection<? extends E> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator<? extends E> it2 = collection.iterator();
        while (it2.hasNext()) {
            arrayList.add(transform((TransformedCollection<E>) it2.next()));
        }
        return arrayList;
    }

    public E transform(E e) {
        return this.transformer.transform(e);
    }
}
