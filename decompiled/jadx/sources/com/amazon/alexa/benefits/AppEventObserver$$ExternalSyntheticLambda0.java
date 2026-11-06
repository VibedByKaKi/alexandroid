package com.amazon.alexa.benefits;

import com.amazon.alexa.accessorykit.cloudpairing.keyrotation.CloudPairingNotificationEmitter;
import com.amazon.alexa.accessorykit.factory.MainAppAccessoriesFactory;
import com.amazon.alexa.accessorykit.interprocess.cookie.CookieChangeEmitter;
import com.amazon.alexa.assetManagementService.service.GetAssetURLService;
import com.amazon.alexa.biloba.view.RootViewControllerFactory;
import com.amazon.alexa.capabilityagent.cardstudiosurface.core.ItemActivityListener;
import com.amazon.alexa.eventbus.api.Message;
import com.amazon.alexa.eventbus.api.MessageFilter;
import com.amazon.alexa.featureservice.implementation.AlexaMobileAndroidFeatureServiceImpl;
import com.amazon.alexa.featureservice.implementation.FeatureServiceViewModel;
import com.amazon.alexa.featureservice.sessionManagement.SessionManager;
import com.amazon.alexa.handsfree.settings.quicksettings.AlexaQuickSettingService;
import com.amazon.alexa.handsfree.settings.wakewordsettings.InAppWakeWordSettingsMediator;
import com.amazon.alexa.location.GeofenceEventHandler;
import com.amazon.alexa.location.UserChangeSubjectFactory;
import com.amazon.alexa.location.provider.interactor.sync.DemoRulesSyncInteractor;
import com.amazon.alexa.location.provider.interactor.sync.contextualevents.ContextualEventRulesSyncInteractor;
import com.amazon.alexa.mobilytics.integration.ama.message.eventBus.MobilyticsEventBusMessageProvider;
import com.amazon.alexa.redesign.repository.IsAppOnlyRepository;
import com.amazon.alexa.sharing.media.clouddrive.SharedPreferenceEndpointsCache;
import com.amazon.alexa.sharing.media.transmitter.FileTransmitter;
import com.amazon.alexa.sharing.sharingsdk.BenefitsEntitlementAuthority;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final /* synthetic */ class AppEventObserver$$ExternalSyntheticLambda0 implements MessageFilter {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AppEventObserver$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // com.amazon.alexa.eventbus.api.MessageFilter
    public final boolean isMatch(Message message) {
        boolean lambda$registerSignOutObserver$2;
        boolean lambda$subscribeToCloudPairingNotification$0;
        boolean lambda$activate$0;
        boolean lambda$subscribeToCookieChangeNotification$0;
        boolean lambda$subscribeToElements$2;
        boolean lambda$subscribeToSignOut$0;
        boolean lambda$registerBetaStatusChangeObserver$4;
        boolean lambda$registerProfileSelectionAttempt$0;
        boolean lambda$subscribeToSignout$2;
        boolean lambda$resetTTCFWhenAppBackgrounds$0;
        boolean start$lambda$2$lambda$0;
        boolean lambda$subscribeToAppUpgraded$4;
        boolean lambda$subscribeToAppAuthenticatedEvent$0;
        boolean lambda$subscribeToSignOut$2;
        boolean lambda$setupRealmInstance$2;
        boolean lambda$onAppForegrounded$4;
        boolean lambda$initialize$0;
        boolean lambda$onAppBackgrounded$2;
        boolean lambda$onStartListening$0;
        boolean lambda$subscribe$0;
        boolean lambda$toggleEventBusSubscription$2;
        boolean lambda$init$0;
        boolean lambda$getMessageFilter$0;
        boolean lambda$getMessageFilter$02;
        boolean lambda$new$0;
        boolean lambda$new$2;
        boolean subscribeToSignout$lambda$5;
        boolean lambda$new$02;
        boolean lambda$observeUserChanges$0;
        boolean lambda$subscribeToIdentityChangeEvent$0;
        switch (this.$r8$classId) {
            case 0:
                lambda$registerSignOutObserver$2 = AppEventObserver.lambda$registerSignOutObserver$2(message);
                return lambda$registerSignOutObserver$2;
            case 1:
                lambda$subscribeToCloudPairingNotification$0 = CloudPairingNotificationEmitter.lambda$subscribeToCloudPairingNotification$0(message);
                return lambda$subscribeToCloudPairingNotification$0;
            case 2:
                lambda$activate$0 = MainAppAccessoriesFactory.lambda$activate$0(message);
                return lambda$activate$0;
            case 3:
                lambda$subscribeToCookieChangeNotification$0 = CookieChangeEmitter.lambda$subscribeToCookieChangeNotification$0(message);
                return lambda$subscribeToCookieChangeNotification$0;
            case 4:
                lambda$subscribeToElements$2 = GetAssetURLService.lambda$subscribeToElements$2(message);
                return lambda$subscribeToElements$2;
            case 5:
                lambda$subscribeToSignOut$0 = GetAssetURLService.lambda$subscribeToSignOut$0(message);
                return lambda$subscribeToSignOut$0;
            case 6:
                lambda$registerBetaStatusChangeObserver$4 = AppEventObserver.lambda$registerBetaStatusChangeObserver$4(message);
                return lambda$registerBetaStatusChangeObserver$4;
            case 7:
                lambda$registerProfileSelectionAttempt$0 = AppEventObserver.lambda$registerProfileSelectionAttempt$0(message);
                return lambda$registerProfileSelectionAttempt$0;
            case 8:
                lambda$subscribeToSignout$2 = RootViewControllerFactory.lambda$subscribeToSignout$2(message);
                return lambda$subscribeToSignout$2;
            case 9:
                lambda$resetTTCFWhenAppBackgrounds$0 = RootViewControllerFactory.lambda$resetTTCFWhenAppBackgrounds$0(message);
                return lambda$resetTTCFWhenAppBackgrounds$0;
            case 10:
                start$lambda$2$lambda$0 = ItemActivityListener.start$lambda$2$lambda$0(message);
                return start$lambda$2$lambda$0;
            case 11:
                lambda$subscribeToAppUpgraded$4 = AlexaMobileAndroidFeatureServiceImpl.lambda$subscribeToAppUpgraded$4(message);
                return lambda$subscribeToAppUpgraded$4;
            case 12:
                lambda$subscribeToAppAuthenticatedEvent$0 = AlexaMobileAndroidFeatureServiceImpl.lambda$subscribeToAppAuthenticatedEvent$0(message);
                return lambda$subscribeToAppAuthenticatedEvent$0;
            case 13:
                lambda$subscribeToSignOut$2 = AlexaMobileAndroidFeatureServiceImpl.lambda$subscribeToSignOut$2(message);
                return lambda$subscribeToSignOut$2;
            case 14:
                lambda$setupRealmInstance$2 = FeatureServiceViewModel.lambda$setupRealmInstance$2(message);
                return lambda$setupRealmInstance$2;
            case 15:
                lambda$onAppForegrounded$4 = SessionManager.lambda$onAppForegrounded$4(message);
                return lambda$onAppForegrounded$4;
            case 16:
                lambda$initialize$0 = SessionManager.lambda$initialize$0(message);
                return lambda$initialize$0;
            case 17:
                lambda$onAppBackgrounded$2 = SessionManager.lambda$onAppBackgrounded$2(message);
                return lambda$onAppBackgrounded$2;
            case 18:
                lambda$onStartListening$0 = AlexaQuickSettingService.lambda$onStartListening$0(message);
                return lambda$onStartListening$0;
            case 19:
                lambda$subscribe$0 = InAppWakeWordSettingsMediator.lambda$subscribe$0(message);
                return lambda$subscribe$0;
            case 20:
                lambda$toggleEventBusSubscription$2 = GeofenceEventHandler.lambda$toggleEventBusSubscription$2(message);
                return lambda$toggleEventBusSubscription$2;
            case 21:
                lambda$init$0 = UserChangeSubjectFactory.lambda$init$0(message);
                return lambda$init$0;
            case 22:
                lambda$getMessageFilter$0 = DemoRulesSyncInteractor.lambda$getMessageFilter$0(message);
                return lambda$getMessageFilter$0;
            case 23:
                lambda$getMessageFilter$02 = ContextualEventRulesSyncInteractor.lambda$getMessageFilter$0(message);
                return lambda$getMessageFilter$02;
            case 24:
                lambda$new$0 = MobilyticsEventBusMessageProvider.lambda$new$0(message);
                return lambda$new$0;
            case 25:
                lambda$new$2 = MobilyticsEventBusMessageProvider.lambda$new$2(message);
                return lambda$new$2;
            case 26:
                subscribeToSignout$lambda$5 = IsAppOnlyRepository.subscribeToSignout$lambda$5(message);
                return subscribeToSignout$lambda$5;
            case 27:
                lambda$new$02 = SharedPreferenceEndpointsCache.lambda$new$0(message);
                return lambda$new$02;
            case 28:
                lambda$observeUserChanges$0 = FileTransmitter.lambda$observeUserChanges$0(message);
                return lambda$observeUserChanges$0;
            default:
                lambda$subscribeToIdentityChangeEvent$0 = BenefitsEntitlementAuthority.lambda$subscribeToIdentityChangeEvent$0(message);
                return lambda$subscribeToIdentityChangeEvent$0;
        }
    }
}
