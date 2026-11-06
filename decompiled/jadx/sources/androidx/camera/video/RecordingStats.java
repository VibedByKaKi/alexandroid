package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes.dex */
public abstract class RecordingStats {
    @NonNull
    public static RecordingStats of(long j, long j2, @NonNull AudioStats audioStats) {
        Preconditions.checkArgument(j >= 0, "duration must be positive value.");
        Preconditions.checkArgument(j2 >= 0, "bytes must be positive value.");
        return new AutoValue_RecordingStats(j, j2, audioStats);
    }

    @NonNull
    public abstract AudioStats getAudioStats();

    public abstract long getNumBytesRecorded();

    public abstract long getRecordedDurationNanos();
}
