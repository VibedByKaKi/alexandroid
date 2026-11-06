package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public interface VideoSinkProvider {
    void clearOutputSurfaceInfo();

    VideoSink getSink();

    void release();

    void setOutputSurfaceInfo(Surface surface, Size size);
}
