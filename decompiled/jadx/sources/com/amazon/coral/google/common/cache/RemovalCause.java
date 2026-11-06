package com.amazon.coral.google.common.cache;

import com.amazon.coral.google.common.annotations.GwtCompatible;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes19.dex */
public enum RemovalCause {
    EXPLICIT { // from class: com.amazon.coral.google.common.cache.RemovalCause.1
        @Override // com.amazon.coral.google.common.cache.RemovalCause
        public boolean wasEvicted() {
            return false;
        }
    },
    REPLACED { // from class: com.amazon.coral.google.common.cache.RemovalCause.2
        @Override // com.amazon.coral.google.common.cache.RemovalCause
        public boolean wasEvicted() {
            return false;
        }
    },
    COLLECTED { // from class: com.amazon.coral.google.common.cache.RemovalCause.3
        @Override // com.amazon.coral.google.common.cache.RemovalCause
        public boolean wasEvicted() {
            return true;
        }
    },
    EXPIRED { // from class: com.amazon.coral.google.common.cache.RemovalCause.4
        @Override // com.amazon.coral.google.common.cache.RemovalCause
        public boolean wasEvicted() {
            return true;
        }
    },
    SIZE { // from class: com.amazon.coral.google.common.cache.RemovalCause.5
        @Override // com.amazon.coral.google.common.cache.RemovalCause
        public boolean wasEvicted() {
            return true;
        }
    };

    public abstract boolean wasEvicted();
}
