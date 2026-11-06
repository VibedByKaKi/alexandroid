package com.amazon.alexa.client.alexaservice.vad.selfbargein;

import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.vad.selfbargein.PerDridCaptionAccumulator;
import dagger.Module;
import dagger.Provides;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import javax.inject.Singleton;
import org.apache.commons.io.input.ReadAheadInputStream$$ExternalSyntheticLambda1;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes17.dex */
public class SelfBargeInModule {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$providesSelfBargeInExecutor$0(Runnable runnable) {
        Thread thread = new Thread(runnable, "alexa-self-bargein");
        thread.setDaemon(true);
        return thread;
    }

    @Provides
    @Singleton
    public PerDridCaptionAccumulator providesAccumulator(SelfBargeInConfig selfBargeInConfig, CaptionRingBuffer captionRingBuffer, @SelfBargeInExecutor ScheduledExecutorService scheduledExecutorService, PerDridCaptionAccumulator.Clock clock) {
        return new PerDridCaptionAccumulator(selfBargeInConfig, captionRingBuffer, scheduledExecutorService, clock);
    }

    @Provides
    @Singleton
    public CaptionRingBuffer providesCaptionRingBuffer(SelfBargeInConfig selfBargeInConfig) {
        return new CaptionRingBuffer(selfBargeInConfig.getRecentCaptionBufferSize());
    }

    @Provides
    @Singleton
    public PerDridCaptionAccumulator.Clock providesSelfBargeInClock() {
        return new SelfBargeInModule$$ExternalSyntheticLambda1();
    }

    @Provides
    @Singleton
    public SelfBargeInConfig providesSelfBargeInConfig() {
        return SelfBargeInConfig.DEFAULT;
    }

    @Provides
    @Singleton
    @SelfBargeInExecutor
    public ScheduledExecutorService providesSelfBargeInExecutor() {
        return Executors.newSingleThreadScheduledExecutor(new ReadAheadInputStream$$ExternalSyntheticLambda1(12));
    }

    @Provides
    @Singleton
    public SelfBargeInObserver providesSelfBargeInObserver(SelfBargeInConfig selfBargeInConfig, AlexaClientEventBus alexaClientEventBus, PerDridCaptionAccumulator perDridCaptionAccumulator, @SelfBargeInExecutor ScheduledExecutorService scheduledExecutorService, PerDridCaptionAccumulator.Clock clock) {
        SelfBargeInObserver selfBargeInObserver = new SelfBargeInObserver(selfBargeInConfig, alexaClientEventBus, perDridCaptionAccumulator, scheduledExecutorService, clock);
        alexaClientEventBus.register(selfBargeInObserver);
        return selfBargeInObserver;
    }
}
