package org.apache.commons.collections4.bag;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okhttp3.HttpUrl;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.set.UnmodifiableSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
public abstract class AbstractMapBag<E> implements Bag<E> {
    private transient Map<E, MutableInteger> map;
    private transient int modCount;
    private int size;
    private transient Set<E> uniqueSet;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class BagIterator<E> implements Iterator<E> {
        private final Iterator<Map.Entry<E, MutableInteger>> entryIterator;
        private int itemCount;
        private final int mods;
        private final AbstractMapBag<E> parent;
        private Map.Entry<E, MutableInteger> current = null;
        private boolean canRemove = false;

        public BagIterator(AbstractMapBag<E> abstractMapBag) {
            this.parent = abstractMapBag;
            this.entryIterator = ((AbstractMapBag) abstractMapBag).map.entrySet().iterator();
            this.mods = ((AbstractMapBag) abstractMapBag).modCount;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.itemCount > 0 || this.entryIterator.hasNext();
        }

        @Override // java.util.Iterator
        public E next() {
            if (((AbstractMapBag) this.parent).modCount != this.mods) {
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
            if (((AbstractMapBag) this.parent).modCount != this.mods) {
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
            AbstractMapBag.access$210(this.parent);
            this.canRemove = false;
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

    public AbstractMapBag(Map<E, MutableInteger> map) {
        this.map = map;
    }

    public static /* synthetic */ int access$210(AbstractMapBag abstractMapBag) {
        int i = abstractMapBag.size;
        abstractMapBag.size = i - 1;
        return i;
    }

    @Override // org.apache.commons.collections4.Bag
    public boolean add(E e, int i) {
        this.modCount++;
        if (i > 0) {
            MutableInteger mutableInteger = this.map.get(e);
            this.size += i;
            if (mutableInteger == null) {
                this.map.put(e, new MutableInteger(i));
                return true;
            }
            mutableInteger.value += i;
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it2 = collection.iterator();
        while (true) {
            boolean z = false;
            while (it2.hasNext()) {
                boolean add = add(it2.next());
                if (z || add) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.Collection
    public void clear() {
        this.modCount++;
        this.map.clear();
        this.size = 0;
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    public boolean containsAll(Bag<?> bag) {
        for (Object obj : bag.uniqueSet()) {
            if (getCount(obj) < bag.getCount(obj)) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void doReadObject(Map<E, MutableInteger> map, ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        this.map = map;
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            Object readObject = objectInputStream.readObject();
            int readInt2 = objectInputStream.readInt();
            map.put(readObject, new MutableInteger(readInt2));
            this.size += readInt2;
        }
    }

    public void doWriteObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.writeInt(this.map.size());
        for (Map.Entry<E, MutableInteger> entry : this.map.entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeInt(entry.getValue().value);
        }
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Bag)) {
            return false;
        }
        Bag bag = (Bag) obj;
        if (bag.size() != size()) {
            return false;
        }
        for (E e : this.map.keySet()) {
            if (bag.getCount(e) != getCount(e)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.apache.commons.collections4.Bag
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

    @Override // java.util.Collection
    public int hashCode() {
        int i = 0;
        for (Map.Entry<E, MutableInteger> entry : this.map.entrySet()) {
            E key = entry.getKey();
            i += entry.getValue().value ^ (key == null ? 0 : key.hashCode());
        }
        return i;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    @Override // org.apache.commons.collections4.Bag, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new BagIterator(this);
    }

    @Override // org.apache.commons.collections4.Bag
    public boolean remove(Object obj, int i) {
        MutableInteger mutableInteger = this.map.get(obj);
        if (mutableInteger == null || i <= 0) {
            return false;
        }
        this.modCount++;
        int i2 = mutableInteger.value;
        if (i < i2) {
            mutableInteger.value = i2 - i;
            this.size -= i;
        } else {
            this.map.remove(obj);
            this.size -= mutableInteger.value;
        }
        return true;
    }

    @Override // org.apache.commons.collections4.Bag, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        if (collection == null) {
            return false;
        }
        Iterator<?> it2 = collection.iterator();
        while (true) {
            boolean z = false;
            while (it2.hasNext()) {
                boolean remove = remove(it2.next(), 1);
                if (z || remove) {
                    z = true;
                }
            }
            return z;
        }
    }

    public boolean retainAll(Bag<?> bag) {
        HashBag hashBag = new HashBag();
        for (E e : uniqueSet()) {
            int count = getCount(e);
            int count2 = bag.getCount(e);
            if (1 > count2 || count2 > count) {
                hashBag.add(e, count);
            } else {
                hashBag.add(e, count - count2);
            }
        }
        if (hashBag.isEmpty()) {
            return false;
        }
        return removeAll(hashBag);
    }

    @Override // org.apache.commons.collections4.Bag, java.util.Collection
    public int size() {
        return this.size;
    }

    @Override // java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        int size = size();
        if (tArr.length < size) {
            tArr = (T[]) ((Object[]) DoubleList$$ExternalSyntheticOutline0.m(tArr, size));
        }
        int i = 0;
        for (E e : this.map.keySet()) {
            int count = getCount(e);
            while (count > 0) {
                tArr[i] = e;
                count--;
                i++;
            }
        }
        while (i < tArr.length) {
            tArr[i] = null;
            i++;
        }
        return tArr;
    }

    public String toString() {
        if (size() == 0) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb = new StringBuilder(MarkdownConstants.LEFT_BRACKET);
        Iterator<E> it2 = uniqueSet().iterator();
        while (it2.hasNext()) {
            E next = it2.next();
            sb.append(getCount(next));
            sb.append(AbstractJsonLexerKt.COLON);
            sb.append(next);
            if (it2.hasNext()) {
                sb.append(AbstractJsonLexerKt.COMMA);
            }
        }
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    @Override // org.apache.commons.collections4.Bag
    public Set<E> uniqueSet() {
        if (this.uniqueSet == null) {
            this.uniqueSet = UnmodifiableSet.unmodifiableSet(this.map.keySet());
        }
        return this.uniqueSet;
    }

    public AbstractMapBag() {
    }

    @Override // org.apache.commons.collections4.Bag, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof Bag) {
            return containsAll((Bag<?>) collection);
        }
        return containsAll((Bag<?>) new HashBag(collection));
    }

    @Override // org.apache.commons.collections4.Bag, java.util.Collection
    public boolean add(E e) {
        return add(e, 1);
    }

    @Override // org.apache.commons.collections4.Bag, java.util.Collection
    public boolean remove(Object obj) {
        MutableInteger mutableInteger = this.map.get(obj);
        if (mutableInteger == null) {
            return false;
        }
        this.modCount++;
        this.map.remove(obj);
        this.size -= mutableInteger.value;
        return true;
    }

    @Override // org.apache.commons.collections4.Bag, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        if (collection instanceof Bag) {
            return retainAll((Bag<?>) collection);
        }
        return retainAll((Bag<?>) new HashBag(collection));
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        Object[] objArr = new Object[size()];
        int i = 0;
        for (E e : this.map.keySet()) {
            int count = getCount(e);
            while (count > 0) {
                objArr[i] = e;
                count--;
                i++;
            }
        }
        return objArr;
    }
}
