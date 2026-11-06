package com.google.mlkit.common.sdkinternal;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import defpackage.a$$ExternalSyntheticOutline0;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public class Cleaner {
    private final ReferenceQueue zza = new ReferenceQueue();
    private final Set zzb = a$$ExternalSyntheticOutline0.m();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Cleanable {
        @KeepForSdk
        void clean();
    }

    private Cleaner() {
    }

    @NonNull
    @KeepForSdk
    public static Cleaner create() {
        Cleaner cleaner = new Cleaner();
        cleaner.register(cleaner, new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zza
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = cleaner.zza;
        final Set set = cleaner.zzb;
        Thread thread = new Thread(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.zzb
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        ((zzd) referenceQueue2.remove()).clean();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return cleaner;
    }

    @NonNull
    @KeepForSdk
    public Cleanable register(@NonNull Object obj, @NonNull Runnable runnable) {
        zzd zzdVar = new zzd(obj, this.zza, this.zzb, runnable, null);
        this.zzb.add(zzdVar);
        return zzdVar;
    }
}
