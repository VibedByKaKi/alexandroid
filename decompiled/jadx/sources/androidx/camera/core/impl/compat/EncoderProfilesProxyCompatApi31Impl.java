package androidx.camera.core.impl.compat;

import android.media.EncoderProfiles;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.core.impl.EncoderProfilesProxy;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(31)
/* loaded from: classes.dex */
class EncoderProfilesProxyCompatApi31Impl {
    private EncoderProfilesProxyCompatApi31Impl() {
    }

    @NonNull
    public static EncoderProfilesProxy from(@NonNull EncoderProfiles encoderProfiles) {
        return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(encoderProfiles.getDefaultDurationSeconds(), encoderProfiles.getRecommendedFileFormat(), fromAudioProfiles(encoderProfiles.getAudioProfiles()), fromVideoProfiles(encoderProfiles.getVideoProfiles()));
    }

    @NonNull
    private static List<EncoderProfilesProxy.AudioProfileProxy> fromAudioProfiles(@NonNull List<EncoderProfiles.AudioProfile> list) {
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.AudioProfile audioProfile : list) {
            arrayList.add(EncoderProfilesProxy.AudioProfileProxy.create(audioProfile.getCodec(), audioProfile.getMediaType(), audioProfile.getBitrate(), audioProfile.getSampleRate(), audioProfile.getChannels(), audioProfile.getProfile()));
        }
        return arrayList;
    }

    @NonNull
    private static List<EncoderProfilesProxy.VideoProfileProxy> fromVideoProfiles(@NonNull List<EncoderProfiles.VideoProfile> list) {
        ArrayList arrayList = new ArrayList();
        for (EncoderProfiles.VideoProfile videoProfile : list) {
            arrayList.add(EncoderProfilesProxy.VideoProfileProxy.create(videoProfile.getCodec(), videoProfile.getMediaType(), videoProfile.getBitrate(), videoProfile.getFrameRate(), videoProfile.getWidth(), videoProfile.getHeight(), videoProfile.getProfile(), 8, 0, 0));
        }
        return arrayList;
    }
}
