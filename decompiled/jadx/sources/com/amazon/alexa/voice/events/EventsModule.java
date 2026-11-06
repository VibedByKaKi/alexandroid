package com.amazon.alexa.voice.events;

import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.voice.metrics.VoxMetricEventProcessingService;
import com.amazon.alexa.voice.ra.RaConversationBroadcastReceiver;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public final class EventsModule {
    private EventsModule() {
    }

    @Provides
    @Singleton
    public static RaConversationBroadcastReceiver provideRaConversationBroadcastReceiver(EventBus eventBus) {
        return new RaConversationBroadcastReceiver(eventBus);
    }

    @Provides
    @Singleton
    public static VoiceUiEventBroadcastReceiver provideVoiceUiEventBroadcastReceiver() {
        return new VoiceUiEventBroadcastReceiver();
    }

    @Provides
    @Singleton
    public static VoxUiEventProcessingService provideVoxUiEventProcessingService(VoxMetricEventProcessingService voxMetricEventProcessingService) {
        return new VoxUiEventProcessingService(voxMetricEventProcessingService);
    }
}
