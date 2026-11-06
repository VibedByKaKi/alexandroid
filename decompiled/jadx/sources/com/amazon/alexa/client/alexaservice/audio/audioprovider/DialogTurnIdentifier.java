package com.amazon.alexa.client.alexaservice.audio.audioprovider;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.core.networking.adapters.StronglyTypedString;
import com.google.auto.value.AutoValue;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class DialogTurnIdentifier implements StronglyTypedString {
    private static final String ID_PREFIX = "dtid-";
    public static final DialogTurnIdentifier NONE = create("none", false);
    private static final String TEXT_ID_PREFIX = "Mobile_TTA_";

    public static DialogTurnIdentifier create(@Nullable String str, boolean z) {
        return str == null ? NONE : new AutoValue_DialogTurnIdentifier(str, z);
    }

    public static DialogTurnIdentifier createRandom() {
        return create(ID_PREFIX + UUID.randomUUID().toString(), false);
    }

    public static DialogTurnIdentifier createRandomForText() {
        return create("Mobile_TTA_" + UUID.randomUUID().toString(), true);
    }

    public abstract boolean isTextDialog();
}
