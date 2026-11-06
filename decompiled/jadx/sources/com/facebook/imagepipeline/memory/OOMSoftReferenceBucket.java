package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.OOMSoftReference;
import com.facebook.infer.annotation.Nullsafe;
import java.util.LinkedList;
import javax.annotation.Nullable;
import javax.annotation.concurrent.NotThreadSafe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@NotThreadSafe
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
class OOMSoftReferenceBucket<V> extends Bucket<V> {
    private LinkedList<OOMSoftReference<V>> mSpareReferences;

    public OOMSoftReferenceBucket(int i, int i2, int i3) {
        super(i, i2, i3, false);
        this.mSpareReferences = new LinkedList<>();
    }

    @Override // com.facebook.imagepipeline.memory.Bucket
    public void addToFreeList(V v) {
        OOMSoftReference<V> poll = this.mSpareReferences.poll();
        if (poll == null) {
            poll = new OOMSoftReference<>();
        }
        poll.set(v);
        this.mFreeList.add(poll);
    }

    @Override // com.facebook.imagepipeline.memory.Bucket
    @Nullable
    public V pop() {
        OOMSoftReference<V> oOMSoftReference = (OOMSoftReference) this.mFreeList.poll();
        Preconditions.checkNotNull(oOMSoftReference);
        V v = oOMSoftReference.get();
        oOMSoftReference.clear();
        this.mSpareReferences.add(oOMSoftReference);
        return v;
    }
}
