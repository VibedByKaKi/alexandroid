package com.amazon.comms.calling.domain.model.dataChannel;

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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/comms/calling/domain/model/dataChannel/AckEvent;", "", "requestId", "", "effectsSessionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getRequestId", "()Ljava/lang/String;", "getEffectsSessionId", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class AckEvent {

    @SerializedName("effectsSessionId")
    @Nullable
    private final String effectsSessionId;

    @SerializedName("requestId")
    @NotNull
    private final String requestId;

    public AckEvent(@NotNull String str, @Nullable String str2) {
        str.getClass();
        this.requestId = str;
        this.effectsSessionId = str2;
    }

    public static /* synthetic */ AckEvent copy$default(AckEvent ackEvent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ackEvent.requestId;
        }
        if ((i & 2) != 0) {
            str2 = ackEvent.effectsSessionId;
        }
        return ackEvent.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getEffectsSessionId() {
        return this.effectsSessionId;
    }

    @NotNull
    public final AckEvent copy(@NotNull String requestId, @Nullable String effectsSessionId) {
        requestId.getClass();
        return new AckEvent(requestId, effectsSessionId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AckEvent)) {
            return false;
        }
        AckEvent ackEvent = (AckEvent) other;
        return Intrinsics.areEqual(this.requestId, ackEvent.requestId) && Intrinsics.areEqual(this.effectsSessionId, ackEvent.effectsSessionId);
    }

    @Nullable
    public final String getEffectsSessionId() {
        return this.effectsSessionId;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    public int hashCode() {
        int hashCode = this.requestId.hashCode() * 31;
        String str = this.effectsSessionId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("AckEvent(requestId=", this.requestId, ", effectsSessionId=", this.effectsSessionId, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ AckEvent(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
