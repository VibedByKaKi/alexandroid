package com.amazon.identity.auth.device;

import android.os.Bundle;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import com.amazon.identity.auth.device.api.MAPActorManager;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class c3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Bundle f552a;
    public final /* synthetic */ d3 b;

    public c3(d3 d3Var, Bundle bundle) {
        this.b = d3Var;
        this.f552a = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle m = ErrorUtils$$ExternalSyntheticOutline0.m(1, "result_code");
        m.putString(MAPActorManager.KEY_ACTOR_ACCESS_TOKEN, this.f552a.getString("value_key"));
        this.b.f570a.onSuccess(m);
    }
}
