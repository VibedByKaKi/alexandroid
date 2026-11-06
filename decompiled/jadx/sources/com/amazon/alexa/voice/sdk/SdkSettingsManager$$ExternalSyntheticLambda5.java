package com.amazon.alexa.voice.sdk;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class SdkSettingsManager$$ExternalSyntheticLambda5 implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SdkSettingsManager f$0;

    public /* synthetic */ SdkSettingsManager$$ExternalSyntheticLambda5(SdkSettingsManager sdkSettingsManager, int i) {
        this.$r8$classId = i;
        this.f$0 = sdkSettingsManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        SdkSettingsManager sdkSettingsManager = this.f$0;
        switch (i) {
            case 0:
                sdkSettingsManager.cancelPendingCompare();
                break;
            default:
                sdkSettingsManager.startVoxCompare();
                break;
        }
    }
}
