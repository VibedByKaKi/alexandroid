package com.amazon.identity.auth.device;

import ai.onnxruntime.OnnxMap$$ExternalSyntheticBUOutline0;
import android.content.Context;
import android.os.Build;
import org.json.JSONException;
import org.json.JSONObject;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ph {
    public static ph b;

    /* renamed from: a, reason: collision with root package name */
    public final le f878a;

    public ph(Context context) {
        this.f878a = le.a(context.getApplicationContext(), "map_p2a_confirmation");
    }

    public final void a(long j, String str, String str2, String str3) {
        if (str2 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("action");
            return;
        }
        if (str3 == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("transitionId");
            return;
        }
        ad adVar = new ad(j, str2, str3);
        le leVar = this.f878a;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", adVar.f454a);
            jSONObject.put("confirmation_timestamp", adVar.b);
            jSONObject.put("transition_id", adVar.c);
            leVar.a(str, jSONObject.toString());
            yf.a("P2AConfirmationStore");
            "user".equalsIgnoreCase(Build.TYPE);
        } catch (JSONException e) {
            OnnxMap$$ExternalSyntheticBUOutline0.m("Failed to serialize ConfirmationRecord", e);
        }
    }
}
