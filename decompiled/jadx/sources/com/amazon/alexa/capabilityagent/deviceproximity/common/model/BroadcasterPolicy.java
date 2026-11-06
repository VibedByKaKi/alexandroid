package com.amazon.alexa.capabilityagent.deviceproximity.common.model;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/BroadcasterPolicy;", "", "type", "Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/BroadcasterPolicyType;", "advertisingIntervalMillis", "", "advertisingDurationMillis", "advertisingPeriodMillis", "<init>", "(Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/BroadcasterPolicyType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lcom/amazon/alexa/capabilityagent/deviceproximity/common/model/BroadcasterPolicyType;", "getAdvertisingIntervalMillis", "()Ljava/lang/String;", "getAdvertisingDurationMillis", "getAdvertisingPeriodMillis", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidCapabilityAgent-DeviceProximity_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BroadcasterPolicy {

    @Nullable
    private final String advertisingDurationMillis;

    @Nullable
    private final String advertisingIntervalMillis;

    @Nullable
    private final String advertisingPeriodMillis;

    @NotNull
    private final BroadcasterPolicyType type;

    public /* synthetic */ BroadcasterPolicy(BroadcasterPolicyType broadcasterPolicyType, String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(broadcasterPolicyType, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    public static /* synthetic */ BroadcasterPolicy copy$default(BroadcasterPolicy broadcasterPolicy, BroadcasterPolicyType broadcasterPolicyType, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            broadcasterPolicyType = broadcasterPolicy.type;
        }
        if ((i & 2) != 0) {
            str = broadcasterPolicy.advertisingIntervalMillis;
        }
        if ((i & 4) != 0) {
            str2 = broadcasterPolicy.advertisingDurationMillis;
        }
        if ((i & 8) != 0) {
            str3 = broadcasterPolicy.advertisingPeriodMillis;
        }
        return broadcasterPolicy.copy(broadcasterPolicyType, str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final BroadcasterPolicyType getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAdvertisingIntervalMillis() {
        return this.advertisingIntervalMillis;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getAdvertisingDurationMillis() {
        return this.advertisingDurationMillis;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getAdvertisingPeriodMillis() {
        return this.advertisingPeriodMillis;
    }

    @NotNull
    public final BroadcasterPolicy copy(@NotNull BroadcasterPolicyType type, @Nullable String advertisingIntervalMillis, @Nullable String advertisingDurationMillis, @Nullable String advertisingPeriodMillis) {
        type.getClass();
        return new BroadcasterPolicy(type, advertisingIntervalMillis, advertisingDurationMillis, advertisingPeriodMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BroadcasterPolicy)) {
            return false;
        }
        BroadcasterPolicy broadcasterPolicy = (BroadcasterPolicy) other;
        return this.type == broadcasterPolicy.type && Intrinsics.areEqual(this.advertisingIntervalMillis, broadcasterPolicy.advertisingIntervalMillis) && Intrinsics.areEqual(this.advertisingDurationMillis, broadcasterPolicy.advertisingDurationMillis) && Intrinsics.areEqual(this.advertisingPeriodMillis, broadcasterPolicy.advertisingPeriodMillis);
    }

    @Nullable
    public final String getAdvertisingDurationMillis() {
        return this.advertisingDurationMillis;
    }

    @Nullable
    public final String getAdvertisingIntervalMillis() {
        return this.advertisingIntervalMillis;
    }

    @Nullable
    public final String getAdvertisingPeriodMillis() {
        return this.advertisingPeriodMillis;
    }

    @NotNull
    public final BroadcasterPolicyType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.advertisingIntervalMillis;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.advertisingDurationMillis;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.advertisingPeriodMillis;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        BroadcasterPolicyType broadcasterPolicyType = this.type;
        String str = this.advertisingIntervalMillis;
        String str2 = this.advertisingDurationMillis;
        String str3 = this.advertisingPeriodMillis;
        StringBuilder sb = new StringBuilder("BroadcasterPolicy(type=");
        sb.append(broadcasterPolicyType);
        sb.append(", advertisingIntervalMillis=");
        sb.append(str);
        sb.append(", advertisingDurationMillis=");
        return DoubleList$$ExternalSyntheticOutline0.m(sb, str2, ", advertisingPeriodMillis=", str3, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public BroadcasterPolicy(@NotNull BroadcasterPolicyType broadcasterPolicyType, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        broadcasterPolicyType.getClass();
        this.type = broadcasterPolicyType;
        this.advertisingIntervalMillis = str;
        this.advertisingDurationMillis = str2;
        this.advertisingPeriodMillis = str3;
    }
}
