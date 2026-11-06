package com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.listeners;

import com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.models.ArtifactIdentifier;
import com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.models.ArtifactLocation;
import com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.models.RequestId;
import com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.networking.DownloadFailureException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public interface InternalArtifactDownloadResponseListener {
    void onComplete(RequestId requestId, ArtifactLocation artifactLocation, ArtifactIdentifier artifactIdentifier);

    void onFailure(RequestId requestId, DownloadFailureException downloadFailureException);
}
