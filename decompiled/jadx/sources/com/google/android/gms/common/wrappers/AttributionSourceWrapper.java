package com.google.android.gms.common.wrappers;

import android.content.AttributionSource;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@KeepForSdk
/* loaded from: classes7.dex */
public final class AttributionSourceWrapper {

    @Nullable
    private final AttributionSource zza;

    @KeepForSdk
    public AttributionSourceWrapper(@Nullable AttributionSource attributionSource) {
        this.zza = attributionSource;
    }

    @Nullable
    @KeepForSdk
    public AttributionSource getAttributionSource() {
        return this.zza;
    }
}
