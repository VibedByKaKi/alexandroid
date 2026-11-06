package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentDiscovery;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.ComponentRuntime;
import com.google.mlkit.common.internal.MlKitComponentDiscoveryService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@KeepForSdk
/* loaded from: classes8.dex */
public class MlKitContext {
    private static final Object zza = new Object();

    @Nullable
    private static MlKitContext zzb;

    @Nullable
    private ComponentRuntime zzc;

    private MlKitContext() {
    }

    @NonNull
    @KeepForSdk
    public static MlKitContext getInstance() {
        MlKitContext mlKitContext;
        synchronized (zza) {
            Preconditions.checkState(zzb != null, "MlKitContext has not been initialized");
            mlKitContext = (MlKitContext) Preconditions.checkNotNull(zzb);
        }
        return mlKitContext;
    }

    @NonNull
    @KeepForSdk
    public static MlKitContext initialize(@NonNull Context context, @NonNull List<ComponentRegistrar> list) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            try {
                Preconditions.checkState(zzb == null, "MlKitContext is already initialized");
                MlKitContext mlKitContext2 = new MlKitContext();
                zzb = mlKitContext2;
                Context zzc = zzc(context);
                HashMap hashMap = new HashMap();
                for (ComponentRegistrar componentRegistrar : list) {
                    hashMap.put(componentRegistrar.getClass(), componentRegistrar);
                }
                ComponentRuntime componentRuntime = new ComponentRuntime(TaskExecutors.MAIN_THREAD, new ArrayList(hashMap.values()), Component.of(zzc, (Class<Context>) Context.class, (Class<? super Context>[]) new Class[0]), Component.of(mlKitContext2, (Class<MlKitContext>) MlKitContext.class, (Class<? super MlKitContext>[]) new Class[0]));
                mlKitContext2.zzc = componentRuntime;
                componentRuntime.initializeEagerComponents(true);
                mlKitContext = zzb;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mlKitContext;
    }

    @NonNull
    @KeepForSdk
    public static MlKitContext initializeIfNeeded(@NonNull Context context) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            mlKitContext = zzb;
            if (mlKitContext == null) {
                mlKitContext = zza(context);
            }
        }
        return mlKitContext;
    }

    @NonNull
    public static MlKitContext zza(@NonNull Context context) {
        MlKitContext zzb2;
        synchronized (zza) {
            zzb2 = zzb(context, TaskExecutors.MAIN_THREAD);
        }
        return zzb2;
    }

    @NonNull
    public static MlKitContext zzb(@NonNull Context context, @NonNull Executor executor) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            Preconditions.checkState(zzb == null, "MlKitContext is already initialized");
            MlKitContext mlKitContext2 = new MlKitContext();
            zzb = mlKitContext2;
            Context zzc = zzc(context);
            ComponentRuntime build = ComponentRuntime.builder(executor).addLazyComponentRegistrars(ComponentDiscovery.forContext(zzc, MlKitComponentDiscoveryService.class).discoverLazy()).addComponent(Component.of(zzc, (Class<Context>) Context.class, (Class<? super Context>[]) new Class[0])).addComponent(Component.of(mlKitContext2, (Class<MlKitContext>) MlKitContext.class, (Class<? super MlKitContext>[]) new Class[0])).build();
            mlKitContext2.zzc = build;
            build.initializeEagerComponents(true);
            mlKitContext = zzb;
        }
        return mlKitContext;
    }

    private static Context zzc(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext != null ? applicationContext : context;
    }

    @NonNull
    @KeepForSdk
    public <T> T get(@NonNull Class<T> cls) {
        Preconditions.checkState(zzb == this, "MlKitContext has been deleted");
        Preconditions.checkNotNull(this.zzc);
        return (T) this.zzc.get(cls);
    }

    @NonNull
    @KeepForSdk
    public Context getApplicationContext() {
        return (Context) get(Context.class);
    }

    @NonNull
    @KeepForSdk
    public static MlKitContext initializeIfNeeded(@NonNull Context context, @NonNull List<ComponentRegistrar> list) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            mlKitContext = zzb;
            if (mlKitContext == null) {
                mlKitContext = initialize(context, list);
            }
        }
        return mlKitContext;
    }

    @NonNull
    @KeepForSdk
    public static MlKitContext initializeIfNeeded(@NonNull Context context, @NonNull Executor executor) {
        MlKitContext mlKitContext;
        synchronized (zza) {
            mlKitContext = zzb;
            if (mlKitContext == null) {
                mlKitContext = zzb(context, executor);
            }
        }
        return mlKitContext;
    }
}
