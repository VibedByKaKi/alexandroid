package com.amazon.clouddrive.cdasdk.cdds;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazonaws.services.s3.model.ResponseHeaderOverrides;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;
import lombok.NonNull;
import rx.Single$$ExternalSyntheticBUOutline0;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class DownloadNodeRequest extends ServiceRequest {

    @SerializedName("download")
    @Expose
    private Boolean download;

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName(ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_DISPOSITION)
    @Expose
    private String responseContentDisposition;

    @SerializedName(ResponseHeaderOverrides.RESPONSE_HEADER_CONTENT_TYPE)
    @Expose
    private String responseContentType;

    @SerializedName("viewBox")
    @Expose
    private String viewBox;

    public DownloadNodeRequest(@NonNull String str) {
        if (str != null) {
            this.id = str;
        } else {
            Single$$ExternalSyntheticBUOutline0.m$1("nodeId is marked non-null but is null");
            throw null;
        }
    }

    @Override // com.amazon.clouddrive.cdasdk.cdds.ServiceRequest
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof DownloadNodeRequest;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdds.ServiceRequest
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DownloadNodeRequest)) {
            return false;
        }
        DownloadNodeRequest downloadNodeRequest = (DownloadNodeRequest) obj;
        if (!downloadNodeRequest.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Boolean download = getDownload();
        Boolean download2 = downloadNodeRequest.getDownload();
        if (download != null ? !download.equals(download2) : download2 != null) {
            return false;
        }
        String id = getId();
        String id2 = downloadNodeRequest.getId();
        if (id != null ? !id.equals(id2) : id2 != null) {
            return false;
        }
        String viewBox = getViewBox();
        String viewBox2 = downloadNodeRequest.getViewBox();
        if (viewBox != null ? !viewBox.equals(viewBox2) : viewBox2 != null) {
            return false;
        }
        String responseContentType = getResponseContentType();
        String responseContentType2 = downloadNodeRequest.getResponseContentType();
        if (responseContentType != null ? !responseContentType.equals(responseContentType2) : responseContentType2 != null) {
            return false;
        }
        String responseContentDisposition = getResponseContentDisposition();
        String responseContentDisposition2 = downloadNodeRequest.getResponseContentDisposition();
        return responseContentDisposition != null ? responseContentDisposition.equals(responseContentDisposition2) : responseContentDisposition2 == null;
    }

    @Generated
    public Boolean getDownload() {
        return this.download;
    }

    @Generated
    public String getId() {
        return this.id;
    }

    @Generated
    public String getResponseContentDisposition() {
        return this.responseContentDisposition;
    }

    @Generated
    public String getResponseContentType() {
        return this.responseContentType;
    }

    @Generated
    public String getViewBox() {
        return this.viewBox;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdds.ServiceRequest
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Boolean download = getDownload();
        int hashCode2 = (hashCode * 59) + (download == null ? 43 : download.hashCode());
        String id = getId();
        int hashCode3 = (hashCode2 * 59) + (id == null ? 43 : id.hashCode());
        String viewBox = getViewBox();
        int hashCode4 = (hashCode3 * 59) + (viewBox == null ? 43 : viewBox.hashCode());
        String responseContentType = getResponseContentType();
        int i = hashCode4 * 59;
        int hashCode5 = responseContentType == null ? 43 : responseContentType.hashCode();
        String responseContentDisposition = getResponseContentDisposition();
        return ((i + hashCode5) * 59) + (responseContentDisposition != null ? responseContentDisposition.hashCode() : 43);
    }

    @Generated
    public void setDownload(Boolean bool) {
        this.download = bool;
    }

    @Generated
    public void setId(String str) {
        this.id = str;
    }

    @Generated
    public void setResponseContentDisposition(String str) {
        this.responseContentDisposition = str;
    }

    @Generated
    public void setResponseContentType(String str) {
        this.responseContentType = str;
    }

    @Generated
    public void setViewBox(String str) {
        this.viewBox = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.cdds.ServiceRequest
    @Generated
    public String toString() {
        return "DownloadNodeRequest(id=" + getId() + ", viewBox=" + getViewBox() + ", download=" + getDownload() + ", responseContentType=" + getResponseContentType() + ", responseContentDisposition=" + getResponseContentDisposition() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
