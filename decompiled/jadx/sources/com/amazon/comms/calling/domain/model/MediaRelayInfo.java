package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/comms/calling/domain/model/MediaRelayInfo;", "", "calleeEndpoint", "Lcom/amazon/comms/calling/domain/model/Endpoint;", "callerEndpoint", "<init>", "(Lcom/amazon/comms/calling/domain/model/Endpoint;Lcom/amazon/comms/calling/domain/model/Endpoint;)V", "getCalleeEndpoint", "()Lcom/amazon/comms/calling/domain/model/Endpoint;", "getCallerEndpoint", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class MediaRelayInfo {

    @SerializedName("calleeEndpoint")
    @Nullable
    private final Endpoint calleeEndpoint;

    @SerializedName("callerEndpoint")
    @Nullable
    private final Endpoint callerEndpoint;

    public /* synthetic */ MediaRelayInfo(Endpoint endpoint, Endpoint endpoint2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : endpoint, (i & 2) != 0 ? null : endpoint2);
    }

    public static /* synthetic */ MediaRelayInfo copy$default(MediaRelayInfo mediaRelayInfo, Endpoint endpoint, Endpoint endpoint2, int i, Object obj) {
        if ((i & 1) != 0) {
            endpoint = mediaRelayInfo.calleeEndpoint;
        }
        if ((i & 2) != 0) {
            endpoint2 = mediaRelayInfo.callerEndpoint;
        }
        return mediaRelayInfo.copy(endpoint, endpoint2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Endpoint getCalleeEndpoint() {
        return this.calleeEndpoint;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Endpoint getCallerEndpoint() {
        return this.callerEndpoint;
    }

    @NotNull
    public final MediaRelayInfo copy(@Nullable Endpoint calleeEndpoint, @Nullable Endpoint callerEndpoint) {
        return new MediaRelayInfo(calleeEndpoint, callerEndpoint);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaRelayInfo)) {
            return false;
        }
        MediaRelayInfo mediaRelayInfo = (MediaRelayInfo) other;
        return Intrinsics.areEqual(this.calleeEndpoint, mediaRelayInfo.calleeEndpoint) && Intrinsics.areEqual(this.callerEndpoint, mediaRelayInfo.callerEndpoint);
    }

    @Nullable
    public final Endpoint getCalleeEndpoint() {
        return this.calleeEndpoint;
    }

    @Nullable
    public final Endpoint getCallerEndpoint() {
        return this.callerEndpoint;
    }

    public int hashCode() {
        Endpoint endpoint = this.calleeEndpoint;
        int hashCode = (endpoint == null ? 0 : endpoint.hashCode()) * 31;
        Endpoint endpoint2 = this.callerEndpoint;
        return hashCode + (endpoint2 != null ? endpoint2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MediaRelayInfo(calleeEndpoint=" + this.calleeEndpoint + ", callerEndpoint=" + this.callerEndpoint + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public MediaRelayInfo(@Nullable Endpoint endpoint, @Nullable Endpoint endpoint2) {
        this.calleeEndpoint = endpoint;
        this.callerEndpoint = endpoint2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaRelayInfo() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
