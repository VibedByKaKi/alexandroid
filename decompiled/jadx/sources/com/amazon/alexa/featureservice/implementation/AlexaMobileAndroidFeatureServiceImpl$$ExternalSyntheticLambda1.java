package com.amazon.alexa.featureservice.implementation;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class AlexaMobileAndroidFeatureServiceImpl$$ExternalSyntheticLambda1 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AlexaMobileAndroidFeatureServiceImpl f$0;

    public /* synthetic */ AlexaMobileAndroidFeatureServiceImpl$$ExternalSyntheticLambda1(AlexaMobileAndroidFeatureServiceImpl alexaMobileAndroidFeatureServiceImpl, int i) {
        this.$r8$classId = i;
        this.f$0 = alexaMobileAndroidFeatureServiceImpl;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    /* renamed from: handle */
    public final void lambda$subscribe$1(Message message) {
        int i = this.$r8$classId;
        AlexaMobileAndroidFeatureServiceImpl alexaMobileAndroidFeatureServiceImpl = this.f$0;
        switch (i) {
            case 0:
                alexaMobileAndroidFeatureServiceImpl.lambda$subscribeToAppUpgraded$5(message);
                break;
            case 1:
                alexaMobileAndroidFeatureServiceImpl.lambda$subscribeToAppAuthenticatedEvent$1(message);
                break;
            default:
                alexaMobileAndroidFeatureServiceImpl.lambda$subscribeToSignOut$3(message);
                break;
        }
    }
}
