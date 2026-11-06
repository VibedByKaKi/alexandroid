package com.amazon.alexa.sharing.repo.models.acms.photos.enums;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum AttachmentMediaType {
    IMAGE("IMAGE"),
    VIDEO("VIDEO"),
    UNKNOWN("");


    @NonNull
    private final String attachmentMediaType;

    AttachmentMediaType(@NonNull String str) {
        this.attachmentMediaType = str;
    }
}
