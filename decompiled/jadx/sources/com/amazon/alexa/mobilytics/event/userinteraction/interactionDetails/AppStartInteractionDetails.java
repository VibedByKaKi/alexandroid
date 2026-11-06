package com.amazon.alexa.mobilytics.event.userinteraction.interactionDetails;

import androidx.annotation.Nullable;
import com.amazon.alexa.mobilytics.event.userinteraction.InteractionType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes18.dex */
public class AppStartInteractionDetails implements InteractionDetails {
    private final String interactionType = InteractionType.APP_START;
    private String referralDetails;
    private String referralSource;
    private String referralType;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ReferralType {
        public static final String DEEP_LINK = "deepLink";
        public static final String LAUNCHER = "launcher";
        public static final String NOTIFICATION = "notification";
    }

    public AppStartInteractionDetails(String str, @Nullable String str2, @Nullable String str3) {
        this.referralType = str;
        this.referralSource = str2;
        this.referralDetails = str3;
    }

    @Override // com.amazon.alexa.mobilytics.event.userinteraction.interactionDetails.InteractionDetails
    public String getInteractionType() {
        return InteractionType.APP_START;
    }

    public String getReferralDetails() {
        return this.referralDetails;
    }

    public String getReferralSource() {
        return this.referralSource;
    }

    public String getReferralType() {
        return this.referralType;
    }

    public void setReferralDetails(@Nullable String str) {
        this.referralDetails = str;
    }

    public void setReferralSource(@Nullable String str) {
        this.referralSource = str;
    }

    public void setReferralType(String str) {
        this.referralType = str;
    }

    public AppStartInteractionDetails(String str) {
        this.referralType = str;
    }
}
