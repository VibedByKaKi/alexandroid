package androidx.camera.video.internal.encoder;

import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.camera.video.internal.BufferProvider;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface Encoder {
    public static final long NO_TIMESTAMP = -1;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface ByteBufferInput extends EncoderInput, BufferProvider<InputBuffer> {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface EncoderInput {
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface SurfaceInput extends EncoderInput {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        public interface OnSurfaceUpdateListener {
            void onSurfaceUpdate(@NonNull Surface surface);
        }

        void setOnSurfaceUpdateListener(@NonNull Executor executor, @NonNull OnSurfaceUpdateListener onSurfaceUpdateListener);
    }

    int getConfiguredBitrate();

    @NonNull
    EncoderInfo getEncoderInfo();

    @NonNull
    EncoderInput getInput();

    @NonNull
    ListenableFuture<Void> getReleasedFuture();

    void pause();

    void release();

    void requestKeyFrame();

    void setEncoderCallback(@NonNull EncoderCallback encoderCallback, @NonNull Executor executor);

    void start();

    void stop();

    void stop(long j);
}
