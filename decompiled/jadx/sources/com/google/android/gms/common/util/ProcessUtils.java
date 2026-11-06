package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Process;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.internal.common.zzj;
import com.google.android.gms.internal.common.zzx;
import com.google.android.gms.internal.common.zzy;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@KeepForSdk
/* loaded from: classes7.dex */
public class ProcessUtils {

    @Nullable
    private static String zza;
    private static int zzb;

    @Nullable
    private static Boolean zzc;

    private ProcessUtils() {
    }

    @androidx.annotation.Nullable
    @KeepForSdk
    public static String getMyProcessName() {
        if (zza == null) {
            zza = Application.getProcessName();
        }
        return zza;
    }

    public static boolean zza() {
        Boolean bool = zzc;
        if (bool == null) {
            if (PlatformVersion.isAtLeastP()) {
                bool = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object zza2 = zzj.zza(Process.class, "isIsolated", new zzi[0]);
                    Object[] objArr = new Object[0];
                    if (zza2 == null) {
                        throw new zzy(zzx.zza("expected a non-null reference", objArr));
                    }
                    bool = (Boolean) zza2;
                } catch (ReflectiveOperationException unused) {
                    bool = Boolean.FALSE;
                }
            }
            zzc = bool;
        }
        return bool.booleanValue();
    }
}
