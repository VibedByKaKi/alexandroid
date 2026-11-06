package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.EncoderProfilesProxy;
import defpackage.a$$ExternalSyntheticOutline0;
import org.apache.commons.text.StringSubstitutor;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
final class AutoValue_EncoderProfilesProxy_AudioProfileProxy extends EncoderProfilesProxy.AudioProfileProxy {
    private final int bitrate;
    private final int channels;
    private final int codec;
    private final String mediaType;
    private final int profile;
    private final int sampleRate;

    public AutoValue_EncoderProfilesProxy_AudioProfileProxy(int i, String str, int i2, int i3, int i4, int i5) {
        this.codec = i;
        if (str == null) {
            Single$$ExternalSyntheticBUOutline0.m$1("Null mediaType");
            throw null;
        }
        this.mediaType = str;
        this.bitrate = i2;
        this.sampleRate = i3;
        this.channels = i4;
        this.profile = i5;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof EncoderProfilesProxy.AudioProfileProxy) {
            EncoderProfilesProxy.AudioProfileProxy audioProfileProxy = (EncoderProfilesProxy.AudioProfileProxy) obj;
            if (this.codec == audioProfileProxy.getCodec() && this.mediaType.equals(audioProfileProxy.getMediaType()) && this.bitrate == audioProfileProxy.getBitrate() && this.sampleRate == audioProfileProxy.getSampleRate() && this.channels == audioProfileProxy.getChannels() && this.profile == audioProfileProxy.getProfile()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public int getBitrate() {
        return this.bitrate;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public int getChannels() {
        return this.channels;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public int getCodec() {
        return this.codec;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    @NonNull
    public String getMediaType() {
        return this.mediaType;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public int getProfile() {
        return this.profile;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProxy.AudioProfileProxy
    public int getSampleRate() {
        return this.sampleRate;
    }

    public int hashCode() {
        return this.profile ^ ((((((((((this.codec ^ 1000003) * 1000003) ^ this.mediaType.hashCode()) * 1000003) ^ this.bitrate) * 1000003) ^ this.sampleRate) * 1000003) ^ this.channels) * 1000003);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioProfileProxy{codec=");
        sb.append(this.codec);
        sb.append(", mediaType=");
        sb.append(this.mediaType);
        sb.append(", bitrate=");
        sb.append(this.bitrate);
        sb.append(", sampleRate=");
        sb.append(this.sampleRate);
        sb.append(", channels=");
        sb.append(this.channels);
        sb.append(", profile=");
        return a$$ExternalSyntheticOutline0.m(sb, this.profile, StringSubstitutor.DEFAULT_VAR_END);
    }
}
