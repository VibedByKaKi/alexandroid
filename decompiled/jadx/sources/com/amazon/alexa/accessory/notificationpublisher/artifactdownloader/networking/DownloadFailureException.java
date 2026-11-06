package com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.networking;

import com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.enums.ArtifactDownloadFailureReason;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public final class DownloadFailureException extends Exception {
    private final Exception exception;
    private final ArtifactDownloadFailureReason failureReason;

    private DownloadFailureException(ArtifactDownloadFailureReason artifactDownloadFailureReason, Exception exc) {
        this.failureReason = artifactDownloadFailureReason;
        this.exception = exc;
    }

    public static DownloadFailureException create(ArtifactDownloadFailureReason artifactDownloadFailureReason, Exception exc) {
        return new DownloadFailureException(artifactDownloadFailureReason, exc);
    }

    public Exception getException() {
        return this.exception;
    }

    public ArtifactDownloadFailureReason getFailureReason() {
        return this.failureReason;
    }
}
