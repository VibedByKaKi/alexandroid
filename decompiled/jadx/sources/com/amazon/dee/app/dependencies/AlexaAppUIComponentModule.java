package com.amazon.dee.app.dependencies;

import android.content.Context;
import com.amazon.alexa.eventbus.api.EventBus;
import com.amazon.alexa.protocols.ui.appcomponent.AlexaAppUIComponent;
import com.amazon.dee.app.services.security.CertificateReaderService;
import com.amazon.dee.app.ui.main.appcomponent.AlexaAppUIComponentImpl;
import com.amazon.dee.app.ui.main.appcomponent.BuildTagProvider;
import com.amazon.dee.app.ui.main.appcomponent.GlobalHeaderEventPublisher;
import com.amazon.dee.app.ui.main.appcomponent.GlobalHeaderState;
import dagger.Lazy;
import dagger.Module;
import dagger.Provides;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Module
/* loaded from: classes3.dex */
public class AlexaAppUIComponentModule {
    @Provides
    @ApplicationScope
    public AlexaAppUIComponent providesAlexaAppUIComponent(BuildTagProvider buildTagProvider, Context context, GlobalHeaderEventPublisher globalHeaderEventPublisher, GlobalHeaderState globalHeaderState) {
        return new AlexaAppUIComponentImpl(buildTagProvider, context, globalHeaderEventPublisher, globalHeaderState);
    }

    @Provides
    @ApplicationScope
    public BuildTagProvider providesBuildTagProvider(Lazy<CertificateReaderService> lazy) {
        return new BuildTagProvider(lazy);
    }

    @Provides
    @ApplicationScope
    public GlobalHeaderEventPublisher providesGlobalHeaderEventPublisher(Lazy<EventBus> lazy) {
        return new GlobalHeaderEventPublisher(lazy);
    }

    @Provides
    @ApplicationScope
    public GlobalHeaderState providesGlobalHeaderState() {
        return new GlobalHeaderState();
    }
}
