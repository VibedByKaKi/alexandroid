package com.amazon.alexa.protocols.service.api;

import androidx.annotation.NonNull;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public final class DefaultComponentGetter implements ComponentGetter {
    private final DefaultComponentRegistry componentRegistry;

    public DefaultComponentGetter(DefaultComponentRegistry defaultComponentRegistry) {
        this.componentRegistry = defaultComponentRegistry;
    }

    @Override // com.amazon.alexa.protocols.service.api.ComponentGetter
    @NonNull
    public <T> LazyComponent<T> get(@NonNull Class<T> cls) {
        return this.componentRegistry.getLazy(cls);
    }
}
