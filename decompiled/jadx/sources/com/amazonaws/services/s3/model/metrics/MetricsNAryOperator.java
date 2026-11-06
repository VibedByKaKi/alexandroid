package com.amazonaws.services.s3.model.metrics;

import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
abstract class MetricsNAryOperator extends MetricsFilterPredicate {
    private final List<MetricsFilterPredicate> operands;

    public MetricsNAryOperator(List<MetricsFilterPredicate> list) {
        this.operands = list;
    }

    public List<MetricsFilterPredicate> getOperands() {
        return this.operands;
    }
}
