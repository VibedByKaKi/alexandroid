package com.amazon.alexa.client.core.componentstate;

import com.amazon.alexa.client.core.messages.Name;
import com.amazon.alexa.client.core.messages.Namespace;
import com.amazon.alexa.utils.validation.Preconditions;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class BaseComponentStateProvider implements ComponentStateProvider {
    private final ComponentStateHeader componentStateHeader;

    public BaseComponentStateProvider(Namespace namespace, Name name) {
        this.componentStateHeader = createComponentStateHeader(namespace, name);
    }

    private static ComponentStateHeader createComponentStateHeader(Namespace namespace, Name name) {
        Preconditions.notNull(namespace, "namespace is null");
        Preconditions.notNull(name, "name is null");
        return ComponentStateHeader.create(namespace, name);
    }

    @Override // com.amazon.alexa.client.core.componentstate.ComponentStateProvider
    public ComponentStateHeader getComponentStateHeader() {
        return this.componentStateHeader;
    }
}
