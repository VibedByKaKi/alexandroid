package com.amazon.dee.app.elements.bridges;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final /* synthetic */ class AlexaDeviceBackgroundImageModule$$ExternalSyntheticLambda0 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AlexaDeviceBackgroundImageModule f$0;

    public /* synthetic */ AlexaDeviceBackgroundImageModule$$ExternalSyntheticLambda0(AlexaDeviceBackgroundImageModule alexaDeviceBackgroundImageModule, int i) {
        this.$r8$classId = i;
        this.f$0 = alexaDeviceBackgroundImageModule;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        AlexaDeviceBackgroundImageModule alexaDeviceBackgroundImageModule = this.f$0;
        switch (i) {
            case 0:
                alexaDeviceBackgroundImageModule.lambda$destroyBundleInBackground$3();
                break;
            default:
                alexaDeviceBackgroundImageModule.lambda$setupBundleInBackground$2();
                break;
        }
    }
}
