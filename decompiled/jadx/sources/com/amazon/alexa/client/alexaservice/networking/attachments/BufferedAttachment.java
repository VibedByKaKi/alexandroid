package com.amazon.alexa.client.alexaservice.networking.attachments;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
class BufferedAttachment extends Attachment {

    @VisibleForTesting
    static final int BUFFER_SIZE = 384000;
    private static final String TAG = "BufferedAttachment";
    private volatile boolean closed;
    private final DataFormat dataFormat;
    private PipedInputStream inputStream;
    private final PipedOutputStream outputStream;

    @VisibleForTesting
    public BufferedAttachment(AttachmentIdentifier attachmentIdentifier, DataFormat dataFormat) {
        super(attachmentIdentifier);
        PipedOutputStream pipedOutputStream = new PipedOutputStream();
        this.outputStream = pipedOutputStream;
        this.dataFormat = dataFormat;
        PipedInputStream pipedInputStream = new PipedInputStream(BUFFER_SIZE);
        this.inputStream = pipedInputStream;
        try {
            pipedOutputStream.connect(pipedInputStream);
        } catch (IOException e) {
            Log.e(TAG, e.getMessage());
        }
    }

    private void closeStream(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
            Log.e(TAG, "IOException - Stream not closed");
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.attachments.Attachment
    public void close() {
        this.closed = true;
        closeStream(this.outputStream);
        closeStream(this.inputStream);
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
        return this.outputStream;
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.attachments.Attachment
    public boolean isClosed() {
        return this.closed;
    }

    public BufferedAttachment(AttachmentIdentifier attachmentIdentifier) {
        this(attachmentIdentifier, DataFormat.LPCM16);
    }
}
