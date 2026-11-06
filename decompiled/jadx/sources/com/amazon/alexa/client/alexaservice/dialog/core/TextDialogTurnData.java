package com.amazon.alexa.client.alexaservice.dialog.core;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.NonNull;
import com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnData;
import com.amazon.alexa.client.alexaservice.networking.attachments.AttachmentIdentifier;
import java.io.IOException;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class TextDialogTurnData extends DialogTurnData {
    private static final String TAG = "TextDialogTurnData";
    private final String message;

    public TextDialogTurnData(@NonNull String str) {
        this.message = str;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnData
    public DialogTurnDataStreamPair acquireVerificationDataStreams() {
        return null;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnData
    public AttachmentIdentifier getAudioAttachmentId() {
        return null;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnData
    public AttachmentIdentifier getExtraDataAttachmentId() {
        return null;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnData
    public String getMessage() {
        return this.message;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnData
    public boolean hasAudioAttachment() {
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnData
    public boolean hasAudioData() {
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnData
    public boolean hasExtraData() {
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnData
    public boolean hasExtraDataAttachment() {
        return false;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnData
    public boolean hasTextMessage() {
        return !TextUtils.isEmpty(this.message);
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnData
    public void setVerified() {
        DialogTurnData.VerificationState verificationState = this.verificationState;
        DialogTurnData.VerificationState verificationState2 = DialogTurnData.VerificationState.VERIFIED;
        if (verificationState == verificationState2 || !hasTextMessage()) {
            return;
        }
        this.verificationState = verificationState2;
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnData
    public void teardown() {
        Log.i(TAG, "teardown");
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnData
    public void setVerified(int i) throws IOException {
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnData
    public void finish() {
    }

    @Override // com.amazon.alexa.client.alexaservice.dialog.core.DialogTurnData
    public void setExtraDataAttachmentIdentifier(AttachmentIdentifier attachmentIdentifier) {
    }
}
