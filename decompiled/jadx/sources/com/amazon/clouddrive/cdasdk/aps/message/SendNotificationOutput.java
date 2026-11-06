package com.amazon.clouddrive.cdasdk.aps.message;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.aps.common.APSOutput;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SendNotificationOutput extends APSOutput {

    @SerializedName("message")
    @Expose
    private String message;

    @SerializedName("status")
    @Expose
    private String status;

    @Generated
    public SendNotificationOutput() {
    }

    @Override // com.amazon.clouddrive.cdasdk.aps.common.APSOutput
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof SendNotificationOutput;
    }

    @Override // com.amazon.clouddrive.cdasdk.aps.common.APSOutput
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendNotificationOutput)) {
            return false;
        }
        SendNotificationOutput sendNotificationOutput = (SendNotificationOutput) obj;
        if (!sendNotificationOutput.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String status = getStatus();
        String status2 = sendNotificationOutput.getStatus();
        if (status != null ? !status.equals(status2) : status2 != null) {
            return false;
        }
        String message = getMessage();
        String message2 = sendNotificationOutput.getMessage();
        return message != null ? message.equals(message2) : message2 == null;
    }

    @Generated
    public String getMessage() {
        return this.message;
    }

    @Generated
    public String getStatus() {
        return this.status;
    }

    @Override // com.amazon.clouddrive.cdasdk.aps.common.APSOutput
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String status = getStatus();
        int i = hashCode * 59;
        int hashCode2 = status == null ? 43 : status.hashCode();
        String message = getMessage();
        return ((i + hashCode2) * 59) + (message != null ? message.hashCode() : 43);
    }

    @Generated
    public void setMessage(String str) {
        this.message = str;
    }

    @Generated
    public void setStatus(String str) {
        this.status = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.aps.common.APSOutput
    @Generated
    public String toString() {
        return "SendNotificationOutput(status=" + getStatus() + ", message=" + getMessage() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
