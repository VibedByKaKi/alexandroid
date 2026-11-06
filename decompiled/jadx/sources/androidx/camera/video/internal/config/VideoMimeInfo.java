package androidx.camera.video.internal.config;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.config.AutoValue_VideoMimeInfo;
import androidx.camera.video.internal.config.MimeInfo;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes.dex */
public abstract class VideoMimeInfo extends MimeInfo {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder extends MimeInfo.Builder<Builder> {
        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        @NonNull
        public abstract VideoMimeInfo build();

        @NonNull
        public abstract Builder setCompatibleVideoProfile(@Nullable EncoderProfilesProxy.VideoProfileProxy videoProfileProxy);
    }

    @NonNull
    public static Builder builder(@NonNull String str) {
        return new AutoValue_VideoMimeInfo.Builder().setMimeType(str).setProfile(-1);
    }

    @Nullable
    public abstract EncoderProfilesProxy.VideoProfileProxy getCompatibleVideoProfile();
}
