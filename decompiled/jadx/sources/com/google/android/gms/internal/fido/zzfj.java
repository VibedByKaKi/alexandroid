package com.google.android.gms.internal.fido;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzfj {
    private static final String[] zza = {"com.google.common.flogger.util.StackWalkerStackGetter", "com.google.common.flogger.util.JavaLangAccessStackGetter"};
    private static final zzfn zzb;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.google.android.gms.internal.fido.zzfn] */
    static {
        zzfo zzfoVar;
        int i = 0;
        while (true) {
            if (i >= 2) {
                zzfoVar = new zzfo();
                break;
            }
            zzfoVar = null;
            try {
                zzfoVar = (zzfn) Class.forName(zza[i]).asSubclass(zzfn.class).getDeclaredConstructor(null).newInstance(null);
            } catch (Throwable unused) {
            }
            if (zzfoVar != null) {
                break;
            } else {
                i++;
            }
        }
        zzb = zzfoVar;
    }

    @NullableDecl
    public static StackTraceElement zza(Class cls, int i) {
        zzfk.zza(cls, "target");
        return zzb.zza(cls, 2);
    }
}
