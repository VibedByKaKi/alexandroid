package com.amazon.alexa.enrollment.alexaservices;

import com.amazon.alexa.api.compat.AlexaState;
import com.amazon.alexa.enrollment.metrics.EnrollmentMetricsRecorder;
import com.amazon.alexa.eventbus.api.EventBus;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@ScopeMetadata
@DaggerGenerated
@QualifierMetadata
/* loaded from: classes17.dex */
public final class AlexaStateTracker_Factory implements Factory<AlexaStateTracker> {
    private final Provider<EventBus> eventBusProvider;
    private final Provider<AlexaState> initialAlexaStateProvider;
    private final Provider<EnrollmentMetricsRecorder> metricsRecorderProvider;

    public AlexaStateTracker_Factory(Provider<EventBus> provider, Provider<EnrollmentMetricsRecorder> provider2, Provider<AlexaState> provider3) {
        this.eventBusProvider = provider;
        this.metricsRecorderProvider = provider2;
        this.initialAlexaStateProvider = provider3;
    }

    public static AlexaStateTracker_Factory create(Provider<EventBus> provider, Provider<EnrollmentMetricsRecorder> provider2, Provider<AlexaState> provider3) {
        return new AlexaStateTracker_Factory(provider, provider2, provider3);
    }

    public static AlexaStateTracker newInstance(EventBus eventBus, EnrollmentMetricsRecorder enrollmentMetricsRecorder, AlexaState alexaState) {
        return new AlexaStateTracker(eventBus, enrollmentMetricsRecorder, alexaState);
    }

    @Override // javax.inject.Provider
    public AlexaStateTracker get() {
        return newInstance(this.eventBusProvider.get(), this.metricsRecorderProvider.get(), this.initialAlexaStateProvider.get());
    }
}
