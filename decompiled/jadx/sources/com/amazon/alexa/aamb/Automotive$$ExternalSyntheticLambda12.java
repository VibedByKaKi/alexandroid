package com.amazon.alexa.aamb;

import com.amazon.alexa.accessory.Accessory;
import com.amazon.alexa.accessory.frames.eventbus.MediaImportEventBusManager;
import com.amazon.alexa.accessory.notificationpublisher.UserChangeService;
import com.amazon.alexa.accessory.notificationpublisher.eventBus.ContactSyncMessageHandler;
import com.amazon.alexa.accessorykit.factory.MainAppAccessoriesFactory;
import com.amazon.alexa.app.notification.actions.handlers.ExampleHandler;
import com.amazon.alexa.app.notification.actions.handlers.RemindersHandler;
import com.amazon.alexa.app.notification.deeplink.NotificationDeeplinkHandler;
import com.amazon.alexa.app.notification.messaging.adm.AmazonDeviceMessagingService;
import com.amazon.alexa.app.notification.messaging.firebase.FirebaseCloudMessagingService;
import com.amazon.alexa.capabilityagent.cardstudiosurface.core.ItemActivityListener;
import com.amazon.alexa.devicesetup.softap.handler.EchoSoftAPWorkflowHandler;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageHandler;
import com.amazon.alexa.featureservice.implementation.FeatureServiceViewModel;
import com.amazon.alexa.handsfree.settings.quicksettings.AlexaQuickSettingService;
import com.amazon.alexa.handsfree.settings.wakewordsettings.InAppWakeWordSettingsMediator;
import com.amazon.alexa.location.provider.interactor.sync.DemoRulesSyncInteractor;
import com.amazon.alexa.location.provider.interactor.sync.contextualevents.ContextualEventRulesSyncInteractor;
import com.amazon.alexa.mobilytics.integration.ama.DefaultMobilyticsEndpointPicker;
import com.amazon.alexa.mobilytics.integration.ama.MobilyticsUserProviderImpl;
import com.amazon.alexa.navigation.menu.viewcontroller.NavigationViewController;
import com.amazon.alexa.redesign.HomeRoutingAdapter;
import com.amazon.alexa.redesign.repository.IsAppOnlyRepository;
import com.amazon.alexa.redesign.subscriber.EarlyEventBusMessageSubscriber;
import com.amazon.alexa.sharing.media.transmitter.FileTransmitter;
import com.amazon.alexa.sharing.sharingsdk.BenefitsEntitlementAuthority;
import com.amazon.alexa.smarthomecameras.capabilityagent.LiveViewControllerCapabilityAgentService;
import com.amazon.alexa.smarthomecameras.capabilityagent.LiveViewControllerCapabilityAgentServiceV2;
import com.amazon.alexa.smarthomecameras.view.CamerasViewController;
import com.amazon.alexa.tarazed.account.IdentityEventListener;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final /* synthetic */ class Automotive$$ExternalSyntheticLambda12 implements MessageHandler {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;

    public /* synthetic */ Automotive$$ExternalSyntheticLambda12(Object obj, int i) {
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
                ((Automotive) obj).lambda$listenForIdentityChange$0(message);
                break;
            case 1:
                ((MediaImportEventBusManager) obj).lambda$initializeGalleryCountRequestHandler$2(message);
                break;
            case 2:
                MediaImportEventBusManager.lambda$subscribeToEventBusMessages$3((Accessory) obj, message);
                break;
            case 3:
                ((UserChangeService) obj).lambda$start$0(message);
                break;
            case 4:
                ((ContactSyncMessageHandler) obj).handleMessage(message);
                break;
            case 5:
                ((MainAppAccessoriesFactory) obj).lambda$activate$1(message);
                break;
            case 6:
                ((ExampleHandler) obj).lambda$setupEventBusSubscription$0(message);
                break;
            case 7:
                ((RemindersHandler) obj).lambda$setupEventBusSubscription$3(message);
                break;
            case 8:
                ((NotificationDeeplinkHandler) obj).lambda$setupSubscription$0(message);
                break;
            case 9:
                ((AmazonDeviceMessagingService) obj).lambda$observeUserChanges$0(message);
                break;
            case 10:
                ((FirebaseCloudMessagingService) obj).lambda$observeUserChanges$0(message);
                break;
            case 11:
                ItemActivityListener.start$lambda$2$lambda$1((ItemActivityListener) obj, message);
                break;
            case 12:
                ((EchoSoftAPWorkflowHandler) obj).handleEvent(message);
                break;
            case 13:
                ((FeatureServiceViewModel) obj).lambda$setupRealmInstance$3(message);
                break;
            case 14:
                ((AlexaQuickSettingService) obj).lambda$onStartListening$1(message);
                break;
            case 15:
                ((InAppWakeWordSettingsMediator) obj).lambda$subscribe$1(message);
                break;
            case 16:
                ((DemoRulesSyncInteractor) obj).lambda$getMessageHandler$1(message);
                break;
            case 17:
                ((ContextualEventRulesSyncInteractor) obj).lambda$getMessageHandler$1(message);
                break;
            case 18:
                ((DefaultMobilyticsEndpointPicker) obj).lambda$subscribeToEndpointsChanged$0(message);
                break;
            case 19:
                ((MobilyticsUserProviderImpl) obj).lambda$new$0(message);
                break;
            case 20:
                ((NavigationViewController) obj).onElementsToolbarVisibilityInfoChanged(message);
                break;
            case 21:
                HomeRoutingAdapter.createUserChangedEventBus$lambda$7((HomeRoutingAdapter) obj, message);
                break;
            case 22:
                IsAppOnlyRepository.subscribeToSignout$lambda$9((IsAppOnlyRepository) obj, message);
                break;
            case 23:
                EarlyEventBusMessageSubscriber.initSubscriber$lambda$1$lambda$0((EarlyEventBusMessageSubscriber) obj, message);
                break;
            case 24:
                ((FileTransmitter) obj).lambda$observeUserChanges$1(message);
                break;
            case 25:
                ((BenefitsEntitlementAuthority) obj).lambda$subscribeToIdentityChangeEvent$1(message);
                break;
            case 26:
                ((LiveViewControllerCapabilityAgentService) obj).lambda$setUpEventBusListener$1(message);
                break;
            case 27:
                ((LiveViewControllerCapabilityAgentServiceV2) obj).lambda$setUpEventBusListener$1(message);
                break;
            case 28:
                ((CamerasViewController) obj).lambda$setupLifecycleEventBus$1(message);
                break;
            default:
                IdentityEventListener.startListeningForEvents$lambda$1((IdentityEventListener) obj, message);
                break;
        }
    }
}
