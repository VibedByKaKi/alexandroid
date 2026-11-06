package com.amazon.comms.calling.domain.model.dataChannel;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/amazon/comms/calling/domain/model/dataChannel/NewScreenOrientationEvent;", "", ModelSourceWrapper.ORIENTATION, "Lcom/amazon/comms/calling/domain/model/dataChannel/NewScreenOrientation;", "<init>", "(Lcom/amazon/comms/calling/domain/model/dataChannel/NewScreenOrientation;)V", "getOrientation", "()Lcom/amazon/comms/calling/domain/model/dataChannel/NewScreenOrientation;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class NewScreenOrientationEvent {

    @SerializedName(ModelSourceWrapper.ORIENTATION)
    @NotNull
    private final NewScreenOrientation orientation;

    public NewScreenOrientationEvent(@NotNull NewScreenOrientation newScreenOrientation) {
        newScreenOrientation.getClass();
        this.orientation = newScreenOrientation;
    }

    public static /* synthetic */ NewScreenOrientationEvent copy$default(NewScreenOrientationEvent newScreenOrientationEvent, NewScreenOrientation newScreenOrientation, int i, Object obj) {
        if ((i & 1) != 0) {
            newScreenOrientation = newScreenOrientationEvent.orientation;
        }
        return newScreenOrientationEvent.copy(newScreenOrientation);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final NewScreenOrientation getOrientation() {
        return this.orientation;
    }

    @NotNull
    public final NewScreenOrientationEvent copy(@NotNull NewScreenOrientation orientation) {
        orientation.getClass();
        return new NewScreenOrientationEvent(orientation);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NewScreenOrientationEvent) && Intrinsics.areEqual(this.orientation, ((NewScreenOrientationEvent) other).orientation);
    }

    @NotNull
    public final NewScreenOrientation getOrientation() {
        return this.orientation;
    }

    public int hashCode() {
        return this.orientation.hashCode();
    }

    @NotNull
    public String toString() {
        return "NewScreenOrientationEvent(orientation=" + this.orientation + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
