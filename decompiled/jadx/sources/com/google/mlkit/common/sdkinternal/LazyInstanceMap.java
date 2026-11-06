package com.google.mlkit.common.sdkinternal;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@KeepForSdk
/* loaded from: classes8.dex */
public abstract class LazyInstanceMap<K, V> {

    @GuardedBy("instances")
    private final Map zza = new HashMap();

    @NonNull
    @KeepForSdk
    public abstract V create(@NonNull K k);

    @NonNull
    @KeepForSdk
    public V get(@NonNull K k) {
        synchronized (this.zza) {
            try {
                if (this.zza.containsKey(k)) {
                    return (V) this.zza.get(k);
                }
                V create = create(k);
                this.zza.put(k, create);
                return create;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
