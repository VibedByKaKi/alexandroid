package com.amazon.alexa.biloba.routing;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
@Retention(RetentionPolicy.SOURCE)
/* loaded from: classes17.dex */
public @interface Routes {
    public static final String BILOBA = "biloba";
    public static final String BILOBA_ACTIVITY_RECENT = "biloba/dashboard/recent";
    public static final String BILOBA_CARE_PLUS_DISCOVERY = "biloba/external/care-plus-discover";
    public static final String BILOBA_CARE_PLUS_UPSELL = "biloba/external/care-plus-upsell";
    public static final String BILOBA_CARE_PLUS_WELCOME = "biloba/external/care-plus-welcome";
    public static final String BILOBA_COMMS_PRIMER = "biloba/external/commsPrimer";
    public static final String BILOBA_COMMS_SETUP_INSTRUCTIONS = "biloba/comms/setup_instructions";
    public static final String BILOBA_COMMS_SHARE_SETUP_LINK = "biloba/comms/share_setup_link";
    public static final String BILOBA_CONFIRMATION = "biloba/confirmation";
    public static final String BILOBA_CUSTOM_ALERTS_ACTIVITY = "biloba/dashboard/alerts/v2/activity";
    public static final String BILOBA_CUSTOM_ALERTS_ALERT_NAME = "biloba/dashboard/alerts/v2/alert-name";
    public static final String BILOBA_CUSTOM_ALERTS_DEVICE_LIST = "biloba/dashboard/alerts/v2/device-list";
    public static final String BILOBA_CUSTOM_ALERTS_EDIT = "biloba/dashboard/alerts/v2/edit";
    public static final String BILOBA_CUSTOM_ALERTS_LIST = "biloba/dashboard/alerts/v2";
    public static final String BILOBA_CUSTOM_ALERTS_NEW_ALERT = "biloba/dashboard/alerts/v2/new-alert";
    public static final String BILOBA_CUSTOM_ALERTS_SCHEDULE = "biloba/dashboard/alerts/v2/schedule";
    public static final String BILOBA_DASHBOARD = "biloba/dashboard";
    public static final String BILOBA_EMERGENCY = "biloba/comms/emergency";
    public static final String BILOBA_EMERGENCY_HELPLINE_CALL_ENDED = "biloba/comms/emergency-helpline-call-ended";
    public static final String BILOBA_EMERGENCY_HELPLINE_CALL_FAILED = "biloba/comms/emergency-helpline-call-failed";
    public static final String BILOBA_EMERGENCY_HELPLINE_CALL_STARTED = "biloba/comms/emergency-helpline-call-started";
    public static final String BILOBA_EMERGENCY_HELPLINE_VERIFIED_AND_UNVERIFIED_FALL = "biloba/comms/fall-detected-verified-and-unverified-fall";
    public static final String BILOBA_EMERGENCY_HELPLINE_VERIFIED_NO_FALL = "biloba/comms/fall-detected-verified-no-fall";
    public static final String BILOBA_ENABLE_REMOTE_MANAGEMENT = "biloba/external/dashboard";
    public static final String BILOBA_EXTERNAL_ACTIVATION = "biloba/external/activation";
    public static final String BILOBA_EXTERNAL_DASHBOARD = "biloba/external/dashboard";
    public static final String BILOBA_EXTERNAL_ROLE_EXPLANATION = "biloba/external/dashboard/role/learnMore";
    public static final String BILOBA_FALL_DETECTION_ADD_DEVICES_UPSELL = "biloba/external/fall-detection-upsell";
    public static final String BILOBA_FINISH_COMMS_SETUP = "biloba/external/comms-primer";
    public static final String BILOBA_FINISH_EMERGENCY_ADDRESS_SETUP = "biloba/external/emergency-address";
    public static final String BILOBA_GETTING_STARTED_V3 = "biloba/getting_started_V3";
    public static final String BILOBA_INFO_MODAL = "biloba/info-modal";
    public static final String BILOBA_INVITE_CARE_GIVER = "biloba/external/invite-care-giver";
    public static final String BILOBA_LONE_CR_CREATE_RELATIONSHIP = "biloba/external/lone-cr-create-relationship";
    public static final String BILOBA_MEMBERSHIP_LEAVE = "biloba/dashboard/membership/leave";
    public static final String BILOBA_MEMBERSHIP_LEAVE_DONE = "biloba/dashboard/membership/leave/done";
    public static final String BILOBA_MEMBERSHIP_MANAGE = "biloba/dashboard/membership/edit";
    public static final String BILOBA_PROFILE_SETTINGS = "biloba/dashboard/profile/settings";
    public static final String BILOBA_STARTUP = "biloba/startup";
    public static final String BILOBA_TEST_EMERGENCY_HELPLINE = "biloba/external/test-emergency-helpline";
    public static final String BILOBA_TIPS_PAGE = "biloba/tips";
    public static final String COMMS_SETUP = "v2/comms/cvf-web-view?successRoute=%1$s&skipRoute=%1$s";
    public static final String COMMS_SHARE = "v2/comms/sharing-ftue?contactId=%1$s";
    public static final String PASSCODE_SETUP_ROUTE = "v2/elements-personidentity/personal-passcode-primer?context=alexa-care-setup-personal-passcode";
    public static final String PASSCODE_VERIFICATION_ROUTE = "v2/elements-personidentity/personal-passcode-verification-flow?context=alexa-care";
    public static final String PRODUCT_DIGITAL_PURCHASE = "v2/alexa-digital-commerce/pdp/B0973P25VD?ref_=%1$s";
    public static final String REMOTE_MANAGEMENT_ROUTE = "elements-remote-management/index";
    public static final String TIMEZONE_PICKER = "biloba/dashboard/profile/settings/timezonepicker";
}
