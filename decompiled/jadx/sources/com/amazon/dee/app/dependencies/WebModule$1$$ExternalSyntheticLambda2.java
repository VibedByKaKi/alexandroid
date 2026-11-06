package com.amazon.dee.app.dependencies;

import com.amazon.dee.app.dependencies.WebModule;
import com.amazon.dee.app.ui.web.DeviceInfo;
import com.amazon.dee.app.ui.web.HouseholdLibraryInfo;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class WebModule$1$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ WebModule$1$$ExternalSyntheticLambda2(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((WebModule.AnonymousClass1) this.f$0).lambda$setHeaderTitle$2((CharSequence) this.f$1);
                break;
            case 1:
                ((WebModule.AnonymousClass1) this.f$0).lambda$setSelectedLibrary$11((HouseholdLibraryInfo) this.f$1);
                break;
            case 2:
                ((WebModule.AnonymousClass1) this.f$0).lambda$setSelectedDevice$4((DeviceInfo) this.f$1);
                break;
            default:
                ((WebModule.AnonymousClass4) this.f$0).lambda$loadUrl$0((String) this.f$1);
                break;
        }
    }
}
