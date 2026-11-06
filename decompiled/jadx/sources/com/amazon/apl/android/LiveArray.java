package com.amazon.apl.android;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.apl.android.LiveData;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import okio.Buffer$$ExternalSyntheticBUOutline0;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class LiveArray extends LiveData implements List<Object> {
    private ArrayList<Object> mBackingArray;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class LiveArrayException extends RuntimeException {
        public LiveArrayException(String str) {
            super(str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class LiveArrayIterator implements ListIterator<Object> {
        int mIndex;

        public LiveArrayIterator(int i) {
            if (i < 0 || i > LiveArray.this.size()) {
                Buffer$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
            this.mIndex = i;
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.mIndex < LiveArray.this.size();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.mIndex > 0;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            if (this.mIndex >= LiveArray.this.size()) {
                Single$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            Object obj = LiveArray.this.get(this.mIndex);
            this.mIndex++;
            return obj;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.mIndex;
        }

        @Override // java.util.ListIterator
        public Object previous() {
            int i = this.mIndex;
            if (i <= 0) {
                Single$$ExternalSyntheticBUOutline0.m();
                return null;
            }
            int i2 = i - 1;
            this.mIndex = i2;
            return LiveArray.this.get(i2);
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.mIndex - 1;
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class LiveArraySubList extends AbstractList<Object> {
        int mFromIndex;
        int mToIndex;

        public LiveArraySubList(int i, int i2) {
            if (i < 0 || i2 > LiveArray.this.size() || i > i2) {
                Buffer$$ExternalSyntheticBUOutline0.m();
                throw null;
            }
            this.mFromIndex = i;
            this.mToIndex = i2;
        }

        @Override // java.util.AbstractList, java.util.List
        public Object get(int i) {
            if (i >= 0 && i < size()) {
                return LiveArray.this.get(this.mFromIndex + i);
            }
            Buffer$$ExternalSyntheticBUOutline0.m();
            return null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.mToIndex - this.mFromIndex;
        }
    }

    private LiveArray() {
        bind(nCreate());
        this.mBackingArray = new ArrayList<>();
    }

    public static LiveArray create(Collection<?> collection) {
        LiveArray liveArray = new LiveArray();
        liveArray.mBackingArray.addAll(collection);
        nPushBackRange(liveArray.getNativeHandle(), collection.toArray());
        return liveArray;
    }

    private static native Object nAt(long j, int i);

    private static native void nClear(long j);

    private static native long nCreate();

    private static native boolean nInsert(long j, int i, Object obj);

    private static native boolean nInsertRange(long j, int i, Object[] objArr);

    private static native void nPushBack(long j, Object obj);

    private static native void nPushBackRange(long j, Object[] objArr);

    private static native boolean nRemove(long j, int i, int i2);

    private static native int nSize(long j);

    private static native boolean nUpdate(long j, int i, Object obj);

    private static native boolean nUpdateRange(long j, int i, Object[] objArr);

    @Override // java.util.List
    public void add(int i, Object obj) {
        this.mBackingArray.add(i, obj);
        if (!nInsert(getNativeHandle(), i, obj)) {
            throw new LiveArrayException(a$$ExternalSyntheticOutline0.m(i, "Insert at index=", " should not fail"));
        }
    }

    @Override // java.util.List
    public boolean addAll(int i, @NonNull Collection<? extends Object> collection) {
        if (!this.mBackingArray.addAll(i, collection)) {
            return false;
        }
        if (nInsertRange(getNativeHandle(), i, collection.toArray())) {
            return true;
        }
        throw new LiveArrayException(a$$ExternalSyntheticOutline0.m(i, "Insert range at index=", " should not fail"));
    }

    @Override // com.amazon.apl.android.LiveData
    public boolean applyUpdates(List<LiveData.Update> list) {
        try {
            for (LiveData.Update update : list) {
                if (update.getType().equals("insert")) {
                    add(update.getIndex(), update.getValue());
                } else if (update.getType().equals(BulkOperationType.remove)) {
                    remove(update.getIndex());
                } else {
                    if (!update.getType().equals("update")) {
                        return false;
                    }
                    set(update.getIndex(), update.getValue());
                }
            }
            return true;
        } catch (LiveArrayException unused) {
            return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        this.mBackingArray.clear();
        nClear(getNativeHandle());
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(@Nullable Object obj) {
        return this.mBackingArray.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(@NonNull Collection<?> collection) {
        return this.mBackingArray.containsAll(collection);
    }

    @Override // java.util.List
    public Object get(int i) {
        return this.mBackingArray.get(i);
    }

    @Override // java.util.List
    public int indexOf(@Nullable Object obj) {
        return this.mBackingArray.indexOf(obj);
    }

    @VisibleForTesting
    public Object innerGet(int i) {
        if (i >= 0 && i < this.mBackingArray.size()) {
            return nAt(getNativeHandle(), i);
        }
        Buffer$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }

    @VisibleForTesting
    public int innerSize() {
        return nSize(getNativeHandle());
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.mBackingArray.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    @NonNull
    public Iterator<Object> iterator() {
        return new LiveArrayIterator(0);
    }

    @Override // java.util.List
    public int lastIndexOf(@Nullable Object obj) {
        return this.mBackingArray.lastIndexOf(obj);
    }

    @Override // java.util.List
    @NonNull
    public ListIterator<Object> listIterator() {
        return new LiveArrayIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(@Nullable Object obj) {
        int indexOf = this.mBackingArray.indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        this.mBackingArray.remove(indexOf);
        if (nRemove(getNativeHandle(), indexOf, 1)) {
            return true;
        }
        throw new LiveArrayException(a$$ExternalSyntheticOutline0.m(indexOf, "Illegal remove of element by value at index="));
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(@NonNull Collection<?> collection) {
        Iterator<?> it2 = collection.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            while (remove(it2.next())) {
                z = true;
            }
        }
        return z;
    }

    public void removeRange(int i, int i2) {
        if (i < 0 || i2 <= 0 || i + i2 > this.mBackingArray.size()) {
            Buffer$$ExternalSyntheticBUOutline0.m();
            return;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            this.mBackingArray.remove(i);
        }
        if (!nRemove(getNativeHandle(), i, i2)) {
            throw new LiveArrayException(a$$ExternalSyntheticOutline0.m("Unexpected removeRange position=", i, " count=", i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(@NonNull Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public Object set(int i, Object obj) {
        Object obj2 = this.mBackingArray.set(i, obj);
        if (nUpdate(getNativeHandle(), i, obj)) {
            return obj2;
        }
        throw new LiveArrayException(a$$ExternalSyntheticOutline0.m(i, "Illegal set at index="));
    }

    public void setRange(int i, @NonNull Collection<?> collection) {
        Object[] array = collection.toArray();
        if (i < 0 || array.length + i > this.mBackingArray.size()) {
            Buffer$$ExternalSyntheticBUOutline0.m();
            return;
        }
        if (array.length > 0) {
            for (int i2 = 0; i2 < array.length; i2++) {
                this.mBackingArray.set(i + i2, array[i2]);
            }
            if (!nUpdateRange(getNativeHandle(), i, array)) {
                throw new LiveArrayException(a$$ExternalSyntheticOutline0.m(i, "Unexpected update range error position="));
            }
        }
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.mBackingArray.size();
    }

    @Override // java.util.List
    @NonNull
    public List<Object> subList(int i, int i2) {
        return new LiveArraySubList(i, i2);
    }

    @Override // java.util.List, java.util.Collection
    @Nullable
    public Object[] toArray() {
        return this.mBackingArray.toArray();
    }

    @Override // java.util.List
    @NonNull
    public ListIterator<Object> listIterator(int i) {
        return new LiveArrayIterator(i);
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(@Nullable T[] tArr) {
        return (T[]) this.mBackingArray.toArray(tArr);
    }

    public static LiveArray create(Object[] objArr) {
        LiveArray liveArray = new LiveArray();
        Collections.addAll(liveArray.mBackingArray, objArr);
        nPushBackRange(liveArray.getNativeHandle(), objArr);
        return liveArray;
    }

    public static LiveArray create() {
        return new LiveArray();
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        this.mBackingArray.add(obj);
        nPushBack(getNativeHandle(), obj);
        return true;
    }

    @Override // java.util.List
    @NonNull
    public Object remove(int i) {
        Object remove = this.mBackingArray.remove(i);
        if (nRemove(getNativeHandle(), i, 1)) {
            return remove;
        }
        throw new LiveArrayException(a$$ExternalSyntheticOutline0.m(i, "Illegal remove at index="));
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(@NonNull Collection<?> collection) {
        if (!this.mBackingArray.addAll(collection)) {
            return false;
        }
        nPushBackRange(getNativeHandle(), collection.toArray());
        return true;
    }
}
