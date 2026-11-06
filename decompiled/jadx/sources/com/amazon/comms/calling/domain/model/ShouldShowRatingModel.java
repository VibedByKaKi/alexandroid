package com.amazon.comms.calling.domain.model;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/comms/calling/domain/model/ShouldShowRatingModel;", "", "shouldShowRateCallButton", "", "shouldShowRatingStar", "<init>", "(ZZ)V", "getShouldShowRateCallButton", "()Z", "getShouldShowRatingStar", "component1", "component2", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaCommsCallingUI-Android_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class ShouldShowRatingModel {
    private final boolean shouldShowRateCallButton;
    private final boolean shouldShowRatingStar;

    public ShouldShowRatingModel(boolean z, boolean z2) {
        this.shouldShowRateCallButton = z;
        this.shouldShowRatingStar = z2;
    }

    public static /* synthetic */ ShouldShowRatingModel copy$default(ShouldShowRatingModel shouldShowRatingModel, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = shouldShowRatingModel.shouldShowRateCallButton;
        }
        if ((i & 2) != 0) {
            z2 = shouldShowRatingModel.shouldShowRatingStar;
        }
        return shouldShowRatingModel.copy(z, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShouldShowRateCallButton() {
        return this.shouldShowRateCallButton;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShouldShowRatingStar() {
        return this.shouldShowRatingStar;
    }

    @NotNull
    public final ShouldShowRatingModel copy(boolean shouldShowRateCallButton, boolean shouldShowRatingStar) {
        return new ShouldShowRatingModel(shouldShowRateCallButton, shouldShowRatingStar);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShouldShowRatingModel)) {
            return false;
        }
        ShouldShowRatingModel shouldShowRatingModel = (ShouldShowRatingModel) other;
        return this.shouldShowRateCallButton == shouldShowRatingModel.shouldShowRateCallButton && this.shouldShowRatingStar == shouldShowRatingModel.shouldShowRatingStar;
    }

    public final boolean getShouldShowRateCallButton() {
        return this.shouldShowRateCallButton;
    }

    public final boolean getShouldShowRatingStar() {
        return this.shouldShowRatingStar;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldShowRatingStar) + (Boolean.hashCode(this.shouldShowRateCallButton) * 31);
    }

    @NotNull
    public String toString() {
        return "ShouldShowRatingModel(shouldShowRateCallButton=" + this.shouldShowRateCallButton + ", shouldShowRatingStar=" + this.shouldShowRatingStar + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
