package com.amazon.alexa.client.alexaservice.networking.attachments;

import android.util.Log;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.audio.core.opus.OpusEncodingInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AudioFormatConvertingAttachment extends Attachment {
    private static final String TAG = "AudioFormatConvertingAttachment";
    private final OpusEncodingInputStream opusEncodingInputStream;
    private final Attachment wrappedAttachment;

    public AudioFormatConvertingAttachment(Attachment attachment) {
        super(attachment.getAttachmentIdentifier());
        this.wrappedAttachment = attachment;
        this.opusEncodingInputStream = new OpusEncodingInputStream(attachment.getInputStream());
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.attachments.Attachment
    public void close() {
        try {
            this.opusEncodingInputStream.close();
            this.wrappedAttachment.close();
        } catch (IOException unused) {
            Log.e(TAG, "IOException - Stream not closed");
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.attachments.Attachment
    public DataFormat getDataFormat() {
        DataFormat dataFormat = DataFormat.OPUS32;
        dataFormat.setOpusEncoded(true);
        return dataFormat;
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.attachments.Attachment
    public InputStream getInputStream() {
        return this.opusEncodingInputStream;
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.attachments.Attachment
    @Nullable
    public OutputStream getOutputStream() {
        try {
            return this.wrappedAttachment.getOutputStream();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // com.amazon.alexa.client.alexaservice.networking.attachments.Attachment
    public boolean isClosed() {
        return this.wrappedAttachment.isClosed();
    }
}
