package com.amazon.leapfrogmapgl.indoor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class NativeIndoorViewManager$$ExternalSyntheticLambda3 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ NativeIndoorViewManager f$0;
    public final /* synthetic */ IndoorMapViewHandle f$1;

    public /* synthetic */ NativeIndoorViewManager$$ExternalSyntheticLambda3(IndoorMapViewHandle indoorMapViewHandle, NativeIndoorViewManager nativeIndoorViewManager, int i) {
        this.$r8$classId = i;
        this.f$1 = indoorMapViewHandle;
        this.f$0 = nativeIndoorViewManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                NativeIndoorViewManager.applyMapNavigationJson$lambda$76(this.f$0, this.f$1);
                break;
            case 1:
                this.f$0.forceMapRepaint(this.f$1);
                break;
            case 2:
                NativeIndoorViewManager.setMaxPitch$lambda$65(this.f$1, this.f$0);
                break;
            case 3:
                this.f$0.forceMapRepaint(this.f$1);
                break;
            case 4:
                NativeIndoorViewManager.createViewInstance$lambda$31$lambda$30(this.f$1, this.f$0);
                break;
            case 5:
                NativeIndoorViewManager.updateFollowForSceneUpdate$lambda$2(this.f$1, this.f$0);
                break;
            default:
                this.f$0.markOpeningSettled(this.f$1, "fallback");
                break;
        }
    }

    public /* synthetic */ NativeIndoorViewManager$$ExternalSyntheticLambda3(NativeIndoorViewManager nativeIndoorViewManager, IndoorMapViewHandle indoorMapViewHandle, int i) {
        this.$r8$classId = i;
        this.f$0 = nativeIndoorViewManager;
        this.f$1 = indoorMapViewHandle;
    }
}
