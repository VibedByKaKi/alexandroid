package com.google.android.gms.internal.playcore_age_signals;

import android.os.IBinder;
import com.google.android.play.agesignals.protocol.IAgeSignalsService;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzk extends zze {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzm zzb;

    public zzk(zzm zzmVar, IBinder iBinder) {
        this.zza = iBinder;
        Objects.requireNonNull(zzmVar);
        this.zzb = zzmVar;
    }

    @Override // com.google.android.gms.internal.playcore_age_signals.zze
    public final void zzb() {
        List list;
        List list2;
        IAgeSignalsService asInterface = IAgeSignalsService.Stub.asInterface(this.zza);
        zzo zzoVar = this.zzb.zza;
        zzoVar.zzn = asInterface;
        zzo.zzr(zzoVar);
        zzoVar.zzh = false;
        list = zzoVar.zze;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((Runnable) it2.next()).run();
        }
        list2 = zzoVar.zze;
        list2.clear();
    }
}
