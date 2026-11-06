package com.dee.app.metrics;

import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public class MetricDescriptor {
    public static final int EMISSION_FACTOR_MAX = 100;
    public static final int EMISSION_FACTOR_MIN = 1;
    private MetricComponentName componentName;
    private Map<String, Object> customEntries;
    private int emissionFactor;
    private MetricName name;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private MetricComponentName componentName;
        private MetricName name;
        private int emissionFactor = 100;
        private Map<String, Object> customEntries = new HashMap();

        public Builder(@NonNull MetricName metricName, @NonNull MetricComponentName metricComponentName) {
            this.name = metricName;
            this.componentName = metricComponentName;
        }

        public MetricDescriptor build() {
            return new MetricDescriptor(this.name, this.componentName, this.emissionFactor, this.customEntries);
        }

        public Builder withComponentName(@NonNull MetricComponentName metricComponentName) {
            this.componentName = metricComponentName;
            return this;
        }

        public Builder withCustomEntries(@NonNull Map<String, Object> map) {
            this.customEntries = map;
            return this;
        }

        public Builder withEmissionFactor(@IntRange(from = 1, to = 100) int i) {
            this.emissionFactor = i;
            return this;
        }

        public Builder withName(@NonNull MetricName metricName) {
            this.name = metricName;
            return this;
        }
    }

    public MetricDescriptor(@NonNull MetricDescriptor metricDescriptor) {
        this.name = metricDescriptor.getName();
        this.componentName = metricDescriptor.getComponentName();
        this.emissionFactor = metricDescriptor.getEmissionFactor();
        this.customEntries = metricDescriptor.getCustomEntries();
    }

    public boolean equals(Object obj) {
        if (obj instanceof MetricDescriptor) {
            MetricDescriptor metricDescriptor = (MetricDescriptor) obj;
            MetricName metricName = this.name;
            MetricName metricName2 = metricDescriptor.name;
            boolean equals = metricName == null ? metricName2 == null : metricName.equals(metricName2);
            MetricComponentName metricComponentName = this.componentName;
            MetricComponentName metricComponentName2 = metricDescriptor.componentName;
            boolean equals2 = metricComponentName == null ? metricComponentName2 == null : metricComponentName.equals(metricComponentName2);
            boolean z = this.emissionFactor == metricDescriptor.emissionFactor;
            Map<String, Object> map = this.customEntries;
            Map<String, Object> map2 = metricDescriptor.customEntries;
            boolean equals3 = map == null ? map2 == null : map.equals(map2);
            if (equals && equals2 && z && equals3) {
                return true;
            }
        }
        return false;
    }

    public MetricComponentName getComponentName() {
        return this.componentName;
    }

    public Map<String, Object> getCustomEntries() {
        return this.customEntries;
    }

    public int getEmissionFactor() {
        return this.emissionFactor;
    }

    public MetricName getName() {
        return this.name;
    }

    public int hashCode() {
        MetricName metricName = this.name;
        int hashCode = ((metricName != null ? metricName.hashCode() : 0) + 31) * 31;
        MetricComponentName metricComponentName = this.componentName;
        int hashCode2 = (((hashCode + (metricComponentName != null ? metricComponentName.hashCode() : 0)) * 31) + this.emissionFactor) * 31;
        Map<String, Object> map = this.customEntries;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public void setComponentName(@NonNull MetricComponentName metricComponentName) {
        this.componentName = metricComponentName;
    }

    public void setCustomEntries(@NonNull Map<String, Object> map) {
        this.customEntries = map;
    }

    public void setEmissionFactor(@IntRange(from = 1, to = 100) int i) {
        if (i < 1 || i > 100) {
            Single$$ExternalSyntheticBUOutline0.m$3("Emission factor should be between 1 and 100");
        } else {
            this.emissionFactor = i;
        }
    }

    public void setName(@NonNull MetricName metricName) {
        this.name = metricName;
    }

    @VisibleForTesting
    public MetricDescriptor(@NonNull MetricName metricName, @NonNull MetricComponentName metricComponentName, @IntRange(from = 1, to = 100) int i, @NonNull Map<String, Object> map) {
        if (i >= 1 && i <= 100) {
            this.name = metricName;
            this.componentName = metricComponentName;
            this.emissionFactor = i;
            this.customEntries = map;
            return;
        }
        Single$$ExternalSyntheticBUOutline0.m$3("Emission factor should be between 1 and 100");
        throw null;
    }
}
