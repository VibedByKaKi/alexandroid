package com.amazon.alexa.accessory.frames.media.utils;

import com.amazon.alexa.mobilytics.event.metadata.EventMetadataType;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public enum MediaTypeFilter {
    ALL("all"),
    PHOTOS(EventMetadataType.PHOTOS),
    VIDEOS("videos");

    private final String value;

    MediaTypeFilter(String str) {
        this.value = str;
    }

    public static MediaTypeFilter fromString(String str) {
        if (str == null || str.trim().isEmpty()) {
            return ALL;
        }
        String lowerCase = str.trim().toLowerCase();
        for (MediaTypeFilter mediaTypeFilter : values()) {
            if (mediaTypeFilter.value.equals(lowerCase)) {
                return mediaTypeFilter;
            }
        }
        return ALL;
    }

    public String getValue() {
        return this.value;
    }
}
