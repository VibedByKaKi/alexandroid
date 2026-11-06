package com.amazon.alexa.client.core.messages;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class MessageMetadata {
    public static final MessageMetadata EMPTY = create("", DialogRequestIdentifier.NONE);

    public static MessageMetadata create(@Nullable String str, @Nullable DialogRequestIdentifier dialogRequestIdentifier) {
        if (str == null) {
            str = "";
        }
        if (dialogRequestIdentifier == null) {
            dialogRequestIdentifier = DialogRequestIdentifier.NONE;
        }
        return new AutoValue_MessageMetadata(str, dialogRequestIdentifier);
    }

    public abstract DialogRequestIdentifier getOriginatingDialogRequestIdentifier();

    public abstract String getUnparsedMessage();

    public static MessageMetadata create(@Nullable DialogRequestIdentifier dialogRequestIdentifier) {
        return create("", dialogRequestIdentifier);
    }
}
