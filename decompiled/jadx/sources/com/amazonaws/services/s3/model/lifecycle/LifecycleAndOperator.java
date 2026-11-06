package com.amazonaws.services.s3.model.lifecycle;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public final class LifecycleAndOperator extends LifecycleNAryOperator {
    public LifecycleAndOperator(List<LifecycleFilterPredicate> list) {
        super(list);
    }

    @Override // com.amazonaws.services.s3.model.lifecycle.LifecycleFilterPredicate
    public void accept(LifecyclePredicateVisitor lifecyclePredicateVisitor) {
        lifecyclePredicateVisitor.visit(this);
    }

    @Override // com.amazonaws.services.s3.model.lifecycle.LifecycleNAryOperator
    public /* bridge */ /* synthetic */ List getOperands() {
        return super.getOperands();
    }
}
