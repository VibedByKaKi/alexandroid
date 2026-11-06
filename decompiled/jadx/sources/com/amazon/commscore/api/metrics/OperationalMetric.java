package com.amazon.commscore.api.metrics;

import androidx.annotation.Nullable;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class OperationalMetric extends BaseMetric<OperationalMetric> {
    private OperationalMetricType type;

    public OperationalMetric(String str, String str2, String str3, OperationalMetricType operationalMetricType) {
        super(str, str2, str3);
        this.type = operationalMetricType;
    }

    @Override // com.amazon.commscore.api.metrics.BaseMetric
    public /* bridge */ /* synthetic */ String getComponent() {
        return super.getComponent();
    }

    @Override // com.amazon.commscore.api.metrics.BaseMetric
    public /* bridge */ /* synthetic */ Map getCustomEntries() {
        return super.getCustomEntries();
    }

    @Override // com.amazon.commscore.api.metrics.BaseMetric
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    @Override // com.amazon.commscore.api.metrics.BaseMetric
    public /* bridge */ /* synthetic */ String getOwnerIdentifier() {
        return super.getOwnerIdentifier();
    }

    @Override // com.amazon.commscore.api.metrics.BaseMetric
    public /* bridge */ /* synthetic */ String getSubComponent() {
        return super.getSubComponent();
    }

    public OperationalMetricType getType() {
        return this.type;
    }

    public OperationalMetric ofType(OperationalMetricType operationalMetricType) {
        this.type = operationalMetricType;
        return this;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.amazon.commscore.api.metrics.BaseMetric, com.amazon.commscore.api.metrics.OperationalMetric] */
    @Override // com.amazon.commscore.api.metrics.BaseMetric
    public /* bridge */ /* synthetic */ OperationalMetric setCustomEntries(@Nullable Map map) {
        return super.setCustomEntries(map);
    }

    public OperationalMetric(String str, String str2, String str3) {
        super(str, str2, str3);
    }

    public OperationalMetric(String str, String str2, String str3, String str4) {
        super(str, str2, str3, str4);
    }

    public OperationalMetric(String str, String str2, String str3, String str4, OperationalMetricType operationalMetricType) {
        super(str, str2, str3, str4);
        this.type = operationalMetricType;
    }
}
