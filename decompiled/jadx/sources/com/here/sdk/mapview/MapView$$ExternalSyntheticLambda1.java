package com.here.sdk.mapview;

import com.here.sdk.mapview.MapView;
import com.here.sdk.mapview.MapViewInternalHsdk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes8.dex */
public final /* synthetic */ class MapView$$ExternalSyntheticLambda1 implements MapViewInternalHsdk.TakeScreenshotCallback {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MapView.TakeScreenshotCallback f$0;

    public /* synthetic */ MapView$$ExternalSyntheticLambda1(MapView.TakeScreenshotCallback takeScreenshotCallback, int i) {
        this.$r8$classId = i;
        this.f$0 = takeScreenshotCallback;
    }

    @Override // com.here.sdk.mapview.MapViewInternalHsdk.TakeScreenshotCallback
    public final void onScreenshotTaken(byte[] bArr) {
        int i = this.$r8$classId;
        MapView.TakeScreenshotCallback takeScreenshotCallback = this.f$0;
        switch (i) {
            case 0:
                MapView.lambda$takeScreenshot$1(takeScreenshotCallback, bArr);
                break;
            default:
                MapSurface.lambda$takeScreenshot$3(takeScreenshotCallback, bArr);
                break;
        }
    }
}
