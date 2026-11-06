package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@UnstableApi
/* loaded from: classes14.dex */
public final class VideoFrameProcessingException extends Exception {
    public final long presentationTimeUs;

    public VideoFrameProcessingException(String str) {
        this(str, -9223372036854775807L);
    }

    public static VideoFrameProcessingException from(Exception exc, long j) {
        return exc instanceof VideoFrameProcessingException ? (VideoFrameProcessingException) exc : new VideoFrameProcessingException(exc, j);
    }

    public VideoFrameProcessingException(String str, long j) {
        super(str);
        this.presentationTimeUs = j;
    }

    public VideoFrameProcessingException(String str, Throwable th) {
        this(str, th, -9223372036854775807L);
    }

    public VideoFrameProcessingException(String str, Throwable th, long j) {
        super(str, th);
        this.presentationTimeUs = j;
    }

    public static VideoFrameProcessingException from(Exception exc) {
        return from(exc, -9223372036854775807L);
    }

    public VideoFrameProcessingException(Throwable th) {
        this(th, -9223372036854775807L);
    }

    public VideoFrameProcessingException(Throwable th, long j) {
        super(th);
        this.presentationTimeUs = j;
    }
}
