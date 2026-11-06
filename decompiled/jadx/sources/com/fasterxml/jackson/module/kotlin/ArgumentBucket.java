package com.fasterxml.jackson.module.kotlin;

import com.dee.app.metrics.MetricsConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.reflect.KParameter;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001'B-\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u001f\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u0002H\u0016J\u0012\u0010!\u001a\u00020\u00132\b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u0016J\u0013\u0010#\u001a\u0004\u0018\u00010\u00032\u0006\u0010 \u001a\u00020\u0002H\u0096\u0002J\b\u0010$\u001a\u00020\u0013H\u0016J\u001b\u0010%\u001a\u00020&2\u0006\u0010 \u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u0003H\u0086\u0002R\u001b\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\r\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000f0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ArgumentBucket;", "", "Lkotlin/reflect/KParameter;", "", "parameters", "", "arguments", "count", "", "([Lkotlin/reflect/KParameter;[Ljava/lang/Object;I)V", "getArguments", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "entries", "", "", "getEntries", "()Ljava/util/Set;", "isFullInitialized", "", "()Z", "keys", "getKeys", "[Lkotlin/reflect/KParameter;", "size", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "containsKey", "key", "containsValue", "value", MetricsConstants.Method.CACHE_GET, "isEmpty", "set", "", "Entry", "jackson-module-kotlin"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nArgumentBucket.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArgumentBucket.kt\ncom/fasterxml/jackson/module/kotlin/ArgumentBucket\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,69:1\n11383#2,9:70\n13309#2:79\n13310#2:82\n11392#2:83\n12474#2,2:91\n1#3:80\n1#3:81\n1549#4:84\n1620#4,3:85\n1747#4,3:88\n*S KotlinDebug\n*F\n+ 1 ArgumentBucket.kt\ncom/fasterxml/jackson/module/kotlin/ArgumentBucket\n*L\n52#1:70,9\n52#1:79\n52#1:82\n52#1:83\n67#1:91,2\n52#1:81\n58#1:84\n58#1:85,3\n65#1:88,3\n*E\n"})
/* loaded from: classes7.dex */
public final class ArgumentBucket implements Map<KParameter, Object>, KMappedMarker {

    @NotNull
    private final Object[] arguments;
    private int count;

    @NotNull
    private final KParameter[] parameters;

    public ArgumentBucket(@NotNull KParameter[] kParameterArr, @NotNull Object[] objArr, int i) {
        kParameterArr.getClass();
        objArr.getClass();
        this.parameters = kParameterArr;
        this.arguments = objArr;
        this.count = i;
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object compute(KParameter kParameter, BiFunction<? super KParameter, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object computeIfAbsent(KParameter kParameter, Function<? super KParameter, ? extends Object> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object computeIfPresent(KParameter kParameter, BiFunction<? super KParameter, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean containsKey(@NotNull KParameter key) {
        key.getClass();
        for (KParameter kParameter : this.parameters) {
            if (kParameter != null && kParameter.getIndex() == key.getIndex()) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(@Nullable Object value) {
        Set<KParameter> keySet = keySet();
        if ((keySet instanceof Collection) && keySet.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = keySet.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.areEqual(this.arguments[((KParameter) it2.next()).getIndex()], value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<KParameter, Object>> entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof KParameter) {
            return get((KParameter) obj);
        }
        return null;
    }

    @NotNull
    public final Object[] getArguments() {
        return this.arguments;
    }

    @NotNull
    public Set<Map.Entry<KParameter, Object>> getEntries() {
        KParameter[] kParameterArr = this.parameters;
        ArrayList arrayList = new ArrayList();
        int length = kParameterArr.length;
        for (int i = 0; i < length; i++) {
            KParameter kParameter = kParameterArr[i];
            Entry entry = kParameter != null ? new Entry(kParameter, this.arguments[kParameter.getIndex()]) : null;
            if (entry != null) {
                arrayList.add(entry);
            }
        }
        return CollectionsKt.toSet(arrayList);
    }

    @NotNull
    public Set<KParameter> getKeys() {
        return CollectionsKt.toSet(ArraysKt.filterNotNull(this.parameters));
    }

    /* renamed from: getSize, reason: from getter */
    public int getCount() {
        return this.count;
    }

    @NotNull
    public Collection<Object> getValues() {
        Set<KParameter> keySet = keySet();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(keySet, 10));
        Iterator<T> it2 = keySet.iterator();
        while (it2.hasNext()) {
            arrayList.add(this.arguments[((KParameter) it2.next()).getIndex()]);
        }
        return arrayList;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    public final boolean isFullInitialized() {
        return this.count == this.arguments.length;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<KParameter> keySet() {
        return getKeys();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object merge(KParameter kParameter, Object obj, BiFunction<? super Object, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object put(KParameter kParameter, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends KParameter, ? extends Object> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object putIfAbsent(KParameter kParameter, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ Object replace(KParameter kParameter, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super KParameter, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void set(@NotNull KParameter key, @Nullable Object value) {
        key.getClass();
        this.arguments[key.getIndex()] = value;
        this.parameters[key.getIndex()] = key;
        this.count++;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getCount();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<Object> values() {
        return getValues();
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/fasterxml/jackson/module/kotlin/ArgumentBucket$Entry;", "", "Lkotlin/reflect/KParameter;", "", "key", "value", "(Lkotlin/reflect/KParameter;Ljava/lang/Object;)V", "getKey", "()Lkotlin/reflect/KParameter;", "getValue", "()Ljava/lang/Object;", "jackson-module-kotlin"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Entry implements Map.Entry<KParameter, Object>, KMappedMarker {

        @NotNull
        private final KParameter key;

        @Nullable
        private final Object value;

        public Entry(@NotNull KParameter kParameter, @Nullable Object obj) {
            kParameter.getClass();
            this.key = kParameter;
            this.value = obj;
        }

        @Override // java.util.Map.Entry
        @Nullable
        public Object getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map.Entry
        @NotNull
        public KParameter getKey() {
            return this.key;
        }
    }

    /* renamed from: compute, reason: avoid collision after fix types in other method */
    public Object compute2(KParameter kParameter, BiFunction<? super KParameter, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: computeIfAbsent, reason: avoid collision after fix types in other method */
    public Object computeIfAbsent2(KParameter kParameter, Function<? super KParameter, ? extends Object> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: computeIfPresent, reason: avoid collision after fix types in other method */
    public Object computeIfPresent2(KParameter kParameter, BiFunction<? super KParameter, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: merge, reason: avoid collision after fix types in other method */
    public Object merge2(KParameter kParameter, Object obj, BiFunction<? super Object, ? super Object, ? extends Object> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public Object put2(KParameter kParameter, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: putIfAbsent, reason: avoid collision after fix types in other method */
    public Object putIfAbsent2(KParameter kParameter, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: replace, reason: avoid collision after fix types in other method */
    public Object replace2(KParameter kParameter, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(KParameter kParameter, Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: replace, reason: avoid collision after fix types in other method */
    public boolean replace2(KParameter kParameter, Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Nullable
    public Object get(@NotNull KParameter key) {
        key.getClass();
        return this.arguments[key.getIndex()];
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof KParameter) {
            return containsKey((KParameter) obj);
        }
        return false;
    }
}
