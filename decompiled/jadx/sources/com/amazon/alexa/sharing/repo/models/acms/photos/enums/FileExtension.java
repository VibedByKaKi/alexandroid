package com.amazon.alexa.sharing.repo.models.acms.photos.enums;

import androidx.annotation.NonNull;
import com.amazon.alexa.accessory.frames.http.HttpClientConstants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes19.dex */
public enum FileExtension {
    PNG(".png"),
    JPG(".jpg"),
    JPEG(".jpeg"),
    BMP(".bmp"),
    GIF(".gif"),
    WEBP(".webp"),
    PSD(".psd"),
    TIFF(".tiff"),
    HEIC(".HEIC"),
    MP4(HttpClientConstants.VIDEO_EXTENSION),
    MOV(".mov"),
    M4V(".m4v"),
    UNKNOWN_EXTENSION("unknown");


    @NonNull
    private final String fileExtension;

    FileExtension(@NonNull String str) {
        this.fileExtension = str;
    }
}
