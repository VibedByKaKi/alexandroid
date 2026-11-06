package androidx.camera.video.internal.compat;

import android.media.MediaMuxer;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.io.FileDescriptor;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RequiresApi(26)
/* loaded from: classes.dex */
public final class Api26Impl {
    private Api26Impl() {
    }

    @NonNull
    public static MediaMuxer createMediaMuxer(@NonNull FileDescriptor fileDescriptor, int i) throws IOException {
        return new MediaMuxer(fileDescriptor, i);
    }
}
