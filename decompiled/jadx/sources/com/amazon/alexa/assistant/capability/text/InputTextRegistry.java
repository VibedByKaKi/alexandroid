package com.amazon.alexa.assistant.capability.text;

import com.amazon.clouddrive.extended.model.BulkOperationType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0003H&¨\u0006\n"}, d2 = {"Lcom/amazon/alexa/assistant/capability/text/InputTextRegistry;", "", BulkOperationType.add, "", "inputText", "Lcom/amazon/alexa/assistant/capability/text/InputText;", "dialogRequestId", "", "forDialogRequestId", "removeAllEntries", "voice_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface InputTextRegistry {
    void add(@NotNull InputText inputText, @NotNull String dialogRequestId);

    @Nullable
    InputText inputText(@NotNull String forDialogRequestId);

    void removeAllEntries();
}
