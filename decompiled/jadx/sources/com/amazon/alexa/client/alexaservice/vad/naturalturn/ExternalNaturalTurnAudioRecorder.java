package com.amazon.alexa.client.alexaservice.vad.naturalturn;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.alexaservice.audio.core.opus.OpusFrameDecoder;
import com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnDataStreamPair;
import com.amazon.alexa.client.alexaservice.networking.attachments.DataFormat;
import com.amazon.alexa.client.alexaservice.vad.audio.AudioCaptureFormat;
import com.amazon.alexa.client.alexaservice.vad.audio.AudioRecorder;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ExternalNaturalTurnAudioRecorder implements AudioRecorder {
    public static final int DECODE_ERROR_CODE = -100;
    private static final int NUM_DECODED_FRAME_SAMPLES = 320;
    public static final int PASS_THROUGH_IO_ERROR_CODE = -101;
    private static final long READ_THREAD_JOIN_TIMEOUT_MS = 1000;
    private static final String READ_THREAD_NAME = "ExternalNaturalTurnAudioRecorder";
    private static final String TAG = "ExternalNaturalTurnAudioRecorder";

    @Nullable
    private AudioCaptureFormat captureFormat;

    @NonNull
    private final OpusFrameDecoder decoder;

    @Nullable
    private AudioRecorder.AudioFrameListener frameListener;

    @Nullable
    private volatile AudioRecorder.ReadErrorListener readErrorListener;

    @Nullable
    private Thread readThread;
    private final AtomicBoolean recording = new AtomicBoolean(false);
    private final AtomicBoolean turnActive = new AtomicBoolean(false);
    private final AtomicBoolean tappingInProgress = new AtomicBoolean(true);
    private final AtomicBoolean tappingCompletedSuccessfully = new AtomicBoolean(false);

    public ExternalNaturalTurnAudioRecorder(@NonNull OpusFrameDecoder opusFrameDecoder) {
        this.decoder = opusFrameDecoder;
    }

    private int accumulateAndDeliverVadFrames(short[] sArr, int i, short[] sArr2, int i2, int i3, @NonNull AudioRecorder.AudioFrameListener audioFrameListener) {
        int i4 = 0;
        while (i4 < i) {
            int min = Math.min(i - i4, i3 - i2);
            System.arraycopy(sArr, i4, sArr2, i2, min);
            i2 += min;
            i4 += min;
            if (i2 == i3) {
                audioFrameListener.onAudioFrame(Arrays.copyOf(sArr2, i3));
                i2 = 0;
            }
        }
        return i2;
    }

    private void joinReadThread() {
        Thread thread = this.readThread;
        if (thread != null) {
            thread.interrupt();
            try {
                this.readThread.join(1000L);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.readThread.isAlive()) {
                Log.w("ExternalNaturalTurnAudioRecorder", "Read thread " + this.readThread.getId() + " still alive after 1000ms join; abandoning as zombie");
            }
            this.readThread = null;
        }
    }

    private void notifyReadError(int i) {
        AudioRecorder.ReadErrorListener readErrorListener = this.readErrorListener;
        if (readErrorListener != null) {
            readErrorListener.onReadError(i);
        }
    }

    @VisibleForTesting
    public static boolean readFully(@NonNull InputStream inputStream, @NonNull byte[] bArr) throws IOException {
        int i = 0;
        while (i < bArr.length) {
            int read = inputStream.read(bArr, i, bArr.length - i);
            if (read == -1) {
                return false;
            }
            i += read;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0042, code lost:
    
        android.util.Log.i("ExternalNaturalTurnAudioRecorder", "Accessory audio stream ended (EOF)");
        r16 = "eof";
     */
    /* renamed from: readLoop, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void lambda$beginTurn$0(@androidx.annotation.NonNull com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnDataStreamPair r18, int r19, int r20, @androidx.annotation.NonNull com.amazon.alexa.client.alexaservice.vad.audio.AudioRecorder.AudioFrameListener r21) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amazon.alexa.client.alexaservice.vad.naturalturn.ExternalNaturalTurnAudioRecorder.lambda$beginTurn$0(com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnDataStreamPair, int, int, com.amazon.alexa.client.alexaservice.vad.audio.AudioRecorder$AudioFrameListener):void");
    }

    public synchronized boolean beginTurn(@NonNull final DialogTurnDataStreamPair dialogTurnDataStreamPair, @NonNull DataFormat dataFormat) {
        ExternalNaturalTurnAudioRecorder externalNaturalTurnAudioRecorder;
        Throwable th;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
                th = th;
                throw th;
            }
            try {
                if (!this.recording.get()) {
                    Log.w("ExternalNaturalTurnAudioRecorder", "beginTurn called while not recording; ignoring");
                    return false;
                }
                if (this.frameListener == null) {
                    Log.e("ExternalNaturalTurnAudioRecorder", "beginTurn called before startRecording wired a listener; ignoring");
                    return false;
                }
                if (!dialogTurnDataStreamPair.isAvailable()) {
                    Log.e("ExternalNaturalTurnAudioRecorder", "beginTurn called with unavailable streams; ignoring");
                    return false;
                }
                if (dataFormat != DataFormat.OPUS32) {
                    Log.e("ExternalNaturalTurnAudioRecorder", "beginTurn called with unexpected format " + dataFormat + "; this recorder decodes accessory OPUS (OPUS32) only. Ignoring");
                    return false;
                }
                if (this.turnActive.getAndSet(true)) {
                    Log.w("ExternalNaturalTurnAudioRecorder", "beginTurn called while a turn is already active; ignoring");
                    return false;
                }
                joinReadThread();
                this.tappingInProgress.set(true);
                this.tappingCompletedSuccessfully.set(false);
                final int dataFrameSize = dataFormat.getDataFrameSize();
                final int frameSize = this.captureFormat.getFrameSize();
                final AudioRecorder.AudioFrameListener audioFrameListener = this.frameListener;
                Thread thread = new Thread(new Runnable() { // from class: com.amazon.alexa.client.alexaservice.vad.naturalturn.ExternalNaturalTurnAudioRecorder$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ExternalNaturalTurnAudioRecorder.this.lambda$beginTurn$0(dialogTurnDataStreamPair, dataFrameSize, frameSize, audioFrameListener);
                    }
                }, "ExternalNaturalTurnAudioRecorder");
                this.readThread = thread;
                thread.start();
                Log.i("ExternalNaturalTurnAudioRecorder", "Turn started: format=" + dataFormat + ", numOpusPacketBytes=" + dataFrameSize + ", numVadFrameSamples=" + frameSize);
                return true;
            } catch (Throwable th3) {
                th = th3;
                externalNaturalTurnAudioRecorder = this;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            externalNaturalTurnAudioRecorder = this;
            th = th;
            throw th;
        }
    }

    public synchronized void endTurn() {
        if (this.turnActive.getAndSet(false)) {
            joinReadThread();
            Log.i("ExternalNaturalTurnAudioRecorder", "Turn ended");
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.audio.AudioRecorder
    public boolean isRecording() {
        return this.recording.get();
    }

    public boolean isTurnActive() {
        return this.turnActive.get();
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.audio.AudioRecorder
    public synchronized void prepareSession(@NonNull AudioCaptureFormat audioCaptureFormat) {
        this.captureFormat = audioCaptureFormat;
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.audio.AudioRecorder
    public void setReadErrorListener(@Nullable AudioRecorder.ReadErrorListener readErrorListener) {
        this.readErrorListener = readErrorListener;
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.audio.AudioRecorder
    public synchronized void startRecording(@NonNull AudioRecorder.AudioFrameListener audioFrameListener) {
        if (this.captureFormat == null) {
            throw new IllegalStateException("prepareSession(AudioCaptureFormat) must be called before startRecording");
        }
        this.frameListener = audioFrameListener;
        this.recording.set(true);
        Log.i("ExternalNaturalTurnAudioRecorder", "Recording session started; awaiting turns");
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.audio.AudioRecorder
    public synchronized void stopRecording() {
        if (this.recording.getAndSet(false)) {
            this.turnActive.set(false);
            joinReadThread();
            this.frameListener = null;
            Log.i("ExternalNaturalTurnAudioRecorder", "Recording session stopped");
        }
    }

    public void stopTapping() {
        this.tappingCompletedSuccessfully.set(true);
        this.tappingInProgress.set(false);
        Log.i("ExternalNaturalTurnAudioRecorder", "Tapping stopped; pass-through continues to end of turn");
    }

    @Override // com.amazon.alexa.client.alexaservice.vad.audio.AudioRecorder
    public synchronized void teardownSession() {
        stopRecording();
        this.captureFormat = null;
    }
}
