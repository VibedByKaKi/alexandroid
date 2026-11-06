package com.amazon.alexa.cards.api;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.aamb.Automotive$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/amazon/alexa/cards/api/CardState;", "", "isExpanded", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CardState {
    public static final int $stable = 0;
    private final boolean isExpanded;

    public CardState(boolean z) {
        this.isExpanded = z;
    }

    public static /* synthetic */ CardState copy$default(CardState cardState, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = cardState.isExpanded;
        }
        return cardState.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsExpanded() {
        return this.isExpanded;
    }

    @NotNull
    public final CardState copy(boolean isExpanded) {
        return new CardState(isExpanded);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CardState) && this.isExpanded == ((CardState) other).isExpanded;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isExpanded);
    }

    public final boolean isExpanded() {
        return this.isExpanded;
    }

    @NotNull
    public String toString() {
        return Automotive$$ExternalSyntheticOutline0.m("CardState(isExpanded=", MarkdownConstants.RIGHT_PARENTHESIS, this.isExpanded);
    }
}
