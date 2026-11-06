package com.amazon.alexa.voice.events;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;
import com.amazon.alexa.tarazed.dmps.DMPSHandlerDefault;
import com.amazon.alexa.tarazed.routing.RouteProviderAlexaMobile;
import com.amazon.alexa.voice.elements.AlexaCardEventSender;
import com.amazon.alexa.voice.handsfree.features.AHFComponentCanceller;
import com.amazon.alexa.voice.nowplaying.NowPlayingStateMonitor;
import com.amazon.alexa.voice.nowplaying.bridge.VoiceNowPlayingEventBusModule;
import com.amazon.alexa.voice.ra.BenefitsEntitlementAuthority;
import com.amazon.alexa.voice.ra.SecureInteractionNotificationReceiver;
import com.amazon.alexa.voice.sdk.SdkSelectionOrchestrator;
import com.amazon.alexa.voice.settings.AMPDHandsFreeHandler;
import com.amazon.comms.calling.data.network.EventBusProviderImpl;
import com.amazon.commscore.commsbridge.EventBusBridgeAdapter;
import com.amazon.dee.app.elements.bridges.EventBusModule;
import com.amazon.dee.app.elements.bridges.NativeEventBusDelegate;
import com.amazon.dee.app.services.clouddrive.AlexaCloudDriveService;
import com.amazon.dee.app.ui.util.CacheClearOperations;
import com.amazon.dee.app.ui.voiceenrollment.VoiceEnrollmentLauncher;
import com.amazon.deecomms.media.photos.FileTransmitter;
import com.dee.app.contactsLibrary.db.reduxpersist.RequestResponseEventBus;
import rx.subjects.PublishSubject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public final /* synthetic */ class AVSEventBusBridge$$ExternalSyntheticLambda1 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ AVSEventBusBridge$$ExternalSyntheticLambda1(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageHandler
    /* renamed from: handle */
    public final void lambda$subscribe$1(Message message) {
        int i = this.$r8$classId;
        Object obj = this.f$0;
        switch (i) {
            case 0:
                ((AVSEventBusBridge) obj).handleRequest(message);
                break;
            case 1:
                DMPSHandlerDefault.subscribe$lambda$1((DMPSHandlerDefault) obj, message);
                break;
            case 2:
                RouteProviderAlexaMobile.subscribe$lambda$2((RouteProviderAlexaMobile) obj, message);
                break;
            case 3:
                ((AlexaCardEventSender) obj).lambda$initialize$1(message);
                break;
            case 4:
                ((AHFComponentCanceller) obj).lambda$subscribe$1(message);
                break;
            case 5:
                ((NowPlayingStateMonitor) obj).onMediaPlaybackStateChanged(message);
                break;
            case 6:
                ((VoiceNowPlayingEventBusModule) obj).handleEntertainmentToVoiceMessage(message);
                break;
            case 7:
                ((BenefitsEntitlementAuthority) obj).lambda$subscribeToIdentityChangeEvent$1(message);
                break;
            case 8:
                ((SecureInteractionNotificationReceiver) obj).onSecureInteractionNotificationReceived(message);
                break;
            case 9:
                ((SdkSelectionOrchestrator) obj).lambda$subscribeToEntitlementUpdates$6(message);
                break;
            case 10:
                ((AMPDHandsFreeHandler) obj).lambda$subscribe$1(message);
                break;
            case 11:
                EventBusProviderImpl.subscribeTo$lambda$4((EventBusProviderImpl) obj, message);
                break;
            case 12:
                ((EventBusBridgeAdapter) obj).onReactEBMessage(message);
                break;
            case 13:
                ((EventBusModule) obj).handle(message);
                break;
            case 14:
                ((NativeEventBusDelegate) obj).handle(message);
                break;
            case 15:
                AlexaCloudDriveService.observeUserChanges$lambda$4((AlexaCloudDriveService) obj, message);
                break;
            case 16:
                ((CacheClearOperations) obj).lambda$start$0(message);
                break;
            case 17:
                ((VoiceEnrollmentLauncher) obj).lambda$launch$0(message);
                break;
            case 18:
                ((FileTransmitter) obj).lambda$observeUserChanges$1(message);
                break;
            default:
                RequestResponseEventBus.lambda$processEventBus$1((PublishSubject) obj, message);
                break;
        }
    }
}
