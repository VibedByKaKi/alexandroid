package com.google.android.gms.home.matter.settings;

import androidx.annotation.Nullable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.Arrays;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ShowFirstParty
/* loaded from: classes7.dex */
public final class zza implements Api.ApiOptions.HasGoogleSignInAccountOptions {

    @Nullable
    private final GoogleSignInAccount zza;

    public zza(@Nullable GoogleSignInAccount googleSignInAccount) {
        this.zza = googleSignInAccount;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zza)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = this.zza;
        GoogleSignInAccount googleSignInAccount2 = ((zza) obj).zza;
        if (googleSignInAccount != googleSignInAccount2) {
            return googleSignInAccount != null && googleSignInAccount.equals(googleSignInAccount2);
        }
        return true;
    }

    @Override // com.google.android.gms.common.api.Api.ApiOptions.HasGoogleSignInAccountOptions
    @Nullable
    public final GoogleSignInAccount getGoogleSignInAccount() {
        return this.zza;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza});
    }
}
