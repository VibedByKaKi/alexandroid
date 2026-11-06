package com.google.android.play.core.appupdate;

import com.google.android.play.core.appupdate.AppUpdateOptions;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzv extends AppUpdateOptions.Builder {
    private int zza;
    private boolean zzb;
    private byte zzc;

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final AppUpdateOptions build() {
        if (this.zzc == 3) {
            return new zzx(this.zza, this.zzb, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb.append(" appUpdateType");
        }
        if ((this.zzc & 2) == 0) {
            sb.append(" allowAssetPackDeletion");
        }
        Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(sb.toString()));
        return null;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final AppUpdateOptions.Builder setAllowAssetPackDeletion(boolean z) {
        this.zzb = z;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.play.core.appupdate.AppUpdateOptions.Builder
    public final AppUpdateOptions.Builder setAppUpdateType(int i) {
        this.zza = i;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }
}
