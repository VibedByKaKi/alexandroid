package com.amazonaws.services.s3.model.metrics;

import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MetricsFilter implements Serializable {
    private MetricsFilterPredicate predicate;

    public MetricsFilter(MetricsFilterPredicate metricsFilterPredicate) {
        this.predicate = metricsFilterPredicate;
    }

    public MetricsFilterPredicate getPredicate() {
        return this.predicate;
    }

    public void setPredicate(MetricsFilterPredicate metricsFilterPredicate) {
        this.predicate = metricsFilterPredicate;
    }

    public MetricsFilter withPredicate(MetricsFilterPredicate metricsFilterPredicate) {
        setPredicate(metricsFilterPredicate);
        return this;
    }

    public MetricsFilter() {
    }
}
