package com.amazon.identity.auth.device.api;

import android.app.Activity;
import android.content.Context;
import android.net.UrlQuerySanitizer;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.fireos.sdk.annotations.FireOsSdk;
import com.amazon.identity.auth.device.api.CookieKeys;
import com.amazon.identity.auth.device.api.MAPAccountManager;
import com.amazon.identity.auth.device.aq;
import com.amazon.identity.auth.device.bq;
import com.amazon.identity.auth.device.dd;
import com.amazon.identity.auth.device.f1;
import com.amazon.identity.auth.device.ig;
import com.amazon.identity.auth.device.jg;
import com.amazon.identity.auth.device.nq;
import com.amazon.identity.auth.device.q7;
import com.amazon.identity.auth.device.tn;
import com.amazon.identity.auth.device.token.c;
import com.amazon.identity.auth.device.vq;
import com.amazon.identity.auth.device.yf;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class TokenManagement {

    @FireOsSdk
    public static final int ERROR_INVALID_PARAMETER = 1;

    @FireOsSdk
    public static final String KEY_ACCESS_TOKEN_FROM_CACHE = "access_token_from_cache";

    @FireOsSdk
    public static final String KEY_ACCOUNT_RECOVER_CONTEXT_BUNDLE = "com.amazon.identity.mobi.account.recover.context";

    @FireOsSdk
    public static final String KEY_ERROR_CODE = "com.amazon.dcp.sso.ErrorCode";

    @FireOsSdk
    public static final String KEY_ERROR_MESSAGE = "com.amazon.dcp.sso.ErrorMessage";
    public static final String TAG = "TokenManagement";

    @FireOsSdk
    public static final String VALUE_KEY = "value_key";

    /* renamed from: a, reason: collision with root package name */
    aq f520a;
    private final tn b;

    @FireOsSdk
    public TokenManagement(Context context) {
        MAPInit.getInstance(context).initialize();
        this.b = tn.a(context);
    }

    public final synchronized aq a() {
        try {
            if (this.f520a == null) {
                this.f520a = bq.a(this.b);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f520a;
    }

    @FireOsSdk
    public MAPFuture<Bundle> getCookies(Activity activity, final String str, final Bundle bundle, Callback callback) {
        nq nqVar = new nq("TokenManagement:GetCookiesWithChallengeUrl");
        dd ddVar = new dd(this.b);
        q7 a2 = q7.a(callback);
        String string = bundle.getString(CookieKeys.Options.KEY_SIGN_IN_URL);
        final String account = ddVar.getAccount();
        final ig a3 = jg.a(nqVar, (Callback) a2, (c) null, this.b, true);
        if (!TextUtils.isEmpty(string) && string.contains("/ap/signin")) {
            vq vqVar = new vq();
            vqVar.setAllowUnregisteredParamaters(true);
            vqVar.setUnregisteredParameterValueSanitizer(UrlQuerySanitizer.getAllButNulLegal());
            vqVar.parseUrl(string);
            if (!MAPAndroidWebViewHelper.shouldIntercept(vqVar)) {
                String string2 = bundle.getString(CookieKeys.Options.KEY_ASSOC_HANDLE);
                String string3 = bundle.getString(CookieKeys.Options.KEY_PAGE_ID);
                bundle.remove(CookieKeys.Options.KEY_ASSOC_HANDLE);
                bundle.remove(CookieKeys.Options.KEY_PAGE_ID);
                bundle.putBundle(MAPAccountManager.AuthPortalOptions.KEY_REQUEST_PARAMETERS, f1.a("openid.assoc_handle", string2, "pageId", string3));
                ddVar.a(activity, account, string, bundle, new Callback() { // from class: com.amazon.identity.auth.device.api.TokenManagement.1
                    @Override // com.amazon.identity.auth.device.api.Callback
                    public void onError(Bundle bundle2) {
                        a3.onError(bundle2);
                    }

                    @Override // com.amazon.identity.auth.device.api.Callback
                    public void onSuccess(Bundle bundle2) {
                        bundle.putBoolean(CookieKeys.Options.KEY_FORCE_REFRESH, true);
                        TokenManagement.this.a().a(account, str, bundle, a3, new nq("TokenManagement:GetCookiesWithChallengeUrl:GetCookies"));
                    }
                });
                return a2;
            }
        }
        return a().a(account, str, bundle, a3, nqVar);
    }

    @FireOsSdk
    public MAPFuture<Bundle> getCookiesForActor(String str, String str2, String str3, Bundle bundle, Callback callback) {
        nq nqVar = new nq("TokenManagement:GetCookiesForActor");
        return a().a(str, str2, str3, bundle, jg.a(nqVar, callback), nqVar);
    }

    @FireOsSdk
    public MAPFuture<Bundle> getParentScopedToken(String str, String str2, String str3, Bundle bundle, Callback callback) {
        nq nqVar = new nq("TokenManagement:GetParentScopedToken");
        return a().b(str, str2, str3, bundle, jg.a(nqVar, callback), nqVar);
    }

    @FireOsSdk
    public MAPFuture<Bundle> getToken(String str, String str2, Bundle bundle, Callback callback) {
        nq nqVar = new nq("TokenManagement:GetToken");
        return a().a(str, str2, bundle, (Callback) jg.a(nqVar, callback), nqVar);
    }

    @FireOsSdk
    public MAPFuture<Bundle> getTokenForActor(Context context, String str, String str2, String str3, String str4, Bundle bundle, Callback callback) {
        nq nqVar = new nq("TokenManagement:GetTokenForActor");
        return a().a(context, str, str2, str3, str4, bundle, jg.a(nqVar, callback), nqVar);
    }

    @FireOsSdk
    public String getValue(String str, String str2, Bundle bundle, long j) throws MAPCallbackErrorException, InterruptedException, ExecutionException, TimeoutException {
        return getToken(str, str2, bundle, null).get(j, TimeUnit.MILLISECONDS).getString("value_key");
    }

    @FireOsSdk
    public MAPFuture<Bundle> invalidateCookies(String str, String str2, Bundle bundle, Callback callback) {
        nq nqVar = new nq("TokenManagement:InvalidateCookies");
        return a().b(str, str2, bundle, jg.a(nqVar, callback), nqVar);
    }

    @FireOsSdk
    public MAPFuture<Bundle> peekCookies(String str, String str2, Callback callback) {
        nq nqVar = new nq("TokenManagement:PeekCookies");
        if (!TextUtils.isEmpty(str)) {
            return a().a(str, str2, ErrorUtils$$ExternalSyntheticOutline0.m("com.amazon.identity.auth.device.internal.cookiekeys.options.ignorefresh", true), jg.a(nqVar, callback), nqVar);
        }
        Log.e(yf.a(TAG), "Directed Id given was null. Cannot peek cookies for a deregistered device");
        Single$$ExternalSyntheticBUOutline0.m$3("Directed Id given was null. Cannot peek cookies for a deregistered device");
        return null;
    }

    @FireOsSdk
    public MAPFuture<Bundle> getCookies(String str, String str2, Bundle bundle, Callback callback) {
        nq nqVar = new nq("TokenManagement:GetCookies");
        return a().a(str, str2, bundle, jg.a(nqVar, callback), nqVar);
    }
}
