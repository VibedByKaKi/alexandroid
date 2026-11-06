package com.amazon.alexa.redesign.entity.agentforward.domain;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.mobilytics.event.metadata.EventMetadataType;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0015\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/GetHomeContentResponse;", "", "agentForwardContent", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/AgentForwardContent;", "<init>", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/AgentForwardContent;)V", "getAgentForwardContent", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/AgentForwardContent;", "component1", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "", "Companion", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class GetHomeContentResponse {

    @NotNull
    private static final ObjectMapper objectMapper;

    @Nullable
    private final AgentForwardContent agentForwardContent;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    static {
        ObjectMapper objectMapper2 = new ObjectMapper();
        objectMapper2.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper = objectMapper2;
    }

    public /* synthetic */ GetHomeContentResponse(AgentForwardContent agentForwardContent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : agentForwardContent);
    }

    public static /* synthetic */ GetHomeContentResponse copy$default(GetHomeContentResponse getHomeContentResponse, AgentForwardContent agentForwardContent, int i, Object obj) {
        if ((i & 1) != 0) {
            agentForwardContent = getHomeContentResponse.agentForwardContent;
        }
        return getHomeContentResponse.copy(agentForwardContent);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final AgentForwardContent getAgentForwardContent() {
        return this.agentForwardContent;
    }

    @NotNull
    public final GetHomeContentResponse copy(@JsonProperty("agentForward") @Nullable AgentForwardContent agentForwardContent) {
        return new GetHomeContentResponse(agentForwardContent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof GetHomeContentResponse) && Intrinsics.areEqual(this.agentForwardContent, ((GetHomeContentResponse) other).agentForwardContent);
    }

    @Nullable
    public final AgentForwardContent getAgentForwardContent() {
        return this.agentForwardContent;
    }

    public int hashCode() {
        AgentForwardContent agentForwardContent = this.agentForwardContent;
        if (agentForwardContent == null) {
            return 0;
        }
        return agentForwardContent.hashCode();
    }

    @NotNull
    public String toString() {
        return "GetHomeContentResponse(agentForwardContent=" + this.agentForwardContent + MarkdownConstants.RIGHT_PARENTHESIS;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/GetHomeContentResponse$Companion;", "", "<init>", "()V", "objectMapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "fromJson", "Lcom/amazon/alexa/redesign/entity/agentforward/domain/GetHomeContentResponse;", "homeContentResponseStr", "", "toJson", "homeContentResponse", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public final GetHomeContentResponse fromJson(@NotNull String homeContentResponseStr) {
            homeContentResponseStr.getClass();
            int i = 1;
            AgentForwardContent agentForwardContent = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            try {
                JsonNode readTree = GetHomeContentResponse.objectMapper.readTree(homeContentResponseStr);
                if (!readTree.has(EventMetadataType.AGENTFORWARD) && !readTree.has("agentForwardContent")) {
                    return readTree.has("cardStack") ? new GetHomeContentResponse((AgentForwardContent) GetHomeContentResponse.objectMapper.readValue(homeContentResponseStr, AgentForwardContent.class)) : new GetHomeContentResponse(agentForwardContent, i, objArr3 == true ? 1 : 0);
                }
                return (GetHomeContentResponse) GetHomeContentResponse.objectMapper.readValue(homeContentResponseStr, GetHomeContentResponse.class);
            } catch (Exception e) {
                Log.w("AlexaMobileHome", "error when deserializaing GetHomeContentResponse " + e);
                return new GetHomeContentResponse(objArr2 == true ? 1 : 0, i, objArr == true ? 1 : 0);
            }
        }

        @NotNull
        public final String toJson(@NotNull GetHomeContentResponse homeContentResponse) {
            homeContentResponse.getClass();
            try {
                return GetHomeContentResponse.objectMapper.writeValueAsString(homeContentResponse);
            } catch (Exception e) {
                Log.w("AlexaMobileHome", "error when serializing GetHomeContentResponse " + e);
                return "{}";
            }
        }

        private Companion() {
        }
    }

    @JsonCreator
    public GetHomeContentResponse(@JsonProperty("agentForward") @Nullable AgentForwardContent agentForwardContent) {
        this.agentForwardContent = agentForwardContent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JsonCreator
    public GetHomeContentResponse() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
