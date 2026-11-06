package com.amazon.alexa.accessory.notificationpublisher.artifactdownloader.enums;

import com.google.gson.Gson$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public enum ArtifactDownloadFailureReason {
    BAD_REQUEST(400),
    UNAUTHENTICATED_REQUEST(401),
    TOKEN_INVALID(403),
    NO_MATCHING_ARTIFACT(404),
    NETWORK_UNAVAILABLE(410),
    DOWNLOAD_FAILED(411),
    DUPLICATE_REQUEST(412),
    NOT_ENOUGH_STORAGE_SPACE_TO_DOWNLOAD(413),
    PARSING_ERROR(414),
    ARTIFACT_FILE_WRITE_FAILURE(415),
    INTERNAL_ERROR(500);

    private final Integer value;

    ArtifactDownloadFailureReason(Integer num) {
        this.value = num;
    }

    public static ArtifactDownloadFailureReason valueOf(Integer num) {
        for (ArtifactDownloadFailureReason artifactDownloadFailureReason : values()) {
            if (artifactDownloadFailureReason.getValue().equals(num)) {
                return artifactDownloadFailureReason;
            }
        }
        Gson$$ExternalSyntheticBUOutline0.m((Object) num, "No enum const associated with value: ");
        return null;
    }

    public Integer getValue() {
        return this.value;
    }
}
