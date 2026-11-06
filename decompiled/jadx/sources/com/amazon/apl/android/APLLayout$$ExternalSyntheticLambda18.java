package com.amazon.apl.android;

import com.amazon.apl.devtools.enums.ViewState;
import com.amazon.apl.devtools.models.ViewTypeTarget;
import com.amazon.dee.app.elements.bridges.ScreenSnapshotModule;
import com.facebook.react.bridge.Promise;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public final /* synthetic */ class APLLayout$$ExternalSyntheticLambda18 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ double f$2;

    public /* synthetic */ APLLayout$$ExternalSyntheticLambda18(ScreenSnapshotModule screenSnapshotModule, double d, Promise promise) {
        this.$r8$classId = 2;
        this.f$0 = screenSnapshotModule;
        this.f$2 = d;
        this.f$1 = promise;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((APLLayout) this.f$0).lambda$changeViewState$15((ViewState) this.f$1, this.f$2);
                break;
            case 1:
                ((ViewTypeTarget) this.f$0).lambda$registerSession$1((com.amazon.apl.devtools.models.Session) this.f$1, this.f$2);
                break;
            default:
                ScreenSnapshotModule.getRootInsets$lambda$24((ScreenSnapshotModule) this.f$0, this.f$2, (Promise) this.f$1);
                break;
        }
    }

    public /* synthetic */ APLLayout$$ExternalSyntheticLambda18(Object obj, Object obj2, double d, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = d;
    }
}
