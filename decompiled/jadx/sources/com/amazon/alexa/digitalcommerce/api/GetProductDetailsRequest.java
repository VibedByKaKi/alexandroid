package com.amazon.alexa.digitalcommerce.api;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.animation.core.ArcMode$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/api/GetProductDetailsRequest;", "", "productAsin", "", "externalId", "ref", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getProductAsin", "()Ljava/lang/String;", "getExternalId", "getRef", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class GetProductDetailsRequest {

    @NotNull
    private final String externalId;

    @NotNull
    private final String productAsin;

    @Nullable
    private final String ref;

    public GetProductDetailsRequest(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        str.getClass();
        str2.getClass();
        this.productAsin = str;
        this.externalId = str2;
        this.ref = str3;
    }

    public static /* synthetic */ GetProductDetailsRequest copy$default(GetProductDetailsRequest getProductDetailsRequest, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = getProductDetailsRequest.productAsin;
        }
        if ((i & 2) != 0) {
            str2 = getProductDetailsRequest.externalId;
        }
        if ((i & 4) != 0) {
            str3 = getProductDetailsRequest.ref;
        }
        return getProductDetailsRequest.copy(str, str2, str3);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getProductAsin() {
        return this.productAsin;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getExternalId() {
        return this.externalId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getRef() {
        return this.ref;
    }

    @NotNull
    public final GetProductDetailsRequest copy(@NotNull String productAsin, @NotNull String externalId, @Nullable String ref) {
        productAsin.getClass();
        externalId.getClass();
        return new GetProductDetailsRequest(productAsin, externalId, ref);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GetProductDetailsRequest)) {
            return false;
        }
        GetProductDetailsRequest getProductDetailsRequest = (GetProductDetailsRequest) other;
        return Intrinsics.areEqual(this.productAsin, getProductDetailsRequest.productAsin) && Intrinsics.areEqual(this.externalId, getProductDetailsRequest.externalId) && Intrinsics.areEqual(this.ref, getProductDetailsRequest.ref);
    }

    @NotNull
    public final String getExternalId() {
        return this.externalId;
    }

    @NotNull
    public final String getProductAsin() {
        return this.productAsin;
    }

    @Nullable
    public final String getRef() {
        return this.ref;
    }

    public int hashCode() {
        int m = ArcMode$$ExternalSyntheticOutline0.m(this.productAsin.hashCode() * 31, 31, this.externalId);
        String str = this.ref;
        return m + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.productAsin;
        String str2 = this.externalId;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("GetProductDetailsRequest(productAsin=", str, ", externalId=", str2, ", ref="), this.ref, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ GetProductDetailsRequest(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3);
    }
}
