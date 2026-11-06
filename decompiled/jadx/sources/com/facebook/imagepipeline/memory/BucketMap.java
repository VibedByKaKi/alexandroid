package com.facebook.imagepipeline.memory;

import android.util.SparseArray;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.infer.annotation.ThreadSafe;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.LinkedList;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
@ThreadSafe
/* loaded from: classes6.dex */
public class BucketMap<T> {

    @Nullable
    @VisibleForTesting
    LinkedEntry<T> mHead;
    protected final SparseArray<LinkedEntry<T>> mMap = new SparseArray<>();

    @Nullable
    @VisibleForTesting
    LinkedEntry<T> mTail;

    private void maybePrune(LinkedEntry<T> linkedEntry) {
        if (linkedEntry == null || !linkedEntry.value.isEmpty()) {
            return;
        }
        prune(linkedEntry);
        this.mMap.remove(linkedEntry.key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void moveToFront(LinkedEntry<T> linkedEntry) {
        if (this.mHead == linkedEntry) {
            return;
        }
        prune(linkedEntry);
        LinkedEntry<T> linkedEntry2 = this.mHead;
        if (linkedEntry2 == 0) {
            this.mHead = linkedEntry;
            this.mTail = linkedEntry;
        } else {
            linkedEntry.next = linkedEntry2;
            linkedEntry2.prev = linkedEntry;
            this.mHead = linkedEntry;
        }
    }

    private synchronized void prune(LinkedEntry<T> linkedEntry) {
        try {
            LinkedEntry linkedEntry2 = (LinkedEntry<T>) linkedEntry.prev;
            LinkedEntry linkedEntry3 = (LinkedEntry<T>) linkedEntry.next;
            if (linkedEntry2 != null) {
                linkedEntry2.next = linkedEntry3;
            }
            if (linkedEntry3 != null) {
                linkedEntry3.prev = linkedEntry2;
            }
            linkedEntry.prev = null;
            linkedEntry.next = null;
            if (linkedEntry == this.mHead) {
                this.mHead = linkedEntry3;
            }
            if (linkedEntry == this.mTail) {
                this.mTail = linkedEntry2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Nullable
    public synchronized T acquire(int i) {
        LinkedEntry<T> linkedEntry = this.mMap.get(i);
        if (linkedEntry == null) {
            return null;
        }
        T pollFirst = linkedEntry.value.pollFirst();
        moveToFront(linkedEntry);
        return pollFirst;
    }

    public synchronized void release(int i, T t) {
        try {
            LinkedEntry<T> linkedEntry = this.mMap.get(i);
            if (linkedEntry == null) {
                linkedEntry = new LinkedEntry<>(i, new LinkedList());
                this.mMap.put(i, linkedEntry);
            }
            linkedEntry.value.addLast(t);
            moveToFront(linkedEntry);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Nullable
    public synchronized T removeFromEnd() {
        LinkedEntry<T> linkedEntry = this.mTail;
        if (linkedEntry == null) {
            return null;
        }
        T pollLast = linkedEntry.value.pollLast();
        maybePrune(linkedEntry);
        return pollLast;
    }

    @VisibleForTesting
    public synchronized int valueCount() {
        int i;
        try {
            i = 0;
            for (LinkedEntry linkedEntry = this.mHead; linkedEntry != null; linkedEntry = linkedEntry.next) {
                LinkedList<I> linkedList = linkedEntry.value;
                if (linkedList != 0) {
                    i += linkedList.size();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public static class LinkedEntry<I> {
        int key;

        @Nullable
        LinkedEntry<I> next;

        @Nullable
        LinkedEntry<I> prev;
        LinkedList<I> value;

        private LinkedEntry(@Nullable LinkedEntry<I> linkedEntry, int i, LinkedList<I> linkedList, @Nullable LinkedEntry<I> linkedEntry2) {
            this.prev = linkedEntry;
            this.key = i;
            this.value = linkedList;
            this.next = linkedEntry2;
        }

        public String toString() {
            return a$$ExternalSyntheticOutline0.m(new StringBuilder("LinkedEntry(key: "), this.key, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public /* synthetic */ LinkedEntry(int i, LinkedList linkedList) {
            this(null, i, linkedList, null);
        }
    }
}
