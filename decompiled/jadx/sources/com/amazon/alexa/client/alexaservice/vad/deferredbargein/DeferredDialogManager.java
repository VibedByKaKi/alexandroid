package com.amazon.alexa.client.alexaservice.vad.deferredbargein;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.dialog.core.DialogIdentifier;
import com.amazon.alexa.client.alexaservice.dialog.core.MultiTurnDialogAuthority;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import java.util.Objects;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class DeferredDialogManager {
    private static final String TAG = "DeferredDialogMgr";
    private boolean deferralActive;

    @Nullable
    private DialogIdentifier deferredDialogIdentifier;
    private final MultiTurnDialogAuthority dialogAuthority;

    @Inject
    public DeferredDialogManager(@NonNull MultiTurnDialogAuthority multiTurnDialogAuthority) {
        this.dialogAuthority = multiTurnDialogAuthority;
    }

    public synchronized void clearDeferralActive() {
        this.deferralActive = false;
        this.deferredDialogIdentifier = null;
        this.dialogAuthority.setDeferralGuardActive(false);
    }

    public synchronized void finishDeferredDialog() {
        try {
            DialogIdentifier dialogIdentifier = this.deferredDialogIdentifier;
            if (dialogIdentifier != null) {
                Objects.toString(dialogIdentifier);
                this.dialogAuthority.finishDialogByDrid(this.deferredDialogIdentifier);
                this.deferredDialogIdentifier = null;
            }
            this.deferralActive = false;
            this.dialogAuthority.setDeferralGuardActive(false);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void finishSpeculativeDialog(@Nullable DialogRequestIdentifier dialogRequestIdentifier) {
        this.dialogAuthority.finishDialogByDrid(dialogRequestIdentifier);
    }

    public synchronized boolean isDeferralActive() {
        return this.deferralActive;
    }

    public synchronized void markDeferralActive() {
        this.deferralActive = true;
        this.deferredDialogIdentifier = this.dialogAuthority.getCurrentDialogIdentifier();
        this.dialogAuthority.setDeferralGuardActive(true);
    }

    public synchronized void restoreDeferredDialog() {
        try {
            DialogIdentifier dialogIdentifier = this.deferredDialogIdentifier;
            if (dialogIdentifier != null) {
                Objects.toString(dialogIdentifier);
                this.dialogAuthority.restoreDialogIdentifier(this.deferredDialogIdentifier);
                this.deferredDialogIdentifier = null;
            }
            this.deferralActive = false;
            this.dialogAuthority.setDeferralGuardActive(false);
        } catch (Throwable th) {
            throw th;
        }
    }
}
