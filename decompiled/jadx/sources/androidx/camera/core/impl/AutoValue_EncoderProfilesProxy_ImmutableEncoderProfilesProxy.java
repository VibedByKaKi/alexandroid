package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.List;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy extends EncoderProfilesProxy.ImmutableEncoderProfilesProxy {
    private final List<EncoderProfilesProxy.AudioProfileProxy> audioProfiles;
    private final int defaultDurationSeconds;
    private final int recommendedFileFormat;
    private final List<EncoderProfilesProxy.VideoProfileProxy> videoProfiles;

    public AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy(int i, int i2, List<EncoderProfilesProxy.AudioProfileProxy> list, List<EncoderProfilesProxy.VideoProfileProxy> list2) {
        this.defaultDurationSeconds = i;
        this.recommendedFileFormat = i2;
        if (list == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null audioProfiles");
            throw null;
        }
        this.audioProfiles = list;
        if (list2 != null) {
            this.videoProfiles = list2;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("Null videoProfiles");
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EncoderProfilesProxy.ImmutableEncoderProfilesProxy) {
            EncoderProfilesProxy.ImmutableEncoderProfilesProxy immutableEncoderProfilesProxy = (EncoderProfilesProxy.ImmutableEncoderProfilesProxy) obj;
            if (this.defaultDurationSeconds == immutableEncoderProfilesProxy.getDefaultDurationSeconds() && this.recommendedFileFormat == immutableEncoderProfilesProxy.getRecommendedFileFormat() && this.audioProfiles.equals(immutableEncoderProfilesProxy.getAudioProfiles()) && this.videoProfiles.equals(immutableEncoderProfilesProxy.getVideoProfiles())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    @NonNull
    public List<EncoderProfilesProxy.AudioProfileProxy> getAudioProfiles() {
        return this.audioProfiles;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public int getDefaultDurationSeconds() {
        return this.defaultDurationSeconds;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    public int getRecommendedFileFormat() {
        return this.recommendedFileFormat;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy
    @NonNull
    public List<EncoderProfilesProxy.VideoProfileProxy> getVideoProfiles() {
        return this.videoProfiles;
    }

    public int hashCode() {
        return this.videoProfiles.hashCode() ^ ((((((this.defaultDurationSeconds ^ 1000003) * 1000003) ^ this.recommendedFileFormat) * 1000003) ^ this.audioProfiles.hashCode()) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sb.append(this.defaultDurationSeconds);
        sb.append(", recommendedFileFormat=");
        sb.append(this.recommendedFileFormat);
        sb.append(", audioProfiles=");
        sb.append(this.audioProfiles);
        sb.append(", videoProfiles=");
        return ErrorUtils$$ExternalSyntheticOutline0.m(StringSubstitutor.DEFAULT_VAR_END, this.videoProfiles, sb);
    }
}
