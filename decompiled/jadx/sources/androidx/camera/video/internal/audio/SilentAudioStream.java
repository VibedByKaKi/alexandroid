package androidx.camera.video.internal.audio;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.core.util.Preconditions;
import androidx.paging.LivePagedList$$ExternalSyntheticLambda0;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class SilentAudioStream implements AudioStream {
    private static final String TAG = "SilentAudioStream";

    @Nullable
    private AudioStream.AudioStreamCallback mAudioStreamCallback;
    private final int mBytesPerFrame;

    @Nullable
    private Executor mCallbackExecutor;
    private long mCurrentReadTimeNs;
    private final int mSampleRate;

    @Nullable
    private byte[] mZeroBytes;
    private final AtomicBoolean mIsStarted = new AtomicBoolean(false);
    private final AtomicBoolean mIsReleased = new AtomicBoolean(false);

    public SilentAudioStream(@NonNull AudioSettings audioSettings) {
        this.mBytesPerFrame = audioSettings.getBytesPerFrame();
        this.mSampleRate = audioSettings.getSampleRate();
    }

    private static void blockUntilSystemTimeReached(long j) {
        long currentSystemTimeNs = j - currentSystemTimeNs();
        if (currentSystemTimeNs > 0) {
            try {
                Thread.sleep(currentSystemTimeNs / 1000000);
            } catch (InterruptedException e) {
                Logger.w(TAG, "Ignore interruption", e);
            }
        }
    }

    private void checkNotReleasedOrThrow() {
        Preconditions.checkState(!this.mIsReleased.get(), "AudioStream has been released.");
    }

    private void checkStartedOrThrow() {
        Preconditions.checkState(this.mIsStarted.get(), "AudioStream has not been started.");
    }

    private static long currentSystemTimeNs() {
        return System.nanoTime();
    }

    private void notifySilenced() {
        AudioStream.AudioStreamCallback audioStreamCallback = this.mAudioStreamCallback;
        Executor executor = this.mCallbackExecutor;
        if (audioStreamCallback == null || executor == null) {
            return;
        }
        executor.execute(new LivePagedList$$ExternalSyntheticLambda0(audioStreamCallback, 9));
    }

    private void writeSilenceToBuffer(@NonNull ByteBuffer byteBuffer, int i) {
        Preconditions.checkState(i <= byteBuffer.remaining());
        byte[] bArr = this.mZeroBytes;
        if (bArr == null || bArr.length < i) {
            this.mZeroBytes = new byte[i];
        }
        int position = byteBuffer.position();
        byteBuffer.put(this.mZeroBytes, 0, i).limit(i + position).position(position);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @NonNull
    public AudioStream.PacketInfo read(@NonNull ByteBuffer byteBuffer) {
        checkNotReleasedOrThrow();
        checkStartedOrThrow();
        long sizeToFrameCount = AudioUtils.sizeToFrameCount(byteBuffer.remaining(), this.mBytesPerFrame);
        int frameCountToSize = (int) AudioUtils.frameCountToSize(sizeToFrameCount, this.mBytesPerFrame);
        if (frameCountToSize <= 0) {
            return AudioStream.PacketInfo.of(0, this.mCurrentReadTimeNs);
        }
        long frameCountToDurationNs = this.mCurrentReadTimeNs + AudioUtils.frameCountToDurationNs(sizeToFrameCount, this.mSampleRate);
        blockUntilSystemTimeReached(frameCountToDurationNs);
        writeSilenceToBuffer(byteBuffer, frameCountToSize);
        AudioStream.PacketInfo of = AudioStream.PacketInfo.of(frameCountToSize, this.mCurrentReadTimeNs);
        this.mCurrentReadTimeNs = frameCountToDurationNs;
        return of;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        this.mIsReleased.getAndSet(true);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void setCallback(@Nullable AudioStream.AudioStreamCallback audioStreamCallback, @Nullable Executor executor) {
        boolean z = true;
        Preconditions.checkState(!this.mIsStarted.get(), "AudioStream can not be started when setCallback.");
        checkNotReleasedOrThrow();
        if (audioStreamCallback != null && executor == null) {
            z = false;
        }
        Preconditions.checkArgument(z, "executor can't be null with non-null callback.");
        this.mAudioStreamCallback = audioStreamCallback;
        this.mCallbackExecutor = executor;
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(true)) {
            return;
        }
        this.mCurrentReadTimeNs = currentSystemTimeNs();
        notifySilenced();
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void stop() {
        checkNotReleasedOrThrow();
        this.mIsStarted.set(false);
    }
}
