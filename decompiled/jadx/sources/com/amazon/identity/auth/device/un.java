package com.amazon.identity.auth.device;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.amazon.identity.auth.accounts.SessionUserChangedToAccountForPackageChangedAdpater;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class un implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f1011a;

    public un(Context context) {
        this.f1011a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yf.a("SessionUserChangedToAccountForPackageChangedAdpater");
        String str = Build.TYPE;
        "user".equalsIgnoreCase(str);
        tn a2 = tn.a(this.f1011a);
        hl hlVar = (hl) a2.getSystemService("sso_platform");
        int i = SessionUserChangedToAccountForPackageChangedAdpater.f385a;
        if (!gl.l(hlVar.f707a)) {
            yf.a("SessionUserChangedToAccountForPackageChangedAdpater");
            "user".equalsIgnoreCase(str);
            return;
        }
        List list = b2.f526a;
        a2.getPackageName();
        yf.a("AccountStateBroadcasts");
        "user".equalsIgnoreCase(str);
        ne.a(a2, new MAPAccountManager(a2).getAccount());
        sg.a(a2).a(null, new Intent(MAPAccountManager.ACCOUNT_FOR_PACKAGE_HAS_CHANGED_INTENT_ACTION), "com.amazon.dcp.sso.permission.account.changed");
    }
}
