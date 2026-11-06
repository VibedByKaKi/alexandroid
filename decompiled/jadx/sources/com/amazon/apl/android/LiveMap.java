package com.amazon.apl.android;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.apl.android.LiveData;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class LiveMap extends LiveData implements Map<String, Object> {
    private final Map<String, Object> mBackingMap = new HashMap();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class EntrySet extends AbstractSet<Map.Entry<String, Object>> {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public class EntryIterator implements Iterator<Map.Entry<String, Object>> {
            String curr;
            private Iterator<Map.Entry<String, Object>> iterator;

            private EntryIterator() {
                this.iterator = LiveMap.this.mBackingMap.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iterator.hasNext();
            }

            @Override // java.util.Iterator
            public Map.Entry<String, Object> next() {
                Map.Entry<String, Object> next = this.iterator.next();
                this.curr = next.getKey();
                return LiveMap.this.new LiveEntry(next.getKey(), next.getValue());
            }

            @Override // java.util.Iterator
            public void remove() {
                LiveMap.this.remove(this.curr);
            }
        }

        private EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<String, Object>> iterator() {
            return new EntryIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LiveMap.this.size();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class KeySet extends AbstractSet<String> {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public class KeyIterator implements Iterator<String> {
            private Iterator<Map.Entry<String, Object>> iterator;

            private KeyIterator() {
                this.iterator = LiveMap.this.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iterator.hasNext();
            }

            @Override // java.util.Iterator
            public String next() {
                return this.iterator.next().getKey();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.iterator.remove();
            }
        }

        private KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @NonNull
        public Iterator<String> iterator() {
            return new KeyIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LiveMap.this.size();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class ValueCollection extends AbstractCollection<Object> {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public class ValueIterator implements Iterator<Object> {
            private Iterator<Map.Entry<String, Object>> iterator;

            private ValueIterator() {
                this.iterator = LiveMap.this.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.iterator.hasNext();
            }

            @Override // java.util.Iterator
            public Object next() {
                return this.iterator.next().getValue();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.iterator.remove();
            }
        }

        private ValueCollection() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Object> iterator() {
            return new ValueIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return LiveMap.this.size();
        }
    }

    private LiveMap() {
        bind(nCreate());
    }

    public static LiveMap create(Map<String, Object> map) {
        LiveMap liveMap = new LiveMap();
        liveMap.putAll(map);
        return liveMap;
    }

    private static native void nClear(long j);

    private static native long nCreate();

    private static native boolean nEmpty(long j);

    private static native Object nGet(long j, String str);

    private static native boolean nHas(long j, String str);

    private static native boolean nRemove(long j, String str);

    private static native void nSet(long j, String str, Object obj);

    private static native int nSize(long j);

    @Override // com.amazon.apl.android.LiveData
    public boolean applyUpdates(List<LiveData.Update> list) {
        try {
            for (LiveData.Update update : list) {
                if (update.getType().equals("set")) {
                    put(update.getKey(), update.getValue());
                } else {
                    if (!update.getType().equals(BulkOperationType.remove)) {
                        return false;
                    }
                    remove(update.getKey());
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // java.util.Map
    public void clear() {
        this.mBackingMap.clear();
        nClear(getNativeHandle());
    }

    @Override // java.util.Map
    public boolean containsKey(@Nullable Object obj) {
        return this.mBackingMap.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(@Nullable Object obj) {
        return this.mBackingMap.containsValue(obj);
    }

    @Override // java.util.Map
    @NonNull
    public Set<Map.Entry<String, Object>> entrySet() {
        return new EntrySet();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj instanceof LiveMap) {
            return this.mBackingMap.equals(((LiveMap) obj).mBackingMap);
        }
        return false;
    }

    @Override // java.util.Map
    public Object get(@Nullable Object obj) {
        return this.mBackingMap.get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.mBackingMap.hashCode();
    }

    @VisibleForTesting
    public boolean innerEmpty() {
        return nEmpty(getNativeHandle());
    }

    @Nullable
    @VisibleForTesting
    public Object innerGet(String str) {
        return nGet(getNativeHandle(), str);
    }

    @VisibleForTesting
    public boolean innerHas(String str) {
        return nHas(getNativeHandle(), str);
    }

    @VisibleForTesting
    public int innerSize() {
        return nSize(getNativeHandle());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.mBackingMap.isEmpty();
    }

    @Override // java.util.Map
    @NonNull
    public Set<String> keySet() {
        return new KeySet();
    }

    @Override // java.util.Map
    @Nullable
    public Object put(@NonNull String str, @NonNull Object obj) {
        nSet(getNativeHandle(), str, obj);
        return this.mBackingMap.put(str, obj);
    }

    @Override // java.util.Map
    public void putAll(@NonNull Map<? extends String, ? extends Object> map) {
        this.mBackingMap.putAll(map);
        for (Map.Entry<? extends String, ? extends Object> entry : map.entrySet()) {
            nSet(getNativeHandle(), entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    @Nullable
    public Object remove(@Nullable Object obj) {
        nRemove(getNativeHandle(), (String) obj);
        return this.mBackingMap.remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return this.mBackingMap.size();
    }

    @Override // java.util.Map
    @NonNull
    public Collection<Object> values() {
        return new ValueCollection();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class LiveEntry implements Map.Entry<String, Object> {
        private final String mKey;
        private Object mValue;

        public LiveEntry(@NonNull String str, @NonNull Object obj) {
            this.mKey = str;
            this.mValue = obj;
        }

        @Override // java.util.Map.Entry
        public boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return Objects.equals(this.mKey, entry.getKey()) && Objects.equals(this.mValue, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return this.mValue;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return Objects.hash(this.mKey, this.mValue);
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            return LiveMap.this.put(this.mKey, obj);
        }

        @Override // java.util.Map.Entry
        public String getKey() {
            return this.mKey;
        }
    }

    public static LiveMap create() {
        return new LiveMap();
    }
}
