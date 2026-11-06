package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzo extends zzp<Void> {
    public zzo(int i, int i2, Bundle bundle) {
        super(i, 2, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzp
    public final void zza(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            zzd(null);
        } else {
            zzc(new zzq(4, "Invalid response to one way request", null));
        }
    }

    @Override // com.google.android.gms.cloudmessaging.zzp
    public final boolean zzb() {
        return true;
    }
}
