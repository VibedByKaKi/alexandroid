package com.amazon.dee.app.ui.web;

import com.amazon.dee.app.ui.web.FeedbackBridge;
import com.amazon.dee.app.ui.web.OOBEBridge;
import com.google.gson.JsonObject;
import org.json.JSONObject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class FeedbackBridge$SendFeedbackMethod$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ JavaScriptBridgeMethod f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ JavaScriptResponse f$2;

    public /* synthetic */ FeedbackBridge$SendFeedbackMethod$$ExternalSyntheticLambda0(JavaScriptBridgeMethod javaScriptBridgeMethod, Object obj, JavaScriptResponse javaScriptResponse, int i) {
        this.$r8$classId = i;
        this.f$0 = javaScriptBridgeMethod;
        this.f$1 = obj;
        this.f$2 = javaScriptResponse;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((FeedbackBridge.SendFeedbackMethod) this.f$0).lambda$execute$2((JsonObject) this.f$1, this.f$2);
                break;
            default:
                ((OOBEBridge.StartTachyonOOBEMethod) this.f$0).lambda$execute$1((JSONObject) this.f$1, this.f$2);
                break;
        }
    }
}
