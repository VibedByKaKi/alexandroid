package com.amazonaws.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class SimpleThroughputMetricType extends SimpleServiceMetricType implements ThroughputMetricType {
    private final ServiceMetricType byteCountMetricType;

    public SimpleThroughputMetricType(String str, String str2, String str3) {
        super(str, str2);
        this.byteCountMetricType = new SimpleServiceMetricType(str3, str2);
    }

    @Override // com.amazonaws.metrics.ThroughputMetricType
    public ServiceMetricType getByteCountMetricType() {
        return this.byteCountMetricType;
    }
}
