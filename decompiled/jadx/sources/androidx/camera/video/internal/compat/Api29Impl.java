package androidx.camera.video.internal.compat;

import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(29)
/* loaded from: classes.dex */
public final class Api29Impl {
    private Api29Impl() {
    }

    @Nullable
    public static AudioRecordingConfiguration getActiveRecordingConfiguration(@NonNull AudioRecord audioRecord) {
        return audioRecord.getActiveRecordingConfiguration();
    }

    public static boolean isClientSilenced(@NonNull AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.isClientSilenced();
    }

    public static void registerAudioRecordingCallback(@NonNull AudioRecord audioRecord, @NonNull Executor executor, @NonNull AudioManager.AudioRecordingCallback audioRecordingCallback) {
        audioRecord.registerAudioRecordingCallback(executor, audioRecordingCallback);
    }

    public static void unregisterAudioRecordingCallback(@NonNull AudioRecord audioRecord, @NonNull AudioManager.AudioRecordingCallback audioRecordingCallback) {
        audioRecord.unregisterAudioRecordingCallback(audioRecordingCallback);
    }
}
