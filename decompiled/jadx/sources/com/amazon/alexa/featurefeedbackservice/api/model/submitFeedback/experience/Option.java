package com.amazon.alexa.featurefeedbackservice.api.model.submitFeedback.experience;

import androidx.annotation.NonNull;
import com.amazon.alexa.featurefeedbackservice.api.utils.Utils;
import com.amazon.alexa.featurefeedbackservice.constants.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public final class Option {
    private String optionId;
    private String optionText;
    private boolean selected;

    public Option(String str, @NonNull String str2, boolean z) {
        Utils.validateNonEmptyString(Constants.SubmitFeedbackExperienceDetails.REQUEST_INQUIRY_OPTION_TEXT, str2);
        this.optionId = str;
        this.optionText = str2;
        this.selected = z;
    }

    public String getOptionId() {
        return this.optionId;
    }

    public String getOptionText() {
        return this.optionText;
    }

    public boolean isSelected() {
        return this.selected;
    }

    public Option(String str, @NonNull String str2) {
        this(str, str2, true);
    }
}
