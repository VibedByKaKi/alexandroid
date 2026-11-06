package com.amazon.alexa.sharing.repo.models.acms.payload.sharing;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum SharingMessageType {
    SHARED_MESSAGE("message/shared-message"),
    DEFAULT_REACTION("reaction/default"),
    SONG("SONG"),
    ALEXA_SONG("alexa-music/song"),
    PHOTO_MESSAGE("message/photo-message");


    @NonNull
    private final String sharingMessageType;

    SharingMessageType(@NonNull String str) {
        this.sharingMessageType = str;
    }
}
