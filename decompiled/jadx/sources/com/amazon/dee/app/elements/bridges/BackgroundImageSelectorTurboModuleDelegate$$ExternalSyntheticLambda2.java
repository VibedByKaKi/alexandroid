package com.amazon.dee.app.elements.bridges;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class BackgroundImageSelectorTurboModuleDelegate$$ExternalSyntheticLambda2 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ BackgroundImageSelectorTurboModuleDelegate f$0;

    public /* synthetic */ BackgroundImageSelectorTurboModuleDelegate$$ExternalSyntheticLambda2(BackgroundImageSelectorTurboModuleDelegate backgroundImageSelectorTurboModuleDelegate, int i) {
        this.$r8$classId = i;
        this.f$0 = backgroundImageSelectorTurboModuleDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        BackgroundImageSelectorTurboModuleDelegate backgroundImageSelectorTurboModuleDelegate = this.f$0;
        switch (i) {
            case 0:
                backgroundImageSelectorTurboModuleDelegate.lambda$setupBundleInBackground$2();
                break;
            default:
                backgroundImageSelectorTurboModuleDelegate.lambda$destroyBundleInBackground$3();
                break;
        }
    }
}
