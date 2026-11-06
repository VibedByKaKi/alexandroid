package com.amazon.alexa.client.alexaservice.base.feature;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.Feature;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.FeatureFlagLoadedEvent;
import com.amazon.alexa.feature.consumer.api.FeatureFlagConsumer;
import com.amazon.alexa.feature.consumer.api.FeatureFlagListener;
import com.amazon.alexa.feature.consumer.api.FeatureQuery;
import com.amazon.alexa.feature.consumer.api.Treatment;
import com.amazon.alexa.utils.TimeProvider;
import com.amazon.alexa.utils.concurrent.ManagedExecutorFactory;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Named;
import javax.inject.Provider;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class FeatureFlagConfigurationAuthority {
    private static final String EXECUTOR_NAME = "feature-flag-executor";
    private static final Set<String> FEATURES = new HashSet();
    private static final String TAG = "FeatureFlagConfigurationAuthority";
    private final Set<String> allowedFeatures;
    private final Provider<AlexaClientEventBus> eventBusProvider;
    private final ExecutorService executorService;
    private final FeatureFlagConsumer featureFlagConsumer;
    private final FeatureQuery featureQuery;
    private final Set<String> restrictedFeatures;
    private final TimeProvider timeProvider;

    static {
        for (Feature feature : Feature.values()) {
            FEATURES.add(feature.name());
        }
    }

    public FeatureFlagConfigurationAuthority(FeatureFlagConsumer featureFlagConsumer, FeatureQuery featureQuery, TimeProvider timeProvider, Provider<AlexaClientEventBus> provider, @Named("shared_scheduler") ScheduledExecutorService scheduledExecutorService, Set<String> set, Set<String> set2) {
        this.featureFlagConsumer = featureFlagConsumer;
        this.featureQuery = featureQuery;
        this.executorService = scheduledExecutorService;
        this.eventBusProvider = provider;
        this.timeProvider = timeProvider;
        this.allowedFeatures = set;
        this.restrictedFeatures = set2;
    }

    @VisibleForTesting
    public static Set<String> getSupportedFeatures() {
        return FEATURES;
    }

    private void loadFeatureFlag() {
        this.executorService.execute(new Runnable() { // from class: com.amazon.alexa.client.alexaservice.base.feature.FeatureFlagConfigurationAuthority.1
            @Override // java.lang.Runnable
            public void run() {
                long elapsedRealTime = FeatureFlagConfigurationAuthority.this.timeProvider.elapsedRealTime();
                FeatureFlagConfigurationAuthority.this.featureFlagConsumer.load(FeatureFlagConfigurationAuthority.getSupportedFeatures());
                long elapsedRealTime2 = FeatureFlagConfigurationAuthority.this.timeProvider.elapsedRealTime() - elapsedRealTime;
                Log.i(FeatureFlagConfigurationAuthority.TAG, "Feature loading took: " + elapsedRealTime2);
                ((AlexaClientEventBus) FeatureFlagConfigurationAuthority.this.eventBusProvider.get()).postSticky(FeatureFlagLoadedEvent.create(elapsedRealTime2));
            }
        });
    }

    public void enqueueFeatureFlagListener(Feature feature, FeatureFlagListener featureFlagListener) {
        this.featureFlagConsumer.enqueueFeatureFlagListener(feature.name(), featureFlagListener);
    }

    public void enqueueFeatureFlagListenerWithTreatment(String str, Feature feature, FeatureFlagListener featureFlagListener) {
        this.featureFlagConsumer.enqueueFeatureFlagListenerWithTreatment(str, feature.name(), featureFlagListener);
    }

    @Nullable
    public Treatment getTreatment(Feature feature) {
        return this.featureFlagConsumer.getTreatment(feature.name());
    }

    @NonNull
    public Treatment getTreatmentAndRecordTrigger(String str, Feature feature, @NonNull Treatment treatment) {
        return this.featureFlagConsumer.getTreatmentAndRecordTrigger(str, feature.name(), treatment);
    }

    public void initialize() {
        this.featureFlagConsumer.initialize();
        loadFeatureFlag();
    }

    public boolean isEnabled(Feature feature) {
        if (this.allowedFeatures.contains(feature.name())) {
            return true;
        }
        if (this.restrictedFeatures.contains(feature.name())) {
            return false;
        }
        return this.featureQuery.isActive(feature.name());
    }

    public void teardown() {
        ManagedExecutorFactory.shutdown(EXECUTOR_NAME);
        this.featureFlagConsumer.teardown();
    }

    public boolean isEnabled(String str, Feature feature) {
        if (this.allowedFeatures.contains(feature.name())) {
            return true;
        }
        if (this.restrictedFeatures.contains(feature.name())) {
            return false;
        }
        return this.featureQuery.isActive(str, feature.name());
    }
}
