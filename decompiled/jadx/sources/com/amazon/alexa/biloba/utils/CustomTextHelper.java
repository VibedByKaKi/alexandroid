package com.amazon.alexa.biloba.utils;

import com.amazon.alexa.biloba.R;
import javax.inject.Inject;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class CustomTextHelper {
    public static final int MAX_TEXT_LENGTH = 25;
    public static final int NO_ERROR = -1;

    @Inject
    public CustomTextHelper() {
    }

    public int getInvalidTextErrorResource(CharSequence charSequence) {
        if (charSequence.length() > 0 && !RegexUtils.isValidCustomAlertName(charSequence)) {
            return R.string.alert_name_validation_error;
        }
        if (charSequence.length() > 0 && RegexUtils.hasOnlyAllowedSpecialChars(charSequence)) {
            return R.string.alert_name_special_chars_error;
        }
        if (charSequence.length() > 25) {
            return R.string.alert_name_max_length_error;
        }
        return -1;
    }
}
