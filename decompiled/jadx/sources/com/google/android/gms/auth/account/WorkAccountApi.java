package com.google.android.gms.auth.account;

import android.accounts.Account;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes7.dex */
public interface WorkAccountApi {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Deprecated
    public interface AddAccountResult extends Result {
        @NonNull
        Account getAccount();
    }

    @NonNull
    @Deprecated
    PendingResult<AddAccountResult> addWorkAccount(@NonNull GoogleApiClient googleApiClient, @NonNull String str);

    @NonNull
    @Deprecated
    PendingResult<Result> removeWorkAccount(@NonNull GoogleApiClient googleApiClient, @NonNull Account account);

    @Deprecated
    void setWorkAuthenticatorEnabled(@NonNull GoogleApiClient googleApiClient, boolean z);

    @NonNull
    @Deprecated
    PendingResult<Result> setWorkAuthenticatorEnabledWithResult(@NonNull GoogleApiClient googleApiClient, boolean z);
}
