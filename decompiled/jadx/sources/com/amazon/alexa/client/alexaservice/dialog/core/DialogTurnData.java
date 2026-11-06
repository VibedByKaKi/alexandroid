package com.amazon.alexa.client.alexaservice.dialog.core;

import com.amazon.alexa.client.alexaservice.networking.attachments.AttachmentIdentifier;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class DialogTurnData {
    private static final String TAG = "DialogTurnData";
    protected VerificationState verificationState;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public enum VerificationState {
        UNVERIFIED,
        VERIFYING,
        VERIFIED,
        FINISHED
    }

    public abstract DialogTurnDataStreamPair acquireVerificationDataStreams();

    public synchronized void cleanup() {
        VerificationState verificationState = this.verificationState;
        VerificationState verificationState2 = VerificationState.FINISHED;
        if (verificationState != verificationState2) {
            teardown();
            this.verificationState = verificationState2;
        }
    }

    public abstract void finish();

    public abstract AttachmentIdentifier getAudioAttachmentId();

    public abstract AttachmentIdentifier getExtraDataAttachmentId();

    public abstract String getMessage();

    public abstract boolean hasAudioAttachment();

    public abstract boolean hasAudioData();

    public abstract boolean hasExtraData();

    public abstract boolean hasExtraDataAttachment();

    public abstract boolean hasTextMessage();

    public synchronized boolean isVerified() {
        return this.verificationState == VerificationState.VERIFIED;
    }

    public abstract void setExtraDataAttachmentIdentifier(AttachmentIdentifier attachmentIdentifier);

    public abstract void setVerified();

    public abstract void setVerified(int i) throws IOException;

    public abstract void teardown();
}
