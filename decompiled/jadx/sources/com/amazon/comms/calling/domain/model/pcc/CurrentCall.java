package com.amazon.comms.calling.domain.model.pcc;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/amazon/comms/calling/domain/model/pcc/CurrentCall;", "", "callId", "", "callState", "", "<init>", "(ILjava/lang/String;)V", "getCallId", "()I", "getCallState", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class CurrentCall {

    @SerializedName("callId")
    private final int callId;

    @SerializedName("callState")
    @NotNull
    private final String callState;

    public CurrentCall(int i, @NotNull String str) {
        str.getClass();
        this.callId = i;
        this.callState = str;
    }

    public static /* synthetic */ CurrentCall copy$default(CurrentCall currentCall, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = currentCall.callId;
        }
        if ((i2 & 2) != 0) {
            str = currentCall.callState;
        }
        return currentCall.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCallId() {
        return this.callId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getCallState() {
        return this.callState;
    }

    @NotNull
    public final CurrentCall copy(int callId, @NotNull String callState) {
        callState.getClass();
        return new CurrentCall(callId, callState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CurrentCall)) {
            return false;
        }
        CurrentCall currentCall = (CurrentCall) other;
        return this.callId == currentCall.callId && Intrinsics.areEqual(this.callState, currentCall.callState);
    }

    public final int getCallId() {
        return this.callId;
    }

    @NotNull
    public final String getCallState() {
        return this.callState;
    }

    public int hashCode() {
        return this.callState.hashCode() + (Integer.hashCode(this.callId) * 31);
    }

    @NotNull
    public String toString() {
        return DoubleList$$ExternalSyntheticOutline0.m("CurrentCall(callId=", this.callId, ", callState=", this.callState, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
