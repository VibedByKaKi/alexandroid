package com.amazon.alexa.redesign.entity.agentforward.network;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.navigation.menu.constants.EventBusConstants;
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
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J9\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/amazon/alexa/redesign/entity/agentforward/network/AppComponentDomain;", "", "componentName", "", EventBusConstants.Payload.COMPONENT_TYPE, "Lcom/amazon/alexa/redesign/entity/agentforward/network/ComponentTypeDomain;", "properties", "", "Lcom/fasterxml/jackson/databind/JsonNode;", "<init>", "(Ljava/lang/String;Lcom/amazon/alexa/redesign/entity/agentforward/network/ComponentTypeDomain;Ljava/util/Map;)V", "getComponentName", "()Ljava/lang/String;", "getComponentType", "()Lcom/amazon/alexa/redesign/entity/agentforward/network/ComponentTypeDomain;", "getProperties", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidHomeChannel_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes19.dex */
public final /* data */ class AppComponentDomain {
    public static final int $stable = 8;

    @Nullable
    private final String componentName;

    @Nullable
    private final ComponentTypeDomain componentType;

    @Nullable
    private final Map<String, JsonNode> properties;

    public /* synthetic */ AppComponentDomain(String str, ComponentTypeDomain componentTypeDomain, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : componentTypeDomain, (i & 4) != 0 ? null : map);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppComponentDomain copy$default(AppComponentDomain appComponentDomain, String str, ComponentTypeDomain componentTypeDomain, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            str = appComponentDomain.componentName;
        }
        if ((i & 2) != 0) {
            componentTypeDomain = appComponentDomain.componentType;
        }
        if ((i & 4) != 0) {
            map = appComponentDomain.properties;
        }
        return appComponentDomain.copy(str, componentTypeDomain, map);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getComponentName() {
        return this.componentName;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final ComponentTypeDomain getComponentType() {
        return this.componentType;
    }

    @Nullable
    public final Map<String, JsonNode> component3() {
        return this.properties;
    }

    @NotNull
    public final AppComponentDomain copy(@Nullable String componentName, @Nullable ComponentTypeDomain componentType, @Nullable Map<String, ? extends JsonNode> properties) {
        return new AppComponentDomain(componentName, componentType, properties);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppComponentDomain)) {
            return false;
        }
        AppComponentDomain appComponentDomain = (AppComponentDomain) other;
        return Intrinsics.areEqual(this.componentName, appComponentDomain.componentName) && this.componentType == appComponentDomain.componentType && Intrinsics.areEqual(this.properties, appComponentDomain.properties);
    }

    @Nullable
    public final String getComponentName() {
        return this.componentName;
    }

    @Nullable
    public final ComponentTypeDomain getComponentType() {
        return this.componentType;
    }

    @Nullable
    public final Map<String, JsonNode> getProperties() {
        return this.properties;
    }

    public int hashCode() {
        String str = this.componentName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ComponentTypeDomain componentTypeDomain = this.componentType;
        int hashCode2 = (hashCode + (componentTypeDomain == null ? 0 : componentTypeDomain.hashCode())) * 31;
        Map<String, JsonNode> map = this.properties;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.componentName;
        ComponentTypeDomain componentTypeDomain = this.componentType;
        Map<String, JsonNode> map = this.properties;
        StringBuilder sb = new StringBuilder("AppComponentDomain(componentName=");
        sb.append(str);
        sb.append(", componentType=");
        sb.append(componentTypeDomain);
        sb.append(", properties=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(sb, map, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AppComponentDomain(@Nullable String str, @Nullable ComponentTypeDomain componentTypeDomain, @Nullable Map<String, ? extends JsonNode> map) {
        this.componentName = str;
        this.componentType = componentTypeDomain;
        this.properties = map;
    }

    public AppComponentDomain() {
        this(null, null, null, 7, null);
    }
}
