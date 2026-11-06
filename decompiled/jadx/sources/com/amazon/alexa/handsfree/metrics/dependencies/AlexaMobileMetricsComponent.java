package com.amazon.alexa.handsfree.metrics.dependencies;

import com.amazon.alexa.handsfree.protocols.dependencies.AhfComponentProtocol;
import com.amazon.alexa.handsfree.voiceappreporter.VoiceAppEventContentProvider;
import com.amazon.alexa.handsfree.voiceappreporter.schedulers.VoiceAppEventReporterServiceScheduler;
import com.amazon.alexa.handsfree.voiceappreporter.services.VoiceAppEventReporterService;
import dagger.Subcomponent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Subcomponent
/* loaded from: classes17.dex */
public interface AlexaMobileMetricsComponent extends AhfComponentProtocol {
    void inject(VoiceAppEventContentProvider voiceAppEventContentProvider);

    void inject(VoiceAppEventReporterService voiceAppEventReporterService);

    VoiceAppEventReporterServiceScheduler voiceAppEventReporterServiceScheduler();
}
