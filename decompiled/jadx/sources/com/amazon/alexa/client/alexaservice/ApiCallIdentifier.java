package com.amazon.alexa.client.alexaservice;

import androidx.annotation.Nullable;
import com.google.auto.value.AutoValue;
import java.util.UUID;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ApiCallIdentifier {
    private static final String ID_PREFIX = "api-";
    public static final ApiCallIdentifier NONE = create("");

    public static ApiCallIdentifier create(@Nullable String str) {
        if (str == null) {
            str = generateId();
        }
        return new AutoValue_ApiCallIdentifier(str);
    }

    public static ApiCallIdentifier createRandom() {
        return create(null);
    }

    private static String generateId() {
        return ID_PREFIX + UUID.randomUUID().toString();
    }

    public abstract String getValue();
}
