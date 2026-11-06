package com.amazon.alexa.featurefeedbackservice.api.model.showfeedback;

import androidx.annotation.NonNull;
import com.amazon.alexa.featurefeedbackservice.api.model.FeedbackResponseBase;
import com.amazon.alexa.featurefeedbackservice.api.utils.Utils;
import com.amazon.alexa.featurefeedbackservice.constants.Constants;
import org.bouncycastle.asn1.ocsp.CrlID$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class ShowFeedbackPromptResponse extends FeedbackResponseBase {
    private String campaignId;
    private String featureName;
    private ShowFeedbackPromptResponseType responseType;

    public ShowFeedbackPromptResponse(@NonNull String str, @NonNull String str2) {
        Utils.validateNonEmptyString("featureName", str);
        Utils.validateNonEmptyString(Constants.SubmitFeedback.REQUEST_CAMPAIGN_ID, str2);
        this.featureName = str;
        this.campaignId = str2;
        this.responseType = ShowFeedbackPromptResponseType.ELIGIBLE;
    }

    public String getCampaignId() {
        return this.campaignId;
    }

    public String getFeatureName() {
        return this.featureName;
    }

    public ShowFeedbackPromptResponseType getResponseType() {
        return this.responseType;
    }

    public boolean isEligible() {
        return this.responseType == ShowFeedbackPromptResponseType.ELIGIBLE;
    }

    @Override // com.amazon.alexa.featurefeedbackservice.api.model.FeedbackResponseBase
    public void setErrorMessage(@NonNull String str) {
        if (isEligible()) {
            CrlID$$ExternalSyntheticBUOutline0.m$8("Error message cannot be set for success case");
        } else {
            super.setErrorMessage(str);
        }
    }

    public void setResponseType(ShowFeedbackPromptResponseType showFeedbackPromptResponseType) {
        this.responseType = showFeedbackPromptResponseType;
        if (isEligible()) {
            super.resetErrorMessage();
        }
    }

    public ShowFeedbackPromptResponse(String str, String str2, ShowFeedbackPromptResponseType showFeedbackPromptResponseType) {
        this.featureName = str;
        this.campaignId = str2;
        this.responseType = showFeedbackPromptResponseType;
    }

    public ShowFeedbackPromptResponse(String str, String str2, ShowFeedbackPromptResponseType showFeedbackPromptResponseType, @NonNull String str3) {
        super(str3);
        this.featureName = str;
        this.campaignId = str2;
        this.responseType = showFeedbackPromptResponseType;
    }
}
