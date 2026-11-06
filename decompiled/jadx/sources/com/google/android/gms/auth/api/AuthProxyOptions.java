package com.google.android.gms.auth.api;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ShowFirstParty
@KeepForSdk
/* loaded from: classes7.dex */
public final class AuthProxyOptions implements Api.ApiOptions.Optional {

    @NonNull
    public static final AuthProxyOptions zza = new AuthProxyOptions(new Bundle(), null);
    private final Bundle zzb;

    public /* synthetic */ AuthProxyOptions(Bundle bundle, zzb zzbVar) {
        this.zzb = bundle;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AuthProxyOptions) {
            return Objects.checkBundlesEquality(this.zzb, ((AuthProxyOptions) obj).zzb);
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.zzb);
    }

    @NonNull
    public final Bundle zza() {
        return new Bundle(this.zzb);
    }
}
