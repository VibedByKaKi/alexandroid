package com.amazon.alexa.biloba.view.emergencyHelpline;

import android.content.Context;
import androidx.annotation.VisibleForTesting;
import com.amazon.alexa.biloba.R;
import com.amazon.alexa.biloba.metrics.MetricsConstants;
import com.amazon.alexa.biloba.model.FallAlert;
import com.amazon.alexa.biloba.model.Geolocation;
import com.amazon.alexa.biloba.routing.DeferredRoutingHelper;
import com.amazon.alexa.biloba.routing.Routes;
import com.amazon.alexa.biloba.utils.AndroidUtils;
import com.amazon.alexa.biloba.utils.BilobaRouteUtil;
import com.amazon.alexa.biloba.utils.LogUtils;
import com.amazon.alexa.biloba.view.infoModal.InfoModalView;
import com.amazon.alexa.biloba.view.infoModal.InfoModalViewModel;
import com.amazon.alexa.featureservice.api.FeatureServiceV2;
import com.amazon.alexa.routing.api.RouteContext;
import com.amazon.alexa.viewmanagement.api.ViewController;
import com.google.common.collect.ImmutableSet;
import dagger.Lazy;
import java.util.Set;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class EmergencyHelplineRoutingHelper {
    public static final String EMERGENCY_HELPLINE_CRNAME_PARAMETER_KEY = "cr_name";
    public static final String EMERGENCY_HELPLINE_DEVICE_NAME_PARAMETER_KEY = "device_name";
    public static final String EMERGENCY_HELPLINE_OTG_FALL_LATITUDE_PARAMETER_KEY = "otg_fall_latitude";
    public static final String EMERGENCY_HELPLINE_OTG_FALL_LONGITUDE_PARAMETER_KEY = "otg_fall_longitude";
    public static final String EMERGENCY_HELPLINE_OTG_FALL_PARAMETER_KEY = "is_otg_fall";
    private static final Set<String> EMERGENCY_HELPLINE_ROUTES = ImmutableSet.of(Routes.BILOBA_EMERGENCY_HELPLINE_CALL_STARTED, Routes.BILOBA_EMERGENCY_HELPLINE_CALL_ENDED, Routes.BILOBA_EMERGENCY_HELPLINE_VERIFIED_AND_UNVERIFIED_FALL, Routes.BILOBA_EMERGENCY_HELPLINE_VERIFIED_NO_FALL, Routes.BILOBA_EMERGENCY_HELPLINE_CALL_FAILED);
    public static final String EMERGENCY_HELPLINE_TIME_PARAMETER_KEY = "time";
    public static final String TAG = "EmergencyHelplineRoutingHelper";
    private final Lazy<FeatureServiceV2> featureServiceV2;

    @Inject
    public EmergencyHelplineRoutingHelper(Lazy<FeatureServiceV2> lazy) {
        this.featureServiceV2 = lazy;
    }

    private InfoModalView getInfoModalView(Context context, String str, String str2, String str3, String str4, FallAlert fallAlert) {
        str.getClass();
        switch (str) {
            case "biloba/comms/emergency-helpline-call-started":
                LogUtils.d(TAG, "creating EmergencyHelplineCallStartedView");
                return new InfoModalView(context, getCallStartedModel(context, str3, str2, str4, fallAlert));
            case "biloba/comms/fall-detected-verified-and-unverified-fall":
                LogUtils.d(TAG, "creating EmergencyHelplineVerifiedAndUnverifiedFallView");
                return new InfoModalView(context, getVerifiedAndUnverifiedFallModel(context, str3, str2, str4, fallAlert));
            case "biloba/comms/emergency-helpline-call-failed":
                LogUtils.d(TAG, "creating EmergencyHelplineCallFailedView");
                return new InfoModalView(context, getEmergencyHelplineCallFailedModel(context, str3, str2, str4, fallAlert));
            case "biloba/comms/fall-detected-verified-no-fall":
                LogUtils.d(TAG, "creating EmergencyHelplineVerifiedNoFallView");
                return new InfoModalView(context, getVerifiedNoFallModel(context, str3, str2, str4, fallAlert));
            case "biloba/comms/emergency-helpline-call-ended":
                LogUtils.d(TAG, "creating EmergencyHelplineCallEndedView");
                return new InfoModalView(context, getCallEndedModel(context, str3, str2, fallAlert));
            default:
                return null;
        }
    }

    @VisibleForTesting
    public InfoModalViewModel getCallEndedModel(Context context, String str, String str2, FallAlert fallAlert) {
        return new InfoModalViewModel().setCaptionHeadlineText(str2).setHeadlineText(context.getString(R.string.emergency_helpline_call_ended_header)).setTitleText(context.getString(R.string.emergency_helpline_call_ended_title)).setDescription1(context.getString(R.string.emergency_helpline_call_ended_desc_1, str)).setShowCommsSection(true).setCommsSectionTitle(context.getString(R.string.emergency_helpline_call_ended_comms_title, str)).setCommsSectionDescription1(fallAlert.getIsOTGFall() ? null : context.getString(R.string.emergency_helpline_call_ended_comms_desc_1, str)).setIsOnTheGoFall(fallAlert.getIsOTGFall()).setFallLocationMessage(fallAlert.getFallLocationMessage()).setLatitude(fallAlert.getFallLocation().getLatitude()).setLongitude(fallAlert.getFallLocation().getLongitude()).setOkButtonText(context.getString(R.string.emergency_helpline_call_ended_button)).setViewMetricName(fallAlert.getIsOTGFall() ? MetricsConstants.UserInteractionMetrics.EH_CALL_ENDED_CARD_RENDERED_OTG_FALL : MetricsConstants.UserInteractionMetrics.EH_CALL_ENDED_CARD_RENDERED_AT_HOME_FALL).setClickMetricName("LearnEmergencyHelplineCallStarted").setModalRenderedMetric(fallAlert.getIsOTGFall() ? MetricsConstants.UserInteractionMetrics.EH_CALL_ENDED_MODAL_RENDERED_OTG_FALL : MetricsConstants.UserInteractionMetrics.EH_CALL_ENDED_MODAL_RENDERED_AT_HOME_FALL).setCommsMetrics(fallAlert.getIsOTGFall() ? null : MetricsConstants.UserInteractionMetrics.EH_CALL_ENDED_COMMS_DROP_IN_BUTTON, MetricsConstants.UserInteractionMetrics.EH_CALL_ENDED_COMMS_CALL_BUTTON, MetricsConstants.UserInteractionMetrics.EH_CALL_ENDED_COMMS_MESSAGE_BUTTON);
    }

    @VisibleForTesting
    public InfoModalViewModel getCallStartedModel(Context context, String str, String str2, String str3, FallAlert fallAlert) {
        return new InfoModalViewModel().setCaptionHeadlineText(str2).setHeadlineText(context.getString(R.string.emergency_helpline_call_started_header)).setTitleText(context.getString(R.string.emergency_helpline_call_started_title)).setDescription1(fallAlert.getIsOTGFall() ? context.getString(R.string.emergency_helpline_call_started_desc_otg, str, str3) : context.getString(R.string.emergency_helpline_call_started_desc_1, str, str3)).setDescription2(fallAlert.getIsOTGFall() ? null : context.getString(R.string.emergency_helpline_call_started_desc_2)).setDescription3(fallAlert.getIsOTGFall() ? null : context.getString(R.string.emergency_helpline_call_started_desc_3, str)).setIsOnTheGoFall(fallAlert.getIsOTGFall()).setFallLocationMessage(fallAlert.getFallLocationMessage()).setLatitude(fallAlert.getFallLocation().getLatitude()).setLongitude(fallAlert.getFallLocation().getLongitude()).setOkButtonText(context.getString(R.string.emergency_helpline_call_started_button)).setViewMetricName(fallAlert.getIsOTGFall() ? MetricsConstants.UserInteractionMetrics.EH_CALL_STARTED_CARD_RENDERED_OTG_FALL : MetricsConstants.UserInteractionMetrics.EH_CALL_STARTED_CARD_RENDERED_AT_HOME_FALL).setModalRenderedMetric(fallAlert.getIsOTGFall() ? MetricsConstants.UserInteractionMetrics.EH_CALL_STARTED_MODAL_RENDERED_OTG_FALL : MetricsConstants.UserInteractionMetrics.EH_CALL_STARTED_MODAL_RENDERED_AT_HOME_FALL).setClickMetricName("LearnEmergencyHelplineCallStarted");
    }

    @VisibleForTesting
    public InfoModalViewModel getEmergencyHelplineCallFailedModel(Context context, String str, String str2, String str3, FallAlert fallAlert) {
        return new InfoModalViewModel().setCaptionHeadlineText(str2).setHeadlineText(context.getString(R.string.urgent_response_connection_failure_otg_header)).setTitleText(context.getString(R.string.urgent_response_connection_failure_title)).setDescription1(context.getString(R.string.urgent_response_connection_failure_desc_1_otg, str, str3)).setDescription3(context.getString(R.string.urgent_response_connection_failure_desc_3_otg, str)).setIsOnTheGoFall(fallAlert.getIsOTGFall()).setFallLocationMessage(fallAlert.getFallLocationMessage()).setLatitude(fallAlert.getFallLocation().getLatitude()).setLongitude(fallAlert.getFallLocation().getLongitude()).setOkButtonText(context.getString(R.string.urgent_response_connection_failure_button)).setViewMetricName(MetricsConstants.UserInteractionMetrics.EH_CALL_FAILED_CARD_RENDERED_OTG_FALL).setClickMetricName(MetricsConstants.UserInteractionMetrics.EH_CALL_FAILED_ACTION_CLICK_OTG_FALL).setModalRenderedMetric(MetricsConstants.UserInteractionMetrics.EH_CALL_FAILED_MODAL_RENDERED_OTG_FALL);
    }

    public ViewController getEmergencyHelplineViewController(Context context, String str, RouteContext routeContext) {
        RouteContext routeContext2 = (RouteContext) routeContext.getParcelable(DeferredRoutingHelper.DEFERRED_ROUTE_CONTEXT);
        if (routeContext2 != null) {
            routeContext = routeContext2;
        }
        String stringParameterValue = BilobaRouteUtil.getStringParameterValue(routeContext, "time");
        String stringParameterValue2 = BilobaRouteUtil.getStringParameterValue(routeContext, EMERGENCY_HELPLINE_CRNAME_PARAMETER_KEY);
        String stringParameterValue3 = BilobaRouteUtil.getStringParameterValue(routeContext, "device_name");
        if (AndroidUtils.isEmpty(stringParameterValue2)) {
            stringParameterValue2 = context.getString(R.string.your_loved_one);
        }
        String str2 = stringParameterValue2;
        FallAlert fallAlert = getFallAlert(BilobaRouteUtil.getBooleanParameterValue(routeContext, EMERGENCY_HELPLINE_OTG_FALL_PARAMETER_KEY), BilobaRouteUtil.getDoubleParameterValue(routeContext, EMERGENCY_HELPLINE_OTG_FALL_LATITUDE_PARAMETER_KEY), BilobaRouteUtil.getDoubleParameterValue(routeContext, EMERGENCY_HELPLINE_OTG_FALL_LONGITUDE_PARAMETER_KEY));
        if (AndroidUtils.isEmpty(stringParameterValue3)) {
            stringParameterValue3 = fallAlert.getIsOTGFall() ? context.getString(R.string.fall_detection_device) : context.getString(R.string.alexa_device);
        }
        fallAlert.setFallLocationMessage(getFallLocationMessage(context, fallAlert, str2));
        return getInfoModalView(context, str, stringParameterValue, str2, stringParameterValue3, fallAlert);
    }

    @VisibleForTesting
    public FallAlert getFallAlert(boolean z, Double d, Double d2) {
        boolean z2 = isOTGFallDetectionEnabled() && z;
        return new FallAlert().isOTGFall(z2).fallLocation(new Geolocation().type(z2 ? Geolocation.GeolocationTypeEnum.ON_THE_GO_FALL_LOCATION : Geolocation.GeolocationTypeEnum.UNKNOWN).latitude(d).longitude(d2));
    }

    @VisibleForTesting
    public String getFallLocationMessage(Context context, FallAlert fallAlert, String str) {
        return !fallAlert.getIsOTGFall() ? "" : isCoordinateUnavailable(fallAlert.getFallLocation()) ? context.getString(R.string.fall_location_message_no_coordinates) : context.getString(R.string.fall_location_message, str);
    }

    @VisibleForTesting
    public InfoModalViewModel getVerifiedAndUnverifiedFallModel(Context context, String str, String str2, String str3, FallAlert fallAlert) {
        return new InfoModalViewModel().setCaptionHeadlineText(str2).setHeadlineText(isFallLocationUnavailable(fallAlert) ? context.getString(R.string.verified_and_unverified_fall_no_coordinates_header) : context.getString(R.string.verified_and_unverified_fall_header, str, str3)).setTitleText(context.getString(R.string.verified_and_unverified_fall_title)).setDescription1(fallAlert.getIsOTGFall() ? context.getString(R.string.verified_and_unverified_fall_desc_1_otg, str) : context.getString(R.string.verified_and_unverified_fall_desc_1, str)).setDescription2(fallAlert.getIsOTGFall() ? null : context.getString(R.string.verified_and_unverified_fall_desc_2)).setDescription3(fallAlert.getIsOTGFall() ? context.getString(R.string.verified_and_unverified_fall_desc_3_otg, str) : context.getString(R.string.verified_and_unverified_fall_desc_3, str)).setIsOnTheGoFall(fallAlert.getIsOTGFall()).setFallLocationMessage(fallAlert.getFallLocationMessage()).setLatitude(fallAlert.getFallLocation().getLatitude()).setLongitude(fallAlert.getFallLocation().getLongitude()).setOkButtonText(context.getString(R.string.verified_and_unverified_fall_button)).setViewMetricName(fallAlert.getIsOTGFall() ? MetricsConstants.UserInteractionMetrics.EH_VERIFIED_AND_UNVERIFIED_FALL_CARD_RENDERED_OTG_FALL : MetricsConstants.UserInteractionMetrics.EH_VERIFIED_AND_UNVERIFIED_FALL_CARD_RENDERED_AT_HOME_FALL).setModalRenderedMetric(fallAlert.getIsOTGFall() ? MetricsConstants.UserInteractionMetrics.EH_VERIFIED_AND_UNVERIFIED_FALL_MODAL_RENDERED_OTG_FALL : MetricsConstants.UserInteractionMetrics.EH_VERIFIED_AND_UNVERIFIED_FALL_MODAL_RENDERED_AT_HOME_FALL).setClickMetricName(MetricsConstants.UserInteractionMetrics.EH_VERIFIED_AND_UNVERIFIED_FALL_ACTION_CLICK);
    }

    @VisibleForTesting
    public InfoModalViewModel getVerifiedNoFallModel(Context context, String str, String str2, String str3, FallAlert fallAlert) {
        return new InfoModalViewModel().setCaptionHeadlineText(str2).setHeadlineText(isFallLocationUnavailable(fallAlert) ? context.getString(R.string.verified_no_fall_no_coordinates_header) : context.getString(R.string.verified_no_fall_header, str, str3)).setTitleText(context.getString(R.string.verified_no_fall_title)).setDescription1(isFallLocationUnavailable(fallAlert) ? context.getString(R.string.verified_no_fall_desc_no_coordinates, str) : context.getString(R.string.verified_no_fall_desc_1, str)).setShowCommsSection(true).setCommsSectionTitle(context.getString(R.string.verified_no_fall_comms_title, str)).setCommsSectionDescription1(fallAlert.getIsOTGFall() ? null : context.getString(R.string.verified_no_fall_comms_desc_1, str)).setIsOnTheGoFall(fallAlert.getIsOTGFall()).setFallLocationMessage(fallAlert.getFallLocationMessage()).setLatitude(fallAlert.getFallLocation().getLatitude()).setLongitude(fallAlert.getFallLocation().getLongitude()).setOkButtonText(context.getString(R.string.verified_no_fall_button)).setViewMetricName(fallAlert.getIsOTGFall() ? MetricsConstants.UserInteractionMetrics.EH_VERIFIED_NO_FALL_CARD_RENDERED_OTG_FALL : MetricsConstants.UserInteractionMetrics.EH_VERIFIED_NO_FALL_CARD_RENDERED_AT_HOME_FALL).setClickMetricName(MetricsConstants.UserInteractionMetrics.EH_VERIFIED_NO_FALL_ACTION_CLICK).setModalRenderedMetric(fallAlert.getIsOTGFall() ? MetricsConstants.UserInteractionMetrics.EH_VERIFIED_NO_FALL_MODAL_RENDERED_OTG_FALL : MetricsConstants.UserInteractionMetrics.EH_VERIFIED_NO_FALL_MODAL_RENDERED_AT_HOME_FALL).setCommsMetrics(fallAlert.getIsOTGFall() ? null : MetricsConstants.UserInteractionMetrics.EH_VERIFIED_NO_FALL_COMMS_DROP_IN_BUTTON, MetricsConstants.UserInteractionMetrics.EH_VERIFIED_NO_FALL_COMMS_CALL_BUTTON, MetricsConstants.UserInteractionMetrics.EH_VERIFIED_NO_FALL_COMMS_MESSAGE_BUTTON);
    }

    @VisibleForTesting
    public boolean isCoordinateUnavailable(Geolocation geolocation) {
        return geolocation.getLatitude() == null || geolocation.getLongitude() == null;
    }

    public boolean isEmergencyHelplineRoute(String str) {
        return EMERGENCY_HELPLINE_ROUTES.contains(str);
    }

    @VisibleForTesting
    public boolean isFallLocationUnavailable(FallAlert fallAlert) {
        return fallAlert.getIsOTGFall() && isCoordinateUnavailable(fallAlert.getFallLocation());
    }

    @VisibleForTesting
    public boolean isOTGFallDetectionEnabled() {
        Lazy<FeatureServiceV2> lazy = this.featureServiceV2;
        return lazy != null && lazy.get().hasAccess("ALEXA_AGING_MOBILE_3P_OTG_FALL_DETECTION", false);
    }
}
