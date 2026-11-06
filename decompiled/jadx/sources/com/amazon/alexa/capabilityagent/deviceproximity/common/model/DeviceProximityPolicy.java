package com.amazon.alexa.capabilityagent.deviceproximity.common.model;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0003\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/DeviceProximityPolicy;", "", "startTime", "", "endTime", "broadcasterPolicies", "", "Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/BroadcasterPolicy;", "observerPolicy", "Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/ObserverPolicy;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/ObserverPolicy;)V", "getStartTime", "()Ljava/lang/String;", "getEndTime", "getBroadcasterPolicies", "()Ljava/util/List;", "getObserverPolicy", "()Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/ObserverPolicy;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidCapabilityAgent-DeviceProximity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DeviceProximityPolicy {

    @Nullable
    private final List<BroadcasterPolicy> broadcasterPolicies;

    @NotNull
    private final String endTime;

    @Nullable
    private final ObserverPolicy observerPolicy;

    @NotNull
    private final String startTime;

    public DeviceProximityPolicy(@NotNull String str, @NotNull String str2, @JsonProperty("broadcasterPolicy") @Nullable List<BroadcasterPolicy> list, @Nullable ObserverPolicy observerPolicy) {
        str.getClass();
        str2.getClass();
        this.startTime = str;
        this.endTime = str2;
        this.broadcasterPolicies = list;
        this.observerPolicy = observerPolicy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DeviceProximityPolicy copy$default(DeviceProximityPolicy deviceProximityPolicy, String str, String str2, List list, ObserverPolicy observerPolicy, int i, Object obj) {
        if ((i & 1) != 0) {
            str = deviceProximityPolicy.startTime;
        }
        if ((i & 2) != 0) {
            str2 = deviceProximityPolicy.endTime;
        }
        if ((i & 4) != 0) {
            list = deviceProximityPolicy.broadcasterPolicies;
        }
        if ((i & 8) != 0) {
            observerPolicy = deviceProximityPolicy.observerPolicy;
        }
        return deviceProximityPolicy.copy(str, str2, list, observerPolicy);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final List<BroadcasterPolicy> component3() {
        return this.broadcasterPolicies;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final ObserverPolicy getObserverPolicy() {
        return this.observerPolicy;
    }

    @NotNull
    public final DeviceProximityPolicy copy(@NotNull String startTime, @NotNull String endTime, @JsonProperty("broadcasterPolicy") @Nullable List<BroadcasterPolicy> broadcasterPolicies, @Nullable ObserverPolicy observerPolicy) {
        startTime.getClass();
        endTime.getClass();
        return new DeviceProximityPolicy(startTime, endTime, broadcasterPolicies, observerPolicy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceProximityPolicy)) {
            return false;
        }
        DeviceProximityPolicy deviceProximityPolicy = (DeviceProximityPolicy) other;
        return Intrinsics.areEqual(this.startTime, deviceProximityPolicy.startTime) && Intrinsics.areEqual(this.endTime, deviceProximityPolicy.endTime) && Intrinsics.areEqual(this.broadcasterPolicies, deviceProximityPolicy.broadcasterPolicies) && Intrinsics.areEqual(this.observerPolicy, deviceProximityPolicy.observerPolicy);
    }

    @Nullable
    public final List<BroadcasterPolicy> getBroadcasterPolicies() {
        return this.broadcasterPolicies;
    }

    @NotNull
    public final String getEndTime() {
        return this.endTime;
    }

    @Nullable
    public final ObserverPolicy getObserverPolicy() {
        return this.observerPolicy;
    }

    @NotNull
    public final String getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.startTime.hashCode() * 31, 31, this.endTime);
        List<BroadcasterPolicy> list = this.broadcasterPolicies;
        int hashCode = (m + (list == null ? 0 : list.hashCode())) * 31;
        ObserverPolicy observerPolicy = this.observerPolicy;
        return hashCode + (observerPolicy != null ? observerPolicy.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.startTime;
        String str2 = this.endTime;
        List<BroadcasterPolicy> list = this.broadcasterPolicies;
        ObserverPolicy observerPolicy = this.observerPolicy;
        StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("DeviceProximityPolicy(startTime=", str, ", endTime=", str2, ", broadcasterPolicies=");
        m.append(list);
        m.append(", observerPolicy=");
        m.append(observerPolicy);
        m.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return m.toString();
    }

    public /* synthetic */ DeviceProximityPolicy(String str, String str2, List list, ObserverPolicy observerPolicy, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : observerPolicy);
    }
}
