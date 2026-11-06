package com.amazon.identity.auth.device;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.amazon.identity.auth.device.actor.ActorManagerCommunication$SwitchActorAction;
import com.amazon.identity.auth.device.api.ActorInfo;
import com.amazon.identity.auth.device.api.Callback;
import com.amazon.identity.auth.device.api.MAPActorManager;
import com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommon;
import com.amazon.identity.mobi.common.utils.json.JSONUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class uf extends kd {
    public final gd c;
    public final MAPActorManager d;
    public final Context e;
    public String f;
    public final yn g;

    public uf(WebView webView, yn ynVar) {
        super(webView, "MAPJavaScriptBridge");
        Context applicationContext = webView.getContext().getApplicationContext();
        this.e = applicationContext;
        this.c = new gd(applicationContext);
        this.d = new MAPActorManager(applicationContext);
        this.f = null;
        this.g = ynVar;
    }

    public final void a(String str) {
        try {
            Log.i(yf.a("MAPJavaScriptBridge"), "MAP JS bridge getMAPAndroidBridgeVersion is called");
            JSONObject validJson = JSONUtils.getValidJson(str);
            Log.i(yf.a("MAPJavaScriptBridge"), "MAP JS bridge getMAPAndroidBridgeVersion is called. callbackId: " + validJson.optString("callingId") + " , callback name: " + validJson.optString("callbackFunctionNameKey", "mapJSCallback"));
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("mapJSVersion", "MAP_Android_1");
            loadCallbackFunction("mapJSCallback", validJson.toString(), jSONObject.toString());
        } catch (JSONException unused) {
            loadCallbackFunction("mapJSCallback", "\"Invalid JSON Input\"", JavaScriptBridgeCommon.INPUT_ERROR);
        }
    }

    public final void b(String str) {
        try {
            JSONObject validJson = JSONUtils.getValidJson(str);
            ActorInfo actorInfo = new ActorInfo(validJson.optString("program"), validJson.optString(CmcdConfiguration.KEY_CONTENT_ID), validJson.optString("pid"), validJson.optString("actor_type"));
            MAPActorManager.ActorSwitchMode actorSwitchMode = TextUtils.equals(validJson.optString(ActorManagerCommunication$SwitchActorAction.KEY_ACTOR_SWITCH_MODE), "Force") ? MAPActorManager.ActorSwitchMode.Force : MAPActorManager.ActorSwitchMode.Normal;
            Log.i(yf.a("MAPJavaScriptBridge"), "MAP JS bridge switchActor is called with callbackId: " + validJson.optString("callingId") + ", callback name: " + validJson.optString("callbackFunctionNameKey", "mapJSCallback"));
            this.d.switchActor(actorSwitchMode, actorInfo, new Bundle(), new pf());
        } catch (JSONException unused) {
            loadCallbackFunction("mapJSCallback", "\"Invalid JSON Input\"", JavaScriptBridgeCommon.INPUT_ERROR);
        }
    }

    public final void c(String str) {
        aq aqVar;
        try {
            JSONObject validJson = JSONUtils.getValidJson(str);
            String optString = validJson.optString(CmcdConfiguration.KEY_CONTENT_ID);
            String optString2 = validJson.optString("pid");
            this.f = optString2;
            String optString3 = validJson.optString("authCode");
            Log.i(yf.a("MAPJavaScriptBridge"), "MAP JS bridge upgradeToken is called with callbackId: " + validJson.optString("callingId") + ", callback name: " + validJson.optString("callbackFunctionNameKey", "mapJSCallback"));
            yf.a("MAPJavaScriptBridge");
            "user".equalsIgnoreCase(Build.TYPE);
            Bundle bundle = new Bundle();
            bundle.putString("key_auth_code", optString3);
            bundle.putString("key_token_type", "token_type_oauth_refresh_token");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("returnValue", "MAP_Native_Acknowledged");
            gd gdVar = this.c;
            lf lfVar = new lf();
            mf mfVar = new mf(this, validJson, jSONObject);
            gdVar.getClass();
            nq nqVar = new nq("TokenManagement:UpgradeToken");
            synchronized (gdVar) {
                try {
                    if (gdVar.b == null) {
                        gdVar.b = bq.a(gdVar.f678a);
                    }
                    aqVar = gdVar.b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            aqVar.a(optString, optString2, bundle, jg.a(nqVar, (Callback) lfVar, (com.amazon.identity.auth.device.token.c) mfVar, (tn) null, false), mfVar, nqVar);
        } catch (JSONException unused) {
            loadCallbackFunction("mapJSCallback", "\"Invalid JSON Input\"", JavaScriptBridgeCommon.INPUT_ERROR);
        }
    }

    @JavascriptInterface
    public void getCurrentAppInfo(String str) {
        invoke("getCurrentAppInfo", str, new of(this));
    }

    @JavascriptInterface
    public void getCustomerInformationHint(String str) {
        invoke("getCustomerInformationHint", new rf(this));
    }

    @JavascriptInterface
    public void getMAPAndroidBridgeVersion(String str) {
        qf qfVar = new qf(this, str);
        fh fhVar = fp.f623a;
        new Handler(Looper.getMainLooper()).post(qfVar);
    }

    @JavascriptInterface
    public void isSmsRetrieverEnabled(String str) {
        invoke("isSmsRetrieverEnabled", new tf(this, str));
    }

    @JavascriptInterface
    public void registerMAPSmsReceiver(String str) {
        invoke("registerMAPSmsReceiver", new jf(this, str));
    }

    @JavascriptInterface
    public void switchActor(String str) {
        nf nfVar = new nf(this, str);
        fh fhVar = fp.f623a;
        new Handler(Looper.getMainLooper()).post(nfVar);
    }

    @JavascriptInterface
    public void upgradeToken(String str) {
        kf kfVar = new kf(this, str);
        fh fhVar = fp.f623a;
        new Handler(Looper.getMainLooper()).post(kfVar);
    }
}
