package com.amazon.alexa.client.alexaservice.networking.attachments;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public interface AttachmentWriteCallbacks {
    void onError(Exception exc);

    void onFinishWriting(int i, long j);

    void onFinishWritingDueToTimeout(int i, long j);
}
