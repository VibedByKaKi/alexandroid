package com.amazon.alexa.client.alexaservice.ui.display.window;

import com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants;
import com.amazon.alexa.client.alexaservice.ui.display.window.payload.DisplayWindowStatePayload;
import com.amazon.alexa.client.alexaservice.ui.drivemode.DriveModeAuthority;
import com.amazon.alexa.client.core.componentstate.BaseComponentStateProvider;
import com.amazon.alexa.client.core.componentstate.ComponentState;
import java.util.HashSet;
import javax.inject.Inject;
import javax.inject.Singleton;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Singleton
/* loaded from: classes17.dex */
public class AlexaDisplayWindowComponentStateProvider extends BaseComponentStateProvider {
    private final DriveModeAuthority driveModeAuthority;

    @Inject
    public AlexaDisplayWindowComponentStateProvider(DriveModeAuthority driveModeAuthority) {
        super(AvsApiConstants.Alexa.Display.Window.NAMESPACE, AvsApiConstants.Alexa.Display.Window.ComponentStates.WindowState.NAME);
        this.driveModeAuthority = driveModeAuthority;
    }

    @Override // com.amazon.alexa.client.core.componentstate.ComponentStateProvider
    public ComponentState getState() {
        Window create = Window.create(DisplayWindowConstants.APP_WINDOW, DisplayWindowConstants.APP_WINDOW_TEMPLATE, WindowConfiguration.create(this.driveModeAuthority.isEnabled() ? DisplayWindowConstants.AUTO_MODE : "mobile_mode", "fullscreen"));
        HashSet hashSet = new HashSet();
        hashSet.add(create);
        return ComponentState.create(getComponentStateHeader(), DisplayWindowStatePayload.create(DisplayWindowConstants.APP_WINDOW, hashSet));
    }
}
