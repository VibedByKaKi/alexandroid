package androidx.media3.exoplayer;

import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.GuardedBy;
import androidx.annotation.RestrictTo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import org.aspectj.lang.JoinPoint;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@UnstableApi
/* loaded from: classes14.dex */
public final class PlaybackLooperProvider {

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    private HandlerThread internalPlaybackThread;
    private final Object lock;

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    private Looper playbackLooper;

    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    private int referenceCount;

    public PlaybackLooperProvider(Looper looper) {
        this.lock = new Object();
        this.playbackLooper = looper;
        this.internalPlaybackThread = null;
        this.referenceCount = 0;
    }

    public Looper obtainLooper() {
        Looper looper;
        synchronized (this.lock) {
            try {
                if (this.playbackLooper == null) {
                    Assertions.checkState(this.referenceCount == 0 && this.internalPlaybackThread == null);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    this.internalPlaybackThread = handlerThread;
                    handlerThread.start();
                    this.playbackLooper = this.internalPlaybackThread.getLooper();
                }
                this.referenceCount++;
                looper = this.playbackLooper;
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public void releaseLooper() {
        HandlerThread handlerThread;
        synchronized (this.lock) {
            try {
                Assertions.checkState(this.referenceCount > 0);
                int i = this.referenceCount - 1;
                this.referenceCount = i;
                if (i == 0 && (handlerThread = this.internalPlaybackThread) != null) {
                    handlerThread.quit();
                    this.internalPlaybackThread = null;
                    this.playbackLooper = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public PlaybackLooperProvider() {
        this(null);
    }
}
