package com.amazon.alexa.photos.events;

import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class UploadsStartedEvent extends PhotosUploaderEvent {
    private final int selectedCount;

    public UploadsStartedEvent(int i) {
        this.selectedCount = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.selectedCount == ((UploadsStartedEvent) obj).selectedCount;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.selectedCount));
    }
}
