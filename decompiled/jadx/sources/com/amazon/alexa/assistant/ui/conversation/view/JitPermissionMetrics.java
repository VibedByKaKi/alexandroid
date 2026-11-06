package com.amazon.alexa.assistant.ui.conversation.view;

import androidx.compose.runtime.internal.StabilityInferred;
import com.amazon.alexa.assistant.foundation.metric.model.Metric;
import com.amazon.alexa.assistant.foundation.metric.model.MetricMetadata;
import com.amazon.alexa.assistant.toolkit.metric.model.MetricsManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0007J\u0006\u0010\n\u001a\u00020\u0007J\u0006\u0010\u000b\u001a\u00020\u0007J\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u000e\u001a\u00020\u0007J\u0006\u0010\u000f\u001a\u00020\u0007J\u0006\u0010\u0010\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\u0007J\u0006\u0010\u0012\u001a\u00020\u0007J\u0010\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/assistant/ui/conversation/view/JitPermissionMetrics;", "", "metricsManager", "Lcom/amazon/alexa/assistant/toolkit/metric/model/MetricsManager;", "<init>", "(Lcom/amazon/alexa/assistant/toolkit/metric/model/MetricsManager;)V", "recordMicImpression", "", "recordMicGranted", "recordMicDenied", "recordMicSkipped", "recordMicDismissed", "recordMicSettingsOpened", "recordCameraImpression", "recordCameraGranted", "recordCameraDenied", "recordCameraSkipped", "recordCameraDismissed", "recordCameraSettingsOpened", "emit", "name", "", "Companion", "ui_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class JitPermissionMetrics {

    @NotNull
    public static final String CAMERA_DENIED = "CAMERA_PERMISSION_DENIED";

    @NotNull
    public static final String CAMERA_DISMISSED = "CAMERA_PERMISSION_DISMISSED";

    @NotNull
    public static final String CAMERA_GRANTED = "CAMERA_PERMISSION_GRANTED";

    @NotNull
    public static final String CAMERA_IMPRESSION = "CAMERA_PERMISSION_IMPRESSION";

    @NotNull
    public static final String CAMERA_SETTINGS_OPENED = "CAMERA_PERMISSION_SETTINGS_OPENED";

    @NotNull
    public static final String CAMERA_SKIPPED = "CAMERA_PERMISSION_SKIPPED";

    @NotNull
    private static final String COMPONENT = "ConversationUI";

    @NotNull
    public static final String MIC_DENIED = "MIC_PERMISSION_DENIED";

    @NotNull
    public static final String MIC_DISMISSED = "MIC_PERMISSION_DISMISSED";

    @NotNull
    public static final String MIC_GRANTED = "MIC_PERMISSION_GRANTED";

    @NotNull
    public static final String MIC_IMPRESSION = "MIC_PERMISSION_IMPRESSION";

    @NotNull
    public static final String MIC_SETTINGS_OPENED = "MIC_PERMISSION_SETTINGS_OPENED";

    @NotNull
    public static final String MIC_SKIPPED = "MIC_PERMISSION_SKIPPED";

    @NotNull
    private final MetricsManager metricsManager;
    public static final int $stable = 8;

    public JitPermissionMetrics(@NotNull MetricsManager metricsManager) {
        metricsManager.getClass();
        this.metricsManager = metricsManager;
    }

    private final void emit(String name) {
        int i = 0;
        this.metricsManager.record(new Metric.Counter(new MetricMetadata(name, COMPONENT, null, null, null, 0L, null, 124, null), i, 2, (DefaultConstructorMarker) null));
    }

    public final void recordCameraDenied() {
        emit("CAMERA_PERMISSION_DENIED");
    }

    public final void recordCameraDismissed() {
        emit(CAMERA_DISMISSED);
    }

    public final void recordCameraGranted() {
        emit("CAMERA_PERMISSION_GRANTED");
    }

    public final void recordCameraImpression() {
        emit(CAMERA_IMPRESSION);
    }

    public final void recordCameraSettingsOpened() {
        emit("CAMERA_PERMISSION_SETTINGS_OPENED");
    }

    public final void recordCameraSkipped() {
        emit("CAMERA_PERMISSION_SKIPPED");
    }

    public final void recordMicDenied() {
        emit("MIC_PERMISSION_DENIED");
    }

    public final void recordMicDismissed() {
        emit(MIC_DISMISSED);
    }

    public final void recordMicGranted() {
        emit("MIC_PERMISSION_GRANTED");
    }

    public final void recordMicImpression() {
        emit(MIC_IMPRESSION);
    }

    public final void recordMicSettingsOpened() {
        emit("MIC_PERMISSION_SETTINGS_OPENED");
    }

    public final void recordMicSkipped() {
        emit("MIC_PERMISSION_SKIPPED");
    }
}
