package com.amazon.comms.calling.data.dao;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/amazon/comms/calling/data/dao/GetMPUEnabledResponse;", "", "enabled", "", "enhancedProcessing", "", "<init>", "(ZLjava/lang/String;)V", "getEnabled", "()Z", "getEnhancedProcessing", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class GetMPUEnabledResponse {

    @SerializedName("enabled")
    private final boolean enabled;

    @SerializedName("enhancedProcessing")
    @NotNull
    private final String enhancedProcessing;

    public /* synthetic */ GetMPUEnabledResponse(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }

    public static /* synthetic */ GetMPUEnabledResponse copy$default(GetMPUEnabledResponse getMPUEnabledResponse, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getMPUEnabledResponse.enabled;
        }
        if ((i & 2) != 0) {
            str = getMPUEnabledResponse.enhancedProcessing;
        }
        return getMPUEnabledResponse.copy(z, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEnhancedProcessing() {
        return this.enhancedProcessing;
    }

    @NotNull
    public final GetMPUEnabledResponse copy(boolean enabled, @NotNull String enhancedProcessing) {
        enhancedProcessing.getClass();
        return new GetMPUEnabledResponse(enabled, enhancedProcessing);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetMPUEnabledResponse)) {
            return false;
        }
        GetMPUEnabledResponse getMPUEnabledResponse = (GetMPUEnabledResponse) other;
        return this.enabled == getMPUEnabledResponse.enabled && Intrinsics.areEqual(this.enhancedProcessing, getMPUEnabledResponse.enhancedProcessing);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final String getEnhancedProcessing() {
        return this.enhancedProcessing;
    }

    public int hashCode() {
        return this.enhancedProcessing.hashCode() + (Boolean.hashCode(this.enabled) * 31);
    }

    @NotNull
    public String toString() {
        return "GetMPUEnabledResponse(enabled=" + this.enabled + ", enhancedProcessing=" + this.enhancedProcessing + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public GetMPUEnabledResponse(boolean z, @NotNull String str) {
        str.getClass();
        this.enabled = z;
        this.enhancedProcessing = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GetMPUEnabledResponse() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
