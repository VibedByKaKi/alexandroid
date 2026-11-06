package com.amazon.identity.auth.device;

import android.accounts.Account;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.amazon.alexa.accessorykit.interprocess.cookie.CookieChangeEmitter;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import com.amazon.comms.calling.foundation.network.recipes.NetworkConstants;
import com.amazon.identity.auth.device.framework.RemoteMAPException;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class xc extends v9 {
    public static xc h;
    public static final Uri i = Uri.parse("content://com.amazon.identity.mobile.data");
    public static final Uri j = Uri.parse("content://com.amazon.identity.mobile.data/account");
    public static final Uri k = Uri.parse("content://com.amazon.identity.mobile.data/account_data");
    public static final Uri l = Uri.parse("content://com.amazon.identity.mobile.data/device_data");
    public static final String[] m = new String[0];

    /* renamed from: a, reason: collision with root package name */
    public final qn f1066a;
    public final tn b;
    public volatile Map c;
    public volatile Map d;
    public final Object[] e = new Object[0];
    public volatile boolean f = false;
    public final hp g;

    public xc(tn tnVar) {
        Log.i(yf.a("IMPDataProviderDataStorage"), "Constructing IMPDataProviderDataStorage");
        int i2 = tn.b;
        this.b = tnVar != null ? tnVar : new tn(tnVar);
        this.f1066a = new qn(tnVar);
        this.g = new hp(tnVar);
    }

    @Override // com.amazon.identity.auth.device.v9
    public final boolean a(String str, d2 d2Var, u0 u0Var, ArrayList arrayList) {
        boolean z;
        yf.a("IMPDataProviderDataStorage");
        "user".equalsIgnoreCase(Build.TYPE);
        synchronized (this.e) {
            try {
                String str2 = d2Var.f569a;
                ContentValues contentValues = new ContentValues();
                contentValues.put("key_directed_id", d2Var.f569a);
                contentValues.put("key_display_name", str);
                for (Map.Entry entry : d2Var.c.entrySet()) {
                    contentValues.put((String) entry.getKey(), (String) entry.getValue());
                }
                for (Map.Entry entry2 : d2Var.b.entrySet()) {
                    contentValues.put((String) entry2.getKey(), (String) entry2.getValue());
                }
                Uri uri = j;
                z = false;
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                try {
                    qn qnVar = this.f1066a;
                    qnVar.getClass();
                    if (((Integer) qnVar.a(uri, new pn(qnVar, uri, contentValues, str2, strArr))).intValue() > 0) {
                        z = true;
                    }
                } catch (RemoteMAPException e) {
                    Log.e(yf.a("IMPDataProviderDataStorage"), "Got an error while calling IMPDataProvider to update value", e);
                }
                this.c = null;
                this.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            yf.a("IMPDataProviderDataStorage");
            "user".equalsIgnoreCase(Build.TYPE);
            u0Var.a();
        } else {
            Log.e(yf.a("IMPDataProviderDataStorage"), "ReplaceAccounts failed");
        }
        return z;
    }

    @Override // com.amazon.identity.auth.device.v9
    public final void b(String str, String str2) {
        boolean z;
        qn qnVar;
        yf.a("IMPDataProviderDataStorage");
        "user".equalsIgnoreCase(Build.TYPE);
        synchronized (this.e) {
            Uri uri = k;
            String[] strArr = {str2};
            try {
                qnVar = this.f1066a;
                qnVar.getClass();
            } catch (RemoteMAPException e) {
                Log.e(yf.a("IMPDataProviderDataStorage"), "Got an error while calling IMPDataProvider to delete value", e);
            }
            if (((Integer) qnVar.a(uri, new nn(qnVar, uri, str, strArr))).intValue() > 0) {
                z = true;
                this.c = null;
                this.d = null;
            }
            z = false;
            this.c = null;
            this.d = null;
        }
        if (!z) {
            Log.e(yf.a("IMPDataProviderDataStorage"), "ExpireToken failed");
        } else {
            yf.a("IMPDataProviderDataStorage");
            "user".equalsIgnoreCase(Build.TYPE);
        }
    }

    @Override // com.amazon.identity.auth.device.v9
    public final String c(String str, String str2) {
        yf.a("IMPDataProviderDataStorage");
        "user".equalsIgnoreCase(Build.TYPE);
        synchronized (this.e) {
            try {
                g();
                if (this.d == null) {
                    Log.w(yf.a("IMPDataProviderDataStorage"), "Reading from data cache having a problem, try accessing central provider.");
                    Bundle bundle = new Bundle();
                    bundle.putString("key_device_data_namespace", str);
                    bundle.putString("key_device_data_key", str2);
                    return a(new yc("getDeviceData", bundle), i).getString("value");
                }
                if (this.d.containsKey(str)) {
                    return (String) ((Map) this.d.get(str)).get(str2);
                }
                Locale locale = Locale.US;
                Log.w(yf.a("IMPDataProviderDataStorage"), "Namespace requested " + str + " for device data does not exist.");
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.identity.auth.device.v9
    public final Set d(String str) {
        yf.a("IMPDataProviderDataStorage");
        "user".equalsIgnoreCase(Build.TYPE);
        synchronized (this.e) {
            try {
                g();
                if (this.c == null) {
                    Log.w(yf.a("IMPDataProviderDataStorage"), "Reading from data cache having a problem, try accessing central provider.");
                    Bundle bundle = new Bundle();
                    bundle.putString("key_directed_id", str);
                    String[] stringArray = a(new yc("getActors", bundle), i).getStringArray("value");
                    HashSet hashSet = new HashSet();
                    if (stringArray != null) {
                        hashSet.addAll(Arrays.asList(stringArray));
                    }
                    return hashSet;
                }
                HashSet hashSet2 = new HashSet();
                v vVar = (v) this.c.get(str);
                if (vVar == null) {
                    Log.e(yf.a("IMPDataProviderDataStorage"), "Requested account already de-registered.");
                    return hashSet2;
                }
                for (Map.Entry entry : vVar.b.entrySet()) {
                    if (((String) entry.getKey()).startsWith("actor/")) {
                        hashSet2.add((String) entry.getValue());
                    }
                }
                return hashSet2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.identity.auth.device.v9
    public final String e(String str, String str2) {
        yf.a("IMPDataProviderDataStorage");
        String str3 = Build.TYPE;
        "user".equalsIgnoreCase(str3);
        this.g.getClass();
        if (str2.contains(".adptoken") || str2.contains(".privatekey") || str2.contains(".access_token") || str2.contains(".refresh_token") || str2.contains(".cookies.")) {
            yf.a("IMPDataProviderDataStorage");
            "user".equalsIgnoreCase(str3);
            if (!this.g.a(str, str2, b())) {
                return null;
            }
        }
        synchronized (this.e) {
            try {
                g();
                if (this.c != null) {
                    if (this.c.containsKey(str)) {
                        return (String) ((v) this.c.get(str)).b.get(str2);
                    }
                    Log.w(yf.a("IMPDataProviderDataStorage"), "Account requested was already de-registered.");
                    return null;
                }
                Log.w(yf.a("IMPDataProviderDataStorage"), "Reading from data cache having a problem, try accessing central provider.");
                Bundle bundle = new Bundle();
                bundle.putString("key_directed_id", str);
                bundle.putString("key_user_data_key", str2);
                return a(new yc("getUserData", bundle), i).getString("value");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.identity.auth.device.v9
    public final void f(String str) {
        boolean z;
        Locale locale = Locale.US;
        yf.a("IMPDataProviderDataStorage");
        "user".equalsIgnoreCase(Build.TYPE);
        synchronized (this.e) {
            Uri uri = j;
            z = false;
            String[] strArr = new String[0];
            try {
                qn qnVar = this.f1066a;
                qnVar.getClass();
                if (((Integer) qnVar.a(uri, new nn(qnVar, uri, str, strArr))).intValue() > 0) {
                    z = true;
                }
            } catch (RemoteMAPException e) {
                Log.e(yf.a("IMPDataProviderDataStorage"), "Got an error while calling IMPDataProvider to delete value", e);
            }
            this.c = null;
            this.d = null;
        }
        if (!z) {
            Log.e(yf.a("IMPDataProviderDataStorage"), "Remove account failed");
        } else {
            yf.a("IMPDataProviderDataStorage");
            "user".equalsIgnoreCase(Build.TYPE);
        }
    }

    public final void g() {
        Map map;
        if (this.c == null || this.d == null) {
            String string = a(new yc("getAllData", new Bundle()), i).getString("value");
            if (TextUtils.isEmpty(string)) {
                Log.e(yf.a("IMPDataProviderDataStorage"), "Getting empty data when querying central data provider.");
                this.d = null;
                this.c = null;
                return;
            }
            try {
                HashMap hashMap = new HashMap();
                HashMap hashMap2 = new HashMap();
                JSONArray jSONArray = new JSONArray(string);
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    if (jSONObject.has("key_directed_id")) {
                        hashMap.put(jSONObject.getString("key_directed_id"), new v(jSONObject.getString("key_display_name"), new HashMap()));
                    } else if (jSONObject.has("key_account_data_account")) {
                        String string2 = jSONObject.getString("key_account_data_account");
                        String string3 = jSONObject.getString("key_account_data_key");
                        if (hashMap.containsKey(string2)) {
                            ((v) hashMap.get(string2)).b.put(string3, jSONObject.getString("key_account_data_value"));
                        } else {
                            Locale locale = Locale.US;
                            Log.e(yf.a("IMPDataProviderDataStorage"), "Got an unrecognized account data, accountId: " + string2 + ", account data key: " + string3);
                        }
                    } else if (jSONObject.has("key_device_data_namespace")) {
                        String string4 = jSONObject.getString("key_device_data_namespace");
                        String string5 = jSONObject.getString("key_device_data_key");
                        String string6 = jSONObject.getString("key_device_data_value");
                        if (hashMap2.containsKey(string4)) {
                            map = (Map) hashMap2.get(string4);
                        } else {
                            HashMap hashMap3 = new HashMap();
                            hashMap2.put(string4, hashMap3);
                            map = hashMap3;
                        }
                        map.put(string5, string6);
                    } else {
                        Log.e(yf.a("IMPDataProviderDataStorage"), "Get some data that we do not know where it belong to, data is: " + jSONObject);
                    }
                }
                this.c = Collections.unmodifiableMap(hashMap);
                this.d = Collections.unmodifiableMap(hashMap2);
            } catch (JSONException e) {
                Log.e(yf.a("IMPDataProviderDataStorage"), "JSONException happened probably due to serialization problem.", e);
                this.c = null;
                this.d = null;
            }
        }
    }

    @Override // com.amazon.identity.auth.device.v9
    public final void b(String str, String str2, String str3) {
        boolean a2;
        yf.a("IMPDataProviderDataStorage");
        String str4 = Build.TYPE;
        "user".equalsIgnoreCase(str4);
        synchronized (this.e) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key_directed_id", str);
            contentValues.put(str2, str3);
            a2 = a(k, contentValues);
            this.c = null;
            this.d = null;
        }
        if (a2) {
            yf.a("IMPDataProviderDataStorage");
            "user".equalsIgnoreCase(str4);
        } else {
            Log.e(yf.a("IMPDataProviderDataStorage"), "SetToken failed");
        }
    }

    @Override // com.amazon.identity.auth.device.v9
    public final void f() {
    }

    @Override // com.amazon.identity.auth.device.v9
    public final Set b() {
        yf.a("IMPDataProviderDataStorage");
        "user".equalsIgnoreCase(Build.TYPE);
        synchronized (this.e) {
            try {
                g();
                if (this.c != null) {
                    return this.c.keySet();
                }
                Log.w(yf.a("IMPDataProviderDataStorage"), "Reading from data cache having a problem, try accessing central provider.");
                String[] stringArray = a(new yc(NetworkConstants.NAMES.GET_ACCOUNTS, new Bundle()), i).getStringArray("value");
                HashSet hashSet = new HashSet();
                if (stringArray != null) {
                    hashSet.addAll(Arrays.asList(stringArray));
                }
                return hashSet;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.identity.auth.device.v9
    public final void c(String str, String str2, String str3) {
        boolean a2;
        yf.a("IMPDataProviderDataStorage");
        String str4 = Build.TYPE;
        "user".equalsIgnoreCase(str4);
        synchronized (this.e) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key_directed_id", str);
            contentValues.put(str2, str3);
            a2 = a(k, contentValues);
            this.c = null;
            this.d = null;
        }
        if (a2) {
            yf.a("IMPDataProviderDataStorage");
            "user".equalsIgnoreCase(str4);
        } else {
            Log.e(yf.a("IMPDataProviderDataStorage"), "SetUserData failed");
        }
    }

    @Override // com.amazon.identity.auth.device.v9
    public final String c() {
        Log.e(yf.a("IMPDataProviderDataStorage"), "getDeviceSnapshot API is only supported on 3P devices.");
        return null;
    }

    @Override // com.amazon.identity.auth.device.v9
    public final Account c(String str) {
        Log.e(yf.a("IMPDataProviderDataStorage"), "getAccountForDirectedId API is not supported on Streamline devices.");
        return null;
    }

    @Override // com.amazon.identity.auth.device.v9
    public final String d(String str, String str2) {
        yf.a("IMPDataProviderDataStorage");
        "user".equalsIgnoreCase(Build.TYPE);
        if (!this.g.a(str, str2, b())) {
            return null;
        }
        synchronized (this.e) {
            try {
                g();
                if (this.c != null) {
                    if (this.c.containsKey(str)) {
                        return (String) ((v) this.c.get(str)).b.get(str2);
                    }
                    Log.w(yf.a("IMPDataProviderDataStorage"), "Account requested was already de-registered.");
                    return null;
                }
                Log.w(yf.a("IMPDataProviderDataStorage"), "Reading from data cache having a problem, try accessing central provider.");
                Bundle bundle = new Bundle();
                bundle.putString("key_directed_id", str);
                bundle.putString("key_token_key", str2);
                return a(new yc("getToken", bundle), i).getString("value");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.identity.auth.device.v9
    public final synchronized void d() {
        if (!this.f) {
            vc vcVar = new vc(this);
            fh fhVar = fp.f623a;
            new Handler(Looper.getMainLooper()).post(vcVar);
        }
    }

    @Override // com.amazon.identity.auth.device.v9
    public final void e() {
    }

    @Override // com.amazon.identity.auth.device.v9
    public final Set e(String str) {
        yf.a("IMPDataProviderDataStorage");
        String str2 = Build.TYPE;
        "user".equalsIgnoreCase(str2);
        synchronized (this.e) {
            try {
                g();
                if (this.c != null) {
                    if (this.c.containsKey(str)) {
                        HashSet hashSet = new HashSet();
                        for (String str3 : ((v) this.c.get(str)).b.keySet()) {
                            if (!str3.contains("token") && !str3.contains(CookieChangeEmitter.COOKIE_KEY)) {
                            }
                            hashSet.add(str3);
                        }
                        return hashSet;
                    }
                    yf.a("IMPDataProviderDataStorage");
                    "user".equalsIgnoreCase(str2);
                    return new HashSet();
                }
                Log.w(yf.a("IMPDataProviderDataStorage"), "Reading from data cache having a problem, try accessing central provider.");
                Bundle bundle = new Bundle();
                bundle.putString("key_directed_id", str);
                String[] stringArray = a(new yc("getAllTokenKeys", bundle), i).getStringArray("value");
                HashSet hashSet2 = new HashSet();
                if (stringArray != null) {
                    hashSet2.addAll(Arrays.asList(stringArray));
                }
                return hashSet2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static synchronized xc a(Context context) {
        xc xcVar;
        synchronized (xc.class) {
            try {
                if (h == null) {
                    h = new xc(tn.a(context.getApplicationContext()));
                }
                xcVar = h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xcVar;
    }

    @Override // com.amazon.identity.auth.device.v9
    public final Set a() {
        yf.a("IMPDataProviderDataStorage");
        "user".equalsIgnoreCase(Build.TYPE);
        synchronized (this.e) {
            try {
                g();
                if (this.c != null) {
                    HashSet hashSet = new HashSet();
                    Iterator it2 = this.c.entrySet().iterator();
                    while (it2.hasNext()) {
                        hashSet.add(((v) ((Map.Entry) it2.next()).getValue()).f1015a);
                    }
                    return Collections.unmodifiableSet(hashSet);
                }
                Log.w(yf.a("IMPDataProviderDataStorage"), "Reading from data cache having a problem, try accessing central provider.");
                String[] stringArray = a(new yc("getAccountNames", new Bundle()), i).getStringArray("value");
                HashSet hashSet2 = new HashSet();
                if (stringArray != null) {
                    hashSet2.addAll(Arrays.asList(stringArray));
                }
                return hashSet2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.identity.auth.device.v9
    public final boolean a(String str, d2 d2Var, u0 u0Var) {
        Locale locale = Locale.US;
        yf.a("IMPDataProviderDataStorage");
        "user".equalsIgnoreCase(Build.TYPE);
        synchronized (this.e) {
            try {
                g();
                if (this.c != null && this.c.containsKey(d2Var.f569a)) {
                    Log.w(yf.a("IMPDataProviderDataStorage"), "Account already existed");
                    return false;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("key_directed_id", d2Var.f569a);
                contentValues.put("key_display_name", str);
                for (Map.Entry entry : d2Var.c.entrySet()) {
                    contentValues.put((String) entry.getKey(), (String) entry.getValue());
                }
                for (Map.Entry entry2 : d2Var.b.entrySet()) {
                    contentValues.put((String) entry2.getKey(), (String) entry2.getValue());
                }
                boolean a2 = a(j, contentValues);
                this.c = null;
                this.d = null;
                if (a2) {
                    yf.a("IMPDataProviderDataStorage");
                    "user".equalsIgnoreCase(Build.TYPE);
                    u0Var.a();
                } else {
                    Log.e(yf.a("IMPDataProviderDataStorage"), "Add Account failed");
                }
                return a2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.amazon.identity.auth.device.v9
    public final void a(String str, String str2, String str3) {
        boolean a2;
        yf.a("IMPDataProviderDataStorage");
        String str4 = Build.TYPE;
        "user".equalsIgnoreCase(str4);
        synchronized (this.e) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("key_device_data_namespace", str);
            contentValues.put(str2, str3);
            a2 = a(l, contentValues);
            this.c = null;
            this.d = null;
        }
        if (a2) {
            yf.a("IMPDataProviderDataStorage");
            "user".equalsIgnoreCase(str4);
        } else {
            Locale locale = Locale.US;
            Log.e(yf.a("IMPDataProviderDataStorage"), a$$ExternalSyntheticOutline0.m("SetDeviceData for namespace: ", str, ", key: ", str2, " failed"));
        }
    }

    @Override // com.amazon.identity.auth.device.v9
    public final void a(d2 d2Var) {
        boolean a2;
        yf.a("IMPDataProviderDataStorage");
        "user".equalsIgnoreCase(Build.TYPE);
        synchronized (this.e) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.putAll(d2Var.b);
                hashMap.putAll(d2Var.c);
                ContentValues contentValues = new ContentValues();
                contentValues.put("key_directed_id", d2Var.f569a);
                for (Map.Entry entry : hashMap.entrySet()) {
                    contentValues.put((String) entry.getKey(), (String) entry.getValue());
                }
                a2 = a(k, contentValues);
                this.c = null;
                this.d = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (a2) {
            yf.a("IMPDataProviderDataStorage");
            "user".equalsIgnoreCase(Build.TYPE);
        } else {
            Log.e(yf.a("IMPDataProviderDataStorage"), "SetData failed");
        }
    }

    public final Bundle a(yc ycVar, Uri uri) {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(VoiceBridgePayloadUtil.PayloadKey.COMMAND, ycVar.f1089a);
            jSONObject.put("parameters", zj.a(ycVar.b));
            str = jSONObject.toString();
        } catch (JSONException e) {
            Log.e(yf.a("IMPDataProviderHelper"), "Something went wrong converting command to jsonString", e);
            str = null;
        }
        try {
            return (Bundle) this.f1066a.a(uri, new wc(uri, str));
        } catch (Exception e2) {
            Log.e(yf.a("IMPDataProviderDataStorage"), "Got an error while calling IMPDataProviderDataStorage.", e2);
            return new Bundle();
        }
    }

    public final boolean a(Uri uri, ContentValues contentValues) {
        try {
            qn qnVar = this.f1066a;
            qnVar.getClass();
            return ((Uri) qnVar.a(uri, new on(qnVar, uri, contentValues))) != null;
        } catch (RemoteMAPException e) {
            Log.e(yf.a("IMPDataProviderDataStorage"), "Got an error while calling IMPDataProvider to insert value", e);
            return false;
        }
    }
}
