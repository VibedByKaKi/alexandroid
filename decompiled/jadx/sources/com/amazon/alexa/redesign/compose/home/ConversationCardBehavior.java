package com.amazon.alexa.redesign.compose.home;

import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Dp;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J>\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u00032\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\b\u001a\u00020\t¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\""}, d2 = {"Lcom/amazon/alexa/redesign/compose/home/ConversationCardBehavior;", "", "rendersOwnContent", "", "onCardClick", "Lkotlin/Function0;", "", "cardSwipeEnabled", "topInsetCollapse", "Landroidx/compose/ui/unit/Dp;", "<init>", "(ZLkotlin/jvm/functions/Function0;ZFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getRendersOwnContent", "()Z", "getOnCardClick", "()Lkotlin/jvm/functions/Function0;", "getCardSwipeEnabled", "getTopInsetCollapse-D9Ej5fM", "()F", "F", "component1", "component2", "component3", "component4", "component4-D9Ej5fM", "copy", "copy-eqLRuRQ", "(ZLkotlin/jvm/functions/Function0;ZF)Lcom/amazon/alexa/redesign/compose/home/ConversationCardBehavior;", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class ConversationCardBehavior {
    public static final int $stable = 0;
    private final boolean cardSwipeEnabled;

    @NotNull
    private final Function0<Unit> onCardClick;
    private final boolean rendersOwnContent;
    private final float topInsetCollapse;

    private ConversationCardBehavior(boolean z, Function0<Unit> function0, boolean z2, float f) {
        function0.getClass();
        this.rendersOwnContent = z;
        this.onCardClick = function0;
        this.cardSwipeEnabled = z2;
        this.topInsetCollapse = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: copy-eqLRuRQ$default, reason: not valid java name */
    public static /* synthetic */ ConversationCardBehavior m19554copyeqLRuRQ$default(ConversationCardBehavior conversationCardBehavior, boolean z, Function0 function0, boolean z2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            z = conversationCardBehavior.rendersOwnContent;
        }
        if ((i & 2) != 0) {
            function0 = conversationCardBehavior.onCardClick;
        }
        if ((i & 4) != 0) {
            z2 = conversationCardBehavior.cardSwipeEnabled;
        }
        if ((i & 8) != 0) {
            f = conversationCardBehavior.topInsetCollapse;
        }
        return conversationCardBehavior.m19556copyeqLRuRQ(z, function0, z2, f);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getRendersOwnContent() {
        return this.rendersOwnContent;
    }

    @NotNull
    public final Function0<Unit> component2() {
        return this.onCardClick;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getCardSwipeEnabled() {
        return this.cardSwipeEnabled;
    }

    /* renamed from: component4-D9Ej5fM, reason: not valid java name and from getter */
    public final float getTopInsetCollapse() {
        return this.topInsetCollapse;
    }

    @NotNull
    /* renamed from: copy-eqLRuRQ, reason: not valid java name */
    public final ConversationCardBehavior m19556copyeqLRuRQ(boolean rendersOwnContent, @NotNull Function0<Unit> onCardClick, boolean cardSwipeEnabled, float topInsetCollapse) {
        onCardClick.getClass();
        return new ConversationCardBehavior(rendersOwnContent, onCardClick, cardSwipeEnabled, topInsetCollapse, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationCardBehavior)) {
            return false;
        }
        ConversationCardBehavior conversationCardBehavior = (ConversationCardBehavior) other;
        return this.rendersOwnContent == conversationCardBehavior.rendersOwnContent && Intrinsics.areEqual(this.onCardClick, conversationCardBehavior.onCardClick) && this.cardSwipeEnabled == conversationCardBehavior.cardSwipeEnabled && Dp.m7373equalsimpl0(this.topInsetCollapse, conversationCardBehavior.topInsetCollapse);
    }

    public final boolean getCardSwipeEnabled() {
        return this.cardSwipeEnabled;
    }

    @NotNull
    public final Function0<Unit> getOnCardClick() {
        return this.onCardClick;
    }

    public final boolean getRendersOwnContent() {
        return this.rendersOwnContent;
    }

    /* renamed from: getTopInsetCollapse-D9Ej5fM, reason: not valid java name */
    public final float m19557getTopInsetCollapseD9Ej5fM() {
        return this.topInsetCollapse;
    }

    public int hashCode() {
        return Dp.m7374hashCodeimpl(this.topInsetCollapse) + DoubleList$$ExternalSyntheticOutline0.m(this.cardSwipeEnabled, DoubleList$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.rendersOwnContent) * 31, 31, this.onCardClick), 31);
    }

    @NotNull
    public String toString() {
        return "ConversationCardBehavior(rendersOwnContent=" + this.rendersOwnContent + ", onCardClick=" + this.onCardClick + ", cardSwipeEnabled=" + this.cardSwipeEnabled + ", topInsetCollapse=" + Dp.m7379toStringimpl(this.topInsetCollapse) + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ ConversationCardBehavior(boolean z, Function0 function0, boolean z2, float f, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, function0, z2, f);
    }
}
