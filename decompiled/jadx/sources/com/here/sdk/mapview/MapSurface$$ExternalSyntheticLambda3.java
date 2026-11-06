package com.here.sdk.mapview;

import com.here.sdk.mapview.MapView;
import com.here.sdk.mapview.MapViewInternalHsdk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class MapSurface$$ExternalSyntheticLambda3 implements MapViewInternalHsdk.RedrawCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ MapSurface$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.here.sdk.mapview.MapViewInternalHsdk.RedrawCallback
    public final void onRedrawCompleted() {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                MapSurface.lambda$redraw$2((Runnable) obj);
                break;
            default:
                ((MapView.RenderSurfaceHandler) obj).lambda$surfaceRedrawNeededAsync$1();
                break;
        }
    }
}
