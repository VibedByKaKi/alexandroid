package com.amazon.dee.app.services.metrics;

import androidx.annotation.VisibleForTesting;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.dee.app.metrics.AlexaMetricsEvent;
import com.dee.app.metrics.MetricsConstants;
import io.ktor.client.utils.CacheControl;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.jvm.internal.markers.KMutableMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001b\u001cB3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0014H\u0016J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0016J\u0014\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/amazon/dee/app/services/metrics/DefaultAlexaMetricsEvent;", "Lcom/dee/app/metrics/AlexaMetricsEvent;", "eventName", "", "componentName", "additionalEntries", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "customEntries", "", "getEventDate", "", "eventDate", "priority", "", "getPriority$annotations", "()V", "invalidated", "", "invalidateEvent", "", "isInvalidated", "getEventName", "getComponentName", "getCustomEntries", "WrappedMap", "Companion", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDefaultAlexaMetricsEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultAlexaMetricsEvent.kt\ncom/amazon/dee/app/services/metrics/DefaultAlexaMetricsEvent\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,129:1\n216#2,2:130\n*S KotlinDebug\n*F\n+ 1 DefaultAlexaMetricsEvent.kt\ncom/amazon/dee/app/services/metrics/DefaultAlexaMetricsEvent\n*L\n37#1:130,2\n*E\n"})
/* loaded from: classes5.dex */
public class DefaultAlexaMetricsEvent implements AlexaMetricsEvent {

    @NotNull
    public static final String BLANK_STRING = "BLANK";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String NULL_STRING = "NULL";

    @Nullable
    private final String componentName;

    @NotNull
    private final Map<String, Object> customEntries = new HashMap();
    private final long eventDate;

    @Nullable
    private final String eventName;
    private boolean invalidated;

    @JvmField
    public final int priority;

    public DefaultAlexaMetricsEvent(@Nullable String str, @Nullable String str2, @Nullable Map<String, ? extends Object> map) {
        int i;
        long currentTimeMillis;
        this.eventName = str;
        this.componentName = str2;
        if (map != null) {
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                String key = entry.getKey();
                Object value = entry.getValue();
                Map<String, Object> map2 = this.customEntries;
                if (value == null) {
                    value = "NULL";
                } else if (value.toString().length() == 0) {
                    value = BLANK_STRING;
                }
                map2.put(key, value);
            }
        }
        if (this.customEntries.containsKey("sendPriority")) {
            Object remove = this.customEntries.remove("sendPriority");
            remove.getClass();
            i = ((Integer) remove).intValue();
        } else {
            i = 0;
        }
        this.priority = i;
        Object obj = this.customEntries.get("EventTimestamp");
        if (obj instanceof Number) {
            this.customEntries.remove("EventTimestamp");
            currentTimeMillis = ((Number) obj).longValue();
        } else {
            currentTimeMillis = System.currentTimeMillis();
        }
        this.eventDate = currentTimeMillis;
    }

    @Override // com.dee.app.metrics.AlexaMetricsEvent
    @Nullable
    public String getComponentName() {
        return this.componentName;
    }

    @Override // com.dee.app.metrics.AlexaMetricsEvent
    @NotNull
    public Map<String, Object> getCustomEntries() {
        return TypeIntrinsics.asMutableMap(new WrappedMap(this.customEntries));
    }

    @Override // com.dee.app.metrics.AlexaMetricsEvent
    public long getEventDate() {
        return this.eventDate;
    }

    @Override // com.dee.app.metrics.AlexaMetricsEvent
    @Nullable
    public String getEventName() {
        return this.eventName;
    }

    @Override // com.dee.app.metrics.AlexaMetricsEvent
    public void invalidateEvent() {
        this.invalidated = true;
    }

    @Override // com.dee.app.metrics.AlexaMetricsEvent
    /* renamed from: isInvalidated, reason: from getter */
    public boolean getInvalidated() {
        return this.invalidated;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003¨\u0006\t"}, d2 = {"Lcom/amazon/dee/app/services/metrics/DefaultAlexaMetricsEvent$Companion;", "", "<init>", "()V", "BLANK_STRING", "", "getBLANK_STRING$annotations", "NULL_STRING", "getNULL_STRING$annotations", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getBLANK_STRING$annotations() {
        }

        @VisibleForTesting
        public static /* synthetic */ void getNULL_STRING$annotations() {
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\u0012\u0010\u001c\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u0016J\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u0002H\u0096\u0002J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u0002H\u0016J\b\u0010 \u001a\u00020!H\u0016J\u001c\u0010\"\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001b\u001a\u00020\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u0016J \u0010#\u001a\u00020!2\u0016\u0010$\u001a\u0012\u0012\u0006\b\u0001\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030%H\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR(\u0010\u000f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00100\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000eR\"\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00138VX\u0096\u0004¢\u0006\f\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, d2 = {"Lcom/amazon/dee/app/services/metrics/DefaultAlexaMetricsEvent$WrappedMap;", "", "", "", "wrappedMap", "<init>", "(Ljava/util/Map;)V", "size", "", "getSize", "()I", "keys", "", "getKeys", "()Ljava/util/Set;", "entries", "", "getEntries", "values", "", "getValues$annotations", "()V", "getValues", "()Ljava/util/Collection;", "isEmpty", "", "containsKey", "key", "containsValue", "value", MetricsConstants.Method.CACHE_GET, BulkOperationType.remove, MetricsConstants.Method.CACHE_CLEAR, "", MetricsConstants.Method.CACHE_PUT, "putAll", "from", "", CacheControl.PUBLIC}, k = 1, mv = {2, 2, 0}, xi = 48)
    @VisibleForTesting
    @SourceDebugExtension({"SMAP\nDefaultAlexaMetricsEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultAlexaMetricsEvent.kt\ncom/amazon/dee/app/services/metrics/DefaultAlexaMetricsEvent$WrappedMap\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,129:1\n216#2,2:130\n*S KotlinDebug\n*F\n+ 1 DefaultAlexaMetricsEvent.kt\ncom/amazon/dee/app/services/metrics/DefaultAlexaMetricsEvent$WrappedMap\n*L\n117#1:130,2\n*E\n"})
    public static final class WrappedMap implements Map<String, Object>, KMutableMap {

        @NotNull
        private final Map<String, Object> wrappedMap;

        public WrappedMap(@NotNull Map<String, Object> map) {
            map.getClass();
            this.wrappedMap = map;
        }

        @Override // java.util.Map
        public void clear() {
            this.wrappedMap.clear();
        }

        @Override // java.util.Map
        public final /* bridge */ boolean containsKey(Object obj) {
            if (obj instanceof String) {
                return containsKey((String) obj);
            }
            return false;
        }

        @Override // java.util.Map
        public boolean containsValue(@Nullable Object value) {
            return this.wrappedMap.containsValue(value);
        }

        @Override // java.util.Map
        public final /* bridge */ Set<Map.Entry<String, Object>> entrySet() {
            return getEntries();
        }

        @Override // java.util.Map
        public final /* bridge */ Object get(Object obj) {
            if (obj instanceof String) {
                return get((String) obj);
            }
            return null;
        }

        @NotNull
        public Set<Map.Entry<String, Object>> getEntries() {
            Set<Map.Entry<String, Object>> entrySet = this.wrappedMap.entrySet();
            entrySet.getClass();
            return TypeIntrinsics.asMutableSet(entrySet);
        }

        @NotNull
        public Set<String> getKeys() {
            return this.wrappedMap.keySet();
        }

        public int getSize() {
            return this.wrappedMap.size();
        }

        @NotNull
        public Collection<Object> getValues() {
            Collection<Object> values = this.wrappedMap.values();
            values.getClass();
            return TypeIntrinsics.asMutableCollection(values);
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.wrappedMap.isEmpty();
        }

        @Override // java.util.Map
        public final /* bridge */ Set<String> keySet() {
            return getKeys();
        }

        @Override // java.util.Map
        @Nullable
        public Object put(@NotNull String key, @Nullable Object value) {
            key.getClass();
            if (value == null) {
                value = "NULL";
            } else if (value.toString().length() == 0) {
                value = DefaultAlexaMetricsEvent.BLANK_STRING;
            }
            return this.wrappedMap.put(key, value);
        }

        @Override // java.util.Map
        public void putAll(@NotNull Map<? extends String, ? extends Object> from) {
            from.getClass();
            for (Map.Entry<? extends String, ? extends Object> entry : from.entrySet()) {
                put(entry.getKey(), entry.getValue());
            }
        }

        @Override // java.util.Map
        public final /* bridge */ Object remove(Object obj) {
            if (obj instanceof String) {
                return remove((String) obj);
            }
            return null;
        }

        @Override // java.util.Map
        public final /* bridge */ int size() {
            return getSize();
        }

        @Override // java.util.Map
        public final /* bridge */ Collection<Object> values() {
            return getValues();
        }

        public boolean containsKey(@NotNull String key) {
            key.getClass();
            return this.wrappedMap.containsKey(key);
        }

        @Nullable
        public Object get(@NotNull String key) {
            key.getClass();
            return this.wrappedMap.get(key);
        }

        @Nullable
        public Object remove(@NotNull String key) {
            key.getClass();
            return this.wrappedMap.remove(key);
        }

        public static /* synthetic */ void getValues$annotations() {
        }
    }

    @VisibleForTesting
    public static /* synthetic */ void getPriority$annotations() {
    }
}
