package com.amazon.alexa.featurefeedbackservice.api.model.submitFeedback;

import androidx.annotation.NonNull;
import com.amazon.alexa.featurefeedbackservice.api.model.submitFeedback.experience.ExperienceFeedbackDetails;
import com.amazon.alexa.featurefeedbackservice.api.model.submitFeedback.proactive.ProactiveFeedbackDetails;
import com.amazon.alexa.featurefeedbackservice.api.utils.Utils;
import com.amazon.alexa.featurefeedbackservice.constants.Constants;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class SubmitFeedbackRequest {
    private String campaignId;
    private CampaignType campaignType;
    private ContentDetails contentDetails;
    private ExperienceFeedbackDetails experienceFeedbackDetails;
    private String feature;
    private FeedbackChannel feedbackChannel;
    private String feedbackData;
    private FeatureFeedbackType feedbackType;
    private ProactiveFeedbackDetails proactiveFeedbackDetails;

    public SubmitFeedbackRequest(@NonNull String str, CampaignType campaignType, @NonNull String str2, FeatureFeedbackType featureFeedbackType, String str3, ContentDetails contentDetails, FeedbackChannel feedbackChannel, ProactiveFeedbackDetails proactiveFeedbackDetails, ExperienceFeedbackDetails experienceFeedbackDetails) {
        Utils.validateNonEmptyString("featureName", str);
        Utils.validateNonEmptyString(Constants.SubmitFeedback.REQUEST_CAMPAIGN_ID, str2);
        this.feature = str;
        this.campaignType = campaignType;
        this.campaignId = str2;
        this.feedbackType = featureFeedbackType;
        this.feedbackData = str3;
        this.feedbackChannel = feedbackChannel;
        this.contentDetails = ContentDetails.deepCopy(contentDetails);
        this.proactiveFeedbackDetails = ProactiveFeedbackDetails.deepCopy(proactiveFeedbackDetails);
        this.experienceFeedbackDetails = ExperienceFeedbackDetails.deepCopy(experienceFeedbackDetails);
    }

    public String getCampaignId() {
        return this.campaignId;
    }

    public CampaignType getCampaignType() {
        return this.campaignType;
    }

    public ContentDetails getContentDetails() {
        return ContentDetails.deepCopy(this.contentDetails);
    }

    public ExperienceFeedbackDetails getExperienceFeedbackDetails() {
        return this.experienceFeedbackDetails;
    }

    public String getFeatureName() {
        return this.feature;
    }

    public FeedbackChannel getFeedbackChannel() {
        return this.feedbackChannel;
    }

    public String getFeedbackData() {
        return this.feedbackData;
    }

    public FeatureFeedbackType getFeedbackType() {
        return this.feedbackType;
    }

    public ProactiveFeedbackDetails getProactiveFeedbackDetails() {
        return this.proactiveFeedbackDetails;
    }

    public void setCampaignId(@NonNull String str) {
        Utils.validateNonEmptyString(Constants.SubmitFeedback.REQUEST_CAMPAIGN_ID, str);
        this.campaignId = str;
    }

    public void setCampaignType(CampaignType campaignType) {
        this.campaignType = campaignType;
    }

    public void setContentDetails(@NonNull ContentDetails contentDetails) {
        this.contentDetails = ContentDetails.deepCopy(contentDetails);
    }

    public void setFeatureName(@NonNull String str) {
        Utils.validateNonEmptyString("featureName", str);
        this.feature = str;
    }

    public void setFeedbackData(@NonNull String str) {
        Utils.validateNonEmptyString(Constants.SubmitFeedback.REQUEST_FEEDBACK_DATA, str);
        this.feedbackData = str;
    }

    public void setFeedbackType(FeatureFeedbackType featureFeedbackType) {
        this.feedbackType = featureFeedbackType;
    }

    public SubmitFeedbackRequest(@NonNull String str, CampaignType campaignType, @NonNull String str2, FeatureFeedbackType featureFeedbackType, @NonNull String str3, ContentDetails contentDetails) {
        this(str, campaignType, str2, featureFeedbackType, str3, contentDetails, FeedbackChannel.ALEXA_MOBILE_APP, null, null);
    }

    public SubmitFeedbackRequest(@NonNull String str, CampaignType campaignType, @NonNull String str2, ContentDetails contentDetails, FeedbackChannel feedbackChannel, ProactiveFeedbackDetails proactiveFeedbackDetails, ExperienceFeedbackDetails experienceFeedbackDetails) {
        this(str, campaignType, str2, null, null, contentDetails, feedbackChannel, proactiveFeedbackDetails, experienceFeedbackDetails);
    }

    public SubmitFeedbackRequest(@NonNull String str, CampaignType campaignType, @NonNull String str2, FeatureFeedbackType featureFeedbackType, String str3) {
        this(str, campaignType, str2, featureFeedbackType, str3, null);
    }
}
