package com.amazon.alexa.client.alexaservice.networking.attachments;

import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class Attachment {
    private final AttachmentIdentifier attachmentID;
    private volatile boolean isFinished = false;

    public Attachment(AttachmentIdentifier attachmentIdentifier) {
        this.attachmentID = attachmentIdentifier;
    }

    public abstract void close();

    public void finish() {
        this.isFinished = true;
    }

    public AttachmentIdentifier getAttachmentIdentifier() {
        return this.attachmentID;
    }

    public abstract DataFormat getDataFormat();

    public abstract InputStream getInputStream();

    public abstract OutputStream getOutputStream();

    public abstract boolean isClosed();

    public boolean isFinished() {
        return this.isFinished;
    }
}
