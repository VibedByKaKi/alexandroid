package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Util;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes7.dex */
public final class MediaMetadata {

    @Nullable
    public final String title;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {

        @Nullable
        private String title;

        public MediaMetadata build() {
            return new MediaMetadata(this.title);
        }

        public Builder setTitle(@Nullable String str) {
            this.title = str;
            return this;
        }
    }

    private MediaMetadata(@Nullable String str) {
        this.title = str;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || MediaMetadata.class != obj.getClass()) {
            return false;
        }
        return Util.areEqual(this.title, ((MediaMetadata) obj).title);
    }

    public int hashCode() {
        String str = this.title;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }
}
