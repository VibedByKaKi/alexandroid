package com.amazon.identity.auth.device;

import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceBridgePayloadUtil;
import com.amazon.identity.auth.device.api.CustomerAttributeStore;
import com.amazon.identity.auth.device.api.MAPError;
import com.amazon.identity.auth.device.framework.RemoteMAPException;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class y7 implements f9 {
    public static final Uri d = Uri.parse("content://amazon_customer_attribute_store");
    public static final Uri e = Uri.parse("content://amazon_customer_attribute_store_directboot");
    public static final List f = Arrays.asList("bundle_value");

    /* renamed from: a, reason: collision with root package name */
    public final tn f1084a;
    public final hl b;
    public final qn c;

    public y7(tn tnVar) {
        hl hlVar = (hl) tnVar.getSystemService("sso_platform");
        qn qnVar = new qn(tnVar);
        this.f1084a = tnVar;
        this.b = hlVar;
        this.c = qnVar;
    }

    public final Bundle a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        boolean b = this.b.b();
        tn tnVar = this.f1084a;
        if (b) {
            Log.i(yf.a("CentralCustomerAttributeStoreCommunication"), a$$ExternalSyntheticOutline0.m$1(tnVar.getPackageName(), " try get customer attribute in direct mode for ", jSONObject.optString("key")));
            qn qnVar = this.c;
            Uri uri = e;
            return (Bundle) qnVar.a(uri, new x7(uri, jSONObject2));
        }
        tnVar.getPackageName();
        jSONObject.optString("key");
        yf.a("CentralCustomerAttributeStoreCommunication");
        "user".equalsIgnoreCase(Build.TYPE);
        qn qnVar2 = this.c;
        Uri uri2 = d;
        return (Bundle) qnVar2.a(uri2, new x7(uri2, jSONObject2));
    }

    @Override // com.amazon.identity.auth.device.f9
    public final Bundle a(String str, String str2) {
        JSONObject a2 = a("peekAttribute", str, str2, null, null);
        if (a2 == null) {
            Log.e(yf.a("CentralCustomerAttributeStoreCommunication"), "Failed to construct peek attribute command");
            return null;
        }
        try {
            Bundle a3 = a(a2);
            return a3 == null ? b5.a(MAPError.AttributeError.GET_ATTRIBUTE_FAILED, "CustomerAttributeStore returned null", 4, "CustomerAttributeStore returned null") : a3;
        } catch (RemoteMAPException e2) {
            Log.e(yf.a("CentralCustomerAttributeStoreCommunication"), "Failed to call peekAttribute", e2);
            return b5.a(MAPError.AttributeError.GET_ATTRIBUTE_FAILED, "Failed to call peekAttribute", 4, "Failed to call peekAttribute");
        }
    }

    @Override // com.amazon.identity.auth.device.f9
    public final q7 a(String str, String str2, String str3, ig igVar) {
        q7 q7Var = new q7(igVar);
        fp.b(new w7(this, str2, str3, str, q7Var));
        return q7Var;
    }

    @Override // com.amazon.identity.auth.device.f9
    public final q7 a(String str, String str2, ig igVar, Bundle bundle, EnumSet enumSet, nq nqVar) {
        q7 q7Var = new q7(igVar);
        fp.b(new v7(this, str, str2, bundle, enumSet, q7Var));
        return q7Var;
    }

    public static Bundle a(Cursor cursor, String str) {
        if (cursor != null && cursor.moveToFirst()) {
            int columnIndex = cursor.getColumnIndex("bundle_value");
            String string = columnIndex == -1 ? null : cursor.getString(columnIndex);
            if (string == null) {
                yf.a("CentralCustomerAttributeStoreCommunication");
                "user".equalsIgnoreCase(Build.TYPE);
                return null;
            }
            return zj.b(string);
        }
        yf.a("CentralCustomerAttributeStoreCommunication");
        "user".equalsIgnoreCase(Build.TYPE);
        return null;
    }

    public static JSONObject a(String str, String str2, String str3, Bundle bundle, EnumSet enumSet) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(VoiceBridgePayloadUtil.PayloadKey.COMMAND, str);
            jSONObject.put("directedId", str2);
            jSONObject.put("key", str3);
            jSONObject.put("bundleInfo", zj.a(bundle));
            if (enumSet != null) {
                jSONObject.put("getOptions", CustomerAttributeStore.GetAttributeOptions.serializeList(enumSet));
            }
            return jSONObject;
        } catch (JSONException e2) {
            Log.e(yf.a("CentralCustomerAttributeStoreCommunication"), "Error creating Customer Attribute IPC Command", e2);
            return null;
        }
    }
}
