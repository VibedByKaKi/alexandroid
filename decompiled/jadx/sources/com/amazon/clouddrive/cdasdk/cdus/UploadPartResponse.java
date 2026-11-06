package com.amazon.clouddrive.cdasdk.cdus;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class UploadPartResponse {

    @SerializedName("serverSidePartMD5")
    @Expose
    private String serverSidePartMD5;

    @SerializedName("serverSidePartSize")
    @Expose
    private String serverSidePartSize;

    @SerializedName("status")
    @Expose
    private String status;

    @Generated
    public UploadPartResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof UploadPartResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UploadPartResponse)) {
            return false;
        }
        UploadPartResponse uploadPartResponse = (UploadPartResponse) obj;
        if (!uploadPartResponse.canEqual(this)) {
            return false;
        }
        String status = getStatus();
        String status2 = uploadPartResponse.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        String serverSidePartMD5 = getServerSidePartMD5();
        String serverSidePartMD52 = uploadPartResponse.getServerSidePartMD5();
        if (serverSidePartMD5 != null ? !serverSidePartMD5.equals(serverSidePartMD52) : serverSidePartMD52 != null) {
            return false;
        }
        String serverSidePartSize = getServerSidePartSize();
        String serverSidePartSize2 = uploadPartResponse.getServerSidePartSize();
        return serverSidePartSize != null ? serverSidePartSize.equals(serverSidePartSize2) : serverSidePartSize2 == null;
    }

    @Generated
    public String getServerSidePartMD5() {
        return this.serverSidePartMD5;
    }

    @Generated
    public String getServerSidePartSize() {
        return this.serverSidePartSize;
    }

    @Generated
    public String getStatus() {
        return this.status;
    }

    @Generated
    public int hashCode() {
        String status = getStatus();
        int hashCode = status == null ? 43 : status.hashCode();
        String serverSidePartMD5 = getServerSidePartMD5();
        int i = (hashCode + 59) * 59;
        int hashCode2 = serverSidePartMD5 == null ? 43 : serverSidePartMD5.hashCode();
        String serverSidePartSize = getServerSidePartSize();
        return ((i + hashCode2) * 59) + (serverSidePartSize != null ? serverSidePartSize.hashCode() : 43);
    }

    @Generated
    public void setServerSidePartMD5(String str) {
        this.serverSidePartMD5 = str;
    }

    @Generated
    public void setServerSidePartSize(String str) {
        this.serverSidePartSize = str;
    }

    @Generated
    public void setStatus(String str) {
        this.status = str;
    }

    @Generated
    public String toString() {
        return "UploadPartResponse(status=" + getStatus() + ", serverSidePartMD5=" + getServerSidePartMD5() + ", serverSidePartSize=" + getServerSidePartSize() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
