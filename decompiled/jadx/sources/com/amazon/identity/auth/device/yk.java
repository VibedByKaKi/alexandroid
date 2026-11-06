package com.amazon.identity.auth.device;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.amazon.identity.auth.device.framework.phonenumberautofill.PhoneNumberAutoFillResultType;
import com.amazon.identity.auth.device.framework.phonenumberautofill.PhoneNumberPickerMetric;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class yk {

    /* renamed from: a, reason: collision with root package name */
    public final xk f1096a;
    public final WeakReference b;
    public sk c;
    public boolean d;

    public yk(AuthPortalUIActivity authPortalUIActivity) {
        xk xkVar = new xk(authPortalUIActivity);
        this.b = new WeakReference(authPortalUIActivity);
        this.f1096a = xkVar;
    }

    public static zk a(int i, Intent intent) {
        Log.i(yf.a("PhoneNumberAutoFillManager"), "Handling phone number selected result.");
        if (i != -1) {
            if (i == 1002) {
                Log.i(yf.a("PhoneNumberAutoFillManager"), "No Available hint");
                return new zk(PhoneNumberAutoFillResultType.NO_HINTS_AVAILABLE, "No Available hint", null, PhoneNumberPickerMetric.PICKER_NO_HINTS_AVAILABLE);
            }
            Log.i(yf.a("PhoneNumberAutoFillManager"), "Hint Read cancelled");
            return new zk(PhoneNumberAutoFillResultType.CANCELLED, "Hint Read cancelled", null, PhoneNumberPickerMetric.PICKER_CANCELLED);
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            Log.e(yf.a("PhoneNumberAutoFillManager"), "No extras found in intent");
            return new zk(PhoneNumberAutoFillResultType.ERROR, "No extras found in intent", null, PhoneNumberPickerMetric.PICKER_NO_EXTRAS_IN_INTENT);
        }
        String string = extras.getString("phone_number_hint_result");
        if (string != null) {
            return new zk(PhoneNumberAutoFillResultType.OK, null, string, PhoneNumberPickerMetric.PICKER_PHONE_NUMBER_SELECTED);
        }
        Log.e(yf.a("PhoneNumberAutoFillManager"), "Phone number not found in intent extras");
        return new zk(PhoneNumberAutoFillResultType.ERROR, "Phone number not found in intent extras", null, PhoneNumberPickerMetric.PICKER_PHONE_NUMBER_NOT_IN_EXTRAS);
    }

    public final void a(zk zkVar) {
        sk skVar = this.c;
        if (skVar == null) {
            Log.w(yf.a("PhoneNumberAutoFillManager"), "got null consumer callback, there may be errors when sending hint request");
            return;
        }
        try {
            JSONObject putOpt = new JSONObject().putOpt("phoneNumber", zkVar.c).putOpt("pickerShown", Boolean.valueOf(skVar.f942a.b.c.d));
            PhoneNumberPickerMetric phoneNumberPickerMetric = zkVar.d;
            putOpt.putOpt("metric", phoneNumberPickerMetric != null ? phoneNumberPickerMetric.getMetricName() : null);
            tk tkVar = skVar.f942a;
            tkVar.b.loadCallbackFunction("mapJSCallbackV2", tkVar.f978a, putOpt.toString());
        } catch (JSONException unused) {
            tk tkVar2 = skVar.f942a;
            tkVar2.b.loadCallbackFunctionWithErrorMessage("mapJSCallbackV2", tkVar2.f978a, PhoneNumberPickerMetric.PICKER_JSON_PARSING_ERROR.getMetricName(), "Parsing Error Occurred");
        }
        this.c = null;
    }
}
