package androidx.camera.video.internal.compat;

import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(24)
/* loaded from: classes.dex */
public final class Api24Impl {
    private Api24Impl() {
    }

    public static int getClientAudioSessionId(@NonNull AudioRecordingConfiguration audioRecordingConfiguration) {
        return audioRecordingConfiguration.getClientAudioSessionId();
    }

    public static int getTimestamp(@NonNull AudioRecord audioRecord, @NonNull AudioTimestamp audioTimestamp, int i) {
        return audioRecord.getTimestamp(audioTimestamp, i);
    }
}
