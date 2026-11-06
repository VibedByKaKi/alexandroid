package com.amazon.identity.auth.device.framework;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.amazon.identity.auth.device.Cif;
import com.amazon.identity.auth.device.al;
import com.amazon.identity.auth.device.fh;
import com.amazon.identity.auth.device.fp;
import com.amazon.identity.auth.device.nq;
import com.amazon.identity.auth.device.yf;
import com.amazon.identity.auth.device.yn;
import com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommon;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class MAPSmsReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final nq f643a;
    private final WebView b;
    private yn c;
    private Boolean d = null;
    private volatile boolean e = false;
    private volatile m f = null;

    public MAPSmsReceiver(nq nqVar, WebView webView) {
        this.f643a = nqVar;
        this.b = webView;
        Log.i(yf.a("MAPSmsReceiver"), "instance created");
    }

    public final synchronized void a(Context context, yn ynVar) {
        try {
            Log.i(yf.a("MAPSmsReceiver"), "registering sms retriever: " + this.f);
            if (context != null && this.f == null) {
                this.f = new m(this, context);
                this.c = ynVar;
            }
            Log.i(yf.a("MAPSmsReceiver"), "registered sms retriever: " + this.f);
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(Context context) {
        try {
            Log.i(yf.a("MAPSmsReceiver"), "unregistering sms retriever: " + this.f);
            if (context != null && this.f != null) {
                if (!this.e) {
                    this.f643a.a("MOA:AutoPVCancel");
                }
                m mVar = this.f;
                context.unregisterReceiver(mVar.f657a);
                mVar.b = null;
                this.f = null;
                this.c = null;
            }
            Log.i(yf.a("MAPSmsReceiver"), "Unregistered MAP sms receiver");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String str;
        if (intent == null) {
            return;
        }
        try {
            if (SmsRetriever.SMS_RETRIEVED_ACTION.equals(intent.getAction())) {
                Bundle extras = intent.getExtras();
                Status status = (Status) extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS");
                int statusCode = status.getStatusCode();
                if (statusCode != 0) {
                    if (statusCode == 15) {
                        Log.w(yf.a("MAPSmsReceiver"), "Receiving message timeout");
                        return;
                    }
                    Log.w(yf.a("MAPSmsReceiver"), "Receiving message get unknown status:" + status.getStatusCode());
                    return;
                }
                String str2 = (String) extras.get(SmsRetriever.EXTRA_SMS_MESSAGE);
                Log.i(yf.a("MAPSmsReceiver"), "Receiving message");
                synchronized (this) {
                    String str3 = null;
                    if (this.c == null) {
                        Pattern pattern = al.f461a;
                        if (!TextUtils.isEmpty(str2)) {
                            Matcher matcher = al.f461a.matcher(str2);
                            if (matcher.matches()) {
                                str3 = matcher.group(4);
                            }
                        }
                        a(str3);
                        return;
                    }
                    Log.i(yf.a("MAPSmsReceiver"), "Consuming SMS message via SmsRetrieverManager");
                    yn ynVar = this.c;
                    ynVar.getClass();
                    Cif cif = ynVar.c;
                    if (cif == null) {
                        Log.w(yf.a("SmsRetrieverManager"), "Got null consumer callback, there may be errors when consuming sms");
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("isRegistered", true);
                            if (str2 != null) {
                                jSONObject.put("sms", str2);
                            }
                            str = jSONObject.toString();
                        } catch (JSONException unused) {
                            str = JavaScriptBridgeCommon.GENERAL_ERROR;
                        }
                        cif.b.b.loadCallbackFunction("mapJSCallback", cif.f725a.toString(), str);
                        ynVar.c = null;
                        MAPSmsReceiver mAPSmsReceiver = ynVar.b;
                        if (mAPSmsReceiver != null && ynVar.d) {
                            mAPSmsReceiver.b(ynVar.f1097a);
                        }
                    }
                }
            }
        } catch (Exception e) {
            yf.a(this.f643a, "MAPSmsReceiver", "Unknown exception happened when reading the message.", "UnknownExceptionReadingSMS:".concat(e.getClass().getName()));
        }
    }

    public final boolean a(URL url, Context context) {
        String query;
        if (context == null) {
            return false;
        }
        if (("/ap/pv".equals(url.getPath()) || "/ap/cvf/request".equals(url.getPath())) && (query = url.getQuery()) != null && query.contains("spin=true") && query.contains("smsretriever=true")) {
            return a(context);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        h hVar = new h(this, str, 0);
        fh fhVar = fp.f623a;
        new Handler(Looper.getMainLooper()).post(hVar);
    }

    public final boolean a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e(yf.a("MAPSmsReceiver"), "url is null or empty");
            return false;
        }
        try {
            return a(new URL(str), context);
        } catch (MalformedURLException unused) {
            yf.a("MAPSmsReceiver");
            "user".equalsIgnoreCase(Build.TYPE);
            return false;
        }
    }

    private void a(String str) {
        Log.i(yf.a("MAPSmsReceiver"), "submit code");
        if (str != null) {
            this.f643a.a("MOA:GetValidCodeFromSMS");
        }
        try {
            Integer.parseInt(str);
            if (this.b != null) {
                f fVar = new f(this, str);
                fh fhVar = fp.f623a;
                new Handler(Looper.getMainLooper()).post(fVar);
            }
        } catch (NumberFormatException unused) {
            Log.e(yf.a("MAPSmsReceiver"), "get an non-numeric code");
        }
    }

    public final boolean a(Context context) {
        if (this.d == null) {
            this.d = Boolean.valueOf(e.a(context));
        }
        Log.i(yf.a("MAPSmsReceiver"), "sms retriever is supported: " + this.d);
        return this.d.booleanValue();
    }

    public final synchronized void a() {
        if (this.e) {
            this.f643a.a("MOA:AutoPVSuccess");
        }
    }
}
