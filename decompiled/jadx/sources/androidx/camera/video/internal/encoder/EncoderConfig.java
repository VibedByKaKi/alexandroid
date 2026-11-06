package androidx.camera.video.internal.encoder;

import android.media.MediaFormat;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Timebase;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface EncoderConfig {
    public static final int CODEC_PROFILE_NONE = -1;

    @NonNull
    Timebase getInputTimebase();

    @NonNull
    String getMimeType();

    int getProfile();

    @NonNull
    MediaFormat toMediaFormat() throws InvalidConfigException;
}
