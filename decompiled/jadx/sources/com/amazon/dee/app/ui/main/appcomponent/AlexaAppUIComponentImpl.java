package com.amazon.dee.app.ui.main.appcomponent;

import android.content.Context;
import com.amazon.alexa.protocols.ui.appcomponent.AlexaAppUIComponent;
import com.amazon.alexa.protocols.ui.appcomponent.GlobalHeader;
import com.amazon.dee.app.ui.main.appcomponent.DefaultGlobalHeader;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public class AlexaAppUIComponentImpl implements AlexaAppUIComponent {
    private final BuildTagProvider buildTagProvider;
    private final Context context;
    private final GlobalHeaderEventPublisher globalHeaderEventPublisher;
    private final GlobalHeaderState globalHeaderState;

    public AlexaAppUIComponentImpl(BuildTagProvider buildTagProvider, Context context, GlobalHeaderEventPublisher globalHeaderEventPublisher, GlobalHeaderState globalHeaderState) {
        this.buildTagProvider = buildTagProvider;
        this.context = context;
        this.globalHeaderEventPublisher = globalHeaderEventPublisher;
        this.globalHeaderState = globalHeaderState;
    }

    @Override // com.amazon.alexa.protocols.ui.appcomponent.AlexaAppUIComponent
    public GlobalHeader.Builder getGlobalHeaderBuilder() {
        Context mainActivity = MainActivityProvider.getMainActivity();
        DefaultGlobalHeader.Builder builder = new DefaultGlobalHeader.Builder();
        if (mainActivity == null) {
            mainActivity = this.context;
        }
        return builder.withContext(mainActivity).withEventPublisher(this.globalHeaderEventPublisher).withGlobalHeaderState(this.globalHeaderState).withBuildType(this.buildTagProvider.getBuildType());
    }
}
