package com.amazon.alexa.digitalcommerce.api;

import com.amazon.alexa.handsfree.devices.AMPDInformationProvider;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.tarazed.webrtc.signals.WebRTCSignalTypes;
import com.amazonaws.cognito.clientcontext.datacollection.DataRecordKey;
import defpackage.a$$ExternalSyntheticOutline0;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u001b\u001c\u001dB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007B;\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\rJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/EvaluateOrderRequest;", "", AMPDInformationProvider.DEVICE_PRODUCT_KEY, "Lcom/amazon/alexa/digitalcommerce/api/EvaluateOrderRequest$Product;", "billingDetails", "", "<init>", "(Lcom/amazon/alexa/digitalcommerce/api/EvaluateOrderRequest$Product;Ljava/lang/String;)V", "currencyCode", "price", "empSku", "locale", "productAsin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProduct", "()Lcom/amazon/alexa/digitalcommerce/api/EvaluateOrderRequest$Product;", "getBillingDetails", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", DataRecordKey.PRODUCT, "Offer", "Money", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class EvaluateOrderRequest {

    @Nullable
    private final String billingDetails;

    @NotNull
    private final Product product;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/EvaluateOrderRequest$Money;", "Ljava/io/Serializable;", "currencyCode", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getCurrencyCode", "()Ljava/lang/String;", "getValue", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Money implements Serializable {

        @NotNull
        private final String currencyCode;

        @NotNull
        private final String value;

        public Money(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.currencyCode = str;
            this.value = str2;
        }

        public static /* synthetic */ Money copy$default(Money money, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = money.currencyCode;
            }
            if ((i & 2) != 0) {
                str2 = money.value;
            }
            return money.copy(str, str2);
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
        public final Money copy(@NotNull String currencyCode, @NotNull String value) {
            currencyCode.getClass();
            value.getClass();
            return new Money(currencyCode, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Money)) {
                return false;
            }
            Money money = (Money) other;
            return Intrinsics.areEqual(this.currencyCode, money.currencyCode) && Intrinsics.areEqual(this.value, money.value);
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
            return a$$ExternalSyntheticOutline0.m("Money(currencyCode=", this.currencyCode, ", value=", this.value, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/EvaluateOrderRequest$Offer;", "Ljava/io/Serializable;", "empSku", "", "displayPrice", "Lcom/amazon/alexa/digitalcommerce/api/EvaluateOrderRequest$Money;", "locale", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/digitalcommerce/api/EvaluateOrderRequest$Money;Ljava/lang/String;)V", "getEmpSku", "()Ljava/lang/String;", "getDisplayPrice", "()Lcom/amazon/alexa/digitalcommerce/api/EvaluateOrderRequest$Money;", "getLocale", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Offer implements Serializable {

        @NotNull
        private final Money displayPrice;

        @NotNull
        private final String empSku;

        @NotNull
        private final String locale;

        public Offer(@NotNull String str, @NotNull Money money, @NotNull String str2) {
            str.getClass();
            money.getClass();
            str2.getClass();
            this.empSku = str;
            this.displayPrice = money;
            this.locale = str2;
        }

        public static /* synthetic */ Offer copy$default(Offer offer, String str, Money money, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = offer.empSku;
            }
            if ((i & 2) != 0) {
                money = offer.displayPrice;
            }
            if ((i & 4) != 0) {
                str2 = offer.locale;
            }
            return offer.copy(str, money, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getEmpSku() {
            return this.empSku;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Money getDisplayPrice() {
            return this.displayPrice;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        @NotNull
        public final Offer copy(@NotNull String empSku, @NotNull Money displayPrice, @NotNull String locale) {
            empSku.getClass();
            displayPrice.getClass();
            locale.getClass();
            return new Offer(empSku, displayPrice, locale);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Offer)) {
                return false;
            }
            Offer offer = (Offer) other;
            return Intrinsics.areEqual(this.empSku, offer.empSku) && Intrinsics.areEqual(this.displayPrice, offer.displayPrice) && Intrinsics.areEqual(this.locale, offer.locale);
        }

        @NotNull
        public final Money getDisplayPrice() {
            return this.displayPrice;
        }

        @NotNull
        public final String getEmpSku() {
            return this.empSku;
        }

        @NotNull
        public final String getLocale() {
            return this.locale;
        }

        public int hashCode() {
            return this.locale.hashCode() + ((this.displayPrice.hashCode() + (this.empSku.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.empSku;
            Money money = this.displayPrice;
            String str2 = this.locale;
            StringBuilder sb = new StringBuilder("Offer(empSku=");
            sb.append(str);
            sb.append(", displayPrice=");
            sb.append(money);
            sb.append(", locale=");
            return a$$ExternalSyntheticOutline0.m(sb, str2, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/EvaluateOrderRequest$Product;", "Ljava/io/Serializable;", "productAsin", "", WebRTCSignalTypes.OFFER, "Lcom/amazon/alexa/digitalcommerce/api/EvaluateOrderRequest$Offer;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/digitalcommerce/api/EvaluateOrderRequest$Offer;)V", "getProductAsin", "()Ljava/lang/String;", "getOffer", "()Lcom/amazon/alexa/digitalcommerce/api/EvaluateOrderRequest$Offer;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Product implements Serializable {

        @NotNull
        private final Offer offer;

        @NotNull
        private final String productAsin;

        public Product(@NotNull String str, @NotNull Offer offer) {
            str.getClass();
            offer.getClass();
            this.productAsin = str;
            this.offer = offer;
        }

        public static /* synthetic */ Product copy$default(Product product, String str, Offer offer, int i, Object obj) {
            if ((i & 1) != 0) {
                str = product.productAsin;
            }
            if ((i & 2) != 0) {
                offer = product.offer;
            }
            return product.copy(str, offer);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getProductAsin() {
            return this.productAsin;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final Offer getOffer() {
            return this.offer;
        }

        @NotNull
        public final Product copy(@NotNull String productAsin, @NotNull Offer offer) {
            productAsin.getClass();
            offer.getClass();
            return new Product(productAsin, offer);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Product)) {
                return false;
            }
            Product product = (Product) other;
            return Intrinsics.areEqual(this.productAsin, product.productAsin) && Intrinsics.areEqual(this.offer, product.offer);
        }

        @NotNull
        public final Offer getOffer() {
            return this.offer;
        }

        @NotNull
        public final String getProductAsin() {
            return this.productAsin;
        }

        public int hashCode() {
            return this.offer.hashCode() + (this.productAsin.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "Product(productAsin=" + this.productAsin + ", offer=" + this.offer + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EvaluateOrderRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @Nullable String str6) {
        this(new Product(str5, new Offer(str3, new Money(str, str2), str4)), str6);
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
    }

    public static /* synthetic */ EvaluateOrderRequest copy$default(EvaluateOrderRequest evaluateOrderRequest, Product product, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            product = evaluateOrderRequest.product;
        }
        if ((i & 2) != 0) {
            str = evaluateOrderRequest.billingDetails;
        }
        return evaluateOrderRequest.copy(product, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Product getProduct() {
        return this.product;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getBillingDetails() {
        return this.billingDetails;
    }

    @NotNull
    public final EvaluateOrderRequest copy(@NotNull Product product, @Nullable String billingDetails) {
        product.getClass();
        return new EvaluateOrderRequest(product, billingDetails);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EvaluateOrderRequest)) {
            return false;
        }
        EvaluateOrderRequest evaluateOrderRequest = (EvaluateOrderRequest) other;
        return Intrinsics.areEqual(this.product, evaluateOrderRequest.product) && Intrinsics.areEqual(this.billingDetails, evaluateOrderRequest.billingDetails);
    }

    @Nullable
    public final String getBillingDetails() {
        return this.billingDetails;
    }

    @NotNull
    public final Product getProduct() {
        return this.product;
    }

    public int hashCode() {
        int hashCode = this.product.hashCode() * 31;
        String str = this.billingDetails;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "EvaluateOrderRequest(product=" + this.product + ", billingDetails=" + this.billingDetails + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public EvaluateOrderRequest(@NotNull Product product, @Nullable String str) {
        product.getClass();
        this.product = product;
        this.billingDetails = str;
    }
}
