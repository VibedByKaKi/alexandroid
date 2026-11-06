package com.amazonaws.services.s3.model.analytics;

import java.io.Serializable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public abstract class AnalyticsFilterPredicate implements Serializable {
    public abstract void accept(AnalyticsPredicateVisitor analyticsPredicateVisitor);
}
