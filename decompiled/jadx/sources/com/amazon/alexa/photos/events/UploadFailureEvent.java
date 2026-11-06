package com.amazon.alexa.photos.events;

import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class UploadFailureEvent extends PhotosUploaderEvent {
    private final int errorCode;
    private final String errorType;
    private final String message;

    public UploadFailureEvent(@Nullable String str, @Nullable String str2, int i) {
        this.message = str;
        this.errorType = str2;
        this.errorCode = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            UploadFailureEvent uploadFailureEvent = (UploadFailureEvent) obj;
            if (this.errorCode == uploadFailureEvent.errorCode && Objects.equals(this.message, uploadFailureEvent.message) && Objects.equals(this.errorType, uploadFailureEvent.errorType)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.message, this.errorType, Integer.valueOf(this.errorCode));
    }
}
