package com.amazon.leapfrogmapgl.indoor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class NativeIndoorViewManager$$ExternalSyntheticLambda1 implements Runnable {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ NativeIndoorViewManager f$0;
    public final /* synthetic */ IndoorMapViewHandle f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ String f$3;

    public /* synthetic */ NativeIndoorViewManager$$ExternalSyntheticLambda1(NativeIndoorViewManager nativeIndoorViewManager, IndoorMapViewHandle indoorMapViewHandle, String str, boolean z) {
        this.f$0 = nativeIndoorViewManager;
        this.f$1 = indoorMapViewHandle;
        this.f$3 = str;
        this.f$2 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                NativeIndoorViewManager.applyMapNavigationJson$lambda$74(this.f$0, this.f$1, this.f$2, this.f$3);
                break;
            default:
                NativeIndoorViewManager.applyMapNavigationJson$lambda$77(this.f$0, this.f$1, this.f$3, this.f$2);
                break;
        }
    }

    public /* synthetic */ NativeIndoorViewManager$$ExternalSyntheticLambda1(NativeIndoorViewManager nativeIndoorViewManager, IndoorMapViewHandle indoorMapViewHandle, boolean z, String str) {
        this.f$0 = nativeIndoorViewManager;
        this.f$1 = indoorMapViewHandle;
        this.f$2 = z;
        this.f$3 = str;
    }
}
