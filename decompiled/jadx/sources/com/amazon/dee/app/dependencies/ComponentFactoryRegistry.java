package com.amazon.dee.app.dependencies;

import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes3.dex */
public final class ComponentFactoryRegistry {
    private static AccessoriesComponentFactory accessoriesComponentFactory;
    private static ApplicationComponentFactory applicationComponentFactory;

    private ComponentFactoryRegistry() {
    }

    public static AccessoriesComponentFactory getAccessoriesComponentFactory() {
        AccessoriesComponentFactory accessoriesComponentFactory2 = accessoriesComponentFactory;
        if (accessoriesComponentFactory2 != null) {
            return accessoriesComponentFactory2;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("AccessoriesComponentFactory not registered. App module must call ComponentFactoryRegistry.setAccessoriesComponentFactory() before the component is created.");
        return null;
    }

    public static ApplicationComponentFactory getApplicationComponentFactory() {
        ApplicationComponentFactory applicationComponentFactory2 = applicationComponentFactory;
        if (applicationComponentFactory2 != null) {
            return applicationComponentFactory2;
        }
        Single$$ExternalSyntheticBUOutline0.m$2("ApplicationComponentFactory not registered. App module must call ComponentFactoryRegistry.setApplicationComponentFactory() before the component is created.");
        return null;
    }

    public static void setAccessoriesComponentFactory(AccessoriesComponentFactory accessoriesComponentFactory2) {
        accessoriesComponentFactory = accessoriesComponentFactory2;
    }

    public static void setApplicationComponentFactory(ApplicationComponentFactory applicationComponentFactory2) {
        applicationComponentFactory = applicationComponentFactory2;
    }
}
