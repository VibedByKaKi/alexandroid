package com.google.android.gms.internal.mlkit_vision_common;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzmf implements zzmc {

    @VisibleForTesting
    final List zza;

    public zzmf(Context context, zzme zzmeVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zzmeVar.zzc()) {
            arrayList.add(new zzmp(context, zzmeVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_common.zzmc
    public final void zza(zzmb zzmbVar) {
        Iterator it2 = this.zza.iterator();
        while (it2.hasNext()) {
            ((zzmc) it2.next()).zza(zzmbVar);
        }
    }
}
