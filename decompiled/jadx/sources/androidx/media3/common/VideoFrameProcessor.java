package androidx.media3.common;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.media3.common.util.TimestampIterator;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public interface VideoFrameProcessor {
    public static final long DROP_OUTPUT_FRAME = -2;
    public static final int INPUT_TYPE_BITMAP = 2;
    public static final int INPUT_TYPE_SURFACE = 1;
    public static final int INPUT_TYPE_SURFACE_AUTOMATIC_FRAME_REGISTRATION = 4;
    public static final int INPUT_TYPE_TEXTURE_ID = 3;
    public static final long RENDER_OUTPUT_FRAME_IMMEDIATELY = -1;
    public static final long RENDER_OUTPUT_FRAME_WITH_PRESENTATION_TIME = -3;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Factory {
        VideoFrameProcessor create(Context context, DebugViewProvider debugViewProvider, ColorInfo colorInfo, boolean z, Executor executor, Listener listener) throws VideoFrameProcessingException;
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InputType {
    }

    void flush();

    Surface getInputSurface();

    int getPendingInputFrameCount();

    boolean queueInputBitmap(Bitmap bitmap, TimestampIterator timestampIterator);

    boolean queueInputTexture(int i, long j);

    boolean registerInputFrame();

    void registerInputStream(int i, List<Effect> list, FrameInfo frameInfo);

    void release();

    void renderOutputFrame(long j);

    void setOnInputFrameProcessedListener(OnInputFrameProcessedListener onInputFrameProcessedListener);

    void setOnInputSurfaceReadyListener(Runnable runnable);

    void setOutputSurfaceInfo(@Nullable SurfaceInfo surfaceInfo);

    void signalEndOfInput();

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface Listener {
        default void onEnded() {
        }

        default void onError(VideoFrameProcessingException videoFrameProcessingException) {
        }

        default void onOutputFrameAvailableForRendering(long j) {
        }

        default void onOutputSizeChanged(int i, int i2) {
        }

        default void onInputStreamRegistered(int i, List<Effect> list, FrameInfo frameInfo) {
        }
    }
}
