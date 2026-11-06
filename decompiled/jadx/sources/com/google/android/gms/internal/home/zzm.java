package com.google.android.gms.internal.home;

import androidx.annotation.ChecksSdkIntAtLeast;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzm {
    public static ApiException zza() {
        return new ApiException(new Status(10, "API is not supported on this platform. Requires API 27 or higher."));
    }

    @ChecksSdkIntAtLeast(api = 27)
    public static boolean zzb() {
        return true;
    }
}
