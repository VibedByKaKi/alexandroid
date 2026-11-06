package com.amazon.apl.android.metrics;

import androidx.annotation.NonNull;
import com.amazon.apl.devtools.DevToolsProvider;
import com.google.auto.value.AutoValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes20.dex */
public abstract class MetricsOptions {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private Map<String, String> mMetaData;
        private List<IMetricsSink> mMetricsSinkList = new ArrayList();

        public MetricsOptions build() {
            this.mMetricsSinkList.add(DevToolsProvider.createDevToolSink());
            return new AutoValue_MetricsOptions(this.mMetricsSinkList, this.mMetaData);
        }

        public Builder metaData(Map<String, String> map) {
            this.mMetaData = map;
            return this;
        }

        public Builder metricsSinkList(List<IMetricsSink> list) {
            this.mMetricsSinkList.addAll(list);
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }

    @Nullable
    public abstract Map<String, String> getMetaData();

    @NonNull
    public abstract List<IMetricsSink> getMetricsSinkList();
}
