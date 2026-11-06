package com.mapbox.maps.extension.style.sources.generated;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.android.tools.r8.RecordTag;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.maps.TileCacheBudget;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.sources.Source;
import com.mapbox.maps.extension.style.sources.SourceUtils;
import com.mapbox.maps.extension.style.sources.TileSet;
import com.mapbox.maps.extension.style.types.SourceDsl;
import com.mapbox.maps.extension.style.utils.TypeUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u0000 )2\u00020\u0001:\u0003()*B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\r\u0010%\u001a\u00020\u0006H\u0010¢\u0006\u0002\b&J\u0010\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020\u000fJ\u0010\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0018J\u0014\u0010\u001d\u001a\u00020\u00002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00060\nJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010'\u001a\u00020\u0006J\u0010\u0010!\u001a\u00020\u00002\b\b\u0002\u0010'\u001a\u00020\"R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\rR\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0011R\u0019\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\rR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b \u0010\bR\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006+"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource;", "Lcom/mapbox/maps/extension/style/sources/Source;", "builder", "Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource$Builder;", "(Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource$Builder;)V", "attribution", "", "getAttribution", "()Ljava/lang/String;", "bounds", "", "", "getBounds", "()Ljava/util/List;", "maxzoom", "", "getMaxzoom", "()Ljava/lang/Long;", "minzoom", "getMinzoom", "rasterLayers", "Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource$RasterDataLayer;", "getRasterLayers", "tileCacheBudget", "Lcom/mapbox/maps/TileCacheBudget;", "getTileCacheBudget", "()Lcom/mapbox/maps/TileCacheBudget;", "tileSize", "getTileSize", "tiles", "getTiles", "url", "getUrl", "volatile", "", "getVolatile", "()Ljava/lang/Boolean;", "getType", "getType$extension_style_release", "value", "Builder", "Companion", "RasterDataLayer", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
/* loaded from: classes9.dex */
public final class RasterArraySource extends Source {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u0003H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource$RasterDataLayer;", "", "layerId", "", "bands", "", "(Ljava/lang/String;Ljava/util/List;)V", "getBands", "()Ljava/util/List;", "getLayerId", "()Ljava/lang/String;", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "hashCode", "", "toString", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class RasterDataLayer {

        @NotNull
        private final List<String> bands;

        @NotNull
        private final String layerId;

        public RasterDataLayer(@NotNull String str, @NotNull List<String> list) {
            str.getClass();
            list.getClass();
            this.layerId = str;
            this.bands = list;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(RasterDataLayer.class, other != null ? other.getClass() : null)) {
                return false;
            }
            other.getClass();
            RasterDataLayer rasterDataLayer = (RasterDataLayer) other;
            return Intrinsics.areEqual(this.layerId, rasterDataLayer.layerId) && Intrinsics.areEqual(this.bands, rasterDataLayer.bands);
        }

        @NotNull
        public final List<String> getBands() {
            return this.bands;
        }

        @NotNull
        public final String getLayerId() {
            return this.layerId;
        }

        public int hashCode() {
            return Objects.hash(this.layerId, this.bands);
        }

        @NotNull
        public String toString() {
            StringBuilder sb = new StringBuilder("RasterDataLayer(layerId=");
            sb.append(this.layerId);
            sb.append(", bands:");
            return AppLaunchChecker$$ExternalSyntheticOutline0.m(sb, (List) this.bands, ')');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RasterArraySource(@NotNull Builder builder) {
        super(builder.getSourceId());
        builder.getClass();
        getSourceProperties$extension_style_release().putAll(builder.getProperties$extension_style_release());
        getVolatileSourceProperties$extension_style_release().putAll(builder.getVolatileProperties$extension_style_release());
    }

    public static /* synthetic */ RasterArraySource maxzoom$default(RasterArraySource rasterArraySource, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 22;
        }
        return rasterArraySource.maxzoom(j);
    }

    public static /* synthetic */ RasterArraySource minzoom$default(RasterArraySource rasterArraySource, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        return rasterArraySource.minzoom(j);
    }

    public static /* synthetic */ RasterArraySource volatile$default(RasterArraySource rasterArraySource, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return rasterArraySource.m24754volatile(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final String getAttribution() {
        Object obj;
        Object obj2;
        StylePropertyValue styleSourceProperty;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            Duration$$ExternalSyntheticBUOutline0.m$1("Couldn't get attribution: source is not added to style yet.");
            return null;
        }
        try {
            styleSourceProperty = delegate.getStyleSourceProperty(getSourceId(), "attribution");
        } catch (RuntimeException e) {
            MapboxLogger.logW("Mbgl-Source", "Get source property attribution failed: " + e.getMessage());
            RecordTag.m(delegate.getStyleSourceProperty(getSourceId(), "attribution"), new StringBuilder("Value returned: "), "Mbgl-Source");
            obj = null;
        }
        if (Intrinsics.areEqual("attribution", "rasterLayers") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Object contents = styleSourceProperty.getValue().getContents();
            contents.getClass();
            Set entrySet = ((HashMap) contents).entrySet();
            entrySet.getClass();
            Set<Map.Entry> set = entrySet;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            for (Map.Entry entry : set) {
                Object key = entry.getKey();
                key.getClass();
                String str = (String) key;
                Object contents2 = ((Value) entry.getValue()).getContents();
                contents2.getClass();
                List list = (List) contents2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Object contents3 = ((Value) it2.next()).getContents();
                    contents3.getClass();
                    arrayList2.add((String) contents3);
                }
                arrayList.add(new RasterDataLayer(str, arrayList2));
            }
            obj2 = (String) arrayList;
        } else if (Intrinsics.areEqual("attribution", "tile-cache-budget") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Value value = styleSourceProperty.getValue();
            value.getClass();
            obj2 = (String) SourceUtils.unwrapToTileCacheBudget(value);
        } else if (Intrinsics.areEqual("attribution", ModelSourceWrapper.MODELS)) {
            Value value2 = styleSourceProperty.getValue();
            value2.getClass();
            obj2 = (String) ModelSourceModelKt.unwrapToModelSourceModels(value2);
        } else {
            obj = TypeUtilsKt.unwrap(styleSourceProperty, String.class);
            obj2 = obj;
        }
        return (String) obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Nullable
    public final List<Double> getBounds() {
        Object obj;
        ?? r3;
        StylePropertyValue styleSourceProperty;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            Duration$$ExternalSyntheticBUOutline0.m$1("Couldn't get bounds: source is not added to style yet.");
            return null;
        }
        try {
            styleSourceProperty = delegate.getStyleSourceProperty(getSourceId(), "bounds");
        } catch (RuntimeException e) {
            MapboxLogger.logW("Mbgl-Source", "Get source property bounds failed: " + e.getMessage());
            RecordTag.m(delegate.getStyleSourceProperty(getSourceId(), "bounds"), new StringBuilder("Value returned: "), "Mbgl-Source");
            obj = null;
        }
        if (Intrinsics.areEqual("bounds", "rasterLayers") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Object contents = styleSourceProperty.getValue().getContents();
            contents.getClass();
            Set entrySet = ((HashMap) contents).entrySet();
            entrySet.getClass();
            Set<Map.Entry> set = entrySet;
            r3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            for (Map.Entry entry : set) {
                Object key = entry.getKey();
                key.getClass();
                String str = (String) key;
                Object contents2 = ((Value) entry.getValue()).getContents();
                contents2.getClass();
                List list = (List) contents2;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Object contents3 = ((Value) it2.next()).getContents();
                    contents3.getClass();
                    arrayList.add((String) contents3);
                }
                r3.add(new RasterDataLayer(str, arrayList));
            }
        } else if (Intrinsics.areEqual("bounds", "tile-cache-budget") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Value value = styleSourceProperty.getValue();
            value.getClass();
            r3 = (List) SourceUtils.unwrapToTileCacheBudget(value);
        } else if (Intrinsics.areEqual("bounds", ModelSourceWrapper.MODELS)) {
            Value value2 = styleSourceProperty.getValue();
            value2.getClass();
            r3 = ModelSourceModelKt.unwrapToModelSourceModels(value2);
        } else {
            obj = TypeUtilsKt.unwrap(styleSourceProperty, List.class);
            r3 = obj;
        }
        return (List) r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Long getMaxzoom() {
        Object obj;
        Object obj2;
        StylePropertyValue styleSourceProperty;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            Duration$$ExternalSyntheticBUOutline0.m$1("Couldn't get maxzoom: source is not added to style yet.");
            return null;
        }
        try {
            styleSourceProperty = delegate.getStyleSourceProperty(getSourceId(), "maxzoom");
        } catch (RuntimeException e) {
            MapboxLogger.logW("Mbgl-Source", "Get source property maxzoom failed: " + e.getMessage());
            RecordTag.m(delegate.getStyleSourceProperty(getSourceId(), "maxzoom"), new StringBuilder("Value returned: "), "Mbgl-Source");
            obj = null;
        }
        if (Intrinsics.areEqual("maxzoom", "rasterLayers") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Object contents = styleSourceProperty.getValue().getContents();
            contents.getClass();
            Set entrySet = ((HashMap) contents).entrySet();
            entrySet.getClass();
            Set<Map.Entry> set = entrySet;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            for (Map.Entry entry : set) {
                Object key = entry.getKey();
                key.getClass();
                String str = (String) key;
                Object contents2 = ((Value) entry.getValue()).getContents();
                contents2.getClass();
                List list = (List) contents2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Object contents3 = ((Value) it2.next()).getContents();
                    contents3.getClass();
                    arrayList2.add((String) contents3);
                }
                arrayList.add(new RasterDataLayer(str, arrayList2));
            }
            obj2 = (Long) arrayList;
        } else if (Intrinsics.areEqual("maxzoom", "tile-cache-budget") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Value value = styleSourceProperty.getValue();
            value.getClass();
            obj2 = (Long) SourceUtils.unwrapToTileCacheBudget(value);
        } else if (Intrinsics.areEqual("maxzoom", ModelSourceWrapper.MODELS)) {
            Value value2 = styleSourceProperty.getValue();
            value2.getClass();
            obj2 = (Long) ModelSourceModelKt.unwrapToModelSourceModels(value2);
        } else {
            obj = TypeUtilsKt.unwrap(styleSourceProperty, Long.class);
            obj2 = obj;
        }
        return (Long) obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Long getMinzoom() {
        Object obj;
        Object obj2;
        StylePropertyValue styleSourceProperty;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            Duration$$ExternalSyntheticBUOutline0.m$1("Couldn't get minzoom: source is not added to style yet.");
            return null;
        }
        try {
            styleSourceProperty = delegate.getStyleSourceProperty(getSourceId(), "minzoom");
        } catch (RuntimeException e) {
            MapboxLogger.logW("Mbgl-Source", "Get source property minzoom failed: " + e.getMessage());
            RecordTag.m(delegate.getStyleSourceProperty(getSourceId(), "minzoom"), new StringBuilder("Value returned: "), "Mbgl-Source");
            obj = null;
        }
        if (Intrinsics.areEqual("minzoom", "rasterLayers") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Object contents = styleSourceProperty.getValue().getContents();
            contents.getClass();
            Set entrySet = ((HashMap) contents).entrySet();
            entrySet.getClass();
            Set<Map.Entry> set = entrySet;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            for (Map.Entry entry : set) {
                Object key = entry.getKey();
                key.getClass();
                String str = (String) key;
                Object contents2 = ((Value) entry.getValue()).getContents();
                contents2.getClass();
                List list = (List) contents2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Object contents3 = ((Value) it2.next()).getContents();
                    contents3.getClass();
                    arrayList2.add((String) contents3);
                }
                arrayList.add(new RasterDataLayer(str, arrayList2));
            }
            obj2 = (Long) arrayList;
        } else if (Intrinsics.areEqual("minzoom", "tile-cache-budget") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Value value = styleSourceProperty.getValue();
            value.getClass();
            obj2 = (Long) SourceUtils.unwrapToTileCacheBudget(value);
        } else if (Intrinsics.areEqual("minzoom", ModelSourceWrapper.MODELS)) {
            Value value2 = styleSourceProperty.getValue();
            value2.getClass();
            obj2 = (Long) ModelSourceModelKt.unwrapToModelSourceModels(value2);
        } else {
            obj = TypeUtilsKt.unwrap(styleSourceProperty, Long.class);
            obj2 = obj;
        }
        return (Long) obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Nullable
    public final List<RasterDataLayer> getRasterLayers() {
        Object obj;
        ?? r3;
        StylePropertyValue styleSourceProperty;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            Duration$$ExternalSyntheticBUOutline0.m$1("Couldn't get rasterLayers: source is not added to style yet.");
            return null;
        }
        try {
            styleSourceProperty = delegate.getStyleSourceProperty(getSourceId(), "rasterLayers");
        } catch (RuntimeException e) {
            MapboxLogger.logW("Mbgl-Source", "Get source property rasterLayers failed: " + e.getMessage());
            RecordTag.m(delegate.getStyleSourceProperty(getSourceId(), "rasterLayers"), new StringBuilder("Value returned: "), "Mbgl-Source");
            obj = null;
        }
        if (Intrinsics.areEqual("rasterLayers", "rasterLayers") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Object contents = styleSourceProperty.getValue().getContents();
            contents.getClass();
            Set entrySet = ((HashMap) contents).entrySet();
            entrySet.getClass();
            Set<Map.Entry> set = entrySet;
            r3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            for (Map.Entry entry : set) {
                Object key = entry.getKey();
                key.getClass();
                String str = (String) key;
                Object contents2 = ((Value) entry.getValue()).getContents();
                contents2.getClass();
                List list = (List) contents2;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Object contents3 = ((Value) it2.next()).getContents();
                    contents3.getClass();
                    arrayList.add((String) contents3);
                }
                r3.add(new RasterDataLayer(str, arrayList));
            }
        } else if (Intrinsics.areEqual("rasterLayers", "tile-cache-budget") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Value value = styleSourceProperty.getValue();
            value.getClass();
            r3 = (List) SourceUtils.unwrapToTileCacheBudget(value);
        } else if (Intrinsics.areEqual("rasterLayers", ModelSourceWrapper.MODELS)) {
            Value value2 = styleSourceProperty.getValue();
            value2.getClass();
            r3 = ModelSourceModelKt.unwrapToModelSourceModels(value2);
        } else {
            obj = TypeUtilsKt.unwrap(styleSourceProperty, List.class);
            r3 = obj;
        }
        return (List) r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final TileCacheBudget getTileCacheBudget() {
        Object obj;
        Object obj2;
        StylePropertyValue styleSourceProperty;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            Duration$$ExternalSyntheticBUOutline0.m$1("Couldn't get tile-cache-budget: source is not added to style yet.");
            return null;
        }
        try {
            styleSourceProperty = delegate.getStyleSourceProperty(getSourceId(), "tile-cache-budget");
        } catch (RuntimeException e) {
            MapboxLogger.logW("Mbgl-Source", "Get source property tile-cache-budget failed: " + e.getMessage());
            RecordTag.m(delegate.getStyleSourceProperty(getSourceId(), "tile-cache-budget"), new StringBuilder("Value returned: "), "Mbgl-Source");
            obj = null;
        }
        if (Intrinsics.areEqual("tile-cache-budget", "rasterLayers") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Object contents = styleSourceProperty.getValue().getContents();
            contents.getClass();
            Set entrySet = ((HashMap) contents).entrySet();
            entrySet.getClass();
            Set<Map.Entry> set = entrySet;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            for (Map.Entry entry : set) {
                Object key = entry.getKey();
                key.getClass();
                String str = (String) key;
                Object contents2 = ((Value) entry.getValue()).getContents();
                contents2.getClass();
                List list = (List) contents2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Object contents3 = ((Value) it2.next()).getContents();
                    contents3.getClass();
                    arrayList2.add((String) contents3);
                }
                arrayList.add(new RasterDataLayer(str, arrayList2));
            }
            obj2 = (TileCacheBudget) arrayList;
        } else if (Intrinsics.areEqual("tile-cache-budget", "tile-cache-budget") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Value value = styleSourceProperty.getValue();
            value.getClass();
            obj2 = SourceUtils.unwrapToTileCacheBudget(value);
        } else if (Intrinsics.areEqual("tile-cache-budget", ModelSourceWrapper.MODELS)) {
            Value value2 = styleSourceProperty.getValue();
            value2.getClass();
            obj2 = (TileCacheBudget) ModelSourceModelKt.unwrapToModelSourceModels(value2);
        } else {
            obj = TypeUtilsKt.unwrap(styleSourceProperty, TileCacheBudget.class);
            obj2 = obj;
        }
        return (TileCacheBudget) obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Long getTileSize() {
        Object obj;
        Object obj2;
        StylePropertyValue styleSourceProperty;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            Duration$$ExternalSyntheticBUOutline0.m$1("Couldn't get tileSize: source is not added to style yet.");
            return null;
        }
        try {
            styleSourceProperty = delegate.getStyleSourceProperty(getSourceId(), "tileSize");
        } catch (RuntimeException e) {
            MapboxLogger.logW("Mbgl-Source", "Get source property tileSize failed: " + e.getMessage());
            RecordTag.m(delegate.getStyleSourceProperty(getSourceId(), "tileSize"), new StringBuilder("Value returned: "), "Mbgl-Source");
            obj = null;
        }
        if (Intrinsics.areEqual("tileSize", "rasterLayers") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Object contents = styleSourceProperty.getValue().getContents();
            contents.getClass();
            Set entrySet = ((HashMap) contents).entrySet();
            entrySet.getClass();
            Set<Map.Entry> set = entrySet;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            for (Map.Entry entry : set) {
                Object key = entry.getKey();
                key.getClass();
                String str = (String) key;
                Object contents2 = ((Value) entry.getValue()).getContents();
                contents2.getClass();
                List list = (List) contents2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Object contents3 = ((Value) it2.next()).getContents();
                    contents3.getClass();
                    arrayList2.add((String) contents3);
                }
                arrayList.add(new RasterDataLayer(str, arrayList2));
            }
            obj2 = (Long) arrayList;
        } else if (Intrinsics.areEqual("tileSize", "tile-cache-budget") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Value value = styleSourceProperty.getValue();
            value.getClass();
            obj2 = (Long) SourceUtils.unwrapToTileCacheBudget(value);
        } else if (Intrinsics.areEqual("tileSize", ModelSourceWrapper.MODELS)) {
            Value value2 = styleSourceProperty.getValue();
            value2.getClass();
            obj2 = (Long) ModelSourceModelKt.unwrapToModelSourceModels(value2);
        } else {
            obj = TypeUtilsKt.unwrap(styleSourceProperty, Long.class);
            obj2 = obj;
        }
        return (Long) obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Nullable
    public final List<String> getTiles() {
        Object obj;
        ?? r3;
        StylePropertyValue styleSourceProperty;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            Duration$$ExternalSyntheticBUOutline0.m$1("Couldn't get tiles: source is not added to style yet.");
            return null;
        }
        try {
            styleSourceProperty = delegate.getStyleSourceProperty(getSourceId(), "tiles");
        } catch (RuntimeException e) {
            MapboxLogger.logW("Mbgl-Source", "Get source property tiles failed: " + e.getMessage());
            RecordTag.m(delegate.getStyleSourceProperty(getSourceId(), "tiles"), new StringBuilder("Value returned: "), "Mbgl-Source");
            obj = null;
        }
        if (Intrinsics.areEqual("tiles", "rasterLayers") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Object contents = styleSourceProperty.getValue().getContents();
            contents.getClass();
            Set entrySet = ((HashMap) contents).entrySet();
            entrySet.getClass();
            Set<Map.Entry> set = entrySet;
            r3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            for (Map.Entry entry : set) {
                Object key = entry.getKey();
                key.getClass();
                String str = (String) key;
                Object contents2 = ((Value) entry.getValue()).getContents();
                contents2.getClass();
                List list = (List) contents2;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Object contents3 = ((Value) it2.next()).getContents();
                    contents3.getClass();
                    arrayList.add((String) contents3);
                }
                r3.add(new RasterDataLayer(str, arrayList));
            }
        } else if (Intrinsics.areEqual("tiles", "tile-cache-budget") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Value value = styleSourceProperty.getValue();
            value.getClass();
            r3 = (List) SourceUtils.unwrapToTileCacheBudget(value);
        } else if (Intrinsics.areEqual("tiles", ModelSourceWrapper.MODELS)) {
            Value value2 = styleSourceProperty.getValue();
            value2.getClass();
            r3 = ModelSourceModelKt.unwrapToModelSourceModels(value2);
        } else {
            obj = TypeUtilsKt.unwrap(styleSourceProperty, List.class);
            r3 = obj;
        }
        return (List) r3;
    }

    @Override // com.mapbox.maps.extension.style.sources.Source
    @NotNull
    public String getType$extension_style_release() {
        return "raster-array";
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final String getUrl() {
        Object obj;
        Object obj2;
        StylePropertyValue styleSourceProperty;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            Duration$$ExternalSyntheticBUOutline0.m$1("Couldn't get url: source is not added to style yet.");
            return null;
        }
        try {
            styleSourceProperty = delegate.getStyleSourceProperty(getSourceId(), "url");
        } catch (RuntimeException e) {
            MapboxLogger.logW("Mbgl-Source", "Get source property url failed: " + e.getMessage());
            RecordTag.m(delegate.getStyleSourceProperty(getSourceId(), "url"), new StringBuilder("Value returned: "), "Mbgl-Source");
            obj = null;
        }
        if (Intrinsics.areEqual("url", "rasterLayers") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Object contents = styleSourceProperty.getValue().getContents();
            contents.getClass();
            Set entrySet = ((HashMap) contents).entrySet();
            entrySet.getClass();
            Set<Map.Entry> set = entrySet;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            for (Map.Entry entry : set) {
                Object key = entry.getKey();
                key.getClass();
                String str = (String) key;
                Object contents2 = ((Value) entry.getValue()).getContents();
                contents2.getClass();
                List list = (List) contents2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Object contents3 = ((Value) it2.next()).getContents();
                    contents3.getClass();
                    arrayList2.add((String) contents3);
                }
                arrayList.add(new RasterDataLayer(str, arrayList2));
            }
            obj2 = (String) arrayList;
        } else if (Intrinsics.areEqual("url", "tile-cache-budget") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Value value = styleSourceProperty.getValue();
            value.getClass();
            obj2 = (String) SourceUtils.unwrapToTileCacheBudget(value);
        } else if (Intrinsics.areEqual("url", ModelSourceWrapper.MODELS)) {
            Value value2 = styleSourceProperty.getValue();
            value2.getClass();
            obj2 = (String) ModelSourceModelKt.unwrapToModelSourceModels(value2);
        } else {
            obj = TypeUtilsKt.unwrap(styleSourceProperty, String.class);
            obj2 = obj;
        }
        return (String) obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Boolean getVolatile() {
        Object obj;
        Object obj2;
        StylePropertyValue styleSourceProperty;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            Duration$$ExternalSyntheticBUOutline0.m$1("Couldn't get volatile: source is not added to style yet.");
            return null;
        }
        try {
            styleSourceProperty = delegate.getStyleSourceProperty(getSourceId(), "volatile");
        } catch (RuntimeException e) {
            MapboxLogger.logW("Mbgl-Source", "Get source property volatile failed: " + e.getMessage());
            RecordTag.m(delegate.getStyleSourceProperty(getSourceId(), "volatile"), new StringBuilder("Value returned: "), "Mbgl-Source");
            obj = null;
        }
        if (Intrinsics.areEqual("volatile", "rasterLayers") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Object contents = styleSourceProperty.getValue().getContents();
            contents.getClass();
            Set entrySet = ((HashMap) contents).entrySet();
            entrySet.getClass();
            Set<Map.Entry> set = entrySet;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
            for (Map.Entry entry : set) {
                Object key = entry.getKey();
                key.getClass();
                String str = (String) key;
                Object contents2 = ((Value) entry.getValue()).getContents();
                contents2.getClass();
                List list = (List) contents2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    Object contents3 = ((Value) it2.next()).getContents();
                    contents3.getClass();
                    arrayList2.add((String) contents3);
                }
                arrayList.add(new RasterDataLayer(str, arrayList2));
            }
            obj2 = (Boolean) arrayList;
        } else if (Intrinsics.areEqual("volatile", "tile-cache-budget") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Value value = styleSourceProperty.getValue();
            value.getClass();
            obj2 = (Boolean) SourceUtils.unwrapToTileCacheBudget(value);
        } else if (Intrinsics.areEqual("volatile", ModelSourceWrapper.MODELS)) {
            Value value2 = styleSourceProperty.getValue();
            value2.getClass();
            obj2 = (Boolean) ModelSourceModelKt.unwrapToModelSourceModels(value2);
        } else {
            obj = TypeUtilsKt.unwrap(styleSourceProperty, Boolean.class);
            obj2 = obj;
        }
        return (Boolean) obj2;
    }

    @NotNull
    public final RasterArraySource maxzoom(long value) {
        Source.setProperty$extension_style_release$default(this, new PropertyValue("maxzoom", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value))), false, 2, null);
        return this;
    }

    @NotNull
    public final RasterArraySource minzoom(long value) {
        Source.setProperty$extension_style_release$default(this, new PropertyValue("minzoom", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value))), false, 2, null);
        return this;
    }

    @NotNull
    public final RasterArraySource tileCacheBudget(@NotNull TileCacheBudget value) {
        value.getClass();
        setVolatileProperty$extension_style_release(new PropertyValue<>("tile-cache-budget", TypeUtils.INSTANCE.wrapToValue(value)));
        return this;
    }

    @NotNull
    public final RasterArraySource tiles(@NotNull List<String> value) {
        value.getClass();
        Source.setProperty$extension_style_release$default(this, new PropertyValue("tiles", TypeUtils.INSTANCE.wrapToValue(value)), false, 2, null);
        return this;
    }

    @NotNull
    public final RasterArraySource url(@NotNull String value) {
        value.getClass();
        Source.setProperty$extension_style_release$default(this, new PropertyValue("url", TypeUtils.INSTANCE.wrapToValue(value)), false, 2, null);
        return this;
    }

    @NotNull
    /* renamed from: volatile, reason: not valid java name */
    public final RasterArraySource m24754volatile(boolean value) {
        Source.setProperty$extension_style_release$default(this, new PropertyValue("volatile", TypeUtils.INSTANCE.wrapToValue(Boolean.valueOf(value))), false, 2, null);
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0013\u0010\t\u001a\u0004\u0018\u00010\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource$Companion;", "", "()V", "defaultMaxzoom", "", "getDefaultMaxzoom", "()Ljava/lang/Long;", "defaultMinzoom", "getDefaultMinzoom", "defaultVolatile", "", "getDefaultVolatile", "()Ljava/lang/Boolean;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Long getDefaultMaxzoom() {
            Object obj;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("raster-array", "maxzoom");
            styleSourcePropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Long.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Long) obj;
        }

        @Nullable
        public final Long getDefaultMinzoom() {
            Object obj;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("raster-array", "minzoom");
            styleSourcePropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Long.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Long) obj;
        }

        @Nullable
        public final Boolean getDefaultVolatile() {
            Object obj;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("raster-array", "volatile");
            styleSourcePropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Boolean.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Boolean) obj;
        }

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003J\u0016\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011J\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u0016J\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001bJ5\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00032\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u00112\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u001f¢\u0006\u0002\b\"J\u0010\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u0016J\u0014\u0010\u001d\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011J\u000e\u0010$\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0003J\u0010\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020&R$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006'"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource$Builder;", "", "sourceId", "", "(Ljava/lang/String;)V", "properties", "Ljava/util/HashMap;", "Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;", "getProperties$extension_style_release", "()Ljava/util/HashMap;", "getSourceId", "()Ljava/lang/String;", "volatileProperties", "getVolatileProperties$extension_style_release", "attribution", "value", "bounds", "", "", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/extension/style/sources/generated/RasterArraySource;", "maxzoom", "", "minzoom", "tileCacheBudget", "Lcom/mapbox/maps/TileCacheBudget;", "tileSet", "Lcom/mapbox/maps/extension/style/sources/TileSet;", "tilejson", "tiles", "block", "Lkotlin/Function1;", "Lcom/mapbox/maps/extension/style/sources/TileSet$Builder;", "", "Lkotlin/ExtensionFunctionType;", "tileSize", "url", "volatile", "", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @SourceDsl
    public static final class Builder {

        @NotNull
        private final HashMap<String, PropertyValue<?>> properties;

        @NotNull
        private final String sourceId;

        @NotNull
        private final HashMap<String, PropertyValue<?>> volatileProperties;

        public Builder(@NotNull String str) {
            str.getClass();
            this.sourceId = str;
            this.properties = new HashMap<>();
            this.volatileProperties = new HashMap<>();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Builder bounds$default(Builder builder, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = CollectionsKt.listOf((Object[]) new Double[]{Double.valueOf(-180.0d), Double.valueOf(-85.051129d), Double.valueOf(180.0d), Double.valueOf(85.051129d)});
            }
            return builder.bounds(list);
        }

        public static /* synthetic */ Builder maxzoom$default(Builder builder, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 22;
            }
            return builder.maxzoom(j);
        }

        public static /* synthetic */ Builder minzoom$default(Builder builder, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 0;
            }
            return builder.minzoom(j);
        }

        public static /* synthetic */ Builder tileSize$default(Builder builder, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 512;
            }
            return builder.tileSize(j);
        }

        public static /* synthetic */ Builder volatile$default(Builder builder, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = false;
            }
            return builder.m24755volatile(z);
        }

        @NotNull
        public final Builder attribution(@NotNull String value) {
            value.getClass();
            PropertyValue<?> propertyValue = new PropertyValue<>("attribution", TypeUtils.INSTANCE.wrapToValue(value));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        @NotNull
        public final Builder bounds(@NotNull List<Double> value) {
            value.getClass();
            PropertyValue<?> propertyValue = new PropertyValue<>("bounds", TypeUtils.INSTANCE.wrapToValue(value));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        @NotNull
        public final RasterArraySource build() {
            return new RasterArraySource(this);
        }

        @NotNull
        public final HashMap<String, PropertyValue<?>> getProperties$extension_style_release() {
            return this.properties;
        }

        @NotNull
        public final String getSourceId() {
            return this.sourceId;
        }

        @NotNull
        public final HashMap<String, PropertyValue<?>> getVolatileProperties$extension_style_release() {
            return this.volatileProperties;
        }

        @NotNull
        public final Builder maxzoom(long value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("maxzoom", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value)));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        @NotNull
        public final Builder minzoom(long value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("minzoom", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value)));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        @NotNull
        public final Builder tileCacheBudget(@NotNull TileCacheBudget value) {
            value.getClass();
            PropertyValue<?> propertyValue = new PropertyValue<>("tile-cache-budget", TypeUtils.INSTANCE.wrapToValue(value));
            this.volatileProperties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        @NotNull
        public final Builder tileSet(@NotNull String tilejson, @NotNull List<String> tiles, @NotNull Function1<? super TileSet.Builder, Unit> block) {
            tilejson.getClass();
            tiles.getClass();
            block.getClass();
            TileSet.Builder builder = new TileSet.Builder(tilejson, tiles);
            block.invoke(builder);
            for (Map.Entry<String, Value> entry : builder.build().entrySet()) {
                PropertyValue<?> propertyValue = new PropertyValue<>(entry.getKey(), entry.getValue());
                this.properties.put(propertyValue.getPropertyName(), propertyValue);
            }
            return this;
        }

        @NotNull
        public final Builder tileSize(long value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("tileSize", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value)));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        @NotNull
        public final Builder tiles(@NotNull List<String> value) {
            value.getClass();
            PropertyValue<?> propertyValue = new PropertyValue<>("tiles", TypeUtils.INSTANCE.wrapToValue(value));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        @NotNull
        public final Builder url(@NotNull String value) {
            value.getClass();
            PropertyValue<?> propertyValue = new PropertyValue<>("url", TypeUtils.INSTANCE.wrapToValue(value));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        @NotNull
        /* renamed from: volatile, reason: not valid java name */
        public final Builder m24755volatile(boolean value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("volatile", TypeUtils.INSTANCE.wrapToValue(Boolean.valueOf(value)));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        @NotNull
        public final Builder tileSet(@NotNull TileSet tileSet) {
            tileSet.getClass();
            for (Map.Entry<String, Value> entry : tileSet.entrySet()) {
                PropertyValue<?> propertyValue = new PropertyValue<>(entry.getKey(), entry.getValue());
                this.properties.put(propertyValue.getPropertyName(), propertyValue);
            }
            return this;
        }
    }
}
