package com.amazon.alexa.mosaic.factories;

import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class DefaultComponentFactory implements ComponentFactory {
    private final ComponentRegistry componentRegistry = ComponentRegistry.getInstance();

    @Override // com.amazon.alexa.mosaic.factories.ComponentFactory
    public FeatureServiceV2 createFeatureService() {
        return (FeatureServiceV2) this.componentRegistry.get(FeatureServiceV2.class).get();
    }
}
