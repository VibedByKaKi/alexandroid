package com.amazon.alexa.digitalcommerce.api;

import com.amazon.alexa.biloba.utils.WebConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/CreateOrderResponse;", "", "wasSuccessful", "", WebConstants.UriConstants.SUBSCRIPTION_ID, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getWasSuccessful", "()Ljava/lang/String;", "getSubscriptionId", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class CreateOrderResponse {

    @Nullable
    private final String subscriptionId;

    @NotNull
    private final String wasSuccessful;

    public CreateOrderResponse(@NotNull String str, @Nullable String str2) {
        str.getClass();
        this.wasSuccessful = str;
        this.subscriptionId = str2;
    }

    public static /* synthetic */ CreateOrderResponse copy$default(CreateOrderResponse createOrderResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createOrderResponse.wasSuccessful;
        }
        if ((i & 2) != 0) {
            str2 = createOrderResponse.subscriptionId;
        }
        return createOrderResponse.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getWasSuccessful() {
        return this.wasSuccessful;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    @NotNull
    public final CreateOrderResponse copy(@NotNull String wasSuccessful, @Nullable String subscriptionId) {
        wasSuccessful.getClass();
        return new CreateOrderResponse(wasSuccessful, subscriptionId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateOrderResponse)) {
            return false;
        }
        CreateOrderResponse createOrderResponse = (CreateOrderResponse) other;
        return Intrinsics.areEqual(this.wasSuccessful, createOrderResponse.wasSuccessful) && Intrinsics.areEqual(this.subscriptionId, createOrderResponse.subscriptionId);
    }

    @Nullable
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    @NotNull
    public final String getWasSuccessful() {
        return this.wasSuccessful;
    }

    public int hashCode() {
        int hashCode = this.wasSuccessful.hashCode() * 31;
        String str = this.subscriptionId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("CreateOrderResponse(wasSuccessful=", this.wasSuccessful, ", subscriptionId=", this.subscriptionId, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
