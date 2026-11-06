package com.amazon.identity.auth.device;

import com.amazon.identity.auth.device.framework.MAPSmsReceiver;
import com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommon;
import com.amazon.identity.mobi.common.utils.json.JSONUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class jf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f749a;
    public final /* synthetic */ uf b;

    public jf(uf ufVar, String str) {
        this.b = ufVar;
        this.f749a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        try {
            JSONObject validJson = JSONUtils.getValidJson(this.f749a);
            uf ufVar = this.b;
            yn ynVar = ufVar.g;
            if (ynVar == null) {
                ufVar.loadCallbackFunction("mapJSCallback", validJson.toString(), JavaScriptBridgeCommon.NOT_SUPPORTED_ERROR);
                return;
            }
            Cif cif = new Cif(this, validJson);
            ynVar.c = cif;
            MAPSmsReceiver mAPSmsReceiver = ynVar.b;
            if (mAPSmsReceiver != null && ynVar.d) {
                mAPSmsReceiver.a(ynVar.f1097a, ynVar);
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isRegistered", false);
                jSONObject.put("sms", "");
                str = jSONObject.toString();
            } catch (JSONException unused) {
                str = JavaScriptBridgeCommon.GENERAL_ERROR;
            }
            cif.b.b.loadCallbackFunction("mapJSCallback", cif.f725a.toString(), str);
            ynVar.c = null;
            MAPSmsReceiver mAPSmsReceiver2 = ynVar.b;
            if (mAPSmsReceiver2 == null || !ynVar.d) {
                return;
            }
            mAPSmsReceiver2.b(ynVar.f1097a);
        } catch (JSONException unused2) {
            this.b.loadCallbackFunction("mapJSCallback", "\"Invalid JSON Input\"", JavaScriptBridgeCommon.INPUT_ERROR);
        }
    }
}
