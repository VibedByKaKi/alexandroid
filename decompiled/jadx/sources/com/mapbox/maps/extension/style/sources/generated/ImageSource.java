package com.mapbox.maps.extension.style.sources.generated;

import com.android.tools.r8.RecordTag;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.here.time.Duration$$ExternalSyntheticBUOutline0;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.StyleManager;
import com.mapbox.maps.StylePropertyValue;
import com.mapbox.maps.StylePropertyValueKind;
import com.mapbox.maps.extension.style.layers.properties.PropertyValue;
import com.mapbox.maps.extension.style.sources.Source;
import com.mapbox.maps.extension.style.sources.SourceUtils;
import com.mapbox.maps.extension.style.sources.generated.RasterArraySource;
import com.mapbox.maps.extension.style.types.SourceDsl;
import com.mapbox.maps.extension.style.utils.TypeUtils;
import com.mapbox.maps.extension.style.utils.TypeUtilsKt;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0015\u0016B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0006J\r\u0010\u0013\u001a\u00020\u000fH\u0010¢\u0006\u0002\b\u0014J\u0010\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u000fR\u001f\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/ImageSource;", "Lcom/mapbox/maps/extension/style/sources/Source;", "builder", "Lcom/mapbox/maps/extension/style/sources/generated/ImageSource$Builder;", "(Lcom/mapbox/maps/extension/style/sources/generated/ImageSource$Builder;)V", "coordinates", "", "", "getCoordinates", "()Ljava/util/List;", "prefetchZoomDelta", "", "getPrefetchZoomDelta", "()Ljava/lang/Long;", "url", "", "getUrl", "()Ljava/lang/String;", "value", "getType", "getType$extension_style_release", "Builder", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class ImageSource extends Source {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\u00020\u00002\u0012\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0012J\u0010\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u0015J\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0003R$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/ImageSource$Builder;", "", "sourceId", "", "(Ljava/lang/String;)V", "properties", "Ljava/util/HashMap;", "Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;", "getProperties$extension_style_release", "()Ljava/util/HashMap;", "getSourceId", "()Ljava/lang/String;", "volatileProperties", "getVolatileProperties$extension_style_release", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/extension/style/sources/generated/ImageSource;", "coordinates", "value", "", "", "prefetchZoomDelta", "", "url", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
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

        public static /* synthetic */ Builder prefetchZoomDelta$default(Builder builder, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 4;
            }
            return builder.prefetchZoomDelta(j);
        }

        @NotNull
        public final ImageSource build() {
            return new ImageSource(this);
        }

        @NotNull
        public final Builder coordinates(@NotNull List<? extends List<Double>> value) {
            value.getClass();
            PropertyValue<?> propertyValue = new PropertyValue<>("coordinates", TypeUtils.INSTANCE.wrapToValue(value));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
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
        public final Builder prefetchZoomDelta(long value) {
            PropertyValue<?> propertyValue = new PropertyValue<>("prefetch-zoom-delta", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value)));
            this.volatileProperties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }

        @NotNull
        public final Builder url(@NotNull String value) {
            value.getClass();
            PropertyValue<?> propertyValue = new PropertyValue<>("url", TypeUtils.INSTANCE.wrapToValue(value));
            this.properties.put(propertyValue.getPropertyName(), propertyValue);
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageSource(@NotNull Builder builder) {
        super(builder.getSourceId());
        builder.getClass();
        getSourceProperties$extension_style_release().putAll(builder.getProperties$extension_style_release());
        getVolatileSourceProperties$extension_style_release().putAll(builder.getVolatileProperties$extension_style_release());
    }

    public static /* synthetic */ ImageSource prefetchZoomDelta$default(ImageSource imageSource, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 4;
        }
        return imageSource.prefetchZoomDelta(j);
    }

    @NotNull
    public final ImageSource coordinates(@NotNull List<? extends List<Double>> value) {
        value.getClass();
        Source.setProperty$extension_style_release$default(this, new PropertyValue("coordinates", TypeUtils.INSTANCE.wrapToValue(value)), false, 2, null);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3 */
    @Nullable
    public final List<List<Double>> getCoordinates() {
        Object obj;
        ?? r3;
        StylePropertyValue styleSourceProperty;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            Duration$$ExternalSyntheticBUOutline0.m$1("Couldn't get coordinates: source is not added to style yet.");
            return null;
        }
        try {
            styleSourceProperty = delegate.getStyleSourceProperty(getSourceId(), "coordinates");
        } catch (RuntimeException e) {
            MapboxLogger.logW("Mbgl-Source", "Get source property coordinates failed: " + e.getMessage());
            RecordTag.m(delegate.getStyleSourceProperty(getSourceId(), "coordinates"), new StringBuilder("Value returned: "), "Mbgl-Source");
            obj = null;
        }
        if (Intrinsics.areEqual("coordinates", "rasterLayers") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
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
                r3.add(new RasterArraySource.RasterDataLayer(str, arrayList));
            }
        } else if (Intrinsics.areEqual("coordinates", "tile-cache-budget") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Value value = styleSourceProperty.getValue();
            value.getClass();
            r3 = (List) SourceUtils.unwrapToTileCacheBudget(value);
        } else if (Intrinsics.areEqual("coordinates", ModelSourceWrapper.MODELS)) {
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
    public final Long getPrefetchZoomDelta() {
        Object obj;
        Object obj2;
        StylePropertyValue styleSourceProperty;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            Duration$$ExternalSyntheticBUOutline0.m$1("Couldn't get prefetch-zoom-delta: source is not added to style yet.");
            return null;
        }
        try {
            styleSourceProperty = delegate.getStyleSourceProperty(getSourceId(), "prefetch-zoom-delta");
        } catch (RuntimeException e) {
            MapboxLogger.logW("Mbgl-Source", "Get source property prefetch-zoom-delta failed: " + e.getMessage());
            RecordTag.m(delegate.getStyleSourceProperty(getSourceId(), "prefetch-zoom-delta"), new StringBuilder("Value returned: "), "Mbgl-Source");
            obj = null;
        }
        if (Intrinsics.areEqual("prefetch-zoom-delta", "rasterLayers") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
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
                arrayList.add(new RasterArraySource.RasterDataLayer(str, arrayList2));
            }
            obj2 = (Long) arrayList;
        } else if (Intrinsics.areEqual("prefetch-zoom-delta", "tile-cache-budget") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Value value = styleSourceProperty.getValue();
            value.getClass();
            obj2 = (Long) SourceUtils.unwrapToTileCacheBudget(value);
        } else if (Intrinsics.areEqual("prefetch-zoom-delta", ModelSourceWrapper.MODELS)) {
            Value value2 = styleSourceProperty.getValue();
            value2.getClass();
            obj2 = (Long) ModelSourceModelKt.unwrapToModelSourceModels(value2);
        } else {
            obj = TypeUtilsKt.unwrap(styleSourceProperty, Long.class);
            obj2 = obj;
        }
        return (Long) obj2;
    }

    @Override // com.mapbox.maps.extension.style.sources.Source
    @NotNull
    public String getType$extension_style_release() {
        return "image";
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
                arrayList.add(new RasterArraySource.RasterDataLayer(str, arrayList2));
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

    @NotNull
    public final ImageSource prefetchZoomDelta(long value) {
        setVolatileProperty$extension_style_release(new PropertyValue<>("prefetch-zoom-delta", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value))));
        return this;
    }

    @NotNull
    public final ImageSource url(@NotNull String value) {
        value.getClass();
        Source.setProperty$extension_style_release$default(this, new PropertyValue("url", TypeUtils.INSTANCE.wrapToValue(value)), false, 2, null);
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/ImageSource$Companion;", "", "()V", "defaultPrefetchZoomDelta", "", "getDefaultPrefetchZoomDelta", "()Ljava/lang/Long;", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Long getDefaultPrefetchZoomDelta() {
            Object obj;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("image", "prefetch-zoom-delta");
            styleSourcePropertyDefaultValue.getClass();
            try {
                obj = TypeUtilsKt.unwrap(styleSourcePropertyDefaultValue, Long.class);
            } catch (RuntimeException unused) {
                obj = null;
            }
            return (Long) obj;
        }

        private Companion() {
        }
    }
}
