package com.amazon.identity.auth.device;

import android.util.Log;
import com.amazon.identity.mobi.common.javascript.Promise;
import com.google.android.gms.tasks.OnFailureListener;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ve implements OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Promise f1028a;
    public final /* synthetic */ JSONObject b;

    public ve(Promise promise, JSONObject jSONObject) {
        this.f1028a = promise;
        this.b = jSONObject;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Log.e(yf.a("MAPCentralJSBridgeV2"), "Call to checkIsUVPAAvailable failed with onFailure", exc);
        this.f1028a.setResult(this.b.toString());
    }
}
