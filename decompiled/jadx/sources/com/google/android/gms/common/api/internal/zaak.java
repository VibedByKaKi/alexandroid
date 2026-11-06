package com.google.android.gms.common.api.internal;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zaak implements Runnable {
    final /* synthetic */ zaaw zaa;

    public zaak(zaaw zaawVar) {
        this.zaa = zaawVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        GoogleApiAvailabilityLight googleApiAvailabilityLight;
        Context context;
        zaaw zaawVar = this.zaa;
        googleApiAvailabilityLight = zaawVar.zad;
        context = zaawVar.zac;
        googleApiAvailabilityLight.cancelAvailabilityErrorNotifications(context);
    }
}
