package com.amazon.alexa.handsfree.audio;

import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlexaAudioSinkWrapper {
    private static final String TAG = "AlexaAudioSinkWrapper";
    private ReadableAlexaAudioSink mReadableAlexaAudioSink;

    public AlexaAudioSinkWrapper() {
        try {
            this.mReadableAlexaAudioSink = createEmptyReadableAlexaAudioSink();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @VisibleForTesting
    public ReadableAlexaAudioSink createEmptyReadableAlexaAudioSink() throws IOException {
        return new ReadableAlexaAudioSink();
    }

    @NonNull
    public ReadableAlexaAudioSink getReadableAlexaAudioSink() {
        return this.mReadableAlexaAudioSink;
    }

    @VisibleForTesting
    public boolean isAlexaAudioSinkAvailable() {
        ReadableAlexaAudioSink readableAlexaAudioSink = this.mReadableAlexaAudioSink;
        return readableAlexaAudioSink != null && readableAlexaAudioSink.isWriteable();
    }

    public synchronized void recordAudio(byte[] bArr, int i) {
        if (isAlexaAudioSinkAvailable()) {
            try {
                this.mReadableAlexaAudioSink.openForWriting().write(bArr, 0, i);
            } catch (IOException e) {
                Log.e(TAG, "Error in writing to AlexaAudioSink", e, new Object[0]);
                this.mReadableAlexaAudioSink.abandon();
            }
        }
    }

    public synchronized void reset() {
        Log.i(TAG, "resetting AlexaAudioSink");
        this.mReadableAlexaAudioSink.abandon();
        try {
            this.mReadableAlexaAudioSink = createEmptyReadableAlexaAudioSink();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public AlexaAudioSinkWrapper(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        this.mReadableAlexaAudioSink = new ReadableAlexaAudioSink(parcelFileDescriptor);
    }

    @VisibleForTesting
    public AlexaAudioSinkWrapper(@NonNull ReadableAlexaAudioSink readableAlexaAudioSink) {
        this.mReadableAlexaAudioSink = readableAlexaAudioSink;
    }

    public synchronized void recordAudio(byte[] bArr) {
        recordAudio(bArr, bArr.length);
    }
}
