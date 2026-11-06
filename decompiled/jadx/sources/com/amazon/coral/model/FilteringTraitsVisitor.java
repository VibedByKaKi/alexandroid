package com.amazon.coral.model;

import okio.Path$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public class FilteringTraitsVisitor implements TraitsVisitor {
    private final TraitsVisitor delegate;
    private final TraitsFilter filter;

    public FilteringTraitsVisitor(TraitsFilter traitsFilter, TraitsVisitor traitsVisitor) {
        if (traitsFilter == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        if (traitsVisitor == null) {
            Path$$ExternalSyntheticBUOutline0.m();
            throw null;
        }
        this.filter = traitsFilter;
        this.delegate = traitsVisitor;
    }

    @Override // com.amazon.coral.model.TraitsVisitor
    public void visit(Traits traits) {
        if (this.filter.filter(traits)) {
            return;
        }
        this.delegate.visit(traits);
    }
}
