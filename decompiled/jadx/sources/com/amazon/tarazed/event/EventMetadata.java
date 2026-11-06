package com.amazon.tarazed.event;

import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.dee.app.metrics.MetricsConstants;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.apache.commons.text.StringSubstitutor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000 \"2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\"B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0002\u0010\u0005J\u0011\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0001J\u0011\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0003H\u0096\u0001J\u0013\u0010\u001a\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0017\u001a\u00020\u0002H\u0096\u0003J\b\u0010\u001e\u001a\u00020\u000eH\u0016J\t\u0010\u001f\u001a\u00020\u0016H\u0096\u0001J\u0011\u0010 \u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0000H\u0086\u0002J\b\u0010!\u001a\u00020\u0003H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\b0\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006#"}, d2 = {"Lcom/amazon/tarazed/event/EventMetadata;", "", "Lcom/amazon/tarazed/event/EventMetadataKey;", "", "data", "(Ljava/util/Map;)V", "entries", "", "", "getEntries", "()Ljava/util/Set;", "keys", "getKeys", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "containsKey", "", "key", "containsValue", "value", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "", MetricsConstants.Method.CACHE_GET, "hashCode", "isEmpty", "plus", "toString", "Companion", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class EventMetadata implements Map<EventMetadataKey, String>, KMappedMarker {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String REDACTED = "[REDACTED]";

    @NotNull
    private final Map<EventMetadataKey, String> data;

    public EventMetadata(@NotNull Map<EventMetadataKey, String> map) {
        map.getClass();
        this.data = map;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ String compute(EventMetadataKey eventMetadataKey, BiFunction<? super EventMetadataKey, ? super String, ? extends String> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ String computeIfAbsent(EventMetadataKey eventMetadataKey, Function<? super EventMetadataKey, ? extends String> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ String computeIfPresent(EventMetadataKey eventMetadataKey, BiFunction<? super EventMetadataKey, ? super String, ? extends String> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof EventMetadataKey) {
            return containsKey((EventMetadataKey) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof String) {
            return containsValue((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<EventMetadataKey, String>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public boolean equals(@Nullable Object other) {
        return this.data.equals(other);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ String get(Object obj) {
        if (obj instanceof EventMetadataKey) {
            return get((EventMetadataKey) obj);
        }
        return null;
    }

    @NotNull
    public Set<Map.Entry<EventMetadataKey, String>> getEntries() {
        return this.data.entrySet();
    }

    @NotNull
    public Set<EventMetadataKey> getKeys() {
        return this.data.keySet();
    }

    public int getSize() {
        return this.data.size();
    }

    @NotNull
    public Collection<String> getValues() {
        return this.data.values();
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.data.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.data.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<EventMetadataKey> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ String merge(EventMetadataKey eventMetadataKey, String str, BiFunction<? super String, ? super String, ? extends String> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @NotNull
    public final EventMetadata plus(@NotNull EventMetadata other) {
        other.getClass();
        return new EventMetadata(MapsKt.plus(this.data, other.data));
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ String put(EventMetadataKey eventMetadataKey, String str) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends EventMetadataKey, ? extends String> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ String putIfAbsent(EventMetadataKey eventMetadataKey, String str) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public String remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ String replace(EventMetadataKey eventMetadataKey, String str) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super EventMetadataKey, ? super String, ? extends String> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @NotNull
    public String toString() {
        return CollectionsKt.joinToString$default(this.data.entrySet(), ", ", "{", StringSubstitutor.DEFAULT_VAR_END, new Function1<Map.Entry<? extends EventMetadataKey, ? extends String>, CharSequence>() { // from class: com.amazon.tarazed.event.EventMetadata$toString$1
            @NotNull
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final CharSequence invoke2(@NotNull Map.Entry<? extends EventMetadataKey, String> entry) {
                entry.getClass();
                EventMetadataKey key = entry.getKey();
                String value = entry.getValue();
                if (EventMetadataKey.INSTANCE.getSensitiveKeys().contains(key)) {
                    value = "[REDACTED]";
                }
                return key + "=" + value;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ CharSequence invoke(Map.Entry<? extends EventMetadataKey, ? extends String> entry) {
                return invoke2((Map.Entry<? extends EventMetadataKey, String>) entry);
            }
        }, 24);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<String> values() {
        return getValues();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\u0005\u001a\u00020\u00062*\u0010\u0007\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t0\b\"\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/amazon/tarazed/event/EventMetadata$Companion;", "", "()V", "REDACTED", "", "of", "Lcom/amazon/tarazed/event/EventMetadata;", "pairs", "", "Lkotlin/Pair;", "Lcom/amazon/tarazed/event/EventMetadataKey;", "([Lkotlin/Pair;)Lcom/amazon/tarazed/event/EventMetadata;", "TarazedAndroidLibrary_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EventMetadata of(@NotNull Pair<? extends EventMetadataKey, String>... pairs) {
            pairs.getClass();
            return new EventMetadata(MapsKt.toMap(pairs));
        }

        private Companion() {
        }
    }

    /* renamed from: compute, reason: avoid collision after fix types in other method */
    public String compute2(EventMetadataKey eventMetadataKey, BiFunction<? super EventMetadataKey, ? super String, ? extends String> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: computeIfAbsent, reason: avoid collision after fix types in other method */
    public String computeIfAbsent2(EventMetadataKey eventMetadataKey, Function<? super EventMetadataKey, ? extends String> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: computeIfPresent, reason: avoid collision after fix types in other method */
    public String computeIfPresent2(EventMetadataKey eventMetadataKey, BiFunction<? super EventMetadataKey, ? super String, ? extends String> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: merge, reason: avoid collision after fix types in other method */
    public String merge2(EventMetadataKey eventMetadataKey, String str, BiFunction<? super String, ? super String, ? extends String> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public String put2(EventMetadataKey eventMetadataKey, String str) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: putIfAbsent, reason: avoid collision after fix types in other method */
    public String putIfAbsent2(EventMetadataKey eventMetadataKey, String str) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: replace, reason: avoid collision after fix types in other method */
    public String replace2(EventMetadataKey eventMetadataKey, String str) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: replace, reason: avoid collision after fix types in other method */
    public boolean replace2(EventMetadataKey eventMetadataKey, String str, String str2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(EventMetadataKey eventMetadataKey, String str, String str2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(@NotNull EventMetadataKey key) {
        key.getClass();
        return this.data.containsKey(key);
    }

    public boolean containsValue(@NotNull String value) {
        value.getClass();
        return this.data.containsValue(value);
    }

    @Nullable
    public String get(@NotNull EventMetadataKey key) {
        key.getClass();
        return this.data.get(key);
    }

    @Override // java.util.Map
    /* renamed from: get, reason: avoid collision after fix types in other method */
    public final /* bridge */ String get2(Object obj) {
        if (obj instanceof EventMetadataKey) {
            return get((EventMetadataKey) obj);
        }
        return null;
    }
}
