package com.google.android.gms.internal.auth;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.collection.ArrayMap;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zzcr {

    @GuardedBy("PhenotypeConstants.class")
    private static final ArrayMap zza = new ArrayMap();

    public static synchronized Uri zza(String str) {
        synchronized (zzcr.class) {
            ArrayMap arrayMap = zza;
            Uri uri = (Uri) arrayMap.get("com.google.android.gms.auth_account");
            if (uri != null) {
                return uri;
            }
            Uri parse = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
            arrayMap.put("com.google.android.gms.auth_account", parse);
            return parse;
        }
    }
}
