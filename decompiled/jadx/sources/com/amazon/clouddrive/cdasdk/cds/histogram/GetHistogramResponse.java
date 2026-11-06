package com.amazon.clouddrive.cdasdk.cds.histogram;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetHistogramResponse extends CloudDriveResponse {

    @SerializedName("countMap")
    @Expose
    private Map<String, Long> countMap;

    @Generated
    public GetHistogramResponse() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GetHistogramResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetHistogramResponse)) {
            return false;
        }
        GetHistogramResponse getHistogramResponse = (GetHistogramResponse) obj;
        if (!getHistogramResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Map<String, Long> countMap = getCountMap();
        Map<String, Long> countMap2 = getHistogramResponse.getCountMap();
        return countMap != null ? countMap.equals(countMap2) : countMap2 == null;
    }

    @Generated
    public Map<String, Long> getCountMap() {
        return this.countMap;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Map<String, Long> countMap = getCountMap();
        return (hashCode * 59) + (countMap == null ? 43 : countMap.hashCode());
    }

    @Generated
    public void setCountMap(Map<String, Long> map) {
        this.countMap = map;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveResponse
    @Generated
    public String toString() {
        return "GetHistogramResponse(countMap=" + getCountMap() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
