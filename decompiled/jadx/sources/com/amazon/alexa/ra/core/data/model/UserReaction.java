package com.amazon.alexa.ra.core.data.model;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.featurefeedbackservice.constants.Constants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/amazon/alexa/ra/core/data/model/UserReaction;", "", "fragmentId", "", "selectedOption", "", Constants.SubmitFeedback.REQUEST_FEEDBACK_TYPE, "", "<init>", "(Ljava/lang/String;IZ)V", "getFragmentId", "()Ljava/lang/String;", "getSelectedOption", "()I", "getFeedbackType", "()Z", "component1", "component2", "component3", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class UserReaction {
    public static final int $stable = 0;
    private final boolean feedbackType;

    @NotNull
    private final String fragmentId;
    private final int selectedOption;

    public UserReaction(@NotNull String str, int i, boolean z) {
        str.getClass();
        this.fragmentId = str;
        this.selectedOption = i;
        this.feedbackType = z;
    }

    public static /* synthetic */ UserReaction copy$default(UserReaction userReaction, String str, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = userReaction.fragmentId;
        }
        if ((i2 & 2) != 0) {
            i = userReaction.selectedOption;
        }
        if ((i2 & 4) != 0) {
            z = userReaction.feedbackType;
        }
        return userReaction.copy(str, i, z);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFragmentId() {
        return this.fragmentId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSelectedOption() {
        return this.selectedOption;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getFeedbackType() {
        return this.feedbackType;
    }

    @NotNull
    public final UserReaction copy(@NotNull String fragmentId, int selectedOption, boolean feedbackType) {
        fragmentId.getClass();
        return new UserReaction(fragmentId, selectedOption, feedbackType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserReaction)) {
            return false;
        }
        UserReaction userReaction = (UserReaction) other;
        return Intrinsics.areEqual(this.fragmentId, userReaction.fragmentId) && this.selectedOption == userReaction.selectedOption && this.feedbackType == userReaction.feedbackType;
    }

    public final boolean getFeedbackType() {
        return this.feedbackType;
    }

    @NotNull
    public final String getFragmentId() {
        return this.fragmentId;
    }

    public final int getSelectedOption() {
        return this.selectedOption;
    }

    public int hashCode() {
        return Boolean.hashCode(this.feedbackType) + ArcMode$$ExternalSyntheticOutline0.m(this.selectedOption, this.fragmentId.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.fragmentId;
        int i = this.selectedOption;
        return a$$ExternalSyntheticOutline0.m(DoubleList$$ExternalSyntheticOutline0.m(i, "UserReaction(fragmentId=", str, ", selectedOption=", ", feedbackType="), this.feedbackType, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
