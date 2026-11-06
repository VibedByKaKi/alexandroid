package androidx.camera.video.internal.compat;

import android.content.Context;
import android.media.AudioRecord;
import android.media.MediaCodecInfo;
import android.util.Range;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(31)
/* loaded from: classes.dex */
public final class Api31Impl {
    private Api31Impl() {
    }

    @NonNull
    public static Range<Integer>[] getInputChannelCountRanges(@NonNull MediaCodecInfo.AudioCapabilities audioCapabilities) {
        return audioCapabilities.getInputChannelCountRanges();
    }

    public static int getMinInputChannelCount(@NonNull MediaCodecInfo.AudioCapabilities audioCapabilities) {
        return audioCapabilities.getMinInputChannelCount();
    }

    public static void setContext(@NonNull AudioRecord.Builder builder, @NonNull Context context) {
        builder.setContext(context);
    }
}
