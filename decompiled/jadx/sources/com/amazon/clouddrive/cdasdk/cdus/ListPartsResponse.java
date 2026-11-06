package com.amazon.clouddrive.cdasdk.cdus;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.mapbox.common.HttpHeaders;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ListPartsResponse {

    @SerializedName(HttpHeaders.LAST_MODIFIED)
    @Expose
    private String lastModified;

    @SerializedName("results")
    @Expose
    private List<PartResult> results;

    @SerializedName("total-parts")
    @Expose
    private Long totalParts;

    @Generated
    public ListPartsResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ListPartsResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ListPartsResponse)) {
            return false;
        }
        ListPartsResponse listPartsResponse = (ListPartsResponse) obj;
        if (!listPartsResponse.canEqual(this)) {
            return false;
        }
        Long totalParts = getTotalParts();
        Long totalParts2 = listPartsResponse.getTotalParts();
        if (totalParts != null ? !totalParts.equals(totalParts2) : totalParts2 != null) {
            return false;
        }
        String lastModified = getLastModified();
        String lastModified2 = listPartsResponse.getLastModified();
        if (lastModified != null ? !lastModified.equals(lastModified2) : lastModified2 != null) {
            return false;
        }
        List<PartResult> results = getResults();
        List<PartResult> results2 = listPartsResponse.getResults();
        return results != null ? results.equals(results2) : results2 == null;
    }

    @Generated
    public String getLastModified() {
        return this.lastModified;
    }

    @Generated
    public List<PartResult> getResults() {
        return this.results;
    }

    @Generated
    public Long getTotalParts() {
        return this.totalParts;
    }

    @Generated
    public int hashCode() {
        Long totalParts = getTotalParts();
        int hashCode = totalParts == null ? 43 : totalParts.hashCode();
        String lastModified = getLastModified();
        int i = (hashCode + 59) * 59;
        int hashCode2 = lastModified == null ? 43 : lastModified.hashCode();
        List<PartResult> results = getResults();
        return ((i + hashCode2) * 59) + (results != null ? results.hashCode() : 43);
    }

    @Generated
    public void setLastModified(String str) {
        this.lastModified = str;
    }

    @Generated
    public void setResults(List<PartResult> list) {
        this.results = list;
    }

    @Generated
    public void setTotalParts(Long l) {
        this.totalParts = l;
    }

    @Generated
    public String toString() {
        return "ListPartsResponse(totalParts=" + getTotalParts() + ", lastModified=" + getLastModified() + ", results=" + getResults() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
