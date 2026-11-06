package com.amazon.alexa.photos.events;

import androidx.annotation.NonNull;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class UploadsBlockedEvent extends PhotosUploaderEvent {
    private final String reason;

    public UploadsBlockedEvent(@NonNull String str) {
        this.reason = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.reason.equals(((UploadsBlockedEvent) obj).reason);
    }

    public int hashCode() {
        return Objects.hash(this.reason);
    }
}
