package com.amazon.alexa.client.alexaservice.networking.attachments;

import android.util.Log;
import com.amazon.alexa.client.alexaservice.audio.core.AlexaSpeechmarkParser;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class SpeechmarkParsingAttachment extends Attachment {
    private static final int BUFFER_SIZE = 384000;
    private static final String TAG = "SpeechmarkParsingAttachment";
    private volatile boolean closed;
    private final PipedInputStream inputStream;
    private final SpeechmarkParsingPipedOutputStream outputStream;

    public SpeechmarkParsingAttachment(AttachmentIdentifier attachmentIdentifier, AlexaSpeechmarkParser alexaSpeechmarkParser) {
        super(attachmentIdentifier);
        SpeechmarkParsingPipedOutputStream speechmarkParsingPipedOutputStream = new SpeechmarkParsingPipedOutputStream(attachmentIdentifier, alexaSpeechmarkParser);
        this.outputStream = speechmarkParsingPipedOutputStream;
        PipedInputStream pipedInputStream = new PipedInputStream(BUFFER_SIZE);
        this.inputStream = pipedInputStream;
        try {
            speechmarkParsingPipedOutputStream.connect(pipedInputStream);
        } catch (IOException e) {
            Log.e(TAG, e.getMessage());
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.attachments.Attachment
    public void close() {
        this.closed = true;
        try {
            this.inputStream.close();
            this.outputStream.close();
        } catch (IOException unused) {
            Log.e(TAG, "IOException - Stream not closed");
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.attachments.Attachment
    public DataFormat getDataFormat() {
        return DataFormat.LPCM16;
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
}
