package com.amazon.commsnetworking.metrics;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class MetricMetadata {
    private boolean includeMetricsPrefix;
    private String metricName;
    private String metricOwnerId;
    private String source;

    public MetricMetadata(String str, String str2, boolean z, String str3) {
        this.source = str;
        this.metricName = str2;
        this.includeMetricsPrefix = z;
        this.metricOwnerId = str3;
    }

    public String getMetricName() {
        return this.metricName;
    }

    public String getMetricOwnerId() {
        return this.metricOwnerId;
    }

    public String getSource() {
        return this.source;
    }

    public boolean includeCommsNetworkingPrefix() {
        return this.includeMetricsPrefix;
    }

    public MetricMetadata(String str, String str2, boolean z) {
        this(str, str2, z, "ec2b8c3f-5736-4878-bf6f-70ee753a92b2");
    }

    public MetricMetadata(String str, String str2) {
        this(str, str2, true, "ec2b8c3f-5736-4878-bf6f-70ee753a92b2");
    }
}
