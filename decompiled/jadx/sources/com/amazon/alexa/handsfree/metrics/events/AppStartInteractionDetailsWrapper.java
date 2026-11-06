package com.amazon.alexa.handsfree.metrics.events;

import androidx.annotation.Nullable;
import com.amazon.alexa.handsfree.metrics.caching.JsonFields;
import com.amazon.alexa.mobilytics.event.userinteraction.interactionDetails.AppStartInteractionDetails;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class AppStartInteractionDetailsWrapper extends AppStartInteractionDetails {
    private String mReferralDetails;
    private String mReferralSource;
    private String mReferralType;

    @JsonCreator
    public AppStartInteractionDetailsWrapper(@JsonProperty("referralType") String str, @Nullable @JsonProperty("referralSource") String str2, @Nullable @JsonProperty("referralDetails") String str3) {
        super(str, str2, str3);
        this.mReferralType = str;
        this.mReferralDetails = str3;
        this.mReferralSource = str2;
    }

    @Override // com.amazon.alexa.mobilytics.event.userinteraction.interactionDetails.AppStartInteractionDetails
    @JsonProperty(JsonFields.REFERRAL_DETAILS)
    public String getReferralDetails() {
        return this.mReferralDetails;
    }

    @Override // com.amazon.alexa.mobilytics.event.userinteraction.interactionDetails.AppStartInteractionDetails
    @JsonProperty(JsonFields.REFERRAL_SOURCE)
    public String getReferralSource() {
        return this.mReferralSource;
    }

    @Override // com.amazon.alexa.mobilytics.event.userinteraction.interactionDetails.AppStartInteractionDetails
    @JsonProperty(JsonFields.REFERRAL_TYPE)
    public String getReferralType() {
        return this.mReferralType;
    }
}
