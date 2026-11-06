package com.amazon.alexa.wakeword.davs;

import androidx.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ArtifactDownloadException extends Exception {
    private final ArtifactDownloadFailure downloadFailureReason;
    private final Exception originalException;

    private ArtifactDownloadException(ArtifactDownloadFailure artifactDownloadFailure, @Nullable Exception exc) {
        super(exc);
        this.originalException = exc;
        this.downloadFailureReason = artifactDownloadFailure;
    }

    public static ArtifactDownloadException create(ArtifactDownloadFailure artifactDownloadFailure) {
        return new ArtifactDownloadException(artifactDownloadFailure, null);
    }

    public ArtifactDownloadFailure getDownloadFailureReason() {
        return this.downloadFailureReason;
    }

    public Exception getUnderlyingException() {
        return this.originalException;
    }

    public static ArtifactDownloadException create(ArtifactDownloadFailure artifactDownloadFailure, Exception exc) {
        return new ArtifactDownloadException(artifactDownloadFailure, exc);
    }
}
