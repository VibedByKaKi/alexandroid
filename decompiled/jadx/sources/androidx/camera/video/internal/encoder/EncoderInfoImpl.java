package androidx.camera.video.internal.encoder;

import android.media.MediaCodecInfo;
import androidx.annotation.NonNull;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public abstract class EncoderInfoImpl implements EncoderInfo {
    protected final MediaCodecInfo.CodecCapabilities mCodecCapabilities;
    private final MediaCodecInfo mMediaCodecInfo;

    public EncoderInfoImpl(@NonNull MediaCodecInfo mediaCodecInfo, @NonNull String str) throws InvalidConfigException {
        this.mMediaCodecInfo = mediaCodecInfo;
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
            Objects.requireNonNull(capabilitiesForType);
            this.mCodecCapabilities = capabilitiesForType;
        } catch (RuntimeException e) {
            throw new InvalidConfigException(a$$ExternalSyntheticOutline0.m("Unable to get CodecCapabilities for mime: ", str), e);
        }
    }

    @Override // androidx.camera.video.internal.encoder.EncoderInfo
    @NonNull
    public String getName() {
        return this.mMediaCodecInfo.getName();
    }
}
