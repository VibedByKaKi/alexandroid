package com.amazon.clouddrive.cdasdk.cds.common;

import com.amazon.alexa.client.alexaservice.base.componentstate.ExternalComponentStateContract;
import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class ClientProperties {

    @SerializedName("dateCreated")
    @Expose
    private ISO8601 dateCreated;

    @SerializedName(ExternalComponentStateContract.ExternalComponentStateEntry.COLUMN_NAME_DATE_UPDATED)
    @Expose
    private ISO8601 dateUpdated;

    @Generated
    public ClientProperties() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof ClientProperties;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientProperties)) {
            return false;
        }
        ClientProperties clientProperties = (ClientProperties) obj;
        if (!clientProperties.canEqual(this)) {
            return false;
        }
        ISO8601 dateCreated = getDateCreated();
        ISO8601 dateCreated2 = clientProperties.getDateCreated();
        if (dateCreated != null ? !dateCreated.equals(dateCreated2) : dateCreated2 != null) {
            return false;
        }
        ISO8601 dateUpdated = getDateUpdated();
        ISO8601 dateUpdated2 = clientProperties.getDateUpdated();
        return dateUpdated != null ? dateUpdated.equals(dateUpdated2) : dateUpdated2 == null;
    }

    @Generated
    public ISO8601 getDateCreated() {
        return this.dateCreated;
    }

    @Generated
    public ISO8601 getDateUpdated() {
        return this.dateUpdated;
    }

    @Generated
    public int hashCode() {
        ISO8601 dateCreated = getDateCreated();
        int hashCode = dateCreated == null ? 43 : dateCreated.hashCode();
        ISO8601 dateUpdated = getDateUpdated();
        return ((hashCode + 59) * 59) + (dateUpdated != null ? dateUpdated.hashCode() : 43);
    }

    @Generated
    public void setDateCreated(ISO8601 iso8601) {
        this.dateCreated = iso8601;
    }

    @Generated
    public void setDateUpdated(ISO8601 iso8601) {
        this.dateUpdated = iso8601;
    }

    @Generated
    public String toString() {
        return "ClientProperties(dateCreated=" + getDateCreated() + ", dateUpdated=" + getDateUpdated() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
