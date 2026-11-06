package com.mapbox.maps.extension.observable.eventdata;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import com.mapbox.maps.extension.observable.model.RenderMode;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated(level = DeprecationLevel.WARNING, message = "This data class is deprecated, and will be removed in next major release.", replaceWith = @ReplaceWith(expression = "RenderFrameFinished", imports = {}))
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003JB\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/mapbox/maps/extension/observable/eventdata/RenderFrameFinishedEventData;", "", "begin", "", "end", "renderMode", "Lcom/mapbox/maps/extension/observable/model/RenderMode;", "needsRepaint", "", "placementChanged", "(JLjava/lang/Long;Lcom/mapbox/maps/extension/observable/model/RenderMode;ZZ)V", "getBegin", "()J", "getEnd", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNeedsRepaint", "()Z", "getPlacementChanged", "getRenderMode", "()Lcom/mapbox/maps/extension/observable/model/RenderMode;", "component1", "component2", "component3", "component4", "component5", "copy", "(JLjava/lang/Long;Lcom/mapbox/maps/extension/observable/model/RenderMode;ZZ)Lcom/mapbox/maps/extension/observable/eventdata/RenderFrameFinishedEventData;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class RenderFrameFinishedEventData {

    @SerializedName("begin")
    private final long begin;

    @SerializedName("end")
    @Nullable
    private final Long end;

    @SerializedName("needs-repaint")
    private final boolean needsRepaint;

    @SerializedName("placement-changed")
    private final boolean placementChanged;

    @SerializedName("render-mode")
    @NotNull
    private final RenderMode renderMode;

    public RenderFrameFinishedEventData(long j, @Nullable Long l, @NotNull RenderMode renderMode, boolean z, boolean z2) {
        renderMode.getClass();
        this.begin = j;
        this.end = l;
        this.renderMode = renderMode;
        this.needsRepaint = z;
        this.placementChanged = z2;
    }

    public static /* synthetic */ RenderFrameFinishedEventData copy$default(RenderFrameFinishedEventData renderFrameFinishedEventData, long j, Long l, RenderMode renderMode, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = renderFrameFinishedEventData.begin;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            l = renderFrameFinishedEventData.end;
        }
        Long l2 = l;
        if ((i & 4) != 0) {
            renderMode = renderFrameFinishedEventData.renderMode;
        }
        RenderMode renderMode2 = renderMode;
        if ((i & 8) != 0) {
            z = renderFrameFinishedEventData.needsRepaint;
        }
        boolean z3 = z;
        if ((i & 16) != 0) {
            z2 = renderFrameFinishedEventData.placementChanged;
        }
        return renderFrameFinishedEventData.copy(j2, l2, renderMode2, z3, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getBegin() {
        return this.begin;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Long getEnd() {
        return this.end;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final RenderMode getRenderMode() {
        return this.renderMode;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getNeedsRepaint() {
        return this.needsRepaint;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getPlacementChanged() {
        return this.placementChanged;
    }

    @NotNull
    public final RenderFrameFinishedEventData copy(long begin, @Nullable Long end, @NotNull RenderMode renderMode, boolean needsRepaint, boolean placementChanged) {
        renderMode.getClass();
        return new RenderFrameFinishedEventData(begin, end, renderMode, needsRepaint, placementChanged);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderFrameFinishedEventData)) {
            return false;
        }
        RenderFrameFinishedEventData renderFrameFinishedEventData = (RenderFrameFinishedEventData) other;
        return this.begin == renderFrameFinishedEventData.begin && Intrinsics.areEqual(this.end, renderFrameFinishedEventData.end) && this.renderMode == renderFrameFinishedEventData.renderMode && this.needsRepaint == renderFrameFinishedEventData.needsRepaint && this.placementChanged == renderFrameFinishedEventData.placementChanged;
    }

    public final long getBegin() {
        return this.begin;
    }

    @Nullable
    public final Long getEnd() {
        return this.end;
    }

    public final boolean getNeedsRepaint() {
        return this.needsRepaint;
    }

    public final boolean getPlacementChanged() {
        return this.placementChanged;
    }

    @NotNull
    public final RenderMode getRenderMode() {
        return this.renderMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = Long.hashCode(this.begin) * 31;
        Long l = this.end;
        int hashCode2 = (this.renderMode.hashCode() + ((hashCode + (l == null ? 0 : l.hashCode())) * 31)) * 31;
        boolean z = this.needsRepaint;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z2 = this.placementChanged;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("RenderFrameFinishedEventData(begin=");
        sb.append(this.begin);
        sb.append(", end=");
        sb.append(this.end);
        sb.append(", renderMode=");
        sb.append(this.renderMode);
        sb.append(", needsRepaint=");
        sb.append(this.needsRepaint);
        sb.append(", placementChanged=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, this.placementChanged, ')');
    }
}
