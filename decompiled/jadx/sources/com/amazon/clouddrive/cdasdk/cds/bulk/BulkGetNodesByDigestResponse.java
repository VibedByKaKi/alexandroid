package com.amazon.clouddrive.cdasdk.cds.bulk;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Map;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BulkGetNodesByDigestResponse {

    @SerializedName("digestToNodeMap")
    @Expose
    private Map<String, NodeMatch> digestToNodeMap;

    @SerializedName("digestType")
    @Expose
    private String digestType;

    @Generated
    public BulkGetNodesByDigestResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof BulkGetNodesByDigestResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BulkGetNodesByDigestResponse)) {
            return false;
        }
        BulkGetNodesByDigestResponse bulkGetNodesByDigestResponse = (BulkGetNodesByDigestResponse) obj;
        if (!bulkGetNodesByDigestResponse.canEqual(this)) {
            return false;
        }
        Map<String, NodeMatch> digestToNodeMap = getDigestToNodeMap();
        Map<String, NodeMatch> digestToNodeMap2 = bulkGetNodesByDigestResponse.getDigestToNodeMap();
        if (digestToNodeMap != null ? !digestToNodeMap.equals(digestToNodeMap2) : digestToNodeMap2 != null) {
            return false;
        }
        String digestType = getDigestType();
        String digestType2 = bulkGetNodesByDigestResponse.getDigestType();
        return digestType != null ? digestType.equals(digestType2) : digestType2 == null;
    }

    @Generated
    public Map<String, NodeMatch> getDigestToNodeMap() {
        return this.digestToNodeMap;
    }

    @Generated
    public String getDigestType() {
        return this.digestType;
    }

    @Generated
    public int hashCode() {
        Map<String, NodeMatch> digestToNodeMap = getDigestToNodeMap();
        int hashCode = digestToNodeMap == null ? 43 : digestToNodeMap.hashCode();
        String digestType = getDigestType();
        return ((hashCode + 59) * 59) + (digestType != null ? digestType.hashCode() : 43);
    }

    @Generated
    public void setDigestToNodeMap(Map<String, NodeMatch> map) {
        this.digestToNodeMap = map;
    }

    @Generated
    public void setDigestType(String str) {
        this.digestType = str;
    }

    @Generated
    public String toString() {
        return "BulkGetNodesByDigestResponse(digestToNodeMap=" + getDigestToNodeMap() + ", digestType=" + getDigestType() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
