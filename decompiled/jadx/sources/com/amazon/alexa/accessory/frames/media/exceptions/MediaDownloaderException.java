package com.amazon.alexa.accessory.frames.media.exceptions;

import com.amazon.alexa.accessory.frames.eventbus.MediaImportEventBusManager;
import com.amazon.alexa.accessory.frames.metrics.media.MediaImportError;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes15.dex */
public class MediaDownloaderException extends IOException {
    private final MediaImportError errorCode;

    public MediaDownloaderException(String str, MediaImportError mediaImportError) {
        super(str);
        this.errorCode = mediaImportError;
    }

    public void publishErrorEventBusMessage() {
        MediaImportError mediaImportError = this.errorCode;
        if (mediaImportError != null) {
            MediaImportEventBusManager.publishMediaImportError(mediaImportError);
        }
    }
}
