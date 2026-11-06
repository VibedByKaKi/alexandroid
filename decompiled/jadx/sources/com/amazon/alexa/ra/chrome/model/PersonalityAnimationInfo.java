package com.amazon.alexa.ra.chrome.model;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.ra.sdk.capability.PersonalityCapability;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/ra/chrome/model/PersonalityAnimationInfo;", "", PersonalityCapability.PERSONALITY_ID_KEY, "Lcom/amazon/alexa/ra/chrome/model/PersonalityId;", "animationSource", "Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource;", "<init>", "(Lcom/amazon/alexa/ra/chrome/model/PersonalityId;Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource;)V", "getPersonalityId", "()Lcom/amazon/alexa/ra/chrome/model/PersonalityId;", "getAnimationSource", "()Lcom/amazon/alexa/ra/chrome/model/LottieAnimationSource;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "ui-chrome_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class PersonalityAnimationInfo {
    public static final int $stable = 0;

    @Nullable
    private final LottieAnimationSource animationSource;

    @Nullable
    private final PersonalityId personalityId;

    public PersonalityAnimationInfo(@Nullable PersonalityId personalityId, @Nullable LottieAnimationSource lottieAnimationSource) {
        this.personalityId = personalityId;
        this.animationSource = lottieAnimationSource;
    }

    public static /* synthetic */ PersonalityAnimationInfo copy$default(PersonalityAnimationInfo personalityAnimationInfo, PersonalityId personalityId, LottieAnimationSource lottieAnimationSource, int i, Object obj) {
        if ((i & 1) != 0) {
            personalityId = personalityAnimationInfo.personalityId;
        }
        if ((i & 2) != 0) {
            lottieAnimationSource = personalityAnimationInfo.animationSource;
        }
        return personalityAnimationInfo.copy(personalityId, lottieAnimationSource);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final PersonalityId getPersonalityId() {
        return this.personalityId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final LottieAnimationSource getAnimationSource() {
        return this.animationSource;
    }

    @NotNull
    public final PersonalityAnimationInfo copy(@Nullable PersonalityId personalityId, @Nullable LottieAnimationSource animationSource) {
        return new PersonalityAnimationInfo(personalityId, animationSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalityAnimationInfo)) {
            return false;
        }
        PersonalityAnimationInfo personalityAnimationInfo = (PersonalityAnimationInfo) other;
        return this.personalityId == personalityAnimationInfo.personalityId && Intrinsics.areEqual(this.animationSource, personalityAnimationInfo.animationSource);
    }

    @Nullable
    public final LottieAnimationSource getAnimationSource() {
        return this.animationSource;
    }

    @Nullable
    public final PersonalityId getPersonalityId() {
        return this.personalityId;
    }

    public int hashCode() {
        PersonalityId personalityId = this.personalityId;
        int hashCode = (personalityId == null ? 0 : personalityId.hashCode()) * 31;
        LottieAnimationSource lottieAnimationSource = this.animationSource;
        return hashCode + (lottieAnimationSource != null ? lottieAnimationSource.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "PersonalityAnimationInfo(personalityId=" + this.personalityId + ", animationSource=" + this.animationSource + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
