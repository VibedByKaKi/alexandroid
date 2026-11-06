package androidx.camera.video.internal.audio;

import android.annotation.SuppressLint;
import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RequiresPermission;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.audio.AudioStream;
import androidx.camera.video.internal.compat.Api23Impl;
import androidx.camera.video.internal.compat.Api24Impl;
import androidx.camera.video.internal.compat.Api29Impl;
import androidx.camera.video.internal.compat.Api31Impl;
import androidx.camera.video.internal.compat.quirk.AudioTimestampFramePositionIncorrectQuirk;
import androidx.camera.video.internal.compat.quirk.DeviceQuirks;
import androidx.core.util.Preconditions;
import com.amazon.alexa.accessory.frames.media.autoimport.AutoImportConstants;
import com.mapbox.common.LifecycleUtils$$ExternalSyntheticLambda2;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes.dex */
public class AudioStreamImpl implements AudioStream {
    private static final long DIFF_LIMIT_FROM_SYSTEM_TIME_NS = AutoImportConstants.CRITICAL_STORAGE_THRESHOLD;
    private static final String TAG = "AudioStreamImpl";

    @NonNull
    private AudioRecord mAudioRecord;

    @Nullable
    private AudioManager.AudioRecordingCallback mAudioRecordingCallback;

    @Nullable
    private AudioStream.AudioStreamCallback mAudioStreamCallback;
    private final int mBufferSize;
    private final int mBytesPerFrame;

    @Nullable
    private Executor mCallbackExecutor;
    private final AudioSettings mSettings;
    private long mTotalFramesRead;
    private final AtomicBoolean mIsReleased = new AtomicBoolean(false);
    private final AtomicBoolean mIsStarted = new AtomicBoolean(false);
    private final AtomicReference<Boolean> mNotifiedSilenceState = new AtomicReference<>(null);
    private boolean mShouldFallbackToSystemTime = false;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @RequiresApi(29)
    public class AudioRecordingApi29Callback extends AudioManager.AudioRecordingCallback {
        public AudioRecordingApi29Callback() {
        }

        @Override // android.media.AudioManager.AudioRecordingCallback
        public void onRecordingConfigChanged(List<AudioRecordingConfiguration> list) {
            for (AudioRecordingConfiguration audioRecordingConfiguration : list) {
                if (Api24Impl.getClientAudioSessionId(audioRecordingConfiguration) == AudioStreamImpl.this.mAudioRecord.getAudioSessionId()) {
                    AudioStreamImpl.this.notifySilenced(Api29Impl.isClientSilenced(audioRecordingConfiguration));
                    return;
                }
            }
        }
    }

    @RequiresPermission("android.permission.RECORD_AUDIO")
    public AudioStreamImpl(@NonNull AudioSettings audioSettings, @Nullable Context context) throws IllegalArgumentException, AudioStream.AudioStreamException {
        if (!isSettingsSupported(audioSettings.getSampleRate(), audioSettings.getChannelCount(), audioSettings.getAudioFormat())) {
            throw new UnsupportedOperationException(String.format("The combination of sample rate %d, channel count %d and audio format %d is not supported.", Integer.valueOf(audioSettings.getSampleRate()), Integer.valueOf(audioSettings.getChannelCount()), Integer.valueOf(audioSettings.getAudioFormat())));
        }
        this.mSettings = audioSettings;
        this.mBytesPerFrame = audioSettings.getBytesPerFrame();
        int minBufferSize = getMinBufferSize(audioSettings.getSampleRate(), audioSettings.getChannelCount(), audioSettings.getAudioFormat());
        Preconditions.checkState(minBufferSize > 0);
        int i = minBufferSize * 2;
        this.mBufferSize = i;
        AudioRecord createAudioRecord = createAudioRecord(i, audioSettings, context);
        this.mAudioRecord = createAudioRecord;
        checkAudioRecordInitialStateOrReleaseAndThrow(createAudioRecord);
    }

    private static void checkAudioRecordInitialStateOrReleaseAndThrow(@NonNull AudioRecord audioRecord) throws AudioStream.AudioStreamException {
        if (audioRecord.getState() == 1) {
            return;
        }
        audioRecord.release();
        throw new AudioStream.AudioStreamException("Unable to initialize AudioRecord");
    }

    private void checkNotReleasedOrThrow() {
        Preconditions.checkState(!this.mIsReleased.get(), "AudioStream has been released.");
    }

    private void checkStartedOrThrow() {
        Preconditions.checkState(this.mIsStarted.get(), "AudioStream has not been started.");
    }

    @NonNull
    @RequiresPermission("android.permission.RECORD_AUDIO")
    private static AudioRecord createAudioRecord(int i, @NonNull AudioSettings audioSettings, @Nullable Context context) {
        AudioFormat build = new AudioFormat.Builder().setSampleRate(audioSettings.getSampleRate()).setChannelMask(AudioUtils.channelCountToChannelMask(audioSettings.getChannelCount())).setEncoding(audioSettings.getAudioFormat()).build();
        AudioRecord.Builder createAudioRecordBuilder = Api23Impl.createAudioRecordBuilder();
        if (Build.VERSION.SDK_INT >= 31 && context != null) {
            Api31Impl.setContext(createAudioRecordBuilder, context);
        }
        Api23Impl.setAudioSource(createAudioRecordBuilder, audioSettings.getAudioSource());
        Api23Impl.setAudioFormat(createAudioRecordBuilder, build);
        Api23Impl.setBufferSizeInBytes(createAudioRecordBuilder, i);
        return Api23Impl.build(createAudioRecordBuilder);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private long generatePresentationTimeNs() {
        /*
            r9 = this;
            boolean r0 = r9.mShouldFallbackToSystemTime
            r1 = -1
            if (r0 != 0) goto L3c
            android.media.AudioTimestamp r0 = new android.media.AudioTimestamp
            r0.<init>()
            android.media.AudioRecord r3 = r9.mAudioRecord
            r4 = 0
            int r3 = androidx.camera.video.internal.compat.Api24Impl.getTimestamp(r3, r0, r4)
            if (r3 != 0) goto L34
            androidx.camera.video.internal.audio.AudioSettings r3 = r9.mSettings
            int r3 = r3.getSampleRate()
            long r4 = r9.mTotalFramesRead
            long r3 = androidx.camera.video.internal.audio.AudioUtils.computeInterpolatedTimeNs(r3, r4, r0)
            long r5 = java.lang.System.nanoTime()
            long r5 = r3 - r5
            long r5 = java.lang.Math.abs(r5)
            long r7 = androidx.camera.video.internal.audio.AudioStreamImpl.DIFF_LIMIT_FROM_SYSTEM_TIME_NS
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L3d
            r0 = 1
            r9.mShouldFallbackToSystemTime = r0
            goto L3c
        L34:
            java.lang.String r9 = "AudioStreamImpl"
            java.lang.String r0 = "Unable to get audio timestamp"
            androidx.camera.core.Logger.w(r9, r0)
        L3c:
            r3 = r1
        L3d:
            int r9 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r9 != 0) goto L46
            long r0 = java.lang.System.nanoTime()
            return r0
        L46:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.video.internal.audio.AudioStreamImpl.generatePresentationTimeNs():long");
    }

    private static int getMinBufferSize(int i, int i2, int i3) {
        return AudioRecord.getMinBufferSize(i, AudioUtils.channelCountToChannelConfig(i2), i3);
    }

    private static boolean hasAudioTimestampQuirk() {
        return DeviceQuirks.get(AudioTimestampFramePositionIncorrectQuirk.class) != null;
    }

    public static boolean isSettingsSupported(int i, int i2, int i3) {
        return i > 0 && i2 > 0 && getMinBufferSize(i, i2, i3) > 0;
    }

    public void notifySilenced(boolean z) {
        Executor executor = this.mCallbackExecutor;
        AudioStream.AudioStreamCallback audioStreamCallback = this.mAudioStreamCallback;
        if (executor == null || audioStreamCallback == null || Objects.equals(this.mNotifiedSilenceState.getAndSet(Boolean.valueOf(z)), Boolean.valueOf(z))) {
            return;
        }
        executor.execute(new LifecycleUtils$$ExternalSyntheticLambda2(audioStreamCallback, z, 2));
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @NonNull
    public AudioStream.PacketInfo read(@NonNull ByteBuffer byteBuffer) {
        long j;
        checkNotReleasedOrThrow();
        checkStartedOrThrow();
        int read = this.mAudioRecord.read(byteBuffer, this.mBufferSize);
        if (read > 0) {
            byteBuffer.limit(read);
            j = generatePresentationTimeNs();
            this.mTotalFramesRead = AudioUtils.sizeToFrameCount(read, this.mBytesPerFrame) + this.mTotalFramesRead;
        } else {
            j = 0;
        }
        return AudioStream.PacketInfo.of(read, j);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void release() {
        if (this.mIsReleased.getAndSet(true)) {
            return;
        }
        AudioManager.AudioRecordingCallback audioRecordingCallback = this.mAudioRecordingCallback;
        if (audioRecordingCallback != null) {
            Api29Impl.unregisterAudioRecordingCallback(this.mAudioRecord, audioRecordingCallback);
        }
        this.mAudioRecord.release();
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
        AudioManager.AudioRecordingCallback audioRecordingCallback = this.mAudioRecordingCallback;
        if (audioRecordingCallback != null) {
            Api29Impl.unregisterAudioRecordingCallback(this.mAudioRecord, audioRecordingCallback);
        }
        if (audioStreamCallback == null) {
            return;
        }
        if (this.mAudioRecordingCallback == null) {
            this.mAudioRecordingCallback = new AudioRecordingApi29Callback();
        }
        Api29Impl.registerAudioRecordingCallback(this.mAudioRecord, executor, this.mAudioRecordingCallback);
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    public void start() throws AudioStream.AudioStreamException {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(true)) {
            return;
        }
        if (hasAudioTimestampQuirk()) {
            checkAudioRecordInitialStateOrReleaseAndThrow(this.mAudioRecord);
        }
        this.mAudioRecord.startRecording();
        if (this.mAudioRecord.getRecordingState() != 3) {
            this.mIsStarted.set(false);
            throw new AudioStream.AudioStreamException("Unable to start AudioRecord with state: " + this.mAudioRecord.getRecordingState());
        }
        this.mTotalFramesRead = 0L;
        this.mShouldFallbackToSystemTime = false;
        this.mNotifiedSilenceState.set(null);
        AudioRecordingConfiguration activeRecordingConfiguration = Api29Impl.getActiveRecordingConfiguration(this.mAudioRecord);
        notifySilenced(activeRecordingConfiguration != null && Api29Impl.isClientSilenced(activeRecordingConfiguration));
    }

    @Override // androidx.camera.video.internal.audio.AudioStream
    @SuppressLint({"MissingPermission"})
    public void stop() {
        checkNotReleasedOrThrow();
        if (this.mIsStarted.getAndSet(false)) {
            this.mAudioRecord.stop();
            if (this.mAudioRecord.getRecordingState() != 1) {
                Logger.w(TAG, "Failed to stop AudioRecord with state: " + this.mAudioRecord.getRecordingState());
            }
            if (hasAudioTimestampQuirk()) {
                this.mAudioRecord.release();
                this.mAudioRecord = createAudioRecord(this.mBufferSize, this.mSettings, null);
            }
        }
    }
}
