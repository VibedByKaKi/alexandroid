package com.amazon.identity.auth.device;

import android.util.Log;
import com.amazon.identity.mobi.common.javascript.Promise;
import com.google.android.gms.tasks.OnSuccessListener;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ue implements OnSuccessListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f1007a;
    public final /* synthetic */ Promise b;

    public ue(Promise promise, JSONObject jSONObject) {
        this.f1007a = jSONObject;
        this.b = promise;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.String] */
    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        Boolean bool = (Boolean) obj;
        try {
            try {
                Log.i(yf.a("MAPCentralJSBridgeV2"), "checkIsUVPAAvailable onSuccess called with result " + bool.toString());
                this.f1007a.getJSONObject("platformInfo").put("isUserVerifyingPlatformAuthenticatorAvailable", bool.booleanValue());
            } catch (Exception e) {
                Log.e(yf.a("MAPCentralJSBridgeV2"), "checkIsUVPAAvailable onSuccess called with error", e);
            }
        } finally {
            this.b.setResult(this.f1007a.toString());
        }
    }
}
