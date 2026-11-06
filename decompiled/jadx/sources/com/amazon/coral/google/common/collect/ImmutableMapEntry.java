package com.amazon.coral.google.common.collect;

import com.amazon.coral.google.common.annotations.GwtIncompatible;
import javax.annotation.CheckForNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
class ImmutableMapEntry<K, V> extends ImmutableEntry<K, V> {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class NonTerminalImmutableBiMapEntry<K, V> extends NonTerminalImmutableMapEntry<K, V> {

        @CheckForNull
        private final transient ImmutableMapEntry<K, V> nextInValueBucket;

        public NonTerminalImmutableBiMapEntry(K k, V v, @CheckForNull ImmutableMapEntry<K, V> immutableMapEntry, @CheckForNull ImmutableMapEntry<K, V> immutableMapEntry2) {
            super(k, v, immutableMapEntry);
            this.nextInValueBucket = immutableMapEntry2;
        }

        @Override // com.amazon.coral.google.common.collect.ImmutableMapEntry
        @CheckForNull
        public ImmutableMapEntry<K, V> getNextInValueBucket() {
            return this.nextInValueBucket;
        }
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class NonTerminalImmutableMapEntry<K, V> extends ImmutableMapEntry<K, V> {

        @CheckForNull
        private final transient ImmutableMapEntry<K, V> nextInKeyBucket;

        public NonTerminalImmutableMapEntry(K k, V v, @CheckForNull ImmutableMapEntry<K, V> immutableMapEntry) {
            super(k, v);
            this.nextInKeyBucket = immutableMapEntry;
        }

        @Override // com.amazon.coral.google.common.collect.ImmutableMapEntry
        @CheckForNull
        public final ImmutableMapEntry<K, V> getNextInKeyBucket() {
            return this.nextInKeyBucket;
        }

        @Override // com.amazon.coral.google.common.collect.ImmutableMapEntry
        public final boolean isReusable() {
            return false;
        }
    }

    public ImmutableMapEntry(ImmutableMapEntry<K, V> immutableMapEntry) {
        super(immutableMapEntry.getKey(), immutableMapEntry.getValue());
    }

    public static <K, V> ImmutableMapEntry<K, V>[] createEntryArray(int i) {
        return new ImmutableMapEntry[i];
    }

    @CheckForNull
    public ImmutableMapEntry<K, V> getNextInKeyBucket() {
        return null;
    }

    @CheckForNull
    public ImmutableMapEntry<K, V> getNextInValueBucket() {
        return null;
    }

    public boolean isReusable() {
        return true;
    }

    public ImmutableMapEntry(K k, V v) {
        super(k, v);
        CollectPreconditions.checkEntryNotNull(k, v);
    }
}
