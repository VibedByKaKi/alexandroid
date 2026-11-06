package com.amazon.clouddrive.cdasdk.cds.bulk;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class BulkGetNodesByDigestRequest extends CloudDriveRequest {

    @SerializedName("digestList")
    @Expose
    private List<String> digestList;

    @SerializedName("digestType")
    @Expose
    private DigestType digestType;

    @Generated
    public BulkGetNodesByDigestRequest() {
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof BulkGetNodesByDigestRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BulkGetNodesByDigestRequest)) {
            return false;
        }
        BulkGetNodesByDigestRequest bulkGetNodesByDigestRequest = (BulkGetNodesByDigestRequest) obj;
        if (!bulkGetNodesByDigestRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        List<String> digestList = getDigestList();
        List<String> digestList2 = bulkGetNodesByDigestRequest.getDigestList();
        if (digestList != null ? !digestList.equals(digestList2) : digestList2 != null) {
            return false;
        }
        DigestType digestType = getDigestType();
        DigestType digestType2 = bulkGetNodesByDigestRequest.getDigestType();
        return digestType != null ? digestType.equals(digestType2) : digestType2 == null;
    }

    @Generated
    public List<String> getDigestList() {
        return this.digestList;
    }

    @Generated
    public DigestType getDigestType() {
        return this.digestType;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        List<String> digestList = getDigestList();
        int i = hashCode * 59;
        int hashCode2 = digestList == null ? 43 : digestList.hashCode();
        DigestType digestType = getDigestType();
        return ((i + hashCode2) * 59) + (digestType != null ? digestType.hashCode() : 43);
    }

    @Generated
    public void setDigestList(List<String> list) {
        this.digestList = list;
    }

    @Generated
    public void setDigestType(DigestType digestType) {
        this.digestType = digestType;
    }

    @Override // com.amazon.clouddrive.cdasdk.cds.common.CloudDriveRequest
    @Generated
    public String toString() {
        return "BulkGetNodesByDigestRequest(digestList=" + getDigestList() + ", digestType=" + getDigestType() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
