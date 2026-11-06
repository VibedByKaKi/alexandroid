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
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 %2\u00020\u0001:\u0002$%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\r\u0010\u001d\u001a\u00020\u0014H\u0010¢\u0006\u0002\b\u001eJ\u0010\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u000bJ\u0010\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u000bJ\u0014\u0010\u0010\u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0006\u0010 \u001a\u00020\u001aJ\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020\tJ\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\u0014J\u0014\u0010\u0013\u001a\u00020\u00002\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\bJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00148F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/ModelSource;", "Lcom/mapbox/maps/extension/style/sources/Source;", "builder", "Lcom/mapbox/maps/extension/style/sources/generated/ModelSource$Builder;", "(Lcom/mapbox/maps/extension/style/sources/generated/ModelSource$Builder;)V", "batched", "", "initialModels", "", "Lcom/mapbox/maps/extension/style/sources/generated/ModelSourceModel;", "maxzoom", "", "getMaxzoom", "()Ljava/lang/Long;", "minzoom", "getMinzoom", ModelSourceWrapper.MODELS, "getModels", "()Ljava/util/List;", "tiles", "", "getTiles", "url", "getUrl", "()Ljava/lang/String;", "bindTo", "", "delegate", "Lcom/mapbox/maps/MapboxStyleManager;", "getType", "getType$extension_style_release", "value", "removeAllModels", "removeModel", "model", "id", "Builder", "Companion", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes9.dex */
public final class ModelSource extends Source {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final boolean batched;

    @Nullable
    private List<ModelSourceModel> initialModels;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0010\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u001e\u001a\u00020\u001fJ\u0014\u0010\u000b\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\u0014\u0010!\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\fJ\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u0003R\u001a\u0010\u0005\u001a\u00020\u0006X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u0013X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016¨\u0006#"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/ModelSource$Builder;", "", "sourceId", "", "(Ljava/lang/String;)V", "batched", "", "getBatched$extension_style_release", "()Z", "setBatched$extension_style_release", "(Z)V", ModelSourceWrapper.MODELS, "", "Lcom/mapbox/maps/extension/style/sources/generated/ModelSourceModel;", "getModels$extension_style_release", "()Ljava/util/List;", "setModels$extension_style_release", "(Ljava/util/List;)V", "properties", "Ljava/util/HashMap;", "Lcom/mapbox/maps/extension/style/layers/properties/PropertyValue;", "getProperties$extension_style_release", "()Ljava/util/HashMap;", "getSourceId", "()Ljava/lang/String;", "volatileProperties", "getVolatileProperties$extension_style_release", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/extension/style/sources/generated/ModelSource;", "maxzoom", "value", "", "minzoom", "tiles", "url", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @SourceDsl
    public static final class Builder {
        private boolean batched;

        @Nullable
        private List<ModelSourceModel> models;

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

        public static /* synthetic */ Builder maxzoom$default(Builder builder, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 18;
            }
            return builder.maxzoom(j);
        }

        public static /* synthetic */ Builder minzoom$default(Builder builder, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = 0;
            }
            return builder.minzoom(j);
        }

        @NotNull
        public final Builder batched(boolean batched) {
            this.batched = batched;
            return this;
        }

        @NotNull
        public final ModelSource build() {
            return new ModelSource(this);
        }

        /* renamed from: getBatched$extension_style_release, reason: from getter */
        public final boolean getBatched() {
            return this.batched;
        }

        @Nullable
        public final List<ModelSourceModel> getModels$extension_style_release() {
            return this.models;
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
        public final Builder models(@NotNull List<ModelSourceModel> value) {
            value.getClass();
            this.models = value;
            return this;
        }

        public final void setBatched$extension_style_release(boolean z) {
            this.batched = z;
        }

        public final void setModels$extension_style_release(@Nullable List<ModelSourceModel> list) {
            this.models = list;
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
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModelSource(@NotNull Builder builder) {
        super(builder.getSourceId());
        builder.getClass();
        this.batched = builder.getBatched();
        this.initialModels = builder.getModels$extension_style_release();
        getSourceProperties$extension_style_release().putAll(builder.getProperties$extension_style_release());
        getVolatileSourceProperties$extension_style_release().putAll(builder.getVolatileProperties$extension_style_release());
    }

    public static /* synthetic */ ModelSource maxzoom$default(ModelSource modelSource, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 18;
        }
        return modelSource.maxzoom(j);
    }

    public static /* synthetic */ ModelSource minzoom$default(ModelSource modelSource, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 0;
        }
        return modelSource.minzoom(j);
    }

    @Override // com.mapbox.maps.extension.style.sources.Source, com.mapbox.maps.extension.style.StyleContract.StyleSourceExtension
    public void bindTo(@NotNull MapboxStyleManager delegate) {
        delegate.getClass();
        super.bindTo(delegate);
        List<ModelSourceModel> list = this.initialModels;
        if (list != null) {
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                ((ModelSourceModel) it2.next()).bindTo$extension_style_release(this);
            }
        }
        this.initialModels = null;
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
                arrayList.add(new RasterArraySource.RasterDataLayer(str, arrayList2));
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
                arrayList.add(new RasterArraySource.RasterDataLayer(str, arrayList2));
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
    public final List<ModelSourceModel> getModels() {
        Object obj;
        ?? r3;
        StylePropertyValue styleSourceProperty;
        MapboxStyleManager delegate = getDelegate();
        if (delegate == null) {
            Duration$$ExternalSyntheticBUOutline0.m$1("Couldn't get models: source is not added to style yet.");
            return null;
        }
        try {
            styleSourceProperty = delegate.getStyleSourceProperty(getSourceId(), ModelSourceWrapper.MODELS);
        } catch (RuntimeException e) {
            MapboxLogger.logW("Mbgl-Source", "Get source property models failed: " + e.getMessage());
            RecordTag.m(delegate.getStyleSourceProperty(getSourceId(), ModelSourceWrapper.MODELS), new StringBuilder("Value returned: "), "Mbgl-Source");
            obj = null;
        }
        if (Intrinsics.areEqual(ModelSourceWrapper.MODELS, "rasterLayers") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
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
        } else if (Intrinsics.areEqual(ModelSourceWrapper.MODELS, "tile-cache-budget") && styleSourceProperty.getKind() == StylePropertyValueKind.CONSTANT) {
            Value value = styleSourceProperty.getValue();
            value.getClass();
            r3 = (List) SourceUtils.unwrapToTileCacheBudget(value);
        } else if (Intrinsics.areEqual(ModelSourceWrapper.MODELS, ModelSourceWrapper.MODELS)) {
            Value value2 = styleSourceProperty.getValue();
            value2.getClass();
            r3 = ModelSourceModelKt.unwrapToModelSourceModels(value2);
        } else {
            obj = TypeUtilsKt.unwrap(styleSourceProperty, List.class);
            r3 = obj;
        }
        List<ModelSourceModel> list2 = (List) r3;
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                ((ModelSourceModel) it3.next()).setSource$extension_style_release(this);
            }
        }
        return list2;
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
                r3.add(new RasterArraySource.RasterDataLayer(str, arrayList));
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
        return this.batched ? "batched-model" : "model";
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
    public final ModelSource maxzoom(long value) {
        Source.setProperty$extension_style_release$default(this, new PropertyValue("maxzoom", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value))), false, 2, null);
        return this;
    }

    @NotNull
    public final ModelSource minzoom(long value) {
        Source.setProperty$extension_style_release$default(this, new PropertyValue("minzoom", TypeUtils.INSTANCE.wrapToValue(Long.valueOf(value))), false, 2, null);
        return this;
    }

    @NotNull
    public final ModelSource models(@NotNull List<ModelSourceModel> value) {
        value.getClass();
        Iterator<T> it2 = value.iterator();
        while (it2.hasNext()) {
            ((ModelSourceModel) it2.next()).bindTo$extension_style_release(this);
        }
        return this;
    }

    public final void removeAllModels() {
        Source.setProperty$extension_style_release$default(this, new PropertyValue(ModelSourceWrapper.MODELS, Value.nullValue()), false, 2, null);
    }

    public final void removeModel(@NotNull String id) {
        id.getClass();
        Source.setProperty$extension_style_release$default(this, new PropertyValue(ModelSourceWrapper.MODELS, TypeUtils.INSTANCE.wrapToValue(MapsKt.hashMapOf(TuplesKt.to(id, Value.nullValue())))), false, 2, null);
    }

    @NotNull
    public final ModelSource tiles(@NotNull List<String> value) {
        value.getClass();
        Source.setProperty$extension_style_release$default(this, new PropertyValue("tiles", TypeUtils.INSTANCE.wrapToValue(value)), false, 2, null);
        return this;
    }

    @NotNull
    public final ModelSource url(@NotNull String value) {
        value.getClass();
        Source.setProperty$extension_style_release$default(this, new PropertyValue("url", TypeUtils.INSTANCE.wrapToValue(value)), false, 2, null);
        return this;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0013\u0010\u0003\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00048F¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/ModelSource$Companion;", "", "()V", "defaultMaxzoom", "", "getDefaultMaxzoom", "()Ljava/lang/Long;", "defaultMinzoom", "getDefaultMinzoom", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final Long getDefaultMaxzoom() {
            Object obj;
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("model", "maxzoom");
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
            StylePropertyValue styleSourcePropertyDefaultValue = StyleManager.getStyleSourcePropertyDefaultValue("model", "minzoom");
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

    public final void removeModel(@NotNull ModelSourceModel model) {
        model.getClass();
        removeModel(model.getId());
    }
}
