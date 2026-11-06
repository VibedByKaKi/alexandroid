package com.amazon.alexa.client.alexaservice.audio.core;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.AlexaUserSpeechVolumeChangedEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.RecordingEvent;
import com.amazon.alexa.client.alexaservice.networking.attachments.DataFormat;
import com.amazon.alexa.utils.concurrent.ManagedExecutorFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VolumeCalculatingInputStream extends InputStream {

    @VisibleForTesting
    public static final int BUFFER_SIZE_IN_BYTES = 960;
    private static final int ONE_SECOND_BUFFER_SIZE = 32000;
    private static final int PIPED_INPUT_BUFFER_SIZE = 1344000;
    private static final int SAMPLE_SIZE = 320;
    private static final DataFormat SUPPORTED_DATA_FORMAT = DataFormat.LPCM16;
    private static final String TAG = "VolumeCalculatingInputStream";
    private static final String VOLUME_CACULATOR_EXECUTOR_NAME = "volume_calculator";

    @VisibleForTesting
    public static final int VOLUME_EVENT_INTERVAL_MS = 30;
    private static final String VOLUME_EVENT_SENDER_EXECUTOR_NAME = "volume-event-sender";
    private final AudioStreamProcessor audioStreamProcessor;
    private final InputStream baseInputStream;
    private final Future<Void> cachingThreadFuture;
    private final AlexaClientEventBus eventBus;
    private final PipedInputStream inputStream;
    private final ScheduledExecutorService scheduledExecutorService = ManagedExecutorFactory.newSingleThreadScheduledExecutor(VOLUME_EVENT_SENDER_EXECUTOR_NAME);

    public VolumeCalculatingInputStream(InputStream inputStream, AlexaClientEventBus alexaClientEventBus, ScaledVolumeProcessor scaledVolumeProcessor) {
        this.baseInputStream = inputStream;
        this.eventBus = alexaClientEventBus;
        ExecutorService newSingleThreadExecutor = ManagedExecutorFactory.newSingleThreadExecutor(VOLUME_CACULATOR_EXECUTOR_NAME);
        PostVolumeEventRunnable postVolumeEventRunnable = new PostVolumeEventRunnable(this, 0);
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        PipedInputStream pipedInputStream = new PipedInputStream(PIPED_INPUT_BUFFER_SIZE);
        this.inputStream = pipedInputStream;
        try {
            pipedInputStream.connect(pipedOutputStream);
        } catch (IOException e) {
            Log.e(TAG, "Unable to connect input stream", e);
        }
        AudioStreamProcessor audioStreamProcessor = new AudioStreamProcessor(this.baseInputStream, pipedOutputStream, scaledVolumeProcessor);
        this.audioStreamProcessor = audioStreamProcessor;
        this.cachingThreadFuture = newSingleThreadExecutor.submit(audioStreamProcessor);
        alexaClientEventBus.register(this);
        this.scheduledExecutorService.scheduleAtFixedRate(postVolumeEventRunnable, 0L, 30L, TimeUnit.MILLISECONDS);
    }

    private void cancelPostVolumeChangedEventTask() {
        this.eventBus.unregister(this);
        ManagedExecutorFactory.shutdown(VOLUME_EVENT_SENDER_EXECUTOR_NAME);
    }

    public static boolean isSupported(DataFormat dataFormat) {
        return SUPPORTED_DATA_FORMAT.equals(dataFormat);
    }

    @Override // java.io.InputStream
    public synchronized int available() throws IOException {
        return this.inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        cancelPostVolumeChangedEventTask();
        this.audioStreamProcessor.close();
        this.cachingThreadFuture.cancel(true);
        this.inputStream.close();
        this.baseInputStream.close();
    }

    @Subscribe
    public void on(RecordingEvent.StoppedEvent stoppedEvent) {
        cancelPostVolumeChangedEventTask();
    }

    @Override // java.io.InputStream
    public synchronized int read(@NonNull byte[] bArr, int i, int i2) throws IOException {
        if (this.cachingThreadFuture.isDone()) {
            try {
                this.cachingThreadFuture.get();
            } catch (InterruptedException | ExecutionException e) {
                throw new IOException(e);
            }
        }
        return this.inputStream.read(bArr, i, i2);
    }

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public class PostVolumeEventRunnable implements Runnable {
        private PostVolumeEventRunnable() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Float latestScaledVolume = VolumeCalculatingInputStream.this.audioStreamProcessor.getLatestScaledVolume();
            if (latestScaledVolume == null || !VolumeCalculatingInputStream.this.eventBus.hasSubscriberForEvent(AlexaUserSpeechVolumeChangedEvent.class)) {
                return;
            }
            VolumeCalculatingInputStream.this.eventBus.post(AlexaUserSpeechVolumeChangedEvent.create(latestScaledVolume.floatValue()));
        }

        public /* synthetic */ PostVolumeEventRunnable(VolumeCalculatingInputStream volumeCalculatingInputStream, int i) {
            this();
        }
    }

    @Override // java.io.InputStream
    public synchronized int read() throws IOException {
        return this.inputStream.read();
    }
}
