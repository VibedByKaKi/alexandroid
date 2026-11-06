package androidx.camera.video.internal.config;

import android.util.Range;
import android.util.Rational;
import androidx.annotation.NonNull;
import androidx.biometric.ErrorUtils$$ExternalSyntheticOutline0;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.AudioSpec;
import androidx.camera.video.internal.audio.AudioSettings;
import androidx.camera.video.internal.audio.AudioSource;
import androidx.camera.video.internal.encoder.AudioEncoderConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public final class AudioConfigUtil {
    static final int AUDIO_CHANNEL_COUNT_DEFAULT = 1;
    static final int AUDIO_SAMPLE_RATE_DEFAULT = 44100;
    static final int AUDIO_SOURCE_DEFAULT = 5;
    static final int AUDIO_SOURCE_FORMAT_DEFAULT = 2;
    private static final String TAG = "AudioConfigUtil";

    private AudioConfigUtil() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$selectSampleRateOrNearestSupported$0(int i, Integer num, Integer num2) {
        int abs = Math.abs(num.intValue() - i) - Math.abs(num2.intValue() - i);
        return (int) (abs == 0 ? Math.signum(num.intValue() - num2.intValue()) : Math.signum(abs));
    }

    @NonNull
    public static AudioEncoderConfig resolveAudioEncoderConfig(@NonNull AudioMimeInfo audioMimeInfo, @NonNull Timebase timebase, @NonNull AudioSettings audioSettings, @NonNull AudioSpec audioSpec) {
        EncoderProfilesProxy.AudioProfileProxy compatibleAudioProfile = audioMimeInfo.getCompatibleAudioProfile();
        return (AudioEncoderConfig) (compatibleAudioProfile != null ? new AudioEncoderConfigAudioProfileResolver(audioMimeInfo.getMimeType(), audioMimeInfo.getProfile(), timebase, audioSpec, audioSettings, compatibleAudioProfile) : new AudioEncoderConfigDefaultResolver(audioMimeInfo.getMimeType(), audioMimeInfo.getProfile(), timebase, audioSpec, audioSettings)).get();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008b  */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.camera.video.internal.config.AudioMimeInfo resolveAudioMimeInfo(@androidx.annotation.NonNull androidx.camera.video.MediaSpec r8, @androidx.annotation.Nullable androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy r9) {
        /*
            int r0 = r8.getOutputFormat()
            java.lang.String r0 = androidx.camera.video.MediaSpec.outputFormatToAudioMime(r0)
            int r1 = r8.getOutputFormat()
            int r1 = androidx.camera.video.MediaSpec.outputFormatToAudioProfile(r1)
            if (r9 == 0) goto L7e
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r2 = r9.getDefaultAudioProfile()
            if (r2 == 0) goto L7e
            androidx.camera.core.impl.EncoderProfilesProxy$AudioProfileProxy r9 = r9.getDefaultAudioProfile()
            java.lang.String r2 = r9.getMediaType()
            int r3 = r9.getProfile()
            java.lang.String r4 = "audio/none"
            boolean r4 = java.util.Objects.equals(r2, r4)
            java.lang.String r5 = ")]"
            java.lang.String r6 = "AudioConfigUtil"
            java.lang.String r7 = "(profile: "
            if (r4 == 0) goto L3d
            java.lang.String r8 = "EncoderProfiles contains undefined AUDIO mime type so cannot be used. May rely on fallback defaults to derive settings [chosen mime type: "
            java.lang.String r8 = androidx.collection.DoubleList$$ExternalSyntheticOutline0.m(r8, r0, r7, r1, r5)
            androidx.camera.core.Logger.d(r6, r8)
            goto L7e
        L3d:
            int r8 = r8.getOutputFormat()
            r4 = -1
            if (r8 != r4) goto L50
            java.lang.String r8 = "MediaSpec contains OUTPUT_FORMAT_AUTO. Using EncoderProfiles to derive AUDIO settings [mime type: "
            java.lang.String r8 = androidx.collection.DoubleList$$ExternalSyntheticOutline0.m(r8, r2, r7, r3, r5)
            androidx.camera.core.Logger.d(r6, r8)
            r0 = r2
            r1 = r3
            goto L7f
        L50:
            boolean r8 = java.util.Objects.equals(r0, r2)
            if (r8 == 0) goto L63
            if (r1 != r3) goto L63
            java.lang.String r8 = "MediaSpec audio mime/profile matches EncoderProfiles. Using EncoderProfiles to derive AUDIO settings [mime type: "
            java.lang.String r8 = androidx.collection.DoubleList$$ExternalSyntheticOutline0.m(r8, r2, r7, r1, r5)
            androidx.camera.core.Logger.d(r6, r8)
            r0 = r2
            goto L7f
        L63:
            java.lang.String r8 = "MediaSpec audio mime or profile does not match EncoderProfiles, so EncoderProfiles settings cannot be used. May rely on fallback defaults to derive AUDIO settings [EncoderProfiles mime type: "
            java.lang.String r9 = "), chosen mime type: "
            java.lang.StringBuilder r8 = androidx.collection.DoubleList$$ExternalSyntheticOutline0.m(r3, r8, r2, r7, r9)
            r8.append(r0)
            r8.append(r7)
            r8.append(r1)
            r8.append(r5)
            java.lang.String r8 = r8.toString()
            androidx.camera.core.Logger.d(r6, r8)
        L7e:
            r9 = 0
        L7f:
            androidx.camera.video.internal.config.AudioMimeInfo$Builder r8 = androidx.camera.video.internal.config.AudioMimeInfo.builder(r0)
            java.lang.Object r8 = r8.setProfile(r1)
            androidx.camera.video.internal.config.AudioMimeInfo$Builder r8 = (androidx.camera.video.internal.config.AudioMimeInfo.Builder) r8
            if (r9 == 0) goto L8e
            r8.setCompatibleAudioProfile(r9)
        L8e:
            androidx.camera.video.internal.config.AudioMimeInfo r8 = r8.build()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.config.AudioConfigUtil.resolveAudioMimeInfo(androidx.camera.video.MediaSpec, androidx.camera.video.internal.VideoValidatedEncoderProfilesProxy):androidx.camera.video.internal.config.AudioMimeInfo");
    }

    @NonNull
    public static AudioSettings resolveAudioSettings(@NonNull AudioMimeInfo audioMimeInfo, @NonNull AudioSpec audioSpec) {
        EncoderProfilesProxy.AudioProfileProxy compatibleAudioProfile = audioMimeInfo.getCompatibleAudioProfile();
        return (AudioSettings) (compatibleAudioProfile != null ? new AudioSettingsAudioProfileResolver(audioSpec, compatibleAudioProfile) : new AudioSettingsDefaultResolver(audioSpec)).get();
    }

    public static int resolveAudioSource(@NonNull AudioSpec audioSpec) {
        int source = audioSpec.getSource();
        if (source == -1) {
            Logger.d(TAG, "Using default AUDIO source: 5");
            return 5;
        }
        Logger.d(TAG, "Using provided AUDIO source: " + source);
        return source;
    }

    public static int resolveAudioSourceFormat(@NonNull AudioSpec audioSpec) {
        int sourceFormat = audioSpec.getSourceFormat();
        if (sourceFormat == -1) {
            Logger.d(TAG, "Using default AUDIO source format: 2");
            return 2;
        }
        Logger.d(TAG, "Using provided AUDIO source format: " + sourceFormat);
        return sourceFormat;
    }

    public static int scaleAndClampBitrate(int i, int i2, int i3, int i4, int i5, Range<Integer> range) {
        int doubleValue = (int) (new Rational(i4, i5).doubleValue() * new Rational(i2, i3).doubleValue() * i);
        String format = Logger.isDebugEnabled(TAG) ? String.format("Base Bitrate(%dbps) * Channel Count Ratio(%d / %d) * Sample Rate Ratio(%d / %d) = %d", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(doubleValue)) : "";
        if (!AudioSpec.BITRATE_RANGE_AUTO.equals(range)) {
            Integer clamp = range.clamp(Integer.valueOf(doubleValue));
            doubleValue = clamp.intValue();
            if (Logger.isDebugEnabled(TAG)) {
                format = format.concat(String.format("\nClamped to range %s -> %dbps", range, clamp));
            }
        }
        Logger.d(TAG, format);
        return doubleValue;
    }

    public static int selectSampleRateOrNearestSupported(@NonNull Range<Integer> range, int i, int i2, final int i3) {
        ArrayList arrayList = null;
        int i4 = 0;
        int i5 = i3;
        while (true) {
            if (!range.contains((Range<Integer>) Integer.valueOf(i5))) {
                Logger.d(TAG, "Sample rate " + i5 + "Hz is not in target range " + range);
            } else {
                if (AudioSource.isSettingsSupported(i5, i, i2)) {
                    return i5;
                }
                StringBuilder m29m = ErrorUtils$$ExternalSyntheticOutline0.m29m(i5, i, "Sample rate ", "Hz is not supported by audio source with channel count ", " and source format ");
                m29m.append(i2);
                Logger.d(TAG, m29m.toString());
            }
            if (arrayList == null) {
                Logger.d(TAG, "Trying common sample rates in proximity order to target " + i3 + "Hz");
                arrayList = new ArrayList(AudioSettings.COMMON_SAMPLE_RATES);
                Collections.sort(arrayList, new Comparator() { // from class: androidx.camera.video.internal.config.AudioConfigUtil$$ExternalSyntheticLambda2
                    @Override // java.util.Comparator
                    public final int compare(Object obj, Object obj2) {
                        int lambda$selectSampleRateOrNearestSupported$0;
                        lambda$selectSampleRateOrNearestSupported$0 = AudioConfigUtil.lambda$selectSampleRateOrNearestSupported$0(i3, (Integer) obj, (Integer) obj2);
                        return lambda$selectSampleRateOrNearestSupported$0;
                    }
                });
            }
            if (i4 >= arrayList.size()) {
                Logger.d(TAG, "No sample rate found in target range or supported by audio source. Falling back to default sample rate of 44100Hz");
                return AUDIO_SAMPLE_RATE_DEFAULT;
            }
            i5 = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }
}
