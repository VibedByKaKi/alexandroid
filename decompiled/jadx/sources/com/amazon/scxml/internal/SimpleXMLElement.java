package com.amazon.scxml.internal;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.room.util.TableInfo$$ExternalSyntheticOutline0;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.mapbox.maps.MapboxMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007HÆ\u0003J9\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/amazon/scxml/internal/SimpleXMLElement;", "", "name", "", "attributes", "", MapboxMap.QFE_CHILDREN, "", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getAttributes", "()Ljava/util/Map;", "getChildren", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "AlexaMobileAndroidVoice-TTA_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class SimpleXMLElement {

    @NotNull
    private final Map<String, String> attributes;

    @NotNull
    private final List<SimpleXMLElement> children;

    @NotNull
    private final String name;

    public SimpleXMLElement(@NotNull String str, @NotNull Map<String, String> map, @NotNull List<SimpleXMLElement> list) {
        str.getClass();
        map.getClass();
        list.getClass();
        this.name = str;
        this.attributes = map;
        this.children = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SimpleXMLElement copy$default(SimpleXMLElement simpleXMLElement, String str, Map map, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = simpleXMLElement.name;
        }
        if ((i & 2) != 0) {
            map = simpleXMLElement.attributes;
        }
        if ((i & 4) != 0) {
            list = simpleXMLElement.children;
        }
        return simpleXMLElement.copy(str, map, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final Map<String, String> component2() {
        return this.attributes;
    }

    @NotNull
    public final List<SimpleXMLElement> component3() {
        return this.children;
    }

    @NotNull
    public final SimpleXMLElement copy(@NotNull String name, @NotNull Map<String, String> attributes, @NotNull List<SimpleXMLElement> children) {
        name.getClass();
        attributes.getClass();
        children.getClass();
        return new SimpleXMLElement(name, attributes, children);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SimpleXMLElement)) {
            return false;
        }
        SimpleXMLElement simpleXMLElement = (SimpleXMLElement) other;
        return Intrinsics.areEqual(this.name, simpleXMLElement.name) && Intrinsics.areEqual(this.attributes, simpleXMLElement.attributes) && Intrinsics.areEqual(this.children, simpleXMLElement.children);
    }

    @NotNull
    public final Map<String, String> getAttributes() {
        return this.attributes;
    }

    @NotNull
    public final List<SimpleXMLElement> getChildren() {
        return this.children;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.children.hashCode() + TableInfo$$ExternalSyntheticOutline0.m(this.attributes, this.name.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        String str = this.name;
        Map<String, String> map = this.attributes;
        List<SimpleXMLElement> list = this.children;
        StringBuilder sb = new StringBuilder("SimpleXMLElement(name=");
        sb.append(str);
        sb.append(", attributes=");
        sb.append(map);
        sb.append(", children=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(MarkdownConstants.RIGHT_PARENTHESIS, list, sb);
    }
}
