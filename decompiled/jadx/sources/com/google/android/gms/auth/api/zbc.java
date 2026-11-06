package com.google.android.gms.auth.api;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Deprecated
/* loaded from: classes7.dex */
public final class zbc {
    protected Boolean zba;

    @Nullable
    protected String zbb;

    @ShowFirstParty
    public zbc(zbd zbdVar) {
        boolean z;
        String str;
        this.zba = Boolean.FALSE;
        zbd.zbb(zbdVar);
        z = zbdVar.zbc;
        this.zba = Boolean.valueOf(z);
        str = zbdVar.zbd;
        this.zbb = str;
    }

    @ShowFirstParty
    public final zbc zba(String str) {
        this.zbb = str;
        return this;
    }

    public zbc() {
        this.zba = Boolean.FALSE;
    }
}
