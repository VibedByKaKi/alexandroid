package com.amazon.alexa.audiocapturer;

import android.os.ConditionVariable;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.AlexaAudioSink;
import com.amazon.alexa.audiocapturer.RecordingRunnable;
import com.amazon.alexa.utils.LazyTimeProvider;
import com.amazon.alexa.utils.concurrent.ExecutorFactory;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class SimpleAudioCapturer implements AudioCapturer {
    private static final long START_RECORDING_TIMEOUT_MS = 5000;
    private static final String TAG = "SimpleAudioCapturer";
    private final ExecutorService executorService;
    private final LazyTimeProvider lazyTimeProvider;
    private final MetricsListener metricListener;
    private RecordingRunnable recordingRunnable;
    private final AtomicBoolean recordingStarted;
    private final ConditionVariable startRecordingCondition;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @VisibleForTesting
    public class RecordingListener implements RecordingRunnable.RecordingListener {
        private final long micInitializationStartTime;

        public RecordingListener(long j) {
            this.micInitializationStartTime = j;
        }

        @Override // com.amazon.alexa.audiocapturer.RecordingRunnable.RecordingListener
        public void onRecordingError(Throwable th) {
            Log.e(SimpleAudioCapturer.TAG, "Error recording audio", th);
            SimpleAudioCapturer.this.startRecordingCondition.open();
            if (SimpleAudioCapturer.this.isReportingMetric()) {
                SimpleAudioCapturer.this.metricListener.onMicInitializationFailure();
            }
        }

        @Override // com.amazon.alexa.audiocapturer.RecordingRunnable.RecordingListener
        public void onRecordingStarted() {
            SimpleAudioCapturer.this.recordingStarted.set(true);
            SimpleAudioCapturer.this.startRecordingCondition.open();
            if (SimpleAudioCapturer.this.isReportingMetric()) {
                SimpleAudioCapturer.this.metricListener.onMicInitializationSuccess(SimpleAudioCapturer.this.getCurrentTime() - this.micInitializationStartTime);
            }
        }

        @Override // com.amazon.alexa.audiocapturer.RecordingRunnable.RecordingListener
        public void onRecordingStopped() {
            SimpleAudioCapturer.this.recordingStarted.set(false);
            SimpleAudioCapturer.this.startRecordingCondition.open();
            SimpleAudioCapturer.this.release();
        }
    }

    @VisibleForTesting
    public SimpleAudioCapturer(ExecutorService executorService, @Nullable MetricsListener metricsListener) {
        this.lazyTimeProvider = new LazyTimeProvider();
        Preconditions.notNull(executorService, "ExecutorService is null");
        this.executorService = executorService;
        this.metricListener = metricsListener;
        this.startRecordingCondition = new ConditionVariable();
        this.recordingStarted = new AtomicBoolean();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getCurrentTime() {
        if (isReportingMetric()) {
            return this.lazyTimeProvider.get().elapsedRealTime();
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isReportingMetric() {
        return this.metricListener != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        this.recordingRunnable = null;
        this.executorService.shutdown();
        onRelease();
    }

    @VisibleForTesting
    public RecordingListener createRecordingListener(long j) {
        return new RecordingListener(j);
    }

    @VisibleForTesting
    public RecordingRunnable createRecordingRunnable(AlexaAudioSink alexaAudioSink, RecordingListener recordingListener) {
        return new RecordingRunnable(alexaAudioSink, recordingListener);
    }

    @Override // com.amazon.alexa.audiocapturer.AudioCapturer
    public synchronized boolean isCapturing() {
        boolean z;
        RecordingRunnable recordingRunnable = this.recordingRunnable;
        if (recordingRunnable != null) {
            z = recordingRunnable.isDone() ? false : true;
        }
        return z;
    }

    @Override // com.amazon.alexa.audiocapturer.AudioCapturer
    public synchronized boolean startCapturing(AlexaAudioSink alexaAudioSink) {
        try {
            Preconditions.notNull(alexaAudioSink, "Audio sink is null");
            RecordingRunnable createRecordingRunnable = createRecordingRunnable(alexaAudioSink, createRecordingListener(getCurrentTime()));
            this.recordingRunnable = createRecordingRunnable;
            this.executorService.execute(createRecordingRunnable);
            if (!this.startRecordingCondition.block(5000L)) {
                Log.e(TAG, "Recording didn't start within 5000 ms");
                if (isReportingMetric()) {
                    this.metricListener.onMicInitializationFailure();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.recordingStarted.getAndSet(false);
    }

    @Override // com.amazon.alexa.audiocapturer.AudioCapturer
    public synchronized void stopCapturing() {
        try {
            if (isCapturing()) {
                this.recordingRunnable.stop();
            }
            release();
        } catch (Throwable th) {
            throw th;
        }
    }

    public void onRelease() {
    }

    public SimpleAudioCapturer(@Nullable MetricsListener metricsListener) {
        this(ExecutorFactory.newSingleThreadExecutor("AudioCapturer"), metricsListener);
    }

    public SimpleAudioCapturer() {
        this(null);
    }
}
