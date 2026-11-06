package com.amazon.alexa.redesign.entity.agentforward.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/network/CardDrawerItemDomain;", "", "basicCardDrawerItem", "Lcom/amazon/alexa/redesign/entity/agentforward/network/BasicCardDrawerItemDomain;", "welcomeCardDrawerItem", "Lcom/amazon/alexa/redesign/entity/agentforward/network/WelcomeCardDrawerItemDomain;", "<init>", "(Lcom/amazon/alexa/redesign/entity/agentforward/network/BasicCardDrawerItemDomain;Lcom/amazon/alexa/redesign/entity/agentforward/network/WelcomeCardDrawerItemDomain;)V", "getBasicCardDrawerItem", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/BasicCardDrawerItemDomain;", "getWelcomeCardDrawerItem", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/WelcomeCardDrawerItemDomain;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class CardDrawerItemDomain {
    public static final int $stable = 8;

    @Nullable
    private final BasicCardDrawerItemDomain basicCardDrawerItem;

    @Nullable
    private final WelcomeCardDrawerItemDomain welcomeCardDrawerItem;

    public /* synthetic */ CardDrawerItemDomain(BasicCardDrawerItemDomain basicCardDrawerItemDomain, WelcomeCardDrawerItemDomain welcomeCardDrawerItemDomain, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : basicCardDrawerItemDomain, (i & 2) != 0 ? null : welcomeCardDrawerItemDomain);
    }

    public static /* synthetic */ CardDrawerItemDomain copy$default(CardDrawerItemDomain cardDrawerItemDomain, BasicCardDrawerItemDomain basicCardDrawerItemDomain, WelcomeCardDrawerItemDomain welcomeCardDrawerItemDomain, int i, Object obj) {
        if ((i & 1) != 0) {
            basicCardDrawerItemDomain = cardDrawerItemDomain.basicCardDrawerItem;
        }
        if ((i & 2) != 0) {
            welcomeCardDrawerItemDomain = cardDrawerItemDomain.welcomeCardDrawerItem;
        }
        return cardDrawerItemDomain.copy(basicCardDrawerItemDomain, welcomeCardDrawerItemDomain);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final BasicCardDrawerItemDomain getBasicCardDrawerItem() {
        return this.basicCardDrawerItem;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final WelcomeCardDrawerItemDomain getWelcomeCardDrawerItem() {
        return this.welcomeCardDrawerItem;
    }

    @NotNull
    public final CardDrawerItemDomain copy(@Nullable BasicCardDrawerItemDomain basicCardDrawerItem, @Nullable WelcomeCardDrawerItemDomain welcomeCardDrawerItem) {
        return new CardDrawerItemDomain(basicCardDrawerItem, welcomeCardDrawerItem);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardDrawerItemDomain)) {
            return false;
        }
        CardDrawerItemDomain cardDrawerItemDomain = (CardDrawerItemDomain) other;
        return Intrinsics.areEqual(this.basicCardDrawerItem, cardDrawerItemDomain.basicCardDrawerItem) && Intrinsics.areEqual(this.welcomeCardDrawerItem, cardDrawerItemDomain.welcomeCardDrawerItem);
    }

    @Nullable
    public final BasicCardDrawerItemDomain getBasicCardDrawerItem() {
        return this.basicCardDrawerItem;
    }

    @Nullable
    public final WelcomeCardDrawerItemDomain getWelcomeCardDrawerItem() {
        return this.welcomeCardDrawerItem;
    }

    public int hashCode() {
        BasicCardDrawerItemDomain basicCardDrawerItemDomain = this.basicCardDrawerItem;
        int hashCode = (basicCardDrawerItemDomain == null ? 0 : basicCardDrawerItemDomain.hashCode()) * 31;
        WelcomeCardDrawerItemDomain welcomeCardDrawerItemDomain = this.welcomeCardDrawerItem;
        return hashCode + (welcomeCardDrawerItemDomain != null ? welcomeCardDrawerItemDomain.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CardDrawerItemDomain(basicCardDrawerItem=" + this.basicCardDrawerItem + ", welcomeCardDrawerItem=" + this.welcomeCardDrawerItem + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public CardDrawerItemDomain(@Nullable BasicCardDrawerItemDomain basicCardDrawerItemDomain, @Nullable WelcomeCardDrawerItemDomain welcomeCardDrawerItemDomain) {
        this.basicCardDrawerItem = basicCardDrawerItemDomain;
        this.welcomeCardDrawerItem = welcomeCardDrawerItemDomain;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CardDrawerItemDomain() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
