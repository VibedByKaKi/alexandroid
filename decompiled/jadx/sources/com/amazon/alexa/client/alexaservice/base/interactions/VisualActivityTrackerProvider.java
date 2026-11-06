package com.amazon.alexa.client.alexaservice.base.interactions;

import androidx.annotation.Nullable;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.ChannelState;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.VisualChannelType;
import com.amazon.alexa.client.alexaservice.base.interactions.channels.VisualChannels;
import com.amazon.alexa.client.alexaservice.base.messages.AvsApiConstants;
import com.amazon.alexa.client.core.componentstate.BaseComponentStateProvider;
import com.amazon.alexa.client.core.componentstate.ComponentState;
import com.amazon.alexa.client.core.componentstate.ComponentStatePayload;
import java.util.Map;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class VisualActivityTrackerProvider extends BaseComponentStateProvider {
    private static final String TAG = "VisualActivityTrackerProvider";
    private final VisualChannels channels;

    @Inject
    public VisualActivityTrackerProvider(VisualChannels visualChannels) {
        super(AvsApiConstants.VisualActivityTracker.NAMESPACE, AvsApiConstants.VisualActivityTracker.ComponentStates.ActivityState.NAME);
        this.channels = visualChannels;
    }

    @Nullable
    private ComponentStatePayload buildPayload() {
        Map<VisualChannelType, ChannelState> stateReport = this.channels.getStateReport();
        VisualChannelType visualChannelType = VisualChannelType.DIALOG_UI;
        ChannelState channelState = stateReport.get(visualChannelType);
        if (channelState == null || !channelState.getIsActive()) {
            return null;
        }
        return VisualActivityTrackerPayload.builder().setFocused(convertChannelState(stateReport.get(visualChannelType))).build();
    }

    private VisualActivityTrackerChannelState convertChannelState(ChannelState channelState) {
        return VisualActivityTrackerChannelState.create(channelState.getLatestInterfaceName());
    }

    @Override // com.amazon.alexa.client.core.componentstate.ComponentStateProvider
    public ComponentState getState() {
        ComponentStatePayload buildPayload = buildPayload();
        if (buildPayload != null) {
            return ComponentState.create(getComponentStateHeader(), buildPayload);
        }
        return null;
    }
}
