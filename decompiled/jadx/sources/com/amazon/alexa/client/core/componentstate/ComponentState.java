package com.amazon.alexa.client.core.componentstate;

import androidx.annotation.Nullable;
import androidx.core.os.ParcelCompat$$ExternalSyntheticOutline0;
import com.amazon.alexa.api.AlexaContext;
import com.amazon.alexa.client.core.messages.Name;
import com.amazon.alexa.client.core.messages.Namespace;
import com.amazon.alexa.client.core.messages.RawStringPayload;
import com.google.auto.value.AutoValue;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@AutoValue
/* loaded from: classes17.dex */
public abstract class ComponentState {
    @Nullable
    public static ComponentState create(@Nullable AlexaContext alexaContext) {
        if (alexaContext == null || alexaContext.getAlexaHeader() == null || alexaContext.getAlexaPayload() == null) {
            return null;
        }
        return create(ComponentStateHeader.create(Namespace.create(alexaContext.getAlexaHeader().getNamespace()), Name.create(alexaContext.getAlexaHeader().getName())), RawStringPayload.create(alexaContext.getAlexaPayload().getPayload()));
    }

    public static Set<ComponentState> createMultiple(Set<AlexaContext> set) {
        HashSet hashSet = new HashSet();
        Iterator<AlexaContext> it2 = set.iterator();
        while (it2.hasNext()) {
            ComponentState create = create(it2.next());
            if (create != null) {
                hashSet.add(create);
            }
        }
        return hashSet;
    }

    public abstract ComponentStateHeader getHeader();

    public abstract ComponentStatePayload getPayload();

    public String toString() {
        return ParcelCompat$$ExternalSyntheticOutline0.m(getClass().getSimpleName(), ": ", getHeader().getNamespace().getValue(), ".", getHeader().getName().getValue());
    }

    public static ComponentState create(ExternalComponentStateEntity externalComponentStateEntity) {
        return new AutoValue_ComponentState(ComponentStateHeader.create(externalComponentStateEntity.getNamespace(), externalComponentStateEntity.getName()), RawStringPayload.create(externalComponentStateEntity.getPayload()));
    }

    public static ComponentState create(ComponentStateHeader componentStateHeader, ComponentStatePayload componentStatePayload) {
        return new AutoValue_ComponentState(componentStateHeader, componentStatePayload);
    }
}
