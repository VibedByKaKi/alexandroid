package com.amazon.alexa.ra.core.data.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/FragmentPaginationUiState;", "", "initialLoadingState", "Lcom/amazon/alexa/ra/core/data/model/FragmentLoadingStatus;", "forwardLoadingState", "backwardLoadingState", "<init>", "(Lcom/amazon/alexa/ra/core/data/model/FragmentLoadingStatus;Lcom/amazon/alexa/ra/core/data/model/FragmentLoadingStatus;Lcom/amazon/alexa/ra/core/data/model/FragmentLoadingStatus;)V", "getInitialLoadingState", "()Lcom/amazon/alexa/ra/core/data/model/FragmentLoadingStatus;", "getForwardLoadingState", "getBackwardLoadingState", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class FragmentPaginationUiState {
    public static final int $stable = 0;

    @NotNull
    private final FragmentLoadingStatus backwardLoadingState;

    @NotNull
    private final FragmentLoadingStatus forwardLoadingState;

    @NotNull
    private final FragmentLoadingStatus initialLoadingState;

    public /* synthetic */ FragmentPaginationUiState(FragmentLoadingStatus fragmentLoadingStatus, FragmentLoadingStatus fragmentLoadingStatus2, FragmentLoadingStatus fragmentLoadingStatus3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? FragmentLoadingStatus.IDLE : fragmentLoadingStatus, (i & 2) != 0 ? FragmentLoadingStatus.IDLE : fragmentLoadingStatus2, (i & 4) != 0 ? FragmentLoadingStatus.IDLE : fragmentLoadingStatus3);
    }

    public static /* synthetic */ FragmentPaginationUiState copy$default(FragmentPaginationUiState fragmentPaginationUiState, FragmentLoadingStatus fragmentLoadingStatus, FragmentLoadingStatus fragmentLoadingStatus2, FragmentLoadingStatus fragmentLoadingStatus3, int i, Object obj) {
        if ((i & 1) != 0) {
            fragmentLoadingStatus = fragmentPaginationUiState.initialLoadingState;
        }
        if ((i & 2) != 0) {
            fragmentLoadingStatus2 = fragmentPaginationUiState.forwardLoadingState;
        }
        if ((i & 4) != 0) {
            fragmentLoadingStatus3 = fragmentPaginationUiState.backwardLoadingState;
        }
        return fragmentPaginationUiState.copy(fragmentLoadingStatus, fragmentLoadingStatus2, fragmentLoadingStatus3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final FragmentLoadingStatus getInitialLoadingState() {
        return this.initialLoadingState;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FragmentLoadingStatus getForwardLoadingState() {
        return this.forwardLoadingState;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final FragmentLoadingStatus getBackwardLoadingState() {
        return this.backwardLoadingState;
    }

    @NotNull
    public final FragmentPaginationUiState copy(@NotNull FragmentLoadingStatus initialLoadingState, @NotNull FragmentLoadingStatus forwardLoadingState, @NotNull FragmentLoadingStatus backwardLoadingState) {
        initialLoadingState.getClass();
        forwardLoadingState.getClass();
        backwardLoadingState.getClass();
        return new FragmentPaginationUiState(initialLoadingState, forwardLoadingState, backwardLoadingState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FragmentPaginationUiState)) {
            return false;
        }
        FragmentPaginationUiState fragmentPaginationUiState = (FragmentPaginationUiState) other;
        return this.initialLoadingState == fragmentPaginationUiState.initialLoadingState && this.forwardLoadingState == fragmentPaginationUiState.forwardLoadingState && this.backwardLoadingState == fragmentPaginationUiState.backwardLoadingState;
    }

    @NotNull
    public final FragmentLoadingStatus getBackwardLoadingState() {
        return this.backwardLoadingState;
    }

    @NotNull
    public final FragmentLoadingStatus getForwardLoadingState() {
        return this.forwardLoadingState;
    }

    @NotNull
    public final FragmentLoadingStatus getInitialLoadingState() {
        return this.initialLoadingState;
    }

    public int hashCode() {
        return this.backwardLoadingState.hashCode() + ((this.forwardLoadingState.hashCode() + (this.initialLoadingState.hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "FragmentPaginationUiState(initialLoadingState=" + this.initialLoadingState + ", forwardLoadingState=" + this.forwardLoadingState + ", backwardLoadingState=" + this.backwardLoadingState + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public FragmentPaginationUiState(@NotNull FragmentLoadingStatus fragmentLoadingStatus, @NotNull FragmentLoadingStatus fragmentLoadingStatus2, @NotNull FragmentLoadingStatus fragmentLoadingStatus3) {
        fragmentLoadingStatus.getClass();
        fragmentLoadingStatus2.getClass();
        fragmentLoadingStatus3.getClass();
        this.initialLoadingState = fragmentLoadingStatus;
        this.forwardLoadingState = fragmentLoadingStatus2;
        this.backwardLoadingState = fragmentLoadingStatus3;
    }

    public FragmentPaginationUiState() {
        this(null, null, null, 7, null);
    }
}
