package com.google.android.gms.internal.fido;

import androidx.core.app.AppLaunchChecker$$ExternalSyntheticOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzfo implements zzfn {
    @Override // com.google.android.gms.internal.fido.zzfn
    public final StackTraceElement zza(Class cls, int i) {
        StackTraceElement[] m = AppLaunchChecker$$ExternalSyntheticOutline0.m();
        String name = cls.getName();
        int i2 = 3;
        boolean z = false;
        while (true) {
            if (i2 >= m.length) {
                i2 = -1;
                break;
            }
            if (m[i2].getClassName().equals(name)) {
                z = true;
            } else {
                if (z) {
                    break;
                }
                z = false;
            }
            i2++;
        }
        if (i2 != -1) {
            return m[i2];
        }
        return null;
    }
}
