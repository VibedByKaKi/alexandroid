package androidx.media3.exoplayer.audio;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public final class AudioOffloadSupport {
    public static final AudioOffloadSupport DEFAULT_UNSUPPORTED = new Builder().build();
    public final boolean isFormatSupported;
    public final boolean isGaplessSupported;
    public final boolean isSpeedChangeSupported;

    private AudioOffloadSupport(Builder builder) {
        this.isFormatSupported = builder.isFormatSupported;
        this.isGaplessSupported = builder.isGaplessSupported;
        this.isSpeedChangeSupported = builder.isSpeedChangeSupported;
    }

    public Builder buildUpon() {
        return new Builder(this);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AudioOffloadSupport.class == obj.getClass()) {
            AudioOffloadSupport audioOffloadSupport = (AudioOffloadSupport) obj;
            if (this.isFormatSupported == audioOffloadSupport.isFormatSupported && this.isGaplessSupported == audioOffloadSupport.isGaplessSupported && this.isSpeedChangeSupported == audioOffloadSupport.isSpeedChangeSupported) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.isFormatSupported ? 1 : 0) << 2) + ((this.isGaplessSupported ? 1 : 0) << 1) + (this.isSpeedChangeSupported ? 1 : 0);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder {
        private boolean isFormatSupported;
        private boolean isGaplessSupported;
        private boolean isSpeedChangeSupported;

        public Builder(AudioOffloadSupport audioOffloadSupport) {
            this.isFormatSupported = audioOffloadSupport.isFormatSupported;
            this.isGaplessSupported = audioOffloadSupport.isGaplessSupported;
            this.isSpeedChangeSupported = audioOffloadSupport.isSpeedChangeSupported;
        }

        public AudioOffloadSupport build() {
            if (this.isFormatSupported || !(this.isGaplessSupported || this.isSpeedChangeSupported)) {
                return new AudioOffloadSupport(this);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Secondary offload attribute fields are true but primary isFormatSupported is false");
            return null;
        }

        @CanIgnoreReturnValue
        public Builder setIsFormatSupported(boolean z) {
            this.isFormatSupported = z;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setIsGaplessSupported(boolean z) {
            this.isGaplessSupported = z;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder setIsSpeedChangeSupported(boolean z) {
            this.isSpeedChangeSupported = z;
            return this;
        }

        public Builder() {
        }
    }
}
