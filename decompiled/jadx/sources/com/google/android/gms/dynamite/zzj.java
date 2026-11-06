package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
final class zzj implements DynamiteModule.VersionPolicy {
    @Override // com.google.android.gms.dynamite.DynamiteModule.VersionPolicy
    public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context context, String str, DynamiteModule.VersionPolicy.IVersions iVersions) throws DynamiteModule.LoadingException {
        DynamiteModule.VersionPolicy.SelectionResult selectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
        selectionResult.localVersion = iVersions.zzb(context, str);
        int i = 1;
        int zza = iVersions.zza(context, str, true);
        selectionResult.remoteVersion = zza;
        int i2 = selectionResult.localVersion;
        if (i2 == 0) {
            i2 = 0;
            if (zza == 0) {
                i = 0;
                selectionResult.selection = i;
                return selectionResult;
            }
        }
        if (i2 >= zza) {
            i = -1;
        }
        selectionResult.selection = i;
        return selectionResult;
    }
}
