package com.amazon.alexa.voice.sdk;

import android.content.Context;
import android.widget.Toast;
import com.amazon.alexa.api.compat.AlexaMobileFrameworkApisV2;
import com.amazon.alexa.protocols.lifecycle.ApplicationLifecycleService;
import com.amazon.alexa.voice.enablement.VoiceEnablement;
import com.amazon.alexa.voice.features.FeatureChecker;
import com.amazon.alexa.voice.metrics.VoxMetricEventProcessingService;
import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public final class SdkModule {
    private static final String DEBUG_TAG = "amav";

    private SdkModule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$provideDefaultAlexaConnectionManager$0(Context context, String str) {
        Toast.makeText(context, str, 1).show();
    }

    @Provides
    @Singleton
    public static AlexaStateTracker provideAlexaStateTracker() {
        return new AlexaStateTracker();
    }

    @Provides
    @Singleton
    public static AttentionSystemManager provideAttentionSystemManager(AlexaMobileFrameworkApisV2 alexaMobileFrameworkApisV2, FeatureChecker featureChecker) {
        return new AttentionSystemManager(alexaMobileFrameworkApisV2, featureChecker);
    }

    @Provides
    @Singleton
    public static DefaultAlexaConnectionManager provideDefaultAlexaConnectionManager(Context context, AlexaMobileFrameworkApisV2 alexaMobileFrameworkApisV2, ApplicationLifecycleService applicationLifecycleService, VoiceEnablement voiceEnablement, VoxMetricEventProcessingService voxMetricEventProcessingService) {
        return new DefaultAlexaConnectionManager(new SdkModule$$ExternalSyntheticLambda0(context, 0), alexaMobileFrameworkApisV2, applicationLifecycleService, voiceEnablement, voxMetricEventProcessingService);
    }

    @Provides
    @Singleton
    public static AlexaMobileFrameworkApisV2 provideFrameworkApis(Context context) {
        return new AlexaMobileFrameworkApisV2(context, DEBUG_TAG);
    }
}
