package com.amazon.alexa.client.alexaservice.dialog.core;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.DialogRequestIdChangedEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.DialogStoppedEvent;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class DialogAuthority {
    private DialogRequestIdentifier currentDialogRequestId;
    private final AlexaClientEventBus eventBus;

    @Inject
    public DialogAuthority(AlexaClientEventBus alexaClientEventBus) {
        this.eventBus = alexaClientEventBus;
        alexaClientEventBus.register(this);
    }

    private void setNewDialogRequestId(DialogRequestIdentifier dialogRequestIdentifier) {
        this.currentDialogRequestId = dialogRequestIdentifier;
        this.eventBus.post(DialogRequestIdChangedEvent.create(dialogRequestIdentifier));
    }

    public synchronized DialogRequestIdentifier createDialog() {
        setNewDialogRequestId(DialogRequestIdentifier.createRandom());
        return this.currentDialogRequestId;
    }

    @Nullable
    public synchronized DialogRequestIdentifier getCurrentDialogId() {
        return this.currentDialogRequestId;
    }

    public synchronized void invalidateCurrentDialog() {
        this.currentDialogRequestId = null;
    }

    public synchronized boolean isCurrentDialogId(@Nullable DialogRequestIdentifier dialogRequestIdentifier) {
        boolean z;
        DialogRequestIdentifier dialogRequestIdentifier2 = this.currentDialogRequestId;
        if (dialogRequestIdentifier2 != null && dialogRequestIdentifier2 != DialogRequestIdentifier.NONE && dialogRequestIdentifier != null) {
            z = dialogRequestIdentifier2.equals(dialogRequestIdentifier);
        }
        return z;
    }

    @Subscribe
    public synchronized void on(DialogStoppedEvent dialogStoppedEvent) {
        invalidateCurrentDialog();
    }

    public synchronized void restoreDialog(@Nullable DialogRequestIdentifier dialogRequestIdentifier) {
        this.currentDialogRequestId = dialogRequestIdentifier;
    }

    public synchronized DialogRequestIdentifier createDialog(DialogRequestIdentifier dialogRequestIdentifier) {
        setNewDialogRequestId(dialogRequestIdentifier);
        return this.currentDialogRequestId;
    }
}
