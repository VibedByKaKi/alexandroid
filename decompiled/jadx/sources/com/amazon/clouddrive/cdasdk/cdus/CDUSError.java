package com.amazon.clouddrive.cdasdk.cdus;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.identity.mobi.common.javascript.JavaScriptBridgeCommonV2;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CDUSError {

    @SerializedName("errorCode")
    @Expose
    private String errorCode;

    @SerializedName(JavaScriptBridgeCommonV2.ERROR_DETAILS)
    @Expose
    private CDUSErrorDetails errorDetails;

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("requestId")
    @Expose
    private String requestId;

    @SerializedName("timeStamp")
    @Expose
    private String timeStamp;

    @Generated
    public CDUSError() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CDUSError;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CDUSError)) {
            return false;
        }
        CDUSError cDUSError = (CDUSError) obj;
        if (!cDUSError.canEqual(this)) {
            return false;
        }
        String message = getMessage();
        String message2 = cDUSError.getMessage();
        if (message != null ? !message.equals(message2) : message2 != null) {
            return false;
        }
        String errorCode = getErrorCode();
        String errorCode2 = cDUSError.getErrorCode();
        if (errorCode != null ? !errorCode.equals(errorCode2) : errorCode2 != null) {
            return false;
        }
        String timeStamp = getTimeStamp();
        String timeStamp2 = cDUSError.getTimeStamp();
        if (timeStamp != null ? !timeStamp.equals(timeStamp2) : timeStamp2 != null) {
            return false;
        }
        String requestId = getRequestId();
        String requestId2 = cDUSError.getRequestId();
        if (requestId != null ? !requestId.equals(requestId2) : requestId2 != null) {
            return false;
        }
        CDUSErrorDetails errorDetails = getErrorDetails();
        CDUSErrorDetails errorDetails2 = cDUSError.getErrorDetails();
        return errorDetails != null ? errorDetails.equals(errorDetails2) : errorDetails2 == null;
    }

    @Generated
    public String getErrorCode() {
        return this.errorCode;
    }

    @Generated
    public CDUSErrorDetails getErrorDetails() {
        return this.errorDetails;
    }

    @Generated
    public String getMessage() {
        return this.message;
    }

    @Generated
    public String getRequestId() {
        return this.requestId;
    }

    @Generated
    public String getTimeStamp() {
        return this.timeStamp;
    }

    @Generated
    public int hashCode() {
        String message = getMessage();
        int hashCode = message == null ? 43 : message.hashCode();
        String errorCode = getErrorCode();
        int hashCode2 = ((hashCode + 59) * 59) + (errorCode == null ? 43 : errorCode.hashCode());
        String timeStamp = getTimeStamp();
        int hashCode3 = (hashCode2 * 59) + (timeStamp == null ? 43 : timeStamp.hashCode());
        String requestId = getRequestId();
        int i = hashCode3 * 59;
        int hashCode4 = requestId == null ? 43 : requestId.hashCode();
        CDUSErrorDetails errorDetails = getErrorDetails();
        return ((i + hashCode4) * 59) + (errorDetails != null ? errorDetails.hashCode() : 43);
    }

    @Generated
    public void setErrorCode(String str) {
        this.errorCode = str;
    }

    @Generated
    public void setErrorDetails(CDUSErrorDetails cDUSErrorDetails) {
        this.errorDetails = cDUSErrorDetails;
    }

    @Generated
    public void setMessage(String str) {
        this.message = str;
    }

    @Generated
    public void setRequestId(String str) {
        this.requestId = str;
    }

    @Generated
    public void setTimeStamp(String str) {
        this.timeStamp = str;
    }

    @Generated
    public String toString() {
        return "CDUSError(message=" + getMessage() + ", errorCode=" + getErrorCode() + ", timeStamp=" + getTimeStamp() + ", requestId=" + getRequestId() + ", errorDetails=" + getErrorDetails() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
