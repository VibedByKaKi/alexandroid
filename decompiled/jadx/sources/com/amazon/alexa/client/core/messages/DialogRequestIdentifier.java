package com.amazon.alexa.client.core.messages;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;
import com.google.gson.TypeAdapter;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class DialogRequestIdentifier implements StronglyTypedString {

    @VisibleForTesting
    static final String ID_PREFIX = "dr-";
    public static final DialogRequestIdentifier NONE = create("");

    @VisibleForTesting
    static final String TEXT_ID_PREFIX = "Mobile_TTA_";

    public static DialogRequestIdentifier create(String str) {
        return new AutoValue_DialogRequestIdentifier(str);
    }

    public static DialogRequestIdentifier createRandom() {
        return create(ID_PREFIX + UUID.randomUUID().toString());
    }

    public static DialogRequestIdentifier createRandomForText() {
        return create("Mobile_TTA_" + UUID.randomUUID().toString());
    }

    public static TypeAdapter<DialogRequestIdentifier> getTypeAdapter() {
        return new StronglyTypedString.StronglyTypedStringAdapter<DialogRequestIdentifier>() { // from class: com.amazon.alexa.client.core.messages.DialogRequestIdentifier.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.amazon.alexa.client.core.networking.adapters.StronglyTypedString.StronglyTypedStringAdapter
            public DialogRequestIdentifier instantiate(@NonNull String str) {
                return DialogRequestIdentifier.create(str);
            }
        };
    }
}
