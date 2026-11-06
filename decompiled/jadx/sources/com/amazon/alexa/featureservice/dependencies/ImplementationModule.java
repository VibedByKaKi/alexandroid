package com.amazon.alexa.featureservice.dependencies;

import com.amazon.alexa.benefits.api.BenefitsService;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.featureservice.api.PlatformFeatureServiceV2;
import com.amazon.alexa.featureservice.configuration.FeatureServiceConfiguration;
import com.amazon.alexa.featureservice.implementation.AlexaMobileAndroidFeatureServiceImpl;
import com.amazon.alexa.featureservice.implementation.FeatureCache;
import com.amazon.alexa.featureservice.implementation.FeatureRegistryUtil;
import com.amazon.alexa.featureservice.implementation.FeatureServiceViewModel;
import com.amazon.alexa.featureservice.implementation.Realm;
import com.amazon.alexa.featureservice.recordTrigger.RecordTriggerService;
import com.amazon.alexa.featureservice.repo.provider.FeatureDataRepo;
import com.amazon.alexa.featureservice.repo.provider.SharedPreferenceRepo;
import com.amazon.alexa.featureservice.service.FeatureSubscriptionManager;
import com.amazon.alexa.featureservice.sessionManagement.SessionManager;
import com.amazon.alexa.featureservice.util.Analytics;
import com.amazon.alexa.featureservice.util.SafeEventBus;
import com.amazon.alexa.featureservice.util.TimeUtil;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.dee.app.http.CoralService;
import com.google.gson.Gson;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class ImplementationModule {
    @Provides
    @Singleton
    public BenefitsService providesBenefitsService() {
        Object obj;
        obj = ComponentRegistry.getInstance().get(BenefitsService.class).get();
        return (BenefitsService) obj;
    }

    @Provides
    @Singleton
    public FeatureServiceViewModel providesFeatureServiceViewModel(FeatureDataRepo featureDataRepo, FeatureRegistryUtil featureRegistryUtil, RecordTriggerService recordTriggerService, FeatureCache featureCache, FeatureSubscriptionManager featureSubscriptionManager, Analytics analytics, SafeEventBus safeEventBus, Gson gson, TimeUtil timeUtil, FeatureServiceConfiguration featureServiceConfiguration, Realm realm, SharedPreferenceRepo sharedPreferenceRepo) {
        return new FeatureServiceViewModel(featureDataRepo, featureRegistryUtil, recordTriggerService, featureCache, featureSubscriptionManager, analytics, safeEventBus, gson, timeUtil, featureServiceConfiguration, realm, sharedPreferenceRepo);
    }

    @Provides
    @Singleton
    public PlatformFeatureServiceV2 providesPlatformFeatureService(Lazy<FeatureServiceViewModel> lazy, Lazy<SessionManager> lazy2, Lazy<SafeEventBus> lazy3, Lazy<Analytics> lazy4, TimeUtil timeUtil, Lazy<BenefitsService> lazy5) {
        return new AlexaMobileAndroidFeatureServiceImpl(lazy, lazy2, lazy3, lazy4, timeUtil, lazy5);
    }

    @Provides
    @Singleton
    public RecordTriggerService providesRecordTriggerService(Lazy<CoralService> lazy, Lazy<Analytics> lazy2, Lazy<FeatureServiceConfiguration> lazy3) {
        return new RecordTriggerService(lazy, lazy2, lazy3);
    }

    @Provides
    @Singleton
    public SessionManager providesSessionManager(Lazy<EventBus> lazy, FeatureServiceConfiguration featureServiceConfiguration) {
        return new SessionManager(lazy, featureServiceConfiguration);
    }

    @Provides
    @Singleton
    public FeatureServiceConfiguration providesTestConfiguration() {
        return new FeatureServiceConfiguration();
    }

    @Provides
    @Singleton
    public Realm providesWeblabRealm() {
        return new Realm();
    }

    @Provides
    @Singleton
    public FeatureServiceV2 providesFeatureService(PlatformFeatureServiceV2 platformFeatureServiceV2) {
        return platformFeatureServiceV2;
    }
}
