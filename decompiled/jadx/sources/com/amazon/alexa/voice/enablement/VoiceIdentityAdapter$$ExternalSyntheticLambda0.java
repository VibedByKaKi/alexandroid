package com.amazon.alexa.voice.enablement;

import android.content.Context;
import com.amazon.alexa.biloba.view.dashboard.RemoteManagementInactivityHandler;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;
import com.amazon.alexa.eventbus.api.MultiFilterSubscriber;
import com.amazon.alexa.identity.api.IdentityService;
import com.amazon.alexa.sharing.media.clouddrive.SharedPreferenceEndpointsCache;
import com.amazon.alexa.tarazed.service.DefaultAlexaTarazedService;
import com.amazon.alexa.voice.enablement.VoiceIdentityAdapter;
import com.amazon.alexa.voice.handsfree.initialization.InitializationModule;
import com.amazon.dee.app.services.photos.PhotoServiceFactory;
import com.amazon.deecomms.conversation.CommsConversationService;
import com.amazon.deecomms.media.photos.MAPAuthenticatedURLConnectionFactory;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class VoiceIdentityAdapter$$ExternalSyntheticLambda0 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ VoiceIdentityAdapter$$ExternalSyntheticLambda0(Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    /* renamed from: handle */
    public final void lambda$subscribe$1(Message message) {
        switch (this.$r8$classId) {
            case 0:
                ((VoiceIdentityAdapter) this.f$0).lambda$registerUserIdentityChange$3((VoiceIdentityAdapter.UserIdentityChangedListener) this.f$1, message);
                break;
            case 1:
                ((RemoteManagementInactivityHandler) this.f$0).lambda$getPermissionDeniedSubscriberHandler$4((Context) this.f$1, message);
                break;
            case 2:
                ((SharedPreferenceEndpointsCache) this.f$0).lambda$new$1((IdentityService) this.f$1, message);
                break;
            case 3:
                DefaultAlexaTarazedService.initialize$lambda$1((DefaultAlexaTarazedService) this.f$0, (MultiFilterSubscriber) this.f$1, message);
                break;
            case 4:
                ((VoiceIdentityAdapter) this.f$0).lambda$subscribeToUserUpdates$0((VoiceIdentityAdapter.UserReadyForVoiceCallback) this.f$1, message);
                break;
            case 5:
                ((InitializationModule) this.f$0).lambda$subscribeBenefitEntitlement$1((Context) this.f$1, message);
                break;
            case 6:
                com.amazon.dee.app.services.clouddrive.SharedPreferenceEndpointsCache._init_$lambda$0((com.amazon.dee.app.services.clouddrive.SharedPreferenceEndpointsCache) this.f$0, (IdentityService) this.f$1, message);
                break;
            case 7:
                PhotoServiceFactory._init_$lambda$2((PhotoServiceFactory) this.f$0, (IdentityService) this.f$1, message);
                break;
            case 8:
                ((CommsConversationService) this.f$0).lambda$initializeComms$1((IdentityService) this.f$1, message);
                break;
            case 9:
                ((MAPAuthenticatedURLConnectionFactory) this.f$0).lambda$new$1((IdentityService) this.f$1, message);
                break;
            default:
                ((com.amazon.deecomms.media.photos.SharedPreferenceEndpointsCache) this.f$0).lambda$new$1((IdentityService) this.f$1, message);
                break;
        }
    }
}
