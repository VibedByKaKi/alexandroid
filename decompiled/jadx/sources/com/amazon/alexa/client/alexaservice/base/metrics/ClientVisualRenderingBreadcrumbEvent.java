package com.amazon.alexa.client.alexaservice.base.metrics;

import androidx.annotation.NonNull;
import com.amazon.alexa.client.alexaservice.eventing.Event;
import com.amazon.alexa.client.core.messages.DialogRequestIdentifier;
import com.google.auto.value.AutoValue;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ClientVisualRenderingBreadcrumbEvent extends Event.NotGated {
    public static ClientVisualRenderingBreadcrumbEvent create(@NonNull String str, @NonNull DialogRequestIdentifier dialogRequestIdentifier, @NonNull Map<String, String> map) {
        return new AutoValue_ClientVisualRenderingBreadcrumbEvent(str, dialogRequestIdentifier, Collections.unmodifiableMap(map));
    }

    @NonNull
    public abstract String getBreadcrumbName();

    @NonNull
    public abstract DialogRequestIdentifier getDialogRequestIdentifier();

    @NonNull
    public abstract Map<String, String> getMetadata();

    public static ClientVisualRenderingBreadcrumbEvent create(@NonNull String str, @NonNull DialogRequestIdentifier dialogRequestIdentifier) {
        return create(str, dialogRequestIdentifier, Collections.EMPTY_MAP);
    }

    public static ClientVisualRenderingBreadcrumbEvent create(@NonNull String str) {
        return create(str, DialogRequestIdentifier.NONE, Collections.EMPTY_MAP);
    }
}
