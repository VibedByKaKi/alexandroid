package com.google.android.gms.common;

import androidx.annotation.Nullable;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzv {
    private String zza = null;

    @Nullable
    private Boolean zzb = null;

    @Nullable
    private Boolean zzc = null;

    private zzv() {
    }

    public final zzv zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzv zzb(boolean z) {
        this.zzb = Boolean.valueOf(z);
        return this;
    }

    public final zzv zzc(boolean z) {
        this.zzc = Boolean.valueOf(z);
        return this;
    }

    public final zzw zzd() {
        Boolean bool = this.zzb;
        if (bool == null) {
            Single$$ExternalSyntheticBUOutline0.m$2("allowTestKeys must be set");
            return null;
        }
        if (this.zzc != null) {
            return new zzw(this.zza, bool.booleanValue(), false, false, this.zzc.booleanValue(), false, null);
        }
        Single$$ExternalSyntheticBUOutline0.m$2("isGoogleOrPlatformOnly must be set");
        return null;
    }

    public /* synthetic */ zzv(byte[] bArr) {
    }
}
