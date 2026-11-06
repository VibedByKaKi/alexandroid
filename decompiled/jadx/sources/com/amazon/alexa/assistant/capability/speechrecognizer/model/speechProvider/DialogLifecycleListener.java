package com.amazon.alexa.assistant.capability.speechrecognizer.model.speechProvider;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/DialogLifecycleListener;", "", "onDialogStarted", "", "dialogId", "", "onDialogFinished", "onDialogTurnStarted", "dialogRequestId", "onDialogTurnFinished", "onDialogRequestDenied", "reason", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/model/speechProvider/DialogDenialReason;", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface DialogLifecycleListener {

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onDialogFinished(@NotNull DialogLifecycleListener dialogLifecycleListener, @NotNull String str) {
            str.getClass();
        }

        public static void onDialogRequestDenied(@NotNull DialogLifecycleListener dialogLifecycleListener, @NotNull DialogDenialReason dialogDenialReason) {
            dialogDenialReason.getClass();
        }

        public static void onDialogStarted(@NotNull DialogLifecycleListener dialogLifecycleListener, @NotNull String str) {
            str.getClass();
        }

        public static void onDialogTurnFinished(@NotNull DialogLifecycleListener dialogLifecycleListener, @NotNull String str) {
            str.getClass();
        }

        public static void onDialogTurnStarted(@NotNull DialogLifecycleListener dialogLifecycleListener, @NotNull String str) {
            str.getClass();
        }
    }

    void onDialogFinished(@NotNull String dialogId);

    void onDialogRequestDenied(@NotNull DialogDenialReason reason);

    void onDialogStarted(@NotNull String dialogId);

    void onDialogTurnFinished(@NotNull String dialogRequestId);

    void onDialogTurnStarted(@NotNull String dialogRequestId);
}
