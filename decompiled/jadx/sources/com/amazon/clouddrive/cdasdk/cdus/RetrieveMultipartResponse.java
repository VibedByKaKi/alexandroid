package com.amazon.clouddrive.cdasdk.cdus;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class RetrieveMultipartResponse {

    @SerializedName("completeMultipartUploadExpirationTime")
    @Expose
    private String completeMultipartUploadExpirationTime;

    @SerializedName("completeMultipartUploadStartTime")
    @Expose
    private String completeMultipartUploadStartTime;

    @SerializedName("missingParts")
    @Expose
    private List<Long> missingParts;

    @SerializedName("multipartUploadExpirationTime")
    @Expose
    private String multipartUploadExpirationTime;

    @SerializedName("multipartUploadStartTime")
    @Expose
    private String multipartUploadStartTime;

    @SerializedName("partSize")
    @Expose
    private Long partSize;

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("totalNumberOfParts")
    @Expose
    private Long totalNumberOfParts;

    @SerializedName("uploadErrorDetails")
    @Expose
    private UploadErrorDetails uploadErrorDetails;

    /* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
    public static class UploadErrorDetails {

        @SerializedName("errorCode")
        @Expose
        private String errorCode;

        @SerializedName("errorMessage")
        @Expose
        private String errorMessage;

        @Generated
        public UploadErrorDetails() {
        }

        @Generated
        public boolean canEqual(Object obj) {
            return obj instanceof UploadErrorDetails;
        }

        @Generated
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UploadErrorDetails)) {
                return false;
            }
            UploadErrorDetails uploadErrorDetails = (UploadErrorDetails) obj;
            if (!uploadErrorDetails.canEqual(this)) {
                return false;
            }
            String errorCode = getErrorCode();
            String errorCode2 = uploadErrorDetails.getErrorCode();
            if (errorCode != null ? !errorCode.equals(errorCode2) : errorCode2 != null) {
                return false;
            }
            String errorMessage = getErrorMessage();
            String errorMessage2 = uploadErrorDetails.getErrorMessage();
            return errorMessage != null ? errorMessage.equals(errorMessage2) : errorMessage2 == null;
        }

        @Generated
        public String getErrorCode() {
            return this.errorCode;
        }

        @Generated
        public String getErrorMessage() {
            return this.errorMessage;
        }

        @Generated
        public int hashCode() {
            String errorCode = getErrorCode();
            int hashCode = errorCode == null ? 43 : errorCode.hashCode();
            String errorMessage = getErrorMessage();
            return ((hashCode + 59) * 59) + (errorMessage != null ? errorMessage.hashCode() : 43);
        }

        @Generated
        public void setErrorCode(String str) {
            this.errorCode = str;
        }

        @Generated
        public void setErrorMessage(String str) {
            this.errorMessage = str;
        }

        @Generated
        public String toString() {
            return "RetrieveMultipartResponse.UploadErrorDetails(errorCode=" + getErrorCode() + ", errorMessage=" + getErrorMessage() + MarkdownConstants.RIGHT_PARENTHESIS;
        }
    }

    @Generated
    public RetrieveMultipartResponse() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof RetrieveMultipartResponse;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RetrieveMultipartResponse)) {
            return false;
        }
        RetrieveMultipartResponse retrieveMultipartResponse = (RetrieveMultipartResponse) obj;
        if (!retrieveMultipartResponse.canEqual(this)) {
            return false;
        }
        Long totalNumberOfParts = getTotalNumberOfParts();
        Long totalNumberOfParts2 = retrieveMultipartResponse.getTotalNumberOfParts();
        if (totalNumberOfParts != null ? !totalNumberOfParts.equals(totalNumberOfParts2) : totalNumberOfParts2 != null) {
            return false;
        }
        Long partSize = getPartSize();
        Long partSize2 = retrieveMultipartResponse.getPartSize();
        if (partSize != null ? !partSize.equals(partSize2) : partSize2 != null) {
            return false;
        }
        String status = getStatus();
        String status2 = retrieveMultipartResponse.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        String multipartUploadStartTime = getMultipartUploadStartTime();
        String multipartUploadStartTime2 = retrieveMultipartResponse.getMultipartUploadStartTime();
        if (multipartUploadStartTime != null ? !multipartUploadStartTime.equals(multipartUploadStartTime2) : multipartUploadStartTime2 != null) {
            return false;
        }
        String multipartUploadExpirationTime = getMultipartUploadExpirationTime();
        String multipartUploadExpirationTime2 = retrieveMultipartResponse.getMultipartUploadExpirationTime();
        if (multipartUploadExpirationTime != null ? !multipartUploadExpirationTime.equals(multipartUploadExpirationTime2) : multipartUploadExpirationTime2 != null) {
            return false;
        }
        String completeMultipartUploadStartTime = getCompleteMultipartUploadStartTime();
        String completeMultipartUploadStartTime2 = retrieveMultipartResponse.getCompleteMultipartUploadStartTime();
        if (completeMultipartUploadStartTime != null ? !completeMultipartUploadStartTime.equals(completeMultipartUploadStartTime2) : completeMultipartUploadStartTime2 != null) {
            return false;
        }
        String completeMultipartUploadExpirationTime = getCompleteMultipartUploadExpirationTime();
        String completeMultipartUploadExpirationTime2 = retrieveMultipartResponse.getCompleteMultipartUploadExpirationTime();
        if (completeMultipartUploadExpirationTime != null ? !completeMultipartUploadExpirationTime.equals(completeMultipartUploadExpirationTime2) : completeMultipartUploadExpirationTime2 != null) {
            return false;
        }
        List<Long> missingParts = getMissingParts();
        List<Long> missingParts2 = retrieveMultipartResponse.getMissingParts();
        if (missingParts != null ? !missingParts.equals(missingParts2) : missingParts2 != null) {
            return false;
        }
        UploadErrorDetails uploadErrorDetails = getUploadErrorDetails();
        UploadErrorDetails uploadErrorDetails2 = retrieveMultipartResponse.getUploadErrorDetails();
        return uploadErrorDetails != null ? uploadErrorDetails.equals(uploadErrorDetails2) : uploadErrorDetails2 == null;
    }

    @Generated
    public String getCompleteMultipartUploadExpirationTime() {
        return this.completeMultipartUploadExpirationTime;
    }

    @Generated
    public String getCompleteMultipartUploadStartTime() {
        return this.completeMultipartUploadStartTime;
    }

    @Generated
    public List<Long> getMissingParts() {
        return this.missingParts;
    }

    @Generated
    public String getMultipartUploadExpirationTime() {
        return this.multipartUploadExpirationTime;
    }

    @Generated
    public String getMultipartUploadStartTime() {
        return this.multipartUploadStartTime;
    }

    @Generated
    public Long getPartSize() {
        return this.partSize;
    }

    @Generated
    public String getStatus() {
        return this.status;
    }

    @Generated
    public Long getTotalNumberOfParts() {
        return this.totalNumberOfParts;
    }

    @Generated
    public UploadErrorDetails getUploadErrorDetails() {
        return this.uploadErrorDetails;
    }

    @Generated
    public int hashCode() {
        Long totalNumberOfParts = getTotalNumberOfParts();
        int hashCode = totalNumberOfParts == null ? 43 : totalNumberOfParts.hashCode();
        Long partSize = getPartSize();
        int hashCode2 = ((hashCode + 59) * 59) + (partSize == null ? 43 : partSize.hashCode());
        String status = getStatus();
        int hashCode3 = (hashCode2 * 59) + (status == null ? 43 : status.hashCode());
        String multipartUploadStartTime = getMultipartUploadStartTime();
        int hashCode4 = (hashCode3 * 59) + (multipartUploadStartTime == null ? 43 : multipartUploadStartTime.hashCode());
        String multipartUploadExpirationTime = getMultipartUploadExpirationTime();
        int hashCode5 = (hashCode4 * 59) + (multipartUploadExpirationTime == null ? 43 : multipartUploadExpirationTime.hashCode());
        String completeMultipartUploadStartTime = getCompleteMultipartUploadStartTime();
        int hashCode6 = (hashCode5 * 59) + (completeMultipartUploadStartTime == null ? 43 : completeMultipartUploadStartTime.hashCode());
        String completeMultipartUploadExpirationTime = getCompleteMultipartUploadExpirationTime();
        int hashCode7 = (hashCode6 * 59) + (completeMultipartUploadExpirationTime == null ? 43 : completeMultipartUploadExpirationTime.hashCode());
        List<Long> missingParts = getMissingParts();
        int i = hashCode7 * 59;
        int hashCode8 = missingParts == null ? 43 : missingParts.hashCode();
        UploadErrorDetails uploadErrorDetails = getUploadErrorDetails();
        return ((i + hashCode8) * 59) + (uploadErrorDetails != null ? uploadErrorDetails.hashCode() : 43);
    }

    @Generated
    public void setCompleteMultipartUploadExpirationTime(String str) {
        this.completeMultipartUploadExpirationTime = str;
    }

    @Generated
    public void setCompleteMultipartUploadStartTime(String str) {
        this.completeMultipartUploadStartTime = str;
    }

    @Generated
    public void setMissingParts(List<Long> list) {
        this.missingParts = list;
    }

    @Generated
    public void setMultipartUploadExpirationTime(String str) {
        this.multipartUploadExpirationTime = str;
    }

    @Generated
    public void setMultipartUploadStartTime(String str) {
        this.multipartUploadStartTime = str;
    }

    @Generated
    public void setPartSize(Long l) {
        this.partSize = l;
    }

    @Generated
    public void setStatus(String str) {
        this.status = str;
    }

    @Generated
    public void setTotalNumberOfParts(Long l) {
        this.totalNumberOfParts = l;
    }

    @Generated
    public void setUploadErrorDetails(UploadErrorDetails uploadErrorDetails) {
        this.uploadErrorDetails = uploadErrorDetails;
    }

    @Generated
    public String toString() {
        return "RetrieveMultipartResponse(status=" + getStatus() + ", totalNumberOfParts=" + getTotalNumberOfParts() + ", partSize=" + getPartSize() + ", multipartUploadStartTime=" + getMultipartUploadStartTime() + ", multipartUploadExpirationTime=" + getMultipartUploadExpirationTime() + ", completeMultipartUploadStartTime=" + getCompleteMultipartUploadStartTime() + ", completeMultipartUploadExpirationTime=" + getCompleteMultipartUploadExpirationTime() + ", missingParts=" + getMissingParts() + ", uploadErrorDetails=" + getUploadErrorDetails() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
