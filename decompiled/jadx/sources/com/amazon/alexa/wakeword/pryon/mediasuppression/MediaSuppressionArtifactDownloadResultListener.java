package com.amazon.alexa.wakeword.pryon.mediasuppression;

import com.amazon.alexa.mobile.assistant.client.auth.AuthorizationDelegateAdapter;
import com.amazon.alexa.wakeword.davs.ArtifactDownloadResultListener;
import com.amazon.alexa.wakeword.davs.ArtifactModel;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J4\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000e\u0010\u0010\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/amazon/alexa/wakeword/pryon/mediasuppression/MediaSuppressionArtifactDownloadResultListener;", "Lcom/amazon/alexa/wakeword/davs/ArtifactDownloadResultListener;", "artifact", "Lcom/amazon/alexa/wakeword/pryon/mediasuppression/MediaSuppressionArtifact;", "metricListener", "Lcom/amazon/alexa/wakeword/pryon/mediasuppression/MediaSuppressionMetricListening;", "(Lcom/amazon/alexa/wakeword/pryon/mediasuppression/MediaSuppressionArtifact;Lcom/amazon/alexa/wakeword/pryon/mediasuppression/MediaSuppressionMetricListening;)V", "onArtifactAlreadyUpToDate", "", "requestDuration", "", "artifactModel", "Lcom/amazon/alexa/wakeword/davs/ArtifactModel;", "onArtifactDownloadFailure", "artifactMD5", "", AuthorizationDelegateAdapter.FAILURE_EXCEPTION, "Ljava/lang/Exception;", "Lkotlin/Exception;", "reason", "onArtifactDownloadInterrupted", "onArtifactDownloadSuccess", "Companion", "AVSAndroidClient-pryonprovider_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes20.dex */
public final class MediaSuppressionArtifactDownloadResultListener implements ArtifactDownloadResultListener {
    private static final String TAG = "MediaSuppressionArtifactDownloadResultListener";

    @NotNull
    private final MediaSuppressionArtifact artifact;

    @NotNull
    private final MediaSuppressionMetricListening metricListener;

    public MediaSuppressionArtifactDownloadResultListener(@NotNull MediaSuppressionArtifact mediaSuppressionArtifact, @NotNull MediaSuppressionMetricListening mediaSuppressionMetricListening) {
        mediaSuppressionArtifact.getClass();
        mediaSuppressionMetricListening.getClass();
        this.artifact = mediaSuppressionArtifact;
        this.metricListener = mediaSuppressionMetricListening;
    }

    @Override // com.amazon.alexa.wakeword.davs.ArtifactDownloadResultListener
    public void onArtifactAlreadyUpToDate(long requestDuration, @NotNull ArtifactModel artifactModel) {
        artifactModel.getClass();
        this.artifact.name();
        artifactModel.getArtifactIdentifier();
    }

    @Override // com.amazon.alexa.wakeword.davs.ArtifactDownloadResultListener
    public void onArtifactDownloadFailure(long requestDuration, @Nullable String artifactMD5, @Nullable Exception exception, @Nullable String reason) {
        this.artifact.name();
        this.metricListener.onArtifactDownloadFailure(this.artifact.name(), requestDuration, artifactMD5 == null ? "" : artifactMD5, reason == null ? "" : reason);
    }

    @Override // com.amazon.alexa.wakeword.davs.ArtifactDownloadResultListener
    public void onArtifactDownloadInterrupted(long requestDuration) {
        this.artifact.name();
        this.metricListener.onArtifactDownloadInterrupted(this.artifact.name(), requestDuration);
    }

    @Override // com.amazon.alexa.wakeword.davs.ArtifactDownloadResultListener
    public void onArtifactDownloadSuccess(long requestDuration, @NotNull ArtifactModel artifactModel) {
        artifactModel.getClass();
        this.artifact.name();
        artifactModel.getArtifactIdentifier();
        MediaSuppressionMetricListening mediaSuppressionMetricListening = this.metricListener;
        String name = this.artifact.name();
        String artifactIdentifier = artifactModel.getArtifactIdentifier();
        if (artifactIdentifier == null) {
            artifactIdentifier = "";
        }
        mediaSuppressionMetricListening.onArtifactDownloadSuccess(name, requestDuration, artifactIdentifier);
    }
}
