package com.amazon.identity.auth.device;

import com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommon;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final class rf implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ uf f919a;

    public rf(uf ufVar) {
        this.f919a = ufVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f919a.loadCallbackFunction("mapJSCallback", "{}", JavaScriptBridgeCommon.NOT_SUPPORTED_ERROR);
    }
}
