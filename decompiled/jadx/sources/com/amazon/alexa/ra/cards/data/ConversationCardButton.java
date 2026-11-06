package com.amazon.alexa.ra.cards.data;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.data.fragments.CardButton;
import com.amazon.alexa.ra.core.data.model.ActionItem$$ExternalSyntheticLambda0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/amazon/alexa/ra/cards/data/ConversationCardButton;", "", "text", "", "graphic", "Lcom/amazon/alexa/ra/cards/data/ItemGraphic;", CardButton.GRAPHIC_POSITION, "style", CardButton.PRIMARY_ACTION, ViewProps.ON_CLICK, "Lkotlin/Function0;", "", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/ra/cards/data/ItemGraphic;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "getText", "()Ljava/lang/String;", "getGraphic", "()Lcom/amazon/alexa/ra/cards/data/ItemGraphic;", "getGraphicPosition", "getStyle", "getPrimaryAction", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AVSMobileFramework-ra-cards-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class ConversationCardButton {
    public static final int $stable = 0;

    @Nullable
    private final ItemGraphic graphic;

    @Nullable
    private final String graphicPosition;

    @NotNull
    private final Function0<Unit> onClick;

    @Nullable
    private final String primaryAction;

    @Nullable
    private final String style;

    @NotNull
    private final String text;

    public /* synthetic */ ConversationCardButton(String str, ItemGraphic itemGraphic, String str2, String str3, String str4, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : itemGraphic, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? new ActionItem$$ExternalSyntheticLambda0(17) : function0);
    }

    public static /* synthetic */ ConversationCardButton copy$default(ConversationCardButton conversationCardButton, String str, ItemGraphic itemGraphic, String str2, String str3, String str4, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = conversationCardButton.text;
        }
        if ((i & 2) != 0) {
            itemGraphic = conversationCardButton.graphic;
        }
        if ((i & 4) != 0) {
            str2 = conversationCardButton.graphicPosition;
        }
        if ((i & 8) != 0) {
            str3 = conversationCardButton.style;
        }
        if ((i & 16) != 0) {
            str4 = conversationCardButton.primaryAction;
        }
        if ((i & 32) != 0) {
            function0 = conversationCardButton.onClick;
        }
        String str5 = str4;
        Function0 function02 = function0;
        return conversationCardButton.copy(str, itemGraphic, str2, str3, str5, function02);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ItemGraphic getGraphic() {
        return this.graphic;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getGraphicPosition() {
        return this.graphicPosition;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getPrimaryAction() {
        return this.primaryAction;
    }

    @NotNull
    public final Function0<Unit> component6() {
        return this.onClick;
    }

    @NotNull
    public final ConversationCardButton copy(@NotNull String text, @Nullable ItemGraphic graphic, @Nullable String graphicPosition, @Nullable String style, @Nullable String primaryAction, @NotNull Function0<Unit> onClick) {
        text.getClass();
        onClick.getClass();
        return new ConversationCardButton(text, graphic, graphicPosition, style, primaryAction, onClick);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConversationCardButton)) {
            return false;
        }
        ConversationCardButton conversationCardButton = (ConversationCardButton) other;
        return Intrinsics.areEqual(this.text, conversationCardButton.text) && Intrinsics.areEqual(this.graphic, conversationCardButton.graphic) && Intrinsics.areEqual(this.graphicPosition, conversationCardButton.graphicPosition) && Intrinsics.areEqual(this.style, conversationCardButton.style) && Intrinsics.areEqual(this.primaryAction, conversationCardButton.primaryAction) && Intrinsics.areEqual(this.onClick, conversationCardButton.onClick);
    }

    @Nullable
    public final ItemGraphic getGraphic() {
        return this.graphic;
    }

    @Nullable
    public final String getGraphicPosition() {
        return this.graphicPosition;
    }

    @NotNull
    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    @Nullable
    public final String getPrimaryAction() {
        return this.primaryAction;
    }

    @Nullable
    public final String getStyle() {
        return this.style;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.text.hashCode() * 31;
        ItemGraphic itemGraphic = this.graphic;
        int hashCode2 = (hashCode + (itemGraphic == null ? 0 : itemGraphic.hashCode())) * 31;
        String str = this.graphicPosition;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.style;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.primaryAction;
        return this.onClick.hashCode() + ((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.text;
        ItemGraphic itemGraphic = this.graphic;
        String str2 = this.graphicPosition;
        String str3 = this.style;
        String str4 = this.primaryAction;
        Function0<Unit> function0 = this.onClick;
        StringBuilder sb = new StringBuilder("ConversationCardButton(text=");
        sb.append(str);
        sb.append(", graphic=");
        sb.append(itemGraphic);
        sb.append(", graphicPosition=");
        AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, str2, ", style=", str3, ", primaryAction=");
        sb.append(str4);
        sb.append(", onClick=");
        sb.append(function0);
        sb.append(MarkdownConstants.RIGHT_PARENTHESIS);
        return sb.toString();
    }

    public ConversationCardButton(@NotNull String str, @Nullable ItemGraphic itemGraphic, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull Function0<Unit> function0) {
        str.getClass();
        function0.getClass();
        this.text = str;
        this.graphic = itemGraphic;
        this.graphicPosition = str2;
        this.style = str3;
        this.primaryAction = str4;
        this.onClick = function0;
    }
}
