package autovalue.shaded.com.google.common.collect;

import autovalue.shaded.com.google.common.annotations.GwtIncompatible;
import java.util.SortedSet;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes15.dex */
interface SortedMultisetBridge<E> extends Multiset<E> {
    @Override // autovalue.shaded.com.google.common.collect.Multiset
    SortedSet<E> elementSet();
}
