package com.amazon.alexa.hho.navigation.thirdpartydeeplinking;

import android.util.Log;
import com.amazon.alexa.hho.metrics.HHOMetricsConstants;
import com.amazon.alexa.hho.metrics.HHOMetricsService;
import com.amazon.alexa.hho.navigation.payload.SetDestinationPayload;
import com.amazon.alexa.hho.navigation.thirdpartydeeplinking.deeplink.External3PMapDeeplinkHelper;
import dagger.Subcomponent;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes13.dex */
public class ThirdPartyDeeplinkingDirectiveHandler {
    private static final String TAG = "ThirdPartyDeeplinkingDirectiveHandler";
    private final External3PMapDeeplinkHelper deeplinkHelper;
    private final HHOMetricsService metrics;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Subcomponent
    public interface Factory {

        /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
        @Subcomponent.Factory
        public interface Creator {
            Factory create();
        }

        ThirdPartyDeeplinkingDirectiveHandler create();
    }

    @Inject
    public ThirdPartyDeeplinkingDirectiveHandler(HHOMetricsService hHOMetricsService, External3PMapDeeplinkHelper external3PMapDeeplinkHelper) {
        this.metrics = hHOMetricsService;
        this.deeplinkHelper = external3PMapDeeplinkHelper;
    }

    public boolean handleCancelNavigation() {
        try {
            this.metrics.recordOccurrence(HHOMetricsConstants.Event.CANCEL_NAVIGATION, true, HHOMetricsConstants.Component.NAVIGATION_CAPABILITY_AGENT_CLASSIC_3P_DEEPLINK);
            this.deeplinkHelper.cancelExternal3PMapSession();
            return true;
        } catch (Exception e) {
            Log.e(TAG, "Error handling CancelNavigation", e);
            this.metrics.recordErrorWithException(HHOMetricsConstants.Error.CANCEL_NAVIGATION_ERROR, e, HHOMetricsConstants.Component.NAVIGATION_CAPABILITY_AGENT_CLASSIC_3P_DEEPLINK);
            return false;
        }
    }

    public boolean handleSetDestination(SetDestinationPayload setDestinationPayload) {
        try {
            this.metrics.recordOccurrence(HHOMetricsConstants.Event.SET_DESTINATION, true, HHOMetricsConstants.Component.NAVIGATION_CAPABILITY_AGENT_CLASSIC_3P_DEEPLINK);
            this.deeplinkHelper.startExternal3PMapSession(setDestinationPayload.getDestination().getCoordinate().getLatitudeInDegrees(), setDestinationPayload.getDestination().getCoordinate().getLongitudeInDegrees(), setDestinationPayload.getTransportationMode());
            return true;
        } catch (Exception e) {
            Log.e(TAG, "Error handling SetDestination", e);
            this.metrics.recordErrorWithException(HHOMetricsConstants.Error.SET_DESTINATION_ERROR, e, HHOMetricsConstants.Component.NAVIGATION_CAPABILITY_AGENT_CLASSIC_3P_DEEPLINK);
            return false;
        }
    }
}
