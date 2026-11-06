package com.amazon.identity.auth.device;

import android.os.Bundle;
import com.amazon.alexa.app.notification.util.PayloadUtils;
import com.amazon.identity.auth.device.api.Callback;
import com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommon;
import com.amazon.identity.mobi.common.javascript.Promise;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class f6 implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Promise f613a;

    public f6(Promise promise) {
        this.f613a = promise;
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onError(Bundle bundle) {
        try {
            this.f613a.setResultWithError(bundle.getString("error"), bundle.getString("errorMessage"));
        } catch (Exception unused) {
            this.f613a.setResultWithError(JavaScriptBridgeCommon.GENERAL_ERROR, "Exception occurred while calling Fido API");
        }
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onSuccess(Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("authenticatorData", bundle.containsKey("authenticatorData") ? bundle.getString("authenticatorData") : null);
            jSONObject.put("clientDataJson", bundle.containsKey("clientDataJson") ? bundle.getString("clientDataJson") : null);
            jSONObject.put("credentialId", bundle.containsKey("credentialId") ? bundle.getString("credentialId") : null);
            jSONObject.put(PayloadUtils.PayloadKeys.SIGNATURE, bundle.containsKey(PayloadUtils.PayloadKeys.SIGNATURE) ? bundle.getString(PayloadUtils.PayloadKeys.SIGNATURE) : null);
            jSONObject.put("userHandle", bundle.containsKey("userHandle") ? bundle.getString("userHandle") : null);
            this.f613a.setResult(jSONObject.toString());
        } catch (JSONException unused) {
            this.f613a.setResultWithError(JavaScriptBridgeCommon.GENERAL_ERROR, "JSONException occurred while parsing Fido API response");
        } catch (Exception unused2) {
            this.f613a.setResultWithError(JavaScriptBridgeCommon.GENERAL_ERROR, "Exception occurred while calling Fido API");
        }
    }
}
