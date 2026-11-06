package androidx.camera.video.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes.dex */
public abstract class VideoValidatedEncoderProfilesProxy implements EncoderProfilesProxy {
    @NonNull
    public static VideoValidatedEncoderProfilesProxy create(int i, int i2, @NonNull List<EncoderProfilesProxy.AudioProfileProxy> list, @NonNull List<EncoderProfilesProxy.VideoProfileProxy> list2) {
        Preconditions.checkArgument(!list2.isEmpty(), "Should contain at least one VideoProfile.");
        return new AutoValue_VideoValidatedEncoderProfilesProxy(i, i2, ErrorUtils$$ExternalSyntheticOutline0.m(list), ErrorUtils$$ExternalSyntheticOutline0.m(list2), !list.isEmpty() ? list.get(0) : null, list2.get(0));
    }

    @NonNull
    public static VideoValidatedEncoderProfilesProxy from(@NonNull EncoderProfilesProxy encoderProfilesProxy) {
        return create(encoderProfilesProxy.getDefaultDurationSeconds(), encoderProfilesProxy.getRecommendedFileFormat(), encoderProfilesProxy.getAudioProfiles(), encoderProfilesProxy.getVideoProfiles());
    }

    @Nullable
    public abstract EncoderProfilesProxy.AudioProfileProxy getDefaultAudioProfile();

    @NonNull
    public abstract EncoderProfilesProxy.VideoProfileProxy getDefaultVideoProfile();
}
