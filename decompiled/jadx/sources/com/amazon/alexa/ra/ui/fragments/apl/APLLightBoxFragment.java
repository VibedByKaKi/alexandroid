package com.amazon.alexa.ra.ui.fragments.apl;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.apl.handler.event.LoadIndexListDataEventHandler;
import com.amazon.alexa.ra.apl.fragments.data.APLFragmentData;
import com.amazon.alexa.ra.core.ui.lightbox.LightBoxResult;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/ui/fragments/apl/APLLightBoxFragment;", "Lcom/amazon/alexa/ra/core/ui/lightbox/LightBoxResult;", "fullScreenFragments", "", "Lcom/amazon/alexa/ra/apl/fragments/data/APLFragmentData;", LoadIndexListDataEventHandler.START_INDEX_KEY, "", "<init>", "(Ljava/util/List;I)V", "getFullScreenFragments", "()Ljava/util/List;", "getStartIndex", "()I", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "", "AVSMobileFramework-ra-android-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class APLLightBoxFragment implements LightBoxResult {
    public static final int $stable = 8;

    @NotNull
    private final List<APLFragmentData> fullScreenFragments;
    private final int startIndex;

    public APLLightBoxFragment(@NotNull List<APLFragmentData> list, int i) {
        list.getClass();
        this.fullScreenFragments = list;
        this.startIndex = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ APLLightBoxFragment copy$default(APLLightBoxFragment aPLLightBoxFragment, List list, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = aPLLightBoxFragment.fullScreenFragments;
        }
        if ((i2 & 2) != 0) {
            i = aPLLightBoxFragment.startIndex;
        }
        return aPLLightBoxFragment.copy(list, i);
    }

    @NotNull
    public final List<APLFragmentData> component1() {
        return this.fullScreenFragments;
    }

    /* renamed from: component2, reason: from getter */
    public final int getStartIndex() {
        return this.startIndex;
    }

    @NotNull
    public final APLLightBoxFragment copy(@NotNull List<APLFragmentData> fullScreenFragments, int startIndex) {
        fullScreenFragments.getClass();
        return new APLLightBoxFragment(fullScreenFragments, startIndex);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof APLLightBoxFragment)) {
            return false;
        }
        APLLightBoxFragment aPLLightBoxFragment = (APLLightBoxFragment) other;
        return Intrinsics.areEqual(this.fullScreenFragments, aPLLightBoxFragment.fullScreenFragments) && this.startIndex == aPLLightBoxFragment.startIndex;
    }

    @NotNull
    public final List<APLFragmentData> getFullScreenFragments() {
        return this.fullScreenFragments;
    }

    public final int getStartIndex() {
        return this.startIndex;
    }

    public int hashCode() {
        return Integer.hashCode(this.startIndex) + (this.fullScreenFragments.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "APLLightBoxFragment(fullScreenFragments=" + this.fullScreenFragments + ", startIndex=" + this.startIndex + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ APLLightBoxFragment(List list, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i2 & 2) != 0 ? 0 : i);
    }
}
