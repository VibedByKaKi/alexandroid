package androidx.camera.video.internal.config;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.config.AudioMimeInfo;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_AudioMimeInfo extends AudioMimeInfo {
    private final EncoderProfilesProxy.AudioProfileProxy compatibleAudioProfile;
    private final String mimeType;
    private final int profile;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static final class Builder extends AudioMimeInfo.Builder {
        private EncoderProfilesProxy.AudioProfileProxy compatibleAudioProfile;
        private String mimeType;
        private Integer profile;

        @Override // androidx.camera.video.internal.config.AudioMimeInfo.Builder, androidx.camera.video.internal.config.MimeInfo.Builder
        public AudioMimeInfo build() {
            String str = this.mimeType == null ? " mimeType" : "";
            if (this.profile == null) {
                str = str.concat(" profile");
            }
            if (str.isEmpty()) {
                return new AutoValue_AudioMimeInfo(this.mimeType, this.profile.intValue(), this.compatibleAudioProfile);
            }
            Single$$ExternalSyntheticBUOutline0.m$2("Missing required properties:".concat(str));
            return null;
        }

        @Override // androidx.camera.video.internal.config.AudioMimeInfo.Builder
        public AudioMimeInfo.Builder setCompatibleAudioProfile(@Nullable EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
            this.compatibleAudioProfile = audioProfileProxy;
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        public AudioMimeInfo.Builder setMimeType(String str) {
            if (str != null) {
                this.mimeType = str;
                return this;
            }
            Single$$ExternalSyntheticBUOutline0.m$1("Null mimeType");
            return null;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.video.internal.config.MimeInfo.Builder
        public AudioMimeInfo.Builder setProfile(int i) {
            this.profile = Integer.valueOf(i);
            return this;
        }
    }

    private AutoValue_AudioMimeInfo(String str, int i, @Nullable EncoderProfilesProxy.AudioProfileProxy audioProfileProxy) {
        this.mimeType = str;
        this.profile = i;
        this.compatibleAudioProfile = audioProfileProxy;
    }

    public boolean equals(Object obj) {
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AudioMimeInfo) {
            AudioMimeInfo audioMimeInfo = (AudioMimeInfo) obj;
            if (this.mimeType.equals(audioMimeInfo.getMimeType()) && this.profile == audioMimeInfo.getProfile() && ((audioProfileProxy = this.compatibleAudioProfile) != null ? audioProfileProxy.equals(audioMimeInfo.getCompatibleAudioProfile()) : audioMimeInfo.getCompatibleAudioProfile() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.internal.config.AudioMimeInfo
    @Nullable
    public EncoderProfilesProxy.AudioProfileProxy getCompatibleAudioProfile() {
        return this.compatibleAudioProfile;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    @NonNull
    public String getMimeType() {
        return this.mimeType;
    }

    @Override // androidx.camera.video.internal.config.MimeInfo
    public int getProfile() {
        return this.profile;
    }

    public int hashCode() {
        int hashCode = (((this.mimeType.hashCode() ^ 1000003) * 1000003) ^ this.profile) * 1000003;
        EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = this.compatibleAudioProfile;
        return (audioProfileProxy == null ? 0 : audioProfileProxy.hashCode()) ^ hashCode;
    }

    public String toString() {
        return "AudioMimeInfo{mimeType=" + this.mimeType + ", profile=" + this.profile + ", compatibleAudioProfile=" + this.compatibleAudioProfile + StringSubstitutor.DEFAULT_VAR_END;
    }
}
