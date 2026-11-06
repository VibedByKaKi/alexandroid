package com.amazon.comms.calling.domain.model.dataChannel;

import android.view.MotionEvent;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/comms/calling/domain/model/dataChannel/ScreenEvent;", "", "pointerCoords", "Landroid/view/MotionEvent$PointerCoords;", "action", "", "<init>", "(Landroid/view/MotionEvent$PointerCoords;Ljava/lang/String;)V", "getPointerCoords", "()Landroid/view/MotionEvent$PointerCoords;", "getAction", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class ScreenEvent {

    @SerializedName("action")
    @NotNull
    private final String action;

    @SerializedName("pointerCoords")
    @NotNull
    private final MotionEvent.PointerCoords pointerCoords;

    public ScreenEvent(@NotNull MotionEvent.PointerCoords pointerCoords, @NotNull String str) {
        pointerCoords.getClass();
        str.getClass();
        this.pointerCoords = pointerCoords;
        this.action = str;
    }

    public static /* synthetic */ ScreenEvent copy$default(ScreenEvent screenEvent, MotionEvent.PointerCoords pointerCoords, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            pointerCoords = screenEvent.pointerCoords;
        }
        if ((i & 2) != 0) {
            str = screenEvent.action;
        }
        return screenEvent.copy(pointerCoords, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final MotionEvent.PointerCoords getPointerCoords() {
        return this.pointerCoords;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final ScreenEvent copy(@NotNull MotionEvent.PointerCoords pointerCoords, @NotNull String action) {
        pointerCoords.getClass();
        action.getClass();
        return new ScreenEvent(pointerCoords, action);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScreenEvent)) {
            return false;
        }
        ScreenEvent screenEvent = (ScreenEvent) other;
        return Intrinsics.areEqual(this.pointerCoords, screenEvent.pointerCoords) && Intrinsics.areEqual(this.action, screenEvent.action);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final MotionEvent.PointerCoords getPointerCoords() {
        return this.pointerCoords;
    }

    public int hashCode() {
        return this.action.hashCode() + (this.pointerCoords.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ScreenEvent(pointerCoords=" + this.pointerCoords + ", action=" + this.action + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
