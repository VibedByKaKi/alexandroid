package com.mapbox.common;

import androidx.annotation.RestrictTo;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.regions.RegionDefaults$$ExternalSyntheticOutline0;
import com.mapbox.bindgen.RecordUtils;
import java.io.Serializable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes8.dex */
public final class MemoryMonitorObserverConfig implements Serializable {
    private final long maxUsedMemoryPercentThreshold;
    private final long maxUsedMemoryThreshold;
    private final boolean sendAppRunningInBackgroundNotification;
    private final long thresholdReachedNotificationTimeout;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private boolean sendAppRunningInBackgroundNotification = true;
        private long maxUsedMemoryPercentThreshold = 75;
        private long maxUsedMemoryThreshold = 0;
        private long thresholdReachedNotificationTimeout = 300000;

        public MemoryMonitorObserverConfig build() {
            return new MemoryMonitorObserverConfig(this.sendAppRunningInBackgroundNotification, this.maxUsedMemoryPercentThreshold, this.maxUsedMemoryThreshold, this.thresholdReachedNotificationTimeout);
        }

        public Builder maxUsedMemoryPercentThreshold(long j) {
            this.maxUsedMemoryPercentThreshold = j;
            return this;
        }

        public Builder maxUsedMemoryThreshold(long j) {
            this.maxUsedMemoryThreshold = j;
            return this;
        }

        public Builder sendAppRunningInBackgroundNotification(boolean z) {
            this.sendAppRunningInBackgroundNotification = z;
            return this;
        }

        public Builder thresholdReachedNotificationTimeout(long j) {
            this.thresholdReachedNotificationTimeout = j;
            return this;
        }
    }

    static {
        BaseMapboxInitializer.init(MapboxSDKCommonInitializerImpl.class);
    }

    private MemoryMonitorObserverConfig() {
        this.sendAppRunningInBackgroundNotification = true;
        this.maxUsedMemoryPercentThreshold = 75L;
        this.maxUsedMemoryThreshold = 0L;
        this.thresholdReachedNotificationTimeout = 300000L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MemoryMonitorObserverConfig.class != obj.getClass()) {
            return false;
        }
        MemoryMonitorObserverConfig memoryMonitorObserverConfig = (MemoryMonitorObserverConfig) obj;
        return this.sendAppRunningInBackgroundNotification == memoryMonitorObserverConfig.sendAppRunningInBackgroundNotification && this.maxUsedMemoryPercentThreshold == memoryMonitorObserverConfig.maxUsedMemoryPercentThreshold && this.maxUsedMemoryThreshold == memoryMonitorObserverConfig.maxUsedMemoryThreshold && this.thresholdReachedNotificationTimeout == memoryMonitorObserverConfig.thresholdReachedNotificationTimeout;
    }

    public long getMaxUsedMemoryPercentThreshold() {
        return this.maxUsedMemoryPercentThreshold;
    }

    public long getMaxUsedMemoryThreshold() {
        return this.maxUsedMemoryThreshold;
    }

    public boolean getSendAppRunningInBackgroundNotification() {
        return this.sendAppRunningInBackgroundNotification;
    }

    public long getThresholdReachedNotificationTimeout() {
        return this.thresholdReachedNotificationTimeout;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.sendAppRunningInBackgroundNotification), Long.valueOf(this.maxUsedMemoryPercentThreshold), Long.valueOf(this.maxUsedMemoryThreshold), Long.valueOf(this.thresholdReachedNotificationTimeout));
    }

    public Builder toBuilder() {
        return new Builder().sendAppRunningInBackgroundNotification(this.sendAppRunningInBackgroundNotification).maxUsedMemoryPercentThreshold(this.maxUsedMemoryPercentThreshold).maxUsedMemoryThreshold(this.maxUsedMemoryThreshold).thresholdReachedNotificationTimeout(this.thresholdReachedNotificationTimeout);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[sendAppRunningInBackgroundNotification: ");
        sb.append(RecordUtils.fieldToString(Boolean.valueOf(this.sendAppRunningInBackgroundNotification)));
        sb.append(", maxUsedMemoryPercentThreshold: ");
        RegionDefaults$$ExternalSyntheticOutline0.m(this.maxUsedMemoryPercentThreshold, ", maxUsedMemoryThreshold: ", sb);
        RegionDefaults$$ExternalSyntheticOutline0.m(this.maxUsedMemoryThreshold, ", thresholdReachedNotificationTimeout: ", sb);
        sb.append(RecordUtils.fieldToString(Long.valueOf(this.thresholdReachedNotificationTimeout)));
        sb.append(MarkdownConstants.RIGHT_BRACKET);
        return sb.toString();
    }

    private MemoryMonitorObserverConfig(boolean z, long j, long j2, long j3) {
        this.sendAppRunningInBackgroundNotification = z;
        this.maxUsedMemoryPercentThreshold = j;
        this.maxUsedMemoryThreshold = j2;
        this.thresholdReachedNotificationTimeout = j3;
    }
}
