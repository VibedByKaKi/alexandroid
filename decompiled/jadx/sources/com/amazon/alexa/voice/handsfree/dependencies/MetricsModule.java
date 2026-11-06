package com.amazon.alexa.voice.handsfree.dependencies;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.handsfree.metrics.utils.AlexaApplicationInformationProvider;
import com.amazon.alexa.handsfree.protocols.dependencies.AhfScope;
import com.amazon.alexa.handsfree.protocols.metrics.MetricsEmitterConfig;
import com.amazon.alexa.handsfree.protocols.utils.ApplicationInformationProvider;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes19.dex */
public class MetricsModule {
    @AhfScope
    @Provides
    public ApplicationInformationProvider provideApplicationInformationProvider(@NonNull Context context) {
        AlexaApplicationInformationProvider alexaApplicationInformationProvider = new AlexaApplicationInformationProvider(context);
        alexaApplicationInformationProvider.setFalcoBuildCode(1);
        return alexaApplicationInformationProvider;
    }

    @AhfScope
    @Provides
    public MetricsEmitterConfig provideMetricsEmitterConfig() {
        return new MetricsEmitterConfig() { // from class: com.amazon.alexa.voice.handsfree.dependencies.MetricsModule.1
            @Override // com.amazon.alexa.handsfree.protocols.metrics.MetricsEmitterConfig
            public boolean canEmitMetrics() {
                return true;
            }
        };
    }
}
