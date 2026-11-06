package org.apache.commons.collections4.trie;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.coral.org.json.XML$$ExternalSyntheticBUOutline0;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.apache.commons.collections4.OrderedMapIterator;
import org.apache.commons.collections4.trie.AbstractBitwiseTrie;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes9.dex */
abstract class AbstractPatriciaTrie<K, V> extends AbstractBitwiseTrie<K, V> {
    private static final long serialVersionUID = 5155253417231339498L;
    private volatile transient Set<Map.Entry<K, V>> entrySet;
    private volatile transient Set<K> keySet;
    protected transient int modCount;
    private transient TrieEntry<K, V> root;
    private transient int size;
    private volatile transient Collection<V> values;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class KeySet extends AbstractSet<K> {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public class KeyIterator extends AbstractPatriciaTrie<K, V>.TrieIterator<K> {
            private KeyIterator() {
                super();
            }

            @Override // java.util.Iterator
            public K next() {
                return nextEntry().getKey();
            }
        }

        private KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractPatriciaTrie.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return AbstractPatriciaTrie.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new KeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size = size();
            AbstractPatriciaTrie.this.remove(obj);
            return size != size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractPatriciaTrie.this.size();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public final class PrefixRangeEntrySet extends AbstractPatriciaTrie<K, V>.RangeEntrySet {
        private final AbstractPatriciaTrie<K, V>.PrefixRangeMap delegate;
        private int expectedModCount;
        private TrieEntry<K, V> prefixStart;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public final class EntryIterator extends AbstractPatriciaTrie<K, V>.TrieIterator<Map.Entry<K, V>> {
            private boolean lastOne;
            private final int lengthInBits;
            private final int offset;
            private final K prefix;
            private TrieEntry<K, V> subtree;

            public EntryIterator(TrieEntry<K, V> trieEntry, K k, int i, int i2) {
                super();
                this.subtree = trieEntry;
                this.next = AbstractPatriciaTrie.this.followLeft(trieEntry);
                this.prefix = k;
                this.offset = i;
                this.lengthInBits = i2;
            }

            @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator
            public TrieEntry<K, V> findNext(TrieEntry<K, V> trieEntry) {
                return AbstractPatriciaTrie.this.nextEntryInSubtree(trieEntry, this.subtree);
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                TrieEntry<K, V> nextEntry = nextEntry();
                if (this.lastOne) {
                    this.next = null;
                }
                return nextEntry;
            }

            @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator, java.util.Iterator
            public void remove() {
                TrieEntry<K, V> trieEntry = this.subtree;
                int i = trieEntry.bitIndex;
                boolean z = this.current == trieEntry;
                super.remove();
                if (i != this.subtree.bitIndex || z) {
                    this.subtree = AbstractPatriciaTrie.this.subtree(this.prefix, this.offset, this.lengthInBits);
                }
                if (this.lengthInBits >= this.subtree.bitIndex) {
                    this.lastOne = true;
                }
            }
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public final class SingletonIterator implements Iterator<Map.Entry<K, V>> {
            private final TrieEntry<K, V> entry;
            private int hit = 0;

            public SingletonIterator(TrieEntry<K, V> trieEntry) {
                this.entry = trieEntry;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.hit == 0;
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                int i = this.hit;
                if (i == 0) {
                    this.hit = i + 1;
                    return this.entry;
                }
                Single$$ExternalSyntheticBUOutline0.m();
                return null;
            }

            @Override // java.util.Iterator
            public void remove() {
                int i = this.hit;
                if (i != 1) {
                    Duration$$ExternalSyntheticBUOutline0.m$1();
                } else {
                    this.hit = i + 1;
                    AbstractPatriciaTrie.this.removeEntry(this.entry);
                }
            }
        }

        public PrefixRangeEntrySet(AbstractPatriciaTrie<K, V>.PrefixRangeMap prefixRangeMap) {
            super(prefixRangeMap);
            this.expectedModCount = 0;
            this.delegate = prefixRangeMap;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            AbstractPatriciaTrie abstractPatriciaTrie = AbstractPatriciaTrie.this;
            if (abstractPatriciaTrie.modCount != this.expectedModCount) {
                this.prefixStart = abstractPatriciaTrie.subtree(((PrefixRangeMap) this.delegate).prefix, ((PrefixRangeMap) this.delegate).offsetInBits, ((PrefixRangeMap) this.delegate).lengthInBits);
                this.expectedModCount = AbstractPatriciaTrie.this.modCount;
            }
            if (this.prefixStart == null) {
                return Collections.EMPTY_SET.iterator();
            }
            int i = ((PrefixRangeMap) this.delegate).lengthInBits;
            TrieEntry<K, V> trieEntry = this.prefixStart;
            return i > trieEntry.bitIndex ? new SingletonIterator(trieEntry) : new EntryIterator(trieEntry, ((PrefixRangeMap) this.delegate).prefix, ((PrefixRangeMap) this.delegate).offsetInBits, ((PrefixRangeMap) this.delegate).lengthInBits);
        }

        @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeEntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.delegate.fixup();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class PrefixRangeMap extends AbstractPatriciaTrie<K, V>.RangeMap {
        private transient int expectedModCount;
        private K fromKey;
        private final int lengthInBits;
        private final int offsetInBits;
        private final K prefix;
        private int size;
        private K toKey;

        private PrefixRangeMap(K k, int i, int i2) {
            super();
            this.fromKey = null;
            this.toKey = null;
            this.expectedModCount = 0;
            this.size = -1;
            this.prefix = k;
            this.offsetInBits = i;
            this.lengthInBits = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int fixup() {
            Map.Entry<K, V> entry;
            if (this.size == -1 || AbstractPatriciaTrie.this.modCount != this.expectedModCount) {
                Iterator<Map.Entry<K, V>> it2 = super.entrySet().iterator();
                this.size = 0;
                if (it2.hasNext()) {
                    entry = it2.next();
                    this.size = 1;
                } else {
                    entry = null;
                }
                K key = entry == null ? null : entry.getKey();
                this.fromKey = key;
                if (key != null) {
                    TrieEntry<K, V> previousEntry = AbstractPatriciaTrie.this.previousEntry((TrieEntry) entry);
                    this.fromKey = previousEntry == null ? null : previousEntry.getKey();
                }
                this.toKey = this.fromKey;
                while (it2.hasNext()) {
                    this.size++;
                    entry = it2.next();
                }
                K key2 = entry == null ? null : entry.getKey();
                this.toKey = key2;
                if (key2 != null) {
                    TrieEntry<K, V> nextEntry = AbstractPatriciaTrie.this.nextEntry((TrieEntry) entry);
                    this.toKey = nextEntry != null ? nextEntry.getKey() : null;
                }
                this.expectedModCount = AbstractPatriciaTrie.this.modCount;
            }
            return this.size;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Iterator<Map.Entry<K, V>> it2 = AbstractPatriciaTrie.this.entrySet().iterator();
            Set<K> keySet = keySet();
            while (it2.hasNext()) {
                if (keySet.contains(it2.next().getKey())) {
                    it2.remove();
                }
            }
        }

        @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap
        public Set<Map.Entry<K, V>> createEntrySet() {
            return new PrefixRangeEntrySet(this);
        }

        @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap
        public SortedMap<K, V> createRangeMap(K k, boolean z, K k2, boolean z2) {
            return new RangeEntryMap(k, z, k2, z2);
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            fixup();
            K k = this.fromKey;
            AbstractPatriciaTrie abstractPatriciaTrie = AbstractPatriciaTrie.this;
            TrieEntry<K, V> firstEntry = k == null ? abstractPatriciaTrie.firstEntry() : abstractPatriciaTrie.higherEntry(k);
            K key = firstEntry != null ? firstEntry.getKey() : null;
            if (firstEntry != null && AbstractPatriciaTrie.this.getKeyAnalyzer().isPrefix(this.prefix, this.offsetInBits, this.lengthInBits, key)) {
                return key;
            }
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }

        @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap
        public K getFromKey() {
            return this.fromKey;
        }

        @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap
        public K getToKey() {
            return this.toKey;
        }

        @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap
        public boolean inFromRange(K k, boolean z) {
            return AbstractPatriciaTrie.this.getKeyAnalyzer().isPrefix(this.prefix, this.offsetInBits, this.lengthInBits, k);
        }

        @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap
        public boolean inRange(K k) {
            return AbstractPatriciaTrie.this.getKeyAnalyzer().isPrefix(this.prefix, this.offsetInBits, this.lengthInBits, k);
        }

        @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap
        public boolean inRange2(K k) {
            return inRange(k);
        }

        @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap
        public boolean inToRange(K k, boolean z) {
            return AbstractPatriciaTrie.this.getKeyAnalyzer().isPrefix(this.prefix, this.offsetInBits, this.lengthInBits, k);
        }

        @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap
        public boolean isFromInclusive() {
            return false;
        }

        @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap
        public boolean isToInclusive() {
            return false;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            fixup();
            K k = this.toKey;
            AbstractPatriciaTrie abstractPatriciaTrie = AbstractPatriciaTrie.this;
            TrieEntry<K, V> lastEntry = k == null ? abstractPatriciaTrie.lastEntry() : abstractPatriciaTrie.lowerEntry(k);
            K key = lastEntry != null ? lastEntry.getKey() : null;
            if (lastEntry != null && AbstractPatriciaTrie.this.getKeyAnalyzer().isPrefix(this.prefix, this.offsetInBits, this.lengthInBits, key)) {
                return key;
            }
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class RangeEntrySet extends AbstractSet<Map.Entry<K, V>> {
        private final AbstractPatriciaTrie<K, V>.RangeMap delegate;
        private transient int expectedModCount;
        private transient int size = -1;

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public final class EntryIterator extends AbstractPatriciaTrie<K, V>.TrieIterator<Map.Entry<K, V>> {
            private final K excludedKey;

            private EntryIterator(TrieEntry<K, V> trieEntry, TrieEntry<K, V> trieEntry2) {
                super(trieEntry);
                this.excludedKey = trieEntry2 != null ? trieEntry2.getKey() : null;
            }

            @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator, java.util.Iterator
            public boolean hasNext() {
                TrieEntry<K, V> trieEntry = this.next;
                return (trieEntry == null || AbstractBitwiseTrie.compare(trieEntry.key, this.excludedKey)) ? false : true;
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                TrieEntry<K, V> trieEntry = this.next;
                if (trieEntry != null && !AbstractBitwiseTrie.compare(trieEntry.key, this.excludedKey)) {
                    return nextEntry();
                }
                Single$$ExternalSyntheticBUOutline0.m();
                return null;
            }
        }

        public RangeEntrySet(AbstractPatriciaTrie<K, V>.RangeMap rangeMap) {
            if (rangeMap != null) {
                this.delegate = rangeMap;
            } else {
                Single$$ExternalSyntheticBUOutline0.m$1("delegate");
                throw null;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            TrieEntry<K, V> entry;
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry2 = (Map.Entry) obj;
            Object key = entry2.getKey();
            return this.delegate.inRange(key) && (entry = AbstractPatriciaTrie.this.getEntry(key)) != null && AbstractBitwiseTrie.compare(entry.getValue(), entry2.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return !iterator().hasNext();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            K fromKey = this.delegate.getFromKey();
            K toKey = this.delegate.getToKey();
            AbstractPatriciaTrie abstractPatriciaTrie = AbstractPatriciaTrie.this;
            return new EntryIterator(fromKey == null ? abstractPatriciaTrie.firstEntry() : abstractPatriciaTrie.ceilingEntry(fromKey), toKey != null ? AbstractPatriciaTrie.this.ceilingEntry(toKey) : null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            TrieEntry<K, V> entry;
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry2 = (Map.Entry) obj;
            Object key = entry2.getKey();
            if (!this.delegate.inRange(key) || (entry = AbstractPatriciaTrie.this.getEntry(key)) == null || !AbstractBitwiseTrie.compare(entry.getValue(), entry2.getValue())) {
                return false;
            }
            AbstractPatriciaTrie.this.removeEntry(entry);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            if (this.size == -1 || this.expectedModCount != AbstractPatriciaTrie.this.modCount) {
                this.size = 0;
                Iterator<Map.Entry<K, V>> it2 = iterator();
                while (it2.hasNext()) {
                    this.size++;
                    it2.next();
                }
                this.expectedModCount = AbstractPatriciaTrie.this.modCount;
            }
            return this.size;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public abstract class RangeMap extends AbstractMap<K, V> implements SortedMap<K, V> {
        private volatile transient Set<Map.Entry<K, V>> entrySet;

        private RangeMap() {
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return AbstractPatriciaTrie.this.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            if (inRange(AbstractPatriciaTrie.this.castKey(obj))) {
                return AbstractPatriciaTrie.this.containsKey(obj);
            }
            return false;
        }

        public abstract Set<Map.Entry<K, V>> createEntrySet();

        public abstract SortedMap<K, V> createRangeMap(K k, boolean z, K k2, boolean z2);

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
            if (this.entrySet == null) {
                this.entrySet = createEntrySet();
            }
            return this.entrySet;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            if (inRange(AbstractPatriciaTrie.this.castKey(obj))) {
                return (V) AbstractPatriciaTrie.this.get(obj);
            }
            return null;
        }

        public abstract K getFromKey();

        public abstract K getToKey();

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(K k) {
            if (inRange2(k)) {
                return createRangeMap(getFromKey(), isFromInclusive(), k, isToInclusive());
            }
            Single$$ExternalSyntheticBUOutline0.m$3(DoubleList$$ExternalSyntheticOutline0.m(k, "ToKey is out of range: "));
            return null;
        }

        public boolean inFromRange(K k, boolean z) {
            Object fromKey = getFromKey();
            boolean isFromInclusive = isFromInclusive();
            int compare = AbstractPatriciaTrie.this.getKeyAnalyzer().compare(k, fromKey);
            return (isFromInclusive || z) ? compare >= 0 : compare > 0;
        }

        public boolean inRange(K k) {
            return (getFromKey() == null || inFromRange(k, false)) && (getToKey() == null || inToRange(k, false));
        }

        public boolean inRange2(K k) {
            return (getFromKey() == null || inFromRange(k, false)) && (getToKey() == null || inToRange(k, true));
        }

        public boolean inToRange(K k, boolean z) {
            Object toKey = getToKey();
            boolean isToInclusive = isToInclusive();
            int compare = AbstractPatriciaTrie.this.getKeyAnalyzer().compare(k, toKey);
            return (isToInclusive || z) ? compare <= 0 : compare < 0;
        }

        public abstract boolean isFromInclusive();

        public abstract boolean isToInclusive();

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k, V v) {
            if (inRange(k)) {
                return (V) AbstractPatriciaTrie.this.put(k, v);
            }
            Single$$ExternalSyntheticBUOutline0.m$3(DoubleList$$ExternalSyntheticOutline0.m(k, "Key is out of range: "));
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            if (inRange(AbstractPatriciaTrie.this.castKey(obj))) {
                return (V) AbstractPatriciaTrie.this.remove(obj);
            }
            return null;
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(K k, K k2) {
            if (!inRange2(k)) {
                Single$$ExternalSyntheticBUOutline0.m$3(DoubleList$$ExternalSyntheticOutline0.m(k, "FromKey is out of range: "));
                return null;
            }
            if (inRange2(k2)) {
                return createRangeMap(k, isFromInclusive(), k2, isToInclusive());
            }
            Single$$ExternalSyntheticBUOutline0.m$3(DoubleList$$ExternalSyntheticOutline0.m(k2, "ToKey is out of range: "));
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(K k) {
            if (inRange2(k)) {
                return createRangeMap(k, isFromInclusive(), getToKey(), isToInclusive());
            }
            Single$$ExternalSyntheticBUOutline0.m$3(DoubleList$$ExternalSyntheticOutline0.m(k, "FromKey is out of range: "));
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Reference<E> {
        private E item;

        private Reference() {
        }

        public E get() {
            return this.item;
        }

        public void set(E e) {
            this.item = e;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class TrieEntry<K, V> extends AbstractBitwiseTrie.BasicEntry<K, V> {
        private static final long serialVersionUID = 4596023148184140013L;
        protected int bitIndex;
        protected TrieEntry<K, V> left;
        protected TrieEntry<K, V> parent;
        protected TrieEntry<K, V> predecessor;
        protected TrieEntry<K, V> right;

        public TrieEntry(K k, V v, int i) {
            super(k, v);
            this.bitIndex = i;
            this.parent = null;
            this.left = this;
            this.right = null;
            this.predecessor = this;
        }

        public boolean isEmpty() {
            return this.key == null;
        }

        public boolean isExternalNode() {
            return !isInternalNode();
        }

        public boolean isInternalNode() {
            return (this.left == this || this.right == this) ? false : true;
        }

        @Override // org.apache.commons.collections4.trie.AbstractBitwiseTrie.BasicEntry
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (this.bitIndex == -1) {
                sb.append("RootEntry(");
            } else {
                sb.append("Entry(");
            }
            sb.append("key=");
            sb.append(getKey());
            sb.append(" [");
            sb.append(this.bitIndex);
            sb.append("], value=");
            sb.append(getValue());
            sb.append(", ");
            TrieEntry<K, V> trieEntry = this.parent;
            if (trieEntry == null) {
                sb.append("parent=null");
            } else if (trieEntry.bitIndex == -1) {
                sb.append("parent=ROOT");
            } else {
                sb.append("parent=");
                sb.append(this.parent.getKey());
                sb.append(" [");
                sb.append(this.parent.bitIndex);
                sb.append(MarkdownConstants.RIGHT_BRACKET);
            }
            sb.append(", ");
            TrieEntry<K, V> trieEntry2 = this.left;
            if (trieEntry2 == null) {
                sb.append("left=null");
            } else if (trieEntry2.bitIndex == -1) {
                sb.append("left=ROOT");
            } else {
                sb.append("left=");
                sb.append(this.left.getKey());
                sb.append(" [");
                sb.append(this.left.bitIndex);
                sb.append(MarkdownConstants.RIGHT_BRACKET);
            }
            sb.append(", ");
            TrieEntry<K, V> trieEntry3 = this.right;
            if (trieEntry3 == null) {
                sb.append("right=null");
            } else if (trieEntry3.bitIndex == -1) {
                sb.append("right=ROOT");
            } else {
                sb.append("right=");
                sb.append(this.right.getKey());
                sb.append(" [");
                sb.append(this.right.bitIndex);
                sb.append(MarkdownConstants.RIGHT_BRACKET);
            }
            sb.append(", ");
            TrieEntry<K, V> trieEntry4 = this.predecessor;
            if (trieEntry4 != null) {
                if (trieEntry4.bitIndex == -1) {
                    sb.append("predecessor=ROOT");
                } else {
                    sb.append("predecessor=");
                    sb.append(this.predecessor.getKey());
                    sb.append(" [");
                    sb.append(this.predecessor.bitIndex);
                    sb.append(MarkdownConstants.RIGHT_BRACKET);
                }
            }
            sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
            return sb.toString();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class TrieMapIterator extends AbstractPatriciaTrie<K, V>.TrieIterator<K> implements OrderedMapIterator<K, V> {
        protected TrieEntry<K, V> previous;

        private TrieMapIterator() {
            super();
        }

        @Override // org.apache.commons.collections4.MapIterator
        public K getKey() {
            TrieEntry<K, V> trieEntry = this.current;
            if (trieEntry != null) {
                return trieEntry.getKey();
            }
            Duration$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }

        @Override // org.apache.commons.collections4.MapIterator
        public V getValue() {
            TrieEntry<K, V> trieEntry = this.current;
            if (trieEntry != null) {
                return trieEntry.getValue();
            }
            Duration$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }

        @Override // org.apache.commons.collections4.OrderedMapIterator, org.apache.commons.collections4.OrderedIterator
        public boolean hasPrevious() {
            return this.previous != null;
        }

        @Override // java.util.Iterator, org.apache.commons.collections4.MapIterator
        public K next() {
            return nextEntry().getKey();
        }

        @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.TrieIterator
        public TrieEntry<K, V> nextEntry() {
            TrieEntry<K, V> nextEntry = super.nextEntry();
            this.previous = nextEntry;
            return nextEntry;
        }

        @Override // org.apache.commons.collections4.OrderedMapIterator, org.apache.commons.collections4.OrderedIterator
        public K previous() {
            return previousEntry().getKey();
        }

        public TrieEntry<K, V> previousEntry() {
            int i = this.expectedModCount;
            AbstractPatriciaTrie abstractPatriciaTrie = AbstractPatriciaTrie.this;
            if (i != abstractPatriciaTrie.modCount) {
                OnnxMap$$ExternalSyntheticBUOutline0.m9m();
                return null;
            }
            TrieEntry<K, V> trieEntry = this.previous;
            if (trieEntry == null) {
                Single$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            this.previous = abstractPatriciaTrie.previousEntry(trieEntry);
            this.next = this.current;
            this.current = trieEntry;
            return trieEntry;
        }

        @Override // org.apache.commons.collections4.MapIterator
        public V setValue(V v) {
            TrieEntry<K, V> trieEntry = this.current;
            if (trieEntry != null) {
                return trieEntry.setValue(v);
            }
            Duration$$ExternalSyntheticBUOutline0.m$1();
            return null;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class Values extends AbstractCollection<V> {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public class ValueIterator extends AbstractPatriciaTrie<K, V>.TrieIterator<V> {
            private ValueIterator() {
                super();
            }

            @Override // java.util.Iterator
            public V next() {
                return nextEntry().getValue();
            }
        }

        private Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractPatriciaTrie.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractPatriciaTrie.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new ValueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            Iterator<V> it2 = iterator();
            while (it2.hasNext()) {
                if (AbstractBitwiseTrie.compare(it2.next(), obj)) {
                    it2.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractPatriciaTrie.this.size();
        }
    }

    public AbstractPatriciaTrie(KeyAnalyzer<? super K> keyAnalyzer, Map<? extends K, ? extends V> map) {
        super(keyAnalyzer);
        this.root = new TrieEntry<>(null, null, -1);
        this.size = 0;
        this.modCount = 0;
        putAll(map);
    }

    private SortedMap<K, V> getPrefixMapByBits(K k, int i, int i2) {
        int i3 = i + i2;
        if (i3 <= lengthInBits(k)) {
            return i3 == 0 ? this : new PrefixRangeMap(k, i, i2);
        }
        throw new IllegalArgumentException(i + " + " + i2 + " > " + lengthInBits(k));
    }

    private void incrementModCount() {
        this.modCount++;
    }

    public static boolean isValidUplink(TrieEntry<?, ?> trieEntry, TrieEntry<?, ?> trieEntry2) {
        return (trieEntry == null || trieEntry.bitIndex > trieEntry2.bitIndex || trieEntry.isEmpty()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.root = new TrieEntry<>(null, null, -1);
        int readInt = objectInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void removeExternalEntry(TrieEntry<K, V> trieEntry) {
        if (trieEntry == this.root) {
            Single$$ExternalSyntheticBUOutline0.m$3("Cannot delete root Entry!");
            return;
        }
        if (!trieEntry.isExternalNode()) {
            XML$$ExternalSyntheticBUOutline0.m(trieEntry, " is not an external Entry!");
            return;
        }
        TrieEntry<K, V> trieEntry2 = trieEntry.parent;
        TrieEntry<K, V> trieEntry3 = trieEntry.left;
        if (trieEntry3 == trieEntry) {
            trieEntry3 = trieEntry.right;
        }
        if (trieEntry2.left == trieEntry) {
            trieEntry2.left = trieEntry3;
        } else {
            trieEntry2.right = trieEntry3;
        }
        if (trieEntry3.bitIndex > trieEntry2.bitIndex) {
            trieEntry3.parent = trieEntry2;
        } else {
            trieEntry3.predecessor = trieEntry2;
        }
    }

    private void removeInternalEntry(TrieEntry<K, V> trieEntry) {
        if (trieEntry == this.root) {
            Single$$ExternalSyntheticBUOutline0.m$3("Cannot delete root Entry!");
            return;
        }
        if (!trieEntry.isInternalNode()) {
            XML$$ExternalSyntheticBUOutline0.m(trieEntry, " is not an internal Entry!");
            return;
        }
        TrieEntry<K, V> trieEntry2 = trieEntry.predecessor;
        trieEntry2.bitIndex = trieEntry.bitIndex;
        TrieEntry<K, V> trieEntry3 = trieEntry2.parent;
        TrieEntry<K, V> trieEntry4 = trieEntry2.left;
        if (trieEntry4 == trieEntry) {
            trieEntry4 = trieEntry2.right;
        }
        if (trieEntry2.predecessor == trieEntry2 && trieEntry3 != trieEntry) {
            trieEntry2.predecessor = trieEntry3;
        }
        if (trieEntry3.left == trieEntry2) {
            trieEntry3.left = trieEntry4;
        } else {
            trieEntry3.right = trieEntry4;
        }
        if (trieEntry4.bitIndex > trieEntry3.bitIndex) {
            trieEntry4.parent = trieEntry3;
        }
        TrieEntry<K, V> trieEntry5 = trieEntry.left;
        if (trieEntry5.parent == trieEntry) {
            trieEntry5.parent = trieEntry2;
        }
        TrieEntry<K, V> trieEntry6 = trieEntry.right;
        if (trieEntry6.parent == trieEntry) {
            trieEntry6.parent = trieEntry2;
        }
        TrieEntry<K, V> trieEntry7 = trieEntry.parent;
        if (trieEntry7.left == trieEntry) {
            trieEntry7.left = trieEntry2;
        } else {
            trieEntry7.right = trieEntry2;
        }
        trieEntry2.parent = trieEntry7;
        TrieEntry<K, V> trieEntry8 = trieEntry.left;
        trieEntry2.left = trieEntry8;
        trieEntry2.right = trieEntry.right;
        if (isValidUplink(trieEntry8, trieEntry2)) {
            trieEntry2.left.predecessor = trieEntry2;
        }
        if (isValidUplink(trieEntry2.right, trieEntry2)) {
            trieEntry2.right.predecessor = trieEntry2;
        }
    }

    private boolean selectR(TrieEntry<K, V> trieEntry, int i, K k, int i2, Reference<Map.Entry<K, V>> reference) {
        int i3 = trieEntry.bitIndex;
        if (i3 <= i) {
            if (trieEntry.isEmpty()) {
                return true;
            }
            reference.set(trieEntry);
            return false;
        }
        if (isBitSet(k, i3, i2)) {
            if (selectR(trieEntry.right, trieEntry.bitIndex, k, i2, reference)) {
                return selectR(trieEntry.left, trieEntry.bitIndex, k, i2, reference);
            }
        } else if (selectR(trieEntry.left, trieEntry.bitIndex, k, i2, reference)) {
            return selectR(trieEntry.right, trieEntry.bitIndex, k, i2, reference);
        }
        return false;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        for (Map.Entry<K, V> entry : entrySet()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    public TrieEntry<K, V> addEntry(TrieEntry<K, V> trieEntry, int i) {
        TrieEntry<K, V> trieEntry2;
        int i2;
        TrieEntry<K, V> trieEntry3 = this.root;
        TrieEntry<K, V> trieEntry4 = trieEntry3.left;
        while (true) {
            TrieEntry<K, V> trieEntry5 = trieEntry4;
            trieEntry2 = trieEntry3;
            trieEntry3 = trieEntry5;
            int i3 = trieEntry3.bitIndex;
            i2 = trieEntry.bitIndex;
            if (i3 >= i2 || i3 <= trieEntry2.bitIndex) {
                break;
            }
            trieEntry4 = !isBitSet(trieEntry.key, i3, i) ? trieEntry3.left : trieEntry3.right;
        }
        trieEntry.predecessor = trieEntry;
        if (isBitSet(trieEntry.key, i2, i)) {
            trieEntry.left = trieEntry3;
            trieEntry.right = trieEntry;
        } else {
            trieEntry.left = trieEntry;
            trieEntry.right = trieEntry3;
        }
        trieEntry.parent = trieEntry2;
        int i4 = trieEntry3.bitIndex;
        if (i4 >= trieEntry.bitIndex) {
            trieEntry3.parent = trieEntry;
        }
        int i5 = trieEntry2.bitIndex;
        if (i4 <= i5) {
            trieEntry3.predecessor = trieEntry;
        }
        if (trieEntry2 == this.root || !isBitSet(trieEntry.key, i5, i)) {
            trieEntry2.left = trieEntry;
            return trieEntry;
        }
        trieEntry2.right = trieEntry;
        return trieEntry;
    }

    public TrieEntry<K, V> ceilingEntry(K k) {
        int lengthInBits = lengthInBits(k);
        if (lengthInBits == 0) {
            return !this.root.isEmpty() ? this.root : firstEntry();
        }
        TrieEntry<K, V> nearestEntryForKey = getNearestEntryForKey(k, lengthInBits);
        if (!compareKeys(k, nearestEntryForKey.key)) {
            int bitIndex = bitIndex(k, nearestEntryForKey.key);
            if (KeyAnalyzer.isValidBitIndex(bitIndex)) {
                TrieEntry<K, V> trieEntry = new TrieEntry<>(k, null, bitIndex);
                addEntry(trieEntry, lengthInBits);
                incrementSize();
                TrieEntry<K, V> nextEntry = nextEntry(trieEntry);
                removeEntry(trieEntry);
                this.modCount -= 2;
                return nextEntry;
            }
            if (KeyAnalyzer.isNullBitKey(bitIndex)) {
                return !this.root.isEmpty() ? this.root : firstEntry();
            }
            if (!KeyAnalyzer.isEqualBitKey(bitIndex)) {
                Single$$ExternalSyntheticBUOutline0.m$2(DoubleList$$ExternalSyntheticOutline0.m(k, "invalid lookup: "));
                return null;
            }
        }
        return nearestEntryForKey;
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.Put
    public void clear() {
        TrieEntry<K, V> trieEntry = this.root;
        trieEntry.key = null;
        trieEntry.bitIndex = -1;
        trieEntry.value = null;
        trieEntry.parent = null;
        trieEntry.left = trieEntry;
        trieEntry.right = null;
        trieEntry.predecessor = trieEntry;
        this.size = 0;
        incrementModCount();
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return getKeyAnalyzer();
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.Get
    public boolean containsKey(Object obj) {
        if (obj == null) {
            return false;
        }
        K castKey = castKey(obj);
        TrieEntry<K, V> nearestEntryForKey = getNearestEntryForKey(castKey, lengthInBits(castKey));
        return !nearestEntryForKey.isEmpty() && compareKeys(castKey, nearestEntryForKey.key);
    }

    public void decrementSize() {
        this.size--;
        incrementModCount();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap, org.apache.commons.collections4.Get
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.entrySet == null) {
            this.entrySet = new EntrySet();
        }
        return this.entrySet;
    }

    public TrieEntry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return followLeft(this.root);
    }

    @Override // java.util.SortedMap, org.apache.commons.collections4.OrderedMap
    public K firstKey() {
        if (size() != 0) {
            return firstEntry().getKey();
        }
        Single$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public TrieEntry<K, V> floorEntry(K k) {
        int lengthInBits = lengthInBits(k);
        if (lengthInBits == 0) {
            if (this.root.isEmpty()) {
                return null;
            }
            return this.root;
        }
        TrieEntry<K, V> nearestEntryForKey = getNearestEntryForKey(k, lengthInBits);
        if (!compareKeys(k, nearestEntryForKey.key)) {
            int bitIndex = bitIndex(k, nearestEntryForKey.key);
            if (KeyAnalyzer.isValidBitIndex(bitIndex)) {
                TrieEntry<K, V> trieEntry = new TrieEntry<>(k, null, bitIndex);
                addEntry(trieEntry, lengthInBits);
                incrementSize();
                TrieEntry<K, V> previousEntry = previousEntry(trieEntry);
                removeEntry(trieEntry);
                this.modCount -= 2;
                return previousEntry;
            }
            if (KeyAnalyzer.isNullBitKey(bitIndex)) {
                if (this.root.isEmpty()) {
                    return null;
                }
                return this.root;
            }
            if (!KeyAnalyzer.isEqualBitKey(bitIndex)) {
                Single$$ExternalSyntheticBUOutline0.m$2(DoubleList$$ExternalSyntheticOutline0.m(k, "invalid lookup: "));
                return null;
            }
        }
        return nearestEntryForKey;
    }

    public TrieEntry<K, V> followLeft(TrieEntry<K, V> trieEntry) {
        while (true) {
            TrieEntry<K, V> trieEntry2 = trieEntry.left;
            if (trieEntry2.isEmpty()) {
                trieEntry2 = trieEntry.right;
            }
            if (trieEntry2.bitIndex <= trieEntry.bitIndex) {
                return trieEntry2;
            }
            trieEntry = trieEntry2;
        }
    }

    public TrieEntry<K, V> followRight(TrieEntry<K, V> trieEntry) {
        if (trieEntry.right == null) {
            return null;
        }
        while (true) {
            TrieEntry<K, V> trieEntry2 = trieEntry.right;
            if (trieEntry2.bitIndex <= trieEntry.bitIndex) {
                return trieEntry2;
            }
            trieEntry = trieEntry2;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.Get
    public V get(Object obj) {
        TrieEntry<K, V> entry = getEntry(obj);
        if (entry != null) {
            return entry.getValue();
        }
        return null;
    }

    public TrieEntry<K, V> getEntry(Object obj) {
        K castKey = castKey(obj);
        if (castKey == null) {
            return null;
        }
        TrieEntry<K, V> nearestEntryForKey = getNearestEntryForKey(castKey, lengthInBits(castKey));
        if (nearestEntryForKey.isEmpty() || !compareKeys(castKey, nearestEntryForKey.key)) {
            return null;
        }
        return nearestEntryForKey;
    }

    public TrieEntry<K, V> getNearestEntryForKey(K k, int i) {
        TrieEntry<K, V> trieEntry = this.root;
        TrieEntry<K, V> trieEntry2 = trieEntry.left;
        while (true) {
            TrieEntry<K, V> trieEntry3 = trieEntry2;
            TrieEntry<K, V> trieEntry4 = trieEntry;
            trieEntry = trieEntry3;
            int i2 = trieEntry.bitIndex;
            if (i2 <= trieEntry4.bitIndex) {
                return trieEntry;
            }
            trieEntry2 = !isBitSet(k, i2, i) ? trieEntry.left : trieEntry.right;
        }
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(K k) {
        return new RangeEntryMap(this, null, k);
    }

    public TrieEntry<K, V> higherEntry(K k) {
        int lengthInBits = lengthInBits(k);
        if (lengthInBits == 0) {
            if (this.root.isEmpty()) {
                return firstEntry();
            }
            if (size() > 1) {
                return nextEntry(this.root);
            }
            return null;
        }
        TrieEntry<K, V> nearestEntryForKey = getNearestEntryForKey(k, lengthInBits);
        if (compareKeys(k, nearestEntryForKey.key)) {
            return nextEntry(nearestEntryForKey);
        }
        int bitIndex = bitIndex(k, nearestEntryForKey.key);
        if (KeyAnalyzer.isValidBitIndex(bitIndex)) {
            TrieEntry<K, V> trieEntry = new TrieEntry<>(k, null, bitIndex);
            addEntry(trieEntry, lengthInBits);
            incrementSize();
            TrieEntry<K, V> nextEntry = nextEntry(trieEntry);
            removeEntry(trieEntry);
            this.modCount -= 2;
            return nextEntry;
        }
        if (!KeyAnalyzer.isNullBitKey(bitIndex)) {
            if (KeyAnalyzer.isEqualBitKey(bitIndex)) {
                return nextEntry(nearestEntryForKey);
            }
            Single$$ExternalSyntheticBUOutline0.m$2(DoubleList$$ExternalSyntheticOutline0.m(k, "invalid lookup: "));
            return null;
        }
        if (!this.root.isEmpty()) {
            return firstEntry();
        }
        if (size() > 1) {
            return nextEntry(firstEntry());
        }
        return null;
    }

    public void incrementSize() {
        this.size++;
        incrementModCount();
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap, org.apache.commons.collections4.Get
    public Set<K> keySet() {
        if (this.keySet == null) {
            this.keySet = new KeySet();
        }
        return this.keySet;
    }

    public TrieEntry<K, V> lastEntry() {
        return followRight(this.root.left);
    }

    @Override // java.util.SortedMap, org.apache.commons.collections4.OrderedMap
    public K lastKey() {
        TrieEntry<K, V> lastEntry = lastEntry();
        if (lastEntry != null) {
            return lastEntry.getKey();
        }
        Single$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public TrieEntry<K, V> lowerEntry(K k) {
        int lengthInBits = lengthInBits(k);
        if (lengthInBits == 0) {
            return null;
        }
        TrieEntry<K, V> nearestEntryForKey = getNearestEntryForKey(k, lengthInBits);
        if (compareKeys(k, nearestEntryForKey.key)) {
            return previousEntry(nearestEntryForKey);
        }
        int bitIndex = bitIndex(k, nearestEntryForKey.key);
        if (!KeyAnalyzer.isValidBitIndex(bitIndex)) {
            if (KeyAnalyzer.isNullBitKey(bitIndex)) {
                return null;
            }
            if (KeyAnalyzer.isEqualBitKey(bitIndex)) {
                return previousEntry(nearestEntryForKey);
            }
            Single$$ExternalSyntheticBUOutline0.m$2(DoubleList$$ExternalSyntheticOutline0.m(k, "invalid lookup: "));
            return null;
        }
        TrieEntry<K, V> trieEntry = new TrieEntry<>(k, null, bitIndex);
        addEntry(trieEntry, lengthInBits);
        incrementSize();
        TrieEntry<K, V> previousEntry = previousEntry(trieEntry);
        removeEntry(trieEntry);
        this.modCount -= 2;
        return previousEntry;
    }

    @Override // org.apache.commons.collections4.OrderedMap, org.apache.commons.collections4.IterableGet
    public OrderedMapIterator<K, V> mapIterator() {
        return new TrieMapIterator();
    }

    public TrieEntry<K, V> nextEntry(TrieEntry<K, V> trieEntry) {
        return trieEntry == null ? firstEntry() : nextEntryImpl(trieEntry.predecessor, trieEntry, null);
    }

    public TrieEntry<K, V> nextEntryImpl(TrieEntry<K, V> trieEntry, TrieEntry<K, V> trieEntry2, TrieEntry<K, V> trieEntry3) {
        TrieEntry<K, V> trieEntry4;
        TrieEntry<K, V> trieEntry5;
        if (trieEntry2 == null || trieEntry != trieEntry2.predecessor) {
            while (!trieEntry.left.isEmpty() && trieEntry2 != (trieEntry4 = trieEntry.left)) {
                boolean isValidUplink = isValidUplink(trieEntry4, trieEntry);
                trieEntry = trieEntry.left;
                if (isValidUplink) {
                    return trieEntry;
                }
            }
        }
        if (trieEntry.isEmpty() || (trieEntry5 = trieEntry.right) == null) {
            return null;
        }
        if (trieEntry2 != trieEntry5) {
            boolean isValidUplink2 = isValidUplink(trieEntry5, trieEntry);
            TrieEntry<K, V> trieEntry6 = trieEntry.right;
            return isValidUplink2 ? trieEntry6 : nextEntryImpl(trieEntry6, trieEntry2, trieEntry3);
        }
        while (true) {
            TrieEntry<K, V> trieEntry7 = trieEntry.parent;
            TrieEntry<K, V> trieEntry8 = trieEntry7.right;
            if (trieEntry != trieEntry8) {
                if (trieEntry == trieEntry3 || trieEntry8 == null) {
                    return null;
                }
                if (trieEntry2 != trieEntry8 && isValidUplink(trieEntry8, trieEntry7)) {
                    return trieEntry.parent.right;
                }
                TrieEntry<K, V> trieEntry9 = trieEntry.parent;
                TrieEntry<K, V> trieEntry10 = trieEntry9.right;
                if (trieEntry10 == trieEntry9) {
                    return null;
                }
                return nextEntryImpl(trieEntry10, trieEntry2, trieEntry3);
            }
            if (trieEntry == trieEntry3) {
                return null;
            }
            trieEntry = trieEntry7;
        }
    }

    public TrieEntry<K, V> nextEntryInSubtree(TrieEntry<K, V> trieEntry, TrieEntry<K, V> trieEntry2) {
        return trieEntry == null ? firstEntry() : nextEntryImpl(trieEntry.predecessor, trieEntry, trieEntry2);
    }

    @Override // org.apache.commons.collections4.OrderedMap
    public K nextKey(K k) {
        TrieEntry<K, V> nextEntry;
        k.getClass();
        TrieEntry<K, V> entry = getEntry(k);
        if (entry == null || (nextEntry = nextEntry(entry)) == null) {
            return null;
        }
        return nextEntry.getKey();
    }

    @Override // org.apache.commons.collections4.Trie
    public SortedMap<K, V> prefixMap(K k) {
        return getPrefixMapByBits(k, 0, lengthInBits(k));
    }

    public TrieEntry<K, V> previousEntry(TrieEntry<K, V> trieEntry) {
        TrieEntry<K, V> trieEntry2;
        TrieEntry<K, V> trieEntry3 = trieEntry.predecessor;
        if (trieEntry3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("must have come from somewhere!");
            return null;
        }
        if (trieEntry3.right == trieEntry) {
            boolean isValidUplink = isValidUplink(trieEntry3.left, trieEntry3);
            TrieEntry<K, V> trieEntry4 = trieEntry.predecessor;
            return isValidUplink ? trieEntry4.left : followRight(trieEntry4.left);
        }
        while (true) {
            trieEntry2 = trieEntry3.parent;
            if (trieEntry2 == null || trieEntry3 != trieEntry2.left) {
                break;
            }
            trieEntry3 = trieEntry2;
        }
        if (trieEntry2 == null) {
            return null;
        }
        boolean isValidUplink2 = isValidUplink(trieEntry2.left, trieEntry2);
        TrieEntry<K, V> trieEntry5 = trieEntry3.parent;
        if (!isValidUplink2) {
            return followRight(trieEntry5.left);
        }
        TrieEntry<K, V> trieEntry6 = trieEntry5.left;
        TrieEntry<K, V> trieEntry7 = this.root;
        if (trieEntry6 != trieEntry7) {
            return trieEntry6;
        }
        if (trieEntry7.isEmpty()) {
            return null;
        }
        return this.root;
    }

    @Override // org.apache.commons.collections4.OrderedMap
    public K previousKey(K k) {
        TrieEntry<K, V> previousEntry;
        k.getClass();
        TrieEntry<K, V> entry = getEntry(k);
        if (entry == null || (previousEntry = previousEntry(entry)) == null) {
            return null;
        }
        return previousEntry.getKey();
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.Put
    public V put(K k, V v) {
        if (k == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Key cannot be null");
            return null;
        }
        int lengthInBits = lengthInBits(k);
        if (lengthInBits == 0) {
            if (this.root.isEmpty()) {
                incrementSize();
            } else {
                incrementModCount();
            }
            return this.root.setKeyValue(k, v);
        }
        TrieEntry<K, V> nearestEntryForKey = getNearestEntryForKey(k, lengthInBits);
        if (compareKeys(k, nearestEntryForKey.key)) {
            if (nearestEntryForKey.isEmpty()) {
                incrementSize();
            } else {
                incrementModCount();
            }
            return nearestEntryForKey.setKeyValue(k, v);
        }
        int bitIndex = bitIndex(k, nearestEntryForKey.key);
        if (!KeyAnalyzer.isOutOfBoundsIndex(bitIndex)) {
            if (KeyAnalyzer.isValidBitIndex(bitIndex)) {
                addEntry(new TrieEntry<>(k, v, bitIndex), lengthInBits);
                incrementSize();
                return null;
            }
            if (KeyAnalyzer.isNullBitKey(bitIndex)) {
                if (this.root.isEmpty()) {
                    incrementSize();
                } else {
                    incrementModCount();
                }
                return this.root.setKeyValue(k, v);
            }
            if (KeyAnalyzer.isEqualBitKey(bitIndex) && nearestEntryForKey != this.root) {
                incrementModCount();
                return nearestEntryForKey.setKeyValue(k, v);
            }
        }
        throw new IllegalArgumentException("Failed to put: " + k + " -> " + v + ", " + bitIndex);
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.Get
    public V remove(Object obj) {
        if (obj == null) {
            return null;
        }
        K castKey = castKey(obj);
        int lengthInBits = lengthInBits(castKey);
        TrieEntry<K, V> trieEntry = this.root;
        TrieEntry<K, V> trieEntry2 = trieEntry.left;
        while (true) {
            TrieEntry<K, V> trieEntry3 = trieEntry2;
            TrieEntry<K, V> trieEntry4 = trieEntry;
            trieEntry = trieEntry3;
            int i = trieEntry.bitIndex;
            if (i <= trieEntry4.bitIndex) {
                break;
            }
            trieEntry2 = !isBitSet(castKey, i, lengthInBits) ? trieEntry.left : trieEntry.right;
        }
        if (trieEntry.isEmpty() || !compareKeys(castKey, trieEntry.key)) {
            return null;
        }
        return removeEntry(trieEntry);
    }

    public V removeEntry(TrieEntry<K, V> trieEntry) {
        if (trieEntry != this.root) {
            if (trieEntry.isInternalNode()) {
                removeInternalEntry(trieEntry);
            } else {
                removeExternalEntry(trieEntry);
            }
        }
        decrementSize();
        return trieEntry.setKeyValue(null, null);
    }

    public Map.Entry<K, V> select(K k) {
        int lengthInBits = lengthInBits(k);
        Reference<Map.Entry<K, V>> reference = new Reference<>();
        if (selectR(this.root.left, -1, k, lengthInBits, reference)) {
            return null;
        }
        return reference.get();
    }

    public K selectKey(K k) {
        Map.Entry<K, V> select = select(k);
        if (select == null) {
            return null;
        }
        return select.getKey();
    }

    public V selectValue(K k) {
        Map.Entry<K, V> select = select(k);
        if (select == null) {
            return null;
        }
        return select.getValue();
    }

    @Override // java.util.AbstractMap, java.util.Map, org.apache.commons.collections4.Get
    public int size() {
        return this.size;
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(K k, K k2) {
        return new RangeEntryMap(this, k, k2);
    }

    public TrieEntry<K, V> subtree(K k, int i, int i2) {
        TrieEntry<K, V> trieEntry;
        TrieEntry<K, V> trieEntry2 = this.root;
        TrieEntry<K, V> trieEntry3 = trieEntry2.left;
        while (true) {
            TrieEntry<K, V> trieEntry4 = trieEntry3;
            trieEntry = trieEntry2;
            trieEntry2 = trieEntry4;
            int i3 = trieEntry2.bitIndex;
            if (i3 <= trieEntry.bitIndex || i2 <= i3) {
                break;
            }
            trieEntry3 = !isBitSet(k, i3 + i, i + i2) ? trieEntry2.left : trieEntry2.right;
        }
        if (trieEntry2.isEmpty()) {
            trieEntry2 = trieEntry;
        }
        if (trieEntry2.isEmpty()) {
            return null;
        }
        int i4 = i + i2;
        if (trieEntry2 == this.root && lengthInBits(trieEntry2.getKey()) < i4) {
            return null;
        }
        boolean isBitSet = isBitSet(k, i4 - 1, i4);
        K k2 = trieEntry2.key;
        if (isBitSet != isBitSet(k2, i2 - 1, lengthInBits(k2))) {
            return null;
        }
        int bitIndex = getKeyAnalyzer().bitIndex(k, i, i2, trieEntry2.key, 0, lengthInBits(trieEntry2.getKey()));
        if (bitIndex < 0 || bitIndex >= i2) {
            return trieEntry2;
        }
        return null;
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(K k) {
        return new RangeEntryMap(this, k, null);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap, org.apache.commons.collections4.Get
    public Collection<V> values() {
        if (this.values == null) {
            this.values = new Values();
        }
        return this.values;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        private EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractPatriciaTrie.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            TrieEntry<K, V> entry;
            return (obj instanceof Map.Entry) && (entry = AbstractPatriciaTrie.this.getEntry(((Map.Entry) obj).getKey())) != null && entry.equals(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry) || !contains(obj)) {
                return false;
            }
            AbstractPatriciaTrie.this.remove(((Map.Entry) obj).getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractPatriciaTrie.this.size();
        }

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public class EntryIterator extends AbstractPatriciaTrie<K, V>.TrieIterator<Map.Entry<K, V>> {
            private EntryIterator() {
                super();
            }

            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                return nextEntry();
            }
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public abstract class TrieIterator<E> implements Iterator<E> {
        protected TrieEntry<K, V> current;
        protected int expectedModCount;
        protected TrieEntry<K, V> next;

        public TrieIterator() {
            this.expectedModCount = AbstractPatriciaTrie.this.modCount;
            this.next = AbstractPatriciaTrie.this.nextEntry(null);
        }

        public TrieEntry<K, V> findNext(TrieEntry<K, V> trieEntry) {
            return AbstractPatriciaTrie.this.nextEntry(trieEntry);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.next != null;
        }

        public TrieEntry<K, V> nextEntry() {
            if (this.expectedModCount != AbstractPatriciaTrie.this.modCount) {
                OnnxMap$$ExternalSyntheticBUOutline0.m9m();
                return null;
            }
            TrieEntry<K, V> trieEntry = this.next;
            if (trieEntry == null) {
                Single$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            this.next = findNext(trieEntry);
            this.current = trieEntry;
            return trieEntry;
        }

        @Override // java.util.Iterator
        public void remove() {
            TrieEntry<K, V> trieEntry = this.current;
            if (trieEntry == null) {
                Duration$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            int i = this.expectedModCount;
            AbstractPatriciaTrie abstractPatriciaTrie = AbstractPatriciaTrie.this;
            if (i != abstractPatriciaTrie.modCount) {
                OnnxMap$$ExternalSyntheticBUOutline0.m9m();
                return;
            }
            this.current = null;
            abstractPatriciaTrie.removeEntry(trieEntry);
            this.expectedModCount = AbstractPatriciaTrie.this.modCount;
        }

        public TrieIterator(TrieEntry<K, V> trieEntry) {
            this.expectedModCount = AbstractPatriciaTrie.this.modCount;
            this.next = trieEntry;
        }
    }

    public AbstractPatriciaTrie(KeyAnalyzer<? super K> keyAnalyzer) {
        super(keyAnalyzer);
        this.root = new TrieEntry<>(null, null, -1);
        this.size = 0;
        this.modCount = 0;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class RangeEntryMap extends AbstractPatriciaTrie<K, V>.RangeMap {
        private final boolean fromInclusive;
        private final K fromKey;
        private final boolean toInclusive;
        private final K toKey;

        /* JADX WARN: Multi-variable type inference failed */
        public RangeEntryMap(K k, boolean z, K k2, boolean z2) {
            super();
            if (k == 0 && k2 == 0) {
                Single$$ExternalSyntheticBUOutline0.m$3("must have a from or to!");
                throw null;
            }
            if (k != 0 && k2 != 0 && AbstractPatriciaTrie.this.getKeyAnalyzer().compare(k, k2) > 0) {
                Single$$ExternalSyntheticBUOutline0.m$3("fromKey > toKey");
                throw null;
            }
            this.fromKey = k;
            this.fromInclusive = z;
            this.toKey = k2;
            this.toInclusive = z2;
        }

        @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap
        public Set<Map.Entry<K, V>> createEntrySet() {
            return new RangeEntrySet(this);
        }

        @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap
        public SortedMap<K, V> createRangeMap(K k, boolean z, K k2, boolean z2) {
            return new RangeEntryMap(k, z, k2, z2);
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            TrieEntry<K, V> ceilingEntry;
            K k = this.fromKey;
            if (k == null) {
                ceilingEntry = AbstractPatriciaTrie.this.firstEntry();
            } else {
                boolean z = this.fromInclusive;
                AbstractPatriciaTrie abstractPatriciaTrie = AbstractPatriciaTrie.this;
                ceilingEntry = z ? abstractPatriciaTrie.ceilingEntry(k) : abstractPatriciaTrie.higherEntry(k);
            }
            K key = ceilingEntry != null ? ceilingEntry.getKey() : null;
            if (ceilingEntry != null && (this.toKey == null || inToRange(key, false))) {
                return key;
            }
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }

        @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap
        public K getFromKey() {
            return this.fromKey;
        }

        @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap
        public K getToKey() {
            return this.toKey;
        }

        @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap
        public boolean isFromInclusive() {
            return this.fromInclusive;
        }

        @Override // org.apache.commons.collections4.trie.AbstractPatriciaTrie.RangeMap
        public boolean isToInclusive() {
            return this.toInclusive;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            TrieEntry<K, V> floorEntry;
            K k = this.toKey;
            if (k == null) {
                floorEntry = AbstractPatriciaTrie.this.lastEntry();
            } else {
                boolean z = this.toInclusive;
                AbstractPatriciaTrie abstractPatriciaTrie = AbstractPatriciaTrie.this;
                floorEntry = z ? abstractPatriciaTrie.floorEntry(k) : abstractPatriciaTrie.lowerEntry(k);
            }
            K key = floorEntry != null ? floorEntry.getKey() : null;
            if (floorEntry != null && (this.fromKey == null || inFromRange(key, false))) {
                return key;
            }
            Single$$ExternalSyntheticBUOutline0.m();
            return null;
        }

        public RangeEntryMap(AbstractPatriciaTrie abstractPatriciaTrie, K k, K k2) {
            this(k, true, k2, false);
        }
    }
}
