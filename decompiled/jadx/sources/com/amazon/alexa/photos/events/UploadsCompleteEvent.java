package com.amazon.alexa.photos.events;

import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class UploadsCompleteEvent extends PhotosUploaderEvent {
    private final int failureCount;
    private final int uploadedCount;

    public UploadsCompleteEvent(int i, int i2) {
        this.uploadedCount = i;
        this.failureCount = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            UploadsCompleteEvent uploadsCompleteEvent = (UploadsCompleteEvent) obj;
            if (this.uploadedCount == uploadsCompleteEvent.uploadedCount && this.failureCount == uploadsCompleteEvent.failureCount) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.uploadedCount), Integer.valueOf(this.failureCount));
    }
}
