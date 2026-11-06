package com.amazon.alexa.ra.core.data.network;

import androidx.annotation.Keep;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 1)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/amazon/alexa/ra/core/data/network/DomainStatusResponse;", "", "domain", "", "status", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDomain", "()Ljava/lang/String;", "getStatus", "getTimestamp", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class DomainStatusResponse {
    public static final int $stable = 0;

    @SerializedName("domain")
    @Nullable
    private final String domain;

    @SerializedName("status")
    @Nullable
    private final String status;

    @SerializedName("timestamp")
    @Nullable
    private final String timestamp;

    public DomainStatusResponse(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.domain = str;
        this.status = str2;
        this.timestamp = str3;
    }

    public static /* synthetic */ DomainStatusResponse copy$default(DomainStatusResponse domainStatusResponse, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = domainStatusResponse.domain;
        }
        if ((i & 2) != 0) {
            str2 = domainStatusResponse.status;
        }
        if ((i & 4) != 0) {
            str3 = domainStatusResponse.timestamp;
        }
        return domainStatusResponse.copy(str, str2, str3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    public final DomainStatusResponse copy(@Nullable String domain, @Nullable String status, @Nullable String timestamp) {
        return new DomainStatusResponse(domain, status, timestamp);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DomainStatusResponse)) {
            return false;
        }
        DomainStatusResponse domainStatusResponse = (DomainStatusResponse) other;
        return Intrinsics.areEqual(this.domain, domainStatusResponse.domain) && Intrinsics.areEqual(this.status, domainStatusResponse.status) && Intrinsics.areEqual(this.timestamp, domainStatusResponse.timestamp);
    }

    @Nullable
    public final String getDomain() {
        return this.domain;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        String str = this.domain;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.status;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.timestamp;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.domain;
        String str2 = this.status;
        return a$$ExternalSyntheticOutline0.m(ErrorUtils$$ExternalSyntheticOutline0.m("DomainStatusResponse(domain=", str, ", status=", str2, ", timestamp="), this.timestamp, MarkdownConstants.RIGHT_PARENTHESIS);
    }
}
