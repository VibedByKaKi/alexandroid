package com.amazon.alexa.client.alexaservice.base.componentstate;

import com.amazon.alexa.client.core.messages.Namespace;
import com.google.auto.value.AutoValue;
import java.util.Date;
import javax.annotation.Nullable;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ExternalComponentStateCachingPreference {
    public static ExternalComponentStateCachingPreference create(Namespace namespace, boolean z, @Nullable Date date) {
        return new AutoValue_ExternalComponentStateCachingPreference(namespace, z, date);
    }

    @Nullable
    public abstract Date getDateUpdated();

    public abstract Namespace getNamespace();

    public abstract boolean isCachingEnabled();

    public static ExternalComponentStateCachingPreference create(Namespace namespace, boolean z) {
        return create(namespace, z, null);
    }
}
