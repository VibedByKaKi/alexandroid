package com.amazon.alexa.digitalcommerce.api;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.collection.DoubleList$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.deecomms.common.Constants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0007\u0018\u0019\u001a\u001b\u001c\u001d\u001eB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse;", "", "getProductDetailsResponse", "Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$ProductDetailsResponse;", "eligibilityStatus", "", "eligibilityReason", "<init>", "(Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$ProductDetailsResponse;Ljava/lang/String;Ljava/lang/String;)V", "getGetProductDetailsResponse", "()Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$ProductDetailsResponse;", "getEligibilityStatus", "()Ljava/lang/String;", "getEligibilityReason", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ProductDetailsResponse", "Offer", "Contract", "BillingPeriod", Constants.CALL_DURATION_KEY, "Price", "PricingAttribute", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GetProductDetailsResponse {

    @Nullable
    private final String eligibilityReason;

    @NotNull
    private final String eligibilityStatus;

    @NotNull
    private final ProductDetailsResponse getProductDetailsResponse;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$Contract;", "Ljava/io/Serializable;", "index", "", "externalId", "", "billingPeriods", "", "Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$BillingPeriod;", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "getIndex", "()I", "getExternalId", "()Ljava/lang/String;", "getBillingPeriods", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Contract implements Serializable {

        @NotNull
        private final List<BillingPeriod> billingPeriods;

        @NotNull
        private final String externalId;
        private final int index;

        public Contract(int i, @NotNull String str, @NotNull List<BillingPeriod> list) {
            str.getClass();
            list.getClass();
            this.index = i;
            this.externalId = str;
            this.billingPeriods = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Contract copy$default(Contract contract, int i, String str, List list, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = contract.index;
            }
            if ((i2 & 2) != 0) {
                str = contract.externalId;
            }
            if ((i2 & 4) != 0) {
                list = contract.billingPeriods;
            }
            return contract.copy(i, str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getExternalId() {
            return this.externalId;
        }

        @NotNull
        public final List<BillingPeriod> component3() {
            return this.billingPeriods;
        }

        @NotNull
        public final Contract copy(int index, @NotNull String externalId, @NotNull List<BillingPeriod> billingPeriods) {
            externalId.getClass();
            billingPeriods.getClass();
            return new Contract(index, externalId, billingPeriods);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Contract)) {
                return false;
            }
            Contract contract = (Contract) other;
            return this.index == contract.index && Intrinsics.areEqual(this.externalId, contract.externalId) && Intrinsics.areEqual(this.billingPeriods, contract.billingPeriods);
        }

        @NotNull
        public final List<BillingPeriod> getBillingPeriods() {
            return this.billingPeriods;
        }

        @NotNull
        public final String getExternalId() {
            return this.externalId;
        }

        public final int getIndex() {
            return this.index;
        }

        public int hashCode() {
            return this.billingPeriods.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(Integer.hashCode(this.index) * 31, 31, this.externalId);
        }

        @NotNull
        public String toString() {
            return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, this.billingPeriods, TableInfo$$ExternalSyntheticOutline0.m(this.index, "Contract(index=", ", externalId=", this.externalId, ", billingPeriods="));
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$Duration;", "Ljava/io/Serializable;", TypedValues.CycleType.S_WAVE_PERIOD, "", "units", "", "<init>", "(ILjava/lang/String;)V", "getPeriod", "()I", "getUnits", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Duration implements Serializable {
        private final int period;

        @NotNull
        private final String units;

        public Duration(int i, @NotNull String str) {
            str.getClass();
            this.period = i;
            this.units = str;
        }

        public static /* synthetic */ Duration copy$default(Duration duration, int i, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = duration.period;
            }
            if ((i2 & 2) != 0) {
                str = duration.units;
            }
            return duration.copy(i, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPeriod() {
            return this.period;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getUnits() {
            return this.units;
        }

        @NotNull
        public final Duration copy(int period, @NotNull String units) {
            units.getClass();
            return new Duration(period, units);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Duration)) {
                return false;
            }
            Duration duration = (Duration) other;
            return this.period == duration.period && Intrinsics.areEqual(this.units, duration.units);
        }

        public final int getPeriod() {
            return this.period;
        }

        @NotNull
        public final String getUnits() {
            return this.units;
        }

        public int hashCode() {
            return this.units.hashCode() + (Integer.hashCode(this.period) * 31);
        }

        @NotNull
        public String toString() {
            return DoubleList$$ExternalSyntheticOutline0.m("Duration(period=", this.period, ", units=", this.units, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003JK\u0010\u001d\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013¨\u0006%"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$Offer;", "Ljava/io/Serializable;", "allBillingPeriods", "", "Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$BillingPeriod;", "contract", "Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$Contract;", "contractType", "", "merchantSku", "offerType", "tierAsin", "<init>", "(Ljava/util/List;Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$Contract;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAllBillingPeriods", "()Ljava/util/List;", "getContract", "()Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$Contract;", "getContractType", "()Ljava/lang/String;", "getMerchantSku", "getOfferType", "getTierAsin", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Offer implements Serializable {

        @NotNull
        private final List<BillingPeriod> allBillingPeriods;

        @NotNull
        private final Contract contract;

        @NotNull
        private final String contractType;

        @NotNull
        private final String merchantSku;

        @NotNull
        private final String offerType;

        @NotNull
        private final String tierAsin;

        public Offer(@NotNull List<BillingPeriod> list, @NotNull Contract contract, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4) {
            list.getClass();
            contract.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            this.allBillingPeriods = list;
            this.contract = contract;
            this.contractType = str;
            this.merchantSku = str2;
            this.offerType = str3;
            this.tierAsin = str4;
        }

        public static /* synthetic */ Offer copy$default(Offer offer, List list, Contract contract, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                list = offer.allBillingPeriods;
            }
            if ((i & 2) != 0) {
                contract = offer.contract;
            }
            if ((i & 4) != 0) {
                str = offer.contractType;
            }
            if ((i & 8) != 0) {
                str2 = offer.merchantSku;
            }
            if ((i & 16) != 0) {
                str3 = offer.offerType;
            }
            if ((i & 32) != 0) {
                str4 = offer.tierAsin;
            }
            String str5 = str3;
            String str6 = str4;
            return offer.copy(list, contract, str, str2, str5, str6);
        }

        @NotNull
        public final List<BillingPeriod> component1() {
            return this.allBillingPeriods;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Contract getContract() {
            return this.contract;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getContractType() {
            return this.contractType;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getMerchantSku() {
            return this.merchantSku;
        }

        @NotNull
        /* renamed from: component5, reason: from getter */
        public final String getOfferType() {
            return this.offerType;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getTierAsin() {
            return this.tierAsin;
        }

        @NotNull
        public final Offer copy(@NotNull List<BillingPeriod> allBillingPeriods, @NotNull Contract contract, @NotNull String contractType, @NotNull String merchantSku, @NotNull String offerType, @NotNull String tierAsin) {
            allBillingPeriods.getClass();
            contract.getClass();
            contractType.getClass();
            merchantSku.getClass();
            offerType.getClass();
            tierAsin.getClass();
            return new Offer(allBillingPeriods, contract, contractType, merchantSku, offerType, tierAsin);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Offer)) {
                return false;
            }
            Offer offer = (Offer) other;
            return Intrinsics.areEqual(this.allBillingPeriods, offer.allBillingPeriods) && Intrinsics.areEqual(this.contract, offer.contract) && Intrinsics.areEqual(this.contractType, offer.contractType) && Intrinsics.areEqual(this.merchantSku, offer.merchantSku) && Intrinsics.areEqual(this.offerType, offer.offerType) && Intrinsics.areEqual(this.tierAsin, offer.tierAsin);
        }

        @NotNull
        public final List<BillingPeriod> getAllBillingPeriods() {
            return this.allBillingPeriods;
        }

        @NotNull
        public final Contract getContract() {
            return this.contract;
        }

        @NotNull
        public final String getContractType() {
            return this.contractType;
        }

        @NotNull
        public final String getMerchantSku() {
            return this.merchantSku;
        }

        @NotNull
        public final String getOfferType() {
            return this.offerType;
        }

        @NotNull
        public final String getTierAsin() {
            return this.tierAsin;
        }

        public int hashCode() {
            return this.tierAsin.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m((this.contract.hashCode() + (this.allBillingPeriods.hashCode() * 31)) * 31, 31, this.contractType), 31, this.merchantSku), 31, this.offerType);
        }

        @NotNull
        public String toString() {
            List<BillingPeriod> list = this.allBillingPeriods;
            Contract contract = this.contract;
            String str = this.contractType;
            String str2 = this.merchantSku;
            String str3 = this.offerType;
            String str4 = this.tierAsin;
            StringBuilder sb = new StringBuilder("Offer(allBillingPeriods=");
            sb.append(list);
            sb.append(", contract=");
            sb.append(contract);
            sb.append(", contractType=");
            AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, str, ", merchantSku=", str2, ", offerType=");
            return DoubleList$$ExternalSyntheticOutline0.m(sb, str3, ", tierAsin=", str4, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$Price;", "Ljava/io/Serializable;", "currencyCode", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrencyCode", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Price implements Serializable {

        @NotNull
        private final String currencyCode;

        @NotNull
        private final String value;

        public Price(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.currencyCode = str;
            this.value = str2;
        }

        public static /* synthetic */ Price copy$default(Price price, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = price.currencyCode;
            }
            if ((i & 2) != 0) {
                str2 = price.value;
            }
            return price.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final Price copy(@NotNull String currencyCode, @NotNull String value) {
            currencyCode.getClass();
            value.getClass();
            return new Price(currencyCode, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Price)) {
                return false;
            }
            Price price = (Price) other;
            return Intrinsics.areEqual(this.currencyCode, price.currencyCode) && Intrinsics.areEqual(this.value, price.value);
        }

        @NotNull
        public final String getCurrencyCode() {
            return this.currencyCode;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.currencyCode.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Price(currencyCode=", this.currencyCode, ", value=", this.value, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$PricingAttribute;", "Ljava/io/Serializable;", "key", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PricingAttribute implements Serializable {

        @NotNull
        private final String key;

        @NotNull
        private final String value;

        public PricingAttribute(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.key = str;
            this.value = str2;
        }

        public static /* synthetic */ PricingAttribute copy$default(PricingAttribute pricingAttribute, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = pricingAttribute.key;
            }
            if ((i & 2) != 0) {
                str2 = pricingAttribute.value;
            }
            return pricingAttribute.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final PricingAttribute copy(@NotNull String key, @NotNull String value) {
            key.getClass();
            value.getClass();
            return new PricingAttribute(key, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PricingAttribute)) {
                return false;
            }
            PricingAttribute pricingAttribute = (PricingAttribute) other;
            return Intrinsics.areEqual(this.key, pricingAttribute.key) && Intrinsics.areEqual(this.value, pricingAttribute.value);
        }

        @NotNull
        public final String getKey() {
            return this.key;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            return this.value.hashCode() + (this.key.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("PricingAttribute(key=", this.key, ", value=", this.value, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    public GetProductDetailsResponse(@NotNull ProductDetailsResponse productDetailsResponse, @NotNull String str, @Nullable String str2) {
        productDetailsResponse.getClass();
        str.getClass();
        this.getProductDetailsResponse = productDetailsResponse;
        this.eligibilityStatus = str;
        this.eligibilityReason = str2;
    }

    public static /* synthetic */ GetProductDetailsResponse copy$default(GetProductDetailsResponse getProductDetailsResponse, ProductDetailsResponse productDetailsResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            productDetailsResponse = getProductDetailsResponse.getProductDetailsResponse;
        }
        if ((i & 2) != 0) {
            str = getProductDetailsResponse.eligibilityStatus;
        }
        if ((i & 4) != 0) {
            str2 = getProductDetailsResponse.eligibilityReason;
        }
        return getProductDetailsResponse.copy(productDetailsResponse, str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ProductDetailsResponse getGetProductDetailsResponse() {
        return this.getProductDetailsResponse;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEligibilityStatus() {
        return this.eligibilityStatus;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getEligibilityReason() {
        return this.eligibilityReason;
    }

    @NotNull
    public final GetProductDetailsResponse copy(@NotNull ProductDetailsResponse getProductDetailsResponse, @NotNull String eligibilityStatus, @Nullable String eligibilityReason) {
        getProductDetailsResponse.getClass();
        eligibilityStatus.getClass();
        return new GetProductDetailsResponse(getProductDetailsResponse, eligibilityStatus, eligibilityReason);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetProductDetailsResponse)) {
            return false;
        }
        GetProductDetailsResponse getProductDetailsResponse = (GetProductDetailsResponse) other;
        return Intrinsics.areEqual(this.getProductDetailsResponse, getProductDetailsResponse.getProductDetailsResponse) && Intrinsics.areEqual(this.eligibilityStatus, getProductDetailsResponse.eligibilityStatus) && Intrinsics.areEqual(this.eligibilityReason, getProductDetailsResponse.eligibilityReason);
    }

    @Nullable
    public final String getEligibilityReason() {
        return this.eligibilityReason;
    }

    @NotNull
    public final String getEligibilityStatus() {
        return this.eligibilityStatus;
    }

    @NotNull
    public final ProductDetailsResponse getGetProductDetailsResponse() {
        return this.getProductDetailsResponse;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.getProductDetailsResponse.hashCode() * 31, 31, this.eligibilityStatus);
        String str = this.eligibilityReason;
        return m + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        ProductDetailsResponse productDetailsResponse = this.getProductDetailsResponse;
        String str = this.eligibilityStatus;
        String str2 = this.eligibilityReason;
        StringBuilder sb = new StringBuilder("GetProductDetailsResponse(getProductDetailsResponse=");
        sb.append(productDetailsResponse);
        sb.append(", eligibilityStatus=");
        sb.append(str);
        sb.append(", eligibilityReason=");
        return a$$ExternalSyntheticOutline0.m(sb, str2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ GetProductDetailsResponse(ProductDetailsResponse productDetailsResponse, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(productDetailsResponse, str, (i & 4) != 0 ? null : str2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\t\u0010 \u001a\u00020\rHÆ\u0003JM\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\rHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$BillingPeriod;", "Ljava/io/Serializable;", "index", "", "duration", "Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$Duration;", "priceWithoutTax", "Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$Price;", "priceWithTax", "pricingAttributes", "", "Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$PricingAttribute;", "renewalPolicy", "", "<init>", "(ILcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$Duration;Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$Price;Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$Price;Ljava/util/List;Ljava/lang/String;)V", "getIndex", "()I", "getDuration", "()Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$Duration;", "getPriceWithoutTax", "()Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$Price;", "getPriceWithTax", "getPricingAttributes", "()Ljava/util/List;", "getRenewalPolicy", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BillingPeriod implements Serializable {

        @NotNull
        private final Duration duration;
        private final int index;

        @NotNull
        private final Price priceWithTax;

        @NotNull
        private final Price priceWithoutTax;

        @Nullable
        private final List<PricingAttribute> pricingAttributes;

        @NotNull
        private final String renewalPolicy;

        public BillingPeriod(int i, @NotNull Duration duration, @NotNull Price price, @NotNull Price price2, @Nullable List<PricingAttribute> list, @NotNull String str) {
            duration.getClass();
            price.getClass();
            price2.getClass();
            str.getClass();
            this.index = i;
            this.duration = duration;
            this.priceWithoutTax = price;
            this.priceWithTax = price2;
            this.pricingAttributes = list;
            this.renewalPolicy = str;
        }

        public static /* synthetic */ BillingPeriod copy$default(BillingPeriod billingPeriod, int i, Duration duration, Price price, Price price2, List list, String str, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = billingPeriod.index;
            }
            if ((i2 & 2) != 0) {
                duration = billingPeriod.duration;
            }
            if ((i2 & 4) != 0) {
                price = billingPeriod.priceWithoutTax;
            }
            if ((i2 & 8) != 0) {
                price2 = billingPeriod.priceWithTax;
            }
            if ((i2 & 16) != 0) {
                list = billingPeriod.pricingAttributes;
            }
            if ((i2 & 32) != 0) {
                str = billingPeriod.renewalPolicy;
            }
            List list2 = list;
            String str2 = str;
            return billingPeriod.copy(i, duration, price, price2, list2, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Duration getDuration() {
            return this.duration;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final Price getPriceWithoutTax() {
            return this.priceWithoutTax;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final Price getPriceWithTax() {
            return this.priceWithTax;
        }

        @Nullable
        public final List<PricingAttribute> component5() {
            return this.pricingAttributes;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getRenewalPolicy() {
            return this.renewalPolicy;
        }

        @NotNull
        public final BillingPeriod copy(int index, @NotNull Duration duration, @NotNull Price priceWithoutTax, @NotNull Price priceWithTax, @Nullable List<PricingAttribute> pricingAttributes, @NotNull String renewalPolicy) {
            duration.getClass();
            priceWithoutTax.getClass();
            priceWithTax.getClass();
            renewalPolicy.getClass();
            return new BillingPeriod(index, duration, priceWithoutTax, priceWithTax, pricingAttributes, renewalPolicy);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BillingPeriod)) {
                return false;
            }
            BillingPeriod billingPeriod = (BillingPeriod) other;
            return this.index == billingPeriod.index && Intrinsics.areEqual(this.duration, billingPeriod.duration) && Intrinsics.areEqual(this.priceWithoutTax, billingPeriod.priceWithoutTax) && Intrinsics.areEqual(this.priceWithTax, billingPeriod.priceWithTax) && Intrinsics.areEqual(this.pricingAttributes, billingPeriod.pricingAttributes) && Intrinsics.areEqual(this.renewalPolicy, billingPeriod.renewalPolicy);
        }

        @NotNull
        public final Duration getDuration() {
            return this.duration;
        }

        public final int getIndex() {
            return this.index;
        }

        @NotNull
        public final Price getPriceWithTax() {
            return this.priceWithTax;
        }

        @NotNull
        public final Price getPriceWithoutTax() {
            return this.priceWithoutTax;
        }

        @Nullable
        public final List<PricingAttribute> getPricingAttributes() {
            return this.pricingAttributes;
        }

        @NotNull
        public final String getRenewalPolicy() {
            return this.renewalPolicy;
        }

        public int hashCode() {
            int hashCode = (this.priceWithTax.hashCode() + ((this.priceWithoutTax.hashCode() + ((this.duration.hashCode() + (Integer.hashCode(this.index) * 31)) * 31)) * 31)) * 31;
            List<PricingAttribute> list = this.pricingAttributes;
            return this.renewalPolicy.hashCode() + ((hashCode + (list == null ? 0 : list.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            return "BillingPeriod(index=" + this.index + ", duration=" + this.duration + ", priceWithoutTax=" + this.priceWithoutTax + ", priceWithTax=" + this.priceWithTax + ", pricingAttributes=" + this.pricingAttributes + ", renewalPolicy=" + this.renewalPolicy + MarkdownConstants.RIGHT_PARENTHESIS;
        }

        public /* synthetic */ BillingPeriod(int i, Duration duration, Price price, Price price2, List list, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, duration, price, price2, (i2 & 16) != 0 ? CollectionsKt.listOfNotNull((Object) null) : list, str);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003JM\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000e¨\u0006#"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$ProductDetailsResponse;", "Ljava/io/Serializable;", "asin", "", "description", "offers", "", "Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsResponse$Offer;", "productGroupType", "productType", "title", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAsin", "()Ljava/lang/String;", "getDescription", "getOffers", "()Ljava/util/List;", "getProductGroupType", "getProductType", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductDetailsResponse implements Serializable {

        @NotNull
        private final String asin;

        @NotNull
        private final String description;

        @NotNull
        private final List<Offer> offers;

        @NotNull
        private final String productGroupType;

        @Nullable
        private final String productType;

        @NotNull
        private final String title;

        public ProductDetailsResponse(@NotNull String str, @NotNull String str2, @NotNull List<Offer> list, @NotNull String str3, @Nullable String str4, @NotNull String str5) {
            str.getClass();
            str2.getClass();
            list.getClass();
            str3.getClass();
            str5.getClass();
            this.asin = str;
            this.description = str2;
            this.offers = list;
            this.productGroupType = str3;
            this.productType = str4;
            this.title = str5;
        }

        public static /* synthetic */ ProductDetailsResponse copy$default(ProductDetailsResponse productDetailsResponse, String str, String str2, List list, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = productDetailsResponse.asin;
            }
            if ((i & 2) != 0) {
                str2 = productDetailsResponse.description;
            }
            if ((i & 4) != 0) {
                list = productDetailsResponse.offers;
            }
            if ((i & 8) != 0) {
                str3 = productDetailsResponse.productGroupType;
            }
            if ((i & 16) != 0) {
                str4 = productDetailsResponse.productType;
            }
            if ((i & 32) != 0) {
                str5 = productDetailsResponse.title;
            }
            String str6 = str4;
            String str7 = str5;
            return productDetailsResponse.copy(str, str2, list, str3, str6, str7);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getAsin() {
            return this.asin;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final List<Offer> component3() {
            return this.offers;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final String getProductGroupType() {
            return this.productGroupType;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getProductType() {
            return this.productType;
        }

        @NotNull
        /* renamed from: component6, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @NotNull
        public final ProductDetailsResponse copy(@NotNull String asin, @NotNull String description, @NotNull List<Offer> offers, @NotNull String productGroupType, @Nullable String productType, @NotNull String title) {
            asin.getClass();
            description.getClass();
            offers.getClass();
            productGroupType.getClass();
            title.getClass();
            return new ProductDetailsResponse(asin, description, offers, productGroupType, productType, title);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ProductDetailsResponse)) {
                return false;
            }
            ProductDetailsResponse productDetailsResponse = (ProductDetailsResponse) other;
            return Intrinsics.areEqual(this.asin, productDetailsResponse.asin) && Intrinsics.areEqual(this.description, productDetailsResponse.description) && Intrinsics.areEqual(this.offers, productDetailsResponse.offers) && Intrinsics.areEqual(this.productGroupType, productDetailsResponse.productGroupType) && Intrinsics.areEqual(this.productType, productDetailsResponse.productType) && Intrinsics.areEqual(this.title, productDetailsResponse.title);
        }

        @NotNull
        public final String getAsin() {
            return this.asin;
        }

        @NotNull
        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final List<Offer> getOffers() {
            return this.offers;
        }

        @NotNull
        public final String getProductGroupType() {
            return this.productGroupType;
        }

        @Nullable
        public final String getProductType() {
            return this.productType;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            int m = ArcMode$$ExternalSyntheticOutline0.m(ArcMode$$ExternalSyntheticOutline0.m(this.offers, ArcMode$$ExternalSyntheticOutline0.m(this.asin.hashCode() * 31, 31, this.description), 31), 31, this.productGroupType);
            String str = this.productType;
            return this.title.hashCode() + ((m + (str == null ? 0 : str.hashCode())) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.asin;
            String str2 = this.description;
            List<Offer> list = this.offers;
            String str3 = this.productGroupType;
            String str4 = this.productType;
            String str5 = this.title;
            StringBuilder m = ErrorUtils$$ExternalSyntheticOutline0.m("ProductDetailsResponse(asin=", str, ", description=", str2, ", offers=");
            m.append(list);
            m.append(", productGroupType=");
            m.append(str3);
            m.append(", productType=");
            return DoubleList$$ExternalSyntheticOutline0.m(m, str4, ", title=", str5, MarkdownConstants.RIGHT_PARENTHESIS);
        }

        public /* synthetic */ ProductDetailsResponse(String str, String str2, List list, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, list, str3, (i & 16) != 0 ? null : str4, str5);
        }
    }
}
