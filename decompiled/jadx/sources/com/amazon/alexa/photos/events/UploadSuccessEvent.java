package com.amazon.alexa.photos.events;

import androidx.annotation.Nullable;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class UploadSuccessEvent extends PhotosUploaderEvent {
    private final String nodeId;

    public UploadSuccessEvent(@Nullable String str) {
        this.nodeId = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.nodeId, ((UploadSuccessEvent) obj).nodeId);
    }

    public int hashCode() {
        return Objects.hash(this.nodeId);
    }
}
