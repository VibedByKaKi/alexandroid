package com.amazon.alexa.redesign.entity.agentforward.network;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/network/OpenRouteUriDomain;", "Lcom/amazon/alexa/redesign/entity/agentforward/network/ContentActionDomain;", "uri", "", "options", "", "Lcom/fasterxml/jackson/databind/JsonNode;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getUri", "()Ljava/lang/String;", "getOptions", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class OpenRouteUriDomain implements ContentActionDomain {
    public static final int $stable = 8;

    @Nullable
    private final Map<String, JsonNode> options;

    @Nullable
    private final String uri;

    public /* synthetic */ OpenRouteUriDomain(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OpenRouteUriDomain copy$default(OpenRouteUriDomain openRouteUriDomain, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openRouteUriDomain.uri;
        }
        if ((i & 2) != 0) {
            map = openRouteUriDomain.options;
        }
        return openRouteUriDomain.copy(str, map);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getUri() {
        return this.uri;
    }

    @Nullable
    public final Map<String, JsonNode> component2() {
        return this.options;
    }

    @NotNull
    public final OpenRouteUriDomain copy(@Nullable String uri, @Nullable Map<String, ? extends JsonNode> options) {
        return new OpenRouteUriDomain(uri, options);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenRouteUriDomain)) {
            return false;
        }
        OpenRouteUriDomain openRouteUriDomain = (OpenRouteUriDomain) other;
        return Intrinsics.areEqual(this.uri, openRouteUriDomain.uri) && Intrinsics.areEqual(this.options, openRouteUriDomain.options);
    }

    @Nullable
    public final Map<String, JsonNode> getOptions() {
        return this.options;
    }

    @Nullable
    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        String str = this.uri;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Map<String, JsonNode> map = this.options;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "OpenRouteUriDomain(uri=" + this.uri + ", options=" + this.options + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OpenRouteUriDomain(@Nullable String str, @Nullable Map<String, ? extends JsonNode> map) {
        this.uri = str;
        this.options = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OpenRouteUriDomain() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
