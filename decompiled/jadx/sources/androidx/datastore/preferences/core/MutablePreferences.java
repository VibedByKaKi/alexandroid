package androidx.datastore.preferences.core;

import androidx.compose.runtime.BitVector$$ExternalSyntheticOutline0;
import androidx.datastore.preferences.core.Preferences;
import androidx.exifinterface.media.ExifInterface;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.dee.app.metrics.MetricsConstants;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B+\b\u0000\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0018\u0010\r\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u000eH\u0016J\r\u0010\u000f\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0011J\u0006\u0010\u0012\u001a\u00020\u0010J\u001d\u0010\u0013\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0004H\u0096\u0002J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J\r\u0010\u0018\u001a\u00020\u0010H\u0000¢\u0006\u0002\b\u0019J$\u0010\u001a\u001a\u0004\u0018\u0001H\u0014\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0004H\u0096\u0002¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u001dH\u0016J\u0015\u0010\u001e\u001a\u00020\u00102\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0086\u0002J\u0011\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u0001H\u0086\u0002J\u0015\u0010\u001f\u001a\u00020\u00102\n\u0010!\u001a\u0006\u0012\u0002\b\u00030\"H\u0086\u0002J'\u0010#\u001a\u00020\u00102\u001a\u0010$\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\"0%\"\u0006\u0012\u0002\b\u00030\"¢\u0006\u0002\u0010&J\u001f\u0010'\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0004¢\u0006\u0002\u0010\u001bJ*\u0010(\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u0002H\u00140\u00042\u0006\u0010)\u001a\u0002H\u0014H\u0086\u0002¢\u0006\u0002\u0010*J#\u0010+\u001a\u00020\u00102\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010)\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0002\b,J\b\u0010-\u001a\u00020.H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0002\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006/"}, d2 = {"Landroidx/datastore/preferences/core/MutablePreferences;", "Landroidx/datastore/preferences/core/Preferences;", "preferencesMap", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "startFrozen", "", "(Ljava/util/Map;Z)V", "frozen", "Landroidx/datastore/preferences/core/AtomicBoolean;", "getPreferencesMap$datastore_preferences_core_release", "()Ljava/util/Map;", "asMap", "", "checkNotFrozen", "", "checkNotFrozen$datastore_preferences_core_release", MetricsConstants.Method.CACHE_CLEAR, "contains", ExifInterface.GPS_DIRECTION_TRUE, "key", "equals", CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER, "freeze", "freeze$datastore_preferences_core_release", MetricsConstants.Method.CACHE_GET, "(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;", "hashCode", "", "minusAssign", "plusAssign", "prefs", "pair", "Landroidx/datastore/preferences/core/Preferences$Pair;", "putAll", "pairs", "", "([Landroidx/datastore/preferences/core/Preferences$Pair;)V", BulkOperationType.remove, "set", "value", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V", "setUnchecked", "setUnchecked$datastore_preferences_core_release", "toString", "", "datastore-preferences-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPreferences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preferences.kt\nandroidx/datastore/preferences/core/MutablePreferences\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,361:1\n1#2:362\n1179#3,2:363\n1253#3,4:365\n13579#4,2:369\n167#5,3:371\n*S KotlinDebug\n*F\n+ 1 Preferences.kt\nandroidx/datastore/preferences/core/MutablePreferences\n*L\n158#1:363,2\n158#1:365,4\n250#1:369,2\n283#1:371,3\n*E\n"})
/* loaded from: classes.dex */
public final class MutablePreferences extends Preferences {

    @NotNull
    private final AtomicBoolean frozen;

    @NotNull
    private final Map<Preferences.Key<?>, Object> preferencesMap;

    public /* synthetic */ MutablePreferences(Map map, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, (i & 2) != 0 ? true : z);
    }

    @Override // androidx.datastore.preferences.core.Preferences
    @NotNull
    public Map<Preferences.Key<?>, Object> asMap() {
        Pair pair;
        Set<Map.Entry<Preferences.Key<?>, Object>> entrySet = this.preferencesMap.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(BitVector$$ExternalSyntheticOutline0.m(entrySet, 10, 16));
        Iterator<T> it2 = entrySet.iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                pair = new Pair(entry.getKey(), Arrays.copyOf(bArr, bArr.length));
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return Actual_jvmAndroidKt.immutableMap(linkedHashMap);
    }

    public final void checkNotFrozen$datastore_preferences_core_release() {
        if (this.frozen.get()) {
            Single$$ExternalSyntheticBUOutline0.m$2("Do mutate preferences once returned to DataStore.");
        }
    }

    public final void clear() {
        checkNotFrozen$datastore_preferences_core_release();
        this.preferencesMap.clear();
    }

    @Override // androidx.datastore.preferences.core.Preferences
    public <T> boolean contains(@NotNull Preferences.Key<T> key) {
        key.getClass();
        return this.preferencesMap.containsKey(key);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[LOOP:0: B:15:0x002e->B:30:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof androidx.datastore.preferences.core.MutablePreferences
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            androidx.datastore.preferences.core.MutablePreferences r6 = (androidx.datastore.preferences.core.MutablePreferences) r6
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r0 = r6.preferencesMap
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r2 = r5.preferencesMap
            r3 = 1
            if (r0 != r2) goto L10
            return r3
        L10:
            int r0 = r0.size()
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r2 = r5.preferencesMap
            int r2 = r2.size()
            if (r0 == r2) goto L1d
            return r1
        L1d:
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r6 = r6.preferencesMap
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L26
            return r3
        L26:
            java.util.Set r6 = r6.entrySet()
            java.util.Iterator r6 = r6.iterator()
        L2e:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L67
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.util.Map<androidx.datastore.preferences.core.Preferences$Key<?>, java.lang.Object> r2 = r5.preferencesMap
            java.lang.Object r4 = r0.getKey()
            java.lang.Object r2 = r2.get(r4)
            if (r2 == 0) goto L63
            java.lang.Object r0 = r0.getValue()
            boolean r4 = r0 instanceof byte[]
            if (r4 == 0) goto L5e
            boolean r4 = r2 instanceof byte[]
            if (r4 == 0) goto L63
            byte[] r0 = (byte[]) r0
            byte[] r2 = (byte[]) r2
            boolean r0 = java.util.Arrays.equals(r0, r2)
            if (r0 == 0) goto L63
            r0 = r3
            goto L64
        L5e:
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r2)
            goto L64
        L63:
            r0 = r1
        L64:
            if (r0 != 0) goto L2e
            return r1
        L67:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.core.MutablePreferences.equals(java.lang.Object):boolean");
    }

    public final void freeze$datastore_preferences_core_release() {
        this.frozen.set(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.datastore.preferences.core.Preferences
    @Nullable
    public <T> T get(@NotNull Preferences.Key<T> key) {
        key.getClass();
        T t = (T) this.preferencesMap.get(key);
        if (!(t instanceof byte[])) {
            return t;
        }
        byte[] bArr = (byte[]) t;
        return (T) Arrays.copyOf(bArr, bArr.length);
    }

    @NotNull
    public final Map<Preferences.Key<?>, Object> getPreferencesMap$datastore_preferences_core_release() {
        return this.preferencesMap;
    }

    public int hashCode() {
        Iterator<T> it2 = this.preferencesMap.entrySet().iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object value = ((Map.Entry) it2.next()).getValue();
            i += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return i;
    }

    public final void minusAssign(@NotNull Preferences.Key<?> key) {
        key.getClass();
        checkNotFrozen$datastore_preferences_core_release();
        remove(key);
    }

    public final void plusAssign(@NotNull Preferences prefs) {
        prefs.getClass();
        checkNotFrozen$datastore_preferences_core_release();
        this.preferencesMap.putAll(prefs.asMap());
    }

    public final void putAll(@NotNull Preferences.Pair<?>... pairs) {
        pairs.getClass();
        checkNotFrozen$datastore_preferences_core_release();
        for (Preferences.Pair<?> pair : pairs) {
            setUnchecked$datastore_preferences_core_release(pair.getKey$datastore_preferences_core_release(), pair.getValue$datastore_preferences_core_release());
        }
    }

    public final <T> T remove(@NotNull Preferences.Key<T> key) {
        key.getClass();
        checkNotFrozen$datastore_preferences_core_release();
        return (T) this.preferencesMap.remove(key);
    }

    public final <T> void set(@NotNull Preferences.Key<T> key, T value) {
        key.getClass();
        setUnchecked$datastore_preferences_core_release(key, value);
    }

    public final void setUnchecked$datastore_preferences_core_release(@NotNull Preferences.Key<?> key, @Nullable Object value) {
        key.getClass();
        checkNotFrozen$datastore_preferences_core_release();
        if (value == null) {
            remove(key);
            return;
        }
        if (value instanceof Set) {
            this.preferencesMap.put(key, Actual_jvmAndroidKt.immutableCopyOfSet((Set) value));
            return;
        }
        boolean z = value instanceof byte[];
        Map<Preferences.Key<?>, Object> map = this.preferencesMap;
        if (!z) {
            map.put(key, value);
        } else {
            byte[] bArr = (byte[]) value;
            map.put(key, Arrays.copyOf(bArr, bArr.length));
        }
    }

    @NotNull
    public String toString() {
        return CollectionsKt.joinToString$default(this.preferencesMap.entrySet(), ",\n", "{\n", "\n}", new Function1<Map.Entry<Preferences.Key<?>, Object>, CharSequence>() { // from class: androidx.datastore.preferences.core.MutablePreferences$toString$1
            @Override // kotlin.jvm.functions.Function1
            @NotNull
            public final CharSequence invoke(@NotNull Map.Entry<Preferences.Key<?>, Object> entry) {
                entry.getClass();
                Object value = entry.getValue();
                return "  " + entry.getKey().getName() + " = " + (value instanceof byte[] ? ArraysKt.joinToString$default((byte[]) value, ", ", MarkdownConstants.LEFT_BRACKET, MarkdownConstants.RIGHT_BRACKET, 0, null, 56) : String.valueOf(entry.getValue()));
            }
        }, 24);
    }

    public final void plusAssign(@NotNull Preferences.Pair<?> pair) {
        pair.getClass();
        checkNotFrozen$datastore_preferences_core_release();
        putAll(pair);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutablePreferences() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public MutablePreferences(@NotNull Map<Preferences.Key<?>, Object> map, boolean z) {
        map.getClass();
        this.preferencesMap = map;
        this.frozen = new AtomicBoolean(z);
    }
}
