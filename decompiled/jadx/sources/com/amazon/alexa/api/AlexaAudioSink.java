package com.amazon.alexa.api;

import android.os.ParcelFileDescriptor;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes16.dex */
public class AlexaAudioSink extends AlexaDataSink {
    private static final String TAG = "AlexaAudioSink";

    public AlexaAudioSink() throws IOException {
        setTag(TAG);
    }

    public AlexaAudioSink(ParcelFileDescriptor parcelFileDescriptor) {
        this(parcelFileDescriptor, null);
    }

    public AlexaAudioSink(AlexaAudioSink alexaAudioSink) {
        this(alexaAudioSink.readDescriptor, alexaAudioSink.writeDescriptor);
    }

    public AlexaAudioSink(ParcelFileDescriptor parcelFileDescriptor, ParcelFileDescriptor parcelFileDescriptor2) {
        super(parcelFileDescriptor, parcelFileDescriptor2);
        setTag(TAG);
    }
}
