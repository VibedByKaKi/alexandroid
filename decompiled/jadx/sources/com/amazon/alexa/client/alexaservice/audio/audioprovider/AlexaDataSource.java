package com.amazon.alexa.client.alexaservice.audio.audioprovider;

import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.amazon.alexa.api.AlexaDataSink;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AlexaDataSource extends AlexaDataSink {
    private static final String TAG = "AlexaAudioSource";
    private final InputStream inputStream;

    public AlexaDataSource(ParcelFileDescriptor parcelFileDescriptor) {
        super(parcelFileDescriptor, null);
        this.inputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.readDescriptor);
    }

    @Override // com.amazon.alexa.api.AlexaDataSink
    public void abandon() {
        super.abandon();
        try {
            InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException e) {
            Log.e(TAG, "Could not abandon input stream.", e);
        }
    }

    @Override // com.amazon.alexa.api.AlexaDataSink, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            InputStream inputStream = this.inputStream;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException e) {
            Log.e(TAG, "Could not close input stream.", e);
        }
    }

    public InputStream openForReading() {
        return this.inputStream;
    }

    public AlexaDataSource(AlexaDataSink alexaDataSink) {
        super(alexaDataSink);
        this.inputStream = new ParcelFileDescriptor.AutoCloseInputStream(this.readDescriptor);
    }
}
