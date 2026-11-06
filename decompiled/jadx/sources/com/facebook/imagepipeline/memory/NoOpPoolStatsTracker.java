package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Nullsafe(Nullsafe.Mode.LOCAL)
/* loaded from: classes6.dex */
public class NoOpPoolStatsTracker implements PoolStatsTracker {

    @Nullable
    private static NoOpPoolStatsTracker sInstance;

    private NoOpPoolStatsTracker() {
    }

    public static synchronized NoOpPoolStatsTracker getInstance() {
        NoOpPoolStatsTracker noOpPoolStatsTracker;
        synchronized (NoOpPoolStatsTracker.class) {
            try {
                if (sInstance == null) {
                    sInstance = new NoOpPoolStatsTracker();
                }
                noOpPoolStatsTracker = sInstance;
            } catch (Throwable th) {
                throw th;
            }
        }
        return noOpPoolStatsTracker;
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    public void onHardCapReached() {
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    public void onSoftCapReached() {
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    public void onAlloc(int i) {
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    public void onFree(int i) {
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    public void onValueRelease(int i) {
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    public void onValueReuse(int i) {
    }

    @Override // com.facebook.imagepipeline.memory.PoolStatsTracker
    public void setBasePool(BasePool basePool) {
    }
}
