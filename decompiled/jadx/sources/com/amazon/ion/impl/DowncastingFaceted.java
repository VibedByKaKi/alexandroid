package com.amazon.ion.impl;

import com.amazon.ion.facet.Faceted;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
abstract class DowncastingFaceted implements Faceted {
    @Override // com.amazon.ion.facet.Faceted
    public final <T> T asFacet(Class<T> cls) {
        if (cls.isInstance(this)) {
            return cls.cast(this);
        }
        return null;
    }
}
