package com.amazon.alexa.redesign.entity.agentforward.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0003\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0016\b\u0003\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/OpenRouteUri;", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/ContentAction;", "uri", "", "options", "", "Lcom/fasterxml/jackson/databind/JsonNode;", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getUri", "()Ljava/lang/String;", "setUri", "(Ljava/lang/String;)V", "getOptions", "()Ljava/util/Map;", "setOptions", "(Ljava/util/Map;)V", "component1", "component2", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class OpenRouteUri implements ContentAction {
    public static final int $stable = 8;

    @Nullable
    private Map<String, ? extends JsonNode> options;

    @Nullable
    private String uri;

    public /* synthetic */ OpenRouteUri(String str, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OpenRouteUri copy$default(OpenRouteUri openRouteUri, String str, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openRouteUri.uri;
        }
        if ((i & 2) != 0) {
            map = openRouteUri.options;
        }
        return openRouteUri.copy(str, map);
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
    public final OpenRouteUri copy(@JsonProperty("uri") @Nullable String uri, @JsonProperty("options") @Nullable Map<String, ? extends JsonNode> options) {
        return new OpenRouteUri(uri, options);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenRouteUri)) {
            return false;
        }
        OpenRouteUri openRouteUri = (OpenRouteUri) other;
        return Intrinsics.areEqual(this.uri, openRouteUri.uri) && Intrinsics.areEqual(this.options, openRouteUri.options);
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
        Map<String, ? extends JsonNode> map = this.options;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public final void setOptions(@Nullable Map<String, ? extends JsonNode> map) {
        this.options = map;
    }

    public final void setUri(@Nullable String str) {
        this.uri = str;
    }

    @NotNull
    public String toString() {
        return "OpenRouteUri(uri=" + this.uri + ", options=" + this.options + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    @JsonCreator
    public OpenRouteUri(@JsonProperty("uri") @Nullable String str, @JsonProperty("options") @Nullable Map<String, ? extends JsonNode> map) {
        this.uri = str;
        this.options = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JsonCreator
    public OpenRouteUri() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
