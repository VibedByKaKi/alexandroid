package com.amazon.comms.calling.domain.model.dataChannel.calling;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/comms/calling/domain/model/dataChannel/calling/PipEvent;", "", "requestId", "", "visibility", "Lcom/amazon/comms/calling/domain/model/dataChannel/calling/Visibility;", "<init>", "(Ljava/lang/String;Lcom/amazon/comms/calling/domain/model/dataChannel/calling/Visibility;)V", "getRequestId", "()Ljava/lang/String;", "getVisibility", "()Lcom/amazon/comms/calling/domain/model/dataChannel/calling/Visibility;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class PipEvent {

    @SerializedName("requestId")
    @NotNull
    private final String requestId;

    @SerializedName("visibility")
    @NotNull
    private final Visibility visibility;

    public PipEvent(@NotNull String str, @NotNull Visibility visibility) {
        str.getClass();
        visibility.getClass();
        this.requestId = str;
        this.visibility = visibility;
    }

    public static /* synthetic */ PipEvent copy$default(PipEvent pipEvent, String str, Visibility visibility, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pipEvent.requestId;
        }
        if ((i & 2) != 0) {
            visibility = pipEvent.visibility;
        }
        return pipEvent.copy(str, visibility);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final Visibility getVisibility() {
        return this.visibility;
    }

    @NotNull
    public final PipEvent copy(@NotNull String requestId, @NotNull Visibility visibility) {
        requestId.getClass();
        visibility.getClass();
        return new PipEvent(requestId, visibility);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PipEvent)) {
            return false;
        }
        PipEvent pipEvent = (PipEvent) other;
        return Intrinsics.areEqual(this.requestId, pipEvent.requestId) && this.visibility == pipEvent.visibility;
    }

    @NotNull
    public final String getRequestId() {
        return this.requestId;
    }

    @NotNull
    public final Visibility getVisibility() {
        return this.visibility;
    }

    public int hashCode() {
        return this.visibility.hashCode() + (this.requestId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "PipEvent(requestId=" + this.requestId + ", visibility=" + this.visibility + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
