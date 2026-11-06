package com.amazon.alexa.redesign.entity.agentforward.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0012\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/CardDrawerItem;", "", "basicCardDrawerItem", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/BasicCardDrawerItem;", "welcomeCardDrawerItem", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/WelcomeCardDrawerItem;", "<init>", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/BasicCardDrawerItem;Lcom/amazon/alexa/redesign/entity/agentforward/domain/WelcomeCardDrawerItem;)V", "getBasicCardDrawerItem", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/BasicCardDrawerItem;", "setBasicCardDrawerItem", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/BasicCardDrawerItem;)V", "getWelcomeCardDrawerItem", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/WelcomeCardDrawerItem;", "setWelcomeCardDrawerItem", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/WelcomeCardDrawerItem;)V", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class CardDrawerItem {
    public static final int $stable = 8;

    @Nullable
    private BasicCardDrawerItem basicCardDrawerItem;

    @Nullable
    private WelcomeCardDrawerItem welcomeCardDrawerItem;

    public /* synthetic */ CardDrawerItem(BasicCardDrawerItem basicCardDrawerItem, WelcomeCardDrawerItem welcomeCardDrawerItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : basicCardDrawerItem, (i & 2) != 0 ? null : welcomeCardDrawerItem);
    }

    public static /* synthetic */ CardDrawerItem copy$default(CardDrawerItem cardDrawerItem, BasicCardDrawerItem basicCardDrawerItem, WelcomeCardDrawerItem welcomeCardDrawerItem, int i, Object obj) {
        if ((i & 1) != 0) {
            basicCardDrawerItem = cardDrawerItem.basicCardDrawerItem;
        }
        if ((i & 2) != 0) {
            welcomeCardDrawerItem = cardDrawerItem.welcomeCardDrawerItem;
        }
        return cardDrawerItem.copy(basicCardDrawerItem, welcomeCardDrawerItem);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final BasicCardDrawerItem getBasicCardDrawerItem() {
        return this.basicCardDrawerItem;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final WelcomeCardDrawerItem getWelcomeCardDrawerItem() {
        return this.welcomeCardDrawerItem;
    }

    @NotNull
    public final CardDrawerItem copy(@JsonProperty("basicCard") @Nullable BasicCardDrawerItem basicCardDrawerItem, @JsonProperty("agentCard") @Nullable WelcomeCardDrawerItem welcomeCardDrawerItem) {
        return new CardDrawerItem(basicCardDrawerItem, welcomeCardDrawerItem);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardDrawerItem)) {
            return false;
        }
        CardDrawerItem cardDrawerItem = (CardDrawerItem) other;
        return Intrinsics.areEqual(this.basicCardDrawerItem, cardDrawerItem.basicCardDrawerItem) && Intrinsics.areEqual(this.welcomeCardDrawerItem, cardDrawerItem.welcomeCardDrawerItem);
    }

    @Nullable
    public final BasicCardDrawerItem getBasicCardDrawerItem() {
        return this.basicCardDrawerItem;
    }

    @Nullable
    public final WelcomeCardDrawerItem getWelcomeCardDrawerItem() {
        return this.welcomeCardDrawerItem;
    }

    public int hashCode() {
        BasicCardDrawerItem basicCardDrawerItem = this.basicCardDrawerItem;
        int hashCode = (basicCardDrawerItem == null ? 0 : basicCardDrawerItem.hashCode()) * 31;
        WelcomeCardDrawerItem welcomeCardDrawerItem = this.welcomeCardDrawerItem;
        return hashCode + (welcomeCardDrawerItem != null ? welcomeCardDrawerItem.hashCode() : 0);
    }

    public final void setBasicCardDrawerItem(@Nullable BasicCardDrawerItem basicCardDrawerItem) {
        this.basicCardDrawerItem = basicCardDrawerItem;
    }

    public final void setWelcomeCardDrawerItem(@Nullable WelcomeCardDrawerItem welcomeCardDrawerItem) {
        this.welcomeCardDrawerItem = welcomeCardDrawerItem;
    }

    @NotNull
    public String toString() {
        return "CardDrawerItem(basicCardDrawerItem=" + this.basicCardDrawerItem + ", welcomeCardDrawerItem=" + this.welcomeCardDrawerItem + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @JsonCreator
    public CardDrawerItem(@JsonProperty("basicCard") @Nullable BasicCardDrawerItem basicCardDrawerItem, @JsonProperty("agentCard") @Nullable WelcomeCardDrawerItem welcomeCardDrawerItem) {
        this.basicCardDrawerItem = basicCardDrawerItem;
        this.welcomeCardDrawerItem = welcomeCardDrawerItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JsonCreator
    public CardDrawerItem() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
