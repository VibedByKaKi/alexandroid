package com.amazon.clouddrive.cdasdk.aps.account;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.smarthomecameras.routing.CamerasRouteParameter;
import com.amazon.clouddrive.cdasdk.aps.common.APSOutput;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class AccountFeaturesOutput extends APSOutput {

    @SerializedName("canInvite")
    @Expose
    private Boolean canInvite;

    @SerializedName(CamerasRouteParameter.FEATURES)
    @Expose
    private List<AccountFeature> features;

    @SerializedName("onboarded")
    @Expose
    private Boolean onboarded;

    @Generated
    public AccountFeaturesOutput() {
    }

    @Override // com.amazon.clouddrive.cdasdk.aps.common.APSOutput
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof AccountFeaturesOutput;
    }

    @Override // com.amazon.clouddrive.cdasdk.aps.common.APSOutput
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AccountFeaturesOutput)) {
            return false;
        }
        AccountFeaturesOutput accountFeaturesOutput = (AccountFeaturesOutput) obj;
        if (!accountFeaturesOutput.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Boolean onboarded = getOnboarded();
        Boolean onboarded2 = accountFeaturesOutput.getOnboarded();
        if (onboarded != null ? !onboarded.equals(onboarded2) : onboarded2 != null) {
            return false;
        }
        Boolean canInvite = getCanInvite();
        Boolean canInvite2 = accountFeaturesOutput.getCanInvite();
        if (canInvite != null ? !canInvite.equals(canInvite2) : canInvite2 != null) {
            return false;
        }
        List<AccountFeature> features = getFeatures();
        List<AccountFeature> features2 = accountFeaturesOutput.getFeatures();
        return features != null ? features.equals(features2) : features2 == null;
    }

    @Generated
    public Boolean getCanInvite() {
        return this.canInvite;
    }

    @Generated
    public List<AccountFeature> getFeatures() {
        return this.features;
    }

    @Generated
    public Boolean getOnboarded() {
        return this.onboarded;
    }

    @Override // com.amazon.clouddrive.cdasdk.aps.common.APSOutput
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Boolean onboarded = getOnboarded();
        int hashCode2 = (hashCode * 59) + (onboarded == null ? 43 : onboarded.hashCode());
        Boolean canInvite = getCanInvite();
        int i = hashCode2 * 59;
        int hashCode3 = canInvite == null ? 43 : canInvite.hashCode();
        List<AccountFeature> features = getFeatures();
        return ((i + hashCode3) * 59) + (features != null ? features.hashCode() : 43);
    }

    @Generated
    public void setCanInvite(Boolean bool) {
        this.canInvite = bool;
    }

    @Generated
    public void setFeatures(List<AccountFeature> list) {
        this.features = list;
    }

    @Generated
    public void setOnboarded(Boolean bool) {
        this.onboarded = bool;
    }

    @Override // com.amazon.clouddrive.cdasdk.aps.common.APSOutput
    @Generated
    public String toString() {
        return "AccountFeaturesOutput(features=" + getFeatures() + ", onboarded=" + getOnboarded() + ", canInvite=" + getCanInvite() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
