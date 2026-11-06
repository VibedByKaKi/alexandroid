package com.amazon.alexa.growthcore.uicomponent;

import android.content.Context;
import androidx.annotation.NonNull;
import com.amazon.alexa.growthcore.api.uicomponentfactory.GrowthCoreUIComponentFactory;
import com.amazon.alexa.growthcore.dependency.GrowthCoreComponent;
import com.amazon.alexa.growthcore.dependency.GrowthCoreComponentInitializer;
import com.amazon.alexa.protocols.service.api.ComponentGetter;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class GrowthCoreUIComponentFactoryImpl implements GrowthCoreUIComponentFactory {
    private final GrowthCoreComponent growthCoreComponent;

    public GrowthCoreUIComponentFactoryImpl(@NonNull ComponentGetter componentGetter, @NonNull Context context) {
        this.growthCoreComponent = GrowthCoreComponentInitializer.getInstance().getGrowthCoreComponent(componentGetter, context);
    }
}
