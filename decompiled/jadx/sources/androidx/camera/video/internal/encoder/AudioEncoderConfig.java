package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.internal.encoder.AutoValue_AudioEncoderConfig;
import com.google.android.gms.common.Scopes;
import com.google.auto.value.AutoValue;
import java.util.Objects;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes.dex */
public abstract class AudioEncoderConfig implements EncoderConfig {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        @NonNull
        public abstract AudioEncoderConfig autoBuild();

        @NonNull
        public AudioEncoderConfig build() {
            AudioEncoderConfig autoBuild = autoBuild();
            if (!Objects.equals(autoBuild.getMimeType(), "audio/mp4a-latm") || autoBuild.getProfile() != -1) {
                return autoBuild;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Encoder mime set to AAC, but no AAC profile was provided.");
            return null;
        }

        @NonNull
        public abstract Builder setBitrate(int i);

        @NonNull
        public abstract Builder setChannelCount(int i);

        @NonNull
        public abstract Builder setInputTimebase(@NonNull Timebase timebase);

        @NonNull
        public abstract Builder setMimeType(@NonNull String str);

        @NonNull
        public abstract Builder setProfile(int i);

        @NonNull
        public abstract Builder setSampleRate(int i);
    }

    @NonNull
    public static Builder builder() {
        return new AutoValue_AudioEncoderConfig.Builder().setProfile(-1);
    }

    public abstract int getBitrate();

    public abstract int getChannelCount();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    @NonNull
    public abstract Timebase getInputTimebase();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    @NonNull
    public abstract String getMimeType();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    public abstract int getProfile();

    public abstract int getSampleRate();

    @Override // androidx.camera.video.internal.encoder.EncoderConfig
    @NonNull
    public MediaFormat toMediaFormat() {
        MediaFormat createAudioFormat = MediaFormat.createAudioFormat(getMimeType(), getSampleRate(), getChannelCount());
        createAudioFormat.setInteger("bitrate", getBitrate());
        if (getProfile() != -1) {
            if (getMimeType().equals("audio/mp4a-latm")) {
                createAudioFormat.setInteger("aac-profile", getProfile());
                return createAudioFormat;
            }
            createAudioFormat.setInteger(Scopes.PROFILE, getProfile());
        }
        return createAudioFormat;
    }
}
