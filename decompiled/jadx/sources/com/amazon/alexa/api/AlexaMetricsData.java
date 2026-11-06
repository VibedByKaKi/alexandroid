package com.amazon.alexa.api;

import android.os.Bundle;
import com.amazon.alexa.client.annotations.Nullable;
import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaMetricsData {

    @Nullable
    private final AlexaMetricsCount alexaMetricsCount;

    @Nullable
    private final AlexaMetricsTime alexaMetricsTime;
    private final String componentName;
    private final String eventName;
    private final String hostPackageName;
    private final AlexaMetricsMetadata metadata;
    private final AlexaMetricsCategory metricsCategory;
    private final AlexaMetricsType metricsType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class Builder {
        private AlexaMetricsCount alexaMetricsCount;
        private AlexaMetricsTime alexaMetricsTime;
        private String componentName;
        private String eventName;
        private String hostPackageName;
        private Bundle metadata;
        private AlexaMetricsCategory metricCategory;
        private AlexaMetricsType metricType;

        public Builder(String str, String str2) {
            setHostPackageName(str);
            setComponentName(str2);
        }

        public AlexaMetricsData build() {
            return new AlexaMetricsData(this.hostPackageName, this.componentName, this.eventName, this.metricCategory, this.metricType, AlexaMetricsMetadata.create(this.metadata), this.alexaMetricsTime, this.alexaMetricsCount);
        }

        public Builder setAlexaMetricsCount(AlexaMetricsCount alexaMetricsCount) {
            this.alexaMetricsCount = alexaMetricsCount;
            return this;
        }

        public Builder setAlexaMetricsTime(AlexaMetricsTime alexaMetricsTime) {
            this.alexaMetricsTime = alexaMetricsTime;
            return this;
        }

        public Builder setComponentName(String str) {
            this.componentName = str;
            return this;
        }

        public Builder setEventName(String str) {
            this.eventName = str;
            return this;
        }

        public Builder setHostPackageName(String str) {
            this.hostPackageName = str;
            return this;
        }

        public Builder setMetadata(Bundle bundle) {
            this.metadata = bundle;
            return this;
        }

        public Builder setMetricCategory(AlexaMetricsCategory alexaMetricsCategory) {
            this.metricCategory = alexaMetricsCategory;
            return this;
        }

        public Builder setMetricType(AlexaMetricsType alexaMetricsType) {
            this.metricType = alexaMetricsType;
            return this;
        }
    }

    public AlexaMetricsData(String str, String str2, String str3, AlexaMetricsCategory alexaMetricsCategory, AlexaMetricsType alexaMetricsType, AlexaMetricsMetadata alexaMetricsMetadata, @Nullable AlexaMetricsTime alexaMetricsTime, @Nullable AlexaMetricsCount alexaMetricsCount) {
        this.hostPackageName = str;
        this.componentName = str2;
        this.eventName = str3;
        this.alexaMetricsTime = alexaMetricsTime;
        this.alexaMetricsCount = alexaMetricsCount;
        this.metricsCategory = alexaMetricsCategory;
        this.metricsType = alexaMetricsType;
        this.metadata = alexaMetricsMetadata;
    }

    public static AlexaMetricsData fromBundle(Bundle bundle) {
        Preconditions.notNull(bundle, "bundle is null");
        String string = Bundles.getString(bundle, MetricsKey.HOST_PACKAGE_NAME);
        String string2 = Bundles.getString(bundle, MetricsKey.COMPONENT_NAME);
        String string3 = Bundles.getString(bundle, MetricsKey.EVENT_NAME);
        AlexaMetricsCategory valueOf = AlexaMetricsCategory.valueOf(Bundles.getString(bundle, MetricsKey.METRICS_CATEGORY));
        AlexaMetricsType valueOf2 = AlexaMetricsType.valueOf(Bundles.getString(bundle, MetricsKey.METRICS_TYPE));
        Bundle bundle2 = Bundles.getBundle(bundle, MetricsKey.METADATA);
        return new AlexaMetricsData(string, string2, string3, valueOf, valueOf2, AlexaMetricsMetadata.create(bundle2), (AlexaMetricsTime) Bundles.getOptionalParcelable(bundle, MetricsKey.ALEXA_TIMER, AlexaMetricsTime.class), (AlexaMetricsCount) Bundles.getOptionalParcelable(bundle, MetricsKey.ALEXA_COUNTER, AlexaMetricsCount.class));
    }

    public static Bundle toBundle(AlexaMetricsData alexaMetricsData) {
        Preconditions.notNull(alexaMetricsData, "MetricsData is null");
        Bundle bundle = new Bundle();
        bundle.putString(MetricsKey.HOST_PACKAGE_NAME.name(), alexaMetricsData.getHostPackageName());
        bundle.putString(MetricsKey.COMPONENT_NAME.name(), alexaMetricsData.getComponentName());
        bundle.putString(MetricsKey.EVENT_NAME.name(), alexaMetricsData.getEventName());
        bundle.putString(MetricsKey.METRICS_CATEGORY.name(), alexaMetricsData.getMetricsCategory().name());
        bundle.putString(MetricsKey.METRICS_TYPE.name(), alexaMetricsData.getMetricsType().name());
        bundle.putBundle(MetricsKey.METADATA.name(), alexaMetricsData.getMetadata().getBundle());
        bundle.putParcelable(MetricsKey.ALEXA_TIMER.name(), alexaMetricsData.getAlexaMetricsTime());
        bundle.putParcelable(MetricsKey.ALEXA_COUNTER.name(), alexaMetricsData.getAlexaMetricsCount());
        return bundle;
    }

    public AlexaMetricsCount getAlexaMetricsCount() {
        return this.alexaMetricsCount;
    }

    public AlexaMetricsTime getAlexaMetricsTime() {
        return this.alexaMetricsTime;
    }

    public String getComponentName() {
        return this.componentName;
    }

    public String getEventName() {
        return this.eventName;
    }

    public String getHostPackageName() {
        return this.hostPackageName;
    }

    public AlexaMetricsMetadata getMetadata() {
        return this.metadata;
    }

    public AlexaMetricsCategory getMetricsCategory() {
        return this.metricsCategory;
    }

    public AlexaMetricsType getMetricsType() {
        return this.metricsType;
    }
}
