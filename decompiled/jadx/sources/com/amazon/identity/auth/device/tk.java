package com.amazon.identity.auth.device;

import android.app.Activity;
import android.os.Build;
import android.util.Log;
import com.amazon.identity.auth.device.framework.phonenumberautofill.PhoneNumberAutoFillResultType;
import com.amazon.identity.auth.device.framework.phonenumberautofill.PhoneNumberPickerMetric;
import com.amazon.identity.mobi.common.javascript.AsyncJavaScriptCall;
import com.amazon.identity.mobi.common.javascript.Promise;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.Identity;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class tk implements AsyncJavaScriptCall {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f978a;
    public final /* synthetic */ uk b;

    public tk(uk ukVar, String str) {
        this.b = ukVar;
        this.f978a = str;
    }

    @Override // com.amazon.identity.mobi.common.javascript.AsyncJavaScriptCall
    public final void run(JSONObject jSONObject, Promise promise, String str) {
        boolean booleanValue;
        Log.i(yf.a("PhoneNumberAutoFillBridge"), "Phone number picker invoked 1");
        if (uk.e != null) {
            yf.a("PhoneNumberAutoFillBridge");
            "user".equalsIgnoreCase(Build.TYPE);
            booleanValue = uk.e.booleanValue();
        } else {
            try {
                Class.forName("com.google.android.gms.auth.api.identity.Identity", false, uk.class.getClassLoader());
                uk.e = Boolean.TRUE;
                yf.a("PhoneNumberAutoFillBridge");
                "user".equalsIgnoreCase(Build.TYPE);
                booleanValue = uk.e.booleanValue();
            } catch (ClassNotFoundException unused) {
                uk.e = Boolean.FALSE;
                yf.a("PhoneNumberAutoFillBridge");
                "user".equalsIgnoreCase(Build.TYPE);
                booleanValue = uk.e.booleanValue();
            }
        }
        uk ukVar = this.b;
        if (!booleanValue) {
            ukVar.loadCallbackFunctionWithErrorMessage("mapJSCallbackV2", this.f978a, PhoneNumberPickerMetric.PICKER_PLAY_SERVICES_NOT_AVAILABLE.getMetricName(), "Phone number picker is not available.");
            return;
        }
        yk ykVar = ukVar.c;
        ykVar.c = new sk(this);
        ykVar.d = false;
        Activity activity = (Activity) ykVar.b.get();
        if (activity != null && !activity.isFinishing()) {
            Identity.getSignInClient((Activity) ykVar.f1096a.f1074a).getPhoneNumberHintIntent(GetPhoneNumberHintIntentRequest.builder().build()).addOnSuccessListener(new wk(ykVar, activity)).addOnFailureListener(new vk(ykVar));
        } else {
            Log.e(yf.a("PhoneNumberAutoFillManager"), "Activity reference not found.");
            ykVar.a(new zk(PhoneNumberAutoFillResultType.ERROR, "Activity reference not found.", null, PhoneNumberPickerMetric.PICKER_ACTIVITY_REFERENCE_ERROR));
        }
    }
}
