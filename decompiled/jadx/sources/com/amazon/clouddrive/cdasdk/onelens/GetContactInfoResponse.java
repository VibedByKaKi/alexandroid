package com.amazon.clouddrive.cdasdk.onelens;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.amazon.clouddrive.cdasdk.onelens.common.OneLensResponse;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class GetContactInfoResponse extends OneLensResponse {

    @SerializedName("email")
    @Expose
    private String email;

    @SerializedName("name")
    @Expose
    private String name;

    @SerializedName("smsServiceAvailable")
    @Expose
    private Boolean smsServiceAvailable;

    @SerializedName("textPhoneNumber")
    @Expose
    private String textPhoneNumber;

    @Generated
    public GetContactInfoResponse() {
    }

    @Override // com.amazon.clouddrive.cdasdk.onelens.common.OneLensResponse
    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof GetContactInfoResponse;
    }

    @Override // com.amazon.clouddrive.cdasdk.onelens.common.OneLensResponse
    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetContactInfoResponse)) {
            return false;
        }
        GetContactInfoResponse getContactInfoResponse = (GetContactInfoResponse) obj;
        if (!getContactInfoResponse.canEqual(this) || !super.equals(obj)) {
            return false;
        }
        Boolean smsServiceAvailable = getSmsServiceAvailable();
        Boolean smsServiceAvailable2 = getContactInfoResponse.getSmsServiceAvailable();
        if (smsServiceAvailable != null ? !smsServiceAvailable.equals(smsServiceAvailable2) : smsServiceAvailable2 != null) {
            return false;
        }
        String email = getEmail();
        String email2 = getContactInfoResponse.getEmail();
        if (email != null ? !email.equals(email2) : email2 != null) {
            return false;
        }
        String name = getName();
        String name2 = getContactInfoResponse.getName();
        if (name != null ? !name.equals(name2) : name2 != null) {
            return false;
        }
        String textPhoneNumber = getTextPhoneNumber();
        String textPhoneNumber2 = getContactInfoResponse.getTextPhoneNumber();
        return textPhoneNumber != null ? textPhoneNumber.equals(textPhoneNumber2) : textPhoneNumber2 == null;
    }

    @Generated
    public String getEmail() {
        return this.email;
    }

    @Generated
    public String getName() {
        return this.name;
    }

    @Generated
    public Boolean getSmsServiceAvailable() {
        return this.smsServiceAvailable;
    }

    @Generated
    public String getTextPhoneNumber() {
        return this.textPhoneNumber;
    }

    @Override // com.amazon.clouddrive.cdasdk.onelens.common.OneLensResponse
    @Generated
    public int hashCode() {
        int hashCode = super.hashCode();
        Boolean smsServiceAvailable = getSmsServiceAvailable();
        int hashCode2 = (hashCode * 59) + (smsServiceAvailable == null ? 43 : smsServiceAvailable.hashCode());
        String email = getEmail();
        int hashCode3 = (hashCode2 * 59) + (email == null ? 43 : email.hashCode());
        String name = getName();
        int i = hashCode3 * 59;
        int hashCode4 = name == null ? 43 : name.hashCode();
        String textPhoneNumber = getTextPhoneNumber();
        return ((i + hashCode4) * 59) + (textPhoneNumber != null ? textPhoneNumber.hashCode() : 43);
    }

    @Generated
    public void setEmail(String str) {
        this.email = str;
    }

    @Generated
    public void setName(String str) {
        this.name = str;
    }

    @Generated
    public void setSmsServiceAvailable(Boolean bool) {
        this.smsServiceAvailable = bool;
    }

    @Generated
    public void setTextPhoneNumber(String str) {
        this.textPhoneNumber = str;
    }

    @Override // com.amazon.clouddrive.cdasdk.onelens.common.OneLensResponse
    @Generated
    public String toString() {
        return "GetContactInfoResponse(email=" + getEmail() + ", name=" + getName() + ", smsServiceAvailable=" + getSmsServiceAvailable() + ", textPhoneNumber=" + getTextPhoneNumber() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
