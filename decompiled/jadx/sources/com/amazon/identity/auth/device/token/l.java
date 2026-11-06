package com.amazon.identity.auth.device.token;

import android.os.Bundle;
import com.amazon.identity.auth.device.token.IInternalListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class l extends IInternalListener.Stub {

    /* renamed from: a, reason: collision with root package name */
    public final c f992a;

    public l(c cVar) {
        this.f992a = cVar;
    }

    @Override // com.amazon.identity.auth.device.token.IInternalListener
    public final void finish(Bundle bundle) {
        c cVar = this.f992a;
        if (cVar != null) {
            cVar.finish(bundle);
        }
    }
}
