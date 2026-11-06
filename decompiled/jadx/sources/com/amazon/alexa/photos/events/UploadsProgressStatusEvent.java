package com.amazon.alexa.photos.events;

import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class UploadsProgressStatusEvent extends PhotosUploaderEvent {
    private final int processedCount;
    private final int totalQueuedCount;

    public UploadsProgressStatusEvent(int i, int i2) {
        this.processedCount = i;
        this.totalQueuedCount = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            UploadsProgressStatusEvent uploadsProgressStatusEvent = (UploadsProgressStatusEvent) obj;
            if (this.processedCount == uploadsProgressStatusEvent.processedCount && this.totalQueuedCount == uploadsProgressStatusEvent.totalQueuedCount) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.processedCount), Integer.valueOf(this.totalQueuedCount));
    }
}
