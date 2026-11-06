package androidx.camera.video.internal.compat;

import android.media.AudioFormat;
import android.media.AudioRecord;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(23)
/* loaded from: classes.dex */
public final class Api23Impl {
    private Api23Impl() {
    }

    @NonNull
    @RequiresPermission("android.permission.RECORD_AUDIO")
    public static AudioRecord build(@NonNull AudioRecord.Builder builder) {
        return builder.build();
    }

    @NonNull
    public static AudioRecord.Builder createAudioRecordBuilder() {
        return new AudioRecord.Builder();
    }

    public static void setAudioFormat(@NonNull AudioRecord.Builder builder, @NonNull AudioFormat audioFormat) {
        builder.setAudioFormat(audioFormat);
    }

    public static void setAudioSource(@NonNull AudioRecord.Builder builder, int i) {
        builder.setAudioSource(i);
    }

    public static void setBufferSizeInBytes(@NonNull AudioRecord.Builder builder, int i) {
        builder.setBufferSizeInBytes(i);
    }
}
