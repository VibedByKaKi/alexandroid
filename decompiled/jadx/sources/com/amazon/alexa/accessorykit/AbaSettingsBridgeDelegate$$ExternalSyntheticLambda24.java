package com.amazon.alexa.accessorykit;

import com.facebook.react.bridge.Promise;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public final /* synthetic */ class AbaSettingsBridgeDelegate$$ExternalSyntheticLambda24 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AbaSettingsBridgeDelegate f$0;
    public final /* synthetic */ String f$1;
    public final /* synthetic */ Promise f$2;

    public /* synthetic */ AbaSettingsBridgeDelegate$$ExternalSyntheticLambda24(AbaSettingsBridgeDelegate abaSettingsBridgeDelegate, String str, Promise promise, int i) {
        this.$r8$classId = i;
        this.f$0 = abaSettingsBridgeDelegate;
        this.f$1 = str;
        this.f$2 = promise;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createSession$33(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$removeDevice$3(this.f$1, this.f$2);
                break;
        }
    }
}
