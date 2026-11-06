package org.apache.commons.collections4.multiset;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Iterator;
import java.util.Map;
import org.apache.commons.collections4.MultiSet;
import org.apache.commons.collections4.iterators.AbstractIteratorDecorator;
import org.apache.commons.collections4.multiset.AbstractMultiSet;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class AbstractMapMultiSet<E> extends AbstractMultiSet<E> {
    private transient Map<E, MutableInteger> map;
    private transient int modCount;
    private transient int size;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class EntrySetIterator<E> implements Iterator<MultiSet.Entry<E>> {
        protected final Iterator<Map.Entry<E, MutableInteger>> decorated;
        protected final AbstractMapMultiSet<E> parent;
        protected MultiSet.Entry<E> last = null;
        protected boolean canRemove = false;

        public EntrySetIterator(Iterator<Map.Entry<E, MutableInteger>> it2, AbstractMapMultiSet<E> abstractMapMultiSet) {
            this.decorated = it2;
            this.parent = abstractMapMultiSet;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.decorated.hasNext();
        }

        @Override // java.util.Iterator
        public MultiSet.Entry<E> next() {
            MultiSetEntry multiSetEntry = new MultiSetEntry(this.decorated.next());
            this.last = multiSetEntry;
            this.canRemove = true;
            return multiSetEntry;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.canRemove) {
                Single$$ExternalSyntheticBUOutline0.m$2("Iterator remove() can only be called once after next()");
                return;
            }
            this.decorated.remove();
            this.last = null;
            this.canRemove = false;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MapBasedMultiSetIterator<E> implements Iterator<E> {
        private final Iterator<Map.Entry<E, MutableInteger>> entryIterator;
        private int itemCount;
        private final int mods;
        private final AbstractMapMultiSet<E> parent;
        private Map.Entry<E, MutableInteger> current = null;
        private boolean canRemove = false;

        public MapBasedMultiSetIterator(AbstractMapMultiSet<E> abstractMapMultiSet) {
            this.parent = abstractMapMultiSet;
            this.entryIterator = ((AbstractMapMultiSet) abstractMapMultiSet).map.entrySet().iterator();
            this.mods = ((AbstractMapMultiSet) abstractMapMultiSet).modCount;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.itemCount > 0 || this.entryIterator.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (((AbstractMapMultiSet) this.parent).modCount != this.mods) {
                OnnxMap$$ExternalSyntheticBUOutline0.m9m();
                return null;
            }
            if (this.itemCount == 0) {
                Map.Entry<E, MutableInteger> next = this.entryIterator.next();
                this.current = next;
                this.itemCount = next.getValue().value;
            }
            this.canRemove = true;
            this.itemCount--;
            return this.current.getKey();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (((AbstractMapMultiSet) this.parent).modCount != this.mods) {
                OnnxMap$$ExternalSyntheticBUOutline0.m9m();
                return;
            }
            if (!this.canRemove) {
                Duration$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            MutableInteger value = this.current.getValue();
            int i = value.value;
            if (i > 1) {
                value.value = i - 1;
            } else {
                this.entryIterator.remove();
            }
            AbstractMapMultiSet.access$210(this.parent);
            this.canRemove = false;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MultiSetEntry<E> extends AbstractMultiSet.AbstractEntry<E> {
        protected final Map.Entry<E, MutableInteger> parentEntry;

        public MultiSetEntry(Map.Entry<E, MutableInteger> entry) {
            this.parentEntry = entry;
        }

        @Override // org.apache.commons.collections4.MultiSet.Entry
        public int getCount() {
            return this.parentEntry.getValue().value;
        }

        @Override // org.apache.commons.collections4.MultiSet.Entry
        public E getElement() {
            return this.parentEntry.getKey();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class MutableInteger {
        protected int value;

        public MutableInteger(int i) {
            this.value = i;
        }

        public boolean equals(Object obj) {
            return (obj instanceof MutableInteger) && ((MutableInteger) obj).value == this.value;
        }

        public int hashCode() {
            return this.value;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class UniqueSetIterator<E> extends AbstractIteratorDecorator<E> {
        protected boolean canRemove;
        protected E lastElement;
        protected final AbstractMapMultiSet<E> parent;

        public UniqueSetIterator(Iterator<E> it2, AbstractMapMultiSet<E> abstractMapMultiSet) {
            super(it2);
            this.lastElement = null;
            this.canRemove = false;
            this.parent = abstractMapMultiSet;
        }

        @Override // org.apache.commons.collections4.iterators.AbstractIteratorDecorator, java.util.Iterator
        public E next() {
            E e = (E) super.next();
            this.lastElement = e;
            this.canRemove = true;
            return e;
        }

        @Override // org.apache.commons.collections4.iterators.AbstractUntypedIteratorDecorator, java.util.Iterator
        public void remove() {
            if (!this.canRemove) {
                Single$$ExternalSyntheticBUOutline0.m$2("Iterator remove() can only be called once after next()");
                return;
            }
            int count = this.parent.getCount(this.lastElement);
            super.remove();
            this.parent.remove(this.lastElement, count);
            this.lastElement = null;
            this.canRemove = false;
        }
    }

    public AbstractMapMultiSet(Map<E, MutableInteger> map) {
        this.map = map;
    }

    public static /* synthetic */ int access$210(AbstractMapMultiSet abstractMapMultiSet) {
        int i = abstractMapMultiSet.size;
        abstractMapMultiSet.size = i - 1;
        return i;
    }

    @Override // org.apache.commons.collections4.multiset.AbstractMultiSet, org.apache.commons.collections4.MultiSet
    public int add(E e, int i) {
        if (i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Occurrences must not be negative.");
            return 0;
        }
        MutableInteger mutableInteger = this.map.get(e);
        int i2 = mutableInteger != null ? mutableInteger.value : 0;
        if (i > 0) {
            this.modCount++;
            this.size += i;
            if (mutableInteger == null) {
                this.map.put(e, new MutableInteger(i));
                return i2;
            }
            mutableInteger.value += i;
        }
        return i2;
    }

    @Override // org.apache.commons.collections4.multiset.AbstractMultiSet, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.modCount++;
        this.map.clear();
        this.size = 0;
    }

    @Override // org.apache.commons.collections4.multiset.AbstractMultiSet, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // org.apache.commons.collections4.multiset.AbstractMultiSet
    public Iterator<MultiSet.Entry<E>> createEntrySetIterator() {
        return new EntrySetIterator(this.map.entrySet().iterator(), this);
    }

    @Override // org.apache.commons.collections4.multiset.AbstractMultiSet
    public Iterator<E> createUniqueSetIterator() {
        return new UniqueSetIterator(getMap().keySet().iterator(), this);
    }

    @Override // org.apache.commons.collections4.multiset.AbstractMultiSet
    public void doReadObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            Object readObject = objectInputStream.readObject();
            int readInt2 = objectInputStream.readInt();
            this.map.put(readObject, new MutableInteger(readInt2));
            this.size += readInt2;
        }
    }

    @Override // org.apache.commons.collections4.multiset.AbstractMultiSet
    public void doWriteObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.map.size());
        for (Map.Entry<E, MutableInteger> entry : this.map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().value);
        }
    }

    @Override // org.apache.commons.collections4.multiset.AbstractMultiSet, java.util.Collection, org.apache.commons.collections4.MultiSet
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MultiSet)) {
            return false;
        }
        MultiSet multiSet = (MultiSet) obj;
        if (multiSet.size() != size()) {
            return false;
        }
        for (E e : this.map.keySet()) {
            if (multiSet.getCount(e) != getCount(e)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.commons.collections4.multiset.AbstractMultiSet, org.apache.commons.collections4.MultiSet
    public int getCount(Object obj) {
        MutableInteger mutableInteger = this.map.get(obj);
        if (mutableInteger != null) {
            return mutableInteger.value;
        }
        return 0;
    }

    public Map<E, MutableInteger> getMap() {
        return this.map;
    }

    @Override // org.apache.commons.collections4.multiset.AbstractMultiSet, java.util.Collection, org.apache.commons.collections4.MultiSet
    public int hashCode() {
        int i = 0;
        for (Map.Entry<E, MutableInteger> entry : this.map.entrySet()) {
            E key = entry.getKey();
            i += entry.getValue().value ^ (key == null ? 0 : key.hashCode());
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // org.apache.commons.collections4.multiset.AbstractMultiSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, org.apache.commons.collections4.MultiSet
    public Iterator<E> iterator() {
        return new MapBasedMultiSetIterator(this);
    }

    @Override // org.apache.commons.collections4.multiset.AbstractMultiSet, org.apache.commons.collections4.MultiSet
    public int remove(Object obj, int i) {
        if (i < 0) {
            Single$$ExternalSyntheticBUOutline0.m$3("Occurrences must not be negative.");
            return 0;
        }
        MutableInteger mutableInteger = this.map.get(obj);
        if (mutableInteger == null) {
            return 0;
        }
        int i2 = mutableInteger.value;
        if (i > 0) {
            this.modCount++;
            if (i < i2) {
                mutableInteger.value = i2 - i;
                this.size -= i;
                return i2;
            }
            this.map.remove(obj);
            this.size -= mutableInteger.value;
            mutableInteger.value = 0;
        }
        return i2;
    }

    public void setMap(Map<E, MutableInteger> map) {
        this.map = map;
    }

    @Override // org.apache.commons.collections4.multiset.AbstractMultiSet, java.util.AbstractCollection, java.util.Collection, org.apache.commons.collections4.MultiSet
    public int size() {
        return this.size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) ((Object[]) DoubleList$$ExternalSyntheticOutline0.m(tArr, size));
        }
        int i = 0;
        for (Map.Entry<E, MutableInteger> entry : this.map.entrySet()) {
            E key = entry.getKey();
            int i2 = entry.getValue().value;
            while (i2 > 0) {
                tArr[i] = key;
                i2--;
                i++;
            }
        }
        while (i < tArr.length) {
            tArr[i] = null;
            i++;
        }
        return tArr;
    }

    @Override // org.apache.commons.collections4.multiset.AbstractMultiSet
    public int uniqueElements() {
        return this.map.size();
    }

    public AbstractMapMultiSet() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        int i = 0;
        for (Map.Entry<E, MutableInteger> entry : this.map.entrySet()) {
            E key = entry.getKey();
            int i2 = entry.getValue().value;
            while (i2 > 0) {
                objArr[i] = key;
                i2--;
                i++;
            }
        }
        return objArr;
    }
}
