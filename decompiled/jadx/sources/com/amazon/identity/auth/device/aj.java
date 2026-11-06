package com.amazon.identity.auth.device;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.amazon.identity.auth.accounts.CentralAccountManagerCommunication$RegisterChildApplication;
import com.amazon.identity.auth.device.api.AuthenticationMethod;
import com.amazon.whisperjoin.deviceprovisioningservice.arcus.data.ArcusConstants;
import java.util.HashSet;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public abstract class aj extends ki {
    public final String c;

    public aj(Context context, String str) {
        super(tn.a(context));
        this.c = str;
    }

    @Override // com.amazon.identity.auth.device.ki
    public final String a(JSONObject jSONObject) {
        return hd.a("error_index", null, jSONObject);
    }

    @Override // com.amazon.identity.auth.device.ki
    public final JSONObject b(nq nqVar) {
        String str;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("platform", "Android");
        jSONObject4.put("applicationType", "Native-1P");
        jSONObject4.put("platformIdentifier", this.f774a.getPackageName());
        tn tnVar = this.f774a;
        jSONObject4.put("native1PDeviceType", ta.b(tnVar, tnVar.getPackageName()));
        tn tnVar2 = this.f774a;
        HashSet hashSet = gl.f684a;
        try {
            str = tnVar2.getPackageManager().getPackageInfo(tnVar2.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            Log.e(yf.a("PlatformUtils"), "Impossible to reach here", e);
            str = null;
        }
        jSONObject4.put(ArcusConstants.InputAttribute.APPLICATION_VERSION, str);
        boolean z = bg.e;
        jSONObject4.put("mapVersion", "20260904N");
        jSONObject4.put("platformVersion", String.valueOf(Build.VERSION.SDK_INT));
        jSONObject3.put("applicationType", jSONObject4);
        jSONObject3.put("identityProvider", "DMS");
        jSONObject2.put("applicationIdentifier", jSONObject3);
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        jSONObject6.put("device_serial_number", gl.c(this.f774a));
        tn tnVar3 = this.f774a;
        jSONObject6.putOpt(CentralAccountManagerCommunication$RegisterChildApplication.KEY_DEVICE_TYPE, ta.b(tnVar3, tnVar3.getPackageName()));
        jSONObject5.put("dms", jSONObject6);
        jSONObject5.put("session_id", String.valueOf(UUID.randomUUID()));
        jSONObject2.put("sessionData", jSONObject5);
        jSONObject.put("instanceDataFromMAP", jSONObject2);
        JSONObject jSONObject7 = new JSONObject();
        jSONObject7.put("PrivacyRegulations", new JSONObject());
        jSONObject.put("configQueries", jSONObject7);
        return jSONObject;
    }

    @Override // com.amazon.identity.auth.device.ki
    public final String d() {
        return a4.a(this.f774a, this.c);
    }

    @Override // com.amazon.identity.auth.device.ki
    public final String e() {
        return "POST";
    }

    @Override // com.amazon.identity.auth.device.ki
    public final String f() {
        return a4.b(this.f774a, this.c);
    }

    @Override // com.amazon.identity.auth.device.ki
    public final String h() {
        return "/auth/map/config";
    }

    @Override // com.amazon.identity.auth.device.ki
    public final AuthenticationMethod b() {
        return null;
    }
}
