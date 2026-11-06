package com.mapbox.common.location;

import com.mapbox.common.location.LocationUpdatesReceiver;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\t\u0010\u0004\u001a\u00020\u0005H\u0096\u0002J\u000e\u0010\u0006\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"com/mapbox/common/location/LocationUpdatesReceiver$CircularArray$iterator$1", "", "index", "Ljava/util/concurrent/atomic/AtomicInteger;", "hasNext", "", "next", "()Ljava/lang/Object;", "common_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes8.dex */
public final class LocationUpdatesReceiver$CircularArray$iterator$1<T> implements Iterator<T>, KMappedMarker {

    @NotNull
    private final AtomicInteger index = new AtomicInteger(0);
    final /* synthetic */ LocationUpdatesReceiver.CircularArray<T> this$0;

    public LocationUpdatesReceiver$CircularArray$iterator$1(LocationUpdatesReceiver.CircularArray<T> circularArray) {
        this.this$0 = circularArray;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.index.get() < this.this$0.getCurrentSize();
    }

    @Override // java.util.Iterator
    @NotNull
    public T next() {
        return this.this$0.get(this.index.getAndIncrement());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
