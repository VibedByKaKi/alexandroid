package com.amazon.alexa.accessory.notificationpublisher.artifactdownloader;

import com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.listeners.ArtifactDownloadResponseListener;
import com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.models.ArtifactMetadata;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface ArtifactDownloader {
    void downloadArtifact(ArtifactMetadata artifactMetadata, ArtifactDownloadResponseListener artifactDownloadResponseListener);

    Long getLastUpdatedTimeForArtifact(ArtifactMetadata artifactMetadata);

    String getPathForArtifact(ArtifactMetadata artifactMetadata);

    void removeArtifact(ArtifactMetadata artifactMetadata);
}
