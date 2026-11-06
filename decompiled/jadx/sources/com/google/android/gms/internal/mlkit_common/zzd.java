package com.google.android.gms.internal.mlkit_common;

import android.content.Context;
import androidx.core.content.PermissionChecker;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzd extends zzk {
    @Override // com.google.android.gms.internal.mlkit_common.zzk
    public final int zza(Context context, zzj zzjVar, boolean z) {
        return (zzjVar.zza.getAuthority().lastIndexOf(64) < 0 || PermissionChecker.checkSelfPermission(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2;
    }
}
