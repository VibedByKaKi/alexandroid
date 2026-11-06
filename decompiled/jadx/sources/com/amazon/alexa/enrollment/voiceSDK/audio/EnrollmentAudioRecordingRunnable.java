package com.amazon.alexa.enrollment.voiceSDK.audio;

import android.annotation.SuppressLint;
import android.media.AudioRecord;
import android.os.ConditionVariable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.enrollment.metrics.MetricsConstants;
import com.amazon.alexa.enrollment.voiceSDK.enrollmentEvents.EnrollmentEventBus;
import com.amazon.alexa.enrollment.voiceSDK.enrollmentEvents.events.EnrollmentTerminateEvent;
import java.nio.ByteBuffer;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EnrollmentAudioRecordingRunnable implements Runnable {
    private static final int ACTUAL_BUFFER_SIZE;
    private static final int AUDIO_ENCODING = 2;
    private static final int BUFFER_SIZE = 1280;
    private static final int BYTES_PER_SAMPLE = 2;
    private static final int CHANNEL_COUNT = 16;
    private static final int MIN_BUFFER_SIZE;
    private static final int ONE_SECOND_OF_AUDIO = 32000;
    private static final int SAMPLE_RATE = 16000;
    private static final long SHUTDOWN_TIMEOUT_MS = 1000;
    private static final String TAG = "VoxEn_EnrollmentAudioRecordingRunnable";
    private final AudioRecord audioRecord;
    private volatile boolean continueRecording;
    private final EnrollmentAudioSinkWrapper enrollmentAudioSinkWrapper;
    private final EnrollmentEventBus enrollmentEventBus;
    private final ConditionVariable shutdownCondition;

    static {
        int minBufferSize = AudioRecord.getMinBufferSize(16000, 16, 2);
        MIN_BUFFER_SIZE = minBufferSize;
        ACTUAL_BUFFER_SIZE = Math.max(1280, minBufferSize);
    }

    @SuppressLint({"MissingPermission"})
    public EnrollmentAudioRecordingRunnable(@NonNull EnrollmentAudioSinkWrapper enrollmentAudioSinkWrapper, @NonNull EnrollmentEventBus enrollmentEventBus) {
        this(enrollmentAudioSinkWrapper, enrollmentEventBus, new ConditionVariable(), new AudioRecord(1, 16000, 16, 2, ACTUAL_BUFFER_SIZE), true);
    }

    private boolean checkRecordingState(int i) {
        return this.audioRecord.getRecordingState() == i;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str = TAG;
        if (!checkRecordingState(1)) {
            Log.e(str, "Unable to start recording. Some other process has the microphone.");
            this.enrollmentEventBus.sendEvent(EnrollmentTerminateEvent.create(MetricsConstants.UserInteractionMetrics.RECORDER_ALREADY_ACQUIRED));
            return;
        }
        if (this.audioRecord.getState() != 1) {
            Log.e(str, "Unable to start recording. AudioRecord state is not INITIALIZED");
            this.enrollmentEventBus.sendEvent(EnrollmentTerminateEvent.create(MetricsConstants.UserInteractionMetrics.AUDIO_RECORDER_STATE_INVALID));
            return;
        }
        this.audioRecord.startRecording();
        if (!checkRecordingState(3)) {
            Log.e(str, "Unable to start recording.");
            this.enrollmentEventBus.sendEvent(EnrollmentTerminateEvent.create(MetricsConstants.UserInteractionMetrics.RECORDER_NOT_STARTED));
            return;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(ACTUAL_BUFFER_SIZE);
        while (this.continueRecording) {
            AudioRecord audioRecord = this.audioRecord;
            int i = ACTUAL_BUFFER_SIZE;
            int read = audioRecord.read(allocateDirect, i);
            if (read == -6) {
                Log.e(TAG, "AudioRecord object no longer valid. Needs to be recreated");
                this.continueRecording = false;
            } else if (read == -3) {
                Log.e(TAG, "AudioRecord object not properly initialized");
                this.continueRecording = false;
            } else if (read == -2) {
                Log.e(TAG, "Invalid arguments to AudioRecord");
                this.continueRecording = false;
            } else if (read != -1) {
                this.enrollmentAudioSinkWrapper.recordEnrollmentAudio(allocateDirect.array(), i);
            } else {
                Log.e(TAG, "Unknown error copying data to Attachment");
                this.continueRecording = false;
            }
        }
        this.enrollmentAudioSinkWrapper.resetAudioSink();
        this.audioRecord.stop();
        this.audioRecord.release();
        this.shutdownCondition.open();
    }

    public void stop() {
        String str = TAG;
        this.shutdownCondition.close();
        this.continueRecording = false;
        if (this.shutdownCondition.block(1000L)) {
            return;
        }
        Log.e(str, "Failed to stop the audio recorder.");
        this.enrollmentEventBus.sendEvent(EnrollmentTerminateEvent.create(MetricsConstants.UserInteractionMetrics.RECORDER_NOT_STOPPED));
    }

    @VisibleForTesting
    public EnrollmentAudioRecordingRunnable(EnrollmentAudioSinkWrapper enrollmentAudioSinkWrapper, EnrollmentEventBus enrollmentEventBus, ConditionVariable conditionVariable, AudioRecord audioRecord, boolean z) {
        this.enrollmentAudioSinkWrapper = enrollmentAudioSinkWrapper;
        this.shutdownCondition = conditionVariable;
        this.audioRecord = audioRecord;
        this.continueRecording = z;
        this.enrollmentEventBus = enrollmentEventBus;
    }
}
