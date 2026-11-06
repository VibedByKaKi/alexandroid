package com.amazon.clouddrive.cdasdk.cds.account;

import com.amazon.alexa.benefits.consumer.BenefitsConsumerConstants;
import com.amazon.alexa.ra.core.data.fragments.FragmentMetaData;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Benefit {

    @SerializedName(BenefitsConsumerConstants.COLUMN_BENEFIT)
    @Expose
    private String benefit;

    @SerializedName(FragmentMetaData.EXPIRATION)
    @Expose
    private String expiration;

    @Generated
    public Benefit() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof Benefit;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Benefit)) {
            return false;
        }
        Benefit benefit = (Benefit) obj;
        if (!benefit.canEqual(this)) {
            return false;
        }
        String benefit2 = getBenefit();
        String benefit3 = benefit.getBenefit();
        if (benefit2 != null ? !benefit2.equals(benefit3) : benefit3 != null) {
            return false;
        }
        String expiration = getExpiration();
        String expiration2 = benefit.getExpiration();
        return expiration != null ? expiration.equals(expiration2) : expiration2 == null;
    }

    @Generated
    public String getBenefit() {
        return this.benefit;
    }

    @Generated
    public String getExpiration() {
        return this.expiration;
    }

    @Generated
    public int hashCode() {
        String benefit = getBenefit();
        int hashCode = benefit == null ? 43 : benefit.hashCode();
        String expiration = getExpiration();
        return ((hashCode + 59) * 59) + (expiration != null ? expiration.hashCode() : 43);
    }

    @Generated
    public void setBenefit(String str) {
        this.benefit = str;
    }

    @Generated
    public void setExpiration(String str) {
        this.expiration = str;
    }

    @Generated
    public String toString() {
        return "Benefit(benefit=" + getBenefit() + ", expiration=" + getExpiration() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
