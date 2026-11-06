package com.amazon.comms.calling.data.dao;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\nHÆ\u0003J]\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\nHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006$"}, d2 = {"Lcom/amazon/comms/calling/data/dao/MediaRelayInfoResponse;", "", "calleeTURNUDP", "Lcom/amazon/comms/calling/data/dao/EndpointConfigurationInfo;", "callerTURNUDP", "calleeTURNTCP", "callerTURNTCP", "calleeSTUN", "callerSTUN", "authToken", "", "<init>", "(Lcom/amazon/comms/calling/data/dao/EndpointConfigurationInfo;Lcom/amazon/comms/calling/data/dao/EndpointConfigurationInfo;Lcom/amazon/comms/calling/data/dao/EndpointConfigurationInfo;Lcom/amazon/comms/calling/data/dao/EndpointConfigurationInfo;Lcom/amazon/comms/calling/data/dao/EndpointConfigurationInfo;Lcom/amazon/comms/calling/data/dao/EndpointConfigurationInfo;Ljava/lang/String;)V", "getCalleeTURNUDP", "()Lcom/amazon/comms/calling/data/dao/EndpointConfigurationInfo;", "getCallerTURNUDP", "getCalleeTURNTCP", "getCallerTURNTCP", "getCalleeSTUN", "getCallerSTUN", "getAuthToken", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class MediaRelayInfoResponse {

    @SerializedName("authToken")
    @Nullable
    private final String authToken;

    @SerializedName("calleeSTUN")
    @Nullable
    private final EndpointConfigurationInfo calleeSTUN;

    @SerializedName("calleeTURNTCP")
    @Nullable
    private final EndpointConfigurationInfo calleeTURNTCP;

    @SerializedName("calleeTURNUDP")
    @Nullable
    private final EndpointConfigurationInfo calleeTURNUDP;

    @SerializedName("callerSTUN")
    @Nullable
    private final EndpointConfigurationInfo callerSTUN;

    @SerializedName("callerTURNTCP")
    @Nullable
    private final EndpointConfigurationInfo callerTURNTCP;

    @SerializedName("callerTURNUDP")
    @Nullable
    private final EndpointConfigurationInfo callerTURNUDP;

    public /* synthetic */ MediaRelayInfoResponse(EndpointConfigurationInfo endpointConfigurationInfo, EndpointConfigurationInfo endpointConfigurationInfo2, EndpointConfigurationInfo endpointConfigurationInfo3, EndpointConfigurationInfo endpointConfigurationInfo4, EndpointConfigurationInfo endpointConfigurationInfo5, EndpointConfigurationInfo endpointConfigurationInfo6, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : endpointConfigurationInfo, (i & 2) != 0 ? null : endpointConfigurationInfo2, (i & 4) != 0 ? null : endpointConfigurationInfo3, (i & 8) != 0 ? null : endpointConfigurationInfo4, (i & 16) != 0 ? null : endpointConfigurationInfo5, (i & 32) != 0 ? null : endpointConfigurationInfo6, (i & 64) != 0 ? null : str);
    }

    public static /* synthetic */ MediaRelayInfoResponse copy$default(MediaRelayInfoResponse mediaRelayInfoResponse, EndpointConfigurationInfo endpointConfigurationInfo, EndpointConfigurationInfo endpointConfigurationInfo2, EndpointConfigurationInfo endpointConfigurationInfo3, EndpointConfigurationInfo endpointConfigurationInfo4, EndpointConfigurationInfo endpointConfigurationInfo5, EndpointConfigurationInfo endpointConfigurationInfo6, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            endpointConfigurationInfo = mediaRelayInfoResponse.calleeTURNUDP;
        }
        if ((i & 2) != 0) {
            endpointConfigurationInfo2 = mediaRelayInfoResponse.callerTURNUDP;
        }
        if ((i & 4) != 0) {
            endpointConfigurationInfo3 = mediaRelayInfoResponse.calleeTURNTCP;
        }
        if ((i & 8) != 0) {
            endpointConfigurationInfo4 = mediaRelayInfoResponse.callerTURNTCP;
        }
        if ((i & 16) != 0) {
            endpointConfigurationInfo5 = mediaRelayInfoResponse.calleeSTUN;
        }
        if ((i & 32) != 0) {
            endpointConfigurationInfo6 = mediaRelayInfoResponse.callerSTUN;
        }
        if ((i & 64) != 0) {
            str = mediaRelayInfoResponse.authToken;
        }
        EndpointConfigurationInfo endpointConfigurationInfo7 = endpointConfigurationInfo6;
        String str2 = str;
        EndpointConfigurationInfo endpointConfigurationInfo8 = endpointConfigurationInfo5;
        EndpointConfigurationInfo endpointConfigurationInfo9 = endpointConfigurationInfo3;
        return mediaRelayInfoResponse.copy(endpointConfigurationInfo, endpointConfigurationInfo2, endpointConfigurationInfo9, endpointConfigurationInfo4, endpointConfigurationInfo8, endpointConfigurationInfo7, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final EndpointConfigurationInfo getCalleeTURNUDP() {
        return this.calleeTURNUDP;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final EndpointConfigurationInfo getCallerTURNUDP() {
        return this.callerTURNUDP;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final EndpointConfigurationInfo getCalleeTURNTCP() {
        return this.calleeTURNTCP;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final EndpointConfigurationInfo getCallerTURNTCP() {
        return this.callerTURNTCP;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final EndpointConfigurationInfo getCalleeSTUN() {
        return this.calleeSTUN;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final EndpointConfigurationInfo getCallerSTUN() {
        return this.callerSTUN;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getAuthToken() {
        return this.authToken;
    }

    @NotNull
    public final MediaRelayInfoResponse copy(@Nullable EndpointConfigurationInfo calleeTURNUDP, @Nullable EndpointConfigurationInfo callerTURNUDP, @Nullable EndpointConfigurationInfo calleeTURNTCP, @Nullable EndpointConfigurationInfo callerTURNTCP, @Nullable EndpointConfigurationInfo calleeSTUN, @Nullable EndpointConfigurationInfo callerSTUN, @Nullable String authToken) {
        return new MediaRelayInfoResponse(calleeTURNUDP, callerTURNUDP, calleeTURNTCP, callerTURNTCP, calleeSTUN, callerSTUN, authToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaRelayInfoResponse)) {
            return false;
        }
        MediaRelayInfoResponse mediaRelayInfoResponse = (MediaRelayInfoResponse) other;
        return Intrinsics.areEqual(this.calleeTURNUDP, mediaRelayInfoResponse.calleeTURNUDP) && Intrinsics.areEqual(this.callerTURNUDP, mediaRelayInfoResponse.callerTURNUDP) && Intrinsics.areEqual(this.calleeTURNTCP, mediaRelayInfoResponse.calleeTURNTCP) && Intrinsics.areEqual(this.callerTURNTCP, mediaRelayInfoResponse.callerTURNTCP) && Intrinsics.areEqual(this.calleeSTUN, mediaRelayInfoResponse.calleeSTUN) && Intrinsics.areEqual(this.callerSTUN, mediaRelayInfoResponse.callerSTUN) && Intrinsics.areEqual(this.authToken, mediaRelayInfoResponse.authToken);
    }

    @Nullable
    public final String getAuthToken() {
        return this.authToken;
    }

    @Nullable
    public final EndpointConfigurationInfo getCalleeSTUN() {
        return this.calleeSTUN;
    }

    @Nullable
    public final EndpointConfigurationInfo getCalleeTURNTCP() {
        return this.calleeTURNTCP;
    }

    @Nullable
    public final EndpointConfigurationInfo getCalleeTURNUDP() {
        return this.calleeTURNUDP;
    }

    @Nullable
    public final EndpointConfigurationInfo getCallerSTUN() {
        return this.callerSTUN;
    }

    @Nullable
    public final EndpointConfigurationInfo getCallerTURNTCP() {
        return this.callerTURNTCP;
    }

    @Nullable
    public final EndpointConfigurationInfo getCallerTURNUDP() {
        return this.callerTURNUDP;
    }

    public int hashCode() {
        EndpointConfigurationInfo endpointConfigurationInfo = this.calleeTURNUDP;
        int hashCode = (endpointConfigurationInfo == null ? 0 : endpointConfigurationInfo.hashCode()) * 31;
        EndpointConfigurationInfo endpointConfigurationInfo2 = this.callerTURNUDP;
        int hashCode2 = (hashCode + (endpointConfigurationInfo2 == null ? 0 : endpointConfigurationInfo2.hashCode())) * 31;
        EndpointConfigurationInfo endpointConfigurationInfo3 = this.calleeTURNTCP;
        int hashCode3 = (hashCode2 + (endpointConfigurationInfo3 == null ? 0 : endpointConfigurationInfo3.hashCode())) * 31;
        EndpointConfigurationInfo endpointConfigurationInfo4 = this.callerTURNTCP;
        int hashCode4 = (hashCode3 + (endpointConfigurationInfo4 == null ? 0 : endpointConfigurationInfo4.hashCode())) * 31;
        EndpointConfigurationInfo endpointConfigurationInfo5 = this.calleeSTUN;
        int hashCode5 = (hashCode4 + (endpointConfigurationInfo5 == null ? 0 : endpointConfigurationInfo5.hashCode())) * 31;
        EndpointConfigurationInfo endpointConfigurationInfo6 = this.callerSTUN;
        int hashCode6 = (hashCode5 + (endpointConfigurationInfo6 == null ? 0 : endpointConfigurationInfo6.hashCode())) * 31;
        String str = this.authToken;
        return hashCode6 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        EndpointConfigurationInfo endpointConfigurationInfo = this.calleeTURNUDP;
        EndpointConfigurationInfo endpointConfigurationInfo2 = this.callerTURNUDP;
        EndpointConfigurationInfo endpointConfigurationInfo3 = this.calleeTURNTCP;
        EndpointConfigurationInfo endpointConfigurationInfo4 = this.callerTURNTCP;
        EndpointConfigurationInfo endpointConfigurationInfo5 = this.calleeSTUN;
        EndpointConfigurationInfo endpointConfigurationInfo6 = this.callerSTUN;
        String str = this.authToken;
        StringBuilder sb = new StringBuilder("MediaRelayInfoResponse(calleeTURNUDP=");
        sb.append(endpointConfigurationInfo);
        sb.append(", callerTURNUDP=");
        sb.append(endpointConfigurationInfo2);
        sb.append(", calleeTURNTCP=");
        sb.append(endpointConfigurationInfo3);
        sb.append(", callerTURNTCP=");
        sb.append(endpointConfigurationInfo4);
        sb.append(", calleeSTUN=");
        sb.append(endpointConfigurationInfo5);
        sb.append(", callerSTUN=");
        sb.append(endpointConfigurationInfo6);
        sb.append(", authToken=");
        return a$$ExternalSyntheticOutline0.m(sb, str, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public MediaRelayInfoResponse(@Nullable EndpointConfigurationInfo endpointConfigurationInfo, @Nullable EndpointConfigurationInfo endpointConfigurationInfo2, @Nullable EndpointConfigurationInfo endpointConfigurationInfo3, @Nullable EndpointConfigurationInfo endpointConfigurationInfo4, @Nullable EndpointConfigurationInfo endpointConfigurationInfo5, @Nullable EndpointConfigurationInfo endpointConfigurationInfo6, @Nullable String str) {
        this.calleeTURNUDP = endpointConfigurationInfo;
        this.callerTURNUDP = endpointConfigurationInfo2;
        this.calleeTURNTCP = endpointConfigurationInfo3;
        this.callerTURNTCP = endpointConfigurationInfo4;
        this.calleeSTUN = endpointConfigurationInfo5;
        this.callerSTUN = endpointConfigurationInfo6;
        this.authToken = str;
    }

    public MediaRelayInfoResponse() {
        this(null, null, null, null, null, null, null, 127, null);
    }
}
