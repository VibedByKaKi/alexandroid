package com.amazon.identity.auth.device;

import android.os.Bundle;
import com.amazon.identity.auth.device.api.Callback;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class pk implements Callback {

    /* renamed from: a, reason: collision with root package name */
    public final String f880a;
    public final /* synthetic */ qk b;

    public pk(qk qkVar, String str) {
        this.b = qkVar;
        this.f880a = str;
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onError(Bundle bundle) {
        List b;
        qk qkVar = this.b;
        String str = this.f880a;
        synchronized (qkVar) {
            b = qkVar.b(str);
            if (b.size() > 0) {
                qkVar.a(str);
            }
        }
        Iterator it2 = b.iterator();
        while (it2.hasNext()) {
            ((Callback) it2.next()).onError(bundle);
        }
        b.clear();
    }

    @Override // com.amazon.identity.auth.device.api.Callback
    public final void onSuccess(Bundle bundle) {
        List b;
        qk qkVar = this.b;
        String str = this.f880a;
        synchronized (qkVar) {
            b = qkVar.b(str);
            if (b.size() > 0) {
                qkVar.a(str);
            }
        }
        Iterator it2 = b.iterator();
        while (it2.hasNext()) {
            ((Callback) it2.next()).onSuccess(bundle);
        }
        b.clear();
    }
}
