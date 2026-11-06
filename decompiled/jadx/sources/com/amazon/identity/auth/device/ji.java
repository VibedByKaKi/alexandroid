package com.amazon.identity.auth.device;

import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class ji {

    /* renamed from: a, reason: collision with root package name */
    public final JSONObject f751a;
    public final Integer b;
    public final Exception c;
    public final Integer d;

    public ji(Integer num, JSONObject jSONObject, Exception exc, Integer num2) {
        this.b = num;
        this.f751a = jSONObject;
        this.c = exc;
        this.d = num2;
    }

    public final void a() {
        Exception exc = this.c;
        if (exc != null) {
            if (exc instanceof IOException) {
                throw ((IOException) exc);
            }
            if (exc instanceof JSONException) {
                throw ((JSONException) exc);
            }
        }
    }
}
