package com.google.android.gms.internal.identity_credentials;

import com.google.android.gms.common.Feature;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zze {
    public static final Feature zza;
    public static final Feature zzb;
    public static final Feature zzc;
    public static final Feature[] zzd;

    static {
        Feature feature = new Feature("GET_CREDENTIAL", 1L);
        zza = feature;
        Feature feature2 = new Feature("CREDENTIAL_REGISTRY", 1L);
        zzb = feature2;
        Feature feature3 = new Feature("CLEAR_REGISTRY", 1L);
        zzc = feature3;
        zzd = new Feature[]{feature, feature2, feature3};
    }
}
