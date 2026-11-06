package com.amazon.coral.google.common.graph;

import com.amazon.coral.google.common.base.Preconditions;
import com.amazon.coral.google.common.collect.AbstractIterator;
import com.amazon.coral.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
abstract class MultiEdgesConnecting<E> extends AbstractSet<E> {
    private final Map<E, ?> outEdgeToNode;
    private final Object targetNode;

    public MultiEdgesConnecting(Map<E, ?> map, Object obj) {
        this.outEdgeToNode = (Map) Preconditions.checkNotNull(map);
        this.targetNode = Preconditions.checkNotNull(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@CheckForNull Object obj) {
        return this.targetNode.equals(this.outEdgeToNode.get(obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public UnmodifiableIterator<E> iterator() {
        final Iterator<Map.Entry<E, ?>> it2 = this.outEdgeToNode.entrySet().iterator();
        return new AbstractIterator<E>() { // from class: com.amazon.coral.google.common.graph.MultiEdgesConnecting.1
            @Override // com.amazon.coral.google.common.collect.AbstractIterator
            @CheckForNull
            public E computeNext() {
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (MultiEdgesConnecting.this.targetNode.equals(entry.getValue())) {
                        return (E) entry.getKey();
                    }
                }
                return endOfData();
            }
        };
    }
}
