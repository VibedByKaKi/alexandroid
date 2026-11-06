package com.amazon.apl.android.metrics;

import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
final class AutoValue_MetricsOptions extends MetricsOptions {
    private final Map<String, String> metaData;
    private final List<IMetricsSink> metricsSinkList;

    public AutoValue_MetricsOptions(List<IMetricsSink> list, @Nullable Map<String, String> map) {
        if (list == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null metricsSinkList");
            throw null;
        }
        this.metricsSinkList = list;
        this.metaData = map;
    }

    public boolean equals(Object obj) {
        Map<String, String> map;
        if (obj == this) {
            return true;
        }
        if (obj instanceof MetricsOptions) {
            MetricsOptions metricsOptions = (MetricsOptions) obj;
            if (this.metricsSinkList.equals(metricsOptions.getMetricsSinkList()) && ((map = this.metaData) != null ? map.equals(metricsOptions.getMetaData()) : metricsOptions.getMetaData() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.amazon.apl.android.metrics.MetricsOptions
    @Nullable
    public Map<String, String> getMetaData() {
        return this.metaData;
    }

    @Override // com.amazon.apl.android.metrics.MetricsOptions
    @NonNull
    public List<IMetricsSink> getMetricsSinkList() {
        return this.metricsSinkList;
    }

    public int hashCode() {
        int hashCode = (this.metricsSinkList.hashCode() ^ 1000003) * 1000003;
        Map<String, String> map = this.metaData;
        return (map == null ? 0 : map.hashCode()) ^ hashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MetricsOptions{metricsSinkList=");
        sb.append(this.metricsSinkList);
        sb.append(", metaData=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.metaData, StringSubstitutor.DEFAULT_VAR_END);
    }
}
