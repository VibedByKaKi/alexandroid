package com.facebook.common.memory;

import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class NoOpMemoryTrimmableRegistry implements MemoryTrimmableRegistry {

    @Nullable
    private static NoOpMemoryTrimmableRegistry sInstance;

    public static synchronized NoOpMemoryTrimmableRegistry getInstance() {
        NoOpMemoryTrimmableRegistry noOpMemoryTrimmableRegistry;
        synchronized (NoOpMemoryTrimmableRegistry.class) {
            try {
                if (sInstance == null) {
                    sInstance = new NoOpMemoryTrimmableRegistry();
                }
                noOpMemoryTrimmableRegistry = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return noOpMemoryTrimmableRegistry;
    }

    @Override // com.facebook.common.memory.MemoryTrimmableRegistry
    public void registerMemoryTrimmable(MemoryTrimmable memoryTrimmable) {
    }

    @Override // com.facebook.common.memory.MemoryTrimmableRegistry
    public void unregisterMemoryTrimmable(MemoryTrimmable memoryTrimmable) {
    }
}
