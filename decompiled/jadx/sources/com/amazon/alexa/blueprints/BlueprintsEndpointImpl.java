package com.amazon.alexa.blueprints;

import android.content.Context;
import com.amazon.alexa.blueprints.api.BlueprintsEndpoint;
import com.amazon.alexa.protocols.environment.EnvironmentService;
import com.amazon.alexa.protocols.service.api.ComponentGetter;
import javax.inject.Provider;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class BlueprintsEndpointImpl implements BlueprintsEndpoint {
    private Provider<EnvironmentService> environmentService;

    public BlueprintsEndpointImpl(ComponentGetter componentGetter, Context context) {
        this.environmentService = componentGetter.get(EnvironmentService.class);
    }

    @Override // com.amazon.alexa.blueprints.api.BlueprintsEndpoint
    public String getBlueprintsHomePageURL() {
        return BlueprintsEndpointConfiguration.getEndpointbyStageandMarketplace(this.environmentService.get().getBuildStage(), this.environmentService.get().getMarketplace());
    }

    @Override // com.amazon.alexa.blueprints.api.BlueprintsEndpoint
    public String getURLRegexKey() {
        return BlueprintsEndpointConstants.BLUEPRINTS_REGEX;
    }
}
