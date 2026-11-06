package com.amazon.alexa.voice.sdk;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class SdkSettingsManager$$ExternalSyntheticLambda2 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ SdkSettingsManager f$0;

    public /* synthetic */ SdkSettingsManager$$ExternalSyntheticLambda2(SdkSettingsManager sdkSettingsManager, int i) {
        this.$r8$classId = i;
        this.f$0 = sdkSettingsManager;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    /* renamed from: handle */
    public final void lambda$subscribe$1(Message message) {
        int i = this.$r8$classId;
        SdkSettingsManager sdkSettingsManager = this.f$0;
        switch (i) {
            case 0:
                sdkSettingsManager.lambda$subscribeToProfileChangeEvent$4(message);
                break;
            default:
                sdkSettingsManager.lambda$subscribeToIdentityChangeEvent$2(message);
                break;
        }
    }
}
