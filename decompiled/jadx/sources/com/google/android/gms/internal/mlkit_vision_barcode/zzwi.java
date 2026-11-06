package com.google.android.gms.internal.mlkit_vision_barcode;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzwi implements zzwf {

    @VisibleForTesting
    final List zza;

    public zzwi(Context context, zzwh zzwhVar) {
        ArrayList arrayList = new ArrayList();
        this.zza = arrayList;
        if (zzwhVar.zzc()) {
            arrayList.add(new zzwx(context, zzwhVar));
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode.zzwf
    public final void zza(zzwe zzweVar) {
        Iterator it2 = this.zza.iterator();
        while (it2.hasNext()) {
            ((zzwf) it2.next()).zza(zzweVar);
        }
    }
}
