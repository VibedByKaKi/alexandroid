package com.google.android.play.core.appupdate;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzab {
    private zzi zza;

    public /* synthetic */ zzab(zzaa zzaaVar) {
    }

    public final zza zza() {
        zzi zziVar = this.zza;
        if (zziVar != null) {
            return new zzz(zziVar, null);
        }
        Single$$ExternalSyntheticBUOutline0.m$2(String.valueOf(zzi.class.getCanonicalName()).concat(" must be set"));
        return null;
    }

    public final zzab zzb(zzi zziVar) {
        this.zza = zziVar;
        return this;
    }

    private zzab() {
    }
}
