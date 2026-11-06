package com.amazon.clouddrive.cdasdk.cds.account;

import com.amazon.alexa.benefits.consumer.BenefitsConsumerConstants;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AvailableBenefit {

    @SerializedName(BenefitsConsumerConstants.COLUMN_BENEFIT)
    @Expose
    private String benefit;

    @Generated
    public AvailableBenefit() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof AvailableBenefit;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvailableBenefit)) {
            return false;
        }
        AvailableBenefit availableBenefit = (AvailableBenefit) obj;
        if (!availableBenefit.canEqual(this)) {
            return false;
        }
        String benefit = getBenefit();
        String benefit2 = availableBenefit.getBenefit();
        return benefit != null ? benefit.equals(benefit2) : benefit2 == null;
    }

    @Generated
    public String getBenefit() {
        return this.benefit;
    }

    @Generated
    public int hashCode() {
        String benefit = getBenefit();
        return 59 + (benefit == null ? 43 : benefit.hashCode());
    }

    @Generated
    public void setBenefit(String str) {
        this.benefit = str;
    }

    @Generated
    public String toString() {
        return "AvailableBenefit(benefit=" + getBenefit() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
