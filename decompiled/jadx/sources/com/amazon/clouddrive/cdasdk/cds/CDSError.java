package com.amazon.clouddrive.cdasdk.cds;

import com.amazon.alexa.mobilytics.event.LogLevel;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class CDSError {

    @SerializedName("code")
    @Expose
    private String code;

    @SerializedName(LogLevel.INFO)
    @Expose
    private CDSErrorInfo info;

    @SerializedName("message")
    @Expose
    private String message;

    @Generated
    public CDSError() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof CDSError;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CDSError)) {
            return false;
        }
        CDSError cDSError = (CDSError) obj;
        if (!cDSError.canEqual(this)) {
            return false;
        }
        String code = getCode();
        String code2 = cDSError.getCode();
        if (code != null ? !code.equals(code2) : code2 != null) {
            return false;
        }
        String message = getMessage();
        String message2 = cDSError.getMessage();
        if (message != null ? !message.equals(message2) : message2 != null) {
            return false;
        }
        CDSErrorInfo info = getInfo();
        CDSErrorInfo info2 = cDSError.getInfo();
        return info != null ? info.equals(info2) : info2 == null;
    }

    @Generated
    public String getCode() {
        return this.code;
    }

    @Generated
    public CDSErrorInfo getInfo() {
        return this.info;
    }

    @Generated
    public String getMessage() {
        return this.message;
    }

    @Generated
    public int hashCode() {
        String code = getCode();
        int hashCode = code == null ? 43 : code.hashCode();
        String message = getMessage();
        int i = (hashCode + 59) * 59;
        int hashCode2 = message == null ? 43 : message.hashCode();
        CDSErrorInfo info = getInfo();
        return ((i + hashCode2) * 59) + (info != null ? info.hashCode() : 43);
    }

    @Generated
    public void setCode(String str) {
        this.code = str;
    }

    @Generated
    public void setInfo(CDSErrorInfo cDSErrorInfo) {
        this.info = cDSErrorInfo;
    }

    @Generated
    public void setMessage(String str) {
        this.message = str;
    }

    @Generated
    public String toString() {
        return "CDSError(code=" + getCode() + ", message=" + getMessage() + ", info=" + getInfo() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
