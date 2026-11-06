package com.amazon.identity.auth.device;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.identity.auth.device.api.AccountMigrationCallbackV2;
import com.amazon.identity.auth.device.utils.AccountConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class vh implements AccountMigrationCallbackV2 {

    /* renamed from: a, reason: collision with root package name */
    public final nq f1030a;
    public final AccountMigrationCallbackV2 b;
    public final fl c;

    public vh(nq nqVar, AccountMigrationCallbackV2 accountMigrationCallbackV2) {
        this.f1030a = nqVar;
        this.b = accountMigrationCallbackV2;
        this.c = jg.b("BeginAccountMigrationWithUIV2.Total", wh.a(nqVar));
    }

    @Override // com.amazon.identity.auth.device.api.AccountMigrationCallbackV2
    public final void onAccountMigrationComplete(Bundle bundle) {
        try {
            this.c.a();
            String string = bundle != null ? bundle.getString("transition_status") : null;
            if (AccountConstants.P2A_STATUS_MIGRATION_COMPLETED.equals(string)) {
                nq nqVar = this.f1030a;
                String concat = "BeginAccountMigrationWithUIV2.Success:".concat(wh.a(nqVar));
                yf.a("P2AMetrics");
                "user".equalsIgnoreCase(Build.TYPE);
                nqVar.a(concat);
                nqVar.a(true);
                nqVar.a();
            } else {
                String string2 = bundle != null ? bundle.getString("com.amazon.identity.auth.p2a.failure_reason") : null;
                if (string2 == null) {
                    Log.e(yf.a("P2AMetrics"), "P2A failure result missing com.amazon.identity.auth.p2a.failure_reason; emitting UNKNOWN (status=" + string + MarkdownConstants.RIGHT_PARENTHESIS);
                }
                nq nqVar2 = this.f1030a;
                if (string2 == null) {
                    string2 = "UNKNOWN";
                }
                wh.a(nqVar2, string2);
            }
        } catch (RuntimeException e) {
            Log.w(yf.a("P2AMetrics"), "Failed to record P2A terminal metric", e);
        }
        if (bundle != null) {
            bundle.remove("com.amazon.identity.auth.p2a.failure_reason");
        }
        this.b.onAccountMigrationComplete(bundle);
    }
}
