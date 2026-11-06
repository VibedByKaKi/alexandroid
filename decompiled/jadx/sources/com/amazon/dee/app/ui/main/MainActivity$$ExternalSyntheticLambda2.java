package com.amazon.dee.app.ui.main;

import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageFilter;
import com.amazon.alexa.smarthomecameras.capabilityagent.LiveViewControllerCapabilityAgentService;
import com.amazon.alexa.smarthomecameras.capabilityagent.LiveViewControllerCapabilityAgentServiceV2;
import com.amazon.alexa.smarthomecameras.view.CamerasViewController;
import com.amazon.alexa.tarazed.account.IdentityEventListener;
import com.amazon.alexa.tarazed.service.DefaultAlexaTarazedService;
import com.amazon.alexa.tasks.BackgroundTaskManager;
import com.amazon.alexa.voice.elements.AlexaCardEventSender;
import com.amazon.alexa.voice.events.AVSEventBusBridge;
import com.amazon.alexa.voice.handsfree.features.AHFComponentCanceller;
import com.amazon.alexa.voice.handsfree.initialization.InitializationModule;
import com.amazon.alexa.voice.model.DefaultVoiceService;
import com.amazon.alexa.voice.nowplaying.NowPlayingStateMonitor;
import com.amazon.alexa.voice.ra.BenefitsEntitlementAuthority;
import com.amazon.alexa.voice.ra.SecureInteractionNotificationReceiver;
import com.amazon.alexa.voice.settings.AMPDHandsFreeHandler;
import com.amazon.alexa.voice.wakeword.WakeWordEventHandler;
import com.amazon.commscore.commsbridge.EventBusBridgeAdapter;
import com.amazon.commscore.commsidentity.implementation.DefaultAlexaCommsCoreIdentityService;
import com.amazon.dee.app.services.icon.DefaultAppIconInitializer;
import com.amazon.dee.app.services.network.reachability.DefaultReachabilityService;
import com.amazon.deecomms.common.CommsInternal;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public final /* synthetic */ class MainActivity$$ExternalSyntheticLambda2 implements MessageFilter {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MainActivity$$ExternalSyntheticLambda2(int i) {
        this.$r8$classId = i;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageFilter
    public final boolean isMatch(Message message) {
        boolean lambda$setNavigationBindings$10;
        boolean lambda$setUpEventBusListener$0;
        boolean lambda$setUpEventBusListener$02;
        boolean lambda$setupLifecycleEventBus$0;
        boolean startListeningForEvents$lambda$0;
        boolean initialize$lambda$0;
        boolean lambda$observeUiLifecycle$0;
        boolean lambda$observeUiLifecycle$2;
        boolean lambda$initialize$0;
        boolean lambda$initialize$02;
        boolean lambda$subscribe$0;
        boolean lambda$subscribeBenefitEntitlement$0;
        boolean lambda$onStartMainActivity$4;
        boolean lambda$onStartMainActivity$6;
        boolean lambda$initialize$03;
        boolean lambda$subscribeToIdentityChangeEvent$0;
        boolean lambda$initialize$04;
        boolean lambda$subscribe$02;
        boolean lambda$onStart$0;
        boolean lambda$new$0;
        boolean lambda$subscribeToIdentityEvents$0;
        boolean lambda$subscribeToIdentityEvents$2;
        boolean lambda$subscribeToIdentityEvents$4;
        boolean lambda$subscribeToIdentityEvents$6;
        boolean initialize$lambda$4$lambda$1;
        boolean lambda$scheduleBottomBarCoachmark$18;
        boolean lambda$scheduleNonCriticalTasks$11;
        boolean lambda$scheduleNonCriticalTasks$13;
        boolean lambda$subscribeToStartupCompleteEvent$4;
        switch (this.$r8$classId) {
            case 0:
                lambda$setNavigationBindings$10 = MainActivity.lambda$setNavigationBindings$10(message);
                return lambda$setNavigationBindings$10;
            case 1:
                lambda$setUpEventBusListener$0 = LiveViewControllerCapabilityAgentService.lambda$setUpEventBusListener$0(message);
                return lambda$setUpEventBusListener$0;
            case 2:
                lambda$setUpEventBusListener$02 = LiveViewControllerCapabilityAgentServiceV2.lambda$setUpEventBusListener$0(message);
                return lambda$setUpEventBusListener$02;
            case 3:
                lambda$setupLifecycleEventBus$0 = CamerasViewController.lambda$setupLifecycleEventBus$0(message);
                return lambda$setupLifecycleEventBus$0;
            case 4:
                startListeningForEvents$lambda$0 = IdentityEventListener.startListeningForEvents$lambda$0(message);
                return startListeningForEvents$lambda$0;
            case 5:
                initialize$lambda$0 = DefaultAlexaTarazedService.initialize$lambda$0(message);
                return initialize$lambda$0;
            case 6:
                lambda$observeUiLifecycle$0 = BackgroundTaskManager.lambda$observeUiLifecycle$0(message);
                return lambda$observeUiLifecycle$0;
            case 7:
                lambda$observeUiLifecycle$2 = BackgroundTaskManager.lambda$observeUiLifecycle$2(message);
                return lambda$observeUiLifecycle$2;
            case 8:
                lambda$initialize$0 = AlexaCardEventSender.lambda$initialize$0(message);
                return lambda$initialize$0;
            case 9:
                lambda$initialize$02 = AVSEventBusBridge.lambda$initialize$0(message);
                return lambda$initialize$02;
            case 10:
                lambda$subscribe$0 = AHFComponentCanceller.lambda$subscribe$0(message);
                return lambda$subscribe$0;
            case 11:
                lambda$subscribeBenefitEntitlement$0 = InitializationModule.lambda$subscribeBenefitEntitlement$0(message);
                return lambda$subscribeBenefitEntitlement$0;
            case 12:
                lambda$onStartMainActivity$4 = DefaultVoiceService.lambda$onStartMainActivity$4(message);
                return lambda$onStartMainActivity$4;
            case 13:
                lambda$onStartMainActivity$6 = DefaultVoiceService.lambda$onStartMainActivity$6(message);
                return lambda$onStartMainActivity$6;
            case 14:
                lambda$initialize$03 = NowPlayingStateMonitor.lambda$initialize$0(message);
                return lambda$initialize$03;
            case 15:
                lambda$subscribeToIdentityChangeEvent$0 = BenefitsEntitlementAuthority.lambda$subscribeToIdentityChangeEvent$0(message);
                return lambda$subscribeToIdentityChangeEvent$0;
            case 16:
                lambda$initialize$04 = SecureInteractionNotificationReceiver.lambda$initialize$0(message);
                return lambda$initialize$04;
            case 17:
                lambda$subscribe$02 = AMPDHandsFreeHandler.lambda$subscribe$0(message);
                return lambda$subscribe$02;
            case 18:
                lambda$onStart$0 = WakeWordEventHandler.lambda$onStart$0(message);
                return lambda$onStart$0;
            case 19:
                lambda$new$0 = EventBusBridgeAdapter.lambda$new$0(message);
                return lambda$new$0;
            case 20:
                lambda$subscribeToIdentityEvents$0 = DefaultAlexaCommsCoreIdentityService.lambda$subscribeToIdentityEvents$0(message);
                return lambda$subscribeToIdentityEvents$0;
            case 21:
                lambda$subscribeToIdentityEvents$2 = DefaultAlexaCommsCoreIdentityService.lambda$subscribeToIdentityEvents$2(message);
                return lambda$subscribeToIdentityEvents$2;
            case 22:
                lambda$subscribeToIdentityEvents$4 = DefaultAlexaCommsCoreIdentityService.lambda$subscribeToIdentityEvents$4(message);
                return lambda$subscribeToIdentityEvents$4;
            case 23:
                lambda$subscribeToIdentityEvents$6 = DefaultAlexaCommsCoreIdentityService.lambda$subscribeToIdentityEvents$6(message);
                return lambda$subscribeToIdentityEvents$6;
            case 24:
                initialize$lambda$4$lambda$1 = DefaultAppIconInitializer.initialize$lambda$4$lambda$1(message);
                return initialize$lambda$4$lambda$1;
            case 25:
                return DefaultReachabilityService.observeSignOut$lambda$2(message);
            case 26:
                lambda$scheduleBottomBarCoachmark$18 = MainViewModel.lambda$scheduleBottomBarCoachmark$18(message);
                return lambda$scheduleBottomBarCoachmark$18;
            case 27:
                lambda$scheduleNonCriticalTasks$11 = MainViewModel.lambda$scheduleNonCriticalTasks$11(message);
                return lambda$scheduleNonCriticalTasks$11;
            case 28:
                lambda$scheduleNonCriticalTasks$13 = MainViewModel.lambda$scheduleNonCriticalTasks$13(message);
                return lambda$scheduleNonCriticalTasks$13;
            default:
                lambda$subscribeToStartupCompleteEvent$4 = CommsInternal.lambda$subscribeToStartupCompleteEvent$4(message);
                return lambda$subscribeToStartupCompleteEvent$4;
        }
    }
}
