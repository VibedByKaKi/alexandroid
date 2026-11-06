package com.amazon.identity.auth.accounts;

import android.content.Context;
import android.util.Log;
import com.amazon.identity.auth.device.le;
import com.amazon.identity.auth.device.yf;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final le f405a;

    public x(Context context) {
        this.f405a = le.b(context, "map_p2a_transition");
    }

    public final P2ATransitionStateMachine$State a() {
        String string = this.f405a.f789a.getString("state", null);
        if (string == null) {
            return null;
        }
        try {
            return P2ATransitionStateMachine$State.valueOf(string);
        } catch (IllegalArgumentException e) {
            Log.w(yf.a("P2ATransitionStateMachine"), com.amazon.identity.auth.device.d0.a("Unknown P2A state: ", string, ", cleaning up."), e);
            this.f405a.a();
            return null;
        }
    }
}
