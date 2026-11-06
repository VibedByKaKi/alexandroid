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
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/alexa/ra/core/data/network/RaApiRequest;", "", "url", "", "headers", "", "format", "Lcom/amazon/alexa/ra/core/data/network/RaApiResponseFormat;", "<init>", "(Ljava/lang/String;Ljava/util/Map;Lcom/amazon/alexa/ra/core/data/network/RaApiResponseFormat;)V", "getUrl", "()Ljava/lang/String;", "getHeaders", "()Ljava/util/Map;", "getFormat", "()Lcom/amazon/alexa/ra/core/data/network/RaApiResponseFormat;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "ui-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes18.dex */
public final /* data */ class RaApiRequest {
    public static final int $stable = 8;

    @NotNull
    private final RaApiResponseFormat format;

    @NotNull
    private final Map<String, String> headers;

    @NotNull
    private final String url;

    public RaApiRequest(@NotNull String str, @NotNull Map<String, String> map, @NotNull RaApiResponseFormat raApiResponseFormat) {
        str.getClass();
        map.getClass();
        raApiResponseFormat.getClass();
        this.url = str;
        this.headers = map;
        this.format = raApiResponseFormat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RaApiRequest copy$default(RaApiRequest raApiRequest, String str, Map map, RaApiResponseFormat raApiResponseFormat, int i, Object obj) {
        if ((i & 1) != 0) {
            str = raApiRequest.url;
        }
        if ((i & 2) != 0) {
            map = raApiRequest.headers;
        }
        if ((i & 4) != 0) {
            raApiResponseFormat = raApiRequest.format;
        }
        return raApiRequest.copy(str, map, raApiResponseFormat);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.headers;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final RaApiResponseFormat getFormat() {
        return this.format;
    }

    @NotNull
    public final RaApiRequest copy(@NotNull String url, @NotNull Map<String, String> headers, @NotNull RaApiResponseFormat format) {
        url.getClass();
        headers.getClass();
        format.getClass();
        return new RaApiRequest(url, headers, format);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RaApiRequest)) {
            return false;
        }
        RaApiRequest raApiRequest = (RaApiRequest) other;
        return Intrinsics.areEqual(this.url, raApiRequest.url) && Intrinsics.areEqual(this.headers, raApiRequest.headers) && this.format == raApiRequest.format;
    }

    @NotNull
    public final RaApiResponseFormat getFormat() {
        return this.format;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.format.hashCode() + TableInfo$$ExternalSyntheticOutline0.m(this.headers, this.url.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "RaApiRequest(url=" + this.url + ", headers=" + this.headers + ", format=" + this.format + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    public /* synthetic */ RaApiRequest(String str, Map map, RaApiResponseFormat raApiResponseFormat, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? MapsKt.emptyMap() : map, (i & 4) != 0 ? RaApiResponseFormat.STRING : raApiResponseFormat);
    }
}
