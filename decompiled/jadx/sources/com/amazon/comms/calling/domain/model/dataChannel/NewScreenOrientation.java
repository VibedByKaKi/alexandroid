package com.amazon.comms.calling.domain.model.dataChannel;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.comms.calling.domain.model.CallOrientation;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/comms/calling/domain/model/dataChannel/NewScreenOrientation;", "", "from", "Lcom/amazon/comms/calling/domain/model/CallOrientation;", TypedValues.TransitionType.S_TO, "<init>", "(Lcom/amazon/comms/calling/domain/model/CallOrientation;Lcom/amazon/comms/calling/domain/model/CallOrientation;)V", "getFrom", "()Lcom/amazon/comms/calling/domain/model/CallOrientation;", "getTo", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class NewScreenOrientation {

    @SerializedName("from")
    @NotNull
    private final CallOrientation from;

    @SerializedName(TypedValues.TransitionType.S_TO)
    @NotNull
    private final CallOrientation to;

    public NewScreenOrientation(@NotNull CallOrientation callOrientation, @NotNull CallOrientation callOrientation2) {
        callOrientation.getClass();
        callOrientation2.getClass();
        this.from = callOrientation;
        this.to = callOrientation2;
    }

    public static /* synthetic */ NewScreenOrientation copy$default(NewScreenOrientation newScreenOrientation, CallOrientation callOrientation, CallOrientation callOrientation2, int i, Object obj) {
        if ((i & 1) != 0) {
            callOrientation = newScreenOrientation.from;
        }
        if ((i & 2) != 0) {
            callOrientation2 = newScreenOrientation.to;
        }
        return newScreenOrientation.copy(callOrientation, callOrientation2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CallOrientation getFrom() {
        return this.from;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CallOrientation getTo() {
        return this.to;
    }

    @NotNull
    public final NewScreenOrientation copy(@NotNull CallOrientation from, @NotNull CallOrientation to) {
        from.getClass();
        to.getClass();
        return new NewScreenOrientation(from, to);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewScreenOrientation)) {
            return false;
        }
        NewScreenOrientation newScreenOrientation = (NewScreenOrientation) other;
        return this.from == newScreenOrientation.from && this.to == newScreenOrientation.to;
    }

    @NotNull
    public final CallOrientation getFrom() {
        return this.from;
    }

    @NotNull
    public final CallOrientation getTo() {
        return this.to;
    }

    public int hashCode() {
        return this.to.hashCode() + (this.from.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "NewScreenOrientation(from=" + this.from + ", to=" + this.to + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
