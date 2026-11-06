package com.mapbox.maps.extension.style.sources.generated;

import androidx.annotation.UiThread;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.mapbox.bindgen.Value;
import com.mapbox.maps.extension.style.utils.TypeUtils;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0002X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/ModelNodeOverride;", "Ljava/util/HashMap;", "", "Lcom/mapbox/bindgen/Value;", "builder", "Lcom/mapbox/maps/extension/style/sources/generated/ModelNodeOverride$Builder;", "(Lcom/mapbox/maps/extension/style/sources/generated/ModelNodeOverride$Builder;)V", "name", "getName$extension_style_release", "()Ljava/lang/String;", "Builder", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@UiThread
/* loaded from: classes9.dex */
public final class ModelNodeOverride extends HashMap<String, Value> {

    @NotNull
    private final String name;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\u0014\u0010\u000e\u001a\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/mapbox/maps/extension/style/sources/generated/ModelNodeOverride$Builder;", "", "name", "", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "parameters", "Ljava/util/HashMap;", "Lcom/mapbox/bindgen/Value;", "getParameters$extension_style_release", "()Ljava/util/HashMap;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/mapbox/maps/extension/style/sources/generated/ModelNodeOverride;", ModelSourceWrapper.ORIENTATION, "value", "", "", "extension-style_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Builder {

        @NotNull
        private final String name;

        @NotNull
        private final HashMap<String, Value> parameters;

        public Builder(@NotNull String str) {
            str.getClass();
            this.name = str;
            this.parameters = new HashMap<>();
        }

        @NotNull
        public final ModelNodeOverride build() {
            return new ModelNodeOverride(this, null);
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final HashMap<String, Value> getParameters$extension_style_release() {
            return this.parameters;
        }

        @NotNull
        public final Builder orientation(@NotNull List<Double> value) {
            value.getClass();
            this.parameters.put(ModelSourceWrapper.ORIENTATION, TypeUtils.INSTANCE.wrapToValue(value));
            return this;
        }
    }

    private ModelNodeOverride(Builder builder) {
        super(builder.getParameters$extension_style_release());
        this.name = builder.getName();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return containsKey((String) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Value) {
            return containsValue((Value) obj);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<String, Value>> entrySet() {
        return getEntries();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Value get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public /* bridge */ Set<Map.Entry<String, Value>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<String> getKeys() {
        return super.keySet();
    }

    @NotNull
    /* renamed from: getName$extension_style_release, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof String) ? obj2 : getOrDefault((String) obj, (Value) obj2);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Value> getValues() {
        return super.values();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if ((obj instanceof String) && (obj2 instanceof Value)) {
            return remove((String) obj, (Value) obj2);
        }
        return false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<Value> values() {
        return getValues();
    }

    public /* bridge */ boolean containsKey(String str) {
        return super.containsKey((Object) str);
    }

    public /* bridge */ boolean containsValue(Value value) {
        return super.containsValue((Object) value);
    }

    public /* bridge */ Value get(String str) {
        return (Value) super.get((Object) str);
    }

    public /* synthetic */ ModelNodeOverride(Builder builder, DefaultConstructorMarker defaultConstructorMarker) {
        this(builder);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        if (obj instanceof String) {
            return get((String) obj);
        }
        return null;
    }

    public /* bridge */ Value getOrDefault(String str, Value value) {
        return (Value) super.getOrDefault((Object) str, (String) value);
    }

    public final /* bridge */ Value getOrDefault(Object obj, Value value) {
        return !(obj instanceof String) ? value : getOrDefault((String) obj, value);
    }

    public /* bridge */ Value remove(String str) {
        return (Value) super.remove((Object) str);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Value remove(Object obj) {
        if (obj instanceof String) {
            return remove((String) obj);
        }
        return null;
    }

    public /* bridge */ boolean remove(String str, Value value) {
        return super.remove((Object) str, (Object) value);
    }
}
