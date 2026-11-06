package com.amazon.comms.calling.domain.model.pcc;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/comms/calling/domain/model/pcc/PCCEventPayload;", "", "callId", "", "error", "Lcom/amazon/comms/calling/domain/model/pcc/PCCError;", "<init>", "(ILcom/amazon/comms/calling/domain/model/pcc/PCCError;)V", "getCallId", "()I", "getError", "()Lcom/amazon/comms/calling/domain/model/pcc/PCCError;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class PCCEventPayload {

    @SerializedName("callId")
    private final int callId;

    @SerializedName("error")
    @Nullable
    private final PCCError error;

    public /* synthetic */ PCCEventPayload(int i, PCCError pCCError, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : pCCError);
    }

    public static /* synthetic */ PCCEventPayload copy$default(PCCEventPayload pCCEventPayload, int i, PCCError pCCError, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pCCEventPayload.callId;
        }
        if ((i2 & 2) != 0) {
            pCCError = pCCEventPayload.error;
        }
        return pCCEventPayload.copy(i, pCCError);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCallId() {
        return this.callId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final PCCError getError() {
        return this.error;
    }

    @NotNull
    public final PCCEventPayload copy(int callId, @Nullable PCCError error) {
        return new PCCEventPayload(callId, error);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PCCEventPayload)) {
            return false;
        }
        PCCEventPayload pCCEventPayload = (PCCEventPayload) other;
        return this.callId == pCCEventPayload.callId && Intrinsics.areEqual(this.error, pCCEventPayload.error);
    }

    public final int getCallId() {
        return this.callId;
    }

    @Nullable
    public final PCCError getError() {
        return this.error;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.callId) * 31;
        PCCError pCCError = this.error;
        return hashCode + (pCCError == null ? 0 : pCCError.hashCode());
    }

    @NotNull
    public String toString() {
        return "PCCEventPayload(callId=" + this.callId + ", error=" + this.error + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public PCCEventPayload(int i, @Nullable PCCError pCCError) {
        this.callId = i;
        this.error = pCCError;
    }
}
