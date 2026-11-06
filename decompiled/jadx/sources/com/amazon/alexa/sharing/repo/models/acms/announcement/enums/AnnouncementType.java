package com.amazon.alexa.sharing.repo.models.acms.announcement.enums;

import androidx.annotation.NonNull;
import com.amazon.deecomms.common.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum AnnouncementType {
    TEXT(Constants.TEXT_ANNOUNCEMENT_MESSAGE_TYPE),
    AUDIO("announcement/audio");


    @NonNull
    private final String announcementType;

    AnnouncementType(@NonNull String str) {
        this.announcementType = str;
    }
}
