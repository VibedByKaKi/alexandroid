package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.annotations.GwtIncompatible;
import java.util.SortedSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
interface SortedMultisetBridge<E> extends Multiset<E> {
    @Override // com.amazon.coral.google.common.collect.Multiset
    SortedSet<E> elementSet();
}
