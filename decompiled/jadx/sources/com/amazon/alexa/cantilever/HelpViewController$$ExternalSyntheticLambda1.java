package com.amazon.alexa.cantilever;

import android.webkit.ValueCallback;
import com.facebook.react.bridge.Callback;
import com.facebook.react.modules.network.ForwardingCookieHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class HelpViewController$$ExternalSyntheticLambda1 implements ValueCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ HelpViewController$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.f$0;
        switch (i) {
            case 0:
                ((HelpViewController) obj2).lambda$onShareClicked$1((String) obj);
                break;
            default:
                ForwardingCookieHandler.clearCookies$lambda$0((Callback) obj2, (Boolean) obj);
                break;
        }
    }
}
