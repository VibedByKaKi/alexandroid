package com.amazon.alexa.digitalcommerce.eventbus;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/eventbus/EligibleIAPOffers;", "", "offers", "", "Lcom/amazon/alexa/digitalcommerce/eventbus/IAPSubscriptionOffer;", "eligibilityStatus", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getOffers", "()Ljava/util/List;", "getEligibilityStatus", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EligibleIAPOffers {

    @NotNull
    private final String eligibilityStatus;

    @NotNull
    private final List<IAPSubscriptionOffer> offers;

    public EligibleIAPOffers(@NotNull List<IAPSubscriptionOffer> list, @NotNull String str) {
        list.getClass();
        str.getClass();
        this.offers = list;
        this.eligibilityStatus = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EligibleIAPOffers copy$default(EligibleIAPOffers eligibleIAPOffers, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = eligibleIAPOffers.offers;
        }
        if ((i & 2) != 0) {
            str = eligibleIAPOffers.eligibilityStatus;
        }
        return eligibleIAPOffers.copy(list, str);
    }

    @NotNull
    public final List<IAPSubscriptionOffer> component1() {
        return this.offers;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEligibilityStatus() {
        return this.eligibilityStatus;
    }

    @NotNull
    public final EligibleIAPOffers copy(@NotNull List<IAPSubscriptionOffer> offers, @NotNull String eligibilityStatus) {
        offers.getClass();
        eligibilityStatus.getClass();
        return new EligibleIAPOffers(offers, eligibilityStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EligibleIAPOffers)) {
            return false;
        }
        EligibleIAPOffers eligibleIAPOffers = (EligibleIAPOffers) other;
        return Intrinsics.areEqual(this.offers, eligibleIAPOffers.offers) && Intrinsics.areEqual(this.eligibilityStatus, eligibleIAPOffers.eligibilityStatus);
    }

    @NotNull
    public final String getEligibilityStatus() {
        return this.eligibilityStatus;
    }

    @NotNull
    public final List<IAPSubscriptionOffer> getOffers() {
        return this.offers;
    }

    public int hashCode() {
        return this.eligibilityStatus.hashCode() + (this.offers.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "EligibleIAPOffers(offers=" + this.offers + ", eligibilityStatus=" + this.eligibilityStatus + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
