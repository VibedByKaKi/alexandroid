package com.amazon.ion.util;

import com.amazon.ion.Span;
import com.amazon.ion.SpanProvider;
import com.amazon.ion.facet.Faceted;
import com.amazon.ion.facet.Facets;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class Spans {
    public static Span currentSpan(Object obj) {
        SpanProvider spanProvider = (SpanProvider) Facets.asFacet(SpanProvider.class, obj);
        if (spanProvider == null) {
            return null;
        }
        return spanProvider.currentSpan();
    }

    public static <T> T currentSpan(Class<T> cls, Object obj) {
        return (T) Facets.asFacet((Class) cls, (Faceted) currentSpan(obj));
    }
}
