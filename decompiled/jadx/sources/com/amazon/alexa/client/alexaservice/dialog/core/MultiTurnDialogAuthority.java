package com.amazon.alexa.client.alexaservice.dialog.core;

import android.util.Log;
import androidx.annotation.Nullable;
import com.amazon.alexa.api.AlexaDialogRequest;
import com.amazon.alexa.api.ExtendedClient;
import com.amazon.alexa.client.alexaservice.AlexaStateAuthority;
import com.amazon.alexa.client.alexaservice.InternalAlexaState;
import com.amazon.alexa.client.alexaservice.audio.audioprovider.DialogTurnIdentifier;
import com.amazon.alexa.client.alexaservice.eventing.AlexaClientEventBus;
import com.amazon.alexa.client.alexaservice.eventing.events.DialogEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.DialogRequestStoppedEvent;
import com.amazon.alexa.client.alexaservice.eventing.events.RecordingEvent;
import com.amazon.alexa.client.alexaservice.ui.core.LaunchSource;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.amazon.alexa.client.metrics.core.AlexaMetricsConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;
import org.greenrobot.eventbus.Subscribe;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class MultiTurnDialogAuthority {
    private static final String TAG = "MultiTurnDialogAuthority";
    private final AlexaClientEventBus alexaClientEventBus;
    private final AlexaStateAuthority alexaStateAuthority;
    private DialogIdentifier currentDialogIdentifier;
    private boolean deferralGuardActive;
    private final Map<DialogIdentifier, MultiTurnDialog> dialogs = new HashMap();
    private final MultiTurnDialogProvider multiTurnDialogProvider;

    @Inject
    public MultiTurnDialogAuthority(AlexaClientEventBus alexaClientEventBus, MultiTurnDialogProvider multiTurnDialogProvider, AlexaStateAuthority alexaStateAuthority) {
        this.alexaClientEventBus = alexaClientEventBus;
        this.multiTurnDialogProvider = multiTurnDialogProvider;
        this.alexaStateAuthority = alexaStateAuthority;
        alexaClientEventBus.register(this);
    }

    public synchronized MultiTurnDialog createDialog(ExtendedClient extendedClient, DialogLifecycle dialogLifecycle, DialogTurnLifecycle dialogTurnLifecycle, MultiTurnDialogMetadata multiTurnDialogMetadata) {
        MultiTurnDialog create;
        create = this.multiTurnDialogProvider.create(extendedClient, dialogLifecycle, dialogTurnLifecycle, multiTurnDialogMetadata);
        this.dialogs.put(create.getDialogIdentifier(), create);
        Log.i(TAG, "Created dialog: " + create.getDialogIdentifier());
        return create;
    }

    public synchronized MultiTurnDialog createDialogForText(ExtendedClient extendedClient, DialogLifecycle dialogLifecycle, DialogTurnLifecycle dialogTurnLifecycle, MultiTurnDialogMetadata multiTurnDialogMetadata) {
        MultiTurnDialog create;
        create = this.multiTurnDialogProvider.create(extendedClient, dialogLifecycle, dialogTurnLifecycle, multiTurnDialogMetadata, true);
        this.dialogs.put(create.getDialogIdentifier(), create);
        Log.i(TAG, "Created dialog: " + create.getDialogIdentifier());
        return create;
    }

    public synchronized void finishCurrentDialog() {
        if (hasCurrentDialog()) {
            MultiTurnDialog currentDialog = getCurrentDialog();
            DialogRequestIdentifier currentDialogRequestIdentifier = currentDialog.getCurrentDialogRequestIdentifier();
            finishDialog(currentDialog);
            if (currentDialogRequestIdentifier != null && !DialogRequestIdentifier.NONE.equals(currentDialogRequestIdentifier)) {
                this.alexaClientEventBus.post(DialogRequestStoppedEvent.create(currentDialogRequestIdentifier));
            }
        }
    }

    public synchronized void finishDialog(MultiTurnDialog multiTurnDialog) {
        try {
            if (!this.dialogs.containsKey(multiTurnDialog.getDialogIdentifier())) {
                Log.w(TAG, "Attempted to finish a dialog not created by the authority" + multiTurnDialog.getDialogIdentifier() + ". Finishing anyways.");
            }
            if (hasCurrentDialog() && this.currentDialogIdentifier.equals(multiTurnDialog.getDialogIdentifier())) {
                this.currentDialogIdentifier = null;
            }
            Log.i(TAG, "Finishing dialog: " + multiTurnDialog.getDialogIdentifier());
            multiTurnDialog.finish();
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void finishDialogByDrid(@Nullable DialogIdentifier dialogIdentifier) {
        if (dialogIdentifier == null) {
            return;
        }
        try {
            MultiTurnDialog dialogFor = getDialogFor(dialogIdentifier);
            if (dialogFor != null) {
                dialogIdentifier.toString();
                DialogRequestIdentifier currentDialogRequestIdentifier = dialogFor.getCurrentDialogRequestIdentifier();
                finishDialog(dialogFor);
                if (currentDialogRequestIdentifier != null && !DialogRequestIdentifier.NONE.equals(currentDialogRequestIdentifier)) {
                    this.alexaClientEventBus.post(DialogRequestStoppedEvent.create(currentDialogRequestIdentifier));
                }
            } else {
                dialogIdentifier.toString();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized MultiTurnDialog getCurrentDialog() {
        return getDialogFor(this.currentDialogIdentifier);
    }

    public synchronized DialogIdentifier getCurrentDialogIdentifier() {
        return this.currentDialogIdentifier;
    }

    @Nullable
    public synchronized DialogTurnIdentifier getCurrentDialogTurnIdentifier() {
        if (!hasCurrentDialog()) {
            return null;
        }
        return getCurrentDialog().getCurrentDialogTurnIdentifier();
    }

    @Nullable
    public synchronized MultiTurnDialog getDialogFor(DialogRequestIdentifier dialogRequestIdentifier) {
        for (MultiTurnDialog multiTurnDialog : this.dialogs.values()) {
            if (multiTurnDialog.containsTurnFor(dialogRequestIdentifier)) {
                return multiTurnDialog;
            }
        }
        return null;
    }

    @Nullable
    public synchronized DialogTurn getDialogTurnFor(DialogRequestIdentifier dialogRequestIdentifier) {
        for (MultiTurnDialog multiTurnDialog : this.dialogs.values()) {
            if (multiTurnDialog.containsTurnFor(dialogRequestIdentifier)) {
                return multiTurnDialog.getDialogTurnFor(dialogRequestIdentifier);
            }
        }
        return null;
    }

    public synchronized boolean hasCurrentDialog() {
        Objects.toString(this.currentDialogIdentifier);
        return this.currentDialogIdentifier != null;
    }

    public synchronized boolean isCurrentDialog(MultiTurnDialog multiTurnDialog) {
        boolean z;
        DialogIdentifier dialogIdentifier = this.currentDialogIdentifier;
        if (dialogIdentifier != null) {
            z = dialogIdentifier.equals(multiTurnDialog.getDialogIdentifier());
        }
        return z;
    }

    @Subscribe
    public synchronized void on(RecordingEvent.StopEvent stopEvent) {
        if (hasCurrentDialog()) {
            getCurrentDialog().stopRecording(stopEvent.getStopRecordingSource());
        }
    }

    @Deprecated
    public synchronized boolean requestTurn(LaunchSource launchSource) {
        String str = TAG;
        Log.i(str, "Requesting turn.");
        if (!hasCurrentDialog()) {
            Log.i(str, "No current dialog, requesting a new one from available providers.");
            this.alexaClientEventBus.post(DialogEvent.RequestDialogEvent.create(launchSource, AlexaDialogRequest.builder().setInvocationType(AlexaMetricsConstants.EventConstants.INVOCATION_TYPE_NEW_DIALOG_REQUEST).build()));
            return true;
        }
        MultiTurnDialog currentDialog = getCurrentDialog();
        if (!currentDialog.hasRequestedTurn() && !currentDialog.isInTurn()) {
            if (!currentDialog.isStarted()) {
                Log.i(str, "A new dialog has been created already, waiting for its first turn.");
                return false;
            }
            Log.i(str, "Requesting from the current dialog: " + currentDialog.getDialogIdentifier());
            currentDialog.requestNextTurn(launchSource);
            return true;
        }
        Log.i(str, "The current dialog is already in a turn, ignoring this request.");
        return false;
    }

    @Nullable
    public synchronized DialogTurnIdentifier requestTurnWithIdentifier(LaunchSource launchSource) {
        String str = TAG;
        Log.i(str, "Requesting turn with identifier.");
        if (!hasCurrentDialog()) {
            Log.i(str, "No current dialog, requesting a new one from available providers.");
            this.alexaClientEventBus.post(DialogEvent.RequestDialogEvent.create(launchSource, AlexaDialogRequest.builder().setInvocationType(AlexaMetricsConstants.EventConstants.INVOCATION_TYPE_NEW_DIALOG_REQUEST).build()));
            return null;
        }
        MultiTurnDialog currentDialog = getCurrentDialog();
        if (!currentDialog.hasRequestedTurn() && !currentDialog.isInTurn()) {
            if (!currentDialog.isStarted()) {
                Log.i(str, "A new dialog has been created already, waiting for its first turn.");
                return null;
            }
            Log.i(str, "Requesting from the current dialog: " + currentDialog.getDialogIdentifier());
            return currentDialog.requestNextTurnWithIdentifier(launchSource);
        }
        Log.i(str, "The current dialog is already in a turn, ignoring this request.");
        return null;
    }

    public synchronized void restoreDialogIdentifier(@Nullable DialogIdentifier dialogIdentifier) {
        Objects.toString(dialogIdentifier);
        this.currentDialogIdentifier = dialogIdentifier;
    }

    public synchronized void setDeferralGuardActive(boolean z) {
        this.deferralGuardActive = z;
    }

    public synchronized boolean startDialog(MultiTurnDialog multiTurnDialog) {
        if (!this.dialogs.containsKey(multiTurnDialog.getDialogIdentifier())) {
            Log.e(TAG, "Attempted to start a dialog not created by the authority: " + multiTurnDialog.getDialogIdentifier());
            multiTurnDialog.finish();
            return false;
        }
        if (multiTurnDialog.isStarted()) {
            Log.e(TAG, "Attempted to start a dialog which has already started: " + multiTurnDialog.getDialogIdentifier());
            return false;
        }
        if (hasCurrentDialog()) {
            String str = TAG;
            Log.e(str, "There is a current dialog");
            MultiTurnDialog dialogFor = getDialogFor(this.currentDialogIdentifier);
            if (this.deferralGuardActive) {
                Log.i(str, "Deferral guard active: preserving current dialog " + dialogFor.getDialogIdentifier() + " without finishing");
            } else if (dialogFor.isInTurn()) {
                Log.i(str, "Current dialog is active: will finish the current one and honor the new request" + dialogFor.getDialogIdentifier());
                dialogFor.finish();
            } else if (dialogFor.isStarted()) {
                Log.i(str, "Current dialog is in started state: will finish the current one and honor the new request" + dialogFor.getDialogIdentifier());
                dialogFor.finish();
                this.alexaStateAuthority.removeState(InternalAlexaState.RESPONDING);
            }
        }
        this.currentDialogIdentifier = multiTurnDialog.getDialogIdentifier();
        multiTurnDialog.start();
        Log.i(TAG, "Started dialog: " + this.currentDialogIdentifier);
        return true;
    }

    @Nullable
    public synchronized MultiTurnDialog getDialogFor(DialogIdentifier dialogIdentifier) {
        return this.dialogs.get(dialogIdentifier);
    }

    public synchronized void finishDialogByDrid(@Nullable DialogRequestIdentifier dialogRequestIdentifier) {
        if (dialogRequestIdentifier == null) {
            return;
        }
        try {
            MultiTurnDialog dialogFor = getDialogFor(dialogRequestIdentifier);
            if (dialogFor != null) {
                dialogRequestIdentifier.toString();
                finishDialog(dialogFor);
            } else {
                dialogRequestIdentifier.toString();
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
