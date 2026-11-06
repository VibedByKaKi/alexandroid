package com.amazon.comms.calling.data.dao;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import defpackage.c;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0011R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/amazon/comms/calling/data/dao/InitiateOutboundCallRequest;", "", "callTarget", "Lcom/amazon/comms/calling/data/dao/CallTarget;", "clientMetricsInfo", "Lcom/amazon/comms/calling/data/dao/ClientMetricsInfo;", "isDropIn", "", "callMediaStreams", "", "", "<init>", "(Lcom/amazon/comms/calling/data/dao/CallTarget;Lcom/amazon/comms/calling/data/dao/ClientMetricsInfo;ZLjava/util/List;)V", "getCallTarget", "()Lcom/amazon/comms/calling/data/dao/CallTarget;", "getClientMetricsInfo", "()Lcom/amazon/comms/calling/data/dao/ClientMetricsInfo;", "()Z", "getCallMediaStreams", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class InitiateOutboundCallRequest {

    @SerializedName("callMediaStreams")
    @NotNull
    private final List<String> callMediaStreams;

    @SerializedName("callTarget")
    @NotNull
    private final CallTarget callTarget;

    @SerializedName("clientMetricsInfo")
    @NotNull
    private final ClientMetricsInfo clientMetricsInfo;

    @SerializedName("isDropIn")
    private final boolean isDropIn;

    public InitiateOutboundCallRequest(@NotNull CallTarget callTarget, @NotNull ClientMetricsInfo clientMetricsInfo, boolean z, @NotNull List<String> list) {
        callTarget.getClass();
        clientMetricsInfo.getClass();
        list.getClass();
        this.callTarget = callTarget;
        this.clientMetricsInfo = clientMetricsInfo;
        this.isDropIn = z;
        this.callMediaStreams = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InitiateOutboundCallRequest copy$default(InitiateOutboundCallRequest initiateOutboundCallRequest, CallTarget callTarget, ClientMetricsInfo clientMetricsInfo, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            callTarget = initiateOutboundCallRequest.callTarget;
        }
        if ((i & 2) != 0) {
            clientMetricsInfo = initiateOutboundCallRequest.clientMetricsInfo;
        }
        if ((i & 4) != 0) {
            z = initiateOutboundCallRequest.isDropIn;
        }
        if ((i & 8) != 0) {
            list = initiateOutboundCallRequest.callMediaStreams;
        }
        return initiateOutboundCallRequest.copy(callTarget, clientMetricsInfo, z, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CallTarget getCallTarget() {
        return this.callTarget;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ClientMetricsInfo getClientMetricsInfo() {
        return this.clientMetricsInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsDropIn() {
        return this.isDropIn;
    }

    @NotNull
    public final List<String> component4() {
        return this.callMediaStreams;
    }

    @NotNull
    public final InitiateOutboundCallRequest copy(@NotNull CallTarget callTarget, @NotNull ClientMetricsInfo clientMetricsInfo, boolean isDropIn, @NotNull List<String> callMediaStreams) {
        callTarget.getClass();
        clientMetricsInfo.getClass();
        callMediaStreams.getClass();
        return new InitiateOutboundCallRequest(callTarget, clientMetricsInfo, isDropIn, callMediaStreams);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InitiateOutboundCallRequest)) {
            return false;
        }
        InitiateOutboundCallRequest initiateOutboundCallRequest = (InitiateOutboundCallRequest) other;
        return Intrinsics.areEqual(this.callTarget, initiateOutboundCallRequest.callTarget) && Intrinsics.areEqual(this.clientMetricsInfo, initiateOutboundCallRequest.clientMetricsInfo) && this.isDropIn == initiateOutboundCallRequest.isDropIn && Intrinsics.areEqual(this.callMediaStreams, initiateOutboundCallRequest.callMediaStreams);
    }

    @NotNull
    public final List<String> getCallMediaStreams() {
        return this.callMediaStreams;
    }

    @NotNull
    public final CallTarget getCallTarget() {
        return this.callTarget;
    }

    @NotNull
    public final ClientMetricsInfo getClientMetricsInfo() {
        return this.clientMetricsInfo;
    }

    public int hashCode() {
        return this.callMediaStreams.hashCode() + c.a(this.isDropIn, (this.clientMetricsInfo.hashCode() + (this.callTarget.hashCode() * 31)) * 31, 31);
    }

    public final boolean isDropIn() {
        return this.isDropIn;
    }

    @NotNull
    public String toString() {
        return "InitiateOutboundCallRequest(callTarget=" + this.callTarget + ", clientMetricsInfo=" + this.clientMetricsInfo + ", isDropIn=" + this.isDropIn + ", callMediaStreams=" + this.callMediaStreams + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
