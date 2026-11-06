package com.amazon.dee.app.elements.bridges;

import com.facebook.react.bridge.Promise;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class DialogModule$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Promise f$0;
    public final /* synthetic */ String f$1;

    public /* synthetic */ DialogModule$$ExternalSyntheticLambda0(String str, int i, Promise promise) {
        this.$r8$classId = i;
        this.f$0 = promise;
        this.f$1 = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.resolve(this.f$1);
                break;
            default:
                this.f$0.resolve(this.f$1);
                break;
        }
    }
}
