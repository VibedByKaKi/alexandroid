package com.google.android.gms.auth.api;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes7.dex */
public final class zbd implements Api.ApiOptions.Optional {
    public static final zbd zba = new zbd(new zbc());
    private final String zbb = null;
    private final boolean zbc;

    @Nullable
    private final String zbd;

    public zbd(zbc zbcVar) {
        this.zbc = zbcVar.zba.booleanValue();
        this.zbd = zbcVar.zbb;
    }

    public static /* bridge */ /* synthetic */ String zbb(zbd zbdVar) {
        String str = zbdVar.zbb;
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zbd)) {
            return false;
        }
        zbd zbdVar = (zbd) obj;
        return Objects.equal(null, null) && this.zbc == zbdVar.zbc && Objects.equal(this.zbd, zbdVar.zbd);
    }

    public final int hashCode() {
        return Objects.hashCode(null, Boolean.valueOf(this.zbc), this.zbd);
    }

    public final Bundle zba() {
        Bundle m = ParcelCompat$$ExternalSyntheticOutline0.m("consumer_package", (String) null);
        m.putBoolean("force_save_dialog", this.zbc);
        m.putString("log_session_id", this.zbd);
        return m;
    }
}
