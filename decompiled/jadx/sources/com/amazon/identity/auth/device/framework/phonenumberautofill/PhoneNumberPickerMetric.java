package com.amazon.identity.auth.device.framework.phonenumberautofill;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes5.dex */
public enum PhoneNumberPickerMetric {
    PICKER_SHOWN("PhoneNumberPicker:Shown"),
    PICKER_PHONE_NUMBER_SELECTED("PhoneNumberPicker:PhoneNumberSelected"),
    PICKER_CANCELLED("PhoneNumberPicker:Cancelled"),
    PICKER_NO_HINTS_AVAILABLE("PhoneNumberPicker:NoHintsAvailable"),
    PICKER_PLAY_SERVICES_NOT_AVAILABLE("PhoneNumberPicker:PlayServicesNotAvailable"),
    PICKER_INTENT_SENDER_ERROR("PhoneNumberPicker:IntentSenderError"),
    PICKER_HINT_INTENT_FAILURE("PhoneNumberPicker:HintIntentFailure"),
    PICKER_API_EXCEPTION("PhoneNumberPicker:ApiException"),
    PICKER_ACTIVITY_REFERENCE_ERROR("PhoneNumberPicker:ActivityReferenceError"),
    PICKER_NO_EXTRAS_IN_INTENT("PhoneNumberPicker:NoExtrasInIntent"),
    PICKER_PHONE_NUMBER_NOT_IN_EXTRAS("PhoneNumberPicker:PhoneNumberNotInExtras"),
    PICKER_PARSE_ACTIVITY_RESULT_ERROR("PhoneNumberPicker:ParseActivityResultError"),
    PICKER_JSON_PARSING_ERROR("PhoneNumberPicker:JSONParsingError");

    private final String mMetricName;

    PhoneNumberPickerMetric(String str) {
        this.mMetricName = str;
    }

    public String getMetricName() {
        return this.mMetricName;
    }
}
