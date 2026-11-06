package com.amazon.identity.auth.device;

import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class oh {

    /* renamed from: a, reason: collision with root package name */
    public String f858a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;

    public static oh a(JSONObject jSONObject) {
        oh ohVar = new oh();
        ohVar.f858a = jSONObject.isNull("currentAccountId") ? null : jSONObject.optString("currentAccountId", null);
        ohVar.b = jSONObject.isNull("configHandle") ? null : jSONObject.optString("configHandle", null);
        ohVar.c = jSONObject.isNull("uiCustomizationHandle") ? null : jSONObject.optString("uiCustomizationHandle", null);
        ohVar.d = jSONObject.isNull("sourceActorId") ? null : jSONObject.optString("sourceActorId", null);
        ohVar.e = jSONObject.isNull("transitioningActorId") ? null : jSONObject.optString("transitioningActorId", null);
        ohVar.f = jSONObject.isNull("originatingProgram") ? null : jSONObject.optString("originatingProgram", null);
        ohVar.g = jSONObject.isNull("redirectUrl") ? null : jSONObject.optString("redirectUrl", null);
        ohVar.h = jSONObject.isNull("cancelUrl") ? null : jSONObject.optString("cancelUrl", null);
        return ohVar;
    }
}
