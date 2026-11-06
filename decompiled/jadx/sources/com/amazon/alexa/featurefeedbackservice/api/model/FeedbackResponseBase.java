package com.amazon.alexa.featurefeedbackservice.api.model;

import androidx.annotation.NonNull;
import com.amazon.alexa.featurefeedbackservice.api.utils.Utils;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public abstract class FeedbackResponseBase {
    private String errorMessage;

    public FeedbackResponseBase(@NonNull String str) {
        Utils.validateNonEmptyString("errorMessage", str);
        this.errorMessage = str;
    }

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public void resetErrorMessage() {
        this.errorMessage = null;
    }

    public void setErrorMessage(@NonNull String str) {
        Utils.validateNonEmptyString("errorMessage", str);
        this.errorMessage = str;
    }

    public FeedbackResponseBase() {
    }
}
