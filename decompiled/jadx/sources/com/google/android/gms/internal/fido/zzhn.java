package com.google.android.gms.internal.fido;

import com.amazon.rtcsc.service.deviceconfiguration.util.DeviceConfigConstants;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzhn extends zzhp {
    private final String zza;

    public zzhn(String str) {
        this.zza = str;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzhp zzhpVar = (zzhp) obj;
        if (zzhp.zzd((byte) 96) != zzhpVar.zza()) {
            return zzhp.zzd((byte) 96) - zzhpVar.zza();
        }
        String str = this.zza;
        String str2 = ((zzhn) zzhpVar).zza;
        if (str.length() == str2.length()) {
            return str.compareTo(str2);
        }
        return str.length() - str2.length();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzhn.class == obj.getClass()) {
            return this.zza.equals(((zzhn) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(zzhp.zzd((byte) 96)), this.zza});
    }

    public final String toString() {
        return a$$ExternalSyntheticOutline0.m(new StringBuilder(DeviceConfigConstants.DOUBLE_QUOTE), this.zza, DeviceConfigConstants.DOUBLE_QUOTE);
    }

    @Override // com.google.android.gms.internal.fido.zzhp
    public final int zza() {
        return zzhp.zzd((byte) 96);
    }
}
