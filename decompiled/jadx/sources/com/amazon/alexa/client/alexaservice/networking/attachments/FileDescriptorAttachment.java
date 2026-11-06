package com.amazon.alexa.client.alexaservice.networking.attachments;

import android.util.Log;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.AlexaAudioSource;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.AlexaDataSource;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class FileDescriptorAttachment extends Attachment {
    private static final String TAG = "FileDescriptorAttachment";
    private volatile boolean closed;
    private final DataFormat dataFormat;
    private final InputStream inputStream;

    public FileDescriptorAttachment(AlexaAudioSource alexaAudioSource) {
        super(AttachmentIdentifier.createRandom());
        Objects.toString(getAttachmentIdentifier());
        this.inputStream = alexaAudioSource.openForReading();
        this.dataFormat = DataFormat.fromAudioFormat(alexaAudioSource.getAudioFormat());
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.attachments.Attachment
    public void close() {
        this.closed = true;
        try {
            Objects.toString(getAttachmentIdentifier());
            this.inputStream.close();
        } catch (IOException e) {
            Log.e(TAG, e.getMessage(), e);
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.attachments.Attachment
    public DataFormat getDataFormat() {
        return this.dataFormat;
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

    public FileDescriptorAttachment(AlexaDataSource alexaDataSource) {
        super(AttachmentIdentifier.createRandom());
        Objects.toString(getAttachmentIdentifier());
        this.inputStream = alexaDataSource.openForReading();
        this.dataFormat = DataFormat.BINARY;
    }
}
