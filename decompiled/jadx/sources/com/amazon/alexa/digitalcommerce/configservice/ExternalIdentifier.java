package com.amazon.alexa.digitalcommerce.configservice;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/amazon/alexa/digitalcommerce/configservice/ExternalIdentifier;", "", "empSku", "", "empProductId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEmpSku", "()Ljava/lang/String;", "getEmpProductId", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidDigitalCommerce_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ExternalIdentifier {

    @NotNull
    private final String empProductId;

    @NotNull
    private final String empSku;

    public ExternalIdentifier(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.empSku = str;
        this.empProductId = str2;
    }

    public static /* synthetic */ ExternalIdentifier copy$default(ExternalIdentifier externalIdentifier, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = externalIdentifier.empSku;
        }
        if ((i & 2) != 0) {
            str2 = externalIdentifier.empProductId;
        }
        return externalIdentifier.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEmpSku() {
        return this.empSku;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getEmpProductId() {
        return this.empProductId;
    }

    @NotNull
    public final ExternalIdentifier copy(@NotNull String empSku, @NotNull String empProductId) {
        empSku.getClass();
        empProductId.getClass();
        return new ExternalIdentifier(empSku, empProductId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExternalIdentifier)) {
            return false;
        }
        ExternalIdentifier externalIdentifier = (ExternalIdentifier) other;
        return Intrinsics.areEqual(this.empSku, externalIdentifier.empSku) && Intrinsics.areEqual(this.empProductId, externalIdentifier.empProductId);
    }

    @NotNull
    public final String getEmpProductId() {
        return this.empProductId;
    }

    @NotNull
    public final String getEmpSku() {
        return this.empSku;
    }

    public int hashCode() {
        return this.empProductId.hashCode() + (this.empSku.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return a$$ExternalSyntheticOutline0.m("ExternalIdentifier(empSku=", this.empSku, ", empProductId=", this.empProductId, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
