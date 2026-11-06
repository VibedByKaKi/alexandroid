package com.amazon.alexa.accessory.frames.media.revert;

import com.amazon.alexa.accessory.davs.DefaultDavsClient$$ExternalSyntheticLambda5;
import com.amazon.alexa.accessory.frames.metrics.MetricsRecorder;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"DEFAULT_METRICS_SINK", "Lcom/amazon/alexa/accessory/frames/media/revert/MetricsSink;", "getDEFAULT_METRICS_SINK", "()Lcom/amazon/alexa/accessory/frames/media/revert/MetricsSink;", "AlexaAccessoryEchoFramesAndroid_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SnapshotEvictorKt {

    @NotNull
    private static final MetricsSink DEFAULT_METRICS_SINK = new DefaultDavsClient$$ExternalSyntheticLambda5(21);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DEFAULT_METRICS_SINK$lambda$0(String str) {
        str.getClass();
        MetricsRecorder.getInstance().recordCounter(str);
    }

    @NotNull
    public static final MetricsSink getDEFAULT_METRICS_SINK() {
        return DEFAULT_METRICS_SINK;
    }
}
