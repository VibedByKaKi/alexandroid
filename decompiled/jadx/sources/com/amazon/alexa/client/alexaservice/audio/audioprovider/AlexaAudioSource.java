package com.amazon.alexa.client.alexaservice.audio.audioprovider;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.api.AlexaAudioSink;
import com.amazon.alexa.utils.validation.Preconditions;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlexaAudioSource extends AlexaAudioSink {
    private static final String TAG = "AlexaAudioSource";
    private final String audioFormat;
    private final InputStream inputStream;
    private volatile boolean isReadable;

    public AlexaAudioSource(ParcelFileDescriptor parcelFileDescriptor, String str) {
        super(parcelFileDescriptor, null);
        this.inputStream = createInputStream();
        this.isReadable = true;
        this.audioFormat = str;
    }

    @Override // com.amazon.alexa.api.AlexaDataSink
    public void abandon() {
        super.abandon();
        try {
            if (this.inputStream != null) {
                this.isReadable = false;
                this.inputStream.close();
            }
        } catch (IOException e) {
            Log.e(TAG, "Could not abandon input stream.", e);
        }
    }

    @Override // com.amazon.alexa.api.AlexaDataSink, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
        try {
            if (this.inputStream != null) {
                this.isReadable = false;
                this.inputStream.close();
            }
        } catch (IOException e) {
            Log.e(TAG, "Could not close input stream.", e);
        }
    }

    @VisibleForTesting
    public InputStream createInputStream() {
        return new ParcelFileDescriptor.AutoCloseInputStream(this.readDescriptor);
    }

    public String getAudioFormat() {
        return this.audioFormat;
    }

    public boolean isReadable() {
        return this.isReadable;
    }

    public InputStream openForReading() {
        Preconditions.isFalse(!this.isReadable, "The source was not readable. Use isReadable() before opening.");
        this.isReadable = false;
        return this.inputStream;
    }

    public AlexaAudioSource(AlexaAudioSink alexaAudioSink, String str) {
        super(alexaAudioSink);
        this.inputStream = createInputStream();
        this.isReadable = true;
        this.audioFormat = str;
    }
}
