package com.amazon.alexa.voice.ftue;

import com.amazon.alexa.device.api.DeviceInformation;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.protocols.storage.PersistentStorage;
import com.amazon.alexa.voice.bottomsheet.BottomSheetFeatureEnabler;
import com.amazon.alexa.voice.features.DefaultExperimentTreatmentProvider;
import com.amazon.alexa.voice.locale.LocaleInteractor;
import com.amazon.alexa.voice.metrics.VoxMetricEventProcessingService;
import com.amazon.alexa.voice.model.HandsFreeSupportChecker;
import com.amazon.alexa.voice.ra.RaFeatureEnabler;
import com.amazon.alexa.voice.ra.UserProfileManager;
import com.amazon.alexa.voice.wakeword.WakeWordSegmentDisabler;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public final class FtueModule {
    private FtueModule() {
    }

    @Provides
    public static DefaultExperimentTreatmentProvider provideDefaultExperimentFeatureChecker(FeatureServiceV2 featureServiceV2) {
        return new DefaultExperimentTreatmentProvider(featureServiceV2);
    }

    @Provides
    @Singleton
    public static FtueGeoLocationInfoFeatureChecker provideFtueGeoLocationInfoFeatureChecker(DefaultExperimentTreatmentProvider defaultExperimentTreatmentProvider) {
        return new FtueGeoLocationInfoFeatureChecker(defaultExperimentTreatmentProvider);
    }

    @Provides
    public static FtueManagerProvider provideFtueManagerProvider(HandsFreeSupportChecker handsFreeSupportChecker, FtuePreference ftuePreference, VoxMetricEventProcessingService voxMetricEventProcessingService, LocaleInteractor localeInteractor, FtueGeoLocationInfoFeatureChecker ftueGeoLocationInfoFeatureChecker, BottomSheetFeatureEnabler bottomSheetFeatureEnabler, RaFeatureEnabler raFeatureEnabler, DeviceInformation deviceInformation, WakeWordDisableChecker wakeWordDisableChecker, UserProfileManager userProfileManager, WakeWordSegmentDisabler wakeWordSegmentDisabler) {
        return new FtueManagerProvider(handsFreeSupportChecker, ftuePreference, voxMetricEventProcessingService, localeInteractor, ftueGeoLocationInfoFeatureChecker, bottomSheetFeatureEnabler, raFeatureEnabler, deviceInformation, wakeWordDisableChecker, userProfileManager, wakeWordSegmentDisabler);
    }

    @Provides
    public static UserFtuePreference provideUserFtuePreference(PersistentStorage.Factory factory) {
        return new UserFtuePreference(factory);
    }

    @Provides
    @Singleton
    public static WakeWordDisableChecker provideWakeWordDisableChecker(FeatureServiceV2 featureServiceV2) {
        return new WakeWordDisableChecker(featureServiceV2);
    }

    @Provides
    public static FtuePreference provideFtuePreference(UserFtuePreference userFtuePreference) {
        return userFtuePreference;
    }
}
