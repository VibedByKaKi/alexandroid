package com.amazon.alexa.redesign.entity.agentforward.domain;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.navigation.menu.constants.EventBusConstants;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\b\u0007\u0012\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J9\u0010\u001a\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0003\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/domain/AppComponent;", "", "componentName", "", EventBusConstants.Payload.COMPONENT_TYPE, "Lcom/amazon/alexa/redesign/entity/agentforward/domain/ComponentType;", "properties", "", "Lcom/fasterxml/jackson/databind/JsonNode;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/redesign/entity/agentforward/domain/ComponentType;Ljava/util/Map;)V", "getComponentName", "()Ljava/lang/String;", "setComponentName", "(Ljava/lang/String;)V", "getComponentType", "()Lcom/amazon/alexa/redesign/entity/agentforward/domain/ComponentType;", "setComponentType", "(Lcom/amazon/alexa/redesign/entity/agentforward/domain/ComponentType;)V", "getProperties", "()Ljava/util/Map;", "setProperties", "(Ljava/util/Map;)V", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class AppComponent {
    public static final int $stable = 8;

    @Nullable
    private String componentName;

    @Nullable
    private ComponentType componentType;

    @Nullable
    private Map<String, ? extends JsonNode> properties;

    public /* synthetic */ AppComponent(String str, ComponentType componentType, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : componentType, (i & 4) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppComponent copy$default(AppComponent appComponent, String str, ComponentType componentType, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appComponent.componentName;
        }
        if ((i & 2) != 0) {
            componentType = appComponent.componentType;
        }
        if ((i & 4) != 0) {
            map = appComponent.properties;
        }
        return appComponent.copy(str, componentType, map);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getComponentName() {
        return this.componentName;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ComponentType getComponentType() {
        return this.componentType;
    }

    @Nullable
    public final Map<String, JsonNode> component3() {
        return this.properties;
    }

    @NotNull
    public final AppComponent copy(@JsonProperty("name") @Nullable String componentName, @JsonProperty("type") @Nullable ComponentType componentType, @JsonProperty("properties") @Nullable Map<String, ? extends JsonNode> properties) {
        return new AppComponent(componentName, componentType, properties);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppComponent)) {
            return false;
        }
        AppComponent appComponent = (AppComponent) other;
        return Intrinsics.areEqual(this.componentName, appComponent.componentName) && this.componentType == appComponent.componentType && Intrinsics.areEqual(this.properties, appComponent.properties);
    }

    @Nullable
    public final String getComponentName() {
        return this.componentName;
    }

    @Nullable
    public final ComponentType getComponentType() {
        return this.componentType;
    }

    @Nullable
    public final Map<String, JsonNode> getProperties() {
        return this.properties;
    }

    public int hashCode() {
        String str = this.componentName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ComponentType componentType = this.componentType;
        int hashCode2 = (hashCode + (componentType == null ? 0 : componentType.hashCode())) * 31;
        Map<String, ? extends JsonNode> map = this.properties;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final void setComponentName(@Nullable String str) {
        this.componentName = str;
    }

    public final void setComponentType(@Nullable ComponentType componentType) {
        this.componentType = componentType;
    }

    public final void setProperties(@Nullable Map<String, ? extends JsonNode> map) {
        this.properties = map;
    }

    @NotNull
    public String toString() {
        String str = this.componentName;
        ComponentType componentType = this.componentType;
        Map<String, ? extends JsonNode> map = this.properties;
        StringBuilder sb = new StringBuilder("AppComponent(componentName=");
        sb.append(str);
        sb.append(", componentType=");
        sb.append(componentType);
        sb.append(", properties=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, map, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @JsonCreator
    public AppComponent(@JsonProperty("name") @Nullable String str, @JsonProperty("type") @Nullable ComponentType componentType, @JsonProperty("properties") @Nullable Map<String, ? extends JsonNode> map) {
        this.componentName = str;
        this.componentType = componentType;
        this.properties = map;
    }

    @JsonCreator
    public AppComponent() {
        this(null, null, null, 7, null);
    }
}
