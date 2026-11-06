package com.google.auto.value.processor;

import autovalue.shaded.com.google.auto.common.MoreTypes;
import autovalue.shaded.com.google.common.base.Equivalence;
import autovalue.shaded.com.google.common.collect.ImmutableList;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.lang.model.type.TypeMirror;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
class TypeMirrorSet extends AbstractSet<TypeMirror> {
    private final Set<Equivalence.Wrapper<TypeMirror>> wrappers = new LinkedHashSet();

    public TypeMirrorSet(Collection<? extends TypeMirror> collection) {
        addAll(collection);
    }

    public static TypeMirrorSet of(TypeMirror... typeMirrorArr) {
        return new TypeMirrorSet(ImmutableList.copyOf(typeMirrorArr));
    }

    private Equivalence.Wrapper<TypeMirror> wrap(TypeMirror typeMirror) {
        return MoreTypes.equivalence().wrap(typeMirror);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(TypeMirror typeMirror) {
        return this.wrappers.add(wrap(typeMirror));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj instanceof TypeMirror) {
            return this.wrappers.contains(wrap((TypeMirror) obj));
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj instanceof TypeMirrorSet) {
            return this.wrappers.equals(((TypeMirrorSet) obj).wrappers);
        }
        return false;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.wrappers.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<TypeMirror> iterator() {
        final Iterator<Equivalence.Wrapper<TypeMirror>> it2 = this.wrappers.iterator();
        return new Iterator<TypeMirror>() { // from class: com.google.auto.value.processor.TypeMirrorSet.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it2.hasNext();
            }

            @Override // java.util.Iterator
            public TypeMirror next() {
                return (TypeMirror) ((Equivalence.Wrapper) it2.next()).get();
            }

            @Override // java.util.Iterator
            public void remove() {
                it2.remove();
            }
        };
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (obj instanceof TypeMirror) {
            return this.wrappers.remove(wrap((TypeMirror) obj));
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.wrappers.size();
    }

    public TypeMirrorSet() {
    }
}
