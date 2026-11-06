package com.amazon.alexa.featurefeedbackservice.api.model.submitFeedback;

import androidx.annotation.NonNull;
import com.amazon.alexa.featurefeedbackservice.api.model.FeedbackResponseBase;
import org.bouncycastle.asn1.ocsp.CrlID$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class SubmitFeedbackResponse extends FeedbackResponseBase {
    public static final int BAD_REQUEST = 400;
    public static final int INTERNAL_ERROR = 500;
    public static final int NOT_ELIGIBLE = 403;
    public static final int SUCCESS_CODE = 200;
    private int returnCode;

    public SubmitFeedbackResponse(int i, @NonNull String str) {
        super(str);
        if (i != 200) {
            this.returnCode = i;
        } else {
            CrlID$$ExternalSyntheticBUOutline0.m$8("Please use the default constructor for success.");
            throw null;
        }
    }

    public int getReturnCode() {
        return this.returnCode;
    }

    public boolean isSucceeded() {
        return this.returnCode == 200;
    }

    @Override // com.amazon.alexa.featurefeedbackservice.api.model.FeedbackResponseBase
    public void setErrorMessage(@NonNull String str) {
        if (isSucceeded()) {
            CrlID$$ExternalSyntheticBUOutline0.m$8("Error message cannot be set for success case");
        } else {
            super.setErrorMessage(str);
        }
    }

    public void setReturnCode(int i) {
        this.returnCode = i;
        if (isSucceeded()) {
            super.resetErrorMessage();
        }
    }

    public SubmitFeedbackResponse() {
        this.returnCode = 200;
    }
}
