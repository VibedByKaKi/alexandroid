package androidx.camera.video.internal.audio;

import android.annotation.SuppressLint;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.camera.video.internal.audio.AutoValue_AudioSettings;
import com.google.auto.value.AutoValue;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes.dex */
public abstract class AudioSettings {
    public static final List<Integer> COMMON_SAMPLE_RATES = Collections.unmodifiableList(Arrays.asList(48000, 44100, 22050, 11025, 8000, 4800));

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @AutoValue.Builder
    public static abstract class Builder {
        public abstract AudioSettings autoBuild();

        @NonNull
        public final AudioSettings build() {
            AudioSettings autoBuild = autoBuild();
            String str = autoBuild.getAudioSource() == -1 ? " audioSource" : "";
            if (autoBuild.getSampleRate() <= 0) {
                str = str.concat(" sampleRate");
            }
            if (autoBuild.getChannelCount() <= 0) {
                str = str.concat(" channelCount");
            }
            if (autoBuild.getAudioFormat() == -1) {
                str = str.concat(" audioFormat");
            }
            if (str.isEmpty()) {
                return autoBuild;
            }
            Single$$ExternalSyntheticBUOutline0.m$3("Required settings missing or non-positive:".concat(str));
            return null;
        }

        @NonNull
        public abstract Builder setAudioFormat(int i);

        @NonNull
        public abstract Builder setAudioSource(int i);

        @NonNull
        public abstract Builder setChannelCount(@IntRange(from = 1) int i);

        @NonNull
        public abstract Builder setSampleRate(@IntRange(from = 1) int i);
    }

    @NonNull
    @SuppressLint({"Range"})
    public static Builder builder() {
        return new AutoValue_AudioSettings.Builder().setAudioSource(-1).setSampleRate(-1).setChannelCount(-1).setAudioFormat(-1);
    }

    public abstract int getAudioFormat();

    public abstract int getAudioSource();

    public int getBytesPerFrame() {
        return AudioUtils.getBytesPerFrame(getAudioFormat(), getChannelCount());
    }

    @IntRange(from = 1)
    public abstract int getChannelCount();

    @IntRange(from = 1)
    public abstract int getSampleRate();

    @NonNull
    public abstract Builder toBuilder();
}
