package com.amazon.identity.auth.device;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import com.amazon.identity.auth.device.api.MAPActorManager;
import com.amazon.identity.auth.device.callback.RemoteCallbackWrapper;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class vl extends nd {
    public MAPActorManager c;
    public MAPAccountManager d;
    public final String e;
    public final Bundle f;
    public final RemoteCallbackWrapper g;
    public Activity h;
    public Runnable i;
    public final boolean j;

    public vl(WebView webView, Bundle bundle, Activity activity, RemoteCallbackWrapper remoteCallbackWrapper, Runnable runnable) {
        super(webView, "ProfilePickerJavaScriptBridge");
        Context applicationContext = webView.getContext().getApplicationContext();
        this.c = new MAPActorManager(applicationContext);
        this.d = new MAPAccountManager(applicationContext);
        this.e = bundle.getString("actor_mapping");
        this.h = activity;
        this.g = remoteCallbackWrapper;
        this.i = runnable;
        Bundle bundle2 = bundle.getBundle("authenticationResult");
        if (bundle2 != null) {
            this.j = true;
            bundle = bundle2;
        } else {
            this.j = false;
        }
        this.f = bundle;
    }

    public final void a(String str, String str2) {
        MAPActorManager mAPActorManager = this.c;
        String string = this.f.getString("com.amazon.dcp.sso.property.account.acctId");
        if (TextUtils.isEmpty(string)) {
            string = this.d.getAccount();
        }
        Bundle actorMapping = mAPActorManager.setActorMapping(string, str, str2);
        if (actorMapping.getInt("result_code") != 1) {
            Log.e(yf.a("ProfilePickerJavaScriptBridge"), s0.a("Set actor for mapping failed: ", actorMapping.getString(MAPActorManager.KEY_ERROR_MESSAGE)));
            fp.a(new rl(this, actorMapping));
        } else {
            Log.i(yf.a("ProfilePickerJavaScriptBridge"), "Set actor for mapping succeeds.");
            if (!this.j) {
                fp.a(new sl(this, actorMapping));
            } else {
                this.f.putBundle(MAPAccountManager.PROFILE_PICKER_RESULT_BUNDLE_KEY, actorMapping);
                fp.a(new sl(this, this.f));
            }
        }
    }

    @JavascriptInterface
    public void getCurrentActorInformation(String str) {
        invokeWithEncoding("AndroidJavaScriptBridge", "getCurrentActorInformation", str, new ql(this));
    }

    @JavascriptInterface
    public void profilePickerDidFailToLoad(String str) {
        invokeWithEncoding("AndroidJavaScriptBridge", "profilePickerDidFailToLoad", str, new pl(this));
    }

    @JavascriptInterface
    public void profileSelected(String str) {
        invokeWithEncoding("AndroidJavaScriptBridge", "profileSelected", str, new nl(this));
    }
}
