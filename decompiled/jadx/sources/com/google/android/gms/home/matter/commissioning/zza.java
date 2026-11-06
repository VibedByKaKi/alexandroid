package com.google.android.gms.home.matter.commissioning;

import android.content.ComponentName;
import androidx.annotation.Nullable;
import com.google.android.gms.home.matter.commissioning.CommissioningRequest;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zza implements CommissioningRequest.Builder {
    private DeviceInfo zza;
    private String zzb;
    private String zzc;
    private ComponentName zzd;

    @Override // com.google.android.gms.home.matter.commissioning.CommissioningRequest.Builder
    public final CommissioningRequest build() {
        return new CommissioningRequest(null, null, this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.home.matter.commissioning.CommissioningRequest.Builder
    public final CommissioningRequest.Builder setCommissioningService(@Nullable ComponentName componentName) {
        this.zzd = componentName;
        return this;
    }

    @Override // com.google.android.gms.home.matter.commissioning.CommissioningRequest.Builder
    public final CommissioningRequest.Builder setDeviceInfo(@Nullable DeviceInfo deviceInfo) {
        this.zza = deviceInfo;
        return this;
    }

    @Override // com.google.android.gms.home.matter.commissioning.CommissioningRequest.Builder
    public final CommissioningRequest.Builder setDeviceNameHint(@Nullable String str) {
        this.zzc = str;
        return this;
    }

    @Override // com.google.android.gms.home.matter.commissioning.CommissioningRequest.Builder
    public final CommissioningRequest.Builder setOnboardingPayload(@Nullable String str) {
        this.zzb = str;
        return this;
    }
}
