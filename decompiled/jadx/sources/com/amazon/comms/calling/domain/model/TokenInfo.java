package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/amazon/comms/calling/domain/model/TokenInfo;", "", "callTimestamp", "", "callFrom", "Lcom/amazon/comms/calling/domain/model/CallerIdentity;", "callTo", "<init>", "(JLcom/amazon/comms/calling/domain/model/CallerIdentity;Lcom/amazon/comms/calling/domain/model/CallerIdentity;)V", "getCallTimestamp", "()J", "getCallFrom", "()Lcom/amazon/comms/calling/domain/model/CallerIdentity;", "getCallTo", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class TokenInfo {

    @SerializedName("CallFrom")
    @NotNull
    private final CallerIdentity callFrom;

    @SerializedName("CallTimestamp")
    private final long callTimestamp;

    @SerializedName("CallTo")
    @NotNull
    private final CallerIdentity callTo;

    public TokenInfo(long j, @NotNull CallerIdentity callerIdentity, @NotNull CallerIdentity callerIdentity2) {
        callerIdentity.getClass();
        callerIdentity2.getClass();
        this.callTimestamp = j;
        this.callFrom = callerIdentity;
        this.callTo = callerIdentity2;
    }

    public static /* synthetic */ TokenInfo copy$default(TokenInfo tokenInfo, long j, CallerIdentity callerIdentity, CallerIdentity callerIdentity2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = tokenInfo.callTimestamp;
        }
        if ((i & 2) != 0) {
            callerIdentity = tokenInfo.callFrom;
        }
        if ((i & 4) != 0) {
            callerIdentity2 = tokenInfo.callTo;
        }
        return tokenInfo.copy(j, callerIdentity, callerIdentity2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getCallTimestamp() {
        return this.callTimestamp;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CallerIdentity getCallFrom() {
        return this.callFrom;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final CallerIdentity getCallTo() {
        return this.callTo;
    }

    @NotNull
    public final TokenInfo copy(long callTimestamp, @NotNull CallerIdentity callFrom, @NotNull CallerIdentity callTo) {
        callFrom.getClass();
        callTo.getClass();
        return new TokenInfo(callTimestamp, callFrom, callTo);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenInfo)) {
            return false;
        }
        TokenInfo tokenInfo = (TokenInfo) other;
        return this.callTimestamp == tokenInfo.callTimestamp && Intrinsics.areEqual(this.callFrom, tokenInfo.callFrom) && Intrinsics.areEqual(this.callTo, tokenInfo.callTo);
    }

    @NotNull
    public final CallerIdentity getCallFrom() {
        return this.callFrom;
    }

    public final long getCallTimestamp() {
        return this.callTimestamp;
    }

    @NotNull
    public final CallerIdentity getCallTo() {
        return this.callTo;
    }

    public int hashCode() {
        return this.callTo.hashCode() + ((this.callFrom.hashCode() + (Long.hashCode(this.callTimestamp) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "TokenInfo(callTimestamp=" + this.callTimestamp + ", callFrom=" + this.callFrom + ", callTo=" + this.callTo + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
