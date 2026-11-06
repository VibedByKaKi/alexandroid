package com.amazon.clouddrive.cdasdk.prompto.common;

import com.amazon.alexa.ra.core.ui.markdown.parser.formatter.MarkdownConstants;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import lombok.Generated;

/* compiled from: r8-map-id-b9432e0f623b4a4bff4ba50a8a24c4aafad2c1e11092747b9fb5e6a22af5a940 */
/* loaded from: classes20.dex */
public class Names {

    @SerializedName("firstName")
    @Expose
    private String firstName;

    @SerializedName("fullName")
    @Expose
    private String fullName;

    @Generated
    public Names() {
    }

    @Generated
    public boolean canEqual(Object obj) {
        return obj instanceof Names;
    }

    @Generated
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Names)) {
            return false;
        }
        Names names = (Names) obj;
        if (!names.canEqual(this)) {
            return false;
        }
        String firstName = getFirstName();
        String firstName2 = names.getFirstName();
        if (firstName != null ? !firstName.equals(firstName2) : firstName2 != null) {
            return false;
        }
        String fullName = getFullName();
        String fullName2 = names.getFullName();
        return fullName != null ? fullName.equals(fullName2) : fullName2 == null;
    }

    @Generated
    public String getFirstName() {
        return this.firstName;
    }

    @Generated
    public String getFullName() {
        return this.fullName;
    }

    @Generated
    public int hashCode() {
        String firstName = getFirstName();
        int hashCode = firstName == null ? 43 : firstName.hashCode();
        String fullName = getFullName();
        return ((hashCode + 59) * 59) + (fullName != null ? fullName.hashCode() : 43);
    }

    @Generated
    public void setFirstName(String str) {
        this.firstName = str;
    }

    @Generated
    public void setFullName(String str) {
        this.fullName = str;
    }

    @Generated
    public String toString() {
        return "Names(firstName=" + getFirstName() + ", fullName=" + getFullName() + MarkdownConstants.RIGHT_PARENTHESIS;
    }
}
