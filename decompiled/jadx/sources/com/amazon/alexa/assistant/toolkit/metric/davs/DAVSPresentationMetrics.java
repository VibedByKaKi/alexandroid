package com.amazon.alexa.assistant.toolkit.metric.davs;

import com.amazon.alexa.assistant.foundation.metric.model.MetricMetadata;
import com.amazon.alexa.assistant.toolkit.metric.model.MetricComponent;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0010\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/metric/davs/DAVSPresentationMetrics;", "", "rawValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getRawValue", "()Ljava/lang/String;", "WW_MODEL_DOWNLOAD_ATTEMPT", "WW_MODEL_DOWNLOAD_FAILED", "WW_MODEL_DOWNLOAD_SUCCEEDED", "WW_MODEL_DOWNLOAD_IGNORED", "BUNDLE_RESOURCE_DOWNLOAD_ATTEMPT", "BUNDLE_RESOURCE_DOWNLOAD_FAILED", "BUNDLE_RESOURCE_DOWNLOAD_SUCCEEDED", "BUNDLE_VALIDATION_CACHE_HIT", "descriptor", "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;", "Companion", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DAVSPresentationMetrics {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DAVSPresentationMetrics[] $VALUES;

    @NotNull
    private static final MetricComponent COMPONENT;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final String DESCRIPTOR_NAME_PREFIX = "DAVS";

    @NotNull
    private static final MetricMetadata baseDescriptor;

    @NotNull
    private final String rawValue;
    public static final DAVSPresentationMetrics WW_MODEL_DOWNLOAD_ATTEMPT = new DAVSPresentationMetrics("WW_MODEL_DOWNLOAD_ATTEMPT", 0, "wwModelDownloadAttempt");
    public static final DAVSPresentationMetrics WW_MODEL_DOWNLOAD_FAILED = new DAVSPresentationMetrics("WW_MODEL_DOWNLOAD_FAILED", 1, "wwModelDownloadFailed");
    public static final DAVSPresentationMetrics WW_MODEL_DOWNLOAD_SUCCEEDED = new DAVSPresentationMetrics("WW_MODEL_DOWNLOAD_SUCCEEDED", 2, "wwModelDownloadSucceeded");
    public static final DAVSPresentationMetrics WW_MODEL_DOWNLOAD_IGNORED = new DAVSPresentationMetrics("WW_MODEL_DOWNLOAD_IGNORED", 3, "wwModelDownloadIgnored");
    public static final DAVSPresentationMetrics BUNDLE_RESOURCE_DOWNLOAD_ATTEMPT = new DAVSPresentationMetrics("BUNDLE_RESOURCE_DOWNLOAD_ATTEMPT", 4, "bundleResourceDownloadAttempt");
    public static final DAVSPresentationMetrics BUNDLE_RESOURCE_DOWNLOAD_FAILED = new DAVSPresentationMetrics("BUNDLE_RESOURCE_DOWNLOAD_FAILED", 5, "bundleResourceDownloadFailed");
    public static final DAVSPresentationMetrics BUNDLE_RESOURCE_DOWNLOAD_SUCCEEDED = new DAVSPresentationMetrics("BUNDLE_RESOURCE_DOWNLOAD_SUCCEEDED", 6, "bundleResourceDownloadSucceeded");
    public static final DAVSPresentationMetrics BUNDLE_VALIDATION_CACHE_HIT = new DAVSPresentationMetrics("BUNDLE_VALIDATION_CACHE_HIT", 7, "bundleValidationCacheHit");

    private static final /* synthetic */ DAVSPresentationMetrics[] $values() {
        return new DAVSPresentationMetrics[]{WW_MODEL_DOWNLOAD_ATTEMPT, WW_MODEL_DOWNLOAD_FAILED, WW_MODEL_DOWNLOAD_SUCCEEDED, WW_MODEL_DOWNLOAD_IGNORED, BUNDLE_RESOURCE_DOWNLOAD_ATTEMPT, BUNDLE_RESOURCE_DOWNLOAD_FAILED, BUNDLE_RESOURCE_DOWNLOAD_SUCCEEDED, BUNDLE_VALIDATION_CACHE_HIT};
    }

    static {
        DAVSPresentationMetrics[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
        MetricComponent metricComponent = MetricComponent.DAVS;
        COMPONENT = metricComponent;
        baseDescriptor = new MetricMetadata("", metricComponent.getValue(), null, null, null, 0L, null, 124, null);
    }

    private DAVSPresentationMetrics(String str, int i, String str2) {
        this.rawValue = str2;
    }

    @NotNull
    public static EnumEntries<DAVSPresentationMetrics> getEntries() {
        return $ENTRIES;
    }

    public static DAVSPresentationMetrics valueOf(String str) {
        return (DAVSPresentationMetrics) Enum.valueOf(DAVSPresentationMetrics.class, str);
    }

    public static DAVSPresentationMetrics[] values() {
        return (DAVSPresentationMetrics[]) $VALUES.clone();
    }

    @NotNull
    public final MetricMetadata descriptor() {
        return INSTANCE.descriptorWithName(this.rawValue);
    }

    @NotNull
    public final String getRawValue() {
        return this.rawValue;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/metric/davs/DAVSPresentationMetrics$Companion;", "", "<init>", "()V", "DESCRIPTOR_NAME_PREFIX", "", "COMPONENT", "Lcom/amazon/alexa/assistant/toolkit/metric/model/MetricComponent;", "baseDescriptor", "Lcom/amazon/alexa/assistant/foundation/metric/model/MetricMetadata;", "descriptorWithName", "name", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MetricMetadata descriptorWithName(@NotNull String name) {
            name.getClass();
            return MetricMetadata.copy$default(DAVSPresentationMetrics.baseDescriptor, a$$ExternalSyntheticOutline0.m("DAVS.", name), null, null, null, null, 0L, null, 126, null);
        }

        private Companion() {
        }
    }
}
