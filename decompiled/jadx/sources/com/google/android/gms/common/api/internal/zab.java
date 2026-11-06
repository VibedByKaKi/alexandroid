package com.google.android.gms.common.api.internal;

import androidx.annotation.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.ref.WeakReference;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zab extends ActivityLifecycleObserver {
    private final WeakReference zaa;

    @VisibleForTesting(otherwise = 2)
    public zab(zaa zaaVar) {
        this.zaa = new WeakReference(zaaVar);
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    @CanIgnoreReturnValue
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        zaa zaaVar = (zaa) this.zaa.get();
        if (zaaVar != null) {
            zaaVar.zac(runnable);
            return this;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("The target activity has already been GC'd");
        return null;
    }
}
