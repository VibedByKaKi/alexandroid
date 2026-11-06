package com.amazon.alexa.client.alexaservice.base.interactions;

import com.amazon.alexa.bluetooth.sco.BluetoothScoController;
import com.amazon.alexa.client.alexaservice.dialog.core.MultiTurnDialog;
import com.amazon.alexa.client.alexaservice.dialog.core.MultiTurnDialogAuthority;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import java.util.Iterator;
import java.util.Set;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class SpecialCaseOverrideAuthority {
    private static final String TAG = "SpecialCaseOverrideAuthority";
    private final MultiTurnDialogAuthority multiTurnDialogAuthority;
    private final BluetoothScoController scoController;

    @Inject
    public SpecialCaseOverrideAuthority(BluetoothScoController bluetoothScoController, MultiTurnDialogAuthority multiTurnDialogAuthority) {
        this.scoController = bluetoothScoController;
        this.multiTurnDialogAuthority = multiTurnDialogAuthority;
    }

    public void requestIfNeedsSco(Set<AudioInteractionLifecycle> set) {
        Iterator<AudioInteractionLifecycle> it2 = set.iterator();
        while (it2.hasNext()) {
            if (requiresSco(it2.next().getDialogRequestIdentifier())) {
                this.scoController.startSco();
                return;
            }
        }
        this.scoController.stopSco();
    }

    public boolean requiresSco(DialogRequestIdentifier dialogRequestIdentifier) {
        MultiTurnDialog dialogFor = this.multiTurnDialogAuthority.getDialogFor(dialogRequestIdentifier);
        return dialogFor != null && dialogFor.getAlexaDialogExtras().getAudioOutputContext().shouldPlayOverSco();
    }

    public boolean requestIfNeedsSco(DialogRequestIdentifier dialogRequestIdentifier) {
        if (!requiresSco(dialogRequestIdentifier)) {
            return false;
        }
        this.scoController.startSco();
        return true;
    }
}
