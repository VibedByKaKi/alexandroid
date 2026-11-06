package com.amazon.alexa.digitalcommerce.api;

import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001c\u001dB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB1\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\fJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/CreateOrderRequest;", "", AMPDInformationProvider.DEVICE_PRODUCT_KEY, "Lcom/amazon/alexa/digitalcommerce/api/CreateOrderRequest$Product;", "billingDetails", "", "orderInitToken", "<init>", "(Lcom/amazon/alexa/digitalcommerce/api/CreateOrderRequest$Product;Ljava/lang/String;Ljava/lang/String;)V", "locale", "empSku", "productAsin", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProduct", "()Lcom/amazon/alexa/digitalcommerce/api/CreateOrderRequest$Product;", "getBillingDetails", "()Ljava/lang/String;", "getOrderInitToken", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", DataRecordKey.PRODUCT, "Offer", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CreateOrderRequest {

    @NotNull
    private final String billingDetails;

    @NotNull
    private final String orderInitToken;

    @NotNull
    private final Product product;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/CreateOrderRequest$Offer;", "Ljava/io/Serializable;", "empSku", "", "locale", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmpSku", "()Ljava/lang/String;", "getLocale", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Offer implements Serializable {

        @NotNull
        private final String empSku;

        @NotNull
        private final String locale;

        public Offer(@NotNull String str, @NotNull String str2) {
            str.getClass();
            str2.getClass();
            this.empSku = str;
            this.locale = str2;
        }

        public static /* synthetic */ Offer copy$default(Offer offer, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = offer.empSku;
            }
            if ((i & 2) != 0) {
                str2 = offer.locale;
            }
            return offer.copy(str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getEmpSku() {
            return this.empSku;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        @NotNull
        public final Offer copy(@NotNull String empSku, @NotNull String locale) {
            empSku.getClass();
            locale.getClass();
            return new Offer(empSku, locale);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Offer)) {
                return false;
            }
            Offer offer = (Offer) other;
            return Intrinsics.areEqual(this.empSku, offer.empSku) && Intrinsics.areEqual(this.locale, offer.locale);
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
            return this.locale.hashCode() + (this.empSku.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return a$$ExternalSyntheticOutline0.m("Offer(empSku=", this.empSku, ", locale=", this.locale, MarkdownConstants.RIGHT_PARENTHESIS);
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/CreateOrderRequest$Product;", "Ljava/io/Serializable;", "productAsin", "", WebRTCSignalTypes.OFFER, "Lcom/amazon/alexa/digitalcommerce/api/CreateOrderRequest$Offer;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/digitalcommerce/api/CreateOrderRequest$Offer;)V", "getProductAsin", "()Ljava/lang/String;", "getOffer", "()Lcom/amazon/alexa/digitalcommerce/api/CreateOrderRequest$Offer;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
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
    public CreateOrderRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5) {
        this(new Product(str3, new Offer(str2, str)), str4, str5);
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
    }

    public static /* synthetic */ CreateOrderRequest copy$default(CreateOrderRequest createOrderRequest, Product product, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            product = createOrderRequest.product;
        }
        if ((i & 2) != 0) {
            str = createOrderRequest.billingDetails;
        }
        if ((i & 4) != 0) {
            str2 = createOrderRequest.orderInitToken;
        }
        return createOrderRequest.copy(product, str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Product getProduct() {
        return this.product;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getBillingDetails() {
        return this.billingDetails;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getOrderInitToken() {
        return this.orderInitToken;
    }

    @NotNull
    public final CreateOrderRequest copy(@NotNull Product product, @NotNull String billingDetails, @NotNull String orderInitToken) {
        product.getClass();
        billingDetails.getClass();
        orderInitToken.getClass();
        return new CreateOrderRequest(product, billingDetails, orderInitToken);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateOrderRequest)) {
            return false;
        }
        CreateOrderRequest createOrderRequest = (CreateOrderRequest) other;
        return Intrinsics.areEqual(this.product, createOrderRequest.product) && Intrinsics.areEqual(this.billingDetails, createOrderRequest.billingDetails) && Intrinsics.areEqual(this.orderInitToken, createOrderRequest.orderInitToken);
    }

    @NotNull
    public final String getBillingDetails() {
        return this.billingDetails;
    }

    @NotNull
    public final String getOrderInitToken() {
        return this.orderInitToken;
    }

    @NotNull
    public final Product getProduct() {
        return this.product;
    }

    public int hashCode() {
        return this.orderInitToken.hashCode() + ArcMode$$ExternalSyntheticOutline0.m(this.product.hashCode() * 31, 31, this.billingDetails);
    }

    @NotNull
    public String toString() {
        Product product = this.product;
        String str = this.billingDetails;
        String str2 = this.orderInitToken;
        StringBuilder sb = new StringBuilder("CreateOrderRequest(product=");
        sb.append(product);
        sb.append(", billingDetails=");
        sb.append(str);
        sb.append(", orderInitToken=");
        return a$$ExternalSyntheticOutline0.m(sb, str2, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public CreateOrderRequest(@NotNull Product product, @NotNull String str, @NotNull String str2) {
        product.getClass();
        str.getClass();
        str2.getClass();
        this.product = product;
        this.billingDetails = str;
        this.orderInitToken = str2;
    }
}
