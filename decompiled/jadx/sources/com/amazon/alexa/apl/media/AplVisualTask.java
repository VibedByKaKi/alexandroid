package com.amazon.alexa.apl.media;

import com.amazon.alexa.accessorykit.ApplicationLifecycleObserverEventEmitter;
import com.amazon.alexa.api.AlexaVisualTask;
import com.amazon.alexa.apl.metrics.MetricsManager;
import com.amazon.alexa.apl.metrics.MetricsPublisher;
import com.amazon.alexa.apl.utils.MetricsConstants;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/apl/media/AplVisualTask;", "Lcom/amazon/alexa/api/AlexaVisualTask;", "mMetricsPublisher", "Lcom/amazon/alexa/apl/metrics/MetricsPublisher;", "(Lcom/amazon/alexa/apl/metrics/MetricsPublisher;)V", "getTaskComponentName", "", ApplicationLifecycleObserverEventEmitter.LIFECYCLE_EVENT_STOP, "", "Companion", "AVSMobileFramework-android-apl_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class AplVisualTask implements AlexaVisualTask {
    private static final String TAG = "AplVisualTask";

    @NotNull
    private final MetricsPublisher mMetricsPublisher;

    @Inject
    public AplVisualTask(@NotNull MetricsPublisher metricsPublisher) {
        metricsPublisher.getClass();
        this.mMetricsPublisher = metricsPublisher;
    }

    @Override // com.amazon.alexa.api.AlexaVisualTask
    @NotNull
    public String getTaskComponentName() {
        return "Alexa.Presentation.APL";
    }

    @Override // com.amazon.alexa.api.AlexaVisualTask
    public void onStop() {
        MetricsManager.incrementCount$default(this.mMetricsPublisher, MetricsConstants.APL_VISUAL_TASK_STOP, 0, 2, null);
    }
}
