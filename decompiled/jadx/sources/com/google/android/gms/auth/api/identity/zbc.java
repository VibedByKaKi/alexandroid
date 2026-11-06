package com.google.android.gms.auth.api.identity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class zbc implements Api.ApiOptions.Optional {
    private final String zba;

    public zbc(String str) {
        this.zba = str;
    }

    public final boolean equals(@Nullable Object obj) {
        return obj instanceof zbc;
    }

    public final int hashCode() {
        return Objects.hashCode(zbc.class);
    }

    public final Bundle zba() {
        Bundle bundle = new Bundle();
        bundle.putString("session_id", this.zba);
        return bundle;
    }

    public final String zbb() {
        return this.zba;
    }
}
