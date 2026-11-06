package com.amazon.alexa.biloba.generated.models;

import com.amazon.alexa.ra.core.data.fragments.Reference;
import com.google.gson.annotations.SerializedName;
import defpackage.a$$ExternalSyntheticOutline0;
import java.util.Objects;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes17.dex */
public class Message {

    @SerializedName(Reference.ICON_URL)
    private String iconUrl = null;

    @SerializedName("iconAltText")
    private String iconAltText = null;

    @SerializedName("localizedPrimaryMessage")
    private String localizedPrimaryMessage = null;

    @SerializedName("linkUrl")
    private String linkUrl = null;

    @SerializedName("linkUrlText")
    private String linkUrlText = null;

    private String toIndentedString(Object obj) {
        return obj == null ? "null" : obj.toString().replace("\n", "\n    ");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Message message = (Message) obj;
            if (Objects.equals(this.iconUrl, message.iconUrl) && Objects.equals(this.iconAltText, message.iconAltText) && Objects.equals(this.localizedPrimaryMessage, message.localizedPrimaryMessage) && Objects.equals(this.linkUrl, message.linkUrl) && Objects.equals(this.linkUrlText, message.linkUrlText)) {
                return true;
            }
        }
        return false;
    }

    public String getIconAltText() {
        return this.iconAltText;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getLinkUrl() {
        return this.linkUrl;
    }

    public String getLinkUrlText() {
        return this.linkUrlText;
    }

    public String getLocalizedPrimaryMessage() {
        return this.localizedPrimaryMessage;
    }

    public int hashCode() {
        return Objects.hash(this.iconUrl, this.iconAltText, this.localizedPrimaryMessage, this.linkUrl, this.linkUrlText);
    }

    public Message iconAltText(String str) {
        this.iconAltText = str;
        return this;
    }

    public Message iconUrl(String str) {
        this.iconUrl = str;
        return this;
    }

    public Message linkUrl(String str) {
        this.linkUrl = str;
        return this;
    }

    public Message linkUrlText(String str) {
        this.linkUrlText = str;
        return this;
    }

    public Message localizedPrimaryMessage(String str) {
        this.localizedPrimaryMessage = str;
        return this;
    }

    public void setIconAltText(String str) {
        this.iconAltText = str;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setLinkUrl(String str) {
        this.linkUrl = str;
    }

    public void setLinkUrlText(String str) {
        this.linkUrlText = str;
    }

    public void setLocalizedPrimaryMessage(String str) {
        this.localizedPrimaryMessage = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("class Message {\n    iconUrl: ");
        sb.append(toIndentedString(this.iconUrl));
        sb.append("\n    iconAltText: ");
        sb.append(toIndentedString(this.iconAltText));
        sb.append("\n    localizedPrimaryMessage: ");
        sb.append(toIndentedString(this.localizedPrimaryMessage));
        sb.append("\n    linkUrl: ");
        sb.append(toIndentedString(this.linkUrl));
        sb.append("\n    linkUrlText: ");
        return a$$ExternalSyntheticOutline0.m(sb, toIndentedString(this.linkUrlText), "\n}");
    }
}
