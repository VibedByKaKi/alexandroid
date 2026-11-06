package com.amazon.latencyinfra;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class LatencyRecorderOption {
    private final boolean fromAppStart;
    private final boolean logReporterOption;
    private final boolean metricsReporterOption;
    private final boolean namespaceOption;
    private boolean perfTestOption;
    private final boolean reportForCustomerBuild;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private boolean fromAppStart;
        private boolean logReporterOption;
        private boolean metricsReporterOption;
        private boolean namespaceOption;
        private boolean perfTestOption;
        private boolean reportForCustomerBuild;

        public LatencyRecorderOption build() {
            return new LatencyRecorderOption(this.logReporterOption, this.metricsReporterOption, this.namespaceOption, this.reportForCustomerBuild, this.fromAppStart, this.perfTestOption, 0);
        }

        public Builder withCustomerOption(boolean z) {
            this.reportForCustomerBuild = z;
            return this;
        }

        public Builder withFromAppStart(boolean z) {
            this.fromAppStart = z;
            return this;
        }

        public Builder withLogOption(boolean z) {
            this.logReporterOption = z;
            return this;
        }

        public Builder withMetricsOption(boolean z) {
            this.metricsReporterOption = z;
            return this;
        }

        public Builder withNamespaceOption(boolean z) {
            this.namespaceOption = z;
            return this;
        }

        public Builder withPerfTestOption(boolean z) {
            this.perfTestOption = z;
            return this;
        }
    }

    private LatencyRecorderOption(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.logReporterOption = z;
        this.metricsReporterOption = z2;
        this.namespaceOption = z3;
        this.reportForCustomerBuild = z4;
        this.fromAppStart = z5;
        this.perfTestOption = z6;
    }

    public boolean hasFromAppStart() {
        return this.fromAppStart;
    }

    public boolean hasLogReporterOption() {
        return this.logReporterOption;
    }

    public boolean hasMetricsReporterOption() {
        return this.metricsReporterOption;
    }

    public boolean hasNamespaceOption() {
        return this.namespaceOption;
    }

    public boolean hasPerfTestOption() {
        return this.perfTestOption;
    }

    public boolean isReportingForCustomerBuild() {
        return this.reportForCustomerBuild;
    }

    public /* synthetic */ LatencyRecorderOption(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i) {
        this(z, z2, z3, z4, z5, z6);
    }
}
