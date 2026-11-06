package com.amazon.alexa.dialog.impl;

import com.amazon.alexa.dialog.impl.Dialog;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/amazon/alexa/dialog/impl/DialogBuilderProvider;", "Lcom/amazon/alexa/dialog/api/DialogBuilderProvider;", "<init>", "()V", "createBuilder", "Lcom/amazon/alexa/dialog/impl/Dialog$Builder;", "AlexaMobileAndroidDialog_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class DialogBuilderProvider implements com.amazon.alexa.dialog.api.DialogBuilderProvider {
    @Override // com.amazon.alexa.dialog.api.DialogBuilderProvider
    @NotNull
    public Dialog.Builder createBuilder() {
        return new Dialog.Builder();
    }
}
