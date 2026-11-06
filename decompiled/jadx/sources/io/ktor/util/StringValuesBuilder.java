package io.ktor.util;

import com.amazon.clouddrive.extended.model.BulkOperationType;
import com.dee.app.metrics.MetricsConstants;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@InternalAPI
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fJ\u000e\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019J\u001c\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aJ\u000e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0019J\u001c\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001aJ\b\u0010\u001c\u001a\u00020\u0019H\u0016J\u0006\u0010\u001d\u001a\u00020\u0014J\u0011\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000fH\u0086\u0002J\u0016\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00102\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u001e\u0010 \u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0#0\"0!J\u0013\u0010$\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u000fH\u0086\u0002J\u0016\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010#2\u0006\u0010\u0015\u001a\u00020\u000fJ\u0006\u0010&\u001a\u00020\u0003J\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000f0(J\u000e\u0010)\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fJ\u0016\u0010)\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fJ\u0006\u0010*\u001a\u00020\u0014J\u0019\u0010+\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0086\u0002R\u001a\u0010\u0007\u001a\u00020\u0003X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\tR&\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00100\u000eX\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006,"}, d2 = {"Lio/ktor/util/StringValuesBuilder;", "", "caseInsensitiveName", "", "size", "", "(ZI)V", "built", "getBuilt", "()Z", "setBuilt", "(Z)V", "getCaseInsensitiveName", "values", "", "", "", "getValues", "()Ljava/util/Map;", "append", "", "name", "value", "appendAll", "stringValues", "Lio/ktor/util/StringValues;", "", "appendMissing", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, MetricsConstants.Method.CACHE_CLEAR, "contains", "ensureListForKey", "entries", "", "", "", MetricsConstants.Method.CACHE_GET, "getAll", "isEmpty", "names", "", BulkOperationType.remove, "removeKeysWithNoEntries", "set", "ktor-utils"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes9.dex */
public class StringValuesBuilder {
    private boolean built;
    private final boolean caseInsensitiveName;

    @NotNull
    private final Map<String, List<String>> values;

    public StringValuesBuilder(boolean z, int i) {
        this.caseInsensitiveName = z;
        this.values = z ? CollectionsKt.caseInsensitiveMap() : new LinkedHashMap<>(i);
    }

    private final List<String> ensureListForKey(String name, int size) {
        if (this.built) {
            Single$$ExternalSyntheticBUOutline0.m$2("Cannot modify a builder when final structure has already been built");
            return null;
        }
        List<String> list = this.values.get(name);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList(size);
        this.values.put(name, arrayList);
        return arrayList;
    }

    public final void append(@NotNull String name, @NotNull String value) {
        name.getClass();
        value.getClass();
        ensureListForKey(name, 1).add(value);
    }

    public final void appendAll(@NotNull String name, @NotNull Iterable<String> values) {
        name.getClass();
        values.getClass();
        Collection collection = (Collection) (!(values instanceof Collection) ? null : values);
        CollectionsKt__MutableCollectionsKt.addAll(ensureListForKey(name, collection != null ? collection.size() : 2), values);
    }

    public final void appendMissing(@NotNull String name, @NotNull Iterable<String> values) {
        Set emptySet;
        name.getClass();
        values.getClass();
        List<String> list = this.values.get(name);
        if (list == null || (emptySet = kotlin.collections.CollectionsKt.toSet(list)) == null) {
            emptySet = SetsKt.emptySet();
        }
        ArrayList arrayList = new ArrayList();
        for (String str : values) {
            if (!emptySet.contains(str)) {
                arrayList.add(str);
            }
        }
        appendAll(name, arrayList);
    }

    @NotNull
    public StringValues build() {
        if (this.built) {
            Single$$ExternalSyntheticBUOutline0.m$3("ValueMapBuilder can only build a single ValueMap");
            return null;
        }
        this.built = true;
        return new StringValuesImpl(this.caseInsensitiveName, this.values);
    }

    public final void clear() {
        this.values.clear();
    }

    public final boolean contains(@NotNull String name, @NotNull String value) {
        name.getClass();
        value.getClass();
        List<String> list = this.values.get(name);
        if (list != null) {
            return list.contains(value);
        }
        return false;
    }

    @NotNull
    public final Set<Map.Entry<String, List<String>>> entries() {
        return CollectionsJvmKt.unmodifiable(this.values.entrySet());
    }

    @Nullable
    public final String get(@NotNull String name) {
        name.getClass();
        List<String> all = getAll(name);
        if (all != null) {
            return (String) kotlin.collections.CollectionsKt.firstOrNull((List) all);
        }
        return null;
    }

    @Nullable
    public final List<String> getAll(@NotNull String name) {
        name.getClass();
        return this.values.get(name);
    }

    public final boolean getBuilt() {
        return this.built;
    }

    public final boolean getCaseInsensitiveName() {
        return this.caseInsensitiveName;
    }

    @NotNull
    public final Map<String, List<String>> getValues() {
        return this.values;
    }

    public final boolean isEmpty() {
        return this.values.isEmpty();
    }

    @NotNull
    public final Set<String> names() {
        return this.values.keySet();
    }

    public final boolean remove(@NotNull String name, @NotNull String value) {
        name.getClass();
        value.getClass();
        List<String> list = this.values.get(name);
        if (list != null) {
            return list.remove(value);
        }
        return false;
    }

    public final void removeKeysWithNoEntries() {
        Map<String, List<String>> map = this.values;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getValue().isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            remove((String) ((Map.Entry) it2.next()).getKey());
        }
    }

    public final void set(@NotNull String name, @NotNull String value) {
        name.getClass();
        value.getClass();
        List<String> ensureListForKey = ensureListForKey(name, 1);
        ensureListForKey.clear();
        ensureListForKey.add(value);
    }

    public final void setBuilt(boolean z) {
        this.built = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StringValuesBuilder() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public /* synthetic */ StringValuesBuilder(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 8 : i);
    }

    public final boolean contains(@NotNull String name) {
        name.getClass();
        return this.values.containsKey(name);
    }

    public final void remove(@NotNull String name) {
        name.getClass();
        this.values.remove(name);
    }

    public final void appendAll(@NotNull StringValues stringValues) {
        stringValues.getClass();
        stringValues.forEach(new Function2<String, List<? extends String>, Unit>() { // from class: io.ktor.util.StringValuesBuilder$appendAll$1
            {
                super(2);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String str, @NotNull List<String> list) {
                str.getClass();
                list.getClass();
                StringValuesBuilder.this.appendAll(str, list);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, List<? extends String> list) {
                invoke2(str, (List<String>) list);
                return Unit.INSTANCE;
            }
        });
    }

    public final void appendMissing(@NotNull StringValues stringValues) {
        stringValues.getClass();
        stringValues.forEach(new Function2<String, List<? extends String>, Unit>() { // from class: io.ktor.util.StringValuesBuilder$appendMissing$1
            {
                super(2);
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull String str, @NotNull List<String> list) {
                str.getClass();
                list.getClass();
                StringValuesBuilder.this.appendMissing(str, list);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, List<? extends String> list) {
                invoke2(str, (List<String>) list);
                return Unit.INSTANCE;
            }
        });
    }
}
