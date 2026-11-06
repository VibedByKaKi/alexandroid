package com.google.android.gms.internal.fido;

import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzee {
    private static final zzeg zza = zzb(zzeg.zzd);

    private static zzeg zzb(String[] strArr) {
        zzeg zzegVar;
        try {
            zzegVar = zzeh.zza();
        } catch (NoClassDefFoundError unused) {
            zzegVar = null;
        }
        if (zzegVar != null) {
            return zzegVar;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            try {
                return (zzeg) Class.forName(str).getConstructor(null).newInstance(null);
            } catch (Throwable th) {
                th = th;
                if (th instanceof InvocationTargetException) {
                    th = th.getCause();
                }
                sb.append('\n');
                sb.append(str);
                sb.append(": ");
                sb.append(th);
            }
        }
        throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
    }
}
