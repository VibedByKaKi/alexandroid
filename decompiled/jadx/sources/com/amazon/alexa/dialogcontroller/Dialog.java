package com.amazon.alexa.dialogcontroller;

import com.amazon.alexa.api.AlexaDialogController;
import com.amazon.alexa.utils.validation.Preconditions;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class Dialog implements AlexaDialogController {
    private static final String TAG = "Dialog";
    private final BaseDialogController dialogController;
    private final UUID id;
    private boolean inTurn;
    private boolean isMultiturn;

    public Dialog(BaseDialogController baseDialogController) {
        Preconditions.notNull(baseDialogController, "dialog controller is null");
        this.dialogController = baseDialogController;
        this.id = UUID.randomUUID();
    }

    public boolean equals(Object obj) {
        return (obj instanceof Dialog) && this.id.equals(((Dialog) obj).getId());
    }

    public UUID getId() {
        return this.id;
    }

    public int hashCode() {
        return Objects.hashCode(this.id);
    }

    public boolean isInTurn() {
        return this.inTurn;
    }

    public boolean isMultiturn() {
        return this.isMultiturn;
    }

    @Override // com.amazon.alexa.api.AlexaDialogController
    public void onDialogFinished() {
        this.dialogController.onDialogFinished(this);
    }

    @Override // com.amazon.alexa.api.AlexaDialogController
    public void onDialogStarted() {
        this.dialogController.onDialogStarted(this);
    }

    @Override // com.amazon.alexa.api.AlexaDialogController
    public void onDialogTurnFinished() {
        this.inTurn = false;
        this.dialogController.onDialogTurnFinished(this);
    }

    @Override // com.amazon.alexa.api.AlexaDialogController
    public void onDialogTurnStarted() {
        this.inTurn = true;
        this.dialogController.onDialogTurnStarted(this);
    }

    @Override // com.amazon.alexa.api.AlexaDialogController
    public void startRecordingNextDialogTurn() {
        this.isMultiturn = true;
        this.dialogController.startRecordingNextDialogTurn(this);
    }

    @Override // com.amazon.alexa.api.AlexaDialogController
    public void stopRecording() {
        this.dialogController.stopRecording(this);
    }

    public String toString() {
        return "Dialog:" + this.id;
    }
}
