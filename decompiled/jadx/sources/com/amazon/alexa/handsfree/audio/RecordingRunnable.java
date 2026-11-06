package com.amazon.alexa.handsfree.audio;

import android.annotation.SuppressLint;
import android.media.AudioRecord;
import android.os.ConditionVariable;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class RecordingRunnable implements Runnable {
    private static final int ACTUAL_BUFFER_SIZE;
    private static final int AUDIO_ENCODING = 2;
    private static final int BUFFER_SIZE = 320;
    private static final int BYTES_PER_SAMPLE = 2;
    private static final int CHANNEL_COUNT = 16;
    private static final int MIN_BUFFER_SIZE;
    private static final int ONE_SECOND_OF_AUDIO = 32000;
    private static final int SAMPLE_RATE = 16000;
    private static final long SHUTDOWN_TIMEOUT_MS = 1000;
    private static final String TAG = "RecordingRunnable";
    private final AlexaAudioSinkWrapper mAlexaAudioSinkWrapper;
    private final AudioRecord mAudioRecord;
    private volatile boolean mContinueRecording;
    private final ConditionVariable mShutdownCondition;

    static {
        int minBufferSize = AudioRecord.getMinBufferSize(16000, 16, 2);
        MIN_BUFFER_SIZE = minBufferSize;
        ACTUAL_BUFFER_SIZE = Math.max(320, minBufferSize);
    }

    @SuppressLint({"MissingPermission"})
    public RecordingRunnable(@NonNull AlexaAudioSinkWrapper alexaAudioSinkWrapper) {
        this(alexaAudioSinkWrapper, new ConditionVariable(), new AudioRecord(1, 16000, 16, 2, ACTUAL_BUFFER_SIZE), true);
    }

    @VisibleForTesting
    public boolean checkRecordingState(int i) {
        return this.mAudioRecord.getRecordingState() == i;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str = TAG;
        Log.i(str, "starting recording");
        if (!checkRecordingState(1)) {
            Log.e(str, "Unable to start recording. Some other process has the microphone.");
            return;
        }
        this.mAudioRecord.startRecording();
        if (!checkRecordingState(3)) {
            Log.e(str, "Unable to start recording.");
            return;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(ACTUAL_BUFFER_SIZE);
        while (this.mContinueRecording) {
            AudioRecord audioRecord = this.mAudioRecord;
            int i = ACTUAL_BUFFER_SIZE;
            int read = audioRecord.read(allocateDirect, i);
            if (read == -6) {
                Log.e(TAG, "AudioRecord object no longer valid. Needs to be recreated");
                this.mContinueRecording = false;
            } else if (read == -3) {
                Log.e(TAG, "AudioRecord object not properly initialized");
                this.mContinueRecording = false;
            } else if (read == -2) {
                Log.e(TAG, "Invalid arguments to AudioRecord");
                this.mContinueRecording = false;
            } else if (read != -1) {
                this.mAlexaAudioSinkWrapper.recordAudio(allocateDirect.array(), i);
            } else {
                Log.e(TAG, "Unknown error copying data to Attachment");
                this.mContinueRecording = false;
            }
        }
        this.mAlexaAudioSinkWrapper.reset();
        this.mAudioRecord.stop();
        this.mAudioRecord.release();
        this.mShutdownCondition.open();
    }

    public void stop() {
        String str = TAG;
        Log.i(str, "stopping recording");
        this.mShutdownCondition.close();
        this.mContinueRecording = false;
        if (this.mShutdownCondition.block(1000L)) {
            return;
        }
        Log.e(str, "Failed to stop.");
    }

    @VisibleForTesting
    public RecordingRunnable(@NonNull AlexaAudioSinkWrapper alexaAudioSinkWrapper, @NonNull ConditionVariable conditionVariable, @NonNull AudioRecord audioRecord, boolean z) {
        this.mAlexaAudioSinkWrapper = alexaAudioSinkWrapper;
        this.mShutdownCondition = conditionVariable;
        this.mAudioRecord = audioRecord;
        this.mContinueRecording = z;
    }
}
