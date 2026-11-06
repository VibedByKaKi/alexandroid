package com.amazon.rtvi.mobile.orchestrator;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaMetricsName$Pryon$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/amazon/rtvi/mobile/orchestrator/FrameAddons;", "", "frameId", "", "subframeIds", "", "enrichmentIds", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getFrameId", "()Ljava/lang/String;", "getSubframeIds", "()Ljava/util/List;", "getEnrichmentIds", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "Orchestrator_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class FrameAddons {

    @NotNull
    private final List<String> enrichmentIds;

    @NotNull
    private final String frameId;

    @NotNull
    private final List<String> subframeIds;

    public FrameAddons(@NotNull String str, @NotNull List<String> list, @NotNull List<String> list2) {
        str.getClass();
        list.getClass();
        list2.getClass();
        this.frameId = str;
        this.subframeIds = list;
        this.enrichmentIds = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FrameAddons copy$default(FrameAddons frameAddons, String str, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = frameAddons.frameId;
        }
        if ((i & 2) != 0) {
            list = frameAddons.subframeIds;
        }
        if ((i & 4) != 0) {
            list2 = frameAddons.enrichmentIds;
        }
        return frameAddons.copy(str, list, list2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFrameId() {
        return this.frameId;
    }

    @NotNull
    public final List<String> component2() {
        return this.subframeIds;
    }

    @NotNull
    public final List<String> component3() {
        return this.enrichmentIds;
    }

    @NotNull
    public final FrameAddons copy(@NotNull String frameId, @NotNull List<String> subframeIds, @NotNull List<String> enrichmentIds) {
        frameId.getClass();
        subframeIds.getClass();
        enrichmentIds.getClass();
        return new FrameAddons(frameId, subframeIds, enrichmentIds);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrameAddons)) {
            return false;
        }
        FrameAddons frameAddons = (FrameAddons) other;
        return Intrinsics.areEqual(this.frameId, frameAddons.frameId) && Intrinsics.areEqual(this.subframeIds, frameAddons.subframeIds) && Intrinsics.areEqual(this.enrichmentIds, frameAddons.enrichmentIds);
    }

    @NotNull
    public final List<String> getEnrichmentIds() {
        return this.enrichmentIds;
    }

    @NotNull
    public final String getFrameId() {
        return this.frameId;
    }

    @NotNull
    public final List<String> getSubframeIds() {
        return this.subframeIds;
    }

    public int hashCode() {
        return this.enrichmentIds.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.subframeIds, this.frameId.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, this.enrichmentIds, AlexaMetricsName$Pryon$$ExternalSyntheticOutline0.m14724m("FrameAddons(frameId=", this.frameId, ", subframeIds=", (List) this.subframeIds, ", enrichmentIds="));
    }
}
