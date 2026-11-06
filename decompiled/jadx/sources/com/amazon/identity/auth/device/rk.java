package com.amazon.identity.auth.device;

import android.os.Bundle;
import android.util.Log;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import com.amazon.identity.mobi.common.javascript.AsyncJavaScriptCall;
import com.amazon.identity.mobi.common.javascript.Promise;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class rk implements AsyncJavaScriptCall {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f922a;
    public final /* synthetic */ uk b;

    public rk(uk ukVar, String str) {
        this.b = ukVar;
        this.f922a = str;
    }

    @Override // com.amazon.identity.mobi.common.javascript.AsyncJavaScriptCall
    public final void run(JSONObject jSONObject, Promise promise, String str) {
        Bundle bundle;
        Log.i(yf.a("PhoneNumberAutoFillBridge"), "getPhoneNumberFromNative invoked");
        try {
            Bundle bundle2 = this.b.d;
            this.b.loadCallbackFunction("mapJSCallbackV2", this.f922a, new JSONObject().putOpt("phoneNumber", (bundle2 == null || (bundle = bundle2.getBundle(MAPAccountManager.AuthPortalOptions.KEY_REQUEST_PARAMETERS)) == null) ? null : bundle.getString("phoneNumber")).toString());
        } catch (JSONException unused) {
            this.b.loadCallbackFunctionWithErrorMessage("mapJSCallbackV2", this.f922a, "InternalError", "Parsing Error Occurred");
        }
    }
}
