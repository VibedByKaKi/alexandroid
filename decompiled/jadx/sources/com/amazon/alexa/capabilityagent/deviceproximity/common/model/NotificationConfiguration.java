package com.amazon.alexa.capabilityagent.deviceproximity.common.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/NotificationConfiguration;", "", "type", "Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/NotificationConfigurationType;", "reportingIntervalInSeconds", "", "<init>", "(Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/NotificationConfigurationType;Ljava/lang/String;)V", "getType", "()Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/NotificationConfigurationType;", "getReportingIntervalInSeconds", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidCapabilityAgent-DeviceProximity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class NotificationConfiguration {

    @Nullable
    private final String reportingIntervalInSeconds;

    @NotNull
    private final NotificationConfigurationType type;

    public NotificationConfiguration(@NotNull NotificationConfigurationType notificationConfigurationType, @Nullable String str) {
        notificationConfigurationType.getClass();
        this.type = notificationConfigurationType;
        this.reportingIntervalInSeconds = str;
    }

    public static /* synthetic */ NotificationConfiguration copy$default(NotificationConfiguration notificationConfiguration, NotificationConfigurationType notificationConfigurationType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            notificationConfigurationType = notificationConfiguration.type;
        }
        if ((i & 2) != 0) {
            str = notificationConfiguration.reportingIntervalInSeconds;
        }
        return notificationConfiguration.copy(notificationConfigurationType, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final NotificationConfigurationType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getReportingIntervalInSeconds() {
        return this.reportingIntervalInSeconds;
    }

    @NotNull
    public final NotificationConfiguration copy(@NotNull NotificationConfigurationType type, @Nullable String reportingIntervalInSeconds) {
        type.getClass();
        return new NotificationConfiguration(type, reportingIntervalInSeconds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationConfiguration)) {
            return false;
        }
        NotificationConfiguration notificationConfiguration = (NotificationConfiguration) other;
        return this.type == notificationConfiguration.type && Intrinsics.areEqual(this.reportingIntervalInSeconds, notificationConfiguration.reportingIntervalInSeconds);
    }

    @Nullable
    public final String getReportingIntervalInSeconds() {
        return this.reportingIntervalInSeconds;
    }

    @NotNull
    public final NotificationConfigurationType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.reportingIntervalInSeconds;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "NotificationConfiguration(type=" + this.type + ", reportingIntervalInSeconds=" + this.reportingIntervalInSeconds + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ NotificationConfiguration(NotificationConfigurationType notificationConfigurationType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(notificationConfigurationType, (i & 2) != 0 ? null : str);
    }
}
