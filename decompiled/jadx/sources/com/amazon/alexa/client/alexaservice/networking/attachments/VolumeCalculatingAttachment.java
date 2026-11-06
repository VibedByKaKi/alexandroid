package com.amazon.alexa.client.alexaservice.networking.attachments;

import android.util.Log;
import com.amazon.alexa.client.alexaservice.audio.core.ScaledVolumeProcessor;
import com.amazon.alexa.client.alexaservice.audio.core.VolumeCalculatingInputStream;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VolumeCalculatingAttachment extends Attachment {
    private static final String TAG = "VolumeCalculatingAttachment";
    private boolean closed;
    private final InputStream inputStream;
    private final Attachment wrappedAttachment;

    public VolumeCalculatingAttachment(AlexaClientEventBus alexaClientEventBus, ScaledVolumeProcessor scaledVolumeProcessor, Attachment attachment) {
        super(attachment.getAttachmentIdentifier());
        Objects.toString(getAttachmentIdentifier());
        this.wrappedAttachment = attachment;
        this.inputStream = new VolumeCalculatingInputStream(attachment.getInputStream(), alexaClientEventBus, scaledVolumeProcessor);
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.attachments.Attachment
    public void close() {
        this.closed = true;
        try {
            this.inputStream.close();
            this.wrappedAttachment.close();
        } catch (IOException unused) {
            Log.e(TAG, "IOException - Stream not closed");
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.attachments.Attachment
    public DataFormat getDataFormat() {
        return this.wrappedAttachment.getDataFormat();
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.attachments.Attachment
    public InputStream getInputStream() {
        return this.inputStream;
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.attachments.Attachment
    public OutputStream getOutputStream() {
        throw new UnsupportedOperationException();
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.attachments.Attachment
    public boolean isClosed() {
        return this.closed;
    }
}
