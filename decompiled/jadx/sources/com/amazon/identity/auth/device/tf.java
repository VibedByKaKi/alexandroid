package com.amazon.identity.auth.device;

import android.content.pm.PackageManager;
import android.util.Log;
import com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommon;
import com.amazon.identity.mobi.common.utils.json.JSONUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class tf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f975a;
    public final /* synthetic */ uf b;

    public tf(uf ufVar, String str) {
        this.b = ufVar;
        this.f975a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        try {
            JSONObject validJson = JSONUtils.getValidJson(this.f975a);
            uf ufVar = this.b;
            yn ynVar = ufVar.g;
            if (ynVar == null) {
                ufVar.loadCallbackFunction("mapJSCallback", validJson.toString(), JavaScriptBridgeCommon.NOT_SUPPORTED_ERROR);
                return;
            }
            sf sfVar = new sf(this, validJson);
            boolean z = ynVar.d;
            String str2 = "";
            if (z) {
                try {
                    String a2 = l4.a(pq.a(ynVar.f1097a.getPackageName(), 64, ynVar.f1097a.getPackageManager()));
                    Log.i(yf.a("SmsRetrieverManager"), "appSmsHash =  " + a2);
                    str2 = a2;
                } catch (PackageManager.NameNotFoundException unused) {
                    Log.e(yf.a("SmsRetrieverManager"), "NameNotFoundException when getting packageInfo for appSmsHash");
                }
            }
            zn znVar = new zn(z, str2);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isSupported", znVar.f1113a);
                String str3 = znVar.b;
                if (str3 != null) {
                    jSONObject.put("appHash", str3);
                }
                str = jSONObject.toString();
            } catch (JSONException unused2) {
                str = JavaScriptBridgeCommon.GENERAL_ERROR;
            }
            sfVar.b.b.loadCallbackFunction("mapJSCallback", sfVar.f939a.toString(), str);
        } catch (JSONException unused3) {
            this.b.loadCallbackFunction("mapJSCallback", "\"Invalid JSON Input\"", JavaScriptBridgeCommon.INPUT_ERROR);
        }
    }
}
