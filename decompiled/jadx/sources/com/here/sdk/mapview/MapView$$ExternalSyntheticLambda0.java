package com.here.sdk.mapview;

import com.here.sdk.mapview.MapViewInternalHsdk;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class MapView$$ExternalSyntheticLambda0 implements MapViewInternalHsdk.SetValidSceneConfigurationCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ WeakReference f$0;

    public /* synthetic */ MapView$$ExternalSyntheticLambda0(WeakReference weakReference, int i) {
        this.$r8$classId = i;
        this.f$0 = weakReference;
    }

    @Override // com.here.sdk.mapview.MapViewInternalHsdk.SetValidSceneConfigurationCallback
    public final void onSceneConfigurationSet(boolean z) {
        int i = this.$r8$classId;
        WeakReference weakReference = this.f$0;
        switch (i) {
            case 0:
                MapView.lambda$onCreate$0(weakReference, z);
                break;
            case 1:
                MapSurface.lambda$setSurface$1(weakReference, z);
                break;
            default:
                MapSurface.lambda$new$0(weakReference, z);
                break;
        }
    }
}
