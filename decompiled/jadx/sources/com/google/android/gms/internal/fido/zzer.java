package com.google.android.gms.internal.fido;

import java.util.Set;
import java.util.logging.Level;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzer implements zzek {
    private final String zza;
    private final zzdn zzb;
    private final Level zzc;
    private final Set zzd;
    private final zzea zze;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private zzer() {
        /*
            r8 = this;
            com.google.android.gms.internal.fido.zzdo r3 = com.google.android.gms.internal.fido.zzdo.NO_OP
            java.util.logging.Level r4 = java.util.logging.Level.ALL
            java.util.Set r6 = com.google.android.gms.internal.fido.zzeu.zzd()
            com.google.android.gms.internal.fido.zzea r7 = com.google.android.gms.internal.fido.zzeu.zzb()
            r2 = 1
            r5 = 0
            java.lang.String r1 = ""
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzer.<init>():void");
    }

    @Override // com.google.android.gms.internal.fido.zzek
    public final zzdp zza(String str) {
        return new zzeu(this.zza, str, true, this.zzb, this.zzc, this.zzd, this.zze, null);
    }

    public final zzer zzb(boolean z) {
        Set set = this.zzd;
        zzea zzeaVar = this.zze;
        return new zzer(this.zza, true, this.zzb, Level.OFF, false, set, zzeaVar);
    }

    private zzer(String str, boolean z, zzdn zzdnVar, Level level, boolean z2, Set set, zzea zzeaVar) {
        this.zza = "";
        this.zzb = zzdnVar;
        this.zzc = level;
        this.zzd = set;
        this.zze = zzeaVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ zzer(com.google.android.gms.internal.fido.zzeq r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.fido.zzdo r3 = com.google.android.gms.internal.fido.zzdo.NO_OP
            java.util.logging.Level r4 = java.util.logging.Level.ALL
            java.util.Set r6 = com.google.android.gms.internal.fido.zzeu.zzd()
            com.google.android.gms.internal.fido.zzea r7 = com.google.android.gms.internal.fido.zzeu.zzb()
            r2 = 1
            r5 = 0
            java.lang.String r1 = ""
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.fido.zzer.<init>(com.google.android.gms.internal.fido.zzeq):void");
    }
}
