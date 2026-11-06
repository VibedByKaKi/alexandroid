package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableReplay;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class FreezableUtils {
    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull ArrayList<E> arrayList) {
        FlowableReplay.UnboundedReplayBuffer unboundedReplayBuffer = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            unboundedReplayBuffer.add(arrayList.get(i).freeze());
        }
        return unboundedReplayBuffer;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(@NonNull Iterable<E> iterable) {
        FlowableReplay.UnboundedReplayBuffer unboundedReplayBuffer = (ArrayList<T>) new ArrayList();
        Iterator<E> it2 = iterable.iterator();
        while (it2.hasNext()) {
            unboundedReplayBuffer.add(it2.next().freeze());
        }
        return unboundedReplayBuffer;
    }

    @NonNull
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(@NonNull E[] eArr) {
        FlowableReplay.UnboundedReplayBuffer unboundedReplayBuffer = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            unboundedReplayBuffer.add(e.freeze());
        }
        return unboundedReplayBuffer;
    }
}
