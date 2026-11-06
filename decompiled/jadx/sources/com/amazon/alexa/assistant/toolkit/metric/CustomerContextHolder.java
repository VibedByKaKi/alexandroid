package com.amazon.alexa.assistant.toolkit.metric;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.tarazed.metrics.BizMetricsConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u0003H\u0016J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/amazon/alexa/assistant/toolkit/metric/CustomerContextHolder;", "", BizMetricsConstants.CUSTOMER_ID, "", "customerDirectedId", "customerMarketplaceId", "customerCountryOfResidence", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCustomerId", "()Ljava/lang/String;", "getCustomerDirectedId", "getCustomerMarketplaceId", "getCustomerCountryOfResidence", "toString", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toolkit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CustomerContextHolder {

    @Nullable
    private final String customerCountryOfResidence;

    @Nullable
    private final String customerDirectedId;

    @Nullable
    private final String customerId;

    @Nullable
    private final String customerMarketplaceId;

    public /* synthetic */ CustomerContextHolder(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public static /* synthetic */ CustomerContextHolder copy$default(CustomerContextHolder customerContextHolder, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customerContextHolder.customerId;
        }
        if ((i & 2) != 0) {
            str2 = customerContextHolder.customerDirectedId;
        }
        if ((i & 4) != 0) {
            str3 = customerContextHolder.customerMarketplaceId;
        }
        if ((i & 8) != 0) {
            str4 = customerContextHolder.customerCountryOfResidence;
        }
        return customerContextHolder.copy(str, str2, str3, str4);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getCustomerDirectedId() {
        return this.customerDirectedId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCustomerMarketplaceId() {
        return this.customerMarketplaceId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getCustomerCountryOfResidence() {
        return this.customerCountryOfResidence;
    }

    @NotNull
    public final CustomerContextHolder copy(@Nullable String customerId, @Nullable String customerDirectedId, @Nullable String customerMarketplaceId, @Nullable String customerCountryOfResidence) {
        return new CustomerContextHolder(customerId, customerDirectedId, customerMarketplaceId, customerCountryOfResidence);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomerContextHolder)) {
            return false;
        }
        CustomerContextHolder customerContextHolder = (CustomerContextHolder) other;
        return Intrinsics.areEqual(this.customerId, customerContextHolder.customerId) && Intrinsics.areEqual(this.customerDirectedId, customerContextHolder.customerDirectedId) && Intrinsics.areEqual(this.customerMarketplaceId, customerContextHolder.customerMarketplaceId) && Intrinsics.areEqual(this.customerCountryOfResidence, customerContextHolder.customerCountryOfResidence);
    }

    @Nullable
    public final String getCustomerCountryOfResidence() {
        return this.customerCountryOfResidence;
    }

    @Nullable
    public final String getCustomerDirectedId() {
        return this.customerDirectedId;
    }

    @Nullable
    public final String getCustomerId() {
        return this.customerId;
    }

    @Nullable
    public final String getCustomerMarketplaceId() {
        return this.customerMarketplaceId;
    }

    public int hashCode() {
        String str = this.customerId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.customerDirectedId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.customerMarketplaceId;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.customerCountryOfResidence;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("CustomerContextHolder(customerId=***, customerDirectedId=***, customerMarketplaceId=", this.customerMarketplaceId, ", customerCountryOfResidence=", this.customerCountryOfResidence, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public CustomerContextHolder(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.customerId = str;
        this.customerDirectedId = str2;
        this.customerMarketplaceId = str3;
        this.customerCountryOfResidence = str4;
    }

    public CustomerContextHolder() {
        this(null, null, null, null, 15, null);
    }
}
