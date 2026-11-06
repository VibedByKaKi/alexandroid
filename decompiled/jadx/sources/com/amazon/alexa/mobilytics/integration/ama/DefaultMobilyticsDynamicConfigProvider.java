package com.amazon.alexa.mobilytics.integration.ama;

import androidx.annotation.NonNull;
import com.amazon.alexa.configservice.api.ConfigService;
import com.amazon.alexa.configservice.api.Domain;
import com.amazon.alexa.mobilytics.MobilyticsDynamicConfigProvider;
import com.amazon.alexa.protocols.service.api.ComponentRegistry;
import com.amazon.alexa.protocols.service.api.LazyComponent;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class DefaultMobilyticsDynamicConfigProvider implements MobilyticsDynamicConfigProvider {
    private LazyComponent<ConfigService> configServiceLazy;

    public DefaultMobilyticsDynamicConfigProvider() {
        ComponentRegistry componentRegistry = ComponentRegistry.getInstance();
        if (componentRegistry != null) {
            this.configServiceLazy = componentRegistry.getLazy(ConfigService.class);
        }
    }

    @Override // com.amazon.alexa.mobilytics.MobilyticsDynamicConfigProvider
    @NonNull
    public <T> T dynamicConfig(@NonNull String str, @NonNull T t) {
        ConfigService configService;
        LazyComponent<ConfigService> lazyComponent = this.configServiceLazy;
        return (lazyComponent == null || (configService = lazyComponent.get()) == null) ? t : (T) configService.getConfig(Domain.MOBILYTICS, str, t);
    }
}
