package com.amazon.alexa.assistant.capability.text;

import com.amazon.clouddrive.extended.model.BulkOperationType;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import org.aspectj.lang.JoinPoint;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\bH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\bH\u0016J\b\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/amazon/alexa/assistant/capability/text/DefaultInputTextRegistry;", "Lcom/amazon/alexa/assistant/capability/text/InputTextRegistry;", "<init>", "()V", JoinPoint.SYNCHRONIZATION_LOCK, "", "inputTextMap", "", "", "Lcom/amazon/alexa/assistant/capability/text/InputText;", BulkOperationType.add, "", "inputText", "dialogRequestId", "forDialogRequestId", "removeAllEntries", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DefaultInputTextRegistry implements InputTextRegistry {

    @NotNull
    private final Object lock = new Object();

    @NotNull
    private Map<String, InputText> inputTextMap = new LinkedHashMap();

    @Override // com.amazon.alexa.assistant.capability.text.InputTextRegistry
    public void add(@NotNull InputText inputText, @NotNull String dialogRequestId) {
        inputText.getClass();
        dialogRequestId.getClass();
        synchronized (this.lock) {
            this.inputTextMap.put(dialogRequestId, inputText);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.amazon.alexa.assistant.capability.text.InputTextRegistry
    @Nullable
    public InputText inputText(@NotNull String forDialogRequestId) {
        InputText inputText;
        forDialogRequestId.getClass();
        synchronized (this.lock) {
            inputText = this.inputTextMap.get(forDialogRequestId);
        }
        return inputText;
    }

    @Override // com.amazon.alexa.assistant.capability.text.InputTextRegistry
    public void removeAllEntries() {
        synchronized (this.lock) {
            this.inputTextMap.clear();
            Unit unit = Unit.INSTANCE;
        }
    }
}
