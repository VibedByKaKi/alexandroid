package com.amazon.alexa.voice.downchannel;

import android.content.Context;
import com.amazon.alexa.api.compat.AlexaMobileFrameworkApisV2;
import com.amazon.alexa.protocols.messaging.MessagingReceiver;
import com.amazon.alexa.voice.metrics.service.MetricsService;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public final class DownchannelModule {
    private DownchannelModule() {
    }

    @Provides
    @Singleton
    public static DownchannelController provideDownchannelController(Context context, AlexaMobileFrameworkApisV2 alexaMobileFrameworkApisV2) {
        return new DownchannelController(context, alexaMobileFrameworkApisV2);
    }

    @Provides
    @Singleton
    public static MessagingReceiver provideVoiceMessagingReceiver(DownchannelController downchannelController, MetricsService metricsService) {
        return new VoiceMessagingReceiver(downchannelController, metricsService);
    }
}
