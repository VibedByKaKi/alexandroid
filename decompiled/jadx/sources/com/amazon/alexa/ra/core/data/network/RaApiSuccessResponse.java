package com.amazon.alexa.ra.core.data.network;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/ra/core/data/network/RaApiSuccessResponse;", "Lcom/amazon/alexa/ra/core/data/network/RaApiResponse;", "statusCode", "", "body", "Lcom/amazon/alexa/ra/core/data/network/RaApiResponseBody;", "headers", "", "", "<init>", "(ILcom/amazon/alexa/ra/core/data/network/RaApiResponseBody;Ljava/util/Map;)V", "getStatusCode", "()I", "getBody", "()Lcom/amazon/alexa/ra/core/data/network/RaApiResponseBody;", "getHeaders", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class RaApiSuccessResponse implements RaApiResponse {
    public static final int $stable = 8;

    @Nullable
    private final RaApiResponseBody body;

    @NotNull
    private final Map<String, String> headers;
    private final int statusCode;

    public RaApiSuccessResponse(int i, @Nullable RaApiResponseBody raApiResponseBody, @NotNull Map<String, String> map) {
        map.getClass();
        this.statusCode = i;
        this.body = raApiResponseBody;
        this.headers = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RaApiSuccessResponse copy$default(RaApiSuccessResponse raApiSuccessResponse, int i, RaApiResponseBody raApiResponseBody, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = raApiSuccessResponse.statusCode;
        }
        if ((i2 & 2) != 0) {
            raApiResponseBody = raApiSuccessResponse.body;
        }
        if ((i2 & 4) != 0) {
            map = raApiSuccessResponse.headers;
        }
        return raApiSuccessResponse.copy(i, raApiResponseBody, map);
    }

    /* renamed from: component1, reason: from getter */
    public final int getStatusCode() {
        return this.statusCode;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final RaApiResponseBody getBody() {
        return this.body;
    }

    @NotNull
    public final Map<String, String> component3() {
        return this.headers;
    }

    @NotNull
    public final RaApiSuccessResponse copy(int statusCode, @Nullable RaApiResponseBody body, @NotNull Map<String, String> headers) {
        headers.getClass();
        return new RaApiSuccessResponse(statusCode, body, headers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RaApiSuccessResponse)) {
            return false;
        }
        RaApiSuccessResponse raApiSuccessResponse = (RaApiSuccessResponse) other;
        return this.statusCode == raApiSuccessResponse.statusCode && Intrinsics.areEqual(this.body, raApiSuccessResponse.body) && Intrinsics.areEqual(this.headers, raApiSuccessResponse.headers);
    }

    @Override // com.amazon.alexa.ra.core.data.network.RaApiResponse
    @Nullable
    public RaApiResponseBody getBody() {
        return this.body;
    }

    @Override // com.amazon.alexa.ra.core.data.network.RaApiResponse
    @NotNull
    public Map<String, String> getHeaders() {
        return this.headers;
    }

    @Override // com.amazon.alexa.ra.core.data.network.RaApiResponse
    public int getStatusCode() {
        return this.statusCode;
    }

    public int hashCode() {
        int hashCode = Integer.hashCode(this.statusCode) * 31;
        RaApiResponseBody raApiResponseBody = this.body;
        return this.headers.hashCode() + ((hashCode + (raApiResponseBody == null ? 0 : raApiResponseBody.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        int i = this.statusCode;
        RaApiResponseBody raApiResponseBody = this.body;
        Map<String, String> map = this.headers;
        StringBuilder sb = new StringBuilder("RaApiSuccessResponse(statusCode=");
        sb.append(i);
        sb.append(", body=");
        sb.append(raApiResponseBody);
        sb.append(", headers=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, map, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    public /* synthetic */ RaApiSuccessResponse(int i, RaApiResponseBody raApiResponseBody, Map map, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, raApiResponseBody, (i2 & 4) != 0 ? MapsKt.emptyMap() : map);
    }
}
