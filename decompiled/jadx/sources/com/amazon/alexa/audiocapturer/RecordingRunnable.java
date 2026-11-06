package com.amazon.alexa.audiocapturer;

import android.media.AudioRecord;
import android.os.ConditionVariable;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.AlexaAudioSink;
import com.amazon.alexa.utils.audio.AcousticEchoCancelerWrapperFactory;
import com.amazon.alexa.utils.validation.Preconditions;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class RecordingRunnable implements Runnable {
    public static final int ACTUAL_BUFFER_SIZE;
    private static final int AUDIO_ENCODING = 2;
    private static final int BUFFER_SIZE = 320;
    private static final int BYTES_PER_SAMPLE = 2;
    private static final int CHANNEL_COUNT = 16;
    private static final int MIN_BUFFER_SIZE;
    private static final int ONE_SECOND_OF_AUDIO = 32000;
    private static final int SAMPLE_RATE = 16000;
    private static final long SHUTDOWN_TIMEOUT_MS = 1000;
    private static final String TAG = "RecordingRunnable";
    public static final String USER_SPEECH_AUDIO_FORMAT = "AUDIO_L16_RATE_16000_CHANNELS_1";
    private final AcousticEchoCancelerWrapperFactory acousticEchoCancelerWrapperFactory;
    private final AlexaAudioSink alexaAudioSink;
    private volatile boolean continueRecording;
    private volatile boolean isDone;
    private final RecordingListener recordingListener;
    private final ConditionVariable shutdownCondition;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public interface RecordingListener {
        void onRecordingError(Throwable th);

        void onRecordingStarted();

        void onRecordingStopped();
    }

    static {
        int minBufferSize = AudioRecord.getMinBufferSize(16000, 16, 2);
        MIN_BUFFER_SIZE = minBufferSize;
        ACTUAL_BUFFER_SIZE = Math.max(320, minBufferSize);
    }

    public RecordingRunnable(AlexaAudioSink alexaAudioSink, RecordingListener recordingListener, AcousticEchoCancelerWrapperFactory acousticEchoCancelerWrapperFactory) {
        Preconditions.notNull(alexaAudioSink, "Audio sink is null");
        Preconditions.notNull(recordingListener, "RecordingListener is null");
        this.alexaAudioSink = alexaAudioSink;
        this.recordingListener = recordingListener;
        this.acousticEchoCancelerWrapperFactory = acousticEchoCancelerWrapperFactory;
        this.shutdownCondition = new ConditionVariable();
        this.continueRecording = true;
    }

    @VisibleForTesting
    public ByteBuffer allocateByteBuffer() {
        return ByteBuffer.allocateDirect(ACTUAL_BUFFER_SIZE);
    }

    @VisibleForTesting
    public AudioRecord createAudioRecord() {
        return new AudioRecord(1, 16000, 16, 2, ACTUAL_BUFFER_SIZE);
    }

    @VisibleForTesting
    public byte[] getArray(ByteBuffer byteBuffer) {
        return byteBuffer.array();
    }

    public boolean isDone() {
        return this.isDone;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b4, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00f9, code lost:
    
        if (r1.getState() != 1) goto L42;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.audiocapturer.RecordingRunnable.run():void");
    }

    public void stop() {
        String str = TAG;
        this.shutdownCondition.close();
        this.continueRecording = false;
        if (!this.shutdownCondition.block(1000L)) {
            Log.e(str, "Failed to stop.");
        }
        this.isDone = true;
    }

    public RecordingRunnable(AlexaAudioSink alexaAudioSink, RecordingListener recordingListener) {
        this(alexaAudioSink, recordingListener, new AcousticEchoCancelerWrapperFactory());
    }
}
