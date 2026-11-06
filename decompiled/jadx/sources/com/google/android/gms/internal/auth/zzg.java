package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.AccountChangeEventsRequest;
import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.tasks.Task;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public interface zzg extends HasApiKey {
    Task zza(zzbw zzbwVar);

    Task zzb(@NonNull AccountChangeEventsRequest accountChangeEventsRequest);

    Task zzc(@NonNull Account account, @NonNull String str, Bundle bundle);

    Task zzd(@NonNull Account account);

    Task zze(@NonNull String str);
}
