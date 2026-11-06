package com.amazon.alexa.assistant.capability.speechrecognizer;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Lcom/amazon/alexa/assistant/capability/speechrecognizer/WakeWordDialogGate;", "Lcom/amazon/alexa/assistant/capability/speechrecognizer/WakeWordDialogGating;", "<init>", "()V", "allowed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isWakeWordDialogAllowed", "", "()Z", "update", "", "value", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class WakeWordDialogGate implements WakeWordDialogGating {

    @NotNull
    private final AtomicBoolean allowed = new AtomicBoolean(true);

    @Override // com.amazon.alexa.assistant.capability.speechrecognizer.WakeWordDialogGating
    public boolean isWakeWordDialogAllowed() {
        return this.allowed.get();
    }

    public final void update(boolean value) {
        this.allowed.set(value);
    }
}
