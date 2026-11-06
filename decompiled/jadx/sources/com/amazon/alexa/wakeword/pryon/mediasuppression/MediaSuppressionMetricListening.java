package com.amazon.alexa.wakeword.pryon.mediasuppression;

import com.amazon.alexa.client.metrics.core.AlexaMetricsConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H&J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u000e"}, d2 = {"Lcom/amazon/alexa/wakeword/pryon/mediasuppression/MediaSuppressionMetricListening;", "", "onArtifactDownloadFailure", "", "artifactName", "", "requestDuration", "", "artifactID", AlexaMetricsConstants.AssistantSdkDimensions.FAILURE_REASON, "onArtifactDownloadInterrupted", "onArtifactDownloadSuccess", "onArtifactReadFailure", "onArtifactReadSuccess", "AVSAndroidClient-pryonprovider_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes20.dex */
public interface MediaSuppressionMetricListening {
    void onArtifactDownloadFailure(@NotNull String artifactName, long requestDuration, @NotNull String artifactID, @NotNull String failureReason);

    void onArtifactDownloadInterrupted(@NotNull String artifactName, long requestDuration);

    void onArtifactDownloadSuccess(@NotNull String artifactName, long requestDuration, @NotNull String artifactID);

    void onArtifactReadFailure(@NotNull String artifactName, @NotNull String failureReason);

    void onArtifactReadSuccess(@NotNull String artifactName);
}
