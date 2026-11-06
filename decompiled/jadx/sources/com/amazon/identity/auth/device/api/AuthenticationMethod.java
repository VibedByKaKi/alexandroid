package com.amazon.identity.auth.device.api;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.fireos.sdk.annotations.FireOsSdk;
import com.amazon.identity.auth.device.api.AuthenticatedURLConnection;
import com.amazon.identity.auth.device.b6;
import com.amazon.identity.auth.device.dc;
import com.amazon.identity.auth.device.features.a;
import com.amazon.identity.auth.device.fl;
import com.amazon.identity.auth.device.i7;
import com.amazon.identity.auth.device.jg;
import com.amazon.identity.auth.device.q7;
import com.amazon.identity.auth.device.tn;
import com.amazon.identity.auth.device.yf;
import com.amazon.identity.auth.request.NoCredentialsException;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class AuthenticationMethod {

    @FireOsSdk
    public static final String KEY_AUTH_HEADERS = "auth.headers";

    /* renamed from: a, reason: collision with root package name */
    final MAPAccountManager f471a;
    final tn b;
    final String c;
    final String d;
    final a e;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class GetAuthenticationHeadersForRequestError {

        @FireOsSdk
        public static final int INVALID_ARGUMENT = 3;

        @FireOsSdk
        public static final int IPC_ERROR = 1;

        @FireOsSdk
        public static final String KEY_ERROR_CODE = "error_code_key";

        @FireOsSdk
        public static final String KEY_ERROR_MESSAGE = "error_message_key";

        @FireOsSdk
        public static final int NOT_SUPPORTED = 5;

        @FireOsSdk
        public static final int NO_CREDENTIALS = 2;

        @FireOsSdk
        public static final int PACKAGE_NOT_WHITE_LIST = 4;

        @FireOsSdk
        public static final int UNRECOGNIZED = 6;
    }

    public AuthenticationMethod(Context context, String str, String str2) {
        a a2;
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$3("Must Specify an Authentication Type");
            throw null;
        }
        MAPInit.getInstance(context).initialize();
        this.c = str;
        this.d = str2;
        tn a3 = tn.a(context);
        this.b = a3;
        this.f471a = new MAPAccountManager(a3);
        synchronized (a3) {
            a2 = a.a(new dc(a3));
        }
        this.e = a2;
    }

    public final void a(b6 b6Var) {
        Map<String, List<String>> map;
        byte[] bArr;
        a();
        fl c = jg.c(getClass().getSimpleName(), "getAuthenticationBundle");
        Uri uri = b6Var.getUri();
        String httpVerb = b6Var.getHttpVerb();
        if (AuthenticationType.OAuth.getValue().equals(this.d)) {
            map = Collections.EMPTY_MAP;
            bArr = new byte[0];
        } else {
            map = b6Var.getHeaders();
            bArr = b6Var.getBody();
        }
        try {
            MAPFuture authenticationBundle = getAuthenticationBundle(uri, httpVerb, map, bArr, new q7(null));
            if (authenticationBundle == null) {
                throw new AuthenticatedURLConnection.AuthenticationFailureIOException("The future result is null!");
            }
            Bundle bundle = (Bundle) authenticationBundle.get();
            c.a();
            if (bundle == null) {
                throw new AuthenticatedURLConnection.AuthenticationFailureIOException("Cannot authenticate because we received no token, the getToken call failed");
            }
            HashMap hashMap = new HashMap();
            Bundle bundle2 = bundle.getBundle(KEY_AUTH_HEADERS);
            if (bundle2 != null) {
                for (String str : bundle2.keySet()) {
                    hashMap.put(str, bundle2.getString(str));
                }
            }
            if (hashMap.size() == 0) {
                yf.a("AuthenticationMethod");
                "user".equalsIgnoreCase(Build.TYPE);
                return;
            }
            for (Map.Entry entry : hashMap.entrySet()) {
                if (b6Var.getHeader((String) entry.getKey()) != null) {
                    String.format("Overridding header %s because it is needed for authentication", entry.getKey());
                    yf.a("AuthenticationMethod");
                    "user".equalsIgnoreCase(Build.TYPE);
                }
                b6Var.setHeader((String) entry.getKey(), (String) entry.getValue());
            }
        } catch (MAPCallbackErrorException e) {
            Bundle errorBundle = e.getErrorBundle();
            Bundle bundle3 = errorBundle.getBundle("com.amazon.identity.mobi.account.recover.context");
            if (bundle3 != null) {
                Log.e(yf.a("AuthenticationMethod"), "Error happened when try to get authentication bundle. Account needs to be recovered.");
                throw new AuthenticatedURLConnection.AccountNeedsRecoveryException("Error happened when try to get authentication bundle", bundle3);
            }
            Log.e(yf.a("AuthenticationMethod"), "Error happened when try to get authentication bundle, the error message is: " + i7.b(errorBundle));
            throw new AuthenticatedURLConnection.AuthenticationFailureIOException("Error happened when try to get authentication bundle");
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            Log.e(yf.a("AuthenticationMethod"), "InterruptedException happened when try to get authentication bundle result", e2);
            throw new AuthenticatedURLConnection.AuthenticationFailureIOException("InterruptedException happened when try to get authentication bundle. " + e2.getMessage());
        } catch (ExecutionException e3) {
            Log.e(yf.a("AuthenticationMethod"), "ExecutionException happened when try to get authentication bundle result", e3);
            throw new AuthenticatedURLConnection.AuthenticationFailureIOException("ExecutionException happened when try to get authentication bundle. " + e3.getMessage());
        }
    }

    public abstract MAPFuture getAuthenticationBundle(Uri uri, String str, Map map, byte[] bArr, q7 q7Var);

    @FireOsSdk
    public MAPFuture<Bundle> getAuthenticationHeadersForRequest(Uri uri, String str, Map map, byte[] bArr, Callback callback) {
        q7 q7Var = new q7(callback);
        try {
            a();
            if (uri == null) {
                a(q7Var, 3, "The serviceUri cannot be null, please check your parameters!", null);
                return q7Var;
            }
            if (TextUtils.isEmpty(str)) {
                a(q7Var, 3, "The verb of the request cannot be null, please check your parameters!", null);
                return q7Var;
            }
            if (TextUtils.isEmpty(this.d)) {
                a(q7Var, 3, "Please specify an authentication type!", null);
                return q7Var;
            }
            AuthenticationType parse = AuthenticationType.parse(this.d);
            if (!AuthenticationType.ADPAuthenticator.equals(parse) && !AuthenticationType.OAuth.equals(parse)) {
                a(q7Var, 5, "Currently MAP just support ADP and OAuh authentication type for this API. Please check your authentication type.", null);
                return q7Var;
            }
            fl c = jg.c(getClass().getSimpleName(), "getAuthenticationBundle");
            try {
                try {
                    getAuthenticationBundle(uri, str, map, bArr, q7Var);
                } catch (IOException unused) {
                    Log.e(yf.a("AuthenticationMethod"), "Error happened when trying to sign the request components and get the http headers back!");
                }
                c.a();
                return q7Var;
            } catch (Throwable th) {
                c.a();
                throw th;
            }
        } catch (NoCredentialsException unused2) {
            a(q7Var, 2, "The given directedId does not exist!", null);
            return q7Var;
        }
    }

    public static void a(q7 q7Var, int i, String str, Bundle bundle) {
        if (q7Var == null) {
            return;
        }
        Log.e(yf.a("AuthenticationMethod"), str);
        Bundle bundle2 = new Bundle();
        bundle2.putInt("error_code_key", i);
        bundle2.putString("error_message_key", str);
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        q7Var.onError(bundle2);
    }

    private void a() {
        String str = this.c;
        if (str == null) {
            if (AuthenticationType.OAuth.getValue().equals(this.d)) {
                Log.e(yf.a("AuthenticationMethod"), "OAuth does not support anonymous credentials");
                throw new NoCredentialsException("OAuth does not support anonymous credentials");
            }
        } else {
            if (this.f471a.isAccountRegistered(str)) {
                return;
            }
            Log.e(yf.a("AuthenticationMethod"), "The account that this AuthenticationMethod with is no longer registered");
            yf.a("AuthenticationMethod", this.c, this.f471a.getAccounts());
            throw new NoCredentialsException("The account that this AuthenticationMethod with is no longer registered");
        }
    }
}
