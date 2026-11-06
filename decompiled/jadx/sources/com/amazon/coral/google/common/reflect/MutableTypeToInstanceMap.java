package com.amazon.coral.google.common.reflect;

import com.amazon.coral.google.common.base.Preconditions;
import com.amazon.coral.google.common.collect.ForwardingMap;
import com.amazon.coral.google.common.collect.ForwardingMapEntry;
import com.amazon.coral.google.common.collect.ForwardingSet;
import com.amazon.coral.google.common.collect.Iterators;
import com.amazon.coral.google.common.collect.Maps;
import com.amazon.coral.google.errorprone.annotations.CanIgnoreReturnValue;
import com.amazon.coral.google.errorprone.annotations.DoNotCall;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public final class MutableTypeToInstanceMap<B> extends ForwardingMap<TypeToken<? extends B>, B> implements TypeToInstanceMap<B> {
    private final Map<TypeToken<? extends B>, B> backingMap = Maps.newHashMap();

    @CheckForNull
    private <T extends B> T trustedGet(TypeToken<T> typeToken) {
        return this.backingMap.get(typeToken);
    }

    @CheckForNull
    private <T extends B> T trustedPut(TypeToken<T> typeToken, T t) {
        return this.backingMap.put(typeToken, t);
    }

    @Override // com.amazon.coral.google.common.collect.ForwardingMap, java.util.Map
    public Set<Map.Entry<TypeToken<? extends B>, B>> entrySet() {
        return UnmodifiableEntry.transformEntries(super.entrySet());
    }

    @Override // com.amazon.coral.google.common.reflect.TypeToInstanceMap
    @CheckForNull
    public <T extends B> T getInstance(Class<T> cls) {
        return (T) trustedGet(TypeToken.of((Class) cls));
    }

    @CheckForNull
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public B put(TypeToken<? extends B> typeToken, B b) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.amazon.coral.google.common.collect.ForwardingMap, java.util.Map, com.amazon.coral.google.common.collect.BiMap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void putAll(Map<? extends TypeToken<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.amazon.coral.google.common.reflect.TypeToInstanceMap
    @CheckForNull
    @CanIgnoreReturnValue
    public <T extends B> T putInstance(Class<T> cls, T t) {
        return (T) trustedPut(TypeToken.of((Class) cls), t);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class UnmodifiableEntry<K, V> extends ForwardingMapEntry<K, V> {
        private final Map.Entry<K, V> delegate;

        public static /* synthetic */ UnmodifiableEntry $r8$lambda$JgaWrdgD1ILYwfpL0fcPiKI8hEY(Map.Entry entry) {
            return new UnmodifiableEntry(entry);
        }

        private UnmodifiableEntry(Map.Entry<K, V> entry) {
            this.delegate = (Map.Entry) Preconditions.checkNotNull(entry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <K, V> Iterator<Map.Entry<K, V>> transformEntries(Iterator<Map.Entry<K, V>> it2) {
            return Iterators.transform(it2, new MutableTypeToInstanceMap$UnmodifiableEntry$$ExternalSyntheticLambda0());
        }

        @Override // com.amazon.coral.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // com.amazon.coral.google.common.collect.ForwardingMapEntry, com.amazon.coral.google.common.collect.ForwardingObject
        public Map.Entry<K, V> delegate() {
            return this.delegate;
        }

        public static <K, V> Set<Map.Entry<K, V>> transformEntries(final Set<Map.Entry<K, V>> set) {
            return new ForwardingSet<Map.Entry<K, V>>() { // from class: com.amazon.coral.google.common.reflect.MutableTypeToInstanceMap.UnmodifiableEntry.1
                @Override // com.amazon.coral.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<K, V>> iterator() {
                    return UnmodifiableEntry.transformEntries(super.iterator());
                }

                @Override // com.amazon.coral.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
                public Object[] toArray() {
                    return standardToArray();
                }

                @Override // com.amazon.coral.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
                public <T> T[] toArray(T[] tArr) {
                    return (T[]) standardToArray(tArr);
                }

                @Override // com.amazon.coral.google.common.collect.ForwardingSet, com.amazon.coral.google.common.collect.ForwardingCollection, com.amazon.coral.google.common.collect.ForwardingObject
                public Set<Map.Entry<K, V>> delegate() {
                    return set;
                }
            };
        }
    }

    @Override // com.amazon.coral.google.common.collect.ForwardingMap, com.amazon.coral.google.common.collect.ForwardingObject
    public Map<TypeToken<? extends B>, B> delegate() {
        return this.backingMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.amazon.coral.google.common.collect.ForwardingMap, java.util.Map, com.amazon.coral.google.common.collect.BiMap
    @CheckForNull
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
        return put((TypeToken<? extends TypeToken<? extends B>>) obj, (TypeToken<? extends B>) obj2);
    }

    @Override // com.amazon.coral.google.common.reflect.TypeToInstanceMap
    @CheckForNull
    public <T extends B> T getInstance(TypeToken<T> typeToken) {
        return (T) trustedGet(typeToken.rejectTypeVariables());
    }

    @Override // com.amazon.coral.google.common.reflect.TypeToInstanceMap
    @CheckForNull
    @CanIgnoreReturnValue
    public <T extends B> T putInstance(TypeToken<T> typeToken, T t) {
        return (T) trustedPut(typeToken.rejectTypeVariables(), t);
    }
}
