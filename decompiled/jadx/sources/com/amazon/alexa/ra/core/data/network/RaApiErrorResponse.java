package com.amazon.alexa.ra.core.data.network;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/amazon/alexa/ra/core/data/network/RaApiErrorResponse;", "Lcom/amazon/alexa/ra/core/data/network/RaApiResponse;", "statusCode", "", "body", "Lcom/amazon/alexa/ra/core/data/network/RaApiResponseBody;", "headers", "", "", "errorMessage", "<init>", "(ILcom/amazon/alexa/ra/core/data/network/RaApiResponseBody;Ljava/util/Map;Ljava/lang/String;)V", "getStatusCode", "()I", "getBody", "()Lcom/amazon/alexa/ra/core/data/network/RaApiResponseBody;", "getHeaders", "()Ljava/util/Map;", "getErrorMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class RaApiErrorResponse implements RaApiResponse {
    public static final int $stable = 8;

    @Nullable
    private final RaApiResponseBody body;

    @Nullable
    private final String errorMessage;

    @NotNull
    private final Map<String, String> headers;
    private final int statusCode;

    public /* synthetic */ RaApiErrorResponse(int i, RaApiResponseBody raApiResponseBody, Map map, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, raApiResponseBody, (i2 & 4) != 0 ? MapsKt.emptyMap() : map, (i2 & 8) != 0 ? null : str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RaApiErrorResponse copy$default(RaApiErrorResponse raApiErrorResponse, int i, RaApiResponseBody raApiResponseBody, Map map, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = raApiErrorResponse.statusCode;
        }
        if ((i2 & 2) != 0) {
            raApiResponseBody = raApiErrorResponse.body;
        }
        if ((i2 & 4) != 0) {
            map = raApiErrorResponse.headers;
        }
        if ((i2 & 8) != 0) {
            str = raApiErrorResponse.errorMessage;
        }
        return raApiErrorResponse.copy(i, raApiResponseBody, map, str);
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

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @NotNull
    public final RaApiErrorResponse copy(int statusCode, @Nullable RaApiResponseBody body, @NotNull Map<String, String> headers, @Nullable String errorMessage) {
        headers.getClass();
        return new RaApiErrorResponse(statusCode, body, headers, errorMessage);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RaApiErrorResponse)) {
            return false;
        }
        RaApiErrorResponse raApiErrorResponse = (RaApiErrorResponse) other;
        return this.statusCode == raApiErrorResponse.statusCode && Intrinsics.areEqual(this.body, raApiErrorResponse.body) && Intrinsics.areEqual(this.headers, raApiErrorResponse.headers) && Intrinsics.areEqual(this.errorMessage, raApiErrorResponse.errorMessage);
    }

    @Override // com.amazon.alexa.ra.core.data.network.RaApiResponse
    @Nullable
    public RaApiResponseBody getBody() {
        return this.body;
    }

    @Nullable
    public final String getErrorMessage() {
        return this.errorMessage;
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
        int m = TableInfo$$ExternalSyntheticOutline0.m(this.headers, (hashCode + (raApiResponseBody == null ? 0 : raApiResponseBody.hashCode())) * 31, 31);
        String str = this.errorMessage;
        return m + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "RaApiErrorResponse(statusCode=" + this.statusCode + ", body=" + this.body + ", headers=" + this.headers + ", errorMessage=" + this.errorMessage + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public RaApiErrorResponse(int i, @Nullable RaApiResponseBody raApiResponseBody, @NotNull Map<String, String> map, @Nullable String str) {
        map.getClass();
        this.statusCode = i;
        this.body = raApiResponseBody;
        this.headers = map;
        this.errorMessage = str;
    }
}
