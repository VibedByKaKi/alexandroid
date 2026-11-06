package com.amazon.dee.app.services.export;

import android.content.Context;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import java.util.Map;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public interface ComponentBinder {
    Map<Class<?>, ComponentRegistry.ConcreteComponentFactory<?>> publishTransitionalObjectsOwnedByDagger();

    Map<Class, String> registerComponents(Context context);
}
