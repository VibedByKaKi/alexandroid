package com.bugsnag.android;

import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.alexa.auth.BuildConfig;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.internal.StringUtils;
import com.bugsnag.android.internal.TrimMetrics;
import com.dee.app.data.reactnative.Utils.HttpClientUtils;
import io.ktor.http.CodecsKt$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.TypeIntrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\b\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B)\b\u0007\u0012 \b\u0002\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0004¢\u0006\u0002\u0010\u0007J\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u00052\b\u0010\f\u001a\u0004\u0018\u00010\u0006H\u0016J&\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0005H\u0016J\u0018\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J&\u0010\u001b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0004HÀ\u0003¢\u0006\u0002\b\u001cJ\u0006\u0010\u001d\u001a\u00020\u0000J+\u0010\u001d\u001a\u00020\u00002 \b\u0002\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0004HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0006HÖ\u0003J\u001e\u0010!\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00192\u0006\u0010\u0017\u001a\u00020\u0005H\u0016J\u001a\u0010!\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005H\u0016J\t\u0010\"\u001a\u00020#HÖ\u0001J,\u0010$\u001a\u00020\u00162\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u0006H\u0002J\u001e\u0010'\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0004J\u0010\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*H\u0016J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020#R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R,\u0010\u0003\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u00060"}, d2 = {"Lcom/bugsnag/android/Metadata;", "Lcom/bugsnag/android/JsonStream$Streamable;", "Lcom/bugsnag/android/MetadataAware;", HttpClientUtils.ElementsCacheKey.STORE, "", "", "", "(Ljava/util/Map;)V", "jsonStreamer", "Lcom/bugsnag/android/ObjectJsonStreamer;", "getJsonStreamer", "()Lcom/bugsnag/android/ObjectJsonStreamer;", "value", "", "redactedKeys", "getRedactedKeys", "()Ljava/util/Set;", "setRedactedKeys", "(Ljava/util/Set;)V", "getStore$bugsnag_android_core_release", "()Ljava/util/Map;", "addMetadata", "", "section", "key", "", "clearMetadata", "component1", "component1$bugsnag_android_core_release", "copy", "equals", "", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "getMetadata", "hashCode", "", "insertValue", BuildConfig.FLAVOR_authType, "newValue", "toMap", "toStream", "writer", "Lcom/bugsnag/android/JsonStream;", "toString", "trimMetadataStringsTo", "Lcom/bugsnag/android/internal/TrimMetrics;", "maxStringLength", "Companion", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes6.dex */
public final /* data */ class Metadata implements JsonStream.Streamable, MetadataAware {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ObjectJsonStreamer jsonStreamer;

    @NotNull
    private final Map<String, Map<String, Object>> store;

    @JvmOverloads
    public Metadata(@NotNull Map<String, Map<String, Object>> map) {
        map.getClass();
        this.store = map;
        this.jsonStreamer = new ObjectJsonStreamer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Metadata copy$default(Metadata metadata, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = metadata.store;
        }
        return metadata.copy(map);
    }

    private final void insertValue(Map<String, Object> map, String key, Object newValue) {
        Object obj = map.get(key);
        if (obj != null && (newValue instanceof Map)) {
            newValue = INSTANCE.mergeMaps$bugsnag_android_core_release(CollectionsKt.listOf((Object[]) new Map[]{(Map) obj, (Map) newValue}));
        }
        map.put(key, newValue);
    }

    @Override // com.bugsnag.android.MetadataAware
    public void addMetadata(@NotNull String section, @NotNull Map<String, ? extends Object> value) {
        section.getClass();
        value.getClass();
        Iterator<T> it2 = value.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            addMetadata(section, (String) entry.getKey(), entry.getValue());
        }
    }

    @Override // com.bugsnag.android.MetadataAware
    public void clearMetadata(@NotNull String section, @NotNull String key) {
        section.getClass();
        key.getClass();
        Map<String, Object> map = this.store.get(section);
        if (map != null) {
            map.remove(key);
        }
        if (map == null || map.isEmpty()) {
            this.store.remove(section);
        }
    }

    @NotNull
    public final Map<String, Map<String, Object>> component1$bugsnag_android_core_release() {
        return this.store;
    }

    @NotNull
    public final Metadata copy() {
        Metadata copy = copy(toMap());
        copy.setRedactedKeys(CollectionsKt.toSet(getRedactedKeys()));
        return copy;
    }

    public boolean equals(@Nullable Object other) {
        if (this != other) {
            return (other instanceof Metadata) && kotlin.jvm.internal.Intrinsics.areEqual(this.store, ((Metadata) other).store);
        }
        return true;
    }

    @NotNull
    public final ObjectJsonStreamer getJsonStreamer() {
        return this.jsonStreamer;
    }

    @Override // com.bugsnag.android.MetadataAware
    @Nullable
    public Object getMetadata(@NotNull String section, @NotNull String key) {
        section.getClass();
        key.getClass();
        Map<String, Object> metadata = getMetadata(section);
        if (metadata != null) {
            return metadata.get(key);
        }
        return null;
    }

    @NotNull
    public final Set<String> getRedactedKeys() {
        return this.jsonStreamer.getRedactedKeys();
    }

    @NotNull
    public final Map<String, Map<String, Object>> getStore$bugsnag_android_core_release() {
        return this.store;
    }

    public int hashCode() {
        Map<String, Map<String, Object>> map = this.store;
        if (map != null) {
            return map.hashCode();
        }
        return 0;
    }

    public final void setRedactedKeys(@NotNull Set<String> set) {
        set.getClass();
        this.jsonStreamer.setRedactedKeys(set);
    }

    @NotNull
    public final Map<String, Map<String, Object>> toMap() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(this.store);
        Iterator<T> it2 = this.store.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            concurrentHashMap.put(entry.getKey(), new ConcurrentHashMap((Map) entry.getValue()));
        }
        return concurrentHashMap;
    }

    @Override // com.bugsnag.android.JsonStream.Streamable
    public void toStream(@NotNull JsonStream writer) throws IOException {
        writer.getClass();
        this.jsonStreamer.objectToStream(this.store, writer, true);
    }

    @NotNull
    public String toString() {
        return ErrorUtils$$ExternalSyntheticOutline0.m(new StringBuilder("Metadata(store="), this.store, MarkdownConstants.RIGHT_PARENTHESIS);
    }

    @NotNull
    public final TrimMetrics trimMetadataStringsTo(int maxStringLength) {
        int i = 0;
        int i2 = 0;
        for (Map.Entry<String, Map<String, Object>> entry : this.store.entrySet()) {
            StringUtils stringUtils = StringUtils.INSTANCE;
            Map<String, Object> value = entry.getValue();
            if (value == null) {
                CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.Any?>");
                return null;
            }
            TrimMetrics trimStringValuesTo = stringUtils.trimStringValuesTo(maxStringLength, TypeIntrinsics.asMutableMap(value));
            i += trimStringValuesTo.getItemsTrimmed();
            i2 += trimStringValuesTo.getDataTrimmed();
        }
        return new TrimMetrics(i, i2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\nH\u0002J\u001f\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000e\"\u00020\f¢\u0006\u0002\u0010\u000fJ3\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0018\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\n0\u0011H\u0000¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/bugsnag/android/Metadata$Companion;", "", "()V", "getMergeValue", "", "result", "", "", "key", BuildConfig.FLAVOR_authType, "", "merge", "Lcom/bugsnag/android/Metadata;", "data", "", "([Lcom/bugsnag/android/Metadata;)Lcom/bugsnag/android/Metadata;", "mergeMaps", "", "mergeMaps$bugsnag_android_core_release", "bugsnag-android-core_release"}, k = 1, mv = {1, 4, 2})
    public static final class Companion {
        private Companion() {
        }

        private final void getMergeValue(Map<String, Object> result, String key, Map<String, ? extends Object> map) {
            Object obj = result.get(key);
            Object obj2 = map.get(key);
            if (obj2 == null) {
                if (obj != null) {
                    result.put(key, obj);
                }
            } else if ((obj instanceof Map) && (obj2 instanceof Map)) {
                result.put(key, mergeMaps$bugsnag_android_core_release(CollectionsKt.listOf((Object[]) new Map[]{(Map) obj, (Map) obj2})));
            } else {
                result.put(key, obj2);
            }
        }

        @NotNull
        public final Metadata merge(@NotNull Metadata... data) {
            data.getClass();
            ArrayList arrayList = new ArrayList(data.length);
            for (Metadata metadata : data) {
                arrayList.add(metadata.toMap());
            }
            ArrayList arrayList2 = new ArrayList();
            for (Metadata metadata2 : data) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList2, metadata2.getJsonStreamer().getRedactedKeys());
            }
            Map<String, Object> mergeMaps$bugsnag_android_core_release = mergeMaps$bugsnag_android_core_release(arrayList);
            if (mergeMaps$bugsnag_android_core_release == null) {
                CodecsKt$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.String, kotlin.collections.MutableMap<kotlin.String, kotlin.Any>>");
                return null;
            }
            Metadata metadata3 = new Metadata(TypeIntrinsics.asMutableMap(mergeMaps$bugsnag_android_core_release));
            metadata3.setRedactedKeys(CollectionsKt.toSet(arrayList2));
            return metadata3;
        }

        @NotNull
        public final Map<String, Object> mergeMaps$bugsnag_android_core_release(@NotNull List<? extends Map<String, ? extends Object>> data) {
            data.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it2 = data.iterator();
            while (it2.hasNext()) {
                CollectionsKt__MutableCollectionsKt.addAll(arrayList, ((Map) it2.next()).keySet());
            }
            Set set = CollectionsKt.toSet(arrayList);
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            for (Map<String, ? extends Object> map : data) {
                Iterator it3 = set.iterator();
                while (it3.hasNext()) {
                    getMergeValue(concurrentHashMap, (String) it3.next(), map);
                }
            }
            return concurrentHashMap;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public Metadata() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ Metadata(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ConcurrentHashMap() : map);
    }

    @Override // com.bugsnag.android.MetadataAware
    @Nullable
    public Map<String, Object> getMetadata(@NotNull String section) {
        section.getClass();
        return this.store.get(section);
    }

    @NotNull
    public final Metadata copy(@NotNull Map<String, Map<String, Object>> store) {
        store.getClass();
        return new Metadata(store);
    }

    @Override // com.bugsnag.android.MetadataAware
    public void clearMetadata(@NotNull String section) {
        section.getClass();
        this.store.remove(section);
    }

    @Override // com.bugsnag.android.MetadataAware
    public void addMetadata(@NotNull String section, @NotNull String key, @Nullable Object value) {
        section.getClass();
        key.getClass();
        if (value == null) {
            clearMetadata(section, key);
            return;
        }
        Map<String, Object> map = this.store.get(section);
        if (map == null) {
            map = new ConcurrentHashMap<>();
        }
        this.store.put(section, map);
        insertValue(map, key, value);
    }
}
