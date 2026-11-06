package com.amazon.alexa.client.alexaservice.dialog.core;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class RequestIdentifier {
    public static RequestIdentifier create(DialogRequestIdentifier dialogRequestIdentifier) {
        return new AutoValue_RequestIdentifier(dialogRequestIdentifier.getValue(), dialogRequestIdentifier);
    }

    public static RequestIdentifier createRandom() {
        return new AutoValue_RequestIdentifier(UUID.randomUUID().toString(), null);
    }

    @Nullable
    public abstract DialogRequestIdentifier getDialogRequestIdentifier();

    public abstract String getValue();

    public boolean hasAssociatedDialogRequestId() {
        return getDialogRequestIdentifier() != null;
    }

    public static RequestIdentifier create(String str) {
        return new AutoValue_RequestIdentifier(str, null);
    }
}
