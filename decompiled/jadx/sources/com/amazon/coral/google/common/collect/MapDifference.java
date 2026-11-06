package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.annotations.GwtCompatible;
import com.amazon.coral.google.errorprone.annotations.DoNotMock;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@DoNotMock("Use Maps.difference")
@ElementTypesAreNonnullByDefault
@GwtCompatible
/* loaded from: classes19.dex */
public interface MapDifference<K, V> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @DoNotMock("Use Maps.difference")
    public interface ValueDifference<V> {
        boolean equals(@CheckForNull Object obj);

        int hashCode();

        @ParametricNullness
        V leftValue();

        @ParametricNullness
        V rightValue();
    }

    boolean areEqual();

    Map<K, ValueDifference<V>> entriesDiffering();

    Map<K, V> entriesInCommon();

    Map<K, V> entriesOnlyOnLeft();

    Map<K, V> entriesOnlyOnRight();

    boolean equals(@CheckForNull Object obj);

    int hashCode();
}
