package com.amazon.alexa.growthcore.dependency;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.protocols.service.api.ComponentGetter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class GrowthCoreComponentInitializer {
    private static GrowthCoreComponentInitializer instance;
    private GrowthCoreComponent growthCoreComponent;

    private GrowthCoreComponentInitializer() {
    }

    public static GrowthCoreComponentInitializer getInstance() {
        if (instance == null) {
            synchronized (GrowthCoreComponentInitializer.class) {
                try {
                    if (instance == null) {
                        instance = new GrowthCoreComponentInitializer();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public GrowthCoreComponent getGrowthCoreComponent(@NonNull ComponentGetter componentGetter, @NonNull Context context) {
        if (this.growthCoreComponent == null) {
            this.growthCoreComponent = DaggerGrowthCoreComponent.builder().internalModule(new InternalModule(context)).externalModule(new ExternalModule(componentGetter)).build();
        }
        return this.growthCoreComponent;
    }
}
