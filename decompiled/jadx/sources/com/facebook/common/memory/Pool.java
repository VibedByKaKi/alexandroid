package com.facebook.common.memory;

import com.facebook.common.references.ResourceReleaser;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes6.dex */
public interface Pool<V> extends ResourceReleaser<V>, MemoryTrimmable {
    V get(int i);

    @Override // com.facebook.common.references.ResourceReleaser
    void release(V v);
}
