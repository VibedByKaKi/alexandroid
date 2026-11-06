package com.amazon.alexa.voiceui;

import android.os.Bundle;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DefaultSaveInstanceStateHandler implements SaveInstanceStateHandler {
    private final RouterDelegate routerDelegate;

    public DefaultSaveInstanceStateHandler(RouterDelegate routerDelegate) {
        this.routerDelegate = routerDelegate;
    }

    @Override // com.amazon.alexa.voiceui.SaveInstanceStateHandler
    public void onSaveInstanceState(Bundle bundle) {
        this.routerDelegate.saveInstanceState(bundle);
    }
}
