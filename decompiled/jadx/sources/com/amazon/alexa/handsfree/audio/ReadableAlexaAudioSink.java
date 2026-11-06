package com.amazon.alexa.handsfree.audio;

import android.os.ParcelFileDescriptor;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.AlexaAudioSink;
import com.amazon.alexa.handsfree.protocols.utils.Log;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ReadableAlexaAudioSink extends AlexaAudioSink {
    private static final String TAG = "ReadableAlexaAudioSink";
    private final InputStream inputStream;

    public ReadableAlexaAudioSink() throws IOException {
        this.inputStream = createInputStream();
    }

    @Override // com.amazon.alexa.api.AlexaDataSink
    public synchronized void abandon() {
        super.abandon();
        try {
            InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException e) {
            Log.e(TAG, "failed to abandon input stream.", e, new Object[0]);
        }
    }

    @Override // com.amazon.alexa.api.AlexaDataSink, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        super.close();
        try {
            InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException e) {
            Log.e(TAG, "failed to close input stream.", e, new Object[0]);
        }
    }

    @VisibleForTesting
    public InputStream createInputStream() {
        return new ParcelFileDescriptor.AutoCloseInputStream(this.readDescriptor);
    }

    public InputStream openForReading() {
        return this.inputStream;
    }

    public ReadableAlexaAudioSink(@NonNull ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor);
        this.inputStream = createInputStream();
    }
}
