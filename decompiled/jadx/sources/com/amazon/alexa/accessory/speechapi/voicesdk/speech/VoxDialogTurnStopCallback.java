package com.amazon.alexa.accessory.speechapi.voicesdk.speech;

import com.amazon.alexa.accessory.speechapi.speech.DialogTurnStopCallback;
import com.amazon.alexa.api.AlexaDialogTurnStopCallback;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/amazon/alexa/accessory/speechapi/voicesdk/speech/VoxDialogTurnStopCallback;", "Lcom/amazon/alexa/api/AlexaDialogTurnStopCallback;", "dialogTurnStopCallback", "Lcom/amazon/alexa/accessory/speechapi/speech/DialogTurnStopCallback;", "<init>", "(Lcom/amazon/alexa/accessory/speechapi/speech/DialogTurnStopCallback;)V", "stopRecording", "", "AlexaAccessoryAndroid-speech-api-voicesdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class VoxDialogTurnStopCallback implements AlexaDialogTurnStopCallback {

    @NotNull
    private final DialogTurnStopCallback dialogTurnStopCallback;

    public VoxDialogTurnStopCallback(@NotNull DialogTurnStopCallback dialogTurnStopCallback) {
        dialogTurnStopCallback.getClass();
        this.dialogTurnStopCallback = dialogTurnStopCallback;
    }

    @Override // com.amazon.alexa.api.AlexaDialogTurnStopCallback
    public void stopRecording() {
        this.dialogTurnStopCallback.stopRecording();
    }
}
