package com.amazon.clouddrive.cdasdk.aps.message;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.aps.common.APSInput;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class SendNotificationInput extends APSInput {

    @SerializedName("address")
    @Expose
    private String address;

    @SerializedName("notificationType")
    @Expose
    private NotificationType notificationType;

    @Generated
    public SendNotificationInput() {
    }

    @Override // com.amazon.clouddrive.cdasdk.aps.common.APSInput
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof SendNotificationInput;
    }

    @Override // com.amazon.clouddrive.cdasdk.aps.common.APSInput
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SendNotificationInput)) {
            return false;
        }
        SendNotificationInput sendNotificationInput = (SendNotificationInput) obj;
        if (!sendNotificationInput.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        String address = getAddress();
        String address2 = sendNotificationInput.getAddress();
        if (address != null ? !address.equals(address2) : address2 != null) {
            return false;
        }
        NotificationType notificationType = getNotificationType();
        NotificationType notificationType2 = sendNotificationInput.getNotificationType();
        return notificationType != null ? notificationType.equals(notificationType2) : notificationType2 == null;
    }

    @Generated
    public String getAddress() {
        return this.address;
    }

    @Generated
    public NotificationType getNotificationType() {
        return this.notificationType;
    }

    @Override // com.amazon.clouddrive.cdasdk.aps.common.APSInput
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        String address = getAddress();
        int i = hashCode * 59;
        int hashCode2 = address == null ? 43 : address.hashCode();
        NotificationType notificationType = getNotificationType();
        return ((i + hashCode2) * 59) + (notificationType != null ? notificationType.hashCode() : 43);
    }

    @Generated
    public void setAddress(String str) {
        this.address = str;
    }

    @Generated
    public void setNotificationType(NotificationType notificationType) {
        this.notificationType = notificationType;
    }

    @Override // com.amazon.clouddrive.cdasdk.aps.common.APSInput
    @Generated
    public String toString() {
        return "SendNotificationInput(address=" + getAddress() + ", notificationType=" + getNotificationType() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
