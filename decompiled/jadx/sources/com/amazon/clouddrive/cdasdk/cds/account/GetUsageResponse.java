package com.amazon.clouddrive.cdasdk.cds.account;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.alexa.redesign.view.container.CardStudioAgentSpaceMetrics;
import com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetUsageResponse extends CloudDriveResponse {

    @SerializedName("doc")
    @Expose
    private UsageSummary doc;

    @SerializedName("lastCalculated")
    @Expose
    private String lastCalculated;

    @SerializedName(CardStudioAgentSpaceMetrics.DimensionValue.SCHEME_OTHER)
    @Expose
    private UsageSummary other;

    @SerializedName("photo")
    @Expose
    private UsageSummary photo;

    @SerializedName("video")
    @Expose
    private UsageSummary video;

    @Generated
    public GetUsageResponse() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GetUsageResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetUsageResponse)) {
            return false;
        }
        GetUsageResponse getUsageResponse = (GetUsageResponse) obj;
        if (!getUsageResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String lastCalculated = getLastCalculated();
        String lastCalculated2 = getUsageResponse.getLastCalculated();
        if (lastCalculated != null ? !lastCalculated.equals(lastCalculated2) : lastCalculated2 != null) {
            return false;
        }
        UsageSummary video = getVideo();
        UsageSummary video2 = getUsageResponse.getVideo();
        if (video != null ? !video.equals(video2) : video2 != null) {
            return false;
        }
        UsageSummary photo = getPhoto();
        UsageSummary photo2 = getUsageResponse.getPhoto();
        if (photo != null ? !photo.equals(photo2) : photo2 != null) {
            return false;
        }
        UsageSummary doc = getDoc();
        UsageSummary doc2 = getUsageResponse.getDoc();
        if (doc != null ? !doc.equals(doc2) : doc2 != null) {
            return false;
        }
        UsageSummary other = getOther();
        UsageSummary other2 = getUsageResponse.getOther();
        return other != null ? other.equals(other2) : other2 == null;
    }

    @Generated
    public UsageSummary getDoc() {
        return this.doc;
    }

    @Generated
    public String getLastCalculated() {
        return this.lastCalculated;
    }

    @Generated
    public UsageSummary getOther() {
        return this.other;
    }

    @Generated
    public UsageSummary getPhoto() {
        return this.photo;
    }

    @Generated
    public UsageSummary getVideo() {
        return this.video;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String lastCalculated = getLastCalculated();
        int hashCode2 = (hashCode * 59) + (lastCalculated == null ? 43 : lastCalculated.hashCode());
        UsageSummary video = getVideo();
        int hashCode3 = (hashCode2 * 59) + (video == null ? 43 : video.hashCode());
        UsageSummary photo = getPhoto();
        int hashCode4 = (hashCode3 * 59) + (photo == null ? 43 : photo.hashCode());
        UsageSummary doc = getDoc();
        int i = hashCode4 * 59;
        int hashCode5 = doc == null ? 43 : doc.hashCode();
        UsageSummary other = getOther();
        return ((i + hashCode5) * 59) + (other != null ? other.hashCode() : 43);
    }

    @Generated
    public void setDoc(UsageSummary usageSummary) {
        this.doc = usageSummary;
    }

    @Generated
    public void setLastCalculated(String str) {
        this.lastCalculated = str;
    }

    @Generated
    public void setOther(UsageSummary usageSummary) {
        this.other = usageSummary;
    }

    @Generated
    public void setPhoto(UsageSummary usageSummary) {
        this.photo = usageSummary;
    }

    @Generated
    public void setVideo(UsageSummary usageSummary) {
        this.video = usageSummary;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public String toString() {
        return "GetUsageResponse(lastCalculated=" + getLastCalculated() + ", video=" + getVideo() + ", photo=" + getPhoto() + ", doc=" + getDoc() + ", other=" + getOther() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
