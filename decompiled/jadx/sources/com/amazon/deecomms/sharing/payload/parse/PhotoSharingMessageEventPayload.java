package com.amazon.deecomms.sharing.payload.parse;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.deecomms.calling.incallcommands.models.InCallCommandModel$$ExternalSyntheticOutline0;
import com.amazon.deecomms.sharing.photos.CommonContentProperties;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class PhotoSharingMessageEventPayload {

    @Nullable
    private final CommonContentProperties contentProperties;

    @NonNull
    private String contentUri;

    public PhotoSharingMessageEventPayload(@NonNull String str, @Nullable CommonContentProperties commonContentProperties) {
        this.contentUri = str;
        this.contentProperties = commonContentProperties;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PhotoSharingMessageEventPayload photoSharingMessageEventPayload = (PhotoSharingMessageEventPayload) obj;
            if (Objects.equals(this.contentProperties, photoSharingMessageEventPayload.contentProperties) && this.contentUri.equals(photoSharingMessageEventPayload.contentUri)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public CommonContentProperties getContentProperties() {
        return this.contentProperties;
    }

    public String getContentUri() {
        return this.contentUri;
    }

    public int hashCode() {
        return Objects.hash(this.contentProperties, this.contentUri);
    }

    public void setContentUri(@NonNull String str) {
        this.contentUri = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("PhotoSharingMessageEventPayload{contentProperties=");
        sb.append(this.contentProperties);
        sb.append(", contentUri='");
        return InCallCommandModel$$ExternalSyntheticOutline0.m(sb, this.contentUri, "'}");
    }

    public PhotoSharingMessageEventPayload() {
        this(null, null);
    }
}
