package com.amazon.coral.util.reflection;

import com.amazon.clouddrive.extended.model.BulkOperationType;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class ClassHierarchy implements Iterable<Class<?>> {
    private final Class<?> _clazz;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class ClassHierarchyIterator implements Iterator<Class<?>> {
        private final Queue<Class<?>> _classes;

        public ClassHierarchyIterator(Class<?> cls) {
            LinkedList linkedList = new LinkedList();
            this._classes = linkedList;
            linkedList.add(cls);
            linkedList.addAll(Arrays.asList(cls.getInterfaces()));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return !this._classes.isEmpty();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        public Class<?> next() {
            Class<?> remove = this._classes.remove();
            Class<? super Object> superclass = remove.getSuperclass();
            if (superclass != null && !superclass.isInterface()) {
                this._classes.add(superclass);
            }
            return remove;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException(BulkOperationType.remove);
        }
    }

    public ClassHierarchy(Class<?> cls) {
        this._clazz = cls;
    }

    @Override // java.lang.Iterable
    public Iterator<Class<?>> iterator() {
        return new ClassHierarchyIterator(this._clazz);
    }
}
