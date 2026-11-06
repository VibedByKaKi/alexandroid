package androidx.camera.video.internal.encoder;

import android.media.MediaCodec;
import androidx.annotation.NonNull;
import com.google.common.util.concurrent.ListenableFuture;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public interface EncodedData extends AutoCloseable {
    @Override // java.lang.AutoCloseable
    void close();

    @NonNull
    MediaCodec.BufferInfo getBufferInfo();

    @NonNull
    ByteBuffer getByteBuffer();

    @NonNull
    ListenableFuture<Void> getClosedFuture();

    long getPresentationTimeUs();

    boolean isKeyFrame();

    long size();
}
