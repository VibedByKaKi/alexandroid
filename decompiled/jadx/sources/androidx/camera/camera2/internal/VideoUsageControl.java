package androidx.camera.camera2.internal;

import androidx.camera.core.Logger;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\bJ\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\r\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/camera/camera2/internal/VideoUsageControl;", "", "executor", "Ljava/util/concurrent/Executor;", "(Ljava/util/concurrent/Executor;)V", "mVideoUsage", "Ljava/util/concurrent/atomic/AtomicInteger;", "decrementUsage", "", "getUsage", "", "incrementUsage", "reset", "resetDirectly", "camera-camera2_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class VideoUsageControl {

    @NotNull
    private final Executor executor;

    @NotNull
    private final AtomicInteger mVideoUsage;

    public VideoUsageControl(@NotNull Executor executor) {
        executor.getClass();
        this.executor = executor;
        this.mVideoUsage = new AtomicInteger(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void decrementUsage$lambda$1(VideoUsageControl videoUsageControl) {
        videoUsageControl.getClass();
        int decrementAndGet = videoUsageControl.mVideoUsage.decrementAndGet();
        if (decrementAndGet >= 0) {
            Logger.d("VideoUsageControl", "decrementUsage: mVideoUsage = " + decrementAndGet);
        } else {
            Logger.w("VideoUsageControl", "decrementUsage: mVideoUsage = " + decrementAndGet + ", which is less than 0!");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void incrementUsage$lambda$0(VideoUsageControl videoUsageControl) {
        videoUsageControl.getClass();
        Logger.d("VideoUsageControl", "incrementUsage: mVideoUsage = " + videoUsageControl.mVideoUsage.incrementAndGet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reset$lambda$2(VideoUsageControl videoUsageControl) {
        videoUsageControl.getClass();
        videoUsageControl.resetDirectly();
    }

    public final void decrementUsage() {
        this.executor.execute(new VideoUsageControl$$ExternalSyntheticLambda0(this, 0));
    }

    public final int getUsage() {
        return this.mVideoUsage.get();
    }

    public final void incrementUsage() {
        this.executor.execute(new VideoUsageControl$$ExternalSyntheticLambda0(this, 2));
    }

    public final void reset() {
        this.executor.execute(new VideoUsageControl$$ExternalSyntheticLambda0(this, 1));
    }

    public final void resetDirectly() {
        this.mVideoUsage.set(0);
        Logger.d("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
